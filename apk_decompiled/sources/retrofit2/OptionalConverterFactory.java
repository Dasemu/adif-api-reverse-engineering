package retrofit2;

import e3.T;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.Converter;

/* JADX INFO: Access modifiers changed from: package-private */
@IgnoreJRERequirement
/* loaded from: classes3.dex */
public final class OptionalConverterFactory extends Converter.Factory {
    static final Converter.Factory INSTANCE = new OptionalConverterFactory();

    @IgnoreJRERequirement
    /* loaded from: classes3.dex */
    public static final class OptionalConverter<T> implements Converter<T, Optional<T>> {
        final Converter<T, T> delegate;

        public OptionalConverter(Converter<T, T> converter) {
            this.delegate = converter;
        }

        @Override // retrofit2.Converter
        public Optional<T> convert(T t2) throws IOException {
            return Optional.ofNullable(this.delegate.convert(t2));
        }
    }

    @Override // retrofit2.Converter.Factory
    public Converter<T, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Converter.Factory.getRawType(type) != Optional.class) {
            return null;
        }
        return new OptionalConverter(retrofit.responseBodyConverter(Converter.Factory.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
