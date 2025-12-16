package A1;

import androidx.room.u;
import com.adif.elcanomovil.serviceStorage.database.IncidenceDao_Impl;
import com.adif.elcanomovil.serviceStorage.database.SubscriptionsDao_Impl;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceEntity;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionEntity;
import com.adif.elcanomovil.serviceStorage.utils.CommentTypeConverter;
import com.adif.elcanomovil.serviceStorage.utils.DateConverter;
import com.adif.elcanomovil.serviceStorage.utils.DestinationTypeConverter;
import com.adif.elcanomovil.serviceStorage.utils.OriginTypeConverter;
import com.adif.elcanomovil.serviceStorage.utils.PictureTypeConverter;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public final class m extends androidx.room.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f65d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f66e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, u uVar, int i) {
        super(uVar);
        this.f65d = i;
        this.f66e = obj;
    }

    @Override // androidx.room.y
    public final String b() {
        switch (this.f65d) {
            case 0:
                return "INSERT OR REPLACE INTO `IncidenceEntity` (`id`,`incidenceCode`,`stationId`,`statusTypeId`,`description`,`notificationTypeId`,`createdTime`,`estimatedDateTo`,`solvedDate`,`categoryId`,`photos`,`comments`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `SubscriptionEntity` (`subcriptionId`,`destination`,`origin`,`repeats`,`subscriptionType`,`timeCenter`,`timeEnd`,`timeStart`,`active`,`operator`,`commercialProduct`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
        }
    }

    @Override // androidx.room.j
    public final void d(InterfaceC0649e interfaceC0649e, Object obj) {
        PictureTypeConverter pictureTypeConverter;
        CommentTypeConverter commentTypeConverter;
        DestinationTypeConverter destinationTypeConverter;
        OriginTypeConverter originTypeConverter;
        Object obj2 = this.f66e;
        switch (this.f65d) {
            case 0:
                IncidenceEntity incidenceEntity = (IncidenceEntity) obj;
                interfaceC0649e.I(1, incidenceEntity.getId());
                interfaceC0649e.k(2, incidenceEntity.getIncidenceCode());
                if (incidenceEntity.getStationId() == null) {
                    interfaceC0649e.t(3);
                } else {
                    interfaceC0649e.k(3, incidenceEntity.getStationId());
                }
                interfaceC0649e.I(4, incidenceEntity.getStatusTypeId());
                interfaceC0649e.k(5, incidenceEntity.getDescription());
                interfaceC0649e.I(6, incidenceEntity.getNotificationTypeId());
                DateConverter dateConverter = DateConverter.INSTANCE;
                Long timestamp = DateConverter.toTimestamp(incidenceEntity.getCreatedTime());
                if (timestamp == null) {
                    interfaceC0649e.t(7);
                } else {
                    interfaceC0649e.I(7, timestamp.longValue());
                }
                Long timestamp2 = DateConverter.toTimestamp(incidenceEntity.getEstimatedDateTo());
                if (timestamp2 == null) {
                    interfaceC0649e.t(8);
                } else {
                    interfaceC0649e.I(8, timestamp2.longValue());
                }
                Long timestamp3 = DateConverter.toTimestamp(incidenceEntity.getSolvedDate());
                if (timestamp3 == null) {
                    interfaceC0649e.t(9);
                } else {
                    interfaceC0649e.I(9, timestamp3.longValue());
                }
                if (incidenceEntity.getCategoryId() == null) {
                    interfaceC0649e.t(10);
                } else {
                    interfaceC0649e.k(10, incidenceEntity.getCategoryId());
                }
                IncidenceDao_Impl incidenceDao_Impl = (IncidenceDao_Impl) obj2;
                pictureTypeConverter = incidenceDao_Impl.__pictureTypeConverter;
                String listToString = pictureTypeConverter.listToString(incidenceEntity.getPhotos());
                if (listToString == null) {
                    interfaceC0649e.t(11);
                } else {
                    interfaceC0649e.k(11, listToString);
                }
                commentTypeConverter = incidenceDao_Impl.__commentTypeConverter;
                String listToString2 = commentTypeConverter.listToString(incidenceEntity.getComments());
                if (listToString2 == null) {
                    interfaceC0649e.t(12);
                    return;
                } else {
                    interfaceC0649e.k(12, listToString2);
                    return;
                }
            default:
                SubscriptionEntity subscriptionEntity = (SubscriptionEntity) obj;
                interfaceC0649e.I(1, subscriptionEntity.getSubcriptionId());
                SubscriptionsDao_Impl subscriptionsDao_Impl = (SubscriptionsDao_Impl) obj2;
                destinationTypeConverter = subscriptionsDao_Impl.__destinationTypeConverter;
                String destinationToString = destinationTypeConverter.destinationToString(subscriptionEntity.getDestination());
                if (destinationToString == null) {
                    interfaceC0649e.t(2);
                } else {
                    interfaceC0649e.k(2, destinationToString);
                }
                originTypeConverter = subscriptionsDao_Impl.__originTypeConverter;
                String origiginToString = originTypeConverter.origiginToString(subscriptionEntity.getOrigin());
                if (origiginToString == null) {
                    interfaceC0649e.t(3);
                } else {
                    interfaceC0649e.k(3, origiginToString);
                }
                interfaceC0649e.k(4, subscriptionEntity.getRepeats());
                interfaceC0649e.k(5, subscriptionEntity.getSubscriptionType());
                interfaceC0649e.k(6, subscriptionEntity.getTimeCenter());
                if (subscriptionEntity.getTimeEnd() == null) {
                    interfaceC0649e.t(7);
                } else {
                    interfaceC0649e.k(7, subscriptionEntity.getTimeEnd());
                }
                if (subscriptionEntity.getTimeStart() == null) {
                    interfaceC0649e.t(8);
                } else {
                    interfaceC0649e.k(8, subscriptionEntity.getTimeStart());
                }
                interfaceC0649e.I(9, subscriptionEntity.getActive() ? 1L : 0L);
                if (subscriptionEntity.getOperator() == null) {
                    interfaceC0649e.t(10);
                } else {
                    interfaceC0649e.k(10, subscriptionEntity.getOperator());
                }
                if (subscriptionEntity.getCommercialProduct() == null) {
                    interfaceC0649e.t(11);
                    return;
                } else {
                    interfaceC0649e.k(11, subscriptionEntity.getCommercialProduct());
                    return;
                }
        }
    }
}
