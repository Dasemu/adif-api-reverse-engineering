package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
public final class zziz extends zzf {
    protected zzir zza;
    private volatile zzir zzb;
    private volatile zzir zzc;
    private final Map zzd;
    private Activity zze;
    private volatile boolean zzf;
    private volatile zzir zzg;
    private zzir zzh;
    private boolean zzi;
    private final Object zzj;

    public zziz(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzA(zzir zzirVar, zzir zzirVar2, long j4, boolean z3, Bundle bundle) {
        long j5;
        zzg();
        boolean z4 = false;
        boolean z5 = (zzirVar2 != null && zzirVar2.zzc == zzirVar.zzc && zzis.zza(zzirVar2.zzb, zzirVar.zzb) && zzis.zza(zzirVar2.zza, zzirVar.zza)) ? false : true;
        if (z3 && this.zza != null) {
            z4 = true;
        }
        if (z5) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzlp.zzK(zzirVar, bundle2, true);
            if (zzirVar2 != null) {
                String str = zzirVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzirVar2.zzb;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zzirVar2.zzc);
            }
            if (z4) {
                zzkn zzknVar = this.zzt.zzu().zzb;
                long j6 = j4 - zzknVar.zzb;
                zzknVar.zzb = j4;
                if (j6 > 0) {
                    this.zzt.zzv().zzI(bundle2, j6);
                }
            }
            if (!this.zzt.zzf().zzu()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != zzirVar.zze ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : "app";
            long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
            if (zzirVar.zze) {
                long j7 = zzirVar.zzf;
                if (j7 != 0) {
                    j5 = j7;
                    this.zzt.zzq().zzH(str3, "_vs", j5, bundle2);
                }
            }
            j5 = currentTimeMillis;
            this.zzt.zzq().zzH(str3, "_vs", j5, bundle2);
        }
        if (z4) {
            zzB(this.zza, true, j4);
        }
        this.zza = zzirVar;
        if (zzirVar.zze) {
            this.zzh = zzirVar;
        }
        this.zzt.zzt().zzG(zzirVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzB(zzir zzirVar, boolean z3, long j4) {
        this.zzt.zzd().zzf(this.zzt.zzax().elapsedRealtime());
        if (!this.zzt.zzu().zzb.zzd(zzirVar != null && zzirVar.zzd, z3, j4) || zzirVar == null) {
            return;
        }
        zzirVar.zzd = false;
    }

    public static /* bridge */ /* synthetic */ void zzp(zziz zzizVar, Bundle bundle, zzir zzirVar, zzir zzirVar2, long j4) {
        bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
        bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        zzizVar.zzA(zzirVar, zzirVar2, j4, true, zzizVar.zzt.zzv().zzu(null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
    }

    private final zzir zzy(Activity activity) {
        Preconditions.checkNotNull(activity);
        zzir zzirVar = (zzir) this.zzd.get(activity);
        if (zzirVar == null) {
            zzir zzirVar2 = new zzir(null, zzl(activity.getClass(), "Activity"), this.zzt.zzv().zzq());
            this.zzd.put(activity, zzirVar2);
            zzirVar = zzirVar2;
        }
        return this.zzg != null ? this.zzg : zzirVar;
    }

    private final void zzz(Activity activity, zzir zzirVar, boolean z3) {
        zzir zzirVar2;
        zzir zzirVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzirVar.zzb == null) {
            zzirVar2 = new zzir(zzirVar.zza, activity != null ? zzl(activity.getClass(), "Activity") : null, zzirVar.zzc, zzirVar.zze, zzirVar.zzf);
        } else {
            zzirVar2 = zzirVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzirVar2;
        this.zzt.zzaB().zzp(new zziu(this, zzirVar2, zzirVar3, this.zzt.zzax().elapsedRealtime(), z3));
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final zzir zzi() {
        return this.zzb;
    }

    public final zzir zzj(boolean z3) {
        zza();
        zzg();
        if (!z3) {
            return this.zza;
        }
        zzir zzirVar = this.zza;
        return zzirVar != null ? zzirVar : this.zzh;
    }

    public final String zzl(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.zzt.zzf();
        if (length2 <= 100) {
            return str2;
        }
        this.zzt.zzf();
        return str2.substring(0, 100);
    }

    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzt.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzir(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), bundle2.getString("referrer_name"), bundle2.getLong(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN)));
    }

    public final void zzs(Activity activity) {
        synchronized (this.zzj) {
            try {
                if (activity == this.zze) {
                    this.zze = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.zzt.zzf().zzu()) {
            this.zzd.remove(activity);
        }
    }

    public final void zzt(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
        if (!this.zzt.zzf().zzu()) {
            this.zzb = null;
            this.zzt.zzaB().zzp(new zziw(this, elapsedRealtime));
        } else {
            zzir zzy = zzy(activity);
            this.zzc = this.zzb;
            this.zzb = null;
            this.zzt.zzaB().zzp(new zzix(this, zzy, elapsedRealtime));
        }
    }

    public final void zzu(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (this.zzt.zzf().zzu()) {
                    this.zzg = null;
                    this.zzt.zzaB().zzp(new zziy(this));
                }
            }
        }
        if (!this.zzt.zzf().zzu()) {
            this.zzb = this.zzg;
            this.zzt.zzaB().zzp(new zziv(this));
        } else {
            zzz(activity, zzy(activity), false);
            zzd zzd = this.zzt.zzd();
            zzd.zzt.zzaB().zzp(new zzc(zzd, zzd.zzt.zzax().elapsedRealtime()));
        }
    }

    public final void zzv(Activity activity, Bundle bundle) {
        zzir zzirVar;
        if (!this.zzt.zzf().zzu() || bundle == null || (zzirVar = (zzir) this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, zzirVar.zzc);
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, zzirVar.zza);
        bundle2.putString("referrer_name", zzirVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r1 <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r1 <= 100) goto L39;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzw(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.zzgd r0 = r3.zzt
            com.google.android.gms.measurement.internal.zzag r0 = r0.zzf()
            boolean r0 = r0.zzu()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.zzgd r3 = r3.zzt
            com.google.android.gms.measurement.internal.zzet r3 = r3.zzaA()
            com.google.android.gms.measurement.internal.zzer r3 = r3.zzl()
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r3.zza(r4)
            return
        L1c:
            com.google.android.gms.measurement.internal.zzir r0 = r3.zzb
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.zzgd r3 = r3.zzt
            com.google.android.gms.measurement.internal.zzet r3 = r3.zzaA()
            com.google.android.gms.measurement.internal.zzer r3 = r3.zzl()
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            r3.zza(r4)
            return
        L30:
            java.util.Map r1 = r3.zzd
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.zzgd r3 = r3.zzt
            com.google.android.gms.measurement.internal.zzet r3 = r3.zzaA()
            com.google.android.gms.measurement.internal.zzer r3 = r3.zzl()
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r3.zza(r4)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.zzl(r6, r1)
        L54:
            java.lang.String r1 = r0.zzb
            boolean r1 = com.google.android.gms.measurement.internal.zzis.zza(r1, r6)
            java.lang.String r0 = r0.zza
            boolean r0 = com.google.android.gms.measurement.internal.zzis.zza(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.zzgd r3 = r3.zzt
            com.google.android.gms.measurement.internal.zzet r3 = r3.zzaA()
            com.google.android.gms.measurement.internal.zzer r3 = r3.zzl()
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
            r3.zza(r4)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            int r1 = r5.length()
            com.google.android.gms.measurement.internal.zzgd r2 = r3.zzt
            r2.zzf()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.zzgd r3 = r3.zzt
            com.google.android.gms.measurement.internal.zzet r3 = r3.zzaA()
            com.google.android.gms.measurement.internal.zzer r3 = r3.zzl()
            int r4 = r5.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
            r3.zzb(r5, r4)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            int r1 = r6.length()
            com.google.android.gms.measurement.internal.zzgd r2 = r3.zzt
            r2.zzf()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.zzgd r3 = r3.zzt
            com.google.android.gms.measurement.internal.zzet r3 = r3.zzaA()
            com.google.android.gms.measurement.internal.zzer r3 = r3.zzl()
            int r4 = r6.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
            r3.zzb(r5, r4)
            return
        Lcf:
            com.google.android.gms.measurement.internal.zzgd r0 = r3.zzt
            com.google.android.gms.measurement.internal.zzet r0 = r0.zzaA()
            com.google.android.gms.measurement.internal.zzer r0 = r0.zzj()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.zzc(r2, r1, r6)
            com.google.android.gms.measurement.internal.zzir r0 = new com.google.android.gms.measurement.internal.zzir
            com.google.android.gms.measurement.internal.zzgd r1 = r3.zzt
            com.google.android.gms.measurement.internal.zzlp r1 = r1.zzv()
            long r1 = r1.zzq()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.zzd
            r5.put(r4, r0)
            r5 = 1
            r3.zzz(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziz.zzw(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r2 > 100) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r4 > 100) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzx(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziz.zzx(android.os.Bundle, long):void");
    }
}
