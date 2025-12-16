package X1;

import C.w;
import android.content.Context;
import f0.C0338b;

/* loaded from: classes3.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2012a;

    /* renamed from: b, reason: collision with root package name */
    public final C0338b f2013b;

    /* renamed from: c, reason: collision with root package name */
    public final C0338b f2014c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2015d;

    public b(Context context, C0338b c0338b, C0338b c0338b2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f2012a = context;
        if (c0338b == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f2013b = c0338b;
        if (c0338b2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f2014c = c0338b2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f2015d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f2012a.equals(((b) cVar).f2012a)) {
                b bVar = (b) cVar;
                if (this.f2013b.equals(bVar.f2013b) && this.f2014c.equals(bVar.f2014c) && this.f2015d.equals(bVar.f2015d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2015d.hashCode() ^ ((((((this.f2012a.hashCode() ^ 1000003) * 1000003) ^ this.f2013b.hashCode()) * 1000003) ^ this.f2014c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f2012a);
        sb.append(", wallClock=");
        sb.append(this.f2013b);
        sb.append(", monotonicClock=");
        sb.append(this.f2014c);
        sb.append(", backendName=");
        return w.r(sb, this.f2015d, "}");
    }
}
