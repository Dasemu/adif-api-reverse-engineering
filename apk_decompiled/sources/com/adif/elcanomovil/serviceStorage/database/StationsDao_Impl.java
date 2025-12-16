package com.adif.elcanomovil.serviceStorage.database;

import A1.b;
import A1.c;
import A1.o;
import a.AbstractC0105a;
import android.database.Cursor;
import androidx.room.j;
import androidx.room.u;
import androidx.room.w;
import androidx.room.y;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceStorage.model.StationEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import m3.l;

/* loaded from: classes.dex */
public final class StationsDao_Impl implements StationsDao {
    private final u __db;
    private final j __insertionAdapterOfStationEntity;
    private final y __preparedStmtOfDeleteAll;

    public StationsDao_Impl(u uVar) {
        this.__db = uVar;
        this.__insertionAdapterOfStationEntity = new b(uVar, 4);
        this.__preparedStmtOfDeleteAll = new c(uVar, 7);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.StationsDao
    public Object deleteAll(Continuation<? super Unit> continuation) {
        return l.m(this.__db, new A1.l(this, 2), continuation);
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.StationsDao
    public StationEntity get(String str) {
        w d4 = w.d(1, "SELECT * FROM StationEntity WHERE stationCode = ? LIMIT 1");
        d4.k(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor M3 = AbstractC0105a.M(this.__db, d4, false);
        try {
            int r4 = l.r(M3, "stationCode");
            int r5 = l.r(M3, "stationType");
            int r6 = l.r(M3, "longName");
            int r7 = l.r(M3, "shortName");
            int r8 = l.r(M3, "longNameToFind");
            int r9 = l.r(M3, "shortNameToFind");
            int r10 = l.r(M3, "latitude");
            int r11 = l.r(M3, "longitude");
            int r12 = l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC);
            int r13 = l.r(M3, "commercialZoneType");
            int r14 = l.r(M3, "commuterNetwork");
            int r15 = l.r(M3, "akaName");
            StationEntity stationEntity = null;
            if (M3.moveToFirst()) {
                stationEntity = new StationEntity(M3.getString(r4), M3.getString(r5), M3.getString(r6), M3.getString(r7), M3.getString(r8), M3.getString(r9), M3.getDouble(r10), M3.getDouble(r11), M3.getInt(r12), M3.isNull(r13) ? null : M3.getString(r13), M3.getString(r14), M3.getString(r15));
            }
            return stationEntity;
        } finally {
            M3.close();
            d4.release();
        }
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.StationsDao
    public Flow<List<StationEntity>> getAll() {
        return l.l(this.__db, false, new String[]{"StationEntity"}, new o(3, this, w.d(0, "SELECT * FROM StationEntity")));
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.StationsDao
    public List<StationEntity> getCoincidences(String str) {
        w d4 = w.d(3, "SELECT * FROM StationEntity WHERE longNameToFind LIKE '%' || ? || '%' or shortNameToFind LIKE '%' || ? || '%' or akaName LIKE '%' || ? || '%'");
        d4.k(1, str);
        d4.k(2, str);
        d4.k(3, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor M3 = AbstractC0105a.M(this.__db, d4, false);
        try {
            int r4 = l.r(M3, "stationCode");
            int r5 = l.r(M3, "stationType");
            int r6 = l.r(M3, "longName");
            int r7 = l.r(M3, "shortName");
            int r8 = l.r(M3, "longNameToFind");
            int r9 = l.r(M3, "shortNameToFind");
            int r10 = l.r(M3, "latitude");
            int r11 = l.r(M3, "longitude");
            int r12 = l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC);
            int r13 = l.r(M3, "commercialZoneType");
            int r14 = l.r(M3, "commuterNetwork");
            int r15 = l.r(M3, "akaName");
            ArrayList arrayList = new ArrayList(M3.getCount());
            while (M3.moveToNext()) {
                arrayList.add(new StationEntity(M3.getString(r4), M3.getString(r5), M3.getString(r6), M3.getString(r7), M3.getString(r8), M3.getString(r9), M3.getDouble(r10), M3.getDouble(r11), M3.getInt(r12), M3.isNull(r13) ? null : M3.getString(r13), M3.getString(r14), M3.getString(r15)));
            }
            return arrayList;
        } finally {
            M3.close();
            d4.release();
        }
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.StationsDao
    public int getNumberOfStations() {
        w d4 = w.d(0, "SELECT COUNT(*) FROM StationEntity");
        this.__db.assertNotSuspendingTransaction();
        Cursor M3 = AbstractC0105a.M(this.__db, d4, false);
        try {
            return M3.moveToFirst() ? M3.getInt(0) : 0;
        } finally {
            M3.close();
            d4.release();
        }
    }

    @Override // com.adif.elcanomovil.serviceStorage.database.StationsDao
    public Object insertAll(List<StationEntity> list, Continuation<? super Unit> continuation) {
        return l.m(this.__db, new o(2, this, list), continuation);
    }
}
