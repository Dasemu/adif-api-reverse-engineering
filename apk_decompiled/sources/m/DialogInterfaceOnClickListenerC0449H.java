package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0357d;
import g.C0361h;
import g.DialogInterfaceC0362i;

/* renamed from: m.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0449H implements M, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0362i f7527a;

    /* renamed from: b, reason: collision with root package name */
    public I f7528b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f7529c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f7530d;

    public DialogInterfaceOnClickListenerC0449H(N n4) {
        this.f7530d = n4;
    }

    @Override // m.M
    public final boolean a() {
        DialogInterfaceC0362i dialogInterfaceC0362i = this.f7527a;
        if (dialogInterfaceC0362i != null) {
            return dialogInterfaceC0362i.isShowing();
        }
        return false;
    }

    @Override // m.M
    public final int b() {
        return 0;
    }

    @Override // m.M
    public final Drawable d() {
        return null;
    }

    @Override // m.M
    public final void dismiss() {
        DialogInterfaceC0362i dialogInterfaceC0362i = this.f7527a;
        if (dialogInterfaceC0362i != null) {
            dialogInterfaceC0362i.dismiss();
            this.f7527a = null;
        }
    }

    @Override // m.M
    public final void g(CharSequence charSequence) {
        this.f7529c = charSequence;
    }

    @Override // m.M
    public final void h(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // m.M
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.M
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // m.M
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // m.M
    public final void l(int i, int i4) {
        if (this.f7528b == null) {
            return;
        }
        N n4 = this.f7530d;
        C0361h c0361h = new C0361h(n4.getPopupContext());
        CharSequence charSequence = this.f7529c;
        C0357d c0357d = c0361h.f6647a;
        if (charSequence != null) {
            c0357d.f6604d = charSequence;
        }
        I i5 = this.f7528b;
        int selectedItemPosition = n4.getSelectedItemPosition();
        c0357d.f6613o = i5;
        c0357d.p = this;
        c0357d.f6616s = selectedItemPosition;
        c0357d.f6615r = true;
        DialogInterfaceC0362i a2 = c0361h.a();
        this.f7527a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f6649f.f6629f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i4);
        this.f7527a.show();
    }

    @Override // m.M
    public final int n() {
        return 0;
    }

    @Override // m.M
    public final CharSequence o() {
        return this.f7529c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        N n4 = this.f7530d;
        n4.setSelection(i);
        if (n4.getOnItemClickListener() != null) {
            n4.performItemClick(null, i, this.f7528b.getItemId(i));
        }
        dismiss();
    }

    @Override // m.M
    public final void p(ListAdapter listAdapter) {
        this.f7528b = (I) listAdapter;
    }
}
