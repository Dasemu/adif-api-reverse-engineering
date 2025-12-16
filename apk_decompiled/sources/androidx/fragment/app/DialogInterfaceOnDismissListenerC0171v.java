package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0171v implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0174y f3248a;

    public DialogInterfaceOnDismissListenerC0171v(DialogInterfaceOnCancelListenerC0174y dialogInterfaceOnCancelListenerC0174y) {
        this.f3248a = dialogInterfaceOnCancelListenerC0174y;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        DialogInterfaceOnCancelListenerC0174y dialogInterfaceOnCancelListenerC0174y = this.f3248a;
        dialog = dialogInterfaceOnCancelListenerC0174y.mDialog;
        if (dialog != null) {
            dialog2 = dialogInterfaceOnCancelListenerC0174y.mDialog;
            dialogInterfaceOnCancelListenerC0174y.onDismiss(dialog2);
        }
    }
}
