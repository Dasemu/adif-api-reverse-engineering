package retrofit2.converter.moshi;

import Z2.AbstractC0104l;
import Z2.t;
import e3.A;
import e3.M;
import e3.z;
import java.io.IOException;
import java.util.regex.Pattern;
import retrofit2.Converter;

/* loaded from: classes3.dex */
final class MoshiRequestBodyConverter<T> implements Converter<T, M> {
    private static final A MEDIA_TYPE;
    private final AbstractC0104l adapter;

    static {
        Pattern pattern = A.f6197d;
        MEDIA_TYPE = z.a("application/json; charset=UTF-8");
    }

    public MoshiRequestBodyConverter(AbstractC0104l abstractC0104l) {
        this.adapter = abstractC0104l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ M convert(Object obj) throws IOException {
        return convert((MoshiRequestBodyConverter<T>) obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [r3.i, java.lang.Object, r3.h] */
    @Override // retrofit2.Converter
    public M convert(T t2) throws IOException {
        ?? obj = new Object();
        this.adapter.toJson(new t(obj), t2);
        return M.create(MEDIA_TYPE, obj.h(obj.f8284b));
    }
}
