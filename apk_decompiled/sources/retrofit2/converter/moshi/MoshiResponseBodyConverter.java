package retrofit2.converter.moshi;

import Z2.AbstractC0104l;
import Z2.q;
import Z2.s;
import e3.T;
import f0.C0338b;
import java.io.IOException;
import r3.C0579k;
import r3.InterfaceC0578j;
import retrofit2.Converter;

/* loaded from: classes3.dex */
final class MoshiResponseBodyConverter<T> implements Converter<T, T> {
    private static final C0579k UTF8_BOM;
    private final AbstractC0104l adapter;

    static {
        C0579k c0579k = C0579k.f8285d;
        UTF8_BOM = C0338b.m("EFBBBF");
    }

    public MoshiResponseBodyConverter(AbstractC0104l abstractC0104l) {
        this.adapter = abstractC0104l;
    }

    @Override // retrofit2.Converter
    public T convert(T t2) throws IOException {
        InterfaceC0578j source = t2.source();
        try {
            if (source.H(UTF8_BOM)) {
                source.l(r1.d());
            }
            s sVar = new s(source);
            T t4 = (T) this.adapter.fromJson(sVar);
            if (sVar.f0() == q.f2278j) {
                t2.close();
                return t4;
            }
            throw new RuntimeException("JSON document was not fully consumed.");
        } catch (Throwable th) {
            t2.close();
            throw th;
        }
    }
}
