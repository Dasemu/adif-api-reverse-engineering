package C;

import android.app.Notification;
import android.content.LocusId;

/* loaded from: classes.dex */
public abstract class D {
    public static Notification.Builder a(Notification.Builder builder, boolean z3) {
        return builder.setAllowSystemGeneratedContextualActions(z3);
    }

    public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z3) {
        return builder.setContextual(z3);
    }

    public static Notification.Builder d(Notification.Builder builder, Object obj) {
        return builder.setLocusId((LocusId) obj);
    }
}
