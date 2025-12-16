package com.adif.elcanomovil.serviceStorage.di;

import Z2.G;
import Z2.InterfaceC0103k;
import a3.a;
import android.content.Context;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceStorage.database.AvisaStationDao;
import com.adif.elcanomovil.serviceStorage.database.FavouritesDao;
import com.adif.elcanomovil.serviceStorage.database.IncidenceDao;
import com.adif.elcanomovil.serviceStorage.database.StationDatabase;
import com.adif.elcanomovil.serviceStorage.database.StationsDao;
import com.adif.elcanomovil.serviceStorage.database.SubscriptionsAuxDataDao;
import com.adif.elcanomovil.serviceStorage.database.SubscriptionsDao;
import com.adif.elcanomovil.serviceStorage.model.StationStored;
import com.adif.elcanomovil.serviceStorage.model.StationStoredEntity;
import com.adif.elcanomovil.serviceStorage.model.TrainStored;
import com.adif.elcanomovil.serviceStorage.model.TrainStoredEntity;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.adif.elcanomovil.serviceStorage.preferences.SharedPreferenceStorage;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/di/StorageModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LZ2/G;", "moshi", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "providePreferenceStorage", "(Landroid/content/Context;LZ2/G;)Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "Lcom/adif/elcanomovil/serviceStorage/database/StationDatabase;", "provideStationDatabase", "(Landroid/content/Context;LZ2/G;)Lcom/adif/elcanomovil/serviceStorage/database/StationDatabase;", "database", "Lcom/adif/elcanomovil/serviceStorage/database/StationsDao;", "provideStationsDao", "(Lcom/adif/elcanomovil/serviceStorage/database/StationDatabase;)Lcom/adif/elcanomovil/serviceStorage/database/StationsDao;", "Lcom/adif/elcanomovil/serviceStorage/database/FavouritesDao;", "provideFavouritesDao", "(Lcom/adif/elcanomovil/serviceStorage/database/StationDatabase;)Lcom/adif/elcanomovil/serviceStorage/database/FavouritesDao;", "Lcom/adif/elcanomovil/serviceStorage/database/IncidenceDao;", "provideIncidenceDao", "(Lcom/adif/elcanomovil/serviceStorage/database/StationDatabase;)Lcom/adif/elcanomovil/serviceStorage/database/IncidenceDao;", "Lcom/adif/elcanomovil/serviceStorage/database/AvisaStationDao;", "provideAvisaStationDao", "(Lcom/adif/elcanomovil/serviceStorage/database/StationDatabase;)Lcom/adif/elcanomovil/serviceStorage/database/AvisaStationDao;", "LZ2/k;", "provideMoshiPolymorphicFactory", "()LZ2/k;", "provideMoshiPolymorphicFactoryTrain", "Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsDao;", "provideSubscriptionDao", "(Lcom/adif/elcanomovil/serviceStorage/database/StationDatabase;)Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsDao;", "Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsAuxDataDao;", "provideSubscriptionAuxDataDao", "(Lcom/adif/elcanomovil/serviceStorage/database/StationDatabase;)Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsAuxDataDao;", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
@InstallIn({SingletonComponent.class})
@SourceDebugExtension({"SMAP\nStorageModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageModule.kt\ncom/adif/elcanomovil/serviceStorage/di/StorageModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
/* loaded from: classes.dex */
public final class StorageModule {
    public static final StorageModule INSTANCE = new StorageModule();

    private StorageModule() {
    }

    @Provides
    public final AvisaStationDao provideAvisaStationDao(StationDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.avisaStationDao();
    }

    @Provides
    public final FavouritesDao provideFavouritesDao(StationDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.favouritesDAO();
    }

    @Provides
    public final IncidenceDao provideIncidenceDao(StationDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.incidenceDao();
    }

    @Provides
    @Named("Station")
    public final InterfaceC0103k provideMoshiPolymorphicFactory() {
        List list = Collections.EMPTY_LIST;
        if (list.contains("station")) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("station");
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.add(StationStoredEntity.class);
        a aVar = new a(StationStored.class, "fav_type", arrayList, arrayList2);
        Intrinsics.checkNotNullExpressionValue(aVar, "withSubtype(...)");
        return aVar;
    }

    @Provides
    @Named("Train")
    public final InterfaceC0103k provideMoshiPolymorphicFactoryTrain() {
        List list = Collections.EMPTY_LIST;
        if (list.contains(NavArguments.ARG_DYNAMIC_TRAIN)) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(NavArguments.ARG_DYNAMIC_TRAIN);
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.add(TrainStoredEntity.class);
        a aVar = new a(TrainStored.class, "search_type", arrayList, arrayList2);
        Intrinsics.checkNotNullExpressionValue(aVar, "withSubtype(...)");
        return aVar;
    }

    @Provides
    public final PreferenceStorage providePreferenceStorage(@ApplicationContext Context context, G moshi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new SharedPreferenceStorage(context, moshi);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5 A[Catch: InstantiationException -> 0x00fe, IllegalAccessException -> 0x0116, ClassNotFoundException -> 0x012e, TryCatch #2 {ClassNotFoundException -> 0x012e, IllegalAccessException -> 0x0116, InstantiationException -> 0x00fe, blocks: (B:16:0x00bd, B:19:0x00d7, B:24:0x00c5), top: B:15:0x00bd }] */
    @dagger.Provides
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adif.elcanomovil.serviceStorage.database.StationDatabase provideStationDatabase(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context r13, Z2.G r14) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.serviceStorage.di.StorageModule.provideStationDatabase(android.content.Context, Z2.G):com.adif.elcanomovil.serviceStorage.database.StationDatabase");
    }

    @Provides
    public final StationsDao provideStationsDao(StationDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.stationsDAO();
    }

    @Provides
    public final SubscriptionsAuxDataDao provideSubscriptionAuxDataDao(StationDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.subscriptionsAuxDataDao();
    }

    @Provides
    public final SubscriptionsDao provideSubscriptionDao(StationDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.subscriptionsDao();
    }
}
