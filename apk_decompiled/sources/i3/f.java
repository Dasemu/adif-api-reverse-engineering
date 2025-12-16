package i3;

import Z2.D;
import e3.C0315a;
import e3.C0329o;
import e3.U;
import e3.w;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import l3.C0438a;
import l3.EnumC0439b;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final m f6848a;

    /* renamed from: b, reason: collision with root package name */
    public final C0315a f6849b;

    /* renamed from: c, reason: collision with root package name */
    public final j f6850c;

    /* renamed from: d, reason: collision with root package name */
    public D f6851d;

    /* renamed from: e, reason: collision with root package name */
    public o f6852e;

    /* renamed from: f, reason: collision with root package name */
    public int f6853f;

    /* renamed from: g, reason: collision with root package name */
    public int f6854g;
    public int h;
    public U i;

    public f(m connectionPool, C0315a address, j call) {
        C0329o eventListener = C0329o.f6389d;
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f6848a = connectionPool;
        this.f6849b = address;
        this.f6850c = call;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0320 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i3.l a(int r17, boolean r18, boolean r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.f.a(int, boolean, boolean, int, int):i3.l");
    }

    public final boolean b(w url) {
        Intrinsics.checkNotNullParameter(url, "url");
        w wVar = this.f6849b.h;
        return url.f6417e == wVar.f6417e && Intrinsics.areEqual(url.f6416d, wVar.f6416d);
    }

    public final void c(IOException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        this.i = null;
        if ((e4 instanceof l3.D) && ((l3.D) e4).f7372a == EnumC0439b.REFUSED_STREAM) {
            this.f6853f++;
        } else if (e4 instanceof C0438a) {
            this.f6854g++;
        } else {
            this.h++;
        }
    }
}
