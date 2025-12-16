package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: l.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0432j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final m f7234a;

    /* renamed from: b, reason: collision with root package name */
    public int f7235b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7236c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7237d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f7238e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7239f;

    public C0432j(m mVar, LayoutInflater layoutInflater, boolean z3, int i) {
        this.f7237d = z3;
        this.f7238e = layoutInflater;
        this.f7234a = mVar;
        this.f7239f = i;
        a();
    }

    public final void a() {
        m mVar = this.f7234a;
        o oVar = mVar.f7259v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f7248j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f7235b = i;
                    return;
                }
            }
        }
        this.f7235b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i) {
        ArrayList l4;
        m mVar = this.f7234a;
        if (this.f7237d) {
            mVar.i();
            l4 = mVar.f7248j;
        } else {
            l4 = mVar.l();
        }
        int i4 = this.f7235b;
        if (i4 >= 0 && i >= i4) {
            i++;
        }
        return (o) l4.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l4;
        m mVar = this.f7234a;
        if (this.f7237d) {
            mVar.i();
            l4 = mVar.f7248j;
        } else {
            l4 = mVar.l();
        }
        return this.f7235b < 0 ? l4.size() : l4.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z3 = false;
        if (view == null) {
            view = this.f7238e.inflate(this.f7239f, viewGroup, false);
        }
        int i4 = getItem(i).f7269b;
        int i5 = i - 1;
        int i6 = i5 >= 0 ? getItem(i5).f7269b : i4;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f7234a.m() && i4 != i6) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        z zVar = (z) view;
        if (this.f7236c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
