package com.google.android.gms.measurement.internal;

import C.w;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.test.TestBuildersKt;

/* loaded from: classes3.dex */
public final class zzjz extends zzf {
    private final zzjy zza;
    private zzej zzb;
    private volatile Boolean zzc;
    private final zzan zzd;
    private final zzkq zze;
    private final List zzf;
    private final zzan zzg;

    public zzjz(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzf = new ArrayList();
        this.zze = new zzkq(zzgdVar.zzax());
        this.zza = new zzjy(this);
        this.zzd = new zzjj(this, zzgdVar);
        this.zzg = new zzjl(this, zzgdVar);
    }

    private final zzq zzO(boolean z3) {
        Pair zza;
        this.zzt.zzay();
        zzek zzh = this.zzt.zzh();
        String str = null;
        if (z3) {
            zzet zzaA = this.zzt.zzaA();
            if (zzaA.zzt.zzm().zzb != null && (zza = zzaA.zzt.zzm().zzb.zza()) != null && zza != zzfi.zza) {
                str = String.valueOf(zza.second) + ":" + ((String) zza.first);
            }
        }
        return zzh.zzj(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP() {
        zzg();
        this.zzt.zzaA().zzj().zzb("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e4) {
                this.zzt.zzaA().zzd().zzb("Task exception while flushing queue", e4);
            }
        }
        this.zzf.clear();
        this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ() {
        zzg();
        this.zze.zzb();
        zzan zzanVar = this.zzd;
        this.zzt.zzf();
        zzanVar.zzd(((Long) zzeg.zzJ.zza(null)).longValue());
    }

    private final void zzR(Runnable runnable) throws IllegalStateException {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        long size = this.zzf.size();
        this.zzt.zzf();
        if (size >= 1000) {
            w.v(this.zzt, "Discarding data. Max runnable queue size reached");
            return;
        }
        this.zzf.add(runnable);
        this.zzg.zzd(TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS);
        zzr();
    }

    private final boolean zzS() {
        this.zzt.zzay();
        return true;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzjz zzjzVar, ComponentName componentName) {
        zzjzVar.zzg();
        if (zzjzVar.zzb != null) {
            zzjzVar.zzb = null;
            zzjzVar.zzt.zzaA().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzjzVar.zzg();
            zzjzVar.zzr();
        }
    }

    public final void zzA(zzau zzauVar, String str) {
        Preconditions.checkNotNull(zzauVar);
        zzg();
        zza();
        zzS();
        zzR(new zzjo(this, true, zzO(true), this.zzt.zzi().zzo(zzauVar), zzauVar, str));
    }

    public final void zzB(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzau zzauVar, String str) {
        zzg();
        zza();
        if (this.zzt.zzv().zzo(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0) {
            zzR(new zzjk(this, zzauVar, str, zzcfVar));
        } else {
            w.A(this.zzt, "Not bundling data. Service unavailable or out of date");
            this.zzt.zzv().zzT(zzcfVar, new byte[0]);
        }
    }

    public final void zzC() {
        zzg();
        zza();
        zzq zzO = zzO(false);
        zzS();
        this.zzt.zzi().zzj();
        zzR(new zzjd(this, zzO));
    }

    public final void zzD(zzej zzejVar, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int i;
        zzg();
        zza();
        zzS();
        this.zzt.zzf();
        int i4 = 0;
        int i5 = 100;
        while (i4 < 1001 && i5 == 100) {
            ArrayList arrayList = new ArrayList();
            List zzi = this.zzt.zzi().zzi(100);
            if (zzi != null) {
                arrayList.addAll(zzi);
                i = zzi.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i6);
                if (abstractSafeParcelable2 instanceof zzau) {
                    try {
                        zzejVar.zzk((zzau) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e4) {
                        this.zzt.zzaA().zzd().zzb("Failed to send event to the service", e4);
                    }
                } else if (abstractSafeParcelable2 instanceof zzlk) {
                    try {
                        zzejVar.zzt((zzlk) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e5) {
                        this.zzt.zzaA().zzd().zzb("Failed to send user property to the service", e5);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        zzejVar.zzn((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e6) {
                        this.zzt.zzaA().zzd().zzb("Failed to send conditional user property to the service", e6);
                    }
                } else {
                    w.v(this.zzt, "Discarding data. Unrecognized parcel type.");
                }
            }
            i4++;
            i5 = i;
        }
    }

    public final void zzE(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zza();
        this.zzt.zzay();
        zzR(new zzjp(this, true, zzO(true), this.zzt.zzi().zzn(zzacVar), new zzac(zzacVar), zzacVar));
    }

    public final void zzF(boolean z3) {
        zzg();
        zza();
        if (z3) {
            zzS();
            this.zzt.zzi().zzj();
        }
        if (zzM()) {
            zzR(new zzjn(this, zzO(false)));
        }
    }

    public final void zzG(zzir zzirVar) {
        zzg();
        zza();
        zzR(new zzjh(this, zzirVar));
    }

    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        zzR(new zzji(this, zzO(false), bundle));
    }

    public final void zzI() {
        zzg();
        zza();
        zzR(new zzjm(this, zzO(true)));
    }

    public final void zzJ(zzej zzejVar) {
        zzg();
        Preconditions.checkNotNull(zzejVar);
        this.zzb = zzejVar;
        zzQ();
        zzP();
    }

    public final void zzK(zzlk zzlkVar) {
        zzg();
        zza();
        zzS();
        zzR(new zzjc(this, zzO(true), this.zzt.zzi().zzp(zzlkVar), zzlkVar));
    }

    public final boolean zzL() {
        zzg();
        zza();
        return this.zzb != null;
    }

    public final boolean zzM() {
        zzg();
        zza();
        return !zzN() || this.zzt.zzv().zzm() >= ((Integer) zzeg.zzah.zza(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzN() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjz.zzN():boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final Boolean zzj() {
        return this.zzc;
    }

    public final void zzq() {
        zzg();
        zza();
        zzq zzO = zzO(true);
        this.zzt.zzi().zzk();
        zzR(new zzjg(this, zzO));
    }

    public final void zzr() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        if (zzN()) {
            this.zza.zzc();
            return;
        }
        if (this.zzt.zzf().zzx()) {
            return;
        }
        this.zzt.zzay();
        List<ResolveInfo> queryIntentServices = this.zzt.zzaw().getPackageManager().queryIntentServices(new Intent().setClassName(this.zzt.zzaw(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            w.v(this.zzt, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzay();
        intent.setComponent(new ComponentName(zzaw, "com.google.android.gms.measurement.AppMeasurementService"));
        this.zza.zzb(intent);
    }

    public final void zzs() {
        zzg();
        zza();
        this.zza.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzt.zzaw(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final void zzt(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzg();
        zza();
        zzR(new zzjf(this, zzO(false), zzcfVar));
    }

    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        zzR(new zzje(this, atomicReference, zzO(false)));
    }

    public final void zzv(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        zzg();
        zza();
        zzR(new zzjr(this, str, str2, zzO(false), zzcfVar));
    }

    public final void zzw(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zza();
        zzR(new zzjq(this, atomicReference, null, str2, str3, zzO(false)));
    }

    public final void zzx(AtomicReference atomicReference, boolean z3) {
        zzg();
        zza();
        zzR(new zzjb(this, atomicReference, zzO(false), z3));
    }

    public final void zzy(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z3) {
        zzg();
        zza();
        zzR(new zzja(this, str, str2, zzO(false), z3, zzcfVar));
    }

    public final void zzz(AtomicReference atomicReference, String str, String str2, String str3, boolean z3) {
        zzg();
        zza();
        zzR(new zzjs(this, atomicReference, null, str2, str3, zzO(false), z3));
    }
}
