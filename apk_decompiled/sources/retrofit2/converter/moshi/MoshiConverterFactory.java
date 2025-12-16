package retrofit2.converter.moshi;

import Z2.AbstractC0104l;
import Z2.D;
import Z2.G;
import Z2.o;
import e3.M;
import e3.T;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes3.dex */
public final class MoshiConverterFactory extends Converter.Factory {
    private final boolean failOnUnknown;
    private final boolean lenient;
    private final G moshi;
    private final boolean serializeNulls;

    private MoshiConverterFactory(G g4, boolean z3, boolean z4, boolean z5) {
        this.moshi = g4;
        this.lenient = z3;
        this.failOnUnknown = z4;
        this.serializeNulls = z5;
    }

    public static MoshiConverterFactory create() {
        return create(new G(new D()));
    }

    private static Set<? extends Annotation> jsonAnnotations(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(o.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    public MoshiConverterFactory asLenient() {
        return new MoshiConverterFactory(this.moshi, true, this.failOnUnknown, this.serializeNulls);
    }

    public MoshiConverterFactory failOnUnknown() {
        return new MoshiConverterFactory(this.moshi, this.lenient, true, this.serializeNulls);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, M> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        AbstractC0104l c4 = this.moshi.c(type, jsonAnnotations(annotationArr), null);
        if (this.lenient) {
            c4 = c4.lenient();
        }
        if (this.failOnUnknown) {
            c4 = c4.failOnUnknown();
        }
        if (this.serializeNulls) {
            c4 = c4.serializeNulls();
        }
        return new MoshiRequestBodyConverter(c4);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<T, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        AbstractC0104l c4 = this.moshi.c(type, jsonAnnotations(annotationArr), null);
        if (this.lenient) {
            c4 = c4.lenient();
        }
        if (this.failOnUnknown) {
            c4 = c4.failOnUnknown();
        }
        if (this.serializeNulls) {
            c4 = c4.serializeNulls();
        }
        return new MoshiResponseBodyConverter(c4);
    }

    public MoshiConverterFactory withNullSerialization() {
        return new MoshiConverterFactory(this.moshi, this.lenient, this.failOnUnknown, true);
    }

    public static MoshiConverterFactory create(G g4) {
        if (g4 != null) {
            return new MoshiConverterFactory(g4, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }
}
