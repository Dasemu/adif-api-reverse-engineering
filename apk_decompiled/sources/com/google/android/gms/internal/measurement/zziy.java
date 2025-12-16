package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zziy extends zzis {
    private final zzja zza;

    public zziy(zzja zzjaVar, int i) {
        super(zzjaVar.size(), i);
        this.zza = zzjaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
