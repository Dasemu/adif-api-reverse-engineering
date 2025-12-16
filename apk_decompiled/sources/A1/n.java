package A1;

import androidx.room.u;
import com.adif.elcanomovil.serviceStorage.database.IncidenceDao_Impl;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceEntity;
import com.adif.elcanomovil.serviceStorage.utils.CommentTypeConverter;
import com.adif.elcanomovil.serviceStorage.utils.DateConverter;
import com.adif.elcanomovil.serviceStorage.utils.PictureTypeConverter;
import kotlin.jvm.internal.Intrinsics;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public final class n extends androidx.room.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IncidenceDao_Impl f67d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(IncidenceDao_Impl incidenceDao_Impl, u database) {
        super(database);
        this.f67d = incidenceDao_Impl;
        Intrinsics.checkNotNullParameter(database, "database");
    }

    @Override // androidx.room.y
    public final String b() {
        return "UPDATE OR ABORT `IncidenceEntity` SET `id` = ?,`incidenceCode` = ?,`stationId` = ?,`statusTypeId` = ?,`description` = ?,`notificationTypeId` = ?,`createdTime` = ?,`estimatedDateTo` = ?,`solvedDate` = ?,`categoryId` = ?,`photos` = ?,`comments` = ? WHERE `id` = ?";
    }

    @Override // androidx.room.i
    public final void d(InterfaceC0649e interfaceC0649e, Object obj) {
        PictureTypeConverter pictureTypeConverter;
        CommentTypeConverter commentTypeConverter;
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
        IncidenceDao_Impl incidenceDao_Impl = this.f67d;
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
        } else {
            interfaceC0649e.k(12, listToString2);
        }
        interfaceC0649e.I(13, incidenceEntity.getId());
    }
}
