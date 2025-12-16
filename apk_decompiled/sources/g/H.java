package g;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y;

/* loaded from: classes.dex */
public class H extends DialogInterfaceOnCancelListenerC0174y {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC0353G(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0174y
    public void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof DialogC0353G)) {
            super.setupDialog(dialog, i);
            return;
        }
        DialogC0353G dialogC0353G = (DialogC0353G) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialogC0353G.c().h(1);
    }
}
