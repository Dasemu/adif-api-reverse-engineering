package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.domain.entities.avisa.incidence.Incidence;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceStation;
import com.adif.elcanomovil.serviceNetworking.avisa.model.IncidenceCommentResponse;
import com.adif.elcanomovil.serviceNetworking.avisa.model.IncidencePictureResponse;
import com.adif.elcanomovil.serviceNetworking.avisa.model.IncidenceResponse;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceCommentEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidencePictureEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceStationEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/repositories/avisa/IncidenceMapper;", "", "incidencePictureMapper", "Lcom/adif/elcanomovil/repositories/avisa/IncidencePictureMapper;", "incidenceCommentMapper", "Lcom/adif/elcanomovil/repositories/avisa/IncidenceCommentMapper;", "avisaStationMapper", "Lcom/adif/elcanomovil/repositories/avisa/AvisaStationMapper;", "avisaStationCategoryMapper", "Lcom/adif/elcanomovil/repositories/avisa/AvisaStationCategoryMapper;", "(Lcom/adif/elcanomovil/repositories/avisa/IncidencePictureMapper;Lcom/adif/elcanomovil/repositories/avisa/IncidenceCommentMapper;Lcom/adif/elcanomovil/repositories/avisa/AvisaStationMapper;Lcom/adif/elcanomovil/repositories/avisa/AvisaStationCategoryMapper;)V", "entityToDomain", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/Incidence;", "source", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceEntity;", "entityToDomainIncidenceStation", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceStation;", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceStationEntity;", "responseToEntity", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidenceResponse;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIncidenceMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IncidenceMapper.kt\ncom/adif/elcanomovil/repositories/avisa/IncidenceMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1549#2:56\n1620#2,3:57\n1549#2:60\n1620#2,3:61\n1549#2:65\n1620#2,3:66\n1549#2:69\n1620#2,3:70\n1#3:64\n*S KotlinDebug\n*F\n+ 1 IncidenceMapper.kt\ncom/adif/elcanomovil/repositories/avisa/IncidenceMapper\n*L\n28#1:56\n28#1:57,3\n29#1:60\n29#1:61,3\n44#1:65\n44#1:66,3\n45#1:69\n45#1:70,3\n*E\n"})
/* loaded from: classes.dex */
public final class IncidenceMapper {
    private final AvisaStationCategoryMapper avisaStationCategoryMapper;
    private final AvisaStationMapper avisaStationMapper;
    private final IncidenceCommentMapper incidenceCommentMapper;
    private final IncidencePictureMapper incidencePictureMapper;

    public IncidenceMapper(IncidencePictureMapper incidencePictureMapper, IncidenceCommentMapper incidenceCommentMapper, AvisaStationMapper avisaStationMapper, AvisaStationCategoryMapper avisaStationCategoryMapper) {
        Intrinsics.checkNotNullParameter(incidencePictureMapper, "incidencePictureMapper");
        Intrinsics.checkNotNullParameter(incidenceCommentMapper, "incidenceCommentMapper");
        Intrinsics.checkNotNullParameter(avisaStationMapper, "avisaStationMapper");
        Intrinsics.checkNotNullParameter(avisaStationCategoryMapper, "avisaStationCategoryMapper");
        this.incidencePictureMapper = incidencePictureMapper;
        this.incidenceCommentMapper = incidenceCommentMapper;
        this.avisaStationMapper = avisaStationMapper;
        this.avisaStationCategoryMapper = avisaStationCategoryMapper;
    }

    public final Incidence entityToDomain(IncidenceEntity source) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(source, "source");
        int id = source.getId();
        String incidenceCode = source.getIncidenceCode();
        String stationId = source.getStationId();
        int statusTypeId = source.getStatusTypeId();
        String description = source.getDescription();
        int notificationTypeId = source.getNotificationTypeId();
        Date createdTime = source.getCreatedTime();
        Date estimatedDateTo = source.getEstimatedDateTo();
        Date solvedDate = source.getSolvedDate();
        String categoryId = source.getCategoryId();
        List<IncidencePictureEntity> photos = source.getPhotos();
        if (photos != null) {
            List<IncidencePictureEntity> list = photos;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.g(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(this.incidencePictureMapper.entityToDomain((IncidencePictureEntity) it.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List<IncidenceCommentEntity> comments = source.getComments();
        if (comments != null) {
            List<IncidenceCommentEntity> list2 = comments;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.g(list2));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(this.incidenceCommentMapper.entityToDomain((IncidenceCommentEntity) it2.next()));
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        return new Incidence(id, incidenceCode, stationId, statusTypeId, description, notificationTypeId, createdTime, estimatedDateTo, solvedDate, categoryId, arrayList, arrayList2);
    }

    public final IncidenceStation entityToDomainIncidenceStation(IncidenceStationEntity source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new IncidenceStation(entityToDomain(source.getIncidence()), this.avisaStationMapper.entityToDomain(source.getAvisaStation()), this.avisaStationCategoryMapper.entityToDomain(source.getCategoryAvisa()));
    }

    public final IncidenceEntity responseToEntity(IncidenceResponse source) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(source, "source");
        int id = source.getId();
        String incidenceCode = source.getIncidenceCode();
        String stationId = source.getStationId();
        int statusTypeId = source.getStatusTypeId();
        String description = source.getDescription();
        int notificationTypeId = source.getNotificationTypeId();
        Date date = new Date(source.getCreatedTime());
        Long estimatedDateTo = source.getEstimatedDateTo();
        Date date2 = estimatedDateTo != null ? new Date(estimatedDateTo.longValue()) : null;
        Long solvedDate = source.getSolvedDate();
        Date date3 = solvedDate != null ? new Date(solvedDate.longValue()) : null;
        String categoryId = source.getCategoryId();
        List<IncidencePictureResponse> photos = source.getPhotos();
        if (photos != null) {
            List<IncidencePictureResponse> list = photos;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.g(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(this.incidencePictureMapper.responseToEntity((IncidencePictureResponse) it.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List<IncidenceCommentResponse> comments = source.getComments();
        if (comments != null) {
            List<IncidenceCommentResponse> list2 = comments;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.g(list2));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(this.incidenceCommentMapper.responseToEntity((IncidenceCommentResponse) it2.next()));
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        return new IncidenceEntity(id, incidenceCode, stationId, statusTypeId, description, notificationTypeId, date, date2, date3, categoryId, arrayList, arrayList2);
    }
}
