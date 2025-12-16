package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
import kotlin.io.ConstantsKt;
import l.C0423a;

/* loaded from: classes.dex */
public final class U0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0423a f7621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V0 f7622b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.a] */
    public U0(V0 v02) {
        this.f7622b = v02;
        Context context = v02.f7624a.getContext();
        CharSequence charSequence = v02.h;
        ?? obj = new Object();
        obj.f7184e = ConstantsKt.DEFAULT_BLOCK_SIZE;
        obj.f7186g = ConstantsKt.DEFAULT_BLOCK_SIZE;
        obj.f7189l = null;
        obj.f7190m = null;
        obj.f7191n = false;
        obj.f7192o = false;
        obj.p = 16;
        obj.i = context;
        obj.f7180a = charSequence;
        this.f7621a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        V0 v02 = this.f7622b;
        Window.Callback callback = v02.f7632k;
        if (callback == null || !v02.f7633l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f7621a);
    }
}
