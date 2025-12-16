package i3;

import a.AbstractC0105a;
import e3.C0329o;
import e3.I;
import e3.M;
import e3.N;
import e3.O;
import e3.Q;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import l3.C0438a;
import l3.D;
import l3.EnumC0439b;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j f6842a;

    /* renamed from: b, reason: collision with root package name */
    public final f f6843b;

    /* renamed from: c, reason: collision with root package name */
    public final j3.e f6844c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6845d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6846e;

    /* renamed from: f, reason: collision with root package name */
    public final l f6847f;

    public e(j call, f finder, j3.e codec) {
        C0329o eventListener = C0329o.f6389d;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f6842a = call;
        this.f6843b = finder;
        this.f6844c = codec;
        this.f6847f = codec.h();
    }

    public final IOException a(boolean z3, boolean z4, IOException ioe) {
        if (ioe != null) {
            e(ioe);
        }
        j call = this.f6842a;
        if (z4) {
            if (ioe != null) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
            } else {
                Intrinsics.checkNotNullParameter(call, "call");
            }
        }
        if (z3) {
            if (ioe != null) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
            } else {
                Intrinsics.checkNotNullParameter(call, "call");
            }
        }
        return call.h(this, z4, z3, ioe);
    }

    public final c b(I request, boolean z3) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f6845d = z3;
        M m4 = request.f6270d;
        Intrinsics.checkNotNull(m4);
        long contentLength = m4.contentLength();
        j call = this.f6842a;
        Intrinsics.checkNotNullParameter(call, "call");
        return new c(this, this.f6844c.e(request, contentLength), contentLength);
    }

    public final Q c(O response) {
        j3.e eVar = this.f6844c;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String d4 = O.d(response, "Content-Type");
            long f2 = eVar.f(response);
            return new Q(d4, f2, AbstractC0105a.d(new d(this, eVar.b(response), f2)));
        } catch (IOException ioe) {
            j call = this.f6842a;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            e(ioe);
            throw ioe;
        }
    }

    public final N d(boolean z3) {
        try {
            N g4 = this.f6844c.g(z3);
            if (g4 != null) {
                Intrinsics.checkNotNullParameter(this, "deferredTrailers");
                g4.f6290m = this;
            }
            return g4;
        } catch (IOException ioe) {
            j call = this.f6842a;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            e(ioe);
            throw ioe;
        }
    }

    public final void e(IOException iOException) {
        this.f6846e = true;
        this.f6843b.c(iOException);
        l h = this.f6844c.h();
        j call = this.f6842a;
        synchronized (h) {
            try {
                Intrinsics.checkNotNullParameter(call, "call");
                if (!(iOException instanceof D)) {
                    if (!(h.f6878g != null) || (iOException instanceof C0438a)) {
                        h.f6879j = true;
                        if (h.f6882m == 0) {
                            l.d(call.f6860a, h.f6873b, iOException);
                            h.f6881l++;
                        }
                    }
                } else if (((D) iOException).f7372a == EnumC0439b.REFUSED_STREAM) {
                    int i = h.f6883n + 1;
                    h.f6883n = i;
                    if (i > 1) {
                        h.f6879j = true;
                        h.f6881l++;
                    }
                } else if (((D) iOException).f7372a != EnumC0439b.CANCEL || !call.f6871n) {
                    h.f6879j = true;
                    h.f6881l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
