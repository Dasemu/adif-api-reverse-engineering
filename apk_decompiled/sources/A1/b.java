package A1;

import androidx.room.u;
import com.adif.elcanomovil.serviceStorage.model.FavouriteEntity;
import com.adif.elcanomovil.serviceStorage.model.FavouriteTrainEntity;
import com.adif.elcanomovil.serviceStorage.model.StationEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationCategoryEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationEntity;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionAuxEntity;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public final class b extends androidx.room.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f36d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(u uVar, int i) {
        super(uVar);
        this.f36d = i;
    }

    @Override // androidx.room.y
    public final String b() {
        switch (this.f36d) {
            case 0:
                return "INSERT OR REPLACE INTO `AvisaStation` (`stId`,`name`,`code`,`latitude`,`longitude`) VALUES (?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `AvisaStationCategory` (`catId`,`title`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `FavouriteEntity` (`favouriteId`,`identifierStation`,`stationName`,`identifierToStation`,`stationToName`,`type`,`isCercanias`,`isRodalies`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `FavouriteTrainEntity` (`commercialNumber`,`originStationCode`,`destinationStationCode`,`launchingDate`,`operator`,`commercialProduct`,`timeStationFrom`,`timeStationTo`) VALUES (?,?,?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `StationEntity` (`stationCode`,`stationType`,`longName`,`shortName`,`longNameToFind`,`shortNameToFind`,`latitude`,`longitude`,`trafficType`,`commercialZoneType`,`commuterNetwork`,`akaName`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `SubscriptionAuxEntity` (`subcriptionAuxId`,`subscriptionType`,`operator`,`commercialProduct`) VALUES (nullif(?, 0),?,?,?)";
        }
    }

    @Override // androidx.room.j
    public final void d(InterfaceC0649e interfaceC0649e, Object obj) {
        switch (this.f36d) {
            case 0:
                AvisaStationEntity avisaStationEntity = (AvisaStationEntity) obj;
                interfaceC0649e.k(1, avisaStationEntity.getStId());
                interfaceC0649e.k(2, avisaStationEntity.getName());
                interfaceC0649e.k(3, avisaStationEntity.getCode());
                if (avisaStationEntity.getLatitude() == null) {
                    interfaceC0649e.t(4);
                } else {
                    interfaceC0649e.v(4, avisaStationEntity.getLatitude().doubleValue());
                }
                if (avisaStationEntity.getLongitude() == null) {
                    interfaceC0649e.t(5);
                    return;
                } else {
                    interfaceC0649e.v(5, avisaStationEntity.getLongitude().doubleValue());
                    return;
                }
            case 1:
                AvisaStationCategoryEntity avisaStationCategoryEntity = (AvisaStationCategoryEntity) obj;
                interfaceC0649e.k(1, avisaStationCategoryEntity.getCatId());
                interfaceC0649e.k(2, avisaStationCategoryEntity.getTitle());
                return;
            case 2:
                FavouriteEntity favouriteEntity = (FavouriteEntity) obj;
                interfaceC0649e.I(1, favouriteEntity.getFavouriteId());
                if (favouriteEntity.getIdentifierStation() == null) {
                    interfaceC0649e.t(2);
                } else {
                    interfaceC0649e.k(2, favouriteEntity.getIdentifierStation());
                }
                if (favouriteEntity.getStationName() == null) {
                    interfaceC0649e.t(3);
                } else {
                    interfaceC0649e.k(3, favouriteEntity.getStationName());
                }
                if (favouriteEntity.getIdentifierToStation() == null) {
                    interfaceC0649e.t(4);
                } else {
                    interfaceC0649e.k(4, favouriteEntity.getIdentifierToStation());
                }
                if (favouriteEntity.getStationToName() == null) {
                    interfaceC0649e.t(5);
                } else {
                    interfaceC0649e.k(5, favouriteEntity.getStationToName());
                }
                interfaceC0649e.k(6, favouriteEntity.getType());
                if ((favouriteEntity.isCercanias() == null ? null : Integer.valueOf(favouriteEntity.isCercanias().booleanValue() ? 1 : 0)) == null) {
                    interfaceC0649e.t(7);
                } else {
                    interfaceC0649e.I(7, r4.intValue());
                }
                if ((favouriteEntity.isRodalies() != null ? Integer.valueOf(favouriteEntity.isRodalies().booleanValue() ? 1 : 0) : null) == null) {
                    interfaceC0649e.t(8);
                    return;
                } else {
                    interfaceC0649e.I(8, r0.intValue());
                    return;
                }
            case 3:
                FavouriteTrainEntity favouriteTrainEntity = (FavouriteTrainEntity) obj;
                interfaceC0649e.k(1, favouriteTrainEntity.getCommercialNumber());
                interfaceC0649e.k(2, favouriteTrainEntity.getOriginStationCode());
                interfaceC0649e.k(3, favouriteTrainEntity.getDestinationStationCode());
                interfaceC0649e.I(4, favouriteTrainEntity.getLaunchingDate());
                if (favouriteTrainEntity.getOperator() == null) {
                    interfaceC0649e.t(5);
                } else {
                    interfaceC0649e.k(5, favouriteTrainEntity.getOperator());
                }
                if (favouriteTrainEntity.getCommercialProduct() == null) {
                    interfaceC0649e.t(6);
                } else {
                    interfaceC0649e.k(6, favouriteTrainEntity.getCommercialProduct());
                }
                if (favouriteTrainEntity.getTimeStationFrom() == null) {
                    interfaceC0649e.t(7);
                } else {
                    interfaceC0649e.k(7, favouriteTrainEntity.getTimeStationFrom());
                }
                if (favouriteTrainEntity.getTimeStationTo() == null) {
                    interfaceC0649e.t(8);
                    return;
                } else {
                    interfaceC0649e.k(8, favouriteTrainEntity.getTimeStationTo());
                    return;
                }
            case 4:
                StationEntity stationEntity = (StationEntity) obj;
                interfaceC0649e.k(1, stationEntity.getStationCode());
                interfaceC0649e.k(2, stationEntity.getStationType());
                interfaceC0649e.k(3, stationEntity.getLongName());
                interfaceC0649e.k(4, stationEntity.getShortName());
                interfaceC0649e.k(5, stationEntity.getLongNameToFind());
                interfaceC0649e.k(6, stationEntity.getShortNameToFind());
                interfaceC0649e.v(7, stationEntity.getLatitude());
                interfaceC0649e.v(8, stationEntity.getLongitude());
                interfaceC0649e.I(9, stationEntity.getTrafficType());
                if (stationEntity.getCommercialZoneType() == null) {
                    interfaceC0649e.t(10);
                } else {
                    interfaceC0649e.k(10, stationEntity.getCommercialZoneType());
                }
                interfaceC0649e.k(11, stationEntity.getCommuterNetwork());
                interfaceC0649e.k(12, stationEntity.getAkaName());
                return;
            default:
                SubscriptionAuxEntity subscriptionAuxEntity = (SubscriptionAuxEntity) obj;
                interfaceC0649e.I(1, subscriptionAuxEntity.getSubcriptionAuxId());
                interfaceC0649e.k(2, subscriptionAuxEntity.getSubscriptionType());
                if (subscriptionAuxEntity.getOperator() == null) {
                    interfaceC0649e.t(3);
                } else {
                    interfaceC0649e.k(3, subscriptionAuxEntity.getOperator());
                }
                if (subscriptionAuxEntity.getCommercialProduct() == null) {
                    interfaceC0649e.t(4);
                    return;
                } else {
                    interfaceC0649e.k(4, subscriptionAuxEntity.getCommercialProduct());
                    return;
                }
        }
    }
}
