package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import e3.C0325k;
import f.AbstractC0336a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.AbstractC0463g0;
import m.C0487t;

/* renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0207b {

    /* renamed from: a, reason: collision with root package name */
    public int f3787a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3788b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3789c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3790d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3791e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3792f;

    public C0207b(View view) {
        this.f3787a = -1;
        this.f3788b = view;
        this.f3789c = C0487t.a();
    }

    public void a() {
        View view = (View) this.f3788b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C0325k) this.f3790d) != null) {
                if (((C0325k) this.f3792f) == null) {
                    this.f3792f = new Object();
                }
                C0325k c0325k = (C0325k) this.f3792f;
                c0325k.f6368c = null;
                c0325k.f6367b = false;
                c0325k.f6369d = null;
                c0325k.f6366a = false;
                WeakHashMap weakHashMap = O.X.f1226a;
                ColorStateList g4 = O.L.g(view);
                if (g4 != null) {
                    c0325k.f6367b = true;
                    c0325k.f6368c = g4;
                }
                PorterDuff.Mode h = O.L.h(view);
                if (h != null) {
                    c0325k.f6366a = true;
                    c0325k.f6369d = h;
                }
                if (c0325k.f6367b || c0325k.f6366a) {
                    C0487t.e(background, c0325k, view.getDrawableState());
                    return;
                }
            }
            C0325k c0325k2 = (C0325k) this.f3791e;
            if (c0325k2 != null) {
                C0487t.e(background, c0325k2, view.getDrawableState());
                return;
            }
            C0325k c0325k3 = (C0325k) this.f3790d;
            if (c0325k3 != null) {
                C0487t.e(background, c0325k3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.f3790d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0205a c0205a = (C0205a) arrayList.get(i4);
            int i5 = c0205a.f3782a;
            if (i5 != 8) {
                if (i5 == 1) {
                    int i6 = c0205a.f3783b;
                    int i7 = c0205a.f3785d + i6;
                    while (i6 < i7) {
                        if (g(i6, i4 + 1) == i) {
                            return true;
                        }
                        i6++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(c0205a.f3785d, i4 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f3790d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0216f0) this.f3791e).a((C0205a) arrayList.get(i));
        }
        q(arrayList);
        this.f3787a = 0;
    }

    public void d() {
        c();
        ArrayList arrayList = (ArrayList) this.f3789c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0205a c0205a = (C0205a) arrayList.get(i);
            int i4 = c0205a.f3782a;
            C0216f0 c0216f0 = (C0216f0) this.f3791e;
            if (i4 == 1) {
                c0216f0.a(c0205a);
                c0216f0.d(c0205a.f3783b, c0205a.f3785d);
            } else if (i4 == 2) {
                c0216f0.a(c0205a);
                int i5 = c0205a.f3783b;
                int i6 = c0205a.f3785d;
                RecyclerView recyclerView = c0216f0.f3809a;
                recyclerView.U(i5, i6, true);
                recyclerView.f3691k0 = true;
                recyclerView.f3686h0.f3511c += i6;
            } else if (i4 == 4) {
                c0216f0.a(c0205a);
                c0216f0.c(c0205a.f3783b, c0205a.f3785d, c0205a.f3784c);
            } else if (i4 == 8) {
                c0216f0.a(c0205a);
                c0216f0.e(c0205a.f3783b, c0205a.f3785d);
            }
        }
        q(arrayList);
        this.f3787a = 0;
    }

    public void e(C0205a c0205a) {
        int i;
        N.c cVar;
        int i4 = c0205a.f3782a;
        if (i4 == 1 || i4 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int u3 = u(c0205a.f3783b, i4);
        int i5 = c0205a.f3783b;
        int i6 = c0205a.f3782a;
        if (i6 == 2) {
            i = 0;
        } else {
            if (i6 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0205a);
            }
            i = 1;
        }
        int i7 = 1;
        int i8 = 1;
        while (true) {
            int i9 = c0205a.f3785d;
            cVar = (N.c) this.f3788b;
            if (i7 >= i9) {
                break;
            }
            int u4 = u((i * i7) + c0205a.f3783b, c0205a.f3782a);
            int i10 = c0205a.f3782a;
            if (i10 == 2 ? u4 != u3 : !(i10 == 4 && u4 == u3 + 1)) {
                C0205a l4 = l(i10, u3, i8, c0205a.f3784c);
                f(l4, i5);
                l4.f3784c = null;
                cVar.c(l4);
                if (c0205a.f3782a == 4) {
                    i5 += i8;
                }
                i8 = 1;
                u3 = u4;
            } else {
                i8++;
            }
            i7++;
        }
        Object obj = c0205a.f3784c;
        c0205a.f3784c = null;
        cVar.c(c0205a);
        if (i8 > 0) {
            C0205a l5 = l(c0205a.f3782a, u3, i8, obj);
            f(l5, i5);
            l5.f3784c = null;
            cVar.c(l5);
        }
    }

    public void f(C0205a c0205a, int i) {
        C0216f0 c0216f0 = (C0216f0) this.f3791e;
        c0216f0.a(c0205a);
        int i4 = c0205a.f3782a;
        if (i4 != 2) {
            if (i4 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0216f0.c(i, c0205a.f3785d, c0205a.f3784c);
        } else {
            int i5 = c0205a.f3785d;
            RecyclerView recyclerView = c0216f0.f3809a;
            recyclerView.U(i, i5, true);
            recyclerView.f3691k0 = true;
            recyclerView.f3686h0.f3511c += i5;
        }
    }

    public int g(int i, int i4) {
        ArrayList arrayList = (ArrayList) this.f3790d;
        int size = arrayList.size();
        while (i4 < size) {
            C0205a c0205a = (C0205a) arrayList.get(i4);
            int i5 = c0205a.f3782a;
            if (i5 == 8) {
                int i6 = c0205a.f3783b;
                if (i6 == i) {
                    i = c0205a.f3785d;
                } else {
                    if (i6 < i) {
                        i--;
                    }
                    if (c0205a.f3785d <= i) {
                        i++;
                    }
                }
            } else {
                int i7 = c0205a.f3783b;
                if (i7 > i) {
                    continue;
                } else if (i5 == 2) {
                    int i8 = c0205a.f3785d;
                    if (i < i7 + i8) {
                        return -1;
                    }
                    i -= i8;
                } else if (i5 == 1) {
                    i += c0205a.f3785d;
                }
            }
            i4++;
        }
        return i;
    }

    public ColorStateList h() {
        C0325k c0325k = (C0325k) this.f3791e;
        if (c0325k != null) {
            return (ColorStateList) c0325k.f6368c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        C0325k c0325k = (C0325k) this.f3791e;
        if (c0325k != null) {
            return (PorterDuff.Mode) c0325k.f6369d;
        }
        return null;
    }

    public boolean j() {
        return ((ArrayList) this.f3789c).size() > 0;
    }

    public void k(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = (View) this.f3788b;
        Context context = view.getContext();
        int[] iArr = AbstractC0336a.f6444z;
        R0.h l4 = R0.h.l(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) l4.f1414b;
        View view2 = (View) this.f3788b;
        Context context2 = view2.getContext();
        WeakHashMap weakHashMap = O.X.f1226a;
        O.S.d(view2, context2, iArr, attributeSet, (TypedArray) l4.f1414b, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f3787a = typedArray.getResourceId(0, -1);
                C0487t c0487t = (C0487t) this.f3789c;
                Context context3 = view.getContext();
                int i4 = this.f3787a;
                synchronized (c0487t) {
                    f2 = c0487t.f7745a.f(context3, i4);
                }
                if (f2 != null) {
                    r(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                O.L.q(view, l4.e(1));
            }
            if (typedArray.hasValue(2)) {
                O.L.r(view, AbstractC0463g0.c(typedArray.getInt(2, -1), null));
            }
            l4.n();
        } catch (Throwable th) {
            l4.n();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, androidx.recyclerview.widget.a] */
    public C0205a l(int i, int i4, int i5, Object obj) {
        C0205a c0205a = (C0205a) ((N.c) this.f3788b).a();
        if (c0205a != null) {
            c0205a.f3782a = i;
            c0205a.f3783b = i4;
            c0205a.f3785d = i5;
            c0205a.f3784c = obj;
            return c0205a;
        }
        ?? obj2 = new Object();
        obj2.f3782a = i;
        obj2.f3783b = i4;
        obj2.f3785d = i5;
        obj2.f3784c = obj;
        return obj2;
    }

    public void m() {
        this.f3787a = -1;
        r(null);
        a();
    }

    public void n(int i) {
        ColorStateList colorStateList;
        this.f3787a = i;
        C0487t c0487t = (C0487t) this.f3789c;
        if (c0487t != null) {
            Context context = ((View) this.f3788b).getContext();
            synchronized (c0487t) {
                colorStateList = c0487t.f7745a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        r(colorStateList);
        a();
    }

    public void o(C0205a c0205a) {
        ((ArrayList) this.f3790d).add(c0205a);
        int i = c0205a.f3782a;
        C0216f0 c0216f0 = (C0216f0) this.f3791e;
        if (i == 1) {
            c0216f0.d(c0205a.f3783b, c0205a.f3785d);
            return;
        }
        if (i == 2) {
            int i4 = c0205a.f3783b;
            int i5 = c0205a.f3785d;
            RecyclerView recyclerView = c0216f0.f3809a;
            recyclerView.U(i4, i5, false);
            recyclerView.f3691k0 = true;
            return;
        }
        if (i == 4) {
            c0216f0.c(c0205a.f3783b, c0205a.f3785d, c0205a.f3784c);
        } else if (i == 8) {
            c0216f0.e(c0205a.f3783b, c0205a.f3785d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0205a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0121 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p() {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0207b.p():void");
    }

    public void q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0205a c0205a = (C0205a) arrayList.get(i);
            c0205a.f3784c = null;
            ((N.c) this.f3788b).c(c0205a);
        }
        arrayList.clear();
    }

    public void r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C0325k) this.f3790d) == null) {
                this.f3790d = new Object();
            }
            C0325k c0325k = (C0325k) this.f3790d;
            c0325k.f6368c = colorStateList;
            c0325k.f6367b = true;
        } else {
            this.f3790d = null;
        }
        a();
    }

    public void s(ColorStateList colorStateList) {
        if (((C0325k) this.f3791e) == null) {
            this.f3791e = new Object();
        }
        C0325k c0325k = (C0325k) this.f3791e;
        c0325k.f6368c = colorStateList;
        c0325k.f6367b = true;
        a();
    }

    public void t(PorterDuff.Mode mode) {
        if (((C0325k) this.f3791e) == null) {
            this.f3791e = new Object();
        }
        C0325k c0325k = (C0325k) this.f3791e;
        c0325k.f6369d = mode;
        c0325k.f6366a = true;
        a();
    }

    public int u(int i, int i4) {
        int i5;
        int i6;
        ArrayList arrayList = (ArrayList) this.f3790d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0205a c0205a = (C0205a) arrayList.get(size);
            int i7 = c0205a.f3782a;
            if (i7 == 8) {
                int i8 = c0205a.f3783b;
                int i9 = c0205a.f3785d;
                if (i8 < i9) {
                    i6 = i8;
                    i5 = i9;
                } else {
                    i5 = i8;
                    i6 = i9;
                }
                if (i < i6 || i > i5) {
                    if (i < i8) {
                        if (i4 == 1) {
                            c0205a.f3783b = i8 + 1;
                            c0205a.f3785d = i9 + 1;
                        } else if (i4 == 2) {
                            c0205a.f3783b = i8 - 1;
                            c0205a.f3785d = i9 - 1;
                        }
                    }
                } else if (i6 == i8) {
                    if (i4 == 1) {
                        c0205a.f3785d = i9 + 1;
                    } else if (i4 == 2) {
                        c0205a.f3785d = i9 - 1;
                    }
                    i++;
                } else {
                    if (i4 == 1) {
                        c0205a.f3783b = i8 + 1;
                    } else if (i4 == 2) {
                        c0205a.f3783b = i8 - 1;
                    }
                    i--;
                }
            } else {
                int i10 = c0205a.f3783b;
                if (i10 <= i) {
                    if (i7 == 1) {
                        i -= c0205a.f3785d;
                    } else if (i7 == 2) {
                        i += c0205a.f3785d;
                    }
                } else if (i4 == 1) {
                    c0205a.f3783b = i10 + 1;
                } else if (i4 == 2) {
                    c0205a.f3783b = i10 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0205a c0205a2 = (C0205a) arrayList.get(size2);
            int i11 = c0205a2.f3782a;
            N.c cVar = (N.c) this.f3788b;
            if (i11 == 8) {
                int i12 = c0205a2.f3785d;
                if (i12 == c0205a2.f3783b || i12 < 0) {
                    arrayList.remove(size2);
                    c0205a2.f3784c = null;
                    cVar.c(c0205a2);
                }
            } else if (c0205a2.f3785d <= 0) {
                arrayList.remove(size2);
                c0205a2.f3784c = null;
                cVar.c(c0205a2);
            }
        }
        return i;
    }

    public C0207b(C0216f0 c0216f0) {
        this.f3788b = new N.c(30);
        this.f3789c = new ArrayList();
        this.f3790d = new ArrayList();
        this.f3787a = 0;
        this.f3791e = c0216f0;
        this.f3792f = new C0209c(this);
    }
}
