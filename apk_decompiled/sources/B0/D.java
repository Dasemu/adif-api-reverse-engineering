package B0;

import a.AbstractC0106b;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class D extends x {

    /* renamed from: G, reason: collision with root package name */
    public int f95G;

    /* renamed from: E, reason: collision with root package name */
    public ArrayList f93E = new ArrayList();

    /* renamed from: F, reason: collision with root package name */
    public boolean f94F = true;

    /* renamed from: H, reason: collision with root package name */
    public boolean f96H = false;

    /* renamed from: I, reason: collision with root package name */
    public int f97I = 0;

    @Override // B0.x
    public final x A(v vVar) {
        super.A(vVar);
        return this;
    }

    @Override // B0.x
    public final void B(View view) {
        for (int i = 0; i < this.f93E.size(); i++) {
            ((x) this.f93E.get(i)).B(view);
        }
        this.f188f.remove(view);
    }

    @Override // B0.x
    public final void C(View view) {
        super.C(view);
        int size = this.f93E.size();
        for (int i = 0; i < size; i++) {
            ((x) this.f93E.get(i)).C(view);
        }
    }

    @Override // B0.x
    public final void D() {
        if (this.f93E.isEmpty()) {
            L();
            m();
            return;
        }
        C c4 = new C();
        c4.f92b = this;
        Iterator it = this.f93E.iterator();
        while (it.hasNext()) {
            ((x) it.next()).a(c4);
        }
        this.f95G = this.f93E.size();
        if (this.f94F) {
            Iterator it2 = this.f93E.iterator();
            while (it2.hasNext()) {
                ((x) it2.next()).D();
            }
            return;
        }
        for (int i = 1; i < this.f93E.size(); i++) {
            ((x) this.f93E.get(i - 1)).a(new C((x) this.f93E.get(i), 2));
        }
        x xVar = (x) this.f93E.get(0);
        if (xVar != null) {
            xVar.D();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // B0.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.D.E(long, long):void");
    }

    @Override // B0.x
    public final void G(AbstractC0106b abstractC0106b) {
        this.f201v = abstractC0106b;
        this.f97I |= 8;
        int size = this.f93E.size();
        for (int i = 0; i < size; i++) {
            ((x) this.f93E.get(i)).G(abstractC0106b);
        }
    }

    @Override // B0.x
    public final void I(E2.e eVar) {
        super.I(eVar);
        this.f97I |= 4;
        if (this.f93E != null) {
            for (int i = 0; i < this.f93E.size(); i++) {
                ((x) this.f93E.get(i)).I(eVar);
            }
        }
    }

    @Override // B0.x
    public final void J() {
        this.f97I |= 2;
        int size = this.f93E.size();
        for (int i = 0; i < size; i++) {
            ((x) this.f93E.get(i)).J();
        }
    }

    @Override // B0.x
    public final void K(long j4) {
        this.f184b = j4;
    }

    @Override // B0.x
    public final String M(String str) {
        String M3 = super.M(str);
        for (int i = 0; i < this.f93E.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(M3);
            sb.append("\n");
            sb.append(((x) this.f93E.get(i)).M(str + "  "));
            M3 = sb.toString();
        }
        return M3;
    }

    public final void N(x xVar) {
        this.f93E.add(xVar);
        xVar.i = this;
        long j4 = this.f185c;
        if (j4 >= 0) {
            xVar.F(j4);
        }
        if ((this.f97I & 1) != 0) {
            xVar.H(this.f186d);
        }
        if ((this.f97I & 2) != 0) {
            xVar.J();
        }
        if ((this.f97I & 4) != 0) {
            xVar.I(this.f202w);
        }
        if ((this.f97I & 8) != 0) {
            xVar.G(this.f201v);
        }
    }

    public final x O(int i) {
        if (i < 0 || i >= this.f93E.size()) {
            return null;
        }
        return (x) this.f93E.get(i);
    }

    @Override // B0.x
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void F(long j4) {
        ArrayList arrayList;
        this.f185c = j4;
        if (j4 < 0 || (arrayList = this.f93E) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((x) this.f93E.get(i)).F(j4);
        }
    }

    @Override // B0.x
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void H(TimeInterpolator timeInterpolator) {
        this.f97I |= 1;
        ArrayList arrayList = this.f93E;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((x) this.f93E.get(i)).H(timeInterpolator);
            }
        }
        this.f186d = timeInterpolator;
    }

    public final void R(int i) {
        if (i == 0) {
            this.f94F = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(com.google.android.gms.measurement.internal.a.l(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f94F = false;
        }
    }

    @Override // B0.x
    public final void b(View view) {
        for (int i = 0; i < this.f93E.size(); i++) {
            ((x) this.f93E.get(i)).b(view);
        }
        this.f188f.add(view);
    }

    @Override // B0.x
    public final void cancel() {
        super.cancel();
        int size = this.f93E.size();
        for (int i = 0; i < size; i++) {
            ((x) this.f93E.get(i)).cancel();
        }
    }

    @Override // B0.x
    public final void d(F f2) {
        if (v(f2.f99b)) {
            Iterator it = this.f93E.iterator();
            while (it.hasNext()) {
                x xVar = (x) it.next();
                if (xVar.v(f2.f99b)) {
                    xVar.d(f2);
                    f2.f100c.add(xVar);
                }
            }
        }
    }

    @Override // B0.x
    public final void f(F f2) {
        int size = this.f93E.size();
        for (int i = 0; i < size; i++) {
            ((x) this.f93E.get(i)).f(f2);
        }
    }

    @Override // B0.x
    public final void g(F f2) {
        if (v(f2.f99b)) {
            Iterator it = this.f93E.iterator();
            while (it.hasNext()) {
                x xVar = (x) it.next();
                if (xVar.v(f2.f99b)) {
                    xVar.g(f2);
                    f2.f100c.add(xVar);
                }
            }
        }
    }

    @Override // B0.x
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final x clone() {
        D d4 = (D) super.clone();
        d4.f93E = new ArrayList();
        int size = this.f93E.size();
        for (int i = 0; i < size; i++) {
            x clone = ((x) this.f93E.get(i)).clone();
            d4.f93E.add(clone);
            clone.i = d4;
        }
        return d4;
    }

    @Override // B0.x
    public final void l(ViewGroup viewGroup, A.j jVar, A.j jVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j4 = this.f184b;
        int size = this.f93E.size();
        for (int i = 0; i < size; i++) {
            x xVar = (x) this.f93E.get(i);
            if (j4 > 0 && (this.f94F || i == 0)) {
                long j5 = xVar.f184b;
                if (j5 > 0) {
                    xVar.K(j5 + j4);
                } else {
                    xVar.K(j4);
                }
            }
            xVar.l(viewGroup, jVar, jVar2, arrayList, arrayList2);
        }
    }

    @Override // B0.x
    public final boolean s() {
        for (int i = 0; i < this.f93E.size(); i++) {
            if (((x) this.f93E.get(i)).s()) {
                return true;
            }
        }
        return false;
    }

    @Override // B0.x
    public final boolean t() {
        int size = this.f93E.size();
        for (int i = 0; i < size; i++) {
            if (!((x) this.f93E.get(i)).t()) {
                return false;
            }
        }
        return true;
    }

    @Override // B0.x
    public final void y(ViewGroup viewGroup) {
        super.y(viewGroup);
        int size = this.f93E.size();
        for (int i = 0; i < size; i++) {
            ((x) this.f93E.get(i)).y(viewGroup);
        }
    }

    @Override // B0.x
    public final void z() {
        this.f203x = 0L;
        int i = 0;
        C c4 = new C(this, i);
        while (i < this.f93E.size()) {
            x xVar = (x) this.f93E.get(i);
            xVar.a(c4);
            xVar.z();
            long j4 = xVar.f203x;
            if (this.f94F) {
                this.f203x = Math.max(this.f203x, j4);
            } else {
                long j5 = this.f203x;
                xVar.f205z = j5;
                this.f203x = j5 + j4;
            }
            i++;
        }
    }
}
