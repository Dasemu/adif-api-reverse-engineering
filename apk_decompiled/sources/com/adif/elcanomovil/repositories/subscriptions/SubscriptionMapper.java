package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.subscription.Destination;
import com.adif.elcanomovil.domain.entities.subscription.Origin;
import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.domain.entities.subscription.SubscriptionType;
import com.adif.elcanomovil.repositories.R;
import com.adif.elcanomovil.serviceNetworking.subscriptions.models.DestinationResponse;
import com.adif.elcanomovil.serviceNetworking.subscriptions.models.SubscriptionResponse;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.DestinationEntity;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.OriginEntity;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/adif/elcanomovil/repositories/subscriptions/SubscriptionMapper;", "", "Ld1/g;", "stringProvider", "<init>", "(Ld1/g;)V", "Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;", "source", "Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/SubscriptionEntity;", "domainToEntity", "(Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;)Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/SubscriptionEntity;", "entityToDomain", "(Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/SubscriptionEntity;)Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;", "Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/SubscriptionResponse;", "", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "responseToEntity", "(Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/SubscriptionResponse;Ljava/lang/String;Ljava/lang/String;)Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/SubscriptionEntity;", "Ld1/g;", "getStringProvider", "()Ld1/g;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSubscriptionMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionMapper.kt\ncom/adif/elcanomovil/repositories/subscriptions/SubscriptionMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
/* loaded from: classes.dex */
public final class SubscriptionMapper {
    private final d1.g stringProvider;

    public SubscriptionMapper(d1.g stringProvider) {
        Intrinsics.checkNotNullParameter(stringProvider, "stringProvider");
        this.stringProvider = stringProvider;
    }

    public final SubscriptionEntity domainToEntity(Subscription source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int id = source.getId();
        Destination destination = source.getDestination();
        DestinationEntity domainToEntity = destination != null ? new DestinationMapper().domainToEntity(destination) : null;
        OriginEntity domainToEntity2 = new OriginMapper().domainToEntity(source.getOrigin());
        String repeats = source.getRepeats();
        String subscriptionType = source.getSubscriptionType();
        String timeCenter = source.getTimeCenter();
        String timeEnd = source.getTimeEnd();
        String timeStart = source.getTimeStart();
        boolean active = source.getActive();
        String operator = source.getOperator();
        if (operator == null) {
            operator = ((d1.h) this.stringProvider).a(R.string.circulation_header_train);
        }
        return new SubscriptionEntity(id, domainToEntity, domainToEntity2, repeats, subscriptionType, timeCenter, timeEnd, timeStart, active, operator, source.getCommercialProduct());
    }

    public final Subscription entityToDomain(SubscriptionEntity source) {
        Intrinsics.checkNotNullParameter(source, "source");
        SubscriptionType subscriptionType = SubscriptionType.TRAIN;
        if (source.getDestination() != null) {
            subscriptionType = SubscriptionType.JOURNEY;
        }
        SubscriptionType subscriptionType2 = subscriptionType;
        int subcriptionId = source.getSubcriptionId();
        DestinationEntity destination = source.getDestination();
        Destination entityToDomain = destination != null ? new DestinationMapper().entityToDomain(destination) : null;
        Origin entityToDomain2 = new OriginMapper().entityToDomain(source.getOrigin());
        String repeats = source.getRepeats();
        String subscriptionType3 = source.getSubscriptionType();
        String timeCenter = source.getTimeCenter();
        String timeEnd = source.getTimeEnd();
        String timeStart = source.getTimeStart();
        boolean active = source.getActive();
        String operator = source.getOperator();
        return new Subscription(subcriptionId, entityToDomain, entityToDomain2, repeats, subscriptionType3, timeCenter, timeEnd, timeStart, active, subscriptionType2, (operator == null || operator.length() == 0) ? "" : source.getOperator(), source.getCommercialProduct());
    }

    public final d1.g getStringProvider() {
        return this.stringProvider;
    }

    public final SubscriptionEntity responseToEntity(SubscriptionResponse source, String operator, String commercialProduct) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(commercialProduct, "commercialProduct");
        DestinationResponse destination = source.getDestination();
        return new SubscriptionEntity(0, destination != null ? new DestinationMapper().responseToEntity(destination) : null, new OriginMapper().responseToEntity(source.getOrigin()), source.getRepeats(), source.getSubscriptionType(), source.getTimeCenter(), source.getTimeEnd(), source.getTimeStart(), false, operator, commercialProduct, 257, null);
    }
}
