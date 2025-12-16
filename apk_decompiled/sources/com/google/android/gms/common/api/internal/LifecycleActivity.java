package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.fragment.app.P;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* loaded from: classes3.dex */
public class LifecycleActivity {
    private final Object zza;

    public LifecycleActivity(Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zza = activity;
    }

    public final Activity zza() {
        return (Activity) this.zza;
    }

    public final P zzb() {
        return (P) this.zza;
    }

    public final boolean zzc() {
        return this.zza instanceof Activity;
    }

    public final boolean zzd() {
        return this.zza instanceof P;
    }

    @KeepForSdk
    public LifecycleActivity(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
