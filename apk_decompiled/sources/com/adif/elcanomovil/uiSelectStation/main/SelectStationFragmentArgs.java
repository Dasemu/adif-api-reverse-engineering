package com.adif.elcanomovil.uiSelectStation.main;

import android.os.Bundle;
import androidx.lifecycle.n0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0.InterfaceC0530g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationFragmentArgs;", "Lo0/g;", "", "key", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroidx/lifecycle/n0;", "toSavedStateHandle", "()Landroidx/lifecycle/n0;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationFragmentArgs;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Companion", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectStationFragmentArgs implements InterfaceC0530g {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String key;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationFragmentArgs$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationFragmentArgs;", "fromBundle", "(Landroid/os/Bundle;)Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationFragmentArgs;", "Landroidx/lifecycle/n0;", "savedStateHandle", "fromSavedStateHandle", "(Landroidx/lifecycle/n0;)Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationFragmentArgs;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final SelectStationFragmentArgs fromBundle(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(SelectStationFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("key")) {
                throw new IllegalArgumentException("Required argument \"key\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("key");
            if (string != null) {
                return new SelectStationFragmentArgs(string);
            }
            throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
        }

        @JvmStatic
        public final SelectStationFragmentArgs fromSavedStateHandle(n0 savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            if (!savedStateHandle.b("key")) {
                throw new IllegalArgumentException("Required argument \"key\" is missing and does not have an android:defaultValue");
            }
            String str = (String) savedStateHandle.c("key");
            if (str != null) {
                return new SelectStationFragmentArgs(str);
            }
            throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value");
        }

        private Companion() {
        }
    }

    public SelectStationFragmentArgs(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    public static /* synthetic */ SelectStationFragmentArgs copy$default(SelectStationFragmentArgs selectStationFragmentArgs, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectStationFragmentArgs.key;
        }
        return selectStationFragmentArgs.copy(str);
    }

    @JvmStatic
    public static final SelectStationFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @JvmStatic
    public static final SelectStationFragmentArgs fromSavedStateHandle(n0 n0Var) {
        return INSTANCE.fromSavedStateHandle(n0Var);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final SelectStationFragmentArgs copy(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new SelectStationFragmentArgs(key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SelectStationFragmentArgs) && Intrinsics.areEqual(this.key, ((SelectStationFragmentArgs) other).key);
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("key", this.key);
        return bundle;
    }

    public final n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        n0Var.d(this.key, "key");
        return n0Var;
    }

    public String toString() {
        return com.google.android.gms.measurement.internal.a.n(new StringBuilder("SelectStationFragmentArgs(key="), this.key, ')');
    }
}
