package A1;

import a.AbstractC0105a;
import android.database.Cursor;
import androidx.room.u;
import androidx.room.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceStorage.database.FavouritesDao_Impl;
import com.adif.elcanomovil.serviceStorage.model.FavouriteEntity;
import com.adif.elcanomovil.serviceStorage.model.FavouriteTrainEntity;
import com.adif.elcanomovil.serviceStorage.model.StationEntity;
import com.adif.elcanomovil.serviceStorage.model.StationFavouritesEntity;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f58b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FavouritesDao_Impl f59c;

    public /* synthetic */ j(FavouritesDao_Impl favouritesDao_Impl, w wVar, int i) {
        this.f57a = i;
        this.f59c = favouritesDao_Impl;
        this.f58b = wVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [s.e, s.j] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        u uVar;
        Cursor M3;
        Boolean valueOf;
        FavouritesDao_Impl favouritesDao_Impl;
        u uVar2;
        u uVar3;
        u uVar4;
        FavouritesDao_Impl favouritesDao_Impl2;
        u uVar5;
        u uVar6;
        int i;
        u uVar7;
        u uVar8;
        u uVar9;
        switch (this.f57a) {
            case 0:
                uVar = this.f59c.__db;
                M3 = AbstractC0105a.M(uVar, this.f58b, false);
                try {
                    int r4 = m3.l.r(M3, "favouriteId");
                    int r5 = m3.l.r(M3, "identifierStation");
                    int r6 = m3.l.r(M3, "stationName");
                    int r7 = m3.l.r(M3, "identifierToStation");
                    int r8 = m3.l.r(M3, "stationToName");
                    int r9 = m3.l.r(M3, "type");
                    int r10 = m3.l.r(M3, "isCercanias");
                    int r11 = m3.l.r(M3, "isRodalies");
                    ArrayList arrayList = new ArrayList(M3.getCount());
                    while (M3.moveToNext()) {
                        int i4 = M3.getInt(r4);
                        Boolean bool = null;
                        String string = M3.isNull(r5) ? null : M3.getString(r5);
                        String string2 = M3.isNull(r6) ? null : M3.getString(r6);
                        String string3 = M3.isNull(r7) ? null : M3.getString(r7);
                        String string4 = M3.isNull(r8) ? null : M3.getString(r8);
                        String string5 = M3.getString(r9);
                        Integer valueOf2 = M3.isNull(r10) ? null : Integer.valueOf(M3.getInt(r10));
                        boolean z3 = true;
                        if (valueOf2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf2.intValue() != 0);
                        }
                        Integer valueOf3 = M3.isNull(r11) ? null : Integer.valueOf(M3.getInt(r11));
                        if (valueOf3 != null) {
                            if (valueOf3.intValue() == 0) {
                                z3 = false;
                            }
                            bool = Boolean.valueOf(z3);
                        }
                        arrayList.add(new FavouriteEntity(i4, string, string2, string3, string4, string5, valueOf, bool));
                    }
                    return arrayList;
                } finally {
                    M3.close();
                }
            case 1:
                favouritesDao_Impl = this.f59c;
                uVar2 = favouritesDao_Impl.__db;
                uVar2.beginTransaction();
                try {
                    try {
                        uVar4 = favouritesDao_Impl.__db;
                        M3 = AbstractC0105a.M(uVar4, this.f58b, true);
                        try {
                            int r12 = m3.l.r(M3, "stationCode");
                            int r13 = m3.l.r(M3, "stationType");
                            int r14 = m3.l.r(M3, "longName");
                            int r15 = m3.l.r(M3, "shortName");
                            int r16 = m3.l.r(M3, "longNameToFind");
                            int r17 = m3.l.r(M3, "shortNameToFind");
                            int r18 = m3.l.r(M3, "latitude");
                            int r19 = m3.l.r(M3, "longitude");
                            int r20 = m3.l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC);
                            int r21 = m3.l.r(M3, "commercialZoneType");
                            int r22 = m3.l.r(M3, "commuterNetwork");
                            int r23 = m3.l.r(M3, "akaName");
                            ?? jVar = new s.j(0);
                            while (M3.moveToNext()) {
                                String string6 = M3.getString(r12);
                                if (jVar.containsKey(string6)) {
                                    i = r23;
                                } else {
                                    i = r23;
                                    jVar.put(string6, new ArrayList());
                                }
                                r23 = i;
                            }
                            int i5 = r23;
                            M3.moveToPosition(-1);
                            favouritesDao_Impl.__fetchRelationshipFavouriteEntityAscomAdifElcanomovilServiceStorageModelFavouriteEntity(jVar);
                            ArrayList arrayList2 = new ArrayList(M3.getCount());
                            while (M3.moveToNext()) {
                                int i6 = i5;
                                FavouritesDao_Impl favouritesDao_Impl3 = favouritesDao_Impl2;
                                int i7 = r13;
                                try {
                                    arrayList2.add(new StationFavouritesEntity(new StationEntity(M3.getString(r12), M3.getString(r13), M3.getString(r14), M3.getString(r15), M3.getString(r16), M3.getString(r17), M3.getDouble(r18), M3.getDouble(r19), M3.getInt(r20), M3.isNull(r21) ? null : M3.getString(r21), M3.getString(r22), M3.getString(i6)), (ArrayList) jVar.get(M3.getString(r12))));
                                    r13 = i7;
                                    i5 = i6;
                                    r12 = r12;
                                    favouritesDao_Impl2 = favouritesDao_Impl3;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            FavouritesDao_Impl favouritesDao_Impl4 = favouritesDao_Impl2;
                            uVar5 = favouritesDao_Impl4.__db;
                            uVar5.setTransactionSuccessful();
                            uVar6 = favouritesDao_Impl4.__db;
                            uVar6.endTransaction();
                            return arrayList2;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            default:
                favouritesDao_Impl = this.f59c;
                uVar7 = favouritesDao_Impl.__db;
                uVar7.beginTransaction();
                try {
                    uVar8 = favouritesDao_Impl.__db;
                    M3 = AbstractC0105a.M(uVar8, this.f58b, false);
                    try {
                        int r24 = m3.l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER);
                        int r25 = m3.l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE);
                        int r26 = m3.l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE);
                        int r27 = m3.l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE);
                        int r28 = m3.l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_OPERATOR);
                        int r29 = m3.l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT);
                        int r30 = m3.l.r(M3, "timeStationFrom");
                        int r31 = m3.l.r(M3, "timeStationTo");
                        ArrayList arrayList3 = new ArrayList(M3.getCount());
                        while (M3.moveToNext()) {
                            arrayList3.add(new FavouriteTrainEntity(M3.getString(r24), M3.getString(r25), M3.getString(r26), M3.getLong(r27), M3.isNull(r28) ? null : M3.getString(r28), M3.isNull(r29) ? null : M3.getString(r29), M3.isNull(r30) ? null : M3.getString(r30), M3.isNull(r31) ? null : M3.getString(r31)));
                        }
                        uVar9 = favouritesDao_Impl.__db;
                        uVar9.setTransactionSuccessful();
                        return arrayList3;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                } finally {
                    uVar3 = favouritesDao_Impl.__db;
                    uVar3.endTransaction();
                }
        }
    }

    public final void finalize() {
        switch (this.f57a) {
            case 0:
                this.f58b.release();
                return;
            case 1:
                this.f58b.release();
                return;
            default:
                this.f58b.release();
                return;
        }
    }
}
