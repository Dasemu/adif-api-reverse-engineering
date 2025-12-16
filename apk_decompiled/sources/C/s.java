package C;

import android.app.Notification;

/* loaded from: classes.dex */
public final class s extends v {

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f247b;

    @Override // C.v
    public final void a(A.j jVar) {
        new Notification.BigTextStyle((Notification.Builder) jVar.f28b).setBigContentTitle(null).bigText(this.f247b);
    }

    @Override // C.v
    public final String d() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
