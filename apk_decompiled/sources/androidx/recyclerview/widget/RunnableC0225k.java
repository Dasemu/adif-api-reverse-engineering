package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0225k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0237q f3833c;

    public /* synthetic */ RunnableC0225k(C0237q c0237q, ArrayList arrayList, int i) {
        this.f3831a = i;
        this.f3833c = c0237q;
        this.f3832b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3831a) {
            case 0:
                ArrayList arrayList = this.f3832b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    C0237q c0237q = this.f3833c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0237q.f3878m.remove(arrayList);
                        return;
                    }
                    C0235p c0235p = (C0235p) it.next();
                    I0 i02 = c0235p.f3864a;
                    c0237q.getClass();
                    View view = i02.itemView;
                    int i = c0235p.f3867d - c0235p.f3865b;
                    int i4 = c0235p.f3868e - c0235p.f3866c;
                    if (i != 0) {
                        view.animate().translationX(BitmapDescriptorFactory.HUE_RED);
                    }
                    if (i4 != 0) {
                        view.animate().translationY(BitmapDescriptorFactory.HUE_RED);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    c0237q.p.add(i02);
                    animate.setDuration(c0237q.f3849e).setListener(new C0229m(c0237q, i02, i, view, i4, animate)).start();
                }
            case 1:
                ArrayList arrayList2 = this.f3832b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    C0237q c0237q2 = this.f3833c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0237q2.f3879n.remove(arrayList2);
                        return;
                    }
                    C0233o c0233o = (C0233o) it2.next();
                    c0237q2.getClass();
                    I0 i03 = c0233o.f3856a;
                    View view2 = i03 == null ? null : i03.itemView;
                    I0 i04 = c0233o.f3857b;
                    View view3 = i04 != null ? i04.itemView : null;
                    ArrayList arrayList3 = c0237q2.f3882r;
                    long j4 = c0237q2.f3850f;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j4);
                        arrayList3.add(c0233o.f3856a);
                        duration.translationX(c0233o.f3860e - c0233o.f3858c);
                        duration.translationY(c0233o.f3861f - c0233o.f3859d);
                        duration.alpha(BitmapDescriptorFactory.HUE_RED).setListener(new C0231n(c0237q2, c0233o, duration, view2, 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator animate2 = view3.animate();
                        arrayList3.add(c0233o.f3857b);
                        animate2.translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).setDuration(j4).alpha(1.0f).setListener(new C0231n(c0237q2, c0233o, animate2, view3, 1)).start();
                    }
                }
            default:
                ArrayList arrayList4 = this.f3832b;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it3.hasNext();
                    C0237q c0237q3 = this.f3833c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0237q3.f3877l.remove(arrayList4);
                        return;
                    }
                    I0 i05 = (I0) it3.next();
                    c0237q3.getClass();
                    View view4 = i05.itemView;
                    ViewPropertyAnimator animate3 = view4.animate();
                    c0237q3.f3880o.add(i05);
                    animate3.alpha(1.0f).setDuration(c0237q3.f3847c).setListener(new C0227l(c0237q3, i05, view4, animate3)).start();
                }
        }
    }
}
