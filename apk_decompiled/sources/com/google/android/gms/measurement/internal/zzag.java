package com.google.android.gms.measurement.internal;

import C.w;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.messaging.ServiceStarter;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public final class zzag extends zzgw {
    private Boolean zza;
    private zzaf zzb;
    private Boolean zzc;

    public zzag(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzb = new zzaf() { // from class: com.google.android.gms.measurement.internal.zzae
            @Override // com.google.android.gms.measurement.internal.zzaf
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static final long zzA() {
        return ((Long) zzeg.zzD.zza(null)).longValue();
    }

    private final String zzB(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e4) {
            this.zzt.zzaA().zzd().zzb("Could not find SystemProperties class", e4);
            return "";
        } catch (IllegalAccessException e5) {
            this.zzt.zzaA().zzd().zzb("Could not access SystemProperties.get()", e5);
            return "";
        } catch (NoSuchMethodException e6) {
            this.zzt.zzaA().zzd().zzb("Could not find SystemProperties.get() method", e6);
            return "";
        } catch (InvocationTargetException e7) {
            this.zzt.zzaA().zzd().zzb("SystemProperties.get() threw an exception", e7);
            return "";
        }
    }

    public static final long zzz() {
        return ((Long) zzeg.zzd.zza(null)).longValue();
    }

    public final double zza(String str, zzef zzefVar) {
        if (str == null) {
            return ((Double) zzefVar.zza(null)).doubleValue();
        }
        String zza = this.zzb.zza(str, zzefVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Double) zzefVar.zza(null)).doubleValue();
        }
        try {
            return ((Double) zzefVar.zza(Double.valueOf(Double.parseDouble(zza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzefVar.zza(null)).doubleValue();
        }
    }

    public final int zzb(String str) {
        return zzf(str, zzeg.zzH, ServiceStarter.ERROR_UNKNOWN, 2000);
    }

    public final int zzc() {
        return this.zzt.zzv().zzai(201500000, true) ? 100 : 25;
    }

    public final int zzd(String str) {
        return zzf(str, zzeg.zzI, 25, 100);
    }

    public final int zze(String str, zzef zzefVar) {
        if (str == null) {
            return ((Integer) zzefVar.zza(null)).intValue();
        }
        String zza = this.zzb.zza(str, zzefVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Integer) zzefVar.zza(null)).intValue();
        }
        try {
            return ((Integer) zzefVar.zza(Integer.valueOf(Integer.parseInt(zza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzefVar.zza(null)).intValue();
        }
    }

    public final int zzf(String str, zzef zzefVar, int i, int i4) {
        return Math.max(Math.min(zze(str, zzefVar), i4), i);
    }

    public final long zzh() {
        this.zzt.zzay();
        return 79000L;
    }

    public final long zzi(String str, zzef zzefVar) {
        if (str == null) {
            return ((Long) zzefVar.zza(null)).longValue();
        }
        String zza = this.zzb.zza(str, zzefVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Long) zzefVar.zza(null)).longValue();
        }
        try {
            return ((Long) zzefVar.zza(Long.valueOf(Long.parseLong(zza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzefVar.zza(null)).longValue();
        }
    }

    public final Bundle zzj() {
        try {
            if (this.zzt.zzaw().getPackageManager() == null) {
                this.zzt.zzaA().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzt.zzaw()).getApplicationInfo(this.zzt.zzaw().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            this.zzt.zzaA().zzd().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e4) {
            this.zzt.zzaA().zzd().zzb("Failed to load metadata: Package name not found", e4);
            return null;
        }
    }

    public final Boolean zzk(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzj = zzj();
        if (zzj == null) {
            w.v(this.zzt, "Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (zzj.containsKey(str)) {
            return Boolean.valueOf(zzj.getBoolean(str));
        }
        return null;
    }

    public final String zzl() {
        return zzB("debug.firebase.analytics.app", "");
    }

    public final String zzm() {
        return zzB("debug.deferred.deeplink", "");
    }

    public final String zzn() {
        this.zzt.zzay();
        return "FA";
    }

    public final String zzo(String str, zzef zzefVar) {
        return str == null ? (String) zzefVar.zza(null) : (String) zzefVar.zza(this.zzb.zza(str, zzefVar.zzb()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzp(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzj()
            r1 = 0
            if (r0 != 0) goto L15
            com.google.android.gms.measurement.internal.zzgd r4 = r3.zzt
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            C.w.v(r4, r0)
        L13:
            r4 = r1
            goto L24
        L15:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L1c
            goto L13
        L1c:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L24:
            if (r4 == 0) goto L50
            com.google.android.gms.measurement.internal.zzgd r0 = r3.zzt     // Catch: android.content.res.Resources.NotFoundException -> L40
            android.content.Context r0 = r0.zzaw()     // Catch: android.content.res.Resources.NotFoundException -> L40
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L40
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L40
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L40
            if (r4 != 0) goto L3b
            return r1
        L3b:
            java.util.List r3 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L40
            return r3
        L40:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzgd r3 = r3.zzt
            com.google.android.gms.measurement.internal.zzet r3 = r3.zzaA()
            com.google.android.gms.measurement.internal.zzer r3 = r3.zzd()
            java.lang.String r0 = "Failed to load string array from metadata: resource not found"
            r3.zzb(r0, r4)
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzag.zzp(java.lang.String):java.util.List");
    }

    public final void zzq(zzaf zzafVar) {
        this.zzb = zzafVar;
    }

    public final boolean zzr() {
        Boolean zzk = zzk("google_analytics_adid_collection_enabled");
        return zzk == null || zzk.booleanValue();
    }

    public final boolean zzs(String str, zzef zzefVar) {
        if (str == null) {
            return ((Boolean) zzefVar.zza(null)).booleanValue();
        }
        String zza = this.zzb.zza(str, zzefVar.zzb());
        return TextUtils.isEmpty(zza) ? ((Boolean) zzefVar.zza(null)).booleanValue() : ((Boolean) zzefVar.zza(Boolean.valueOf("1".equals(zza)))).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean zzk = zzk("google_analytics_automatic_screen_reporting_enabled");
        return zzk == null || zzk.booleanValue();
    }

    public final boolean zzv() {
        this.zzt.zzay();
        Boolean zzk = zzk("firebase_analytics_collection_deactivated");
        return zzk != null && zzk.booleanValue();
    }

    public final boolean zzw(String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    public final boolean zzx() {
        if (this.zza == null) {
            Boolean zzk = zzk("app_measurement_lite");
            this.zza = zzk;
            if (zzk == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzt.zzN();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if (this.zzc == null) {
            synchronized (this) {
                try {
                    if (this.zzc == null) {
                        ApplicationInfo applicationInfo = this.zzt.zzaw().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z3 = false;
                            if (str != null && str.equals(myProcessName)) {
                                z3 = true;
                            }
                            this.zzc = Boolean.valueOf(z3);
                        }
                        if (this.zzc == null) {
                            this.zzc = Boolean.TRUE;
                            this.zzt.zzaA().zzd().zza("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzc.booleanValue();
    }
}
