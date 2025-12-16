package Q0;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1350a;

    /* renamed from: b, reason: collision with root package name */
    public double f1351b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1352c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1353d;

    public a(Context context) {
        this.f1350a = context;
        Bitmap.Config[] configArr = W0.f.f1887a;
        double d4 = 0.2d;
        try {
            Object systemService = D.h.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            if (((ActivityManager) systemService).isLowRamDevice()) {
                d4 = 0.15d;
            }
        } catch (Exception unused) {
        }
        this.f1351b = d4;
        this.f1352c = true;
        this.f1353d = true;
    }

    public final d a() {
        A.a aVar;
        h hVar;
        int i;
        int i4;
        i hVar2 = this.f1353d ? new L.h() : new E2.e(6);
        if (this.f1352c) {
            double d4 = this.f1351b;
            if (d4 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                Context context = this.f1350a;
                Bitmap.Config[] configArr = W0.f.f1887a;
                try {
                    Object systemService = D.h.getSystemService(context, ActivityManager.class);
                    Intrinsics.checkNotNull(systemService);
                    ActivityManager activityManager = (ActivityManager) systemService;
                    i4 = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused) {
                    i4 = 256;
                }
                double d5 = 1024;
                i = (int) (d4 * i4 * d5 * d5);
            } else {
                i = 0;
            }
            if (i > 0) {
                hVar = new F.i(i, hVar2);
                return new d(hVar, hVar2);
            }
            aVar = new A.a(hVar2, 12);
        } else {
            aVar = new A.a(hVar2, 12);
        }
        hVar = aVar;
        return new d(hVar, hVar2);
    }
}
