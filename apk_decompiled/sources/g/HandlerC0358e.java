package g;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0358e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f6617a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f6617a.get(), message.what);
        } else {
            if (i != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
