package com.google.android.gms.measurement.internal;

import C.w;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpq;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import kotlinx.coroutines.test.TestBuildersKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public final class zzlp extends zzgx {
    private static final String[] zza = {"firebase_", "google_", "ga_"};
    private static final String[] zzb = {"_err"};
    private SecureRandom zzc;
    private final AtomicLong zzd;
    private int zze;
    private Integer zzf;

    public zzlp(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzf = null;
        this.zzd = new AtomicLong(0L);
    }

    public static MessageDigest zzF() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList zzH(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzacVar.zza);
            bundle.putString("origin", zzacVar.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzacVar.zzd);
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, zzacVar.zzc.zzb);
            zzgz.zzb(bundle, Preconditions.checkNotNull(zzacVar.zzc.zza()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzacVar.zze);
            String str = zzacVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzau zzauVar = zzacVar.zzg;
            if (zzauVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzauVar.zza);
                zzas zzasVar = zzauVar.zzb;
                if (zzasVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzasVar.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzacVar.zzh);
            zzau zzauVar2 = zzacVar.zzi;
            if (zzauVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzauVar2.zza);
                zzas zzasVar2 = zzauVar2.zzb;
                if (zzasVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzasVar2.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzacVar.zzc.zzc);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzacVar.zzj);
            zzau zzauVar3 = zzacVar.zzk;
            if (zzauVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzauVar3.zza);
                zzas zzasVar3 = zzauVar3.zzb;
                if (zzasVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzasVar3.zzc());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void zzK(zzir zzirVar, Bundle bundle, boolean z3) {
        if (bundle != null && zzirVar != null) {
            if (!bundle.containsKey("_sc") || z3) {
                String str = zzirVar.zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzirVar.zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzirVar.zzc);
                return;
            }
            z3 = false;
        }
        if (bundle != null && zzirVar == null && z3) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean zzaj(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean zzak(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean zzal(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean zzam(Context context, boolean z3) {
        Preconditions.checkNotNull(context);
        return zzav(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean zzan(String str) {
        return !zzb[0].equals(str);
    }

    public static final boolean zzaq(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    @VisibleForTesting
    public static final boolean zzar(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int zzas(String str) {
        if ("_ldl".equals(str)) {
            this.zzt.zzf();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.zzt.zzf();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.zzt.zzf();
            return 100;
        }
        this.zzt.zzf();
        return 36;
    }

    private final Object zzat(int i, Object obj, boolean z3, boolean z4) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return zzD(obj.toString(), i, z3);
        }
        if (!z4 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle zzt = zzt((Bundle) parcelable);
                if (!zzt.isEmpty()) {
                    arrayList.add(zzt);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private static boolean zzau(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (zzln.zza(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzav(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    @VisibleForTesting
    public static long zzp(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i = 0;
        Preconditions.checkState(length > 0);
        long j4 = 0;
        for (int i4 = length - 1; i4 >= 0 && i4 >= bArr.length - 8; i4--) {
            j4 += (bArr[i4] & 255) << i;
            i += 8;
        }
        return j4;
    }

    public final Object zzA(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.zzt.zzf();
            return zzat(256, obj, true, true);
        }
        if (zzaj(str)) {
            this.zzt.zzf();
        } else {
            this.zzt.zzf();
            i = 100;
        }
        return zzat(i, obj, false, true);
    }

    public final Object zzB(String str, Object obj) {
        return "_ldl".equals(str) ? zzat(zzas(str), obj, true, false) : zzat(zzas(str), obj, false, false);
    }

    public final String zzC() {
        byte[] bArr = new byte[16];
        zzG().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String zzD(String str, int i, boolean z3) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z3) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public final URL zzE(long j4, String str, String str2, long j5) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String str3 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v79000." + zzm()) + "&rdid=" + str2 + "&bundleid=" + str + "&retry=" + j5;
            if (str.equals(this.zzt.zzf().zzm())) {
                str3 = str3.concat("&ddl_test=1");
            }
            return new URL(str3);
        } catch (IllegalArgumentException | MalformedURLException e4) {
            this.zzt.zzaA().zzd().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e4.getMessage());
            return null;
        }
    }

    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom zzG() {
        zzg();
        if (this.zzc == null) {
            this.zzc = new SecureRandom();
        }
        return this.zzc;
    }

    public final void zzI(Bundle bundle, long j4) {
        long j5 = bundle.getLong("_et");
        if (j5 != 0) {
            this.zzt.zzaA().zzk().zzb("Params already contained engagement", Long.valueOf(j5));
        } else {
            j5 = 0;
        }
        bundle.putLong("_et", j4 + j5);
    }

    public final void zzJ(Bundle bundle, int i, String str, String str2, Object obj) {
        if (zzaq(bundle, i)) {
            this.zzt.zzf();
            bundle.putString("_ev", zzD(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void zzL(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.zzt.zzv().zzP(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void zzM(Parcelable[] parcelableArr, int i, boolean z3) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i4 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (zzak(str) && !zzau(str, zzhd.zzd) && (i4 = i4 + 1) > i) {
                    if (z3) {
                        this.zzt.zzaA().zze().zzc(w.i(i, "Param can't contain more than ", " item-scoped custom parameters"), this.zzt.zzj().zze(str), this.zzt.zzj().zzb(bundle));
                        zzaq(bundle, 28);
                    } else {
                        this.zzt.zzaA().zze().zzc("Param cannot contain item-scoped custom parameters", this.zzt.zzj().zze(str), this.zzt.zzj().zzb(bundle));
                        zzaq(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final void zzN(zzeu zzeuVar, int i) {
        Iterator it = new TreeSet(zzeuVar.zzd.keySet()).iterator();
        int i4 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (zzak(str) && (i4 = i4 + 1) > i) {
                this.zzt.zzaA().zze().zzc(w.i(i, "Event can't contain more than ", " params"), this.zzt.zzj().zzd(zzeuVar.zza), this.zzt.zzj().zzb(zzeuVar.zzd));
                zzaq(zzeuVar.zzd, 5);
                zzeuVar.zzd.remove(str);
            }
        }
    }

    public final void zzO(zzlo zzloVar, String str, int i, String str2, String str3, int i4) {
        Bundle bundle = new Bundle();
        zzaq(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i4);
        }
        zzloVar.zza(str, "_err", bundle);
    }

    public final void zzP(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.zzt.zzaA().zzl().zzc("Not putting event parameter. Invalid value type. name, type", this.zzt.zzj().zze(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zzQ(com.google.android.gms.internal.measurement.zzcf zzcfVar, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z3);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e4) {
            this.zzt.zzaA().zzk().zzb("Error returning boolean value to wrapper", e4);
        }
    }

    public final void zzR(com.google.android.gms.internal.measurement.zzcf zzcfVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e4) {
            this.zzt.zzaA().zzk().zzb("Error returning bundle list to wrapper", e4);
        }
    }

    public final void zzS(com.google.android.gms.internal.measurement.zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e4) {
            this.zzt.zzaA().zzk().zzb("Error returning bundle value to wrapper", e4);
        }
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e4) {
            this.zzt.zzaA().zzk().zzb("Error returning byte array to wrapper", e4);
        }
    }

    public final void zzU(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e4) {
            this.zzt.zzaA().zzk().zzb("Error returning int value to wrapper", e4);
        }
    }

    public final void zzV(com.google.android.gms.internal.measurement.zzcf zzcfVar, long j4) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j4);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e4) {
            this.zzt.zzaA().zzk().zzb("Error returning long value to wrapper", e4);
        }
    }

    public final void zzW(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e4) {
            this.zzt.zzaA().zzk().zzb("Error returning string value to wrapper", e4);
        }
    }

    public final void zzX(String str, String str2, String str3, Bundle bundle, List list, boolean z3) {
        int i;
        int i4;
        zzlp zzlpVar = this;
        String str4 = str2;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        zzag zzf = zzlpVar.zzt.zzf();
        zzpq.zzc();
        int i5 = (zzf.zzt.zzf().zzs(null, zzeg.zzaz) && zzf.zzt.zzv().zzai(231100000, true)) ? 35 : 0;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i6 = 0;
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (list2 == null || !list2.contains(str5)) {
                int zzj = !z3 ? zzlpVar.zzj(str5) : 0;
                if (zzj == 0) {
                    zzj = zzlpVar.zzi(str5);
                }
                i = zzj;
            } else {
                i = 0;
            }
            if (i != 0) {
                zzlpVar.zzJ(bundle, i, str5, str5, i == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                Bundle bundle2 = bundle;
                if (zzlpVar.zzag(bundle2.get(str5))) {
                    zzlpVar.zzt.zzaA().zzl().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str4, str3, str5);
                    i4 = 22;
                } else {
                    String str6 = str4;
                    int zza2 = zzlpVar.zza(str, str6, str5, bundle2.get(str5), bundle2, list2, z3, false);
                    str4 = str6;
                    bundle2 = bundle2;
                    i4 = zza2;
                }
                if (i4 == 0 || "_ev".equals(str5)) {
                    zzlpVar = this;
                    if (zzak(str5) && !zzau(str5, zzhd.zzd)) {
                        i6++;
                        if (!zzlpVar.zzai(231100000, true)) {
                            zzlpVar.zzt.zzaA().zze().zzc("Item array not supported on client's version of Google Play Services (Android Only)", zzlpVar.zzt.zzj().zzd(str4), zzlpVar.zzt.zzj().zzb(bundle2));
                            zzaq(bundle2, 23);
                            bundle2.remove(str5);
                        } else if (i6 > i5) {
                            zzpq.zzc();
                            if (zzlpVar.zzt.zzf().zzs(null, zzeg.zzaz)) {
                                zzlpVar.zzt.zzaA().zze().zzc(w.i(i5, "Item can't contain more than ", " item-scoped custom params"), zzlpVar.zzt.zzj().zzd(str4), zzlpVar.zzt.zzj().zzb(bundle2));
                                zzaq(bundle2, 28);
                                bundle2.remove(str5);
                            } else {
                                zzlpVar.zzt.zzaA().zze().zzc("Item cannot contain custom parameters", zzlpVar.zzt.zzj().zzd(str4), zzlpVar.zzt.zzj().zzb(bundle2));
                                zzaq(bundle2, 23);
                                bundle2.remove(str5);
                            }
                        }
                    }
                } else {
                    zzlpVar = this;
                    zzlpVar.zzJ(bundle2, i4, str5, str5, bundle2.get(str5));
                    bundle2.remove(str5);
                }
            }
            list2 = list;
        }
    }

    public final boolean zzY(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (zzar(str)) {
                return true;
            }
            if (this.zzt.zzL()) {
                this.zzt.zzaA().zze().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzet.zzn(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.zzt.zzL()) {
                this.zzt.zzaA().zze().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (zzar(str2)) {
            return true;
        }
        this.zzt.zzaA().zze().zzb("Invalid admob_app_id. Analytics disabled.", zzet.zzn(str2));
        return false;
    }

    public final boolean zzZ(String str, int i, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        this.zzt.zzaA().zze().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlp.zza(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    public final void zzaC() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                w.A(this.zzt, "Utils falling back to Random for random id");
            }
        }
        this.zzd.set(nextLong);
    }

    public final boolean zzaa(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = zza;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.zzt.zzaA().zze().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzau(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zzau(str2, strArr2)) {
            return true;
        }
        this.zzt.zzaA().zze().zzc("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean zzab(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.zzt.zzaA().zzl().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean zzac(String str, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                this.zzt.zzaA().zze().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.zzt.zzaA().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean zzad(String str, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.zzt.zzaA().zze().zzc("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.zzt.zzaA().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean zzae(String str) {
        zzg();
        if (Wrappers.packageManager(this.zzt.zzaw()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.zzt.zzaA().zzc().zzb("Permission not granted", str);
        return false;
    }

    public final boolean zzaf(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String zzl = this.zzt.zzf().zzl();
        this.zzt.zzay();
        return zzl.equals(str);
    }

    public final boolean zzag(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    @VisibleForTesting
    public final boolean zzah(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e4) {
            this.zzt.zzaA().zzd().zzb("Package name not found", e4);
            return true;
        } catch (CertificateException e5) {
            this.zzt.zzaA().zzd().zzb("Error obtaining certificate", e5);
            return true;
        }
    }

    public final boolean zzai(int i, boolean z3) {
        Boolean zzj = this.zzt.zzt().zzj();
        if (zzm() < i / 1000) {
            return (zzj == null || zzj.booleanValue()) ? false : true;
        }
        return true;
    }

    public final boolean zzao(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public final byte[] zzap(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final int zzd(String str, Object obj) {
        return "_ldl".equals(str) ? zzab("user property referrer", str, zzas(str), obj) : zzab("user property", str, zzas(str), obj) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    public final boolean zzf() {
        return true;
    }

    public final int zzh(String str) {
        if (!zzac("event", str)) {
            return 2;
        }
        if (!zzaa("event", zzhc.zza, zzhc.zzb, str)) {
            return 13;
        }
        this.zzt.zzf();
        return !zzZ("event", 40, str) ? 2 : 0;
    }

    public final int zzi(String str) {
        if (!zzac("event param", str)) {
            return 3;
        }
        if (!zzaa("event param", null, null, str)) {
            return 14;
        }
        this.zzt.zzf();
        return !zzZ("event param", 40, str) ? 3 : 0;
    }

    public final int zzj(String str) {
        if (!zzad("event param", str)) {
            return 3;
        }
        if (!zzaa("event param", null, null, str)) {
            return 14;
        }
        this.zzt.zzf();
        return !zzZ("event param", 40, str) ? 3 : 0;
    }

    public final int zzl(String str) {
        if (!zzac("user property", str)) {
            return 6;
        }
        if (!zzaa("user property", zzhe.zza, null, str)) {
            return 15;
        }
        this.zzt.zzf();
        return !zzZ("user property", 24, str) ? 6 : 0;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int zzm() {
        if (this.zzf == null) {
            this.zzf = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzt.zzaw()) / 1000);
        }
        return this.zzf.intValue();
    }

    public final int zzo(int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzt.zzaw(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final long zzq() {
        long andIncrement;
        long j4;
        if (this.zzd.get() != 0) {
            synchronized (this.zzd) {
                this.zzd.compareAndSet(-1L, 1L);
                andIncrement = this.zzd.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.zzd) {
            long nextLong = new Random(System.nanoTime() ^ this.zzt.zzax().currentTimeMillis()).nextLong();
            int i = this.zze + 1;
            this.zze = i;
            j4 = nextLong + i;
        }
        return j4;
    }

    public final long zzr(long j4, long j5) {
        return ((j5 * TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS) + j4) / 86400000;
    }

    public final Bundle zzs(Uri uri, boolean z3) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str2 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str4 = uri.getQueryParameter("utm_medium");
                    str5 = uri.getQueryParameter("gclid");
                    str6 = uri.getQueryParameter("utm_id");
                    str7 = uri.getQueryParameter("dclid");
                    str8 = uri.getQueryParameter("srsltid");
                    str = z3 ? uri.getQueryParameter("sfmc_id") : null;
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    str8 = null;
                }
                if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && (!z3 || TextUtils.isEmpty(str))) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("campaign", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("source", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("medium", str4);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("gclid", str5);
                }
                String queryParameter = uri.getQueryParameter(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_TERM);
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_CONTENT);
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString(FirebaseAnalytics.Param.CONTENT, queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, str6);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("dclid", str7);
                }
                String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString(FirebaseAnalytics.Param.SOURCE_PLATFORM, queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString(FirebaseAnalytics.Param.CREATIVE_FORMAT, queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString(FirebaseAnalytics.Param.MARKETING_TACTIC, queryParameter8);
                }
                if (!TextUtils.isEmpty(str8)) {
                    bundle.putString("srsltid", str8);
                }
                if (z3 && !TextUtils.isEmpty(str)) {
                    bundle.putString("sfmc_id", str);
                }
                return bundle;
            } catch (UnsupportedOperationException e4) {
                this.zzt.zzaA().zzk().zzb("Install referrer url isn't a hierarchical URI", e4);
            }
        }
        return null;
    }

    public final Bundle zzt(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object zzA = zzA(str, bundle.get(str));
                if (zzA == null) {
                    this.zzt.zzaA().zzl().zzb("Param value can't be null", this.zzt.zzj().zze(str));
                } else {
                    zzP(bundle2, str, zzA);
                }
            }
        }
        return bundle2;
    }

    public final Bundle zzu(String str, String str2, Bundle bundle, List list, boolean z3) {
        int zzj;
        String str3 = str2;
        List list2 = list;
        boolean zzau = zzau(str3, zzhc.zzd);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int zzc = this.zzt.zzf().zzc();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i = 0;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                zzj = !z3 ? zzj(str4) : 0;
                if (zzj == 0) {
                    zzj = zzi(str4);
                }
            } else {
                zzj = 0;
            }
            if (zzj != 0) {
                zzJ(bundle2, zzj, str4, str4, zzj == 3 ? str4 : null);
                bundle2.remove(str4);
            } else {
                Bundle bundle3 = bundle2;
                String str5 = str3;
                int zza2 = zza(str, str5, str4, bundle.get(str4), bundle3, list2, z3, zzau);
                str3 = str5;
                bundle2 = bundle3;
                if (zza2 == 17) {
                    zzJ(bundle2, 17, str4, str4, Boolean.FALSE);
                } else if (zza2 != 0 && !"_ev".equals(str4)) {
                    zzJ(bundle2, zza2, zza2 == 21 ? str3 : str4, str4, bundle.get(str4));
                    bundle2.remove(str4);
                }
                if (zzak(str4) && (i = i + 1) > zzc) {
                    this.zzt.zzaA().zze().zzc(w.i(zzc, "Event can't contain more than ", " params"), this.zzt.zzj().zzd(str3), this.zzt.zzj().zzb(bundle));
                    zzaq(bundle2, 5);
                    bundle2.remove(str4);
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final zzau zzz(String str, String str2, Bundle bundle, String str3, long j4, boolean z3, boolean z4) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzh(str2) != 0) {
            this.zzt.zzaA().zzd().zzb("Invalid conditional property event name", this.zzt.zzj().zzf(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle zzu = zzu(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        if (z3) {
            zzu = zzt(zzu);
        }
        Preconditions.checkNotNull(zzu);
        return new zzau(str2, new zzas(zzu), str3, j4);
    }
}
