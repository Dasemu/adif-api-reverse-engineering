package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s.j;

/* loaded from: classes3.dex */
public final class zzhf implements zzhk {
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map zzh;
    private final List zzi;
    private static final Map zzb = new j(0);
    public static final String[] zza = {"key", "value"};

    private zzhf(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzhe zzheVar = new zzhe(this, null);
        this.zzf = zzheVar;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        contentResolver.registerContentObserver(uri, false, zzheVar);
    }

    public static zzhf zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzhf zzhfVar;
        synchronized (zzhf.class) {
            Map map = zzb;
            zzhfVar = (zzhf) map.get(uri);
            if (zzhfVar == null) {
                try {
                    zzhf zzhfVar2 = new zzhf(contentResolver, uri, runnable);
                    try {
                        map.put(uri, zzhfVar2);
                    } catch (SecurityException unused) {
                    }
                    zzhfVar = zzhfVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzhfVar;
    }

    public static synchronized void zze() {
        synchronized (zzhf.class) {
            try {
                for (zzhf zzhfVar : zzb.values()) {
                    zzhfVar.zzc.unregisterContentObserver(zzhfVar.zzf);
                }
                zzb.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) zzc().get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map zzc() {
        Map map;
        Map map2;
        Map map3 = this.zzh;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.zzg) {
                Map map5 = this.zzh;
                if (map5 != null) {
                    map2 = map5;
                } else {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) zzhi.zza(new zzhj() { // from class: com.google.android.gms.internal.measurement.zzhd
                                @Override // com.google.android.gms.internal.measurement.zzhj
                                public final Object zza() {
                                    return zzhf.this.zzd();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        }
                        this.zzh = map;
                        allowThreadDiskReads = map;
                        map2 = allowThreadDiskReads;
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
            }
            map4 = map2;
        }
        return map4 != null ? map4 : Collections.EMPTY_MAP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [s.j] */
    public final Map zzd() {
        Cursor query = this.zzc.query(this.zzd, zza, null, null, null);
        if (query == null) {
            return Collections.EMPTY_MAP;
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.EMPTY_MAP;
            }
            HashMap jVar = count <= 256 ? new j(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                jVar.put(query.getString(0), query.getString(1));
            }
            return jVar;
        } finally {
            query.close();
        }
    }

    public final void zzf() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.zzi.iterator();
                while (it.hasNext()) {
                    ((zzhg) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
