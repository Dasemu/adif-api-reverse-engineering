package C;

import android.app.NotificationManager;

/* loaded from: classes.dex */
public abstract class F {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static int b(NotificationManager notificationManager) {
        return notificationManager.getImportance();
    }
}
