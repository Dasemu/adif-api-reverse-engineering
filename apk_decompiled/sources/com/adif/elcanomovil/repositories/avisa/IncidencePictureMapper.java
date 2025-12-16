package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidencePicture;
import com.adif.elcanomovil.serviceNetworking.avisa.model.IncidencePictureResponse;
import com.adif.elcanomovil.serviceNetworking.avisa.model.IncidenceRequestPicture;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidencePictureEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/repositories/avisa/IncidencePictureMapper;", "", "()V", "domainToRequest", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidenceRequestPicture;", "source", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidencePicture;", "entityToDomain", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidencePictureEntity;", "responseToEntity", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidencePictureResponse;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IncidencePictureMapper {
    public final IncidenceRequestPicture domainToRequest(IncidencePicture source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new IncidenceRequestPicture(source.getType(), source.getContent());
    }

    public final IncidencePicture entityToDomain(IncidencePictureEntity source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new IncidencePicture(source.getType(), source.getContent(), source.getThumbnail(), source.getIncidenceId(), source.getPath());
    }

    public final IncidencePictureEntity responseToEntity(IncidencePictureResponse source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new IncidencePictureEntity(0, source.getType(), source.getContent(), source.getThumbnail(), source.getIncidenceId(), source.getPath(), 1, null);
    }
}
