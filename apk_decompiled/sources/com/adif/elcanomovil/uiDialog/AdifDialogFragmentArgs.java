package com.adif.elcanomovil.uiDialog;

import C.w;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.n0;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import java.io.Serializable;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0.InterfaceC0530g;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u0000 12\u00020\u0001:\u00011B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJL\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b\u0004\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001d¨\u00062"}, d2 = {"Lcom/adif/elcanomovil/uiDialog/AdifDialogFragmentArgs;", "Lo0/g;", "", "blockOnback", "isCancelable", "", "title", "message", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "actions", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;", "type", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroidx/lifecycle/n0;", "toSavedStateHandle", "()Landroidx/lifecycle/n0;", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "component6", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;", "copy", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;)Lcom/adif/elcanomovil/uiDialog/AdifDialogFragmentArgs;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getBlockOnback", "Ljava/lang/String;", "getTitle", "getMessage", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "getActions", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;", "getType", "Companion", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AdifDialogFragmentArgs implements InterfaceC0530g {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AlertActions actions;
    private final boolean blockOnback;
    private final boolean isCancelable;
    private final String message;
    private final String title;
    private final AlertType type;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/uiDialog/AdifDialogFragmentArgs$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lcom/adif/elcanomovil/uiDialog/AdifDialogFragmentArgs;", "fromBundle", "(Landroid/os/Bundle;)Lcom/adif/elcanomovil/uiDialog/AdifDialogFragmentArgs;", "Landroidx/lifecycle/n0;", "savedStateHandle", "fromSavedStateHandle", "(Landroidx/lifecycle/n0;)Lcom/adif/elcanomovil/uiDialog/AdifDialogFragmentArgs;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final AdifDialogFragmentArgs fromBundle(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(AdifDialogFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("blockOnback")) {
                throw new IllegalArgumentException("Required argument \"blockOnback\" is missing and does not have an android:defaultValue");
            }
            boolean z3 = bundle.getBoolean("blockOnback");
            if (!bundle.containsKey("isCancelable")) {
                throw new IllegalArgumentException("Required argument \"isCancelable\" is missing and does not have an android:defaultValue");
            }
            boolean z4 = bundle.getBoolean("isCancelable");
            if (!bundle.containsKey("title")) {
                throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("title");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("message")) {
                throw new IllegalArgumentException("Required argument \"message\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString("message");
            if (string2 == null) {
                throw new IllegalArgumentException("Argument \"message\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("actions")) {
                throw new IllegalArgumentException("Required argument \"actions\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(AlertActions.class) && !Serializable.class.isAssignableFrom(AlertActions.class)) {
                throw new UnsupportedOperationException(AlertActions.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            AlertActions alertActions = (AlertActions) bundle.get("actions");
            if (alertActions == null) {
                throw new IllegalArgumentException("Argument \"actions\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("type")) {
                throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(AlertType.class) && !Serializable.class.isAssignableFrom(AlertType.class)) {
                throw new UnsupportedOperationException(AlertType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            AlertType alertType = (AlertType) bundle.get("type");
            if (alertType != null) {
                return new AdifDialogFragmentArgs(z3, z4, string, string2, alertActions, alertType);
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }

        @JvmStatic
        public final AdifDialogFragmentArgs fromSavedStateHandle(n0 savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            if (!savedStateHandle.b("blockOnback")) {
                throw new IllegalArgumentException("Required argument \"blockOnback\" is missing and does not have an android:defaultValue");
            }
            Boolean bool = (Boolean) savedStateHandle.c("blockOnback");
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"blockOnback\" of type boolean does not support null values");
            }
            if (!savedStateHandle.b("isCancelable")) {
                throw new IllegalArgumentException("Required argument \"isCancelable\" is missing and does not have an android:defaultValue");
            }
            Boolean bool2 = (Boolean) savedStateHandle.c("isCancelable");
            if (bool2 == null) {
                throw new IllegalArgumentException("Argument \"isCancelable\" of type boolean does not support null values");
            }
            if (!savedStateHandle.b("title")) {
                throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
            }
            String str = (String) savedStateHandle.c("title");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value");
            }
            if (!savedStateHandle.b("message")) {
                throw new IllegalArgumentException("Required argument \"message\" is missing and does not have an android:defaultValue");
            }
            String str2 = (String) savedStateHandle.c("message");
            if (str2 == null) {
                throw new IllegalArgumentException("Argument \"message\" is marked as non-null but was passed a null value");
            }
            if (!savedStateHandle.b("actions")) {
                throw new IllegalArgumentException("Required argument \"actions\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(AlertActions.class) && !Serializable.class.isAssignableFrom(AlertActions.class)) {
                throw new UnsupportedOperationException(AlertActions.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            AlertActions alertActions = (AlertActions) savedStateHandle.c("actions");
            if (alertActions == null) {
                throw new IllegalArgumentException("Argument \"actions\" is marked as non-null but was passed a null value");
            }
            if (!savedStateHandle.b("type")) {
                throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(AlertType.class) && !Serializable.class.isAssignableFrom(AlertType.class)) {
                throw new UnsupportedOperationException(AlertType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            AlertType alertType = (AlertType) savedStateHandle.c("type");
            if (alertType != null) {
                return new AdifDialogFragmentArgs(bool.booleanValue(), bool2.booleanValue(), str, str2, alertActions, alertType);
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value");
        }

        private Companion() {
        }
    }

    public AdifDialogFragmentArgs(boolean z3, boolean z4, String title, String message, AlertActions actions, AlertType type) {
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
    }

    public static /* synthetic */ AdifDialogFragmentArgs copy$default(AdifDialogFragmentArgs adifDialogFragmentArgs, boolean z3, boolean z4, String str, String str2, AlertActions alertActions, AlertType alertType, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = adifDialogFragmentArgs.blockOnback;
        }
        if ((i & 2) != 0) {
            z4 = adifDialogFragmentArgs.isCancelable;
        }
        if ((i & 4) != 0) {
            str = adifDialogFragmentArgs.title;
        }
        if ((i & 8) != 0) {
            str2 = adifDialogFragmentArgs.message;
        }
        if ((i & 16) != 0) {
            alertActions = adifDialogFragmentArgs.actions;
        }
        if ((i & 32) != 0) {
            alertType = adifDialogFragmentArgs.type;
        }
        AlertActions alertActions2 = alertActions;
        AlertType alertType2 = alertType;
        return adifDialogFragmentArgs.copy(z3, z4, str, str2, alertActions2, alertType2);
    }

    @JvmStatic
    public static final AdifDialogFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @JvmStatic
    public static final AdifDialogFragmentArgs fromSavedStateHandle(n0 n0Var) {
        return INSTANCE.fromSavedStateHandle(n0Var);
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

    public final AdifDialogFragmentArgs copy(boolean blockOnback, boolean isCancelable, String title, String message, AlertActions actions, AlertType type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(type, "type");
        return new AdifDialogFragmentArgs(blockOnback, isCancelable, title, message, actions, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdifDialogFragmentArgs)) {
            return false;
        }
        AdifDialogFragmentArgs adifDialogFragmentArgs = (AdifDialogFragmentArgs) other;
        return this.blockOnback == adifDialogFragmentArgs.blockOnback && this.isCancelable == adifDialogFragmentArgs.isCancelable && Intrinsics.areEqual(this.title, adifDialogFragmentArgs.title) && Intrinsics.areEqual(this.message, adifDialogFragmentArgs.message) && Intrinsics.areEqual(this.actions, adifDialogFragmentArgs.actions) && this.type == adifDialogFragmentArgs.type;
    }

    public final AlertActions getActions() {
        return this.actions;
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
        return this.type.hashCode() + ((this.actions.hashCode() + com.google.android.gms.measurement.internal.a.d(this.message, com.google.android.gms.measurement.internal.a.d(this.title, w.c(Boolean.hashCode(this.blockOnback) * 31, 31, this.isCancelable), 31), 31)) * 31);
    }

    public final boolean isCancelable() {
        return this.isCancelable;
    }

    public final Bundle toBundle() {
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

    public final n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        n0Var.d(Boolean.valueOf(this.blockOnback), "blockOnback");
        n0Var.d(Boolean.valueOf(this.isCancelable), "isCancelable");
        n0Var.d(this.title, "title");
        n0Var.d(this.message, "message");
        if (Parcelable.class.isAssignableFrom(AlertActions.class)) {
            Object obj = this.actions;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.os.Parcelable");
            n0Var.d((Parcelable) obj, "actions");
        } else {
            if (!Serializable.class.isAssignableFrom(AlertActions.class)) {
                throw new UnsupportedOperationException(AlertActions.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            AlertActions alertActions = this.actions;
            Intrinsics.checkNotNull(alertActions, "null cannot be cast to non-null type java.io.Serializable");
            n0Var.d(alertActions, "actions");
        }
        if (Parcelable.class.isAssignableFrom(AlertType.class)) {
            Object obj2 = this.type;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.os.Parcelable");
            n0Var.d((Parcelable) obj2, "type");
            return n0Var;
        }
        if (!Serializable.class.isAssignableFrom(AlertType.class)) {
            throw new UnsupportedOperationException(AlertType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        AlertType alertType = this.type;
        Intrinsics.checkNotNull(alertType, "null cannot be cast to non-null type java.io.Serializable");
        n0Var.d(alertType, "type");
        return n0Var;
    }

    public String toString() {
        return "AdifDialogFragmentArgs(blockOnback=" + this.blockOnback + ", isCancelable=" + this.isCancelable + ", title=" + this.title + ", message=" + this.message + ", actions=" + this.actions + ", type=" + this.type + ')';
    }
}
