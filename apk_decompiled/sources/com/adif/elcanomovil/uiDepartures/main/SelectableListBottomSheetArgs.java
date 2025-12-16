package com.adif.elcanomovil.uiDepartures.main;

import android.os.Bundle;
import androidx.lifecycle.n0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0.InterfaceC0530g;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0011¨\u0006\""}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/SelectableListBottomSheetArgs;", "Lo0/g;", "", "key", "", "values", "<init>", "(Ljava/lang/String;[Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroidx/lifecycle/n0;", "toSavedStateHandle", "()Landroidx/lifecycle/n0;", "component1", "()Ljava/lang/String;", "component2", "()[Ljava/lang/String;", "copy", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/adif/elcanomovil/uiDepartures/main/SelectableListBottomSheetArgs;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "[Ljava/lang/String;", "getValues", "Companion", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectableListBottomSheetArgs implements InterfaceC0530g {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String key;
    private final String[] values;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/SelectableListBottomSheetArgs$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lcom/adif/elcanomovil/uiDepartures/main/SelectableListBottomSheetArgs;", "fromBundle", "(Landroid/os/Bundle;)Lcom/adif/elcanomovil/uiDepartures/main/SelectableListBottomSheetArgs;", "Landroidx/lifecycle/n0;", "savedStateHandle", "fromSavedStateHandle", "(Landroidx/lifecycle/n0;)Lcom/adif/elcanomovil/uiDepartures/main/SelectableListBottomSheetArgs;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final SelectableListBottomSheetArgs fromBundle(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(SelectableListBottomSheetArgs.class.getClassLoader());
            if (!bundle.containsKey("key")) {
                throw new IllegalArgumentException("Required argument \"key\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("key");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("values")) {
                throw new IllegalArgumentException("Required argument \"values\" is missing and does not have an android:defaultValue");
            }
            String[] stringArray = bundle.getStringArray("values");
            if (stringArray != null) {
                return new SelectableListBottomSheetArgs(string, stringArray);
            }
            throw new IllegalArgumentException("Argument \"values\" is marked as non-null but was passed a null value.");
        }

        @JvmStatic
        public final SelectableListBottomSheetArgs fromSavedStateHandle(n0 savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            if (!savedStateHandle.b("key")) {
                throw new IllegalArgumentException("Required argument \"key\" is missing and does not have an android:defaultValue");
            }
            String str = (String) savedStateHandle.c("key");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value");
            }
            if (!savedStateHandle.b("values")) {
                throw new IllegalArgumentException("Required argument \"values\" is missing and does not have an android:defaultValue");
            }
            String[] strArr = (String[]) savedStateHandle.c("values");
            if (strArr != null) {
                return new SelectableListBottomSheetArgs(str, strArr);
            }
            throw new IllegalArgumentException("Argument \"values\" is marked as non-null but was passed a null value");
        }

        private Companion() {
        }
    }

    public SelectableListBottomSheetArgs(String key, String[] values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        this.key = key;
        this.values = values;
    }

    public static /* synthetic */ SelectableListBottomSheetArgs copy$default(SelectableListBottomSheetArgs selectableListBottomSheetArgs, String str, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectableListBottomSheetArgs.key;
        }
        if ((i & 2) != 0) {
            strArr = selectableListBottomSheetArgs.values;
        }
        return selectableListBottomSheetArgs.copy(str, strArr);
    }

    @JvmStatic
    public static final SelectableListBottomSheetArgs fromBundle(Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @JvmStatic
    public static final SelectableListBottomSheetArgs fromSavedStateHandle(n0 n0Var) {
        return INSTANCE.fromSavedStateHandle(n0Var);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String[] getValues() {
        return this.values;
    }

    public final SelectableListBottomSheetArgs copy(String key, String[] values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        return new SelectableListBottomSheetArgs(key, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectableListBottomSheetArgs)) {
            return false;
        }
        SelectableListBottomSheetArgs selectableListBottomSheetArgs = (SelectableListBottomSheetArgs) other;
        return Intrinsics.areEqual(this.key, selectableListBottomSheetArgs.key) && Intrinsics.areEqual(this.values, selectableListBottomSheetArgs.values);
    }

    public final String getKey() {
        return this.key;
    }

    public final String[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + Arrays.hashCode(this.values);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("key", this.key);
        bundle.putStringArray("values", this.values);
        return bundle;
    }

    public final n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        n0Var.d(this.key, "key");
        n0Var.d(this.values, "values");
        return n0Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SelectableListBottomSheetArgs(key=");
        sb.append(this.key);
        sb.append(", values=");
        return com.google.android.gms.measurement.internal.a.n(sb, Arrays.toString(this.values), ')');
    }
}
