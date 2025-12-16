package B0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class A implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public x f86a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f87b;

    /* JADX WARN: Removed duplicated region for block: B:111:0x01de A[EDGE_INSN: B:111:0x01de->B:112:0x01de BREAK  A[LOOP:1: B:15:0x0088->B:27:0x01d7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.A.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f87b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = B.f90c;
        ViewGroup viewGroup2 = this.f87b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) B.b().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((x) it.next()).C(viewGroup2);
            }
        }
        this.f86a.i(true);
    }
}
