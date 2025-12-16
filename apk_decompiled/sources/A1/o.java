package A1;

import a.AbstractC0105a;
import android.database.Cursor;
import androidx.room.u;
import androidx.room.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceStorage.database.IncidenceDao_Impl;
import com.adif.elcanomovil.serviceStorage.database.StationsDao_Impl;
import com.adif.elcanomovil.serviceStorage.database.SubscriptionsAuxDataDao_Impl;
import com.adif.elcanomovil.serviceStorage.database.SubscriptionsDao_Impl;
import com.adif.elcanomovil.serviceStorage.model.StationEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceEntity;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.DestinationEntity;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.OriginEntity;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionAuxEntity;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionEntity;
import com.adif.elcanomovil.serviceStorage.utils.DestinationTypeConverter;
import com.adif.elcanomovil.serviceStorage.utils.OriginTypeConverter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public final class o implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f70c;

    public /* synthetic */ o(int i, Object obj, Object obj2) {
        this.f68a = i;
        this.f69b = obj;
        this.f70c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        IncidenceDao_Impl incidenceDao_Impl;
        u uVar;
        androidx.room.j jVar;
        u uVar2;
        u uVar3;
        androidx.room.i iVar;
        u uVar4;
        u uVar5;
        u uVar6;
        androidx.room.j jVar2;
        u uVar7;
        u uVar8;
        Cursor M3;
        SubscriptionsDao_Impl subscriptionsDao_Impl;
        u uVar9;
        androidx.room.j jVar3;
        u uVar10;
        u uVar11;
        androidx.room.j jVar4;
        u uVar12;
        u uVar13;
        DestinationTypeConverter destinationTypeConverter;
        DestinationEntity stringToDestination;
        OriginTypeConverter originTypeConverter;
        OriginEntity stringToOrigin;
        switch (this.f68a) {
            case 0:
                incidenceDao_Impl = (IncidenceDao_Impl) this.f69b;
                uVar = incidenceDao_Impl.__db;
                uVar.beginTransaction();
                try {
                    jVar = incidenceDao_Impl.__insertionAdapterOfIncidenceEntity;
                    jVar.e((List) this.f70c);
                    uVar2 = incidenceDao_Impl.__db;
                    uVar2.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                }
            case 1:
                incidenceDao_Impl = (IncidenceDao_Impl) this.f69b;
                uVar3 = incidenceDao_Impl.__db;
                uVar3.beginTransaction();
                try {
                    iVar = incidenceDao_Impl.__updateAdapterOfIncidenceEntity;
                    IncidenceEntity incidenceEntity = (IncidenceEntity) this.f70c;
                    InterfaceC0649e a2 = iVar.a();
                    try {
                        iVar.d(a2, incidenceEntity);
                        a2.o();
                        iVar.c(a2);
                        uVar4 = incidenceDao_Impl.__db;
                        uVar4.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        iVar.c(a2);
                        throw th;
                    }
                } finally {
                }
            case 2:
                StationsDao_Impl stationsDao_Impl = (StationsDao_Impl) this.f69b;
                uVar5 = stationsDao_Impl.__db;
                uVar5.beginTransaction();
                try {
                    jVar2 = stationsDao_Impl.__insertionAdapterOfStationEntity;
                    jVar2.e((List) this.f70c);
                    uVar7 = stationsDao_Impl.__db;
                    uVar7.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    uVar6 = stationsDao_Impl.__db;
                    uVar6.endTransaction();
                }
            case 3:
                uVar8 = ((StationsDao_Impl) this.f69b).__db;
                M3 = AbstractC0105a.M(uVar8, (w) this.f70c, false);
                try {
                    int r4 = m3.l.r(M3, "stationCode");
                    int r5 = m3.l.r(M3, "stationType");
                    int r6 = m3.l.r(M3, "longName");
                    int r7 = m3.l.r(M3, "shortName");
                    int r8 = m3.l.r(M3, "longNameToFind");
                    int r9 = m3.l.r(M3, "shortNameToFind");
                    int r10 = m3.l.r(M3, "latitude");
                    int r11 = m3.l.r(M3, "longitude");
                    int r12 = m3.l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC);
                    int r13 = m3.l.r(M3, "commercialZoneType");
                    int r14 = m3.l.r(M3, "commuterNetwork");
                    int r15 = m3.l.r(M3, "akaName");
                    ArrayList arrayList = new ArrayList(M3.getCount());
                    while (M3.moveToNext()) {
                        arrayList.add(new StationEntity(M3.getString(r4), M3.getString(r5), M3.getString(r6), M3.getString(r7), M3.getString(r8), M3.getString(r9), M3.getDouble(r10), M3.getDouble(r11), M3.getInt(r12), M3.isNull(r13) ? null : M3.getString(r13), M3.getString(r14), M3.getString(r15)));
                    }
                    return arrayList;
                } finally {
                    M3.close();
                }
            case 4:
                SubscriptionsAuxDataDao_Impl subscriptionsAuxDataDao_Impl = (SubscriptionsAuxDataDao_Impl) this.f69b;
                SubscriptionsAuxDataDao_Impl.access$000(subscriptionsAuxDataDao_Impl).beginTransaction();
                try {
                    androidx.room.j access$100 = SubscriptionsAuxDataDao_Impl.access$100(subscriptionsAuxDataDao_Impl);
                    SubscriptionAuxEntity subscriptionAuxEntity = (SubscriptionAuxEntity) this.f70c;
                    InterfaceC0649e a4 = access$100.a();
                    try {
                        access$100.d(a4, subscriptionAuxEntity);
                        a4.T();
                        access$100.c(a4);
                        SubscriptionsAuxDataDao_Impl.access$000(subscriptionsAuxDataDao_Impl).setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        access$100.c(a4);
                        throw th2;
                    }
                } finally {
                    SubscriptionsAuxDataDao_Impl.access$000(subscriptionsAuxDataDao_Impl).endTransaction();
                }
            case 5:
                subscriptionsDao_Impl = (SubscriptionsDao_Impl) this.f69b;
                uVar9 = subscriptionsDao_Impl.__db;
                uVar9.beginTransaction();
                try {
                    jVar3 = subscriptionsDao_Impl.__insertionAdapterOfSubscriptionEntity;
                    jVar3.e((List) this.f70c);
                    uVar10 = subscriptionsDao_Impl.__db;
                    uVar10.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                }
            case 6:
                subscriptionsDao_Impl = (SubscriptionsDao_Impl) this.f69b;
                uVar11 = subscriptionsDao_Impl.__db;
                uVar11.beginTransaction();
                try {
                    jVar4 = subscriptionsDao_Impl.__insertionAdapterOfSubscriptionEntity;
                    SubscriptionEntity subscriptionEntity = (SubscriptionEntity) this.f70c;
                    InterfaceC0649e a5 = jVar4.a();
                    try {
                        jVar4.d(a5, subscriptionEntity);
                        a5.T();
                        jVar4.c(a5);
                        uVar12 = subscriptionsDao_Impl.__db;
                        uVar12.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        jVar4.c(a5);
                        throw th3;
                    }
                } finally {
                }
            default:
                SubscriptionsDao_Impl subscriptionsDao_Impl2 = (SubscriptionsDao_Impl) this.f69b;
                uVar13 = subscriptionsDao_Impl2.__db;
                M3 = AbstractC0105a.M(uVar13, (w) this.f70c, false);
                try {
                    int r16 = m3.l.r(M3, "subcriptionId");
                    int r17 = m3.l.r(M3, FirebaseAnalytics.Param.DESTINATION);
                    int r18 = m3.l.r(M3, "origin");
                    int r19 = m3.l.r(M3, "repeats");
                    int r20 = m3.l.r(M3, "subscriptionType");
                    int r21 = m3.l.r(M3, "timeCenter");
                    int r22 = m3.l.r(M3, "timeEnd");
                    int r23 = m3.l.r(M3, "timeStart");
                    int r24 = m3.l.r(M3, AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
                    int r25 = m3.l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_OPERATOR);
                    int r26 = m3.l.r(M3, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT);
                    ArrayList arrayList2 = new ArrayList(M3.getCount());
                    while (M3.moveToNext()) {
                        int i = M3.getInt(r16);
                        String string = M3.isNull(r17) ? null : M3.getString(r17);
                        if (string == null) {
                            stringToDestination = null;
                        } else {
                            destinationTypeConverter = subscriptionsDao_Impl2.__destinationTypeConverter;
                            stringToDestination = destinationTypeConverter.stringToDestination(string);
                        }
                        String string2 = M3.isNull(r18) ? null : M3.getString(r18);
                        if (string2 == null) {
                            stringToOrigin = null;
                        } else {
                            originTypeConverter = subscriptionsDao_Impl2.__originTypeConverter;
                            stringToOrigin = originTypeConverter.stringToOrigin(string2);
                        }
                        if (stringToOrigin == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.adif.elcanomovil.serviceStorage.model.subscriptions.OriginEntity', but it was NULL.");
                        }
                        arrayList2.add(new SubscriptionEntity(i, stringToDestination, stringToOrigin, M3.getString(r19), M3.getString(r20), M3.getString(r21), M3.isNull(r22) ? null : M3.getString(r22), M3.isNull(r23) ? null : M3.getString(r23), M3.getInt(r24) != 0, M3.isNull(r25) ? null : M3.getString(r25), M3.isNull(r26) ? null : M3.getString(r26)));
                    }
                    return arrayList2;
                } catch (Throwable th4) {
                    throw th4;
                }
        }
    }

    public void finalize() {
        switch (this.f68a) {
            case 3:
                ((w) this.f70c).release();
                return;
            case 7:
                ((w) this.f70c).release();
                return;
            default:
                super.finalize();
                return;
        }
    }
}
