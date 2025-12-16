package com.adif.elcanomovil.uiSelectTrain.main;

import android.os.Bundle;
import androidx.lifecycle.n0;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0.InterfaceC0530g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ&\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/adif/elcanomovil/uiSelectTrain/main/SelectTrainFragmentArgs;", "Lo0/g;", "", "resultName", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroidx/lifecycle/n0;", "toSavedStateHandle", "()Landroidx/lifecycle/n0;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/adif/elcanomovil/uiSelectTrain/main/SelectTrainFragmentArgs;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getResultName", "getCommercialNumber", "Companion", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectTrainFragmentArgs implements InterfaceC0530g {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String commercialNumber;
    private final String resultName;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/uiSelectTrain/main/SelectTrainFragmentArgs$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lcom/adif/elcanomovil/uiSelectTrain/main/SelectTrainFragmentArgs;", "fromBundle", "(Landroid/os/Bundle;)Lcom/adif/elcanomovil/uiSelectTrain/main/SelectTrainFragmentArgs;", "Landroidx/lifecycle/n0;", "savedStateHandle", "fromSavedStateHandle", "(Landroidx/lifecycle/n0;)Lcom/adif/elcanomovil/uiSelectTrain/main/SelectTrainFragmentArgs;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final SelectTrainFragmentArgs fromBundle(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(SelectTrainFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("result_name")) {
                throw new IllegalArgumentException("Required argument \"result_name\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("result_name");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"result_name\" is marked as non-null but was passed a null value.");
            }
            if (bundle.containsKey("commercial_number")) {
                return new SelectTrainFragmentArgs(string, bundle.getString("commercial_number"));
            }
            throw new IllegalArgumentException("Required argument \"commercial_number\" is missing and does not have an android:defaultValue");
        }

        @JvmStatic
        public final SelectTrainFragmentArgs fromSavedStateHandle(n0 savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            if (!savedStateHandle.b("result_name")) {
                throw new IllegalArgumentException("Required argument \"result_name\" is missing and does not have an android:defaultValue");
            }
            String str = (String) savedStateHandle.c("result_name");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"result_name\" is marked as non-null but was passed a null value");
            }
            if (savedStateHandle.b("commercial_number")) {
                return new SelectTrainFragmentArgs(str, (String) savedStateHandle.c("commercial_number"));
            }
            throw new IllegalArgumentException("Required argument \"commercial_number\" is missing and does not have an android:defaultValue");
        }

        private Companion() {
        }
    }

    public SelectTrainFragmentArgs(String resultName, String str) {
        Intrinsics.checkNotNullParameter(resultName, "resultName");
        this.resultName = resultName;
        this.commercialNumber = str;
    }

    public static /* synthetic */ SelectTrainFragmentArgs copy$default(SelectTrainFragmentArgs selectTrainFragmentArgs, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectTrainFragmentArgs.resultName;
        }
        if ((i & 2) != 0) {
            str2 = selectTrainFragmentArgs.commercialNumber;
        }
        return selectTrainFragmentArgs.copy(str, str2);
    }

    @JvmStatic
    public static final SelectTrainFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @JvmStatic
    public static final SelectTrainFragmentArgs fromSavedStateHandle(n0 n0Var) {
        return INSTANCE.fromSavedStateHandle(n0Var);
    }

    /* renamed from: component1, reason: from getter */
    public final String getResultName() {
        return this.resultName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCommercialNumber() {
        return this.commercialNumber;
    }

    public final SelectTrainFragmentArgs copy(String resultName, String commercialNumber) {
        Intrinsics.checkNotNullParameter(resultName, "resultName");
        return new SelectTrainFragmentArgs(resultName, commercialNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectTrainFragmentArgs)) {
            return false;
        }
        SelectTrainFragmentArgs selectTrainFragmentArgs = (SelectTrainFragmentArgs) other;
        return Intrinsics.areEqual(this.resultName, selectTrainFragmentArgs.resultName) && Intrinsics.areEqual(this.commercialNumber, selectTrainFragmentArgs.commercialNumber);
    }

    public final String getCommercialNumber() {
        return this.commercialNumber;
    }

    public final String getResultName() {
        return this.resultName;
    }

    public int hashCode() {
        int hashCode = this.resultName.hashCode() * 31;
        String str = this.commercialNumber;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("result_name", this.resultName);
        bundle.putString("commercial_number", this.commercialNumber);
        return bundle;
    }

    public final n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        n0Var.d(this.resultName, "result_name");
        n0Var.d(this.commercialNumber, "commercial_number");
        return n0Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SelectTrainFragmentArgs(resultName=");
        sb.append(this.resultName);
        sb.append(", commercialNumber=");
        return com.google.android.gms.measurement.internal.a.n(sb, this.commercialNumber, ')');
    }
}
