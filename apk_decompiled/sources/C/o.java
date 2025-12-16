package C;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f237a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f238b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f239c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f240d;

    /* renamed from: e, reason: collision with root package name */
    public final int f241e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f242f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f243g;

    public o(int i, String str, PendingIntent pendingIntent) {
        IconCompat a2 = i == 0 ? null : IconCompat.a(i);
        Bundle bundle = new Bundle();
        this.f240d = true;
        this.f238b = a2;
        if (a2 != null) {
            int i4 = a2.f2784a;
            if ((i4 == -1 ? H.e.c(a2.f2785b) : i4) == 2) {
                this.f241e = a2.b();
            }
        }
        this.f242f = u.b(str);
        this.f243g = pendingIntent;
        this.f237a = bundle;
        this.f239c = true;
        this.f240d = true;
    }
}
