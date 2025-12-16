package com.adif.elcanomovil.serviceStorage.database;

import A1.b;
import A1.c;
import A1.g;
import A1.h;
import A1.i;
import A1.k;
import a.AbstractC0105a;
import android.database.Cursor;
import androidx.room.j;
import androidx.room.u;
import androidx.room.w;
import androidx.room.y;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceStorage.database.FavouritesDao_Impl;
import com.adif.elcanomovil.serviceStorage.model.FavouriteEntity;
import com.adif.elcanomovil.serviceStorage.model.FavouriteTrainEntity;
import com.adif.elcanomovil.serviceStorage.model.StationEntity;
import com.adif.elcanomovil.serviceStorage.model.StationFavouritesEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m3.l;
import s.C0581a;
import s.e;
import u.AbstractC0629f;

/* loaded from: classes.dex */
public final class FavouritesDao_Impl implements FavouritesDao {
    private final u __db;
    private final j __insertionAdapterOfFavouriteEntity;
    private final j __insertionAdapterOfFavouriteTrainEntity;
    private final y __preparedStmtOfDeleteAll;
    private final y __preparedStmtOfDeleteFavouriteRouteType;
    private final y __preparedStmtOfDeleteFavouriteStationType;
    private final y __preparedStmtOfDeleteFavouriteTrain;

    public FavouritesDao_Impl(u uVar) {
        this.__db = uVar;
        this.__insertionAdapterOfFavouriteEntity = new b(uVar, 2);
        this.__insertionAdapterOfFavouriteTrainEntity = new b(uVar, 3);
        this.__preparedStmtOfDeleteAll = new c(uVar, 2);
        this.__preparedStmtOfDeleteFavouriteStationType = new c(uVar, 3);
        this.__preparedStmtOfDeleteFavouriteRouteType = new c(uVar, 4);
        this.__preparedStmtOfDeleteFavouriteTrain = new c(uVar, 5);
    }

