package com.adif.elcanomovil.main;

import com.adif.elcanomovil.commonNavGraph.MainNavigationDirections;
import com.adif.elcanomovil.commonNavGraph.R;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab;
import com.adif.elcanomovil.commonNavGraph.arguments.Filters;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.arguments.StationObservationArg;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0.C0524a;
import o0.F;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u0000 \u00042\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/main/BottomNavFragmentDirections;", "", "<init>", "()V", "Companion", "com/adif/elcanomovil/main/g", "com/adif/elcanomovil/main/h", "com/adif/elcanomovil/main/i", "com/adif/elcanomovil/main/j", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomNavFragmentDirections {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJk\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001f\u0010 J=\u0010)\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0+¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010,\u001a\u00020/¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u00020\t¢\u0006\u0004\b3\u0010\fJ\u001d\u00105\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010,\u001a\u000204¢\u0006\u0004\b5\u00106J\u0099\u0001\u0010D\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u00010\t2\b\u00108\u001a\u0004\u0018\u00010\t2\b\u00109\u001a\u0004\u0018\u00010\t2\b\u0010:\u001a\u0004\u0018\u00010\t2\u0006\u0010;\u001a\u00020\u00152\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010+2\b\u0010=\u001a\u0004\u0018\u00010\t2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010+2\b\u0010?\u001a\u0004\u0018\u00010\t2\b\u0010@\u001a\u0004\u0018\u00010\t2\b\u0010A\u001a\u0004\u0018\u00010\t2\b\u0010B\u001a\u0004\u0018\u00010\t2\b\u0010C\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lcom/adif/elcanomovil/main/BottomNavFragmentDirections$Companion;", "", "<init>", "()V", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;", "initialTab", "Lo0/F;", "toBottomNav", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;)Lo0/F;", "", "key", "toSelectStationFragment", "(Ljava/lang/String;)Lo0/F;", "", "argTypeScreen", "argTypeSubscription", "argDataSubscription", "argTrainCodeSubscription", "argTrainDateSubscription", "argStationCodeSubscription", "argStationToCodeSubscription", "", "argIsCercaniasSubscription", "argOperatorTrain", "argCommercialProductTrain", "toNewSubscriptionHomeFragment", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lo0/F;", "toNewIssueFragment", "()Lo0/F;", "resultName", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "toSelectTrainFragment", "(Ljava/lang/String;Ljava/lang/String;)Lo0/F;", "blockOnback", "isCancelable", "title", "message", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "actions", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;", "type", "toAlertDialog", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;)Lo0/F;", "", "values", "toSelectableBottomSheet", "(Ljava/lang/String;[Ljava/lang/String;)Lo0/F;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/StationObservationArg;", "toStationObservationsBottomSheet", "(Ljava/lang/String;Lcom/adif/elcanomovil/commonNavGraph/arguments/StationObservationArg;)Lo0/F;", "observation", "toTrainObservationBottomSheet", "Lcom/adif/elcanomovil/commonNavGraph/arguments/Filters;", "toFilterListBottomSheet", "(Ljava/lang/String;Lcom/adif/elcanomovil/commonNavGraph/arguments/Filters;)Lo0/F;", "logo", AppMeasurementSdk.ConditionalUserProperty.NAME, "phone", "description", "accessible", "paymentWay", "offer", "correspondences", "web", FirebaseAnalytics.Param.LOCATION, "accessibleLabel", "openingHours", "playStore", "toStationsAlertDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo0/F;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ F toBottomNav$default(Companion companion, BottomNavInitialTab bottomNavInitialTab, int i, Object obj) {
            if ((i & 1) != 0) {
                bottomNavInitialTab = null;
            }
            return companion.toBottomNav(bottomNavInitialTab);
        }

        public final F toAlertDialog(boolean blockOnback, boolean isCancelable, String title, String message, AlertActions actions, AlertType type) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(type, "type");
            return MainNavigationDirections.INSTANCE.toAlertDialog(blockOnback, isCancelable, title, message, actions, type);
        }

        public final F toBottomNav(BottomNavInitialTab initialTab) {
            return new g(initialTab);
        }

        public final F toFilterListBottomSheet(String key, Filters values) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(values, "values");
            return MainNavigationDirections.INSTANCE.toFilterListBottomSheet(key, values);
        }

        public final F toNewIssueFragment() {
            return new C0524a(R.id.to_newIssueFragment);
        }

        public final F toNewSubscriptionHomeFragment(int argTypeScreen, int argTypeSubscription, String argDataSubscription, String argTrainCodeSubscription, String argTrainDateSubscription, String argStationCodeSubscription, String argStationToCodeSubscription, boolean argIsCercaniasSubscription, String argOperatorTrain, String argCommercialProductTrain) {
            return new h(argTypeScreen, argTypeSubscription, argDataSubscription, argTrainCodeSubscription, argTrainDateSubscription, argStationCodeSubscription, argStationToCodeSubscription, argIsCercaniasSubscription, argOperatorTrain, argCommercialProductTrain);
        }

        public final F toSelectStationFragment(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new i(key);
        }

        public final F toSelectTrainFragment(String resultName, String commercialNumber) {
            Intrinsics.checkNotNullParameter(resultName, "resultName");
            return new j(resultName, commercialNumber);
        }

        public final F toSelectableBottomSheet(String key, String[] values) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(values, "values");
            return MainNavigationDirections.INSTANCE.toSelectableBottomSheet(key, values);
        }

        public final F toStationObservationsBottomSheet(String key, StationObservationArg values) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(values, "values");
            return MainNavigationDirections.INSTANCE.toStationObservationsBottomSheet(key, values);
        }

        public final F toStationsAlertDialog(String logo, String name, String phone, String description, boolean accessible, String[] paymentWay, String offer, String[] correspondences, String web, String location, String accessibleLabel, String openingHours, String playStore) {
            return MainNavigationDirections.INSTANCE.toStationsAlertDialog(logo, name, phone, description, accessible, paymentWay, offer, correspondences, web, location, accessibleLabel, openingHours, playStore);
        }

        public final F toTrainObservationBottomSheet(String observation) {
            Intrinsics.checkNotNullParameter(observation, "observation");
            return MainNavigationDirections.INSTANCE.toTrainObservationBottomSheet(observation);
        }

        private Companion() {
        }
    }

    private BottomNavFragmentDirections() {
    }
}
