package com.google.android.gms.internal.measurement;

import C.w;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        return w.o("\"", this.zza, "\"");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        char c4;
        String str6;
        int i;
        int i4;
        int i5;
        int i6;
        zzg zzgVar2;
        int i7;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || FirebaseAnalytics.Event.SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(w.n(str, " is not a String function"));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                if (str.equals(str4)) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -1776922004:
                str5 = "charAt";
                if (str.equals("toString")) {
                    c4 = 14;
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c4 = 65535;
                break;
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c4 = '\f';
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c4 = 65535;
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    str4 = str2;
                    c4 = 0;
                    break;
                }
                str4 = str2;
                c4 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = str2;
                    str5 = "charAt";
                    c4 = 1;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c4 = '\r';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case -906336856:
                if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                    c4 = 7;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    c4 = 11;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c4 = 4;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c4 = 15;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case 3568674:
                if (str.equals(str3)) {
                    c4 = 16;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case 103668165:
                if (str.equals("match")) {
                    c4 = 5;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c4 = '\b';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case 109648666:
                if (str.equals("split")) {
                    c4 = '\t';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case 530542161:
                if (str.equals("substring")) {
                    c4 = '\n';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    c4 = 6;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str4 = str2;
                    str5 = "charAt";
                    c4 = 3;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
        }
        str6 = "undefined";
        char c5 = c4;
        double d4 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        switch (c5) {
            case 0:
                zzh.zzj(str5, 1, list);
                int zza = !list.isEmpty() ? (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue()) : 0;
                String str7 = this.zza;
                return (zza < 0 || zza >= str7.length()) ? zzap.zzm : new zzat(String.valueOf(str7.charAt(zza)));
            case 1:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb = new StringBuilder(this.zza);
                for (int i8 = 0; i8 < list.size(); i8++) {
                    sb.append(zzgVar.zzb((zzap) list.get(i8)).zzi());
                }
                return new zzat(sb.toString());
            case 2:
                zzh.zzh(str4, 1, list);
                String str8 = this.zza;
                zzap zzb = zzgVar.zzb((zzap) list.get(0));
                if ("length".equals(zzb.zzi())) {
                    return zzap.zzk;
                }
                double doubleValue = zzb.zzh().doubleValue();
                return (doubleValue != Math.floor(doubleValue) || (i = (int) doubleValue) < 0 || i >= str8.length()) ? zzap.zzl : zzap.zzk;
            case 3:
                zzh.zzj("indexOf", 2, list);
                String str9 = this.zza;
                String zzi = list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined";
                if (list.size() >= 2) {
                    d4 = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                }
                return new zzah(Double.valueOf(str9.indexOf(zzi, (int) zzh.zza(d4))));
            case 4:
                zzh.zzj("lastIndexOf", 2, list);
                String str10 = this.zza;
                String zzi2 = list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined";
                return new zzah(Double.valueOf(str10.lastIndexOf(zzi2, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zza(r3)))));
            case 5:
                zzh.zzj("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.zza);
                return matcher.find() ? new zzae(Arrays.asList(new zzat(matcher.group()))) : zzap.zzg;
            case 6:
                zzh.zzj("replace", 2, list);
                zzap zzapVar = zzap.zzf;
                if (!list.isEmpty()) {
                    str6 = zzgVar.zzb((zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        zzapVar = zzgVar.zzb((zzap) list.get(1));
                    }
                }
                String str11 = str6;
                String str12 = this.zza;
                int indexOf = str12.indexOf(str11);
                if (indexOf < 0) {
                    return this;
                }
                if (zzapVar instanceof zzai) {
                    i4 = 0;
                    zzapVar = ((zzai) zzapVar).zza(zzgVar, Arrays.asList(new zzat(str11), new zzah(Double.valueOf(indexOf)), this));
                } else {
                    i4 = 0;
                }
                return new zzat(str12.substring(i4, indexOf) + zzapVar.zzi() + str12.substring(str11.length() + indexOf));
            case 7:
                zzh.zzj(FirebaseAnalytics.Event.SEARCH, 1, list);
                return Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.zza).find() ? new zzah(Double.valueOf(r0.start())) : new zzah(Double.valueOf(-1.0d));
            case '\b':
                zzh.zzj("slice", 2, list);
                String str13 = this.zza;
                double zza2 = zzh.zza(!list.isEmpty() ? zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue() : 0.0d);
                double max = zza2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.max(str13.length() + zza2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Math.min(zza2, str13.length());
                double zza3 = zzh.zza(list.size() > 1 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : str13.length());
                double max2 = zza3 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.max(str13.length() + zza3, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Math.min(zza3, str13.length());
                int i9 = (int) max;
                return new zzat(str13.substring(i9, Math.max(0, ((int) max2) - i9) + i9));
            case '\t':
                zzh.zzj("split", 2, list);
                String str14 = this.zza;
                if (str14.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String zzi3 = zzgVar.zzb((zzap) list.get(0)).zzi();
                    long zzd = list.size() > 1 ? zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) : 2147483647L;
                    if (zzd == 0) {
                        return new zzae();
                    }
                    String[] split = str14.split(Pattern.quote(zzi3), ((int) zzd) + 1);
                    int length = split.length;
                    if (!zzi3.isEmpty() || length <= 0) {
                        i5 = length;
                        i6 = 0;
                    } else {
                        boolean isEmpty = split[0].isEmpty();
                        i5 = length - 1;
                        i6 = isEmpty;
                        if (!split[i5].isEmpty()) {
                            i5 = length;
                            i6 = isEmpty;
                        }
                    }
                    if (length > zzd) {
                        i5--;
                    }
                    while (i6 < i5) {
                        arrayList.add(new zzat(split[i6]));
                        i6++;
                    }
                }
                return new zzae(arrayList);
            case '\n':
                zzh.zzj("substring", 2, list);
                String str15 = this.zza;
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    i7 = 0;
                } else {
                    zzgVar2 = zzgVar;
                    i7 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                }
                int zza4 = list.size() > 1 ? (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue()) : str15.length();
                int min = Math.min(Math.max(i7, 0), str15.length());
                int min2 = Math.min(Math.max(zza4, 0), str15.length());
                return new zzat(str15.substring(Math.min(min, min2), Math.max(min, min2)));
            case 11:
                zzh.zzh("toLocaleUpperCase", 0, list);
                return new zzat(this.zza.toUpperCase());
            case '\f':
                zzh.zzh("toLocaleLowerCase", 0, list);
                return new zzat(this.zza.toLowerCase());
            case '\r':
                zzh.zzh("toLowerCase", 0, list);
                return new zzat(this.zza.toLowerCase(Locale.ENGLISH));
            case 14:
                zzh.zzh("toString", 0, list);
                return this;
            case 15:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(this.zza.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(this.zza.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
