package w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;
import u.AbstractC0629f;
import u.C0630g;
import x.m;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f8657b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8658c;

    /* renamed from: d, reason: collision with root package name */
    public final d f8659d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8660e;

    /* renamed from: f, reason: collision with root package name */
    public c f8661f;
    public C0630g i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f8656a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f8662g = 0;
    public int h = IntCompanionObject.MIN_VALUE;

    public c(d dVar, int i) {
        this.f8659d = dVar;
        this.f8660e = i;
    }

    public final void a(c cVar, int i) {
        b(cVar, i, IntCompanionObject.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i, int i4, boolean z3) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z3 && !i(cVar)) {
            return false;
        }
        this.f8661f = cVar;
        if (cVar.f8656a == null) {
            cVar.f8656a = new HashSet();
        }
        HashSet hashSet = this.f8661f.f8656a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f8662g = i;
        this.h = i4;
        return true;
    }

    public final void c(int i, ArrayList arrayList, m mVar) {
        HashSet hashSet = this.f8656a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                x.g.b(((c) it.next()).f8659d, i, arrayList, mVar);
            }
        }
    }

    public final int d() {
        if (this.f8658c) {
            return this.f8657b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f8659d.f8700g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (cVar = this.f8661f) == null || cVar.f8659d.f8700g0 != 8) ? this.f8662g : i;
    }

    public final c f() {
        int i = this.f8660e;
        int b4 = AbstractC0629f.b(i);
        d dVar = this.f8659d;
        switch (b4) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f8672K;
            case 2:
                return dVar.f8673L;
            case 3:
                return dVar.f8671I;
            case 4:
                return dVar.J;
            default:
                throw new AssertionError(com.google.android.gms.measurement.internal.a.A(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f8656a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f8661f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(w.c r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L5
            goto L65
        L5:
            r1 = 6
            int r2 = r9.f8660e
            r3 = 1
            w.d r4 = r10.f8659d
            int r10 = r10.f8660e
            if (r10 != r2) goto L1c
            if (r2 != r1) goto L63
            boolean r10 = r4.f8667E
            if (r10 == 0) goto L65
            w.d r9 = r9.f8659d
            boolean r9 = r9.f8667E
            if (r9 != 0) goto L63
            goto L65
        L1c:
            int r9 = u.AbstractC0629f.b(r2)
            r5 = 8
            r6 = 9
            r7 = 4
            r8 = 2
            switch(r9) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r10 = com.google.android.gms.measurement.internal.a.A(r2)
            r9.<init>(r10)
            throw r9
        L33:
            if (r10 == r1) goto L65
            if (r10 == r5) goto L65
            if (r10 == r6) goto L65
            goto L63
        L3a:
            if (r10 == r8) goto L65
            if (r10 != r7) goto L63
            goto L65
        L3f:
            r9 = 3
            if (r10 == r9) goto L48
            r9 = 5
            if (r10 != r9) goto L46
            goto L48
        L46:
            r9 = r0
            goto L49
        L48:
            r9 = r3
        L49:
            boolean r1 = r4 instanceof w.h
            if (r1 == 0) goto L52
            if (r9 != 0) goto L63
            if (r10 != r6) goto L65
            goto L63
        L52:
            return r9
        L53:
            if (r10 == r8) goto L5a
            if (r10 != r7) goto L58
            goto L5a
        L58:
            r9 = r0
            goto L5b
        L5a:
            r9 = r3
        L5b:
            boolean r1 = r4 instanceof w.h
            if (r1 == 0) goto L64
            if (r9 != 0) goto L63
            if (r10 != r5) goto L65
        L63:
            return r3
        L64:
            return r9
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.c.i(w.c):boolean");
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f8661f;
        if (cVar != null && (hashSet = cVar.f8656a) != null) {
            hashSet.remove(this);
            if (this.f8661f.f8656a.size() == 0) {
                this.f8661f.f8656a = null;
            }
        }
        this.f8656a = null;
        this.f8661f = null;
        this.f8662g = 0;
        this.h = IntCompanionObject.MIN_VALUE;
        this.f8658c = false;
        this.f8657b = 0;
    }

    public final void k() {
        C0630g c0630g = this.i;
        if (c0630g == null) {
            this.i = new C0630g(1);
        } else {
            c0630g.c();
        }
    }

    public final void l(int i) {
        this.f8657b = i;
        this.f8658c = true;
    }

    public final String toString() {
        return this.f8659d.f8701h0 + ":" + com.google.android.gms.measurement.internal.a.A(this.f8660e);
    }
}
