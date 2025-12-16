package retrofit2;

import e3.M;
import e3.T;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface Converter<F, T> {

    /* loaded from: classes3.dex */
    public static abstract class Factory {
        public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
            return Utils.getParameterUpperBound(i, parameterizedType);
        }

        public static Class<?> getRawType(Type type) {
            return Utils.getRawType(type);
        }

        public Converter<?, M> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
            return null;
        }

        public Converter<T, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }

        public Converter<?, String> stringConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }
    }

    T convert(F f2) throws IOException;
}
