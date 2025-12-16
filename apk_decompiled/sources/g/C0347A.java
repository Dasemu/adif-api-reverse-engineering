package g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: g.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347A extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0348B f6476a;

    public C0347A(AbstractC0348B abstractC0348B) {
        this.f6476a = abstractC0348B;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f6476a.g();
    }
}
