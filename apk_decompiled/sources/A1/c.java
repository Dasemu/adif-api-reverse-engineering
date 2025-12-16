package A1;

import androidx.room.u;
import androidx.room.y;

/* loaded from: classes.dex */
public final class c extends y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f37d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(u uVar, int i) {
        super(uVar);
        this.f37d = i;
    }

    @Override // androidx.room.y
    public final String b() {
        switch (this.f37d) {
            case 0:
                return "DELETE FROM AvisaStation";
            case 1:
                return "DELETE FROM AvisaStationCategory";
            case 2:
                return "DELETE FROM FavouriteEntity";
            case 3:
                return "DELETE FROM FavouriteEntity WHERE identifierStation = ? AND isCercanias = ? AND type LIKE ?";
            case 4:
                return "DELETE FROM FavouriteEntity WHERE identifierStation = ? AND identifierToStation =? AND isCercanias = ? AND type LIKE ?";
            case 5:
                return "DELETE FROM FavouriteTrainEntity WHERE commercialNumber = ? AND originStationCode = ? AND destinationStationCode = ?";
            case 6:
                return "DELETE FROM IncidenceEntity";
            case 7:
                return "DELETE FROM StationEntity";
            case 8:
                return "DELETE FROM SubscriptionEntity WHERE active = ? ";
            default:
                return "DELETE FROM SubscriptionEntity WHERE subcriptionId = ? ";
        }
    }
}
