package androidx.fragment.app;

import android.app.Dialog;
import android.util.Log;
import android.view.View;

/* renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172w implements androidx.lifecycle.Y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0174y f3256a;

    public C0172w(DialogInterfaceOnCancelListenerC0174y dialogInterfaceOnCancelListenerC0174y) {
        this.f3256a = dialogInterfaceOnCancelListenerC0174y;
    }

    @Override // androidx.lifecycle.Y
    public final void onChanged(Object obj) {
        boolean z3;
        Dialog dialog;
        Dialog dialog2;
        Dialog dialog3;
        if (((androidx.lifecycle.J) obj) != null) {
            DialogInterfaceOnCancelListenerC0174y dialogInterfaceOnCancelListenerC0174y = this.f3256a;
            z3 = dialogInterfaceOnCancelListenerC0174y.mShowsDialog;
            if (z3) {
                View requireView = dialogInterfaceOnCancelListenerC0174y.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                dialog = dialogInterfaceOnCancelListenerC0174y.mDialog;
                if (dialog != null) {
                    if (AbstractC0158l0.M(3)) {
                        StringBuilder sb = new StringBuilder("DialogFragment ");
                        sb.append(this);
                        sb.append(" setting the content view on ");
                        dialog3 = dialogInterfaceOnCancelListenerC0174y.mDialog;
                        sb.append(dialog3);
                        Log.d("FragmentManager", sb.toString());
                    }
                    dialog2 = dialogInterfaceOnCancelListenerC0174y.mDialog;
                    dialog2.setContentView(requireView);
                }
            }
        }
    }
}
