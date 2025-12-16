package com.google.android.gms.measurement.internal;

import C.w;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.adif.elcanomovil.repositories.circulation.CirculationMapper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzak extends zzku {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzaj zzj;
    private final zzkq zzk;

    public zzak(zzlh zzlhVar) {
        super(zzlhVar);
        this.zzk = new zzkq(this.zzt.zzax());
        this.zzt.zzf();
        this.zzj = new zzaj(this, this.zzt.zzaw(), "google_app_measurement.db");
    }

    public static final void zzV(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    private final long zzZ(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzh().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j4 = rawQuery.getLong(0);
                rawQuery.close();
                return j4;
            } catch (SQLiteException e4) {
                this.zzt.zzaA().zzd().zzc("Database error", str, e4);
                throw e4;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zzaa(String str, String[] strArr, long j4) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzh().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j4;
                }
                long j5 = cursor.getLong(0);
                cursor.close();
                return j5;
            } catch (SQLiteException e4) {
                this.zzt.zzaA().zzd().zzc("Database error", str, e4);
                throw e4;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zzA(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e4) {
            this.zzt.zzaA().zzd().zzd("Error deleting user property. appId", zzet.zzn(str), this.zzt.zzj().zzf(str2), e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0287, code lost:
    
        r22.zzt.zzaA().zzd().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzet.zzn(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x037e, code lost:
    
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23);
        r0 = zzh();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03a1, code lost:
    
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0256, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x023a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0237, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0485, code lost:
    
        r20.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0488, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e1, code lost:
    
        r0 = r22.zzt.zzaA().zzk();
        r11 = com.google.android.gms.measurement.internal.zzet.zzn(r23);
        r13 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f9, code lost:
    
        if (r12.zzp() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01fb, code lost:
    
        r16 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0208, code lost:
    
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r11, r13, java.lang.String.valueOf(r16));
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0206, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x029c, code lost:
    
        r20 = r7;
        r3 = r19.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02aa, code lost:
    
        if (r3.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02ac, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.zzet) r3.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02c6, code lost:
    
        if (r7.zze().isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02f8, code lost:
    
        r11 = r7.zzbx();
        r12 = new android.content.ContentValues();
        r12.put(r0, r23);
        r19 = r0;
        r12.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0311, code lost:
    
        if (r7.zzj() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0313, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x031d, code lost:
    
        r12.put("filter_id", r0);
        r21 = r3;
        r12.put("property_name", r7.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x032f, code lost:
    
        if (r7.zzk() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0331, code lost:
    
        r3 = java.lang.Boolean.valueOf(r7.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x033b, code lost:
    
        r12.put("session_scoped", r3);
        r12.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x034d, code lost:
    
        if (zzh().insertWithOnConflict("property_filters", null, r12, 5) != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0365, code lost:
    
        r0 = r19;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x034f, code lost:
    
        r22.zzt.zzaA().zzd().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzet.zzn(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0363, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x036b, code lost:
    
        r22.zzt.zzaA().zzd().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzet.zzn(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x033a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x031c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c8, code lost:
    
        r0 = r22.zzt.zzaA().zzk();
        r9 = com.google.android.gms.measurement.internal.zzet.zzn(r23);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e0, code lost:
    
        if (r7.zzj() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e2, code lost:
    
        r16 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ef, code lost:
    
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ed, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0176, code lost:
    
        r11 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0182, code lost:
    
        if (r11.hasNext() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018e, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzet) r11.next()).zzj() != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0190, code lost:
    
        r22.zzt.zzaA().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzet.zzn(r23), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:
    
        r11 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b5, code lost:
    
        r19 = r0;
        r0 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c3, code lost:
    
        if (r11.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c5, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.zzek) r11.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01df, code lost:
    
        if (r12.zzg().isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0213, code lost:
    
        r3 = r12.zzbx();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0217, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0219, code lost:
    
        r7 = new android.content.ContentValues();
        r7.put("app_id", r23);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022c, code lost:
    
        if (r12.zzp() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022e, code lost:
    
        r0 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x023b, code lost:
    
        r7.put("filter_id", r0);
        r7.put("event_name", r12.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x024b, code lost:
    
        if (r12.zzq() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x024d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r12.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0257, code lost:
    
        r7.put("session_scoped", r0);
        r7.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0269, code lost:
    
        if (zzh().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x026b, code lost:
    
        r22.zzt.zzaA().zzd().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzet.zzn(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x027e, code lost:
    
        r0 = r19;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0286, code lost:
    
        r0 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzB(java.lang.String r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzB(java.lang.String, java.util.List):void");
    }

    public final void zzC() {
        zzW();
        zzh().setTransactionSuccessful();
    }

    public final void zzD(zzh zzhVar) {
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzW();
        String zzv = zzhVar.zzv();
        Preconditions.checkNotNull(zzv);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzv);
        contentValues.put("app_instance_id", zzhVar.zzw());
        contentValues.put("gmp_app_id", zzhVar.zzA());
        contentValues.put("resettable_device_id_hash", zzhVar.zzC());
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("app_version", zzhVar.zzy());
        contentValues.put("app_store", zzhVar.zzx());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzan()));
        contentValues.put("day", Long.valueOf(zzhVar.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzb()));
        contentValues.put("firebase_instance_id", zzhVar.zzz());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzh()));
        contentValues.put("health_monitor_sample", zzhVar.zzB());
        zzhVar.zza();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzam()));
        contentValues.put("admob_app_id", zzhVar.zzt());
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzk()));
        contentValues.put("session_stitching_token", zzhVar.zzD());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzap()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzr()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.zzq()));
        List zzE = zzhVar.zzE();
        if (zzE != null) {
            if (zzE.isEmpty()) {
                this.zzt.zzaA().zzk().zzb("Safelisted events should not be an empty list. appId", zzv);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzE));
            }
        }
        zzop.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzak) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase zzh2 = zzh();
            if (zzh2.update("apps", contentValues, "app_id = ?", new String[]{zzv}) == 0 && zzh2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update app (got -1). appId", zzet.zzn(zzv));
            }
        } catch (SQLiteException e4) {
            this.zzt.zzaA().zzd().zzc("Error storing app. appId", zzet.zzn(zzv), e4);
        }
    }

    public final void zzE(zzaq zzaqVar) {
        Preconditions.checkNotNull(zzaqVar);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzaqVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzaqVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzaqVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzaqVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzaqVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzaqVar.zzg));
        contentValues.put("last_bundled_day", zzaqVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzaqVar.zzi);
        contentValues.put("last_sampling_rate", zzaqVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzaqVar.zze));
        Boolean bool = zzaqVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzh().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzet.zzn(zzaqVar.zza));
            }
        } catch (SQLiteException e4) {
            this.zzt.zzaA().zzd().zzc("Error storing event aggregates. appId", zzet.zzn(zzaqVar.zza), e4);
        }
    }

    public final boolean zzF() {
        return zzZ("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzG() {
        return zzZ("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean zzH() {
        return zzZ("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final boolean zzI() {
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return zzaw.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzJ(String str, Long l4, long j4, com.google.android.gms.internal.measurement.zzft zzftVar) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzftVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l4);
        byte[] zzbx = zzftVar.zzbx();
        this.zzt.zzaA().zzj().zzc("Saving complex main event, appId, data size", this.zzt.zzj().zzd(str), Integer.valueOf(zzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l4);
        contentValues.put("children_to_process", Long.valueOf(j4));
        contentValues.put("main_event", zzbx);
        try {
            if (zzh().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzt.zzaA().zzd().zzb("Failed to insert complex main event (got -1). appId", zzet.zzn(str));
            return false;
        } catch (SQLiteException e4) {
            this.zzt.zzaA().zzd().zzc("Error storing complex main event. appId", zzet.zzn(str), e4);
            return false;
        }
    }

    public final boolean zzK(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zzW();
        String str = zzacVar.zza;
        Preconditions.checkNotNull(str);
        if (zzp(str, zzacVar.zzc.zzb) == null) {
            long zzZ = zzZ("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzt.zzf();
            if (zzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzacVar.zzc.zzb);
        zzV(contentValues, "value", Preconditions.checkNotNull(zzacVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzacVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzacVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzacVar.zzh));
        contentValues.put("timed_out_event", this.zzt.zzv().zzap(zzacVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzacVar.zzd));
        contentValues.put("triggered_event", this.zzt.zzv().zzap(zzacVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzacVar.zzj));
        contentValues.put("expired_event", this.zzt.zzv().zzap(zzacVar.zzk));
        try {
            if (zzh().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzt.zzaA().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzet.zzn(str));
            return true;
        } catch (SQLiteException e4) {
            this.zzt.zzaA().zzd().zzc("Error storing conditional user property", zzet.zzn(str), e4);
            return true;
        }
    }

    public final boolean zzL(zzlm zzlmVar) {
        Preconditions.checkNotNull(zzlmVar);
        zzg();
        zzW();
        if (zzp(zzlmVar.zza, zzlmVar.zzc) == null) {
            if (zzlp.zzak(zzlmVar.zzc)) {
                if (zzZ("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzlmVar.zza}) >= this.zzt.zzf().zzf(zzlmVar.zza, zzeg.zzG, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzlmVar.zzc)) {
                long zzZ = zzZ("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzlmVar.zza, zzlmVar.zzb});
                this.zzt.zzf();
                if (zzZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzlmVar.zza);
        contentValues.put("origin", zzlmVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzlmVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzlmVar.zzd));
        zzV(contentValues, "value", zzlmVar.zze);
        try {
            if (zzh().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzt.zzaA().zzd().zzb("Failed to insert/update user property (got -1). appId", zzet.zzn(zzlmVar.zza));
            return true;
        } catch (SQLiteException e4) {
            this.zzt.zzaA().zzd().zzc("Error storing user property. appId", zzet.zzn(zzlmVar.zza), e4);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f6  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzU(java.lang.String r21, long r22, long r24, com.google.android.gms.measurement.internal.zzle r26) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzU(java.lang.String, long, long, com.google.android.gms.measurement.internal.zzle):void");
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            return zzh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e4) {
            this.zzt.zzaA().zzd().zzd("Error deleting conditional property", zzet.zzn(str), this.zzt.zzj().zzf(str2), e4);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    public final boolean zzb() {
        return false;
    }

    public final long zzc(String str, String str2) {
        SQLiteException e4;
        long j4;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        try {
            try {
                j4 = zzaa("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (j4 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (zzh2.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.zzt.zzaA().zzd().zzc("Failed to insert column (got -1). appId", zzet.zzn(str), "first_open_count");
                        return -1L;
                    }
                    j4 = 0;
                }
            } finally {
                zzh2.endTransaction();
            }
        } catch (SQLiteException e5) {
            e4 = e5;
            j4 = 0;
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + j4));
            if (zzh2.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                this.zzt.zzaA().zzd().zzc("Failed to update column (got 0). appId", zzet.zzn(str), "first_open_count");
                return -1L;
            }
            zzh2.setTransactionSuccessful();
            return j4;
        } catch (SQLiteException e6) {
            e4 = e6;
            this.zzt.zzaA().zzd().zzd("Error inserting column. appId", zzet.zzn(str), "first_open_count", e4);
            return j4;
        }
    }

    public final long zzd() {
        return zzaa("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long zze() {
        return zzaa("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzf(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaa("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e4) {
            this.zzt.zzaA().zzk().zzb("Error opening database", e4);
            throw e4;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00bf: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:58:0x00bf */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zzi(java.lang.String r8) {
        /*
            r7 = this;
            r7.zzg()
            r7.zzW()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.zzh()     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r2 != 0) goto L34
            com.google.android.gms.measurement.internal.zzgd r8 = r7.zzt     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.zzet r8 = r8.zzaA()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.zzer r8 = r8.zzj()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r2 = "Default event parameters not found"
            r8.zza(r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r1.close()
            return r0
        L2e:
            r7 = move-exception
            goto Lbf
        L31:
            r8 = move-exception
            goto Lc5
        L34:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.internal.measurement.zzfs r3 = com.google.android.gms.internal.measurement.zzft.zze()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.zzmh r2 = com.google.android.gms.measurement.internal.zzlj.zzm(r3, r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.zzlb r2 = r2.zzaD()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.zzft r2 = (com.google.android.gms.internal.measurement.zzft) r2     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.measurement.internal.zzlh r8 = r7.zzf     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r8.zzu()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.util.List r8 = r2.zzi()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
        L5b:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r3 == 0) goto La3
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.internal.measurement.zzfx r3 = (com.google.android.gms.internal.measurement.zzfx) r3     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r4 = r3.zzg()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            boolean r5 = r3.zzu()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L79
            double r5 = r3.zza()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putDouble(r4, r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        L79:
            boolean r5 = r3.zzv()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L87
            float r3 = r3.zzb()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putFloat(r4, r3)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        L87:
            boolean r5 = r3.zzy()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L95
            java.lang.String r3 = r3.zzh()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putString(r4, r3)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        L95:
            boolean r5 = r3.zzw()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L5b
            long r5 = r3.zzd()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putLong(r4, r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        La3:
            r1.close()
            return r2
        La7:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgd r3 = r7.zzt     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.zzet r3 = r3.zzaA()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.zzer r3 = r3.zzd()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzet.zzn(r8)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r3.zzc(r4, r8, r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r1.close()
            return r0
        Lbf:
            r0 = r1
            goto Lda
        Lc1:
            r7 = move-exception
            goto Lda
        Lc3:
            r8 = move-exception
            r1 = r0
        Lc5:
            com.google.android.gms.measurement.internal.zzgd r7 = r7.zzt     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.measurement.internal.zzet r7 = r7.zzaA()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.measurement.internal.zzer r7 = r7.zzd()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "Error selecting default event parameters"
            r7.zzb(r2, r8)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto Ld9
            r1.close()
        Ld9:
            return r0
        Lda:
            if (r0 == 0) goto Ldf
            r0.close()
        Ldf:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzi(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzh zzj(java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzh");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzac zzk(java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzk(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzac");
    }

    public final zzai zzl(long j4, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return zzm(j4, str, 1L, false, false, z5, false, z7);
    }

    public final zzai zzm(long j4, String str, long j5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        String[] strArr = {str};
        zzai zzaiVar = new zzai();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                Cursor query = zzh2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.zzt.zzaA().zzk().zzb("Not updating daily counts, app is not known. appId", zzet.zzn(str));
                    query.close();
                    return zzaiVar;
                }
                if (query.getLong(0) == j4) {
                    zzaiVar.zzb = query.getLong(1);
                    zzaiVar.zza = query.getLong(2);
                    zzaiVar.zzc = query.getLong(3);
                    zzaiVar.zzd = query.getLong(4);
                    zzaiVar.zze = query.getLong(5);
                }
                if (z3) {
                    zzaiVar.zzb += j5;
                }
                if (z4) {
                    zzaiVar.zza += j5;
                }
                if (z5) {
                    zzaiVar.zzc += j5;
                }
                if (z6) {
                    zzaiVar.zzd += j5;
                }
                if (z7) {
                    zzaiVar.zze += j5;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j4));
                contentValues.put("daily_public_events_count", Long.valueOf(zzaiVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzaiVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzaiVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzaiVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzaiVar.zze));
                zzh2.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return zzaiVar;
            } catch (SQLiteException e4) {
                this.zzt.zzaA().zzd().zzc("Error updating daily counts. appId", zzet.zzn(str), e4);
                if (0 != 0) {
                    cursor.close();
                }
                return zzaiVar;
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzaq zzn(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzn(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzaq");
    }

    public final zzlm zzp(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            cursor = zzh().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    long j4 = cursor.getLong(0);
                    Object zzq = zzq(cursor, 1);
                    if (zzq == null) {
                        cursor.close();
                        return null;
                    }
                    str3 = str;
                    str4 = str2;
                    try {
                        zzlm zzlmVar = new zzlm(str3, cursor.getString(2), str4, j4, zzq);
                        if (cursor.moveToNext()) {
                            this.zzt.zzaA().zzd().zzb("Got multiple records for user property, expected one. appId", zzet.zzn(str3));
                        }
                        cursor.close();
                        return zzlmVar;
                    } catch (SQLiteException e4) {
                        e = e4;
                        sQLiteException = e;
                        this.zzt.zzaA().zzd().zzd("Error querying user property. appId", zzet.zzn(str3), this.zzt.zzj().zzf(str4), sQLiteException);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    str3 = str;
                    str4 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 == null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e6) {
            str3 = str;
            str4 = str2;
            sQLiteException = e6;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final Object zzq(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            w.v(this.zzt, "Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            this.zzt.zzaA().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        w.v(this.zzt, "Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzr() {
        /*
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.zzh()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L26
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r4 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r4
        L1a:
            r4 = move-exception
            goto L22
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r1 = r0
            goto L3e
        L24:
            r4 = move-exception
            goto L3e
        L26:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L29:
            com.google.android.gms.measurement.internal.zzgd r4 = r4.zzt     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.zzet r4 = r4.zzaA()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.zzer r4 = r4.zzd()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "Database error getting next bundle app id"
            r4.zzb(r3, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3d
            r0.close()
        L3d:
            return r1
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzr():java.lang.String");
    }

    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(CirculationMapper.VIA_ASTERISK));
            sb.append(" and name glob ?");
        }
        return zzt(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r2 = r27.zzt.zzaA().zzd();
        r27.zzt.zzf();
        r2.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzt(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzt(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List zzu(String str) {
        String str2;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.zzt.zzf();
                cursor = zzh().query("user_attributes", new String[]{AppMeasurementSdk.ConditionalUserProperty.NAME, "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return arrayList;
                    }
                    while (true) {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j4 = cursor.getLong(2);
                        Object zzq = zzq(cursor, 3);
                        if (zzq == null) {
                            this.zzt.zzaA().zzd().zzb("Read invalid user property value, ignoring it. appId", zzet.zzn(str));
                            str2 = str;
                        } else {
                            str2 = str;
                            try {
                                arrayList.add(new zzlm(str2, str3, string, j4, zzq));
                            } catch (SQLiteException e4) {
                                e = e4;
                                this.zzt.zzaA().zzd().zzc("Error querying user properties. appId", zzet.zzn(str2), e);
                                List list = Collections.EMPTY_LIST;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return list;
                            }
                        }
                        if (!cursor.moveToNext()) {
                            cursor.close();
                            return arrayList;
                        }
                        str = str2;
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    str2 = str;
                }
            } finally {
            }
        } catch (SQLiteException e6) {
            e = e6;
            str2 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        r0 = r17.zzt.zzaA().zzd();
        r17.zzt.zzf();
        r0.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzv(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzv(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void zzw() {
        zzW();
        zzh().beginTransaction();
    }

    public final void zzx() {
        zzW();
        zzh().endTransaction();
    }

    public final void zzy(List list) {
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzI()) {
            String o4 = w.o("(", TextUtils.join(",", list), ")");
            if (zzZ(w.o("SELECT COUNT(1) FROM queue WHERE rowid IN ", o4, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                w.A(this.zzt, "The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                zzh().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + o4 + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e4) {
                this.zzt.zzaA().zzd().zzb("Error incrementing retry count. error", e4);
            }
        }
    }

    public final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long zza2 = this.zzf.zzs().zza.zza();
            long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - zza2);
            this.zzt.zzf();
            if (abs > ((Long) zzeg.zzy.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(elapsedRealtime);
                zzg();
                zzW();
                if (zzI()) {
                    SQLiteDatabase zzh2 = zzh();
                    String valueOf = String.valueOf(this.zzt.zzax().currentTimeMillis());
                    this.zzt.zzf();
                    int delete = zzh2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(zzag.zzA())});
                    if (delete > 0) {
                        this.zzt.zzaA().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }
}
