package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import l.C0432j;

/* loaded from: classes.dex */
public final class B0 extends C0475m0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f7502m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7503n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0498y0 f7504o;
    public l.o p;

    public B0(Context context, boolean z3) {
        super(context, z3);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f7502m = 21;
            this.f7503n = 22;
        } else {
            this.f7502m = 22;
            this.f7503n = 21;
        }
    }

    @Override // m.C0475m0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0432j c0432j;
        int i;
        int pointToPosition;
        int i4;
        if (this.f7504o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0432j = (C0432j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0432j = (C0432j) adapter;
                i = 0;
            }
            l.o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = pointToPosition - i) < 0 || i4 >= c0432j.getCount()) ? null : c0432j.getItem(i4);
            l.o oVar = this.p;
            if (oVar != item) {
                l.m mVar = c0432j.f7234a;
                if (oVar != null) {
                    this.f7504o.e(mVar, oVar);
                }
                this.p = item;
                if (item != null) {
                    this.f7504o.m(mVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f7502m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f7503n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0432j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0432j) adapter).f7234a.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0498y0 interfaceC0498y0) {
        this.f7504o = interfaceC0498y0;
    }

    @Override // m.C0475m0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