    public void __fetchRelationshipFavouriteEntityAscomAdifElcanomovilServiceStorageModelFavouriteEntity(e map) {
        ArrayList arrayList;
        s.b bVar = (s.b) map.keySet();
        e eVar = bVar.f8332a;
        if (eVar.isEmpty()) {
            return;
        }
        if (map.f8352c > 999) {
            Function1 fetchBlock = new Function1() { // from class: A1.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit lambda$__fetchRelationshipFavouriteEntityAscomAdifElcanomovilServiceStorageModelFavouriteEntity$0;
                    lambda$__fetchRelationshipFavouriteEntityAscomAdifElcanomovilServiceStorageModelFavouriteEntity$0 = FavouritesDao_Impl.this.lambda$__fetchRelationshipFavouriteEntityAscomAdifElcanomovilServiceStorageModelFavouriteEntity$0((s.e) obj);
                    return lambda$__fetchRelationshipFavouriteEntityAscomAdifElcanomovilServiceStorageModelFavouriteEntity$0;
                }
            };
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
            s.j jVar = new s.j(u.MAX_BIND_PARAMETER_CNT);
            int i = map.f8352c;
            int i4 = 0;
            int i5 = 0;
            while (i4 < i) {
                jVar.put(map.f(i4), map.i(i4));
                i4++;
                i5++;
                if (i5 == 999) {
                    fetchBlock.invoke(jVar);
                    jVar.clear();
                    i5 = 0;
                }
            }
            if (i5 > 0) {
                fetchBlock.invoke(jVar);
                return;
            }
            return;
        }
        StringBuilder builder = AbstractC0629f.a("SELECT `favouriteId`,`identifierStation`,`stationName`,`identifierToStation`,`stationToName`,`type`,`isCercanias`,`isRodalies` FROM `FavouriteEntity` WHERE `identifierStation` IN (");
        int i6 = eVar.f8352c;
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i7 = 0; i7 < i6; i7++) {
            builder.append("?");
            if (i7 < i6 - 1) {
                builder.append(",");
            }
        }
        builder.append(")");
        w d4 = w.d(i6, builder.toString());
        Iterator it = bVar.iterator();
        int i8 = 1;
        while (true) {
            C0581a c0581a = (C0581a) it;
            if (!c0581a.hasNext()) {
                break;
            }
            d4.k(i8, (String) c0581a.next());
            i8++;
        }
        Cursor M3 = AbstractC0105a.M(this.__db, d4, false);
        try {
            int q4 = l.q(M3, "identifierStation");
            if (q4 == -1) {
                M3.close();
                return;
            }
            while (M3.moveToNext()) {
                String string = M3.isNull(q4) ? null : M3.getString(q4);
                if (string != null && (arrayList = (ArrayList) map.get(string)) != null) {
                    int i9 = M3.getInt(0);
                    String string2 = M3.isNull(1) ? null : M3.getString(1);
                    String string3 = M3.isNull(2) ? null : M3.getString(2);
                    String string4 = M3.isNull(3) ? null : M3.getString(3);
                    String string5 = M3.isNull(4) ? null : M3.getString(4);
                    String string6 = M3.getString(5);
                    Integer valueOf = M3.isNull(6) ? null : Integer.valueOf(M3.getInt(6));
                    Boolean valueOf2 = valueOf == null ? null : Boolean.valueOf(valueOf.intValue() != 0);
                    Integer valueOf3 = M3.isNull(7) ? null : Integer.valueOf(M3.getInt(7));
                    arrayList.add(new FavouriteEntity(i9, string2, string3, string4, string5, string6, valueOf2, valueOf3 != null ? Boolean.valueOf(valueOf3.intValue() != 0) : null));
                }
            }
        } finally {
            M3.close();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public /* synthetic */ Unit lambda$__fetchRelationshipFavouriteEntityAscomAdifElcanomovilServiceStorageModelFavouriteEntity$0(e eVar) {
        __fetchRelationshipFavouriteEntityAscomAdifElcanomovilServiceStorageModelFavouriteEntity(eVar);
        return Unit.INSTANCE;
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.FavouritesDao
    public Object deleteAll(Continuation<? super Unit> continuation) {
        return l.m(this.__db, new A1.l(this, 0), continuation);
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.FavouritesDao
    public Object deleteFavouriteRouteType(int i, int i4, boolean z3, String str, Continuation<? super Unit> continuation) {
        return l.m(this.__db, new h(this, i, i4, z3, str), continuation);
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.FavouritesDao
    public Object deleteFavouriteStationType(int i, boolean z3, String str, Continuation<? super Unit> continuation) {
        return l.m(this.__db, new g(this, i, z3, str), continuation);
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.FavouritesDao
    public Object deleteFavouriteTrain(String str, String str2, String str3, Continuation<? super Unit> continuation) {
        return l.m(this.__db, new i(this, str, str2, str3), continuation);
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.FavouritesDao
    public Flow<List<FavouriteEntity>> getAll() {
        return l.l(this.__db, false, new String[]{"FavouriteEntity"}, new A1.j(this, w.d(0, "SELECT * FROM FavouriteEntity"), 0));
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.FavouritesDao
    public List<FavouriteTrainEntity> getFavouriteTrain(String str, String str2, String str3) {
        w d4 = w.d(3, "SELECT * FROM FavouriteTrainEntity WHERE commercialNumber = ? AND originStationCode = ? AND destinationStationCode = ? LIMIT 1");
        d4.k(1, str);
        d4.k(2, str2);
        d4.k(3, str3);
        this.__db.assertNotSuspendingTransaction();
        Cursor M3 = AbstractC0105a.M(this.__db, d4, false);
        try {
            int r4 = l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER);
            int r5 = l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE);
            int r6 = l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE);
            int r7 = l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE);
            int r8 = l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_OPERATOR);
            int r9 = l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT);
            int r10 = l.r(M3, "timeStationFrom");
            int r11 = l.r(M3, "timeStationTo");
            ArrayList arrayList = new ArrayList(M3.getCount());
            while (M3.moveToNext()) {
                arrayList.add(new FavouriteTrainEntity(M3.getString(r4), M3.getString(r5), M3.getString(r6), M3.getLong(r7), M3.isNull(r8) ? null : M3.getString(r8), M3.isNull(r9) ? null : M3.getString(r9), M3.isNull(r10) ? null : M3.getString(r10), M3.isNull(r11) ? null : M3.getString(r11)));
            }
            return arrayList;
        } finally {
            M3.close();
            d4.release();
        }
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.FavouritesDao
    public FavouriteEntity getFavouritesDeparturesOrArrivals(String str, String str2, boolean z3) {
        Boolean valueOf;
        w d4 = w.d(3, "SELECT * FROM FavouriteEntity WHERE identifierStation = ? and isCercanias = ? and type = ? LIMIT 1");
        boolean z4 = true;
        d4.k(1, str);
        d4.I(2, z3 ? 1L : 0L);
        d4.k(3, str2);
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor M3 = AbstractC0105a.M(this.__db, d4, false);
            try {
                int r4 = l.r(M3, "favouriteId");
                int r5 = l.r(M3, "identifierStation");
                int r6 = l.r(M3, "stationName");
                int r7 = l.r(M3, "identifierToStation");
                int r8 = l.r(M3, "stationToName");
                int r9 = l.r(M3, "type");
                int r10 = l.r(M3, "isCercanias");
                int r11 = l.r(M3, "isRodalies");
                FavouriteEntity favouriteEntity = null;
                Boolean valueOf2 = null;
                if (M3.moveToFirst()) {
                    int i = M3.getInt(r4);
                    String string = M3.isNull(r5) ? null : M3.getString(r5);
                    String string2 = M3.isNull(r6) ? null : M3.getString(r6);
                    String string3 = M3.isNull(r7) ? null : M3.getString(r7);
                    String string4 = M3.isNull(r8) ? null : M3.getString(r8);
                    String string5 = M3.getString(r9);
                    Integer valueOf3 = M3.isNull(r10) ? null : Integer.valueOf(M3.getInt(r10));
                    if (valueOf3 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf3.intValue() != 0);
                    }
                    Integer valueOf4 = M3.isNull(r11) ? null : Integer.valueOf(M3.getInt(r11));
                    if (valueOf4 != null) {
                        if (valueOf4.intValue() == 0) {
                            z4 = false;
                        }
                        valueOf2 = Boolean.valueOf(z4);
                    }
                    favouriteEntity = new FavouriteEntity(i, string, string2, string3, string4, string5, valueOf, valueOf2);
                }
                this.__db.setTransactionSuccessful();
                M3.close();
                d4.release();
                return favouriteEntity;
            } catch (Throwable th) {
                M3.close();
                d4.release();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.FavouritesDao
    public FavouriteEntity getFavouritesRoute(String str, String str2, String str3, boolean z3) {
        Boolean valueOf;
        w d4 = w.d(4, "SELECT * FROM FavouriteEntity WHERE identifierStation = ? and identifierToStation = ? and isCercanias = ? and type = ? LIMIT 1");
        boolean z4 = true;
        d4.k(1, str);
        if (str2 == null) {
            d4.t(2);
        } else {
            d4.k(2, str2);
        }
        d4.I(3, z3 ? 1L : 0L);
        d4.k(4, str3);
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor M3 = AbstractC0105a.M(this.__db, d4, false);
            try {
                int r4 = l.r(M3, "favouriteId");
                int r5 = l.r(M3, "identifierStation");
                int r6 = l.r(M3, "stationName");
                int r7 = l.r(M3, "identifierToStation");
                int r8 = l.r(M3, "stationToName");
                int r9 = l.r(M3, "type");
                int r10 = l.r(M3, "isCercanias");
                int r11 = l.r(M3, "isRodalies");
                FavouriteEntity favouriteEntity = null;
                Boolean valueOf2 = null;
                if (M3.moveToFirst()) {
                    int i = M3.getInt(r4);
                    String string = M3.isNull(r5) ? null : M3.getString(r5);
                    String string2 = M3.isNull(r6) ? null : M3.getString(r6);
                    String string3 = M3.isNull(r7) ? null : M3.getString(r7);
                    String string4 = M3.isNull(r8) ? null : M3.getString(r8);
                    String string5 = M3.getString(r9);
                    Integer valueOf3 = M3.isNull(r10) ? null : Integer.valueOf(M3.getInt(r10));
                    if (valueOf3 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf3.intValue() != 0);
                    }
                    Integer valueOf4 = M3.isNull(r11) ? null : Integer.valueOf(M3.getInt(r11));
                    if (valueOf4 != null) {
                        if (valueOf4.intValue() == 0) {
                            z4 = false;
                        }
                        valueOf2 = Boolean.valueOf(z4);
                    }
                    favouriteEntity = new FavouriteEntity(i, string, string2, string3, string4, string5, valueOf, valueOf2);
                }
                this.__db.setTransactionSuccessful();
                M3.close();
                d4.release();
                return favouriteEntity;
            } catch (Throwable th) {
                M3.close();
                d4.release();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.FavouritesDao
    public FavouriteEntity getStationFavourite(int i) {
        Boolean valueOf;
        boolean z3 = true;
        w d4 = w.d(1, "SELECT * FROM FavouriteEntity WHERE favouriteId = ?");
        d4.I(1, i);
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor M3 = AbstractC0105a.M(this.__db, d4, false);
            try {
                int r4 = l.r(M3, "favouriteId");
                int r5 = l.r(M3, "identifierStation");
                int r6 = l.r(M3, "stationName");
                int r7 = l.r(M3, "identifierToStation");
                int r8 = l.r(M3, "stationToName");
                int r9 = l.r(M3, "type");
                int r10 = l.r(M3, "isCercanias");
                int r11 = l.r(M3, "isRodalies");
                FavouriteEntity favouriteEntity = null;
                Boolean valueOf2 = null;
                if (M3.moveToFirst()) {
                    int i4 = M3.getInt(r4);
                    String string = M3.isNull(r5) ? null : M3.getString(r5);
                    String string2 = M3.isNull(r6) ? null : M3.getString(r6);
                    String string3 = M3.isNull(r7) ? null : M3.getString(r7);
                    String string4 = M3.isNull(r8) ? null : M3.getString(r8);
                    String string5 = M3.getString(r9);
                    Integer valueOf3 = M3.isNull(r10) ? null : Integer.valueOf(M3.getInt(r10));
                    if (valueOf3 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf3.intValue() != 0);
                    }
                    Integer valueOf4 = M3.isNull(r11) ? null : Integer.valueOf(M3.getInt(r11));
                    if (valueOf4 != null) {
                        if (valueOf4.intValue() == 0) {
                            z3 = false;
                        }
                        valueOf2 = Boolean.valueOf(z3);
                    }
                    favouriteEntity = new FavouriteEntity(i4, string, string2, string3, string4, string5, valueOf, valueOf2);
                }
                this.__db.setTransactionSuccessful();
                M3.close();
                d4.release();
                return favouriteEntity;
            } catch (Throwable th) {
                M3.close();
                d4.release();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [s.e, s.j] */
    @Override // com.adif.elcanomovil.serviceStorage.database.FavouritesDao
    public StationFavouritesEntity getStationFavourites(int i) {
        w wVar;
        int r4;
        int r5;
        int r6;
        int r7;
        int r8;
        int r9;
        int r10;
        int r11;
        int r12;
        int r13;
        int r14;
        int r15;
        int i4;
        w d4 = w.d(1, "SELECT * FROM StationEntity WHERE stationCode = ? LIMIT 1");
        d4.I(1, i);
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor M3 = AbstractC0105a.M(this.__db, d4, true);
            try {
                r4 = l.r(M3, "stationCode");
                r5 = l.r(M3, "stationType");
                r6 = l.r(M3, "longName");
                r7 = l.r(M3, "shortName");
                r8 = l.r(M3, "longNameToFind");
                r9 = l.r(M3, "shortNameToFind");
                r10 = l.r(M3, "latitude");
                r11 = l.r(M3, "longitude");
                r12 = l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC);
                r13 = l.r(M3, "commercialZoneType");
                r14 = l.r(M3, "commuterNetwork");
                r15 = l.r(M3, "akaName");
                wVar = d4;
            } catch (Throwable th) {
                th = th;
                wVar = d4;
            }
            try {
                ?? jVar = new s.j(0);
                while (M3.moveToNext()) {
                    String string = M3.getString(r4);
                    if (jVar.containsKey(string)) {
                        i4 = r15;
                    } else {
                        i4 = r15;
                        jVar.put(string, new ArrayList());
                    }
                    r15 = i4;
                }
                int i5 = r15;
                M3.moveToPosition(-1);
                __fetchRelationshipFavouriteEntityAscomAdifElcanomovilServiceStorageModelFavouriteEntity(jVar);
                StationFavouritesEntity stationFavouritesEntity = null;
                if (M3.moveToFirst()) {
                    stationFavouritesEntity = new StationFavouritesEntity(new StationEntity(M3.getString(r4), M3.getString(r5), M3.getString(r6), M3.getString(r7), M3.getString(r8), M3.getString(r9), M3.getDouble(r10), M3.getDouble(r11), M3.getInt(r12), M3.isNull(r13) ? null : M3.getString(r13), M3.getString(r14), M3.getString(i5)), (ArrayList) jVar.get(M3.getString(r4)));
                }
                this.__db.setTransactionSuccessful();
                M3.close();
                wVar.release();
                return stationFavouritesEntity;
            } catch (Throwable th2) {
                th = th2;
                M3.close();
                wVar.release();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.FavouritesDao
    public Flow<List<StationFavouritesEntity>> getStationsFavourites() {
        return l.l(this.__db, true, new String[]{"FavouriteEntity", "StationEntity"}, new A1.j(this, w.d(0, "SELECT * FROM StationEntity"), 1));
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.FavouritesDao
    public Flow<List<FavouriteTrainEntity>> getTrainsFavourites() {
        return l.l(this.__db, true, new String[]{"FavouriteTrainEntity"}, new A1.j(this, w.d(0, "SELECT * FROM FavouriteTrainEntity"), 2));
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.FavouritesDao
    public Object insertAll(List<FavouriteEntity> list, Continuation<? super Unit> continuation) {
        return l.m(this.__db, new k(this, list, 0), continuation);
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.FavouritesDao
    public Object insertFavouriteTrains(List<FavouriteTrainEntity> list, Continuation<? super Unit> continuation) {
        return l.m(this.__db, new k(this, list, 1), continuation);
    }
}
