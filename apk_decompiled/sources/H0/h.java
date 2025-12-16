package H0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0239r0;
import androidx.recyclerview.widget.InterfaceC0241s0;

/* loaded from: classes.dex */
public final class h implements InterfaceC0241s0 {
    @Override // androidx.recyclerview.widget.InterfaceC0241s0
    public final void a(View view) {
        C0239r0 c0239r0 = (C0239r0) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) c0239r0).width != -1 || ((ViewGroup.MarginLayoutParams) c0239r0).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC0241s0
    public final void b(View view) {
    }
}
