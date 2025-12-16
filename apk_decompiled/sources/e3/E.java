package e3;

import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final C0330p f6214a = new C0330p();

    /* renamed from: b, reason: collision with root package name */
    public final A.a f6215b = new A.a(26);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6216c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6217d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final B0.w f6218e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6219f;

    /* renamed from: g, reason: collision with root package name */
    public final C0329o f6220g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final C0329o f6221j;

    /* renamed from: k, reason: collision with root package name */
    public final C0329o f6222k;

    /* renamed from: l, reason: collision with root package name */
    public final C0329o f6223l;

    /* renamed from: m, reason: collision with root package name */
    public final SocketFactory f6224m;

    /* renamed from: n, reason: collision with root package name */
    public final List f6225n;

    /* renamed from: o, reason: collision with root package name */
    public final List f6226o;
    public final q3.c p;

    /* renamed from: q, reason: collision with root package name */
    public C0322h f6227q;

    /* renamed from: r, reason: collision with root package name */
    public int f6228r;

    /* renamed from: s, reason: collision with root package name */
    public int f6229s;

    /* renamed from: t, reason: collision with root package name */
    public int f6230t;

    public E() {
        Intrinsics.checkNotNullParameter(C0329o.f6389d, "<this>");
        this.f6218e = new B0.w(21);
        this.f6219f = true;
        C0329o c0329o = InterfaceC0316b.f6329a;
        this.f6220g = c0329o;
        this.h = true;
        this.i = true;
        this.f6221j = C0329o.f6387b;
        this.f6222k = C0329o.f6388c;
        this.f6223l = c0329o;
        SocketFactory socketFactory = SocketFactory.getDefault();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
        this.f6224m = socketFactory;
        this.f6225n = F.f6231A;
        this.f6226o = F.f6232z;
        this.p = q3.c.f8192a;
        this.f6227q = C0322h.f6346c;
        this.f6228r = 10000;
        this.f6229s = 10000;
        this.f6230t = 10000;
    }
}
