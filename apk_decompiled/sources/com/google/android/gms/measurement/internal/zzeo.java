package com.google.android.gms.measurement.internal;

import C.w;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import u.AbstractC0629f;

/* loaded from: classes3.dex */
public final class zzeo {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzen zzd;

    public zzeo(zzen zzenVar) {
        this.zzd = zzenVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            Object obj = strArr[i];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder a2 = AbstractC0629f.a("[");
        for (Object obj : objArr) {
            String zzb2 = obj instanceof Bundle ? zzb((Bundle) obj) : String.valueOf(obj);
            if (zzb2 != null) {
                if (a2.length() != 1) {
                    a2.append(", ");
                }
                a2.append(zzb2);
            }
        }
        a2.append("]");
        return a2.toString();
    }

    public final String zzb(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder a2 = AbstractC0629f.a("Bundle[{");
        for (String str : bundle.keySet()) {
            if (a2.length() != 8) {
                a2.append(", ");
            }
            a2.append(zze(str));
            a2.append("=");
            Object obj = bundle.get(str);
            a2.append(obj instanceof Bundle ? zza(new Object[]{obj}) : obj instanceof Object[] ? zza((Object[]) obj) : obj instanceof ArrayList ? zza(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        a2.append("}]");
        return a2.toString();
    }

    public final String zzc(zzau zzauVar) {
        if (!this.zzd.zza()) {
            return zzauVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzauVar.zzc);
        sb.append(",name=");
        sb.append(zzd(zzauVar.zza));
        sb.append(",params=");
        zzas zzasVar = zzauVar.zzb;
        sb.append(zzasVar == null ? null : !this.zzd.zza() ? zzasVar.toString() : zzb(zzasVar.zzc()));
        return sb.toString();
    }

    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzhc.zzc, zzhc.zza, zza);
    }

    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzhd.zzb, zzhd.zza, zzb);
    }

    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : str.startsWith("_exp_") ? w.o("experiment_id(", str, ")") : zzg(str, zzhe.zzb, zzhe.zza, zzc);
    }
}
