package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* loaded from: classes3.dex */
public final class zzfl {
    final zzgd zza;

    public zzfl(zzlh zzlhVar) {
        this.zza = zzlhVar.zzp();
    }

    public final boolean zza() {
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.zza.zzaw());
            if (packageManager != null) {
                return packageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.zza.zzaA().zzj().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e4) {
            this.zza.zzaA().zzj().zzb("Failed to retrieve Play Store version for Install Referrer", e4);
            return false;
        }
    }
}
