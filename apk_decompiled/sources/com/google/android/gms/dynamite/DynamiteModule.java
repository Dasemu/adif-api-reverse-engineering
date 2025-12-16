package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@KeepForSdk
/* loaded from: classes3.dex */
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static zzq zzk;
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();

    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();

    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();

    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy zza = new zzl();

    @DynamiteApi
    /* loaded from: classes3.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    /* loaded from: classes3.dex */
    public interface VersionPolicy {

        @KeepForSdk
        /* loaded from: classes3.dex */
        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z3) throws LoadingException;
        }

        @KeepForSdk
        /* loaded from: classes3.dex */
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @KeepForSdk
        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e4) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e4.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    @KeepForSdk
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        long j4;
        Boolean bool;
        IObjectWrapper zzh2;
        DynamiteModule dynamiteModule;
        zzr zzrVar;
        boolean z3;
        IObjectWrapper zze2;
        ThreadLocal threadLocal = zzg;
        zzn zznVar = (zzn) threadLocal.get();
        zzp zzpVar = null;
        zzn zznVar2 = new zzn(null);
        threadLocal.set(zznVar2);
        ThreadLocal threadLocal2 = zzh;
        Long l4 = (Long) threadLocal2.get();
        long longValue = l4.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectModule = versionPolicy.selectModule(context, str, zzi);
            j4 = longValue;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + selectModule.localVersion + " and remote module " + str + ":" + selectModule.remoteVersion);
                int i = selectModule.selection;
                if (i != 0) {
                    if (i == -1) {
                        if (selectModule.localVersion != 0) {
                            i = -1;
                        }
                    }
                    if (i != 1 || selectModule.remoteVersion != 0) {
                        if (i == -1) {
                            DynamiteModule zzc2 = zzc(context, str);
                            if (j4 == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(l4);
                            }
                            Cursor cursor = zznVar2.zza;
                            if (cursor != null) {
                                cursor.close();
                            }
                            threadLocal.set(zznVar);
                            return zzc2;
                        }
                        if (i != 1) {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i, null);
                        }
                        try {
                            int i4 = selectModule.remoteVersion;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (!zzf(context)) {
                                        throw new LoadingException("Remote loading disabled", null);
                                    }
                                    bool = zzb;
                                }
                                if (bool == null) {
                                    throw new LoadingException("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                    synchronized (DynamiteModule.class) {
                                        zzrVar = zzl;
                                    }
                                    if (zzrVar == null) {
                                        throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                    }
                                    zzn zznVar3 = (zzn) threadLocal.get();
                                    if (zznVar3 == null || zznVar3.zza == null) {
                                        throw new LoadingException("No result cursor", null);
                                    }
                                    Context applicationContext = context.getApplicationContext();
                                    Cursor cursor2 = zznVar3.zza;
                                    ObjectWrapper.wrap(null);
                                    synchronized (DynamiteModule.class) {
                                        z3 = zze >= 2;
                                    }
                                    if (z3) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        zze2 = zzrVar.zzf(ObjectWrapper.wrap(applicationContext), str, i4, ObjectWrapper.wrap(cursor2));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        zze2 = zzrVar.zze(ObjectWrapper.wrap(applicationContext), str, i4, ObjectWrapper.wrap(cursor2));
                                    }
                                    Context context2 = (Context) ObjectWrapper.unwrap(zze2);
                                    if (context2 == null) {
                                        throw new LoadingException("Failed to get module context", zzpVar);
                                    }
                                    dynamiteModule = new DynamiteModule(context2);
                                } else {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                    zzq zzg2 = zzg(context);
                                    if (zzg2 == null) {
                                        throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                    }
                                    int zze3 = zzg2.zze();
                                    if (zze3 >= 3) {
                                        zzn zznVar4 = (zzn) threadLocal.get();
                                        if (zznVar4 == null) {
                                            throw new LoadingException("No cached result cursor holder", null);
                                        }
                                        zzh2 = zzg2.zzi(ObjectWrapper.wrap(context), str, i4, ObjectWrapper.wrap(zznVar4.zza));
                                    } else if (zze3 == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        zzh2 = zzg2.zzj(ObjectWrapper.wrap(context), str, i4);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        zzh2 = zzg2.zzh(ObjectWrapper.wrap(context), str, i4);
                                    }
                                    Object unwrap = ObjectWrapper.unwrap(zzh2);
                                    if (unwrap == null) {
                                        throw new LoadingException("Failed to load remote module.", null);
                                    }
                                    dynamiteModule = new DynamiteModule((Context) unwrap);
                                }
                                if (j4 == 0) {
                                    threadLocal2.remove();
                                } else {
                                    threadLocal2.set(l4);
                                }
                                Cursor cursor3 = zznVar2.zza;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                threadLocal.set(zznVar);
                                return dynamiteModule;
                            } catch (RemoteException e4) {
                                throw new LoadingException("Failed to load remote module.", e4, null);
                            } catch (LoadingException e5) {
                                throw e5;
                            } catch (Throwable th) {
                                CrashUtils.addDynamiteErrorToDropBox(context, th);
                                throw new LoadingException("Failed to load remote module.", th, null);
                            }
                        } catch (LoadingException e6) {
                            Log.w("DynamiteModule", "Failed to load remote module: " + e6.getMessage());
                            int i5 = selectModule.localVersion;
                            if (i5 == 0 || versionPolicy.selectModule(context, str, new zzo(i5, 0)).selection != -1) {
                                throw new LoadingException("Remote load failed. No local fallback found.", e6, null);
                            }
                            DynamiteModule zzc3 = zzc(context, str);
                            if (j4 == 0) {
                                zzh.remove();
                            } else {
                                zzh.set(l4);
                            }
                            Cursor cursor4 = zznVar2.zza;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            zzg.set(zznVar);
                            return zzc3;
                        }
                    }
                }
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectModule.localVersion + " and remote version is " + selectModule.remoteVersion + ".", null);
            } catch (Throwable th2) {
                th = th2;
                if (j4 == 0) {
                    zzh.remove();
                } else {
                    zzh.set(l4);
                }
                Cursor cursor5 = zznVar2.zza;
                if (cursor5 != null) {
                    cursor5.close();
                }
                zzg.set(zznVar);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j4 = longValue;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01ab -> B:24:0x01b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01ad -> B:24:0x01b0). Please report as a decompilation issue!!! */
    public static int zza(Context context, String str, boolean z3) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                int i = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e4) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e4.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                zzd(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!zzf(context)) {
                                return 0;
                            }
                            if (!zzd) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int zzb2 = zzb(context, str, z3, true);
                                        String str2 = zzc;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader zza2 = zzb.zza();
                                            if (zza2 == null) {
                                                String str3 = zzc;
                                                Preconditions.checkNotNull(str3);
                                                zza2 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            }
                                            zzd(zza2);
                                            declaredField.set(null, zza2);
                                            zzb = bool2;
                                            return zzb2;
                                        }
                                        return zzb2;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        zzb = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z3, false);
                    } catch (LoadingException e5) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e5.getMessage());
                        return 0;
                    }
                }
                zzq zzg2 = zzg(context);
                try {
                    if (zzg2 != null) {
                        try {
                            int zze2 = zzg2.zze();
                            if (zze2 >= 3) {
                                zzn zznVar = (zzn) zzg.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    Cursor cursor2 = (Cursor) ObjectWrapper.unwrap(zzg2.zzk(ObjectWrapper.wrap(context), str, z3, ((Long) zzh.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i4 = cursor2.getInt(0);
                                                r2 = (i4 <= 0 || !zze(cursor2)) ? cursor2 : null;
                                                if (r2 != null) {
                                                    r2.close();
                                                }
                                                i = i4;
                                            }
                                        } catch (RemoteException e6) {
                                            remoteException = e6;
                                            r2 = cursor2;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            return i;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r2 = cursor2;
                                            if (r2 == null) {
                                                throw th;
                                            }
                                            r2.close();
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } else {
                                    i = cursor.getInt(0);
                                }
                            } else if (zze2 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i = zzg2.zzg(ObjectWrapper.wrap(context), str, z3);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i = zzg2.zzf(ObjectWrapper.wrap(context), str, z3);
                            }
                        } catch (RemoteException e7) {
                            remoteException = e7;
                        }
                    }
                    return i;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
    
        r11.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int zzb(android.content.Context r11, java.lang.String r12, boolean r13, boolean r14) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        zzp zzpVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzr(iBinder);
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e4) {
            throw new LoadingException("Failed to instantiate dynamite loader", e4, zzpVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z3 = false;
        if (zzf == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z3 = true;
            }
            zzf = Boolean.valueOf(z3);
            if (z3 && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zzd = true;
            }
        }
        if (!z3) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z3;
    }

    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e4) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e4.getMessage());
            }
            return null;
        }
    }

    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @KeepForSdk
    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e4) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e4, null);
        }
    }
}
