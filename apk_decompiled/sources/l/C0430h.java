package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.adif.elcanomovil.R;
import java.util.ArrayList;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f7226a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0431i f7227b;

    public C0430h(C0431i c0431i) {
        this.f7227b = c0431i;
        a();
    }

    public final void a() {
        m mVar = this.f7227b.f7230c;
        o oVar = mVar.f7259v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f7248j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f7226a = i;
                    return;
                }
            }
        }
        this.f7226a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i) {
        C0431i c0431i = this.f7227b;
        m mVar = c0431i.f7230c;
        mVar.i();
        ArrayList arrayList = mVar.f7248j;
        c0431i.getClass();
        int i4 = this.f7226a;
        if (i4 >= 0 && i >= i4) {
            i++;
        }
        return (o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0431i c0431i = this.f7227b;
        m mVar = c0431i.f7230c;
        mVar.i();
        int size = mVar.f7248j.size();
        c0431i.getClass();
        return this.f7226a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f7227b.f7229b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((z) view).b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
