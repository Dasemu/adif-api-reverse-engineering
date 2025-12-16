package com.adif.elcanomovil.serviceStorage.database;

import Z2.G;
import androidx.room.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/database/StationDatabase;", "Landroidx/room/u;", "<init>", "()V", "Lcom/adif/elcanomovil/serviceStorage/database/StationsDao;", "stationsDAO", "()Lcom/adif/elcanomovil/serviceStorage/database/StationsDao;", "Lcom/adif/elcanomovil/serviceStorage/database/FavouritesDao;", "favouritesDAO", "()Lcom/adif/elcanomovil/serviceStorage/database/FavouritesDao;", "Lcom/adif/elcanomovil/serviceStorage/database/IncidenceDao;", "incidenceDao", "()Lcom/adif/elcanomovil/serviceStorage/database/IncidenceDao;", "Lcom/adif/elcanomovil/serviceStorage/database/AvisaStationDao;", "avisaStationDao", "()Lcom/adif/elcanomovil/serviceStorage/database/AvisaStationDao;", "Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsDao;", "subscriptionsDao", "()Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsDao;", "Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsAuxDataDao;", "subscriptionsAuxDataDao", "()Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsAuxDataDao;", "Companion", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class StationDatabase extends u {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static G moshi;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/database/StationDatabase$Companion;", "", "<init>", "()V", "LZ2/G;", "moshi", "LZ2/G;", "getMoshi", "()LZ2/G;", "setMoshi", "(LZ2/G;)V", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final G getMoshi() {
            G g4 = StationDatabase.moshi;
            if (g4 != null) {
                return g4;
            }
            Intrinsics.throwUninitializedPropertyAccessException("moshi");
            return null;
        }

        public final void setMoshi(G g4) {
            Intrinsics.checkNotNullParameter(g4, "<set-?>");
            StationDatabase.moshi = g4;
        }

        private Companion() {
        }
    }

    public abstract AvisaStationDao avisaStationDao();

    public abstract FavouritesDao favouritesDAO();

    public abstract IncidenceDao incidenceDao();

    public abstract StationsDao stationsDAO();

    public abstract SubscriptionsAuxDataDao subscriptionsAuxDataDao();

    public abstract SubscriptionsDao subscriptionsDao();
}
