package retrofit2;

import e3.M;
import e3.T;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import retrofit2.Converter;
import retrofit2.http.Streaming;

/* loaded from: classes3.dex */
final class BuiltInConverters extends Converter.Factory {
    private boolean checkForKotlinUnit = true;

    /* loaded from: classes3.dex */
    public static final class BufferingResponseBodyConverter implements Converter<T, T> {
        static final BufferingResponseBodyConverter INSTANCE = new BufferingResponseBodyConverter();

        @Override // retrofit2.Converter
        public T convert(T t2) throws IOException {
            try {
                return Utils.buffer(t2);
            } finally {
                t2.close();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class RequestBodyConverter implements Converter<M, M> {
        static final RequestBodyConverter INSTANCE = new RequestBodyConverter();

        @Override // retrofit2.Converter
        public M convert(M m4) {
            return m4;
        }
    }

    /* loaded from: classes3.dex */
    public static final class StreamingResponseBodyConverter implements Converter<T, T> {
        static final StreamingResponseBodyConverter INSTANCE = new StreamingResponseBodyConverter();

        @Override // retrofit2.Converter
        public T convert(T t2) {
            return t2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class ToStringConverter implements Converter<Object, String> {
        static final ToStringConverter INSTANCE = new ToStringConverter();

        @Override // retrofit2.Converter
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class UnitResponseBodyConverter implements Converter<T, Unit> {
        static final UnitResponseBodyConverter INSTANCE = new UnitResponseBodyConverter();

        @Override // retrofit2.Converter
        public Unit convert(T t2) {
            t2.close();
            return Unit.INSTANCE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class VoidResponseBodyConverter implements Converter<T, Void> {
        static final VoidResponseBodyConverter INSTANCE = new VoidResponseBodyConverter();

        @Override // retrofit2.Converter
        public Void convert(T t2) {
            t2.close();
            return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, M> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (M.class.isAssignableFrom(Utils.getRawType(type))) {
            return RequestBodyConverter.INSTANCE;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<T, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == T.class) {
            return Utils.isAnnotationPresent(annotationArr, Streaming.class) ? StreamingResponseBodyConverter.INSTANCE : BufferingResponseBodyConverter.INSTANCE;
        }
        if (type == Void.class) {
            return VoidResponseBodyConverter.INSTANCE;
        }
        if (!this.checkForKotlinUnit || type != Unit.class) {
            return null;
        }
        try {
            return UnitResponseBodyConverter.INSTANCE;
        } catch (NoClassDefFoundError unused) {
            this.checkForKotlinUnit = false;
            return null;
        }
    }
}
