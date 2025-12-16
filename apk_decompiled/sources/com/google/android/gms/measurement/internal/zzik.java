package com.google.android.gms.measurement.internal;

import C.w;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;
import s.j;

/* loaded from: classes3.dex */
public final class zzik extends zzf {
    protected zzij zza;
    final zzs zzb;
    protected boolean zzc;
    private zzhf zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private zzhb zzi;
    private final AtomicLong zzj;
    private long zzk;
    private final zzlo zzl;

    public zzik(zzgd zzgdVar) {
        super(zzgdVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzl = new zzhz(this);
        this.zzg = new AtomicReference();
        this.zzi = zzhb.zza;
        this.zzk = -1L;
        this.zzj = new AtomicLong(0L);
        this.zzb = new zzs(zzgdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(Boolean bool, boolean z3) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzt.zzm().zzh(bool);
        if (z3) {
            zzfi zzm = this.zzt.zzm();
            zzgd zzgdVar = zzm.zzt;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.zza().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.zzt.zzK() || !(bool == null || bool.booleanValue())) {
            zzab();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzab() {
        zzik zzikVar;
        zzg();
        String zza = this.zzt.zzm().zzh.zza();
        if (zza == null) {
            zzikVar = this;
        } else if ("unset".equals(zza)) {
            zzikVar = this;
            zzikVar.zzY("app", "_npa", null, this.zzt.zzax().currentTimeMillis());
        } else {
            zzikVar = this;
            zzikVar.zzY("app", "_npa", Long.valueOf(true != "true".equals(zza) ? 0L : 1L), zzikVar.zzt.zzax().currentTimeMillis());
        }
        if (!zzikVar.zzt.zzJ() || !zzikVar.zzc) {
            zzikVar.zzt.zzaA().zzc().zza("Updating Scion state (FE)");
            zzikVar.zzt.zzt().zzI();
            return;
        }
        zzikVar.zzt.zzaA().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzikVar.zzz();
        zzph.zzc();
        if (zzikVar.zzt.zzf().zzs(null, zzeg.zzaf)) {
            zzikVar.zzt.zzu().zza.zza();
        }
        zzikVar.zzt.zzaB().zzp(new zzhn(zzikVar));
    }

    public static /* bridge */ /* synthetic */ void zzv(zzik zzikVar, zzhb zzhbVar, zzhb zzhbVar2) {
        zzha[] zzhaVarArr = {zzha.ANALYTICS_STORAGE, zzha.AD_STORAGE};
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= 2) {
                break;
            }
            zzha zzhaVar = zzhaVarArr[i];
            if (!zzhbVar2.zzj(zzhaVar) && zzhbVar.zzj(zzhaVar)) {
                z3 = true;
                break;
            }
            i++;
        }
        boolean zzn = zzhbVar.zzn(zzhbVar2, zzha.ANALYTICS_STORAGE, zzha.AD_STORAGE);
        if (z3 || zzn) {
            zzikVar.zzt.zzh().zzo();
        }
    }

    public static /* synthetic */ void zzw(zzik zzikVar, zzhb zzhbVar, long j4, boolean z3, boolean z4) {
        zzikVar.zzg();
        zzikVar.zza();
        zzhb zzc = zzikVar.zzt.zzm().zzc();
        if (j4 <= zzikVar.zzk && zzhb.zzk(zzc.zza(), zzhbVar.zza())) {
            zzikVar.zzt.zzaA().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzhbVar);
            return;
        }
        zzfi zzm = zzikVar.zzt.zzm();
        zzgd zzgdVar = zzm.zzt;
        zzm.zzg();
        int zza = zzhbVar.zza();
        if (!zzm.zzl(zza)) {
            zzikVar.zzt.zzaA().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzhbVar.zza()));
            return;
        }
        SharedPreferences.Editor edit = zzm.zza().edit();
        edit.putString("consent_settings", zzhbVar.zzi());
        edit.putInt("consent_source", zza);
        edit.apply();
        zzikVar.zzk = j4;
        zzikVar.zzt.zzt().zzF(z3);
        if (z4) {
            zzikVar.zzt.zzt().zzu(new AtomicReference());
        }
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzt.zzaB().zzp(new zzhu(this, bundle2));
    }

    public final void zzB() {
        if (!(this.zzt.zzaw().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzt.zzaw().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzt.zzm().zzs.zzb(new Bundle());
            return;
        }
        Bundle zza = this.zzt.zzm().zzs.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzt.zzv().zzag(obj)) {
                    this.zzt.zzv().zzO(this.zzl, null, 27, null, null, 0);
                }
                this.zzt.zzaA().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzlp.zzaj(str)) {
                this.zzt.zzaA().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else {
                zzlp zzv = this.zzt.zzv();
                this.zzt.zzf();
                if (zzv.zzab("param", str, 100, obj)) {
                    this.zzt.zzv().zzP(zza, str, obj);
                }
            }
        }
        this.zzt.zzv();
        int zzc = this.zzt.zzf().zzc();
        if (zza.size() > zzc) {
            Iterator it = new TreeSet(zza.keySet()).iterator();
            int i = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                i++;
                if (i > zzc) {
                    zza.remove(str2);
                }
            }
            this.zzt.zzv().zzO(this.zzl, null, 26, null, null, 0);
            this.zzt.zzaA().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzt.zzm().zzs.zzb(zza);
        this.zzt.zzt().zzH(zza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z3, boolean z4, long j4) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (str2 == FirebaseAnalytics.Event.SCREEN_VIEW || (str2 != null && str2.equals(FirebaseAnalytics.Event.SCREEN_VIEW))) {
            this.zzt.zzs().zzx(bundle2, j4);
            return;
        }
        boolean z5 = true;
        if (z4 && this.zzd != null && !zzlp.zzaj(str2)) {
            z5 = false;
        }
        boolean z6 = z5;
        if (str == null) {
            str = "app";
        }
        zzM(str, str2, j4, bundle2, z4, z6, z3, null);
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzgd.zzO();
        zzM(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str2, this.zzt.zzax().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        zzH(str, str2, this.zzt.zzax().currentTimeMillis(), bundle);
    }

    public final void zzH(String str, String str2, long j4, Bundle bundle) {
        zzg();
        boolean z3 = true;
        if (this.zzd != null && !zzlp.zzaj(str2)) {
            z3 = false;
        }
        zzI(str, str2, j4, bundle, true, z3, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzI(String str, String str2, long j4, Bundle bundle, boolean z3, boolean z4, boolean z5, String str3) {
        boolean z6;
        int i;
        long j5;
        long j6;
        String str4;
        int i4;
        String str5;
        long j7;
        Bundle[] bundleArr;
        String str6 = str;
        Preconditions.checkNotEmpty(str6);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (!this.zzt.zzJ()) {
            this.zzt.zzaA().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List zzn = this.zzt.zzh().zzn();
        if (zzn != null && !zzn.contains(str2)) {
            this.zzt.zzaA().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str6);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!this.zzt.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzt.zzaw().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzt.zzaw());
                } catch (Exception e4) {
                    this.zzt.zzaA().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e4);
                }
            } catch (ClassNotFoundException unused) {
                this.zzt.zzaA().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.zzt.zzay();
            zzY(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lgclid", bundle.getString("gclid"), this.zzt.zzax().currentTimeMillis());
        }
        zzik zzikVar = this;
        zzikVar.zzt.zzay();
        if (z3 && zzlp.zzan(str2)) {
            zzikVar.zzt.zzv().zzL(bundle, zzikVar.zzt.zzm().zzs.zza());
        }
        if (!z5) {
            zzikVar.zzt.zzay();
            if (!"_iap".equals(str2)) {
                zzlp zzv = zzikVar.zzt.zzv();
                int i5 = 2;
                if (zzv.zzad("event", str2)) {
                    if (zzv.zzaa("event", zzhc.zza, zzhc.zzb, str2)) {
                        zzv.zzt.zzf();
                        if (zzv.zzZ("event", 40, str2)) {
                            i5 = 0;
                        }
                    } else {
                        i5 = 13;
                    }
                }
                if (i5 != 0) {
                    zzikVar.zzt.zzaA().zze().zzb("Invalid public event name. Event will not be logged (FE)", zzikVar.zzt.zzj().zzd(str2));
                    zzlp zzv2 = zzikVar.zzt.zzv();
                    zzikVar.zzt.zzf();
                    zzikVar.zzt.zzv().zzO(zzikVar.zzl, null, i5, "_ev", zzv2.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzikVar.zzt.zzay();
        zzir zzj = zzikVar.zzt.zzs().zzj(false);
        if (zzj != null && !bundle.containsKey("_sc")) {
            zzj.zzd = true;
        }
        zzlp.zzK(zzj, bundle, z3 && !z5);
        boolean equals = "am".equals(str6);
        boolean zzaj = zzlp.zzaj(str2);
        if (!z3 || zzikVar.zzd == null || zzaj) {
            z6 = equals;
        } else {
            if (!equals) {
                zzikVar.zzt.zzaA().zzc().zzc("Passing event to registered event handler (FE)", zzikVar.zzt.zzj().zzd(str2), zzikVar.zzt.zzj().zzb(bundle));
                Preconditions.checkNotNull(zzikVar.zzd);
                zzikVar.zzd.interceptEvent(str6, str2, bundle, j4);
                return;
            }
            z6 = true;
        }
        if (zzikVar.zzt.zzM()) {
            int zzh = zzikVar.zzt.zzv().zzh(str2);
            if (zzh != 0) {
                zzikVar.zzt.zzaA().zze().zzb("Invalid event name. Event will not be logged (FE)", zzikVar.zzt.zzj().zzd(str2));
                zzlp zzv3 = zzikVar.zzt.zzv();
                zzikVar.zzt.zzf();
                zzikVar.zzt.zzv().zzO(zzikVar.zzl, str3, zzh, "_ev", zzv3.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle zzu = zzikVar.zzt.zzv().zzu(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z5);
            Preconditions.checkNotNull(zzu);
            zzikVar.zzt.zzay();
            if (zzikVar.zzt.zzs().zzj(false) == null || !"_ae".equals(str2)) {
                i = 0;
                j5 = 0;
            } else {
                zzkn zzknVar = zzikVar.zzt.zzu().zzb;
                j5 = 0;
                long elapsedRealtime = zzknVar.zzc.zzt.zzax().elapsedRealtime();
                i = 0;
                long j8 = elapsedRealtime - zzknVar.zzb;
                zzknVar.zzb = elapsedRealtime;
                if (j8 > 0) {
                    zzikVar.zzt.zzv().zzI(zzu, j8);
                }
            }
            zzos.zzc();
            if (zzikVar.zzt.zzf().zzs(null, zzeg.zzae)) {
                if (!DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str6) && "_ssr".equals(str2)) {
                    zzlp zzv4 = zzikVar.zzt.zzv();
                    String string = zzu.getString("_ffr");
                    if (Strings.isEmptyOrWhitespace(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (zzln.zza(string, zzv4.zzt.zzm().zzp.zza())) {
                        zzv4.zzt.zzaA().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    zzv4.zzt.zzm().zzp.zzb(string);
                } else if ("_ae".equals(str2)) {
                    String zza = zzikVar.zzt.zzv().zzt.zzm().zzp.zza();
                    if (!TextUtils.isEmpty(zza)) {
                        zzu.putString("_ffr", zza);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzu);
            boolean zzo = zzikVar.zzt.zzf().zzs(null, zzeg.zzaG) ? zzikVar.zzt.zzu().zzo() : zzikVar.zzt.zzm().zzm.zzb();
            if (zzikVar.zzt.zzm().zzj.zza() <= j5) {
                j6 = j5;
                str4 = "_ae";
                i4 = i;
                str5 = "_o";
                j7 = j4;
            } else if (zzikVar.zzt.zzm().zzk(j4) && zzo) {
                a.y(zzikVar.zzt, "Current session is expired, remove the session number, ID, and engagement time");
                j6 = j5;
                str4 = "_ae";
                i4 = i;
                str5 = "_o";
                j7 = j4;
                zzikVar.zzY(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", null, zzikVar.zzt.zzax().currentTimeMillis());
                zzikVar.zzY(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sno", null, zzikVar.zzt.zzax().currentTimeMillis());
                zzikVar.zzY(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_se", null, zzikVar.zzt.zzax().currentTimeMillis());
                zzikVar = zzikVar;
                zzikVar.zzt.zzm().zzk.zzb(j6);
            } else {
                j6 = j5;
                str4 = "_ae";
                i4 = i;
                str5 = "_o";
                j7 = j4;
            }
            if (zzu.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j6) == 1) {
                a.y(zzikVar.zzt, "EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                zzikVar.zzt.zzu().zza.zzb(j7, true);
            }
            ArrayList arrayList2 = new ArrayList(zzu.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i6 = i4; i6 < size; i6++) {
                String str7 = (String) arrayList2.get(i6);
                if (str7 != null) {
                    zzikVar.zzt.zzv();
                    Object obj = zzu.get(str7);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i4] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        zzu.putParcelableArray(str7, bundleArr);
                    }
                }
            }
            int i7 = i4;
            while (i7 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i7);
                String str8 = i7 != 0 ? "_ep" : str2;
                bundle2.putString(str5, str6);
                if (z4) {
                    bundle2 = zzikVar.zzt.zzv().zzt(bundle2);
                }
                Bundle bundle3 = bundle2;
                zzikVar.zzt.zzt().zzA(new zzau(str8, new zzas(bundle3), str6, j7), str3);
                if (!z6) {
                    Iterator it = zzikVar.zze.iterator();
                    while (it.hasNext()) {
                        ((zzhg) it.next()).onEvent(str, str2, new Bundle(bundle3), j4);
                    }
                }
                i7++;
                str6 = str;
                j7 = j4;
            }
            zzikVar.zzt.zzay();
            if (zzikVar.zzt.zzs().zzj(i4) == null || !str4.equals(str2)) {
                return;
            }
            zzikVar.zzt.zzu().zzb.zzd(true, true, zzikVar.zzt.zzax().elapsedRealtime());
        }
    }

    public final void zzJ(zzhg zzhgVar) {
        zza();
        Preconditions.checkNotNull(zzhgVar);
        if (this.zze.add(zzhgVar)) {
            return;
        }
        w.A(this.zzt, "OnEventListener already registered");
    }

    public final void zzK(long j4) {
        this.zzg.set(null);
        this.zzt.zzaB().zzp(new zzhs(this, j4));
    }

    public final void zzL(long j4, boolean z3) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zza("Resetting analytics data (FE)");
        zzkp zzu = this.zzt.zzu();
        zzu.zzg();
        zzu.zzb.zza();
        zzqu.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzan)) {
            this.zzt.zzh().zzo();
        }
        boolean zzJ = this.zzt.zzJ();
        zzfi zzm = this.zzt.zzm();
        zzm.zzc.zzb(j4);
        if (!TextUtils.isEmpty(zzm.zzt.zzm().zzp.zza())) {
            zzm.zzp.zzb(null);
        }
        zzph.zzc();
        zzag zzf = zzm.zzt.zzf();
        zzef zzefVar = zzeg.zzaf;
        if (zzf.zzs(null, zzefVar)) {
            zzm.zzj.zzb(0L);
        }
        zzm.zzk.zzb(0L);
        if (!zzm.zzt.zzf().zzv()) {
            zzm.zzi(!zzJ);
        }
        zzm.zzq.zzb(null);
        zzm.zzr.zzb(0L);
        zzm.zzs.zzb(null);
        if (z3) {
            this.zzt.zzt().zzC();
        }
        zzph.zzc();
        if (this.zzt.zzf().zzs(null, zzefVar)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzc = !zzJ;
    }

    public final void zzM(String str, String str2, long j4, Bundle bundle, boolean z3, boolean z4, boolean z5, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.zzt.zzaB().zzp(new zzhp(this, str, str2, j4, bundle2, z3, z4, z5, str3));
    }

    public final void zzN(String str, String str2, long j4, Object obj) {
        this.zzt.zzaB().zzp(new zzhq(this, str, str2, obj, j4));
    }

    public final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j4) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            w.A(this.zzt, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgz.zza(bundle2, "app_id", String.class, null);
        zzgz.zza(bundle2, "origin", String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null);
        zzgz.zza(bundle2, "value", Object.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j4);
        String string = bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        Object obj = bundle2.get("value");
        if (this.zzt.zzv().zzl(string) != 0) {
            this.zzt.zzaA().zzd().zzb("Invalid conditional user property name", this.zzt.zzj().zzf(string));
            return;
        }
        if (this.zzt.zzv().zzd(string, obj) != 0) {
            this.zzt.zzaA().zzd().zzc("Invalid conditional user property value", this.zzt.zzj().zzf(string), obj);
            return;
        }
        Object zzB = this.zzt.zzv().zzB(string, obj);
        if (zzB == null) {
            this.zzt.zzaA().zzd().zzc("Unable to normalize conditional user property value", this.zzt.zzj().zzf(string), obj);
            return;
        }
        zzgz.zzb(bundle2, zzB);
        long j5 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            this.zzt.zzf();
            if (j5 > 15552000000L || j5 < 1) {
                this.zzt.zzaA().zzd().zzc("Invalid conditional user property timeout", this.zzt.zzj().zzf(string), Long.valueOf(j5));
                return;
            }
        }
        long j6 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        this.zzt.zzf();
        if (j6 > 15552000000L || j6 < 1) {
            this.zzt.zzaA().zzd().zzc("Invalid conditional user property time to live", this.zzt.zzj().zzf(string), Long.valueOf(j6));
        } else {
            this.zzt.zzaB().zzp(new zzht(this, bundle2));
        }
    }

    public final void zzR(zzhb zzhbVar, long j4) {
        zzhb zzhbVar2;
        boolean z3;
        boolean z4;
        boolean z5;
        zzhb zzhbVar3;
        zza();
        int zza = zzhbVar.zza();
        if (zza != -10 && zzhbVar.zzf() == null && zzhbVar.zzg() == null) {
            this.zzt.zzaA().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            try {
                zzhbVar2 = this.zzi;
                z3 = false;
                if (zzhb.zzk(zza, zzhbVar2.zza())) {
                    z4 = zzhbVar.zzm(this.zzi);
                    zzha zzhaVar = zzha.ANALYTICS_STORAGE;
                    if (zzhbVar.zzj(zzhaVar) && !this.zzi.zzj(zzhaVar)) {
                        z3 = true;
                    }
                    zzhbVar = zzhbVar.zze(this.zzi);
                    this.zzi = zzhbVar;
                    z5 = z3;
                    z3 = true;
                } else {
                    z4 = false;
                    z5 = false;
                }
                zzhbVar3 = zzhbVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z3) {
            this.zzt.zzaA().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzhbVar3);
            return;
        }
        long andIncrement = this.zzj.getAndIncrement();
        if (z4) {
            this.zzg.set(null);
            this.zzt.zzaB().zzq(new zzif(this, zzhbVar3, j4, andIncrement, z5, zzhbVar2));
            return;
        }
        zzig zzigVar = new zzig(this, zzhbVar3, andIncrement, z5, zzhbVar2);
        if (zza == 30 || zza == -10) {
            this.zzt.zzaB().zzq(zzigVar);
        } else {
            this.zzt.zzaB().zzp(zzigVar);
        }
    }

    public final void zzS(Bundle bundle, int i, long j4) {
        zza();
        String zzh = zzhb.zzh(bundle);
        if (zzh != null) {
            this.zzt.zzaA().zzl().zzb("Ignoring invalid consent setting", zzh);
            this.zzt.zzaA().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzR(zzhb.zzb(bundle, i), j4);
    }

    public final void zzT(zzhf zzhfVar) {
        zzhf zzhfVar2;
        zzg();
        zza();
        if (zzhfVar != null && zzhfVar != (zzhfVar2 = this.zzd)) {
            Preconditions.checkState(zzhfVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzhfVar;
    }

    public final void zzU(Boolean bool) {
        zza();
        this.zzt.zzaB().zzp(new zzie(this, bool));
    }

    public final void zzV(zzhb zzhbVar) {
        zzg();
        boolean z3 = (zzhbVar.zzj(zzha.ANALYTICS_STORAGE) && zzhbVar.zzj(zzha.AD_STORAGE)) || this.zzt.zzt().zzM();
        if (z3 != this.zzt.zzK()) {
            this.zzt.zzG(z3);
            zzfi zzm = this.zzt.zzm();
            zzgd zzgdVar = zzm.zzt;
            zzm.zzg();
            Boolean valueOf = zzm.zza().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzm.zza().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z3 || valueOf == null || valueOf.booleanValue()) {
                zzaa(Boolean.valueOf(z3), false);
            }
        }
    }

    public final void zzW(String str, String str2, Object obj, boolean z3) {
        zzX(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", obj, true, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzX(String str, String str2, Object obj, boolean z3, long j4) {
        int i;
        if (z3) {
            i = this.zzt.zzv().zzl(str2);
        } else {
            zzlp zzv = this.zzt.zzv();
            if (zzv.zzad("user property", str2)) {
                if (zzv.zzaa("user property", zzhe.zza, null, str2)) {
                    zzv.zzt.zzf();
                    if (zzv.zzZ("user property", 24, str2)) {
                        i = 0;
                    }
                } else {
                    i = 15;
                }
            }
            i = 6;
        }
        if (i != 0) {
            zzlp zzv2 = this.zzt.zzv();
            this.zzt.zzf();
            this.zzt.zzv().zzO(this.zzl, null, i, "_ev", zzv2.zzD(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            zzN(str3, str2, j4, null);
            return;
        }
        int zzd = this.zzt.zzv().zzd(str2, obj);
        if (zzd != 0) {
            zzlp zzv3 = this.zzt.zzv();
            this.zzt.zzf();
            this.zzt.zzv().zzO(this.zzl, null, zzd, "_ev", zzv3.zzD(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
        } else {
            Object zzB = this.zzt.zzv().zzB(str2, obj);
            if (zzB != null) {
                zzN(str3, str2, j4, zzB);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzY(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.zzg()
            r8.zza()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L62
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L50
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L50
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            r11 = 1
            java.lang.String r0 = "false"
            boolean r10 = r0.equals(r10)
            r2 = 1
            if (r11 == r10) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.zzgd r5 = r8.zzt
            com.google.android.gms.measurement.internal.zzfi r5 = r5.zzm()
            com.google.android.gms.measurement.internal.zzfh r5 = r5.zzh
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L4a
            java.lang.String r0 = "true"
        L4a:
            r5.zzb(r0)
            r3 = r1
            r6 = r4
            goto L64
        L50:
            if (r11 != 0) goto L62
            com.google.android.gms.measurement.internal.zzgd r10 = r8.zzt
            com.google.android.gms.measurement.internal.zzfi r10 = r10.zzm()
            com.google.android.gms.measurement.internal.zzfh r10 = r10.zzh
            java.lang.String r0 = "unset"
            r10.zzb(r0)
            r6 = r11
            r3 = r1
            goto L64
        L62:
            r3 = r10
            r6 = r11
        L64:
            com.google.android.gms.measurement.internal.zzgd r10 = r8.zzt
            boolean r10 = r10.zzJ()
            if (r10 != 0) goto L74
            com.google.android.gms.measurement.internal.zzgd r8 = r8.zzt
            java.lang.String r9 = "User property not set since app measurement is disabled"
            com.google.android.gms.measurement.internal.a.y(r8, r9)
            return
        L74:
            com.google.android.gms.measurement.internal.zzgd r10 = r8.zzt
            boolean r10 = r10.zzM()
            if (r10 != 0) goto L7d
            return
        L7d:
            com.google.android.gms.measurement.internal.zzlk r2 = new com.google.android.gms.measurement.internal.zzlk
            r7 = r9
            r4 = r12
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzgd r8 = r8.zzt
            com.google.android.gms.measurement.internal.zzjz r8 = r8.zzt()
            r8.zzK(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzik.zzY(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void zzZ(zzhg zzhgVar) {
        zza();
        Preconditions.checkNotNull(zzhgVar);
        if (this.zze.remove(zzhgVar)) {
            return;
        }
        w.A(this.zzt, "OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzt.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzt.zzaB().zzd(atomicReference, 15000L, "boolean test flag value", new zzhw(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzt.zzaB().zzd(atomicReference, 15000L, "double test flag value", new zzid(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzt.zzaB().zzd(atomicReference, 15000L, "int test flag value", new zzic(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzt.zzaB().zzd(atomicReference, 15000L, "long test flag value", new zzib(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zzir zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzir zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzt.zzaB().zzd(atomicReference, 15000L, "String test flag value", new zzia(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, 5000L, "get conditional user properties", new zzhv(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzlp.zzH(list);
        }
        this.zzt.zzaA().zzd().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final List zzt(boolean z3) {
        zza();
        a.y(this.zzt, "Getting user properties (FE)");
        if (this.zzt.zzaB().zzs()) {
            w.v(this.zzt, "Cannot get all user properties from analytics worker thread");
            return Collections.EMPTY_LIST;
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            w.v(this.zzt, "Cannot get all user properties from main thread");
            return Collections.EMPTY_LIST;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, 5000L, "get user properties", new zzhr(this, atomicReference, z3));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        this.zzt.zzaA().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z3));
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map, s.j] */
    public final Map zzu(String str, String str2, boolean z3) {
        if (this.zzt.zzaB().zzs()) {
            w.v(this.zzt, "Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            w.v(this.zzt, "Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, 5000L, "get user properties", new zzhx(this, atomicReference, null, str, str2, z3));
        List<zzlk> list = (List) atomicReference.get();
        if (list == null) {
            this.zzt.zzaA().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z3));
            return Collections.EMPTY_MAP;
        }
        ?? jVar = new j(list.size());
        for (zzlk zzlkVar : list) {
            Object zza = zzlkVar.zza();
            if (zza != null) {
                jVar.put(zzlkVar.zzb, zza);
            }
        }
        return jVar;
    }

    public final void zzz() {
        zzg();
        zza();
        if (this.zzt.zzM()) {
            if (this.zzt.zzf().zzs(null, zzeg.zzZ)) {
                zzag zzf = this.zzt.zzf();
                zzf.zzt.zzay();
                Boolean zzk = zzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (zzk != null && zzk.booleanValue()) {
                    this.zzt.zzaA().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzik zzikVar = zzik.this;
                            zzikVar.zzg();
                            if (zzikVar.zzt.zzm().zzn.zzb()) {
                                zzikVar.zzt.zzaA().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long zza = zzikVar.zzt.zzm().zzo.zza();
                            zzikVar.zzt.zzm().zzo.zzb(1 + zza);
                            zzikVar.zzt.zzf();
                            if (zza < 5) {
                                zzikVar.zzt.zzE();
                            } else {
                                w.A(zzikVar.zzt, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zzikVar.zzt.zzm().zzn.zza(true);
                            }
                        }
                    });
                }
            }
            this.zzt.zzt().zzq();
            this.zzc = false;
            zzfi zzm = this.zzt.zzm();
            zzm.zzg();
            String string = zzm.zza().getString("previous_os_version", null);
            zzm.zzt.zzg().zzv();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.zza().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzt.zzg().zzv();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzG(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ou", bundle);
        }
    }
}
