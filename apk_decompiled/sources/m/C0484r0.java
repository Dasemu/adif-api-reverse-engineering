package m;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: m.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0484r0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0496x0 f7736a;

    public C0484r0(C0496x0 c0496x0) {
        this.f7736a = c0496x0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j4) {
        C0475m0 c0475m0;
        if (i == -1 || (c0475m0 = this.f7736a.f7762c) == null) {
            return;
        }
        c0475m0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
