package c1;

import C.AbstractC0043g;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import com.adif.elcanomovil.R;
import com.adif.elcanomovil.uiAvisa.components.create.y;
import d.AbstractC0294c;
import g.AbstractActivityC0364k;
import g.C0357d;
import g.C0361h;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283c {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0294c f4231a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f4232b;

    /* renamed from: c, reason: collision with root package name */
    public y f4233c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f4234d = new Handler(Looper.getMainLooper());

    /* JADX WARN: Type inference failed for: r5v3, types: [c1.b] */
    public final void a(final y yVar) {
        AbstractActivityC0364k abstractActivityC0364k;
        AbstractActivityC0364k abstractActivityC0364k2;
        if (Build.VERSION.SDK_INT < 33) {
            y yVar2 = this.f4233c;
            this.f4233c = null;
            this.f4234d.post(new com.google.firebase.installations.a(true, 2, yVar2));
            return;
        }
        WeakReference weakReference = this.f4232b;
        if (weakReference == null || (abstractActivityC0364k = (AbstractActivityC0364k) weakReference.get()) == null) {
            return;
        }
        if (!AbstractC0043g.a(abstractActivityC0364k, "android.permission.POST_NOTIFICATIONS")) {
            this.f4233c = yVar;
            AbstractC0294c abstractC0294c = this.f4231a;
            if (abstractC0294c != null) {
                abstractC0294c.a("android.permission.POST_NOTIFICATIONS");
                return;
            }
            return;
        }
        WeakReference weakReference2 = this.f4232b;
        if (weakReference2 == null || (abstractActivityC0364k2 = (AbstractActivityC0364k) weakReference2.get()) == null) {
            return;
        }
        C0361h c0361h = new C0361h(abstractActivityC0364k2);
        C0357d c0357d = c0361h.f6647a;
        c0357d.f6604d = c0357d.f6601a.getText(R.string.notification_permission_rationale_title);
        ContextThemeWrapper contextThemeWrapper = c0357d.f6601a;
        c0357d.f6606f = contextThemeWrapper.getText(R.string.notification_permission_rationale_message);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: c1.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C0283c this$0 = C0283c.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f4233c = yVar;
                AbstractC0294c abstractC0294c2 = this$0.f4231a;
                if (abstractC0294c2 != null) {
                    abstractC0294c2.a("android.permission.POST_NOTIFICATIONS");
                }
            }
        };
        c0357d.f6607g = contextThemeWrapper.getText(R.string.dialog_action_accept);
        c0357d.h = onClickListener;
        c0357d.f6611m = new DialogInterface.OnDismissListener() { // from class: c1.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C0283c this$0 = C0283c.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                y yVar3 = this$0.f4233c;
                this$0.f4233c = null;
                this$0.f4234d.post(new com.google.firebase.installations.a(false, 2, yVar3));
            }
        };
        c0361h.a().show();
    }
}
