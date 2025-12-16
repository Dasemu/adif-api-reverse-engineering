package retrofit2;

import e3.InterfaceC0318d;
import e3.O;
import e3.T;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import retrofit2.Utils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class HttpServiceMethod<ResponseT, ReturnT> extends ServiceMethod<ReturnT> {
    private final InterfaceC0318d callFactory;
    private final RequestFactory requestFactory;
    private final Converter<T, ResponseT> responseConverter;

    /* loaded from: classes3.dex */
    public static final class CallAdapted<ResponseT, ReturnT> extends HttpServiceMethod<ResponseT, ReturnT> {
        private final CallAdapter<ResponseT, ReturnT> callAdapter;

        public CallAdapted(RequestFactory requestFactory, InterfaceC0318d interfaceC0318d, Converter<T, ResponseT> converter, CallAdapter<ResponseT, ReturnT> callAdapter) {
            super(requestFactory, interfaceC0318d, converter);
            this.callAdapter = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        public ReturnT adapt(Call<ResponseT> call, Object[] objArr) {
            return this.callAdapter.adapt(call);
        }
    }

    /* loaded from: classes3.dex */
    public static final class SuspendForBody<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;
        private final boolean isNullable;

        public SuspendForBody(RequestFactory requestFactory, InterfaceC0318d interfaceC0318d, Converter<T, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter, boolean z3) {
            super(requestFactory, interfaceC0318d, converter);
            this.callAdapter = callAdapter;
            this.isNullable = z3;
        }

        @Override // retrofit2.HttpServiceMethod
        public Object adapt(Call<ResponseT> call, Object[] objArr) {
            Call<ResponseT> adapt = this.callAdapter.adapt(call);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return this.isNullable ? KotlinExtensions.awaitNullable(adapt, continuation) : KotlinExtensions.await(adapt, continuation);
            } catch (Exception e4) {
                return KotlinExtensions.suspendAndThrow(e4, continuation);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class SuspendForResponse<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;

        public SuspendForResponse(RequestFactory requestFactory, InterfaceC0318d interfaceC0318d, Converter<T, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter) {
            super(requestFactory, interfaceC0318d, converter);
            this.callAdapter = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        public Object adapt(Call<ResponseT> call, Object[] objArr) {
            Call<ResponseT> adapt = this.callAdapter.adapt(call);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.awaitResponse(adapt, continuation);
            } catch (Exception e4) {
                return KotlinExtensions.suspendAndThrow(e4, continuation);
            }
        }
    }

    public HttpServiceMethod(RequestFactory requestFactory, InterfaceC0318d interfaceC0318d, Converter<T, ResponseT> converter) {
        this.requestFactory = requestFactory;
        this.callFactory = interfaceC0318d;
        this.responseConverter = converter;
    }

    private static <ResponseT, ReturnT> CallAdapter<ResponseT, ReturnT> createCallAdapter(Retrofit retrofit, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (CallAdapter<ResponseT, ReturnT>) retrofit.callAdapter(type, annotationArr);
        } catch (RuntimeException e4) {
            throw Utils.methodError(method, e4, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> Converter<T, ResponseT> createResponseConverter(Retrofit retrofit, Method method, Type type) {
        try {
            return retrofit.responseBodyConverter(type, method.getAnnotations());
        } catch (RuntimeException e4) {
            throw Utils.methodError(method, e4, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> HttpServiceMethod<ResponseT, ReturnT> parseAnnotations(Retrofit retrofit, Method method, RequestFactory requestFactory) {
        Type genericReturnType;
        boolean z3;
        boolean z4 = requestFactory.isKotlinSuspendFunction;
        Annotation[] annotations = method.getAnnotations();
        if (z4) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type parameterLowerBound = Utils.getParameterLowerBound(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (Utils.getRawType(parameterLowerBound) == Response.class && (parameterLowerBound instanceof ParameterizedType)) {
                parameterLowerBound = Utils.getParameterUpperBound(0, (ParameterizedType) parameterLowerBound);
                z3 = true;
            } else {
                z3 = false;
            }
            genericReturnType = new Utils.ParameterizedTypeImpl(null, Call.class, parameterLowerBound);
            annotations = SkipCallbackExecutorImpl.ensurePresent(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z3 = false;
        }
        CallAdapter createCallAdapter = createCallAdapter(retrofit, method, genericReturnType, annotations);
        Type responseType = createCallAdapter.responseType();
        if (responseType == O.class) {
            throw Utils.methodError(method, "'" + Utils.getRawType(responseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (responseType == Response.class) {
            throw Utils.methodError(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (requestFactory.httpMethod.equals("HEAD") && !Void.class.equals(responseType)) {
            throw Utils.methodError(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        Converter createResponseConverter = createResponseConverter(retrofit, method, responseType);
        InterfaceC0318d interfaceC0318d = retrofit.callFactory;
        return !z4 ? new CallAdapted(requestFactory, interfaceC0318d, createResponseConverter, createCallAdapter) : z3 ? new SuspendForResponse(requestFactory, interfaceC0318d, createResponseConverter, createCallAdapter) : new SuspendForBody(requestFactory, interfaceC0318d, createResponseConverter, createCallAdapter, false);
    }

    public abstract ReturnT adapt(Call<ResponseT> call, Object[] objArr);

    @Override // retrofit2.ServiceMethod
    public final ReturnT invoke(Object[] objArr) {
        return adapt(new OkHttpCall(this.requestFactory, objArr, this.callFactory, this.responseConverter), objArr);
    }
}
