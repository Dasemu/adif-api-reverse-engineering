package k3;

import e3.w;
import i3.l;
import i3.o;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public final w f7103d;

    /* renamed from: e, reason: collision with root package name */
    public long f7104e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f7106g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, w url) {
        super(oVar);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f7106g = oVar;
        this.f7103d = url;
        this.f7104e = -1L;
        this.f7105f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7098b) {
            return;
        }
        if (this.f7105f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!f3.c.g(this)) {
                ((l) this.f7106g.f6894c).k();
                d();
            }
        }
        this.f7098b = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r6 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        if (r10.f7105f == false) goto L27;
     */
    @Override // k3.a, r3.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(r3.C0576h r11, long r12) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.c.read(r3.h, long):long");
    }
}
