package retrofit2;

import e3.C0335v;
import e3.F;
import e3.InterfaceC0318d;
import e3.M;
import e3.T;
import e3.w;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.BuiltInConverters;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* loaded from: classes3.dex */
public final class Retrofit {
    final w baseUrl;
    final List<CallAdapter.Factory> callAdapterFactories;
    final InterfaceC0318d callFactory;
    final Executor callbackExecutor;
    final List<Converter.Factory> converterFactories;
    private final Map<Method, ServiceMethod<?>> serviceMethodCache = new ConcurrentHashMap();
    final boolean validateEagerly;

    public Retrofit(InterfaceC0318d interfaceC0318d, w wVar, List<Converter.Factory> list, List<CallAdapter.Factory> list2, Executor executor, boolean z3) {
        this.callFactory = interfaceC0318d;
        this.baseUrl = wVar;
        this.converterFactories = list;
        this.callAdapterFactories = list2;
        this.callbackExecutor = executor;
        this.validateEagerly = z3;
    }

    private void validateServiceInterface(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.validateEagerly) {
            Platform platform = Platform.get();
            for (Method method : cls.getDeclaredMethods()) {
                if (!platform.isDefaultMethod(method) && !Modifier.isStatic(method.getModifiers())) {
                    loadServiceMethod(method);
                }
            }
        }
    }

    public w baseUrl() {
        return this.baseUrl;
    }

    public CallAdapter<?, ?> callAdapter(Type type, Annotation[] annotationArr) {
        return nextCallAdapter(null, type, annotationArr);
    }

    public List<CallAdapter.Factory> callAdapterFactories() {
        return this.callAdapterFactories;
    }

    public InterfaceC0318d callFactory() {
        return this.callFactory;
    }

    public Executor callbackExecutor() {
        return this.callbackExecutor;
    }

    public List<Converter.Factory> converterFactories() {
        return this.converterFactories;
    }

    public <T> T create(final Class<T> cls) {
        validateServiceInterface(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: retrofit2.Retrofit.1
            private final Platform platform = Platform.get();
            private final Object[] emptyArgs = new Object[0];

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = this.emptyArgs;
                }
                return this.platform.isDefaultMethod(method) ? this.platform.invokeDefaultMethod(method, cls, obj, objArr) : Retrofit.this.loadServiceMethod(method).invoke(objArr);
            }
        });
    }

    public ServiceMethod<?> loadServiceMethod(Method method) {
        ServiceMethod<?> serviceMethod;
        ServiceMethod<?> serviceMethod2 = this.serviceMethodCache.get(method);
        if (serviceMethod2 != null) {
            return serviceMethod2;
        }
        synchronized (this.serviceMethodCache) {
            try {
                serviceMethod = this.serviceMethodCache.get(method);
                if (serviceMethod == null) {
                    serviceMethod = ServiceMethod.parseAnnotations(this, method);
                    this.serviceMethodCache.put(method, serviceMethod);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return serviceMethod;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public CallAdapter<?, ?> nextCallAdapter(CallAdapter.Factory factory, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.callAdapterFactories.indexOf(factory) + 1;
        int size = this.callAdapterFactories.size();
        for (int i = indexOf; i < size; i++) {
            CallAdapter<?, ?> callAdapter = this.callAdapterFactories.get(i).get(type, annotationArr, this);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i4 = 0; i4 < indexOf; i4++) {
                sb.append("\n   * ");
                sb.append(this.callAdapterFactories.get(i4).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.callAdapterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.callAdapterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> Converter<T, M> nextRequestBodyConverter(Converter.Factory factory, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i = indexOf; i < size; i++) {
            Converter<T, M> converter = (Converter<T, M>) this.converterFactories.get(i).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i4 = 0; i4 < indexOf; i4++) {
                sb.append("\n   * ");
                sb.append(this.converterFactories.get(i4).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.converterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> Converter<T, T> nextResponseBodyConverter(Converter.Factory factory, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i = indexOf; i < size; i++) {
            Converter<T, T> converter = (Converter<T, T>) this.converterFactories.get(i).responseBodyConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i4 = 0; i4 < indexOf; i4++) {
                sb.append("\n   * ");
                sb.append(this.converterFactories.get(i4).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.converterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> Converter<T, M> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public <T> Converter<T, T> responseBodyConverter(Type type, Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public <T> Converter<T, String> stringConverter(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.converterFactories.size();
        for (int i = 0; i < size; i++) {
            Converter<T, String> converter = (Converter<T, String>) this.converterFactories.get(i).stringConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        return BuiltInConverters.ToStringConverter.INSTANCE;
    }

    /* loaded from: classes3.dex */
    public static final class Builder {
        private w baseUrl;
        private final List<CallAdapter.Factory> callAdapterFactories;
        private InterfaceC0318d callFactory;
        private Executor callbackExecutor;
        private final List<Converter.Factory> converterFactories;
        private final Platform platform;
        private boolean validateEagerly;

        public Builder(Platform platform) {
            this.converterFactories = new ArrayList();
            this.callAdapterFactories = new ArrayList();
            this.platform = platform;
        }

        public Builder addCallAdapterFactory(CallAdapter.Factory factory) {
            List<CallAdapter.Factory> list = this.callAdapterFactories;
            Objects.requireNonNull(factory, "factory == null");
            list.add(factory);
            return this;
        }

        public Builder addConverterFactory(Converter.Factory factory) {
            List<Converter.Factory> list = this.converterFactories;
            Objects.requireNonNull(factory, "factory == null");
            list.add(factory);
            return this;
        }

        public Builder baseUrl(URL url) {
            Objects.requireNonNull(url, "baseUrl == null");
            String url2 = url.toString();
            Intrinsics.checkNotNullParameter(url2, "<this>");
            C0335v c0335v = new C0335v();
            c0335v.d(null, url2);
            return baseUrl(c0335v.a());
        }

        public Retrofit build() {
            if (this.baseUrl == null) {
                throw new IllegalStateException("Base URL required.");
            }
            InterfaceC0318d interfaceC0318d = this.callFactory;
            if (interfaceC0318d == null) {
                interfaceC0318d = new F();
            }
            InterfaceC0318d interfaceC0318d2 = interfaceC0318d;
            Executor executor = this.callbackExecutor;
            if (executor == null) {
                executor = this.platform.defaultCallbackExecutor();
            }
            Executor executor2 = executor;
            ArrayList arrayList = new ArrayList(this.callAdapterFactories);
            arrayList.addAll(this.platform.defaultCallAdapterFactories(executor2));
            ArrayList arrayList2 = new ArrayList(this.converterFactories.size() + 1 + this.platform.defaultConverterFactoriesSize());
            arrayList2.add(new BuiltInConverters());
            arrayList2.addAll(this.converterFactories);
            arrayList2.addAll(this.platform.defaultConverterFactories());
            return new Retrofit(interfaceC0318d2, this.baseUrl, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.validateEagerly);
        }

        public List<CallAdapter.Factory> callAdapterFactories() {
            return this.callAdapterFactories;
        }

        public Builder callFactory(InterfaceC0318d interfaceC0318d) {
            Objects.requireNonNull(interfaceC0318d, "factory == null");
            this.callFactory = interfaceC0318d;
            return this;
        }

        public Builder callbackExecutor(Executor executor) {
            Objects.requireNonNull(executor, "executor == null");
            this.callbackExecutor = executor;
            return this;
        }

        public Builder client(F f2) {
            Objects.requireNonNull(f2, "client == null");
            return callFactory(f2);
        }

        public List<Converter.Factory> converterFactories() {
            return this.converterFactories;
        }

        public Builder validateEagerly(boolean z3) {
            this.validateEagerly = z3;
            return this;
        }

        public Builder() {
            this(Platform.get());
        }

        public Builder(Retrofit retrofit) {
            this.converterFactories = new ArrayList();
            this.callAdapterFactories = new ArrayList();
            Platform platform = Platform.get();
            this.platform = platform;
            this.callFactory = retrofit.callFactory;
            this.baseUrl = retrofit.baseUrl;
            int size = retrofit.converterFactories.size() - platform.defaultConverterFactoriesSize();
            for (int i = 1; i < size; i++) {
                this.converterFactories.add(retrofit.converterFactories.get(i));
            }
            int size2 = retrofit.callAdapterFactories.size() - this.platform.defaultCallAdapterFactoriesSize();
            for (int i4 = 0; i4 < size2; i4++) {
                this.callAdapterFactories.add(retrofit.callAdapterFactories.get(i4));
            }
            this.callbackExecutor = retrofit.callbackExecutor;
            this.validateEagerly = retrofit.validateEagerly;
        }

        public Builder baseUrl(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            Intrinsics.checkNotNullParameter(str, "<this>");
            C0335v c0335v = new C0335v();
            c0335v.d(null, str);
            return baseUrl(c0335v.a());
        }

        public Builder baseUrl(w wVar) {
            Objects.requireNonNull(wVar, "baseUrl == null");
            if ("".equals(wVar.f6418f.get(r0.size() - 1))) {
                this.baseUrl = wVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + wVar);
        }
    }
}
