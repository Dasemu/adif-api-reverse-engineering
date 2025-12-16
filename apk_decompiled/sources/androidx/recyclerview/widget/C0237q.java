package androidx.recyclerview.widget;

import O.C0079u;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237q extends AbstractC0230m0 {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f3873s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3874g;
    public ArrayList h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f3875j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3876k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3877l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f3878m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f3879n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f3880o;
    public ArrayList p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f3881q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f3882r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((I0) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [androidx.recyclerview.widget.o, java.lang.Object] */
    @Override // androidx.recyclerview.widget.AbstractC0230m0
    public final boolean a(I0 i02, I0 i03, C0079u c0079u, C0079u c0079u2) {
        int i;
        int i4;
        int i5 = c0079u.f1298a;
        int i6 = c0079u.f1299b;
        if (i03.shouldIgnore()) {
            int i7 = c0079u.f1298a;
            i4 = c0079u.f1299b;
            i = i7;
        } else {
            i = c0079u2.f1298a;
            i4 = c0079u2.f1299b;
        }
        if (i02 == i03) {
            return g(i02, i5, i6, i, i4);
        }
        float translationX = i02.itemView.getTranslationX();
        float translationY = i02.itemView.getTranslationY();
        float alpha = i02.itemView.getAlpha();
        l(i02);
        i02.itemView.setTranslationX(translationX);
        i02.itemView.setTranslationY(translationY);
        i02.itemView.setAlpha(alpha);
        l(i03);
        i03.itemView.setTranslationX(-((int) ((i - i5) - translationX)));
        i03.itemView.setTranslationY(-((int) ((i4 - i6) - translationY)));
        i03.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        ArrayList arrayList = this.f3876k;
        ?? obj = new Object();
        obj.f3856a = i02;
        obj.f3857b = i03;
        obj.f3858c = i5;
        obj.f3859d = i6;
        obj.f3860e = i;
        obj.f3861f = i4;
        arrayList.add(obj);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0230m0
    public final void d(I0 i02) {
        View view = i02.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.f3875j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0235p) arrayList.get(size)).f3864a == i02) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                c(i02);
                arrayList.remove(size);
            }
        }
        j(this.f3876k, i02);
        if (this.h.remove(i02)) {
            view.setAlpha(1.0f);
            c(i02);
        }
        if (this.i.remove(i02)) {
            view.setAlpha(1.0f);
            c(i02);
        }
        ArrayList arrayList2 = this.f3879n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, i02);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f3878m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0235p) arrayList5.get(size4)).f3864a == i02) {
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    c(i02);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f3877l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(i02)) {
                view.setAlpha(1.0f);
                c(i02);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f3881q.remove(i02);
        this.f3880o.remove(i02);
        this.f3882r.remove(i02);
        this.p.remove(i02);
        i();
    }

    @Override // androidx.recyclerview.widget.AbstractC0230m0
    public final void e() {
        ArrayList arrayList = this.f3875j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0235p c0235p = (C0235p) arrayList.get(size);
            View view = c0235p.f3864a.itemView;
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            c(c0235p.f3864a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((I0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            I0 i02 = (I0) arrayList3.get(size3);
            i02.itemView.setAlpha(1.0f);
            c(i02);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f3876k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0233o c0233o = (C0233o) arrayList4.get(size4);
            I0 i03 = c0233o.f3856a;
            if (i03 != null) {
                k(c0233o, i03);
            }
            I0 i04 = c0233o.f3857b;
            if (i04 != null) {
                k(c0233o, i04);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f3878m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0235p c0235p2 = (C0235p) arrayList6.get(size6);
                    View view2 = c0235p2.f3864a.itemView;
                    view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    c(c0235p2.f3864a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f3877l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    I0 i05 = (I0) arrayList8.get(size8);
                    i05.itemView.setAlpha(1.0f);
                    c(i05);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f3879n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0233o c0233o2 = (C0233o) arrayList10.get(size10);
                    I0 i06 = c0233o2.f3856a;
                    if (i06 != null) {
                        k(c0233o2, i06);
                    }
                    I0 i07 = c0233o2.f3857b;
                    if (i07 != null) {
                        k(c0233o2, i07);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f3881q);
            h(this.p);
            h(this.f3880o);
            h(this.f3882r);
            ArrayList arrayList11 = this.f3846b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0230m0
    public final boolean f() {
        return (this.i.isEmpty() && this.f3876k.isEmpty() && this.f3875j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.f3881q.isEmpty() && this.f3880o.isEmpty() && this.f3882r.isEmpty() && this.f3878m.isEmpty() && this.f3877l.isEmpty() && this.f3879n.isEmpty()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.p, java.lang.Object] */
    public final boolean g(I0 i02, int i, int i4, int i5, int i6) {
        View view = i02.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i4 + ((int) i02.itemView.getTranslationY());
        l(i02);
        int i7 = i5 - translationX;
        int i8 = i6 - translationY;
        if (i7 == 0 && i8 == 0) {
            c(i02);
            return false;
        }
        if (i7 != 0) {
            view.setTranslationX(-i7);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        ArrayList arrayList = this.f3875j;
        ?? obj = new Object();
        obj.f3864a = i02;
        obj.f3865b = translationX;
        obj.f3866c = translationY;
        obj.f3867d = i5;
        obj.f3868e = i6;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f3846b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, I0 i02) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0233o c0233o = (C0233o) arrayList.get(size);
            if (k(c0233o, i02) && c0233o.f3856a == null && c0233o.f3857b == null) {
                arrayList.remove(c0233o);
            }
        }
    }

    public final boolean k(C0233o c0233o, I0 i02) {
        if (c0233o.f3857b == i02) {
            c0233o.f3857b = null;
        } else {
            if (c0233o.f3856a != i02) {
                return false;
            }
            c0233o.f3856a = null;
        }
        i02.itemView.setAlpha(1.0f);
        i02.itemView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        i02.itemView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        c(i02);
        return true;
    }

    public final void l(I0 i02) {
        if (f3873s == null) {
            f3873s = new ValueAnimator().getInterpolator();
        }
        i02.itemView.animate().setInterpolator(f3873s);
        d(i02);
    }
}
