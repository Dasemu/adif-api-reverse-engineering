package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0170u implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0174y f3243a;

    public DialogInterfaceOnCancelListenerC0170u(DialogInterfaceOnCancelListenerC0174y dialogInterfaceOnCancelListenerC0174y) {
        this.f3243a = dialogInterfaceOnCancelListenerC0174y;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        DialogInterfaceOnCancelListenerC0174y dialogInterfaceOnCancelListenerC0174y = this.f3243a;
        dialog = dialogInterfaceOnCancelListenerC0174y.mDialog;
        if (dialog != null) {
            dialog2 = dialogInterfaceOnCancelListenerC0174y.mDialog;
            dialogInterfaceOnCancelListenerC0174y.onCancel(dialog2);
        }
    }
}
