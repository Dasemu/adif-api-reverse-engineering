package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.domain.entities.subscription.Origin;
import com.adif.elcanomovil.serviceNetworking.subscriptions.models.OriginResponse;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.OriginEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/repositories/subscriptions/OriginMapper;", "", "()V", "domainToEntity", "Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/OriginEntity;", "source", "Lcom/adif/elcanomovil/domain/entities/subscription/Origin;", "entityToDomain", "responseToDomain", "Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/OriginResponse;", "responseToEntity", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OriginMapper {
    public final OriginEntity domainToEntity(Origin source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new OriginEntity(source.getCommercialZone(), source.getCustomerService(), source.getId(), source.getLatlong(), source.getName(), source.getObservation(), source.getShortName(), source.getTrafficType());
    }

    public final Origin entityToDomain(OriginEntity source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new Origin(source.getCommercialZone(), source.getCustomerService(), source.getId(), source.getLatlong(), source.getName(), source.getObservation(), source.getShortName(), source.getTrafficType());
    }

    public final Origin responseToDomain(OriginResponse source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new Origin(source.getCommercialZone(), source.getCustomerService(), source.getId(), source.getLatlong(), source.getName(), source.getObservation(), source.getShortName(), source.getTrafficType());
    }

    public final OriginEntity responseToEntity(OriginResponse source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new OriginEntity(source.getCommercialZone(), source.getCustomerService(), source.getId(), source.getLatlong(), source.getName(), source.getObservation(), source.getShortName(), source.getTrafficType());
    }
}
