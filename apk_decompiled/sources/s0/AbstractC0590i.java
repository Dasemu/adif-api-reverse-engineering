package s0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.l;
import f0.C0338b;

/* renamed from: s0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0590i {

    /* renamed from: a, reason: collision with root package name */
    public static final l f8385a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f8386b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C0338b f8387c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0588g.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C0338b b() {
        C0338b c0338b = new C0338b(17);
        f8387c = c0338b;
        f8385a.set(c0338b);
        return f8387c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:24|25|26|(2:64|65)(1:28)|29|(9:36|(1:40)|(1:47)|48|(2:56|57)|52|53|54|55)|(1:63)|(1:40)|(3:42|45|47)|48|(1:50)|56|57|52|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.AbstractC0590i.c(android.content.Context, boolean):void");
    }
}
