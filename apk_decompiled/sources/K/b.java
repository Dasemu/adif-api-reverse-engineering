package K;

import android.os.Build;
import kotlin.time.DurationKt;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f966a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        a aVar = a.f965a;
        if (i >= 30) {
            aVar.a(30);
        }
        if (i >= 30) {
            aVar.a(31);
        }
        if (i >= 30) {
            aVar.a(33);
        }
        if (i >= 30) {
            aVar.a(DurationKt.NANOS_IN_MILLIS);
        }
    }
}
