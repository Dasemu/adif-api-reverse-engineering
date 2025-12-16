package androidx.constraintlayout.widget;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f2554A;

    /* renamed from: B, reason: collision with root package name */
    public int f2555B;

    /* renamed from: C, reason: collision with root package name */
    public int f2556C;

    /* renamed from: D, reason: collision with root package name */
    public int f2557D;

    /* renamed from: E, reason: collision with root package name */
    public float f2558E;

    /* renamed from: F, reason: collision with root package name */
    public float f2559F;

    /* renamed from: G, reason: collision with root package name */
    public String f2560G;

    /* renamed from: H, reason: collision with root package name */
    public float f2561H;

    /* renamed from: I, reason: collision with root package name */
    public float f2562I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public int f2563K;

    /* renamed from: L, reason: collision with root package name */
    public int f2564L;

    /* renamed from: M, reason: collision with root package name */
    public int f2565M;

    /* renamed from: N, reason: collision with root package name */
    public int f2566N;

    /* renamed from: O, reason: collision with root package name */
    public int f2567O;

    /* renamed from: P, reason: collision with root package name */
    public int f2568P;

    /* renamed from: Q, reason: collision with root package name */
    public int f2569Q;

    /* renamed from: R, reason: collision with root package name */
    public float f2570R;

    /* renamed from: S, reason: collision with root package name */
    public float f2571S;

    /* renamed from: T, reason: collision with root package name */
    public int f2572T;

    /* renamed from: U, reason: collision with root package name */
    public int f2573U;

    /* renamed from: V, reason: collision with root package name */
    public int f2574V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2575W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f2576X;

    /* renamed from: Y, reason: collision with root package name */
    public String f2577Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public int f2578a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f2579a0;

    /* renamed from: b, reason: collision with root package name */
    public int f2580b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f2581b0;

    /* renamed from: c, reason: collision with root package name */
    public float f2582c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2583c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2584d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f2585d0;

    /* renamed from: e, reason: collision with root package name */
    public int f2586e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f2587e0;

    /* renamed from: f, reason: collision with root package name */
    public int f2588f;

    /* renamed from: f0, reason: collision with root package name */
    public int f2589f0;

    /* renamed from: g, reason: collision with root package name */
    public int f2590g;

    /* renamed from: g0, reason: collision with root package name */
    public int f2591g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f2592h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f2593i0;

    /* renamed from: j, reason: collision with root package name */
    public int f2594j;

    /* renamed from: j0, reason: collision with root package name */
    public int f2595j0;

    /* renamed from: k, reason: collision with root package name */
    public int f2596k;

    /* renamed from: k0, reason: collision with root package name */
    public int f2597k0;

    /* renamed from: l, reason: collision with root package name */
    public int f2598l;

    /* renamed from: l0, reason: collision with root package name */
    public float f2599l0;

    /* renamed from: m, reason: collision with root package name */
    public int f2600m;

    /* renamed from: m0, reason: collision with root package name */
    public int f2601m0;

    /* renamed from: n, reason: collision with root package name */
    public int f2602n;

    /* renamed from: n0, reason: collision with root package name */
    public int f2603n0;

    /* renamed from: o, reason: collision with root package name */
    public int f2604o;

    /* renamed from: o0, reason: collision with root package name */
    public float f2605o0;
    public int p;

    /* renamed from: p0, reason: collision with root package name */
    public w.d f2606p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2607q;

    /* renamed from: r, reason: collision with root package name */
    public float f2608r;

    /* renamed from: s, reason: collision with root package name */
    public int f2609s;

    /* renamed from: t, reason: collision with root package name */
    public int f2610t;

    /* renamed from: u, reason: collision with root package name */
    public int f2611u;

    /* renamed from: v, reason: collision with root package name */
    public int f2612v;

    /* renamed from: w, reason: collision with root package name */
    public int f2613w;

    /* renamed from: x, reason: collision with root package name */
    public int f2614x;

    /* renamed from: y, reason: collision with root package name */
    public int f2615y;

    /* renamed from: z, reason: collision with root package name */
    public int f2616z;

    public final void a() {
        this.f2585d0 = false;
        this.f2579a0 = true;
        this.f2581b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f2575W) {
            this.f2579a0 = false;
            if (this.f2564L == 0) {
                this.f2564L = 1;
            }
        }
        int i4 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i4 == -2 && this.f2576X) {
            this.f2581b0 = false;
            if (this.f2565M == 0) {
                this.f2565M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f2579a0 = false;
            if (i == 0 && this.f2564L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f2575W = true;
            }
        }
        if (i4 == 0 || i4 == -1) {
            this.f2581b0 = false;
            if (i4 == 0 && this.f2565M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f2576X = true;
            }
        }
        if (this.f2582c == -1.0f && this.f2578a == -1 && this.f2580b == -1) {
            return;
        }
        this.f2585d0 = true;
        this.f2579a0 = true;
        this.f2581b0 = true;
        if (!(this.f2606p0 instanceof w.h)) {
            this.f2606p0 = new w.h();
        }
        ((w.h) this.f2606p0).S(this.f2574V);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.resolveLayoutDirection(int):void");
    }
}
