package com.adif.elcanomovil.uiDialog;

import com.adif.elcanomovil.commonNavGraph.MainNavigationDirections;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import com.adif.elcanomovil.commonNavGraph.arguments.Filters;
import com.adif.elcanomovil.commonNavGraph.arguments.StationObservationArg;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/adif/elcanomovil/uiDialog/AdifDialogFragmentDirections;", "", "()V", "Companion", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdifDialogFragmentDirections {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0099\u0001\u0010,\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010!\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020\u00042\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00122\b\u0010%\u001a\u0004\u0018\u00010\u00072\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00122\b\u0010'\u001a\u0004\u0018\u00010\u00072\b\u0010(\u001a\u0004\u0018\u00010\u00072\b\u0010)\u001a\u0004\u0018\u00010\u00072\b\u0010*\u001a\u0004\u0018\u00010\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\u001b¨\u0006/"}, d2 = {"Lcom/adif/elcanomovil/uiDialog/AdifDialogFragmentDirections$Companion;", "", "<init>", "()V", "", "blockOnback", "isCancelable", "", "title", "message", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "actions", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;", "type", "Lo0/F;", "toAlertDialog", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;)Lo0/F;", "key", "", "values", "toSelectableBottomSheet", "(Ljava/lang/String;[Ljava/lang/String;)Lo0/F;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/StationObservationArg;", "toStationObservationsBottomSheet", "(Ljava/lang/String;Lcom/adif/elcanomovil/commonNavGraph/arguments/StationObservationArg;)Lo0/F;", "observation", "toTrainObservationBottomSheet", "(Ljava/lang/String;)Lo0/F;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/Filters;", "toFilterListBottomSheet", "(Ljava/lang/String;Lcom/adif/elcanomovil/commonNavGraph/arguments/Filters;)Lo0/F;", "logo", AppMeasurementSdk.ConditionalUserProperty.NAME, "phone", "description", "accessible", "paymentWay", "offer", "correspondences", "web", FirebaseAnalytics.Param.LOCATION, "accessibleLabel", "openingHours", "playStore", "toStationsAlertDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo0/F;", "toSelectStationFragment", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final F toAlertDialog(boolean blockOnback, boolean isCancelable, String title, String message, AlertActions actions, AlertType type) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(type, "type");
            return MainNavigationDirections.INSTANCE.toAlertDialog(blockOnback, isCancelable, title, message, actions, type);
        }

        public final F toFilterListBottomSheet(String key, Filters values) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(values, "values");
            return MainNavigationDirections.INSTANCE.toFilterListBottomSheet(key, values);
        }

        public final F toSelectStationFragment(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return MainNavigationDirections.INSTANCE.toSelectStationFragment(key);
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

    private AdifDialogFragmentDirections() {
    }
}
