package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.domain.entities.subscription.Destination;
import com.adif.elcanomovil.serviceNetworking.subscriptions.models.DestinationResponse;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.DestinationEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/repositories/subscriptions/DestinationMapper;", "", "()V", "domainToEntity", "Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/DestinationEntity;", "source", "Lcom/adif/elcanomovil/domain/entities/subscription/Destination;", "entityToDomain", "responseToDomain", "Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/DestinationResponse;", "responseToEntity", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DestinationMapper {
    public final DestinationEntity domainToEntity(Destination source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new DestinationEntity(source.getCommercialZone(), source.getCustomerService(), source.getId(), source.getLatlong(), source.getName(), source.getObservation(), source.getShortName(), source.getTrafficType());
    }

    public final Destination entityToDomain(DestinationEntity source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new Destination(source.getCommercialZone(), source.getCustomerService(), source.getId(), source.getLatlong(), source.getName(), source.getObservation(), source.getShortName(), source.getTrafficType());
    }

    public final Destination responseToDomain(DestinationResponse source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new Destination(source.getCommercialZone(), source.getCustomerService(), source.getId(), source.getLatlong(), source.getName(), source.getObservation(), source.getShortName(), source.getTrafficType());
    }

    public final DestinationEntity responseToEntity(DestinationResponse source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new DestinationEntity(source.getCommercialZone(), source.getCustomerService(), source.getId(), source.getLatlong(), source.getName(), source.getObservation(), source.getShortName(), source.getTrafficType());
    }
}
