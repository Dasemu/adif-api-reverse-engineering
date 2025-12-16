package com.google.android.gms.measurement.internal;

import C.w;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class zzem extends zzf {
    private final zzel zza;
    private boolean zzb;

    public zzem(zzgd zzgdVar) {
        super(zzgdVar);
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        this.zza = new zzel(this, zzaw, "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzq(int r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzem.zzq(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final SQLiteDatabase zzh() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzi(int r23) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzem.zzi(int):java.util.List");
    }

    public final void zzj() {
        int delete;
        zzg();
        try {
            SQLiteDatabase zzh = zzh();
            if (zzh == null || (delete = zzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzt.zzaA().zzj().zzb("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e4) {
            this.zzt.zzaA().zzd().zzb("Error resetting local analytics data. error", e4);
        }
    }

    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    public final boolean zzl() {
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return zzaw.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean zzm() {
        int i;
        zzg();
        if (!this.zzb && zzl()) {
            int i4 = 5;
            for (0; i < 5; i + 1) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase zzh = zzh();
                            if (zzh == null) {
                                this.zzb = true;
                                return false;
                            }
                            zzh.beginTransaction();
                            zzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            zzh.setTransactionSuccessful();
                            zzh.endTransaction();
                            zzh.close();
                            return true;
                        } catch (SQLiteException e4) {
                            if (0 != 0) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            this.zzt.zzaA().zzd().zzb("Error deleting app launch break from local database", e4);
                            this.zzb = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i4);
                        i4 += 20;
                        i = 0 == 0 ? i + 1 : 0;
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e5) {
                    this.zzt.zzaA().zzd().zzb("Error deleting app launch break from local database", e5);
                    this.zzb = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
            }
            w.A(this.zzt, "Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] zzap = this.zzt.zzv().zzap(zzacVar);
        if (zzap.length <= 131072) {
            return zzq(2, zzap);
        }
        this.zzt.zzaA().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzau zzauVar) {
        Parcel obtain = Parcel.obtain();
        zzav.zza(zzauVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzq(0, marshall);
        }
        this.zzt.zzaA().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzp(zzlk zzlkVar) {
        Parcel obtain = Parcel.obtain();
        zzll.zza(zzlkVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzq(1, marshall);
        }
        this.zzt.zzaA().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
