package l;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class v implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f7302a;

    public v(w wVar) {
        this.f7302a = wVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f7302a.c();
    }
}
