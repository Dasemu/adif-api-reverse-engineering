package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzma implements zzmu {
    private static final zzmg zza = new zzly();
    private final zzmg zzb;

    public zzma() {
        zzmg zzmgVar;
        zzkw zza2 = zzkw.zza();
        try {
            zzmgVar = (zzmg) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzmgVar = zza;
        }
        zzlz zzlzVar = new zzlz(zza2, zzmgVar);
        byte[] bArr = zzlj.zzd;
        this.zzb = zzlzVar;
    }

    private static boolean zzb(zzmf zzmfVar) {
        return zzmfVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final zzmt zza(Class cls) {
        zzmv.zzC(cls);
        zzmf zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? zzlb.class.isAssignableFrom(cls) ? zzmm.zzc(zzmv.zzz(), zzkq.zzb(), zzb.zza()) : zzmm.zzc(zzmv.zzy(), zzkq.zza(), zzb.zza()) : zzlb.class.isAssignableFrom(cls) ? zzb(zzb) ? zzml.zzl(cls, zzb, zzmo.zzb(), zzlw.zzd(), zzmv.zzz(), zzkq.zzb(), zzme.zzb()) : zzml.zzl(cls, zzb, zzmo.zzb(), zzlw.zzd(), zzmv.zzz(), null, zzme.zzb()) : zzb(zzb) ? zzml.zzl(cls, zzb, zzmo.zza(), zzlw.zzc(), zzmv.zzy(), zzkq.zza(), zzme.zza()) : zzml.zzl(cls, zzb, zzmo.zza(), zzlw.zzc(), zzmv.zzy(), null, zzme.zza());
    }
}
