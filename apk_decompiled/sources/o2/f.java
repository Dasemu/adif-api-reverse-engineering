package o2;

import android.app.Dialog;
import android.os.Bundle;
import g.H;

/* loaded from: classes3.dex */
public class f extends H {
    private boolean waitingForDismissAllowingStateLoss;

    public static void access$100(f fVar) {
        if (fVar.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y
    public void dismiss() {
        Dialog dialog = getDialog();
        if (dialog instanceof e) {
            e eVar = (e) dialog;
            if (eVar.f8092f == null) {
                eVar.f();
            }
            boolean z3 = eVar.f8092f.f5545I;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y
    public void dismissAllowingStateLoss() {
        Dialog dialog = getDialog();
        if (dialog instanceof e) {
            e eVar = (e) dialog;
            if (eVar.f8092f == null) {
                eVar.f();
            }
            boolean z3 = eVar.f8092f.f5545I;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // g.H, androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y
    public Dialog onCreateDialog(Bundle bundle) {
        return new e(getContext(), getTheme());
    }
}
