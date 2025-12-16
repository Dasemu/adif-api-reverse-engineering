package H0;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v0;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class e extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public b f636a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f637b;

    /* renamed from: c, reason: collision with root package name */
    public final n f638c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f639d;

    /* renamed from: e, reason: collision with root package name */
    public int f640e;

    /* renamed from: f, reason: collision with root package name */
    public int f641f;

    /* renamed from: g, reason: collision with root package name */
    public final d f642g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f643j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f644k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f645l;

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, H0.d] */
    public e(ViewPager2 viewPager2) {
        this.f637b = viewPager2;
        n nVar = viewPager2.f4085j;
        this.f638c = nVar;
        this.f639d = (LinearLayoutManager) nVar.getLayoutManager();
        this.f642g = new Object();
        c();
    }

    public final void a(int i) {
        b bVar = this.f636a;
        if (bVar != null) {
            bVar.c(i);
        }
    }

    public final void b(int i) {
        if ((this.f640e == 3 && this.f641f == 0) || this.f641f == i) {
            return;
        }
        this.f641f = i;
        b bVar = this.f636a;
        if (bVar != null) {
            bVar.a(i);
        }
    }

    public final void c() {
        this.f640e = 0;
        this.f641f = 0;
        d dVar = this.f642g;
        dVar.f633a = -1;
        dVar.f634b = BitmapDescriptorFactory.HUE_RED;
        dVar.f635c = 0;
        this.h = -1;
        this.i = -1;
        this.f643j = false;
        this.f644k = false;
        this.f645l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0130, code lost:
    
        if (r4[r12 - 1][1] >= r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0137, code lost:
    
        if (r0.v() <= 1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.e.d():void");
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        b bVar;
        int i4 = this.f640e;
        boolean z3 = true;
        if (!(i4 == 1 && this.f641f == 1) && i == 1) {
            this.f640e = 1;
            int i5 = this.i;
            if (i5 != -1) {
                this.h = i5;
                this.i = -1;
            } else if (this.h == -1) {
                this.h = this.f639d.S0();
            }
            b(1);
            return;
        }
        if ((i4 == 1 || i4 == 4) && i == 2) {
            if (this.f644k) {
                b(2);
                this.f643j = true;
                return;
            }
            return;
        }
        if (i4 != 1 && i4 != 4) {
            z3 = false;
        }
        d dVar = this.f642g;
        if (z3 && i == 0) {
            d();
            if (!this.f644k) {
                int i6 = dVar.f633a;
                if (i6 != -1 && (bVar = this.f636a) != null) {
                    bVar.b(i6, BitmapDescriptorFactory.HUE_RED, 0);
                }
            } else if (dVar.f635c == 0) {
                int i7 = this.h;
                int i8 = dVar.f633a;
                if (i7 != i8) {
                    a(i8);
                }
            }
            b(0);
            c();
        }
        if (this.f640e == 2 && i == 0 && this.f645l) {
            d();
            if (dVar.f635c == 0) {
                int i9 = this.i;
                int i10 = dVar.f633a;
                if (i9 != i10) {
                    if (i10 == -1) {
                        i10 = 0;
                    }
                    a(i10);
                }
                b(0);
                c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if ((r7 < 0) == (r5.f637b.f4084g.G() == 1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // androidx.recyclerview.widget.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f644k = r6
            r5.d()
            boolean r0 = r5.f643j
            H0.d r1 = r5.f642g
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L3c
            r5.f643j = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f637b
            H0.i r8 = r8.f4084g
            int r8 = r8.G()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r1.f635c
            if (r7 == 0) goto L30
            int r7 = r1.f633a
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r1.f633a
        L32:
            r5.i = r7
            int r8 = r5.h
            if (r8 == r7) goto L48
            r5.a(r7)
            goto L48
        L3c:
            int r7 = r5.f640e
            if (r7 != 0) goto L48
            int r7 = r1.f633a
            if (r7 != r2) goto L45
            r7 = r3
        L45:
            r5.a(r7)
        L48:
            int r7 = r1.f633a
            if (r7 != r2) goto L4d
            r7 = r3
        L4d:
            float r8 = r1.f634b
            int r0 = r1.f635c
            H0.b r4 = r5.f636a
            if (r4 == 0) goto L58
            r4.b(r7, r8, r0)
        L58:
            int r7 = r1.f633a
            int r8 = r5.i
            if (r7 == r8) goto L60
            if (r8 != r2) goto L6e
        L60:
            int r7 = r1.f635c
            if (r7 != 0) goto L6e
            int r7 = r5.f641f
            if (r7 == r6) goto L6e
            r5.b(r3)
            r5.c()
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.e.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
