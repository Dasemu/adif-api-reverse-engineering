package B0;

import O.X;
import a.AbstractC0106b;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public abstract class x implements Cloneable {

    /* renamed from: A, reason: collision with root package name */
    public static final Animator[] f179A = new Animator[0];

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f180B = {2, 1, 3, 4};

    /* renamed from: C, reason: collision with root package name */
    public static final E2.e f181C = new E2.e(1);

    /* renamed from: D, reason: collision with root package name */
    public static final ThreadLocal f182D = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f191k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f192l;

    /* renamed from: m, reason: collision with root package name */
    public v[] f193m;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC0106b f201v;

    /* renamed from: x, reason: collision with root package name */
    public long f203x;

    /* renamed from: y, reason: collision with root package name */
    public u f204y;

    /* renamed from: z, reason: collision with root package name */
    public long f205z;

    /* renamed from: a, reason: collision with root package name */
    public final String f183a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f184b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f185c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f186d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f187e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f188f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public A.j f189g = new A.j(1);
    public A.j h = new A.j(1);
    public D i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f190j = f180B;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f194n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f195o = f179A;
    public int p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f196q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f197r = false;

    /* renamed from: s, reason: collision with root package name */
    public x f198s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f199t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f200u = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public E2.e f202w = f181C;

    public static void c(A.j jVar, View view, F f2) {
        ((s.e) jVar.f27a).put(view, f2);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) jVar.f28b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = X.f1226a;
        String k4 = O.L.k(view);
        if (k4 != null) {
            s.e eVar = (s.e) jVar.f30d;
            if (eVar.containsKey(k4)) {
                eVar.put(k4, null);
            } else {
                eVar.put(k4, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                s.g gVar = (s.g) jVar.f29c;
                if (gVar.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    gVar.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) gVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    gVar.e(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, s.e, s.j] */
    public static s.e p() {
        ThreadLocal threadLocal = f182D;
        s.e eVar = (s.e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        ?? jVar = new s.j(0);
        threadLocal.set(jVar);
        return jVar;
    }

    public static boolean w(F f2, F f4, String str) {
        Object obj = f2.f98a.get(str);
        Object obj2 = f4.f98a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public x A(v vVar) {
        x xVar;
        ArrayList arrayList = this.f199t;
        if (arrayList != null) {
            if (!arrayList.remove(vVar) && (xVar = this.f198s) != null) {
                xVar.A(vVar);
            }
            if (this.f199t.size() == 0) {
                this.f199t = null;
            }
        }
        return this;
    }

    public void B(View view) {
        this.f188f.remove(view);
    }

    public void C(View view) {
        if (this.f196q) {
            if (!this.f197r) {
                ArrayList arrayList = this.f194n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f195o);
                this.f195o = f179A;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f195o = animatorArr;
                x(this, w.f177f, false);
            }
            this.f196q = false;
        }
    }

    public void D() {
        L();
        s.e p = p();
        Iterator it = this.f200u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p.containsKey(animator)) {
                L();
                if (animator != null) {
                    animator.addListener(new p(this, p));
                    long j4 = this.f185c;
                    if (j4 >= 0) {
                        animator.setDuration(j4);
                    }
                    long j5 = this.f184b;
                    if (j5 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j5);
                    }
                    TimeInterpolator timeInterpolator = this.f186d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new q(this, 0));
                    animator.start();
                }
            }
        }
        this.f200u.clear();
        m();
    }

    public void E(long j4, long j5) {
        long j6 = this.f203x;
        boolean z3 = j4 < j5;
        if ((j5 < 0 && j4 >= 0) || (j5 > j6 && j4 <= j6)) {
            this.f197r = false;
            x(this, w.f173b, z3);
        }
        ArrayList arrayList = this.f194n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f195o);
        this.f195o = f179A;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            s.b(animator, Math.min(Math.max(0L, j4), s.a(animator)));
        }
        this.f195o = animatorArr;
        if ((j4 <= j6 || j5 > j6) && (j4 >= 0 || j5 < 0)) {
            return;
        }
        if (j4 > j6) {
            this.f197r = true;
        }
        x(this, w.f174c, z3);
    }

    public void F(long j4) {
        this.f185c = j4;
    }

    public void G(AbstractC0106b abstractC0106b) {
        this.f201v = abstractC0106b;
    }

    public void H(TimeInterpolator timeInterpolator) {
        this.f186d = timeInterpolator;
    }

    public void I(E2.e eVar) {
        if (eVar == null) {
            this.f202w = f181C;
        } else {
            this.f202w = eVar;
        }
    }

    public void J() {
    }

    public void K(long j4) {
        this.f184b = j4;
    }

    public final void L() {
        if (this.p == 0) {
            x(this, w.f173b, false);
            this.f197r = false;
        }
        this.p++;
    }

    public String M(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f185c != -1) {
            sb.append("dur(");
            sb.append(this.f185c);
            sb.append(") ");
        }
        if (this.f184b != -1) {
            sb.append("dly(");
            sb.append(this.f184b);
            sb.append(") ");
        }
        if (this.f186d != null) {
            sb.append("interp(");
            sb.append(this.f186d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f187e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f188f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i4));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(v vVar) {
        if (this.f199t == null) {
            this.f199t = new ArrayList();
        }
        this.f199t.add(vVar);
    }

    public void b(View view) {
        this.f188f.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.f194n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f195o);
        this.f195o = f179A;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f195o = animatorArr;
        x(this, w.f175d, false);
    }

    public abstract void d(F f2);

    public final void e(View view, boolean z3) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            F f2 = new F(view);
            if (z3) {
                g(f2);
            } else {
                d(f2);
            }
            f2.f100c.add(this);
            f(f2);
            if (z3) {
                c(this.f189g, view, f2);
            } else {
                c(this.h, view, f2);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z3);
            }
        }
    }

    public void f(F f2) {
    }

    public abstract void g(F f2);

    public final void h(ViewGroup viewGroup, boolean z3) {
        i(z3);
        ArrayList arrayList = this.f187e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f188f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z3);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                F f2 = new F(findViewById);
                if (z3) {
                    g(f2);
                } else {
                    d(f2);
                }
                f2.f100c.add(this);
                f(f2);
                if (z3) {
                    c(this.f189g, findViewById, f2);
                } else {
                    c(this.h, findViewById, f2);
                }
            }
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            View view = (View) arrayList2.get(i4);
            F f4 = new F(view);
            if (z3) {
                g(f4);
            } else {
                d(f4);
            }
            f4.f100c.add(this);
            f(f4);
            if (z3) {
                c(this.f189g, view, f4);
            } else {
                c(this.h, view, f4);
            }
        }
    }

    public final void i(boolean z3) {
        if (z3) {
            ((s.e) this.f189g.f27a).clear();
            ((SparseArray) this.f189g.f28b).clear();
            ((s.g) this.f189g.f29c).a();
        } else {
            ((s.e) this.h.f27a).clear();
            ((SparseArray) this.h.f28b).clear();
            ((s.g) this.h.f29c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public x clone() {
        try {
            x xVar = (x) super.clone();
            xVar.f200u = new ArrayList();
            xVar.f189g = new A.j(1);
            xVar.h = new A.j(1);
            xVar.f191k = null;
            xVar.f192l = null;
            xVar.f204y = null;
            xVar.f198s = this;
            xVar.f199t = null;
            return xVar;
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    public Animator k(ViewGroup viewGroup, F f2, F f4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, B0.r] */
    public void l(ViewGroup viewGroup, A.j jVar, A.j jVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        boolean z3;
        View view;
        F f2;
        Animator animator;
        F f4;
        s.e p = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z4 = o().f204y != null;
        int i4 = 0;
        while (i4 < size) {
            F f5 = (F) arrayList.get(i4);
            F f6 = (F) arrayList2.get(i4);
            if (f5 != null && !f5.f100c.contains(this)) {
                f5 = null;
            }
            if (f6 != null && !f6.f100c.contains(this)) {
                f6 = null;
            }
            if ((f5 != null || f6 != null) && (f5 == null || f6 == null || u(f5, f6))) {
                Animator k4 = k(viewGroup, f5, f6);
                if (k4 != null) {
                    String str = this.f183a;
                    if (f6 != null) {
                        String[] q4 = q();
                        view = f6.f99b;
                        if (q4 != null && q4.length > 0) {
                            f4 = new F(view);
                            F f7 = (F) ((s.e) jVar2.f27a).get(view);
                            i = size;
                            z3 = z4;
                            if (f7 != null) {
                                int i5 = 0;
                                while (i5 < q4.length) {
                                    HashMap hashMap = f4.f98a;
                                    int i6 = i5;
                                    String str2 = q4[i6];
                                    hashMap.put(str2, f7.f98a.get(str2));
                                    i5 = i6 + 1;
                                }
                            }
                            int i7 = p.f8352c;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    animator = k4;
                                    break;
                                }
                                r rVar = (r) p.get((Animator) p.f(i8));
                                if (rVar.f161c != null && rVar.f159a == view && rVar.f160b.equals(str) && rVar.f161c.equals(f4)) {
                                    animator = null;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            i = size;
                            z3 = z4;
                            animator = k4;
                            f4 = null;
                        }
                        k4 = animator;
                        f2 = f4;
                    } else {
                        i = size;
                        z3 = z4;
                        view = f5.f99b;
                        f2 = null;
                    }
                    if (k4 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ?? obj = new Object();
                        obj.f159a = view;
                        obj.f160b = str;
                        obj.f161c = f2;
                        obj.f162d = windowId;
                        obj.f163e = this;
                        obj.f164f = k4;
                        if (z3) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(k4);
                            k4 = animatorSet;
                        }
                        p.put(k4, obj);
                        this.f200u.add(k4);
                    }
                    i4++;
                    size = i;
                    z4 = z3;
                }
            }
            i = size;
            z3 = z4;
            i4++;
            size = i;
            z4 = z3;
        }
        if (sparseIntArray.size() != 0) {
            for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
                r rVar2 = (r) p.get((Animator) this.f200u.get(sparseIntArray.keyAt(i9)));
                rVar2.f164f.setStartDelay(rVar2.f164f.getStartDelay() + (sparseIntArray.valueAt(i9) - LongCompanionObject.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.p - 1;
        this.p = i;
        if (i == 0) {
            x(this, w.f174c, false);
            for (int i4 = 0; i4 < ((s.g) this.f189g.f29c).g(); i4++) {
                View view = (View) ((s.g) this.f189g.f29c).h(i4);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i5 = 0; i5 < ((s.g) this.h.f29c).g(); i5++) {
                View view2 = (View) ((s.g) this.h.f29c).h(i5);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f197r = true;
        }
    }

    public final F n(View view, boolean z3) {
        D d4 = this.i;
        if (d4 != null) {
            return d4.n(view, z3);
        }
        ArrayList arrayList = z3 ? this.f191k : this.f192l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            F f2 = (F) arrayList.get(i);
            if (f2 == null) {
                return null;
            }
            if (f2.f99b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (F) (z3 ? this.f192l : this.f191k).get(i);
        }
        return null;
    }

    public final x o() {
        D d4 = this.i;
        return d4 != null ? d4.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final F r(View view, boolean z3) {
        D d4 = this.i;
        if (d4 != null) {
            return d4.r(view, z3);
        }
        return (F) ((s.e) (z3 ? this.f189g : this.h).f27a).get(view);
    }

    public boolean s() {
        return !this.f194n.isEmpty();
    }

    public boolean t() {
        return this instanceof C0028f;
    }

    public final String toString() {
        return M("");
    }

    public boolean u(F f2, F f4) {
        if (f2 != null && f4 != null) {
            String[] q4 = q();
            if (q4 != null) {
                for (String str : q4) {
                    if (w(f2, f4, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = f2.f98a.keySet().iterator();
                while (it.hasNext()) {
                    if (w(f2, f4, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean v(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f187e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f188f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void x(x xVar, w wVar, boolean z3) {
        x xVar2 = this.f198s;
        if (xVar2 != null) {
            xVar2.x(xVar, wVar, z3);
        }
        ArrayList arrayList = this.f199t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f199t.size();
        v[] vVarArr = this.f193m;
        if (vVarArr == null) {
            vVarArr = new v[size];
        }
        this.f193m = null;
        v[] vVarArr2 = (v[]) this.f199t.toArray(vVarArr);
        for (int i = 0; i < size; i++) {
            v vVar = vVarArr2[i];
            switch (wVar.f178a) {
                case 0:
                    vVar.f(xVar);
                    break;
                case 1:
                    vVar.c(xVar);
                    break;
                case 2:
                    vVar.e(xVar);
                    break;
                case 3:
                    vVar.b();
                    break;
                default:
                    vVar.d();
                    break;
            }
            vVarArr2[i] = null;
        }
        this.f193m = vVarArr2;
    }

    public void y(ViewGroup viewGroup) {
        if (this.f197r) {
            return;
        }
        ArrayList arrayList = this.f194n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f195o);
        this.f195o = f179A;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f195o = animatorArr;
        x(this, w.f176e, false);
        this.f196q = true;
    }

    public void z() {
        s.e p = p();
        this.f203x = 0L;
        for (int i = 0; i < this.f200u.size(); i++) {
            Animator animator = (Animator) this.f200u.get(i);
            r rVar = (r) p.get(animator);
            if (animator != null && rVar != null) {
                long j4 = this.f185c;
                Animator animator2 = rVar.f164f;
                if (j4 >= 0) {
                    animator2.setDuration(j4);
                }
                long j5 = this.f184b;
                if (j5 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j5);
                }
                TimeInterpolator timeInterpolator = this.f186d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f194n.add(animator);
                this.f203x = Math.max(this.f203x, s.a(animator));
            }
        }
        this.f200u.clear();
    }
}
