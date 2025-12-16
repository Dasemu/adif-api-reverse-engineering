package D;

import C.AbstractC0044h;
import C.AbstractC0049m;
import C.F;
import C.G;
import C.w;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class h {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    public static int checkSelfPermission(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : F.a(new G(context).f231a) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static Context createAttributionContext(Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? f.a(context, str) : context;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return c.a(context);
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.b(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return a.a(context);
    }

    public static int getColor(Context context, int i) {
        return b.a(context, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f494c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList getColorStateList(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            F.m r1 = new F.m
            r1.<init>(r0, r8)
            java.lang.Object r2 = F.q.f505c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = F.q.f504b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            F.l r5 = (F.l) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f493b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f494c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f494c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f492a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = F.q.f503a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = F.c.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = F.q.f505c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = F.q.f504b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            F.l r0 = new F.l     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.f495a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = F.k.b(r0, r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: D.h.getColorStateList(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static Context getContextForLanguage(Context context) {
        K.i a2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            Object systemService = context.getSystemService("locale");
            a2 = systemService != null ? new K.i(new K.j(AbstractC0049m.a(systemService))) : K.i.f971b;
        } else {
            a2 = K.i.a(AbstractC0044h.e(context));
        }
        if (i > 32 || a2.f972a.f973a.isEmpty()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        K.f.b(configuration, a2);
        return context.createConfigurationContext(configuration);
    }

    public static File getDataDir(Context context) {
        return c.b(context);
    }

    public static Display getDisplayOrDefault(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? f.c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i) {
        return a.b(context, i);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor getMainExecutor(Context context) {
        return e.a(context);
    }

    public static File getNoBackupFilesDir(Context context) {
        return a.c(context);
    }

    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static String getString(Context context, int i) {
        return getContextForLanguage(context).getString(i);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) b.b(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return b.c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return c.c(context);
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (m3.l.i(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(w.o("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        d.b(context, intent);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        int i4 = i & 1;
        if (i4 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i4 != 0) {
            i |= 2;
        }
        int i5 = i;
        int i6 = i5 & 2;
        if (i6 == 0 && (i5 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i6 != 0 && (i5 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return g.a(context, broadcastReceiver, intentFilter, str, handler, i5);
        }
        return d.a(context, broadcastReceiver, intentFilter, str, handler, i5);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
