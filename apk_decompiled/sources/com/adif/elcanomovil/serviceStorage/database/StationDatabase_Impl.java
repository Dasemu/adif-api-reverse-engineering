package com.adif.elcanomovil.serviceStorage.database;

import A.a;
import android.content.Context;
import androidx.room.g;
import androidx.room.p;
import androidx.room.v;
import f0.C0338b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import w0.InterfaceC0645a;
import w0.InterfaceC0646b;
import x0.i;

/* loaded from: classes.dex */
public final class StationDatabase_Impl extends StationDatabase {
    private volatile AvisaStationDao _avisaStationDao;
    private volatile FavouritesDao _favouritesDao;
    private volatile IncidenceDao _incidenceDao;
    private volatile StationsDao _stationsDao;
    private volatile SubscriptionsAuxDataDao _subscriptionsAuxDataDao;
    private volatile SubscriptionsDao _subscriptionsDao;

    @Override // com.adif.elcanomovil.serviceStorage.database.StationDatabase
    public AvisaStationDao avisaStationDao() {
        AvisaStationDao avisaStationDao;
        if (this._avisaStationDao != null) {
            return this._avisaStationDao;
        }
        synchronized (this) {
            try {
                if (this._avisaStationDao == null) {
                    this._avisaStationDao = new AvisaStationDao_Impl(this);
                }
                avisaStationDao = this._avisaStationDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return avisaStationDao;
    }

    @Override // androidx.room.u
    public void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC0645a S3 = super.getOpenHelper().S();
        try {
            super.beginTransaction();
            S3.i("PRAGMA defer_foreign_keys = TRUE");
            S3.i("DELETE FROM `StationEntity`");
            S3.i("DELETE FROM `FavouriteEntity`");
            S3.i("DELETE FROM `AvisaStation`");
            S3.i("DELETE FROM `AvisaStationCategory`");
            S3.i("DELETE FROM `IncidenceEntity`");
            S3.i("DELETE FROM `IncidenceCommentEntity`");
            S3.i("DELETE FROM `IncidencePictureEntity`");
            S3.i("DELETE FROM `FavouriteTrainEntity`");
            S3.i("DELETE FROM `IncidenceStationEntity`");
            S3.i("DELETE FROM `SubscriptionEntity`");
            S3.i("DELETE FROM `SubscriptionAuxEntity`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            S3.V("PRAGMA wal_checkpoint(FULL)").close();
            if (!S3.B()) {
                S3.i("VACUUM");
            }
        }
    }

    @Override // androidx.room.u
    public p createInvalidationTracker() {
        return new p(this, new HashMap(0), new HashMap(0), "StationEntity", "FavouriteEntity", "AvisaStation", "AvisaStationCategory", "IncidenceEntity", "IncidenceCommentEntity", "IncidencePictureEntity", "FavouriteTrainEntity", "IncidenceStationEntity", "SubscriptionEntity", "SubscriptionAuxEntity");
    }

    @Override // androidx.room.u
    public InterfaceC0646b createOpenHelper(g gVar) {
        v callback = new v(gVar, new a(this, 1));
        Context context = gVar.f3973a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0338b configuration = new C0338b(context, "station.db", callback);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new i(context, "station.db", callback);
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.StationDatabase
    public FavouritesDao favouritesDAO() {
        FavouritesDao favouritesDao;
        if (this._favouritesDao != null) {
            return this._favouritesDao;
        }
        synchronized (this) {
            try {
                if (this._favouritesDao == null) {
                    this._favouritesDao = new FavouritesDao_Impl(this);
                }
                favouritesDao = this._favouritesDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return favouritesDao;
    }

    @Override // androidx.room.u
    public List<Object> getAutoMigrations(Map<Class<Object>, Object> map) {
        return new ArrayList();
    }

    @Override // androidx.room.u
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.u
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(StationsDao.class, StationsDao_Impl.getRequiredConverters());
        hashMap.put(FavouritesDao.class, FavouritesDao_Impl.getRequiredConverters());
        hashMap.put(IncidenceDao.class, IncidenceDao_Impl.getRequiredConverters());
        hashMap.put(AvisaStationDao.class, AvisaStationDao_Impl.getRequiredConverters());
        hashMap.put(SubscriptionsDao.class, SubscriptionsDao_Impl.getRequiredConverters());
        hashMap.put(SubscriptionsAuxDataDao.class, SubscriptionsAuxDataDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.StationDatabase
    public IncidenceDao incidenceDao() {
        IncidenceDao incidenceDao;
        if (this._incidenceDao != null) {
            return this._incidenceDao;
        }
        synchronized (this) {
            try {
                if (this._incidenceDao == null) {
                    this._incidenceDao = new IncidenceDao_Impl(this);
                }
                incidenceDao = this._incidenceDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return incidenceDao;
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.StationDatabase
    public StationsDao stationsDAO() {
        StationsDao stationsDao;
        if (this._stationsDao != null) {
            return this._stationsDao;
        }
        synchronized (this) {
            try {
                if (this._stationsDao == null) {
                    this._stationsDao = new StationsDao_Impl(this);
                }
                stationsDao = this._stationsDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return stationsDao;
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.StationDatabase
    public SubscriptionsAuxDataDao subscriptionsAuxDataDao() {
        SubscriptionsAuxDataDao subscriptionsAuxDataDao;
        if (this._subscriptionsAuxDataDao != null) {
            return this._subscriptionsAuxDataDao;
        }
        synchronized (this) {
            try {
                if (this._subscriptionsAuxDataDao == null) {
                    this._subscriptionsAuxDataDao = new SubscriptionsAuxDataDao_Impl(this);
                }
                subscriptionsAuxDataDao = this._subscriptionsAuxDataDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return subscriptionsAuxDataDao;
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.StationDatabase
    public SubscriptionsDao subscriptionsDao() {
        SubscriptionsDao subscriptionsDao;
        if (this._subscriptionsDao != null) {
            return this._subscriptionsDao;
        }
        synchronized (this) {
            try {
                if (this._subscriptionsDao == null) {
                    this._subscriptionsDao = new SubscriptionsDao_Impl(this);
                }
                subscriptionsDao = this._subscriptionsDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return subscriptionsDao;
    }
}
