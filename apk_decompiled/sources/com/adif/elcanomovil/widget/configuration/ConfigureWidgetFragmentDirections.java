package com.adif.elcanomovil.widget.configuration;

import C.w;
import android.os.Bundle;
import android.os.Parcelable;
import com.adif.elcanomovil.commonNavGraph.R;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import com.google.android.gms.measurement.internal.a;
import java.io.Serializable;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/widget/configuration/ConfigureWidgetFragmentDirections;", "", "()V", "ActionDeparturesFragmentToSelectStationFragment", "ActionGlobalAlertDialog", "Companion", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfigureWidgetFragmentDirections {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/adif/elcanomovil/widget/configuration/ConfigureWidgetFragmentDirections$ActionDeparturesFragmentToSelectStationFragment;", "Lo0/F;", "", "key", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/adif/elcanomovil/widget/configuration/ConfigureWidgetFragmentDirections$ActionDeparturesFragmentToSelectStationFragment;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "actionId", "I", "getActionId", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "arguments", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ActionDeparturesFragmentToSelectStationFragment implements F {
        private final int actionId;
        private final String key;

        public ActionDeparturesFragmentToSelectStationFragment(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.actionId = R.id.action_departuresFragment_to_selectStationFragment;
        }

        public static /* synthetic */ ActionDeparturesFragmentToSelectStationFragment copy$default(ActionDeparturesFragmentToSelectStationFragment actionDeparturesFragmentToSelectStationFragment, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionDeparturesFragmentToSelectStationFragment.key;
            }
            return actionDeparturesFragmentToSelectStationFragment.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        public final ActionDeparturesFragmentToSelectStationFragment copy(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new ActionDeparturesFragmentToSelectStationFragment(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActionDeparturesFragmentToSelectStationFragment) && Intrinsics.areEqual(this.key, ((ActionDeparturesFragmentToSelectStationFragment) other).key);
        }

        @Override // o0.F
        public int getActionId() {
            return this.actionId;
        }

        @Override // o0.F
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("key", this.key);
            return bundle;
        }

        public final String getKey() {
            return this.key;
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return a.n(new StringBuilder("ActionDeparturesFragmentToSelectStationFragment(key="), this.key, ')');
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b\u0004\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b&\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0017R\u001a\u0010+\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001dR\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/adif/elcanomovil/widget/configuration/ConfigureWidgetFragmentDirections$ActionGlobalAlertDialog;", "Lo0/F;", "", "blockOnback", "isCancelable", "", "title", "message", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "actions", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;", "type", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;)V", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "component6", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;", "copy", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;)Lcom/adif/elcanomovil/widget/configuration/ConfigureWidgetFragmentDirections$ActionGlobalAlertDialog;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getBlockOnback", "Ljava/lang/String;", "getTitle", "getMessage", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "getActions", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;", "getType", "actionId", "I", "getActionId", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "arguments", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ActionGlobalAlertDialog implements F {
        private final int actionId;
        private final AlertActions actions;
        private final boolean blockOnback;
        private final boolean isCancelable;
        private final String message;
        private final String title;
        private final AlertType type;

        public ActionGlobalAlertDialog(boolean z3, boolean z4, String title, String message, AlertActions actions, AlertType type) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(type, "type");
            this.blockOnback = z3;
            this.isCancelable = z4;
            this.title = title;
            this.message = message;
            this.actions = actions;
            this.type = type;
            this.actionId = R.id.action_global_alertDialog;
        }

        public static /* synthetic */ ActionGlobalAlertDialog copy$default(ActionGlobalAlertDialog actionGlobalAlertDialog, boolean z3, boolean z4, String str, String str2, AlertActions alertActions, AlertType alertType, int i, Object obj) {
            if ((i & 1) != 0) {
                z3 = actionGlobalAlertDialog.blockOnback;
            }
            if ((i & 2) != 0) {
                z4 = actionGlobalAlertDialog.isCancelable;
            }
            if ((i & 4) != 0) {
                str = actionGlobalAlertDialog.title;
            }
            if ((i & 8) != 0) {
                str2 = actionGlobalAlertDialog.message;
            }
            if ((i & 16) != 0) {
                alertActions = actionGlobalAlertDialog.actions;
            }
            if ((i & 32) != 0) {
                alertType = actionGlobalAlertDialog.type;
            }
            AlertActions alertActions2 = alertActions;
            AlertType alertType2 = alertType;
            return actionGlobalAlertDialog.copy(z3, z4, str, str2, alertActions2, alertType2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getBlockOnback() {
            return this.blockOnback;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCancelable() {
            return this.isCancelable;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component5, reason: from getter */
        public final AlertActions getActions() {
            return this.actions;
        }

        /* renamed from: component6, reason: from getter */
        public final AlertType getType() {
            return this.type;
        }

        public final ActionGlobalAlertDialog copy(boolean blockOnback, boolean isCancelable, String title, String message, AlertActions actions, AlertType type) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(type, "type");
            return new ActionGlobalAlertDialog(blockOnback, isCancelable, title, message, actions, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionGlobalAlertDialog)) {
                return false;
            }
            ActionGlobalAlertDialog actionGlobalAlertDialog = (ActionGlobalAlertDialog) other;
            return this.blockOnback == actionGlobalAlertDialog.blockOnback && this.isCancelable == actionGlobalAlertDialog.isCancelable && Intrinsics.areEqual(this.title, actionGlobalAlertDialog.title) && Intrinsics.areEqual(this.message, actionGlobalAlertDialog.message) && Intrinsics.areEqual(this.actions, actionGlobalAlertDialog.actions) && this.type == actionGlobalAlertDialog.type;
        }

        @Override // o0.F
        public int getActionId() {
            return this.actionId;
        }

        public final AlertActions getActions() {
            return this.actions;
        }

        @Override // o0.F
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("blockOnback", this.blockOnback);
            bundle.putBoolean("isCancelable", this.isCancelable);
            bundle.putString("title", this.title);
            bundle.putString("message", this.message);
            if (Parcelable.class.isAssignableFrom(AlertActions.class)) {
                RandomAccess randomAccess = this.actions;
                Intrinsics.checkNotNull(randomAccess, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("actions", (Parcelable) randomAccess);
            } else {
                if (!Serializable.class.isAssignableFrom(AlertActions.class)) {
                    throw new UnsupportedOperationException(AlertActions.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                AlertActions alertActions = this.actions;
                Intrinsics.checkNotNull(alertActions, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("actions", alertActions);
            }
            if (Parcelable.class.isAssignableFrom(AlertType.class)) {
                Object obj = this.type;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("type", (Parcelable) obj);
                return bundle;
            }
            if (!Serializable.class.isAssignableFrom(AlertType.class)) {
                throw new UnsupportedOperationException(AlertType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            AlertType alertType = this.type;
            Intrinsics.checkNotNull(alertType, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("type", alertType);
            return bundle;
        }

        public final boolean getBlockOnback() {
            return this.blockOnback;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getTitle() {
            return this.title;
        }

        public final AlertType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + ((this.actions.hashCode() + a.d(this.message, a.d(this.title, w.c(Boolean.hashCode(this.blockOnback) * 31, 31, this.isCancelable), 31), 31)) * 31);
        }

        public final boolean isCancelable() {
            return this.isCancelable;
        }

        public String toString() {
            return "ActionGlobalAlertDialog(blockOnback=" + this.blockOnback + ", isCancelable=" + this.isCancelable + ", title=" + this.title + ", message=" + this.message + ", actions=" + this.actions + ", type=" + this.type + ')';
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/widget/configuration/ConfigureWidgetFragmentDirections$Companion;", "", "<init>", "()V", "", "blockOnback", "isCancelable", "", "title", "message", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "actions", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;", "type", "Lo0/F;", "actionGlobalAlertDialog", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;)Lo0/F;", "key", "actionDeparturesFragmentToSelectStationFragment", "(Ljava/lang/String;)Lo0/F;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final F actionDeparturesFragmentToSelectStationFragment(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new ActionDeparturesFragmentToSelectStationFragment(key);
        }

        public final F actionGlobalAlertDialog(boolean blockOnback, boolean isCancelable, String title, String message, AlertActions actions, AlertType type) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(type, "type");
            return new ActionGlobalAlertDialog(blockOnback, isCancelable, title, message, actions, type);
        }

        private Companion() {
        }
    }

    private ConfigureWidgetFragmentDirections() {
    }
}
