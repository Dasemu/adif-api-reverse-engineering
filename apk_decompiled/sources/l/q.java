package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import k.InterfaceC0406c;

/* loaded from: classes.dex */
public final class q extends FrameLayout implements InterfaceC0406c {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f7294a;

    /* JADX WARN: Multi-variable type inference failed */
    public q(View view) {
        super(view.getContext());
        this.f7294a = (CollapsibleActionView) view;
        addView(view);
    }
}
