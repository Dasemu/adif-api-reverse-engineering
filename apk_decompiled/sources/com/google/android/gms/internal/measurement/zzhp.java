package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* loaded from: classes3.dex */
public final class zzhp {
    static volatile zzii zza = zzii.zzc();
    private static final Object zzb = new Object();

    public static boolean zza(Context context, Uri uri) {
        ProviderInfo resolveContentProvider;
        String authority = uri.getAuthority();
        boolean z3 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (zza.zzb()) {
            return ((Boolean) zza.zza()).booleanValue();
        }
        synchronized (zzb) {
            try {
                if (zza.zzb()) {
                    return ((Boolean) zza.zza()).booleanValue();
                }
                if ("com.google.android.gms".equals(context.getPackageName()) || ((resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 268435456)) != null && "com.google.android.gms".equals(resolveContentProvider.packageName))) {
                    try {
                        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                            z3 = true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                zza = zzii.zzd(Boolean.valueOf(z3));
                return ((Boolean) zza.zza()).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
