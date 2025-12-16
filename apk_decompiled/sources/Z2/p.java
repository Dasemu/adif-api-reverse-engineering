package Z2;

import a.AbstractC0106b;
import java.io.IOException;
import r3.C0579k;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f2269a;

    /* renamed from: b, reason: collision with root package name */
    public final r3.x f2270b;

    public p(String[] strArr, r3.x xVar) {
        this.f2269a = strArr;
        this.f2270b = xVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [r3.i, java.lang.Object, r3.h] */
    public static p a(String... strArr) {
        try {
            C0579k[] c0579kArr = new C0579k[strArr.length];
            ?? obj = new Object();
            for (int i = 0; i < strArr.length; i++) {
                t.n0(obj, strArr[i]);
                obj.readByte();
                c0579kArr[i] = obj.h(obj.f8284b);
            }
            String[] strArr2 = (String[]) strArr.clone();
            int i4 = r3.x.f8316c;
            return new p(strArr2, AbstractC0106b.w(c0579kArr));
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }
}
