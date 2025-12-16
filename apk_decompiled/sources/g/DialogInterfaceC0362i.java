package g;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.adif.elcanomovil.R;
import kotlin.KotlinVersion;

/* renamed from: g.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC0362i extends DialogC0353G implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    public final C0360g f6649f;

    public DialogInterfaceC0362i(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, f(contextThemeWrapper, i));
        this.f6649f = new C0360g(getContext(), this, getWindow());
    }

    public static int f(Context context, int i) {
        if (((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c8  */
    @Override // g.DialogC0353G, b.p, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.DialogInterfaceC0362i.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6649f.f6638r;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6649f.f6638r;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // g.DialogC0353G, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C0360g c0360g = this.f6649f;
        c0360g.f6627d = charSequence;
        TextView textView = c0360g.f6641u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
