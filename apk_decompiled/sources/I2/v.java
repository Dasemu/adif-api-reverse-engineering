package I2;

import android.view.View;
import android.widget.AdapterView;
import m.C0496x0;
import m.K;
import m.N;

/* loaded from: classes3.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f898b;

    public /* synthetic */ v(Object obj, int i) {
        this.f897a = i;
        this.f898b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        Object item;
        switch (this.f897a) {
            case 0:
                x xVar = (x) this.f898b;
                if (i < 0) {
                    C0496x0 c0496x0 = xVar.f902e;
                    item = !c0496x0.f7782z.isShowing() ? null : c0496x0.f7762c.getSelectedItem();
                } else {
                    item = xVar.getAdapter().getItem(i);
                }
                x.a(xVar, item);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                C0496x0 c0496x02 = xVar.f902e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = c0496x02.f7782z.isShowing() ? c0496x02.f7762c.getSelectedView() : null;
                        i = !c0496x02.f7782z.isShowing() ? -1 : c0496x02.f7762c.getSelectedItemPosition();
                        j4 = !c0496x02.f7782z.isShowing() ? Long.MIN_VALUE : c0496x02.f7762c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c0496x02.f7762c, view, i, j4);
                }
                c0496x02.dismiss();
                return;
            default:
                K k4 = (K) this.f898b;
                k4.f7580E.setSelection(i);
                N n4 = k4.f7580E;
                if (n4.getOnItemClickListener() != null) {
                    n4.performItemClick(view, i, k4.f7577B.getItemId(i));
                }
                k4.dismiss();
                return;
        }
    }
}
