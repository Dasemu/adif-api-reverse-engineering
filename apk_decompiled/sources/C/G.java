package C;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationManager f231a;

    static {
        new HashSet();
    }

    public G(Context context) {
        this.f231a = (NotificationManager) context.getSystemService("notification");
    }
}
