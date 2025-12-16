package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356c implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0360g f6599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0357d f6600b;

    public C0356c(C0357d c0357d, C0360g c0360g) {
        this.f6600b = c0357d;
        this.f6599a = c0360g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        C0357d c0357d = this.f6600b;
        DialogInterface.OnClickListener onClickListener = c0357d.p;
        C0360g c0360g = this.f6599a;
        onClickListener.onClick(c0360g.f6625b, i);
        if (c0357d.f6615r) {
            return;
        }
        c0360g.f6625b.dismiss();
    }
}
