package m;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import k.InterfaceC0406c;
import l.SubMenuC0422E;

/* loaded from: classes.dex */
public final class Q0 implements l.y {

    /* renamed from: a, reason: collision with root package name */
    public l.m f7603a;

    /* renamed from: b, reason: collision with root package name */
    public l.o f7604b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f7605c;

    public Q0(Toolbar toolbar) {
        this.f7605c = toolbar;
    }

    @Override // l.y
    public final void b(l.m mVar, boolean z3) {
    }

    @Override // l.y
    public final void d(Parcelable parcelable) {
    }

    @Override // l.y
    public final boolean g(l.o oVar) {
        Toolbar toolbar = this.f7605c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = oVar.getActionView();
        toolbar.i = actionView;
        this.f7604b = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            R0 h = Toolbar.h();
            h.f7606a = (toolbar.f2491n & 112) | 8388611;
            h.f7607b = 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((R0) childAt.getLayoutParams()).f7607b != 2 && childAt != toolbar.f2480a) {
                toolbar.removeViewAt(childCount);
                toolbar.f2465E.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.f7267C = true;
        oVar.f7279n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0406c) {
            ((l.q) ((InterfaceC0406c) callback)).f7294a.onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // l.y
    public final int getId() {
        return 0;
    }

    @Override // l.y
    public final void h(boolean z3) {
        if (this.f7604b != null) {
            l.m mVar = this.f7603a;
            if (mVar != null) {
                int size = mVar.f7246f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f7603a.getItem(i) == this.f7604b) {
                        return;
                    }
                }
            }
            m(this.f7604b);
        }
    }

    @Override // l.y
    public final void i(Context context, l.m mVar) {
        l.o oVar;
        l.m mVar2 = this.f7603a;
        if (mVar2 != null && (oVar = this.f7604b) != null) {
            mVar2.d(oVar);
        }
        this.f7603a = mVar;
    }

    @Override // l.y
    public final boolean j() {
        return false;
    }

    @Override // l.y
    public final Parcelable k() {
        return null;
    }

    @Override // l.y
    public final boolean l(SubMenuC0422E subMenuC0422E) {
        return false;
    }

    @Override // l.y
    public final boolean m(l.o oVar) {
        Toolbar toolbar = this.f7605c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0406c) {
            ((l.q) ((InterfaceC0406c) callback)).f7294a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f2465E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f7604b = null;
        toolbar.requestLayout();
        oVar.f7267C = false;
        oVar.f7279n.p(false);
        toolbar.w();
        return true;
    }
}
