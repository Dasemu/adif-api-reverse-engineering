package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(14)
/* loaded from: classes3.dex */
public final class zzij implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzik zza;

    public zzij(zzik zzikVar) {
        this.zza = zzikVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.app.Activity r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzij.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzt.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzt.zzs().zzt(activity);
        zzkp zzu = this.zza.zzt.zzu();
        zzu.zzt.zzaB().zzp(new zzki(zzu, zzu.zzt.zzax().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzkp zzu = this.zza.zzt.zzu();
        zzu.zzt.zzaB().zzp(new zzkh(zzu, zzu.zzt.zzax().elapsedRealtime()));
        this.zza.zzt.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzt.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
