package d0;

import O.I;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f6154d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f6155a;

    /* renamed from: b, reason: collision with root package name */
    public final A.j f6156b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f6157c = 0;

    public t(A.j jVar, int i) {
        this.f6156b = jVar;
        this.f6155a = i;
    }

    public final int a(int i) {
        e0.a b4 = b();
        int a2 = b4.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b4.f1221d;
        int i4 = a2 + b4.f1218a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i4) + i4 + 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, O.I] */
    public final e0.a b() {
        ThreadLocal threadLocal = f6154d;
        e0.a aVar = (e0.a) threadLocal.get();
        e0.a aVar2 = aVar;
        if (aVar == null) {
            ?? i = new I();
            threadLocal.set(i);
            aVar2 = i;
        }
        e0.b bVar = (e0.b) this.f6156b.f27a;
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i4 = a2 + bVar.f1218a;
            int i5 = (this.f6155a * 4) + ((ByteBuffer) bVar.f1221d).getInt(i4) + i4 + 4;
            int i6 = ((ByteBuffer) bVar.f1221d).getInt(i5) + i5;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f1221d;
            aVar2.f1221d = byteBuffer;
            if (byteBuffer != null) {
                aVar2.f1218a = i6;
                int i7 = i6 - byteBuffer.getInt(i6);
                aVar2.f1219b = i7;
                aVar2.f1220c = ((ByteBuffer) aVar2.f1221d).getShort(i7);
                return aVar2;
            }
            aVar2.f1218a = 0;
            aVar2.f1219b = 0;
            aVar2.f1220c = 0;
        }
        return aVar2;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        e0.a b4 = b();
        int a2 = b4.a(4);
        sb.append(Integer.toHexString(a2 != 0 ? ((ByteBuffer) b4.f1221d).getInt(a2 + b4.f1218a) : 0));
        sb.append(", codepoints:");
        e0.a b5 = b();
        int a4 = b5.a(16);
        if (a4 != 0) {
            int i4 = a4 + b5.f1218a;
            i = ((ByteBuffer) b5.f1221d).getInt(((ByteBuffer) b5.f1221d).getInt(i4) + i4);
        } else {
            i = 0;
        }
        for (int i5 = 0; i5 < i; i5++) {
            sb.append(Integer.toHexString(a(i5)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
