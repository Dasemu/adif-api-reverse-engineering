package l;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class u implements InterfaceC0420C, y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f7301a;

    public static int o(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i4 = 0;
        int i5 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = listAdapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i6, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
        }
        return i4;
    }

    public static boolean w(m mVar) {
        int size = mVar.f7246f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = mVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // l.y
    public final boolean g(o oVar) {
        return false;
    }

    @Override // l.y
    public final int getId() {
        return 0;
    }

    @Override // l.y
    public final void i(Context context, m mVar) {
    }

    @Override // l.y
    public final boolean m(o oVar) {
        return false;
    }

    public abstract void n(m mVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0432j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0432j) listAdapter).f7234a.q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC0429g) ? 0 : 4);
    }

    public abstract void p(View view);

    public abstract void q(boolean z3);

    public abstract void r(int i);

    public abstract void s(int i);

    public abstract void t(PopupWindow.OnDismissListener onDismissListener);

    public abstract void u(boolean z3);

    public abstract void v(int i);
}
