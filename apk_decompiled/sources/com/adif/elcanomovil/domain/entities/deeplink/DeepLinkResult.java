package com.adif.elcanomovil.domain.entities.deeplink;

import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculationInfo;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/deeplink/DeepLinkResult;", "", "()V", "Departures", "Train", "Lcom/adif/elcanomovil/domain/entities/deeplink/DeepLinkResult$Departures;", "Lcom/adif/elcanomovil/domain/entities/deeplink/DeepLinkResult$Train;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class DeepLinkResult {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/deeplink/DeepLinkResult$Departures;", "Lcom/adif/elcanomovil/domain/entities/deeplink/DeepLinkResult;", "origin", "", FirebaseAnalytics.Param.DESTINATION, "circulationType", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "isCercanias", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/CirculationType;Z)V", "getCirculationType", "()Lcom/adif/elcanomovil/domain/entities/CirculationType;", "getDestination", "()Ljava/lang/String;", "()Z", "getOrigin", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Departures extends DeepLinkResult {
        private final CirculationType circulationType;
        private final String destination;
        private final boolean isCercanias;
        private final String origin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Departures(String origin, String str, CirculationType circulationType, boolean z3) {
            super(null);
            Intrinsics.checkNotNullParameter(origin, "origin");
            Intrinsics.checkNotNullParameter(circulationType, "circulationType");
            this.origin = origin;
            this.destination = str;
            this.circulationType = circulationType;
            this.isCercanias = z3;
        }

        public final CirculationType getCirculationType() {
            return this.circulationType;
        }

        public final String getDestination() {
            return this.destination;
        }

        public final String getOrigin() {
            return this.origin;
        }

        /* renamed from: isCercanias, reason: from getter */
        public final boolean getIsCercanias() {
            return this.isCercanias;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/deeplink/DeepLinkResult$Train;", "Lcom/adif/elcanomovil/domain/entities/deeplink/DeepLinkResult;", "trainCirculation", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;", "(Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;)V", "getTrainCirculation", "()Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Train extends DeepLinkResult {
        private final TrainCirculationInfo trainCirculation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Train(TrainCirculationInfo trainCirculation) {
            super(null);
            Intrinsics.checkNotNullParameter(trainCirculation, "trainCirculation");
            this.trainCirculation = trainCirculation;
        }

        public final TrainCirculationInfo getTrainCirculation() {
            return this.trainCirculation;
        }
    }

    public /* synthetic */ DeepLinkResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DeepLinkResult() {
    }
}
