package com.google.android.gms.internal.measurement;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzah implements zzap {
    private final Double zza;

    public zzah(Double d4) {
        if (d4 == null) {
            this.zza = Double.valueOf(Double.NaN);
        } else {
            this.zza = d4;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzah) {
            return this.zza.equals(((zzah) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        if ("toString".equals(str)) {
            return new zzat(zzi());
        }
        throw new IllegalArgumentException(zzi() + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzah(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        boolean z3 = false;
        if (!Double.isNaN(this.zza.doubleValue()) && this.zza.doubleValue() != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        if (Double.isNaN(this.zza.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.zza.doubleValue())) {
            return this.zza.doubleValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.zza.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : stripTrailingZeros.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }
}
