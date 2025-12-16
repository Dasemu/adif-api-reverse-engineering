package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceComment;
import com.adif.elcanomovil.serviceNetworking.avisa.model.IncidenceCommentResponse;
import com.adif.elcanomovil.serviceNetworking.avisa.model.IncidencePictureResponse;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceCommentEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidencePictureEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/repositories/avisa/IncidenceCommentMapper;", "", "()V", "entityToDomain", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceComment;", "source", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceCommentEntity;", "responseToEntity", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidenceCommentResponse;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIncidenceCommentMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IncidenceCommentMapper.kt\ncom/adif/elcanomovil/repositories/avisa/IncidenceCommentMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1#2:32\n1549#3:33\n1620#3,3:34\n1549#3:37\n1620#3,3:38\n*S KotlinDebug\n*F\n+ 1 IncidenceCommentMapper.kt\ncom/adif/elcanomovil/repositories/avisa/IncidenceCommentMapper\n*L\n17#1:33\n17#1:34,3\n28#1:37\n28#1:38,3\n*E\n"})
/* loaded from: classes.dex */
public final class IncidenceCommentMapper {
    public final IncidenceComment entityToDomain(IncidenceCommentEntity source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Date createTime = source.getCreateTime();
        Date updatedTime = source.getUpdatedTime();
        String type = source.getType();
        String statusTypeId = source.getStatusTypeId();
        String description = source.getDescription();
        Integer incidenceId = source.getIncidenceId();
        List<IncidencePictureEntity> fixPhotos = source.getFixPhotos();
        ArrayList arrayList = new ArrayList(CollectionsKt.g(fixPhotos));
        Iterator<T> it = fixPhotos.iterator();
        while (it.hasNext()) {
            arrayList.add(new IncidencePictureMapper().entityToDomain((IncidencePictureEntity) it.next()));
        }
        return new IncidenceComment(createTime, updatedTime, type, statusTypeId, description, incidenceId, arrayList);
    }

    public final IncidenceCommentEntity responseToEntity(IncidenceCommentResponse source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Long createTime = source.getCreateTime();
        Date date = createTime != null ? new Date(createTime.longValue()) : null;
        Long updatedTime = source.getUpdatedTime();
        Date date2 = updatedTime != null ? new Date(updatedTime.longValue()) : null;
        String type = source.getType();
        String statusTypeId = source.getStatusTypeId();
        String description = source.getDescription();
        Integer incidenceId = source.getIncidenceId();
        List<IncidencePictureResponse> fixPhotos = source.getFixPhotos();
        ArrayList arrayList = new ArrayList(CollectionsKt.g(fixPhotos));
        Iterator<T> it = fixPhotos.iterator();
        while (it.hasNext()) {
            arrayList.add(new IncidencePictureMapper().responseToEntity((IncidencePictureResponse) it.next()));
        }
        return new IncidenceCommentEntity(0, date, date2, type, statusTypeId, description, incidenceId, arrayList, 1, null);
    }
}
