package com.google.android.gms.measurement.internal;

import C.w;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzel extends SQLiteOpenHelper {
    final /* synthetic */ zzem zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzem zzemVar, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzemVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e4) {
            throw e4;
        } catch (SQLiteException unused) {
            w.v(this.zza.zzt, "Opening the local database failed, dropping and recreating it");
            this.zza.zzt.zzf();
            if (!this.zza.zzt.zzaw().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.zza.zzt.zzaA().zzd().zzb("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e5) {
                this.zza.zzt.zzaA().zzd().zzb("Failed to open local database. Events will bypass local storage", e5);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzal.zzb(this.zza.zzt.zzaA(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i4) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        zzal.zza(this.zza.zzt.zzaA(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i4) {
    }
}
