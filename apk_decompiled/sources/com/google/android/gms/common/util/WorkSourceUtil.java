package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@KeepForSdk
/* loaded from: classes3.dex */
public class WorkSourceUtil {
    private static final int zza;
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;

    /* JADX WARN: Can't wrap try/catch for region: R(24:1|(2:2|3)|4|(21:49|50|7|8|9|10|11|12|13|(12:41|42|16|(9:36|37|19|(6:31|32|22|(2:27|28)|24|25)|21|22|(0)|24|25)|18|19|(0)|21|22|(0)|24|25)|15|16|(0)|18|19|(0)|21|22|(0)|24|25)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:1|2|3|4|(21:49|50|7|8|9|10|11|12|13|(12:41|42|16|(9:36|37|19|(6:31|32|22|(2:27|28)|24|25)|21|22|(0)|24|25)|18|19|(0)|21|22|(0)|24|25)|15|16|(0)|18|19|(0)|21|22|(0)|24|25)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0045, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0037, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            int r3 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r3
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[]{r1}     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Method r4 = r2.getMethod(r0, r4)     // Catch: java.lang.Exception -> L16
            goto L17
        L16:
            r4 = r3
        L17:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r4
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 == 0) goto L2a
            java.lang.Class[] r4 = new java.lang.Class[]{r1, r5}     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Method r0 = r2.getMethod(r0, r4)     // Catch: java.lang.Exception -> L2a
            goto L2b
        L2a:
            r0 = r3
        L2b:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r0
            r0 = 0
            java.lang.String r4 = "size"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L37
            java.lang.reflect.Method r4 = r2.getMethod(r4, r6)     // Catch: java.lang.Exception -> L37
            goto L38
        L37:
            r4 = r3
        L38:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r4
            java.lang.Class[] r4 = new java.lang.Class[]{r1}     // Catch: java.lang.Exception -> L45
            java.lang.String r6 = "get"
            java.lang.reflect.Method r4 = r2.getMethod(r6, r4)     // Catch: java.lang.Exception -> L45
            goto L46
        L45:
            r4 = r3
        L46:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r4
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r4 == 0) goto L59
            java.lang.Class[] r4 = new java.lang.Class[]{r1}     // Catch: java.lang.Exception -> L59
            java.lang.String r6 = "getName"
            java.lang.reflect.Method r4 = r2.getMethod(r6, r4)     // Catch: java.lang.Exception -> L59
            goto L5a
        L59:
            r4 = r3
        L5a:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r4
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            java.lang.String r6 = "WorkSourceUtil"
            if (r4 == 0) goto L73
            java.lang.String r4 = "createWorkChain"
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L6d
            java.lang.reflect.Method r4 = r2.getMethod(r4, r7)     // Catch: java.lang.Exception -> L6d
            goto L74
        L6d:
            r4 = move-exception
            java.lang.String r7 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r6, r7, r4)
        L73:
            r4 = r3
        L74:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r4
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r4 == 0) goto L93
            java.lang.String r4 = "android.os.WorkSource$WorkChain"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L8d
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r5}     // Catch: java.lang.Exception -> L8d
            java.lang.String r5 = "addNode"
            java.lang.reflect.Method r1 = r4.getMethod(r5, r1)     // Catch: java.lang.Exception -> L8d
            goto L94
        L8d:
            r1 = move-exception
            java.lang.String r4 = "Missing WorkChain class"
            android.util.Log.w(r6, r4, r1)
        L93:
            r1 = r3
        L94:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r1 == 0) goto La8
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> La8
            java.lang.reflect.Method r3 = r2.getMethod(r1, r0)     // Catch: java.lang.Exception -> La8
            r0 = 1
            r3.setAccessible(r0)     // Catch: java.lang.Exception -> La8
        La8:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void add(WorkSource workSource, int i, String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e4) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e5) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e5);
            }
        }
    }

    @KeepForSdk
    public static WorkSource fromPackage(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i = applicationInfo.uid;
                WorkSource workSource = new WorkSource();
                add(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    @KeepForSdk
    public static WorkSource fromPackageAndModuleExperimentalPi(Context context, String str, String str2) {
        Method method;
        if (context == null || context.getPackageManager() == null || str2 == null || str == null) {
            Log.w("WorkSourceUtil", "Unexpected null arguments");
            return null;
        }
        int i = -1;
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
            } else {
                i = applicationInfo.uid;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
        }
        if (i < 0) {
            return null;
        }
        WorkSource workSource = new WorkSource();
        Method method2 = zzg;
        if (method2 == null || (method = zzh) == null) {
            add(workSource, i, str);
        } else {
            try {
                Object invoke = method2.invoke(workSource, new Object[0]);
                int i4 = zza;
                if (i != i4) {
                    method.invoke(invoke, Integer.valueOf(i), str);
                }
                method.invoke(invoke, Integer.valueOf(i4), str2);
            } catch (Exception e4) {
                Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e4);
            }
        }
        return workSource;
    }

    @KeepForSdk
    public static int get(WorkSource workSource, int i) {
        Method method = zze;
        if (method == null) {
            return 0;
        }
        try {
            Object invoke = method.invoke(workSource, Integer.valueOf(i));
            Preconditions.checkNotNull(invoke);
            return ((Integer) invoke).intValue();
        } catch (Exception e4) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
            return 0;
        }
    }

    @KeepForSdk
    public static String getName(WorkSource workSource, int i) {
        Method method = zzf;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i));
        } catch (Exception e4) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
            return null;
        }
    }

    @KeepForSdk
    public static List<String> getNames(WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int size = workSource == null ? 0 : size(workSource);
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                String name = getName(workSource, i);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static boolean hasWorkSourcePermission(Context context) {
        return (context == null || context.getPackageManager() == null || Wrappers.packageManager(context).checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    @KeepForSdk
    public static boolean isEmpty(WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e4) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e4);
            }
        }
        return size(workSource) == 0;
    }

    @KeepForSdk
    public static int size(WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e4) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
            }
        }
        return 0;
    }
}
