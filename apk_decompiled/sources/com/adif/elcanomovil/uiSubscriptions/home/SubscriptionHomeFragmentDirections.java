package com.adif.elcanomovil.uiSubscriptions.home;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o0.F;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/home/SubscriptionHomeFragmentDirections;", "", "<init>", "()V", "Companion", "com/adif/elcanomovil/uiSubscriptions/home/g", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionHomeFragmentDirections {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jk\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/home/SubscriptionHomeFragmentDirections$Companion;", "", "<init>", "()V", "", "argTypeScreen", "argTypeSubscription", "", "argDataSubscription", "argTrainCodeSubscription", "argTrainDateSubscription", "argStationCodeSubscription", "argStationToCodeSubscription", "", "argIsCercaniasSubscription", "argOperatorTrain", "argCommercialProductTrain", "Lo0/F;", "toEditSubscriptionFragment", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lo0/F;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final F toEditSubscriptionFragment(int argTypeScreen, int argTypeSubscription, String argDataSubscription, String argTrainCodeSubscription, String argTrainDateSubscription, String argStationCodeSubscription, String argStationToCodeSubscription, boolean argIsCercaniasSubscription, String argOperatorTrain, String argCommercialProductTrain) {
            return new g(argTypeScreen, argTypeSubscription, argDataSubscription, argTrainCodeSubscription, argTrainDateSubscription, argStationCodeSubscription, argStationToCodeSubscription, argIsCercaniasSubscription, argOperatorTrain, argCommercialProductTrain);
        }

        private Companion() {
        }
    }

    private SubscriptionHomeFragmentDirections() {
    }
}
