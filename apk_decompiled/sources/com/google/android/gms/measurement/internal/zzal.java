package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* loaded from: classes3.dex */
public final class zzal {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r0 == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zza(com.google.android.gms.measurement.internal.zzet r12, android.database.sqlite.SQLiteDatabase r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String[] r17) throws android.database.sqlite.SQLiteException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(com.google.android.gms.measurement.internal.zzet, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void zzb(zzet zzetVar, SQLiteDatabase sQLiteDatabase) {
        if (zzetVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            zzetVar.zzk().zza("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzetVar.zzk().zza("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzetVar.zzk().zza("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzetVar.zzk().zza("Failed to turn on database write permission for owner");
    }
}
