package com.adif.elcanomovil.main;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.n0;
import com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0.InterfaceC0530g;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/adif/elcanomovil/main/BottomNavFragmentArgs;", "Lo0/g;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;", "initialTab", "<init>", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroidx/lifecycle/n0;", "toSavedStateHandle", "()Landroidx/lifecycle/n0;", "component1", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;", "copy", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;)Lcom/adif/elcanomovil/main/BottomNavFragmentArgs;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;", "getInitialTab", "Companion", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BottomNavFragmentArgs implements InterfaceC0530g {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BottomNavInitialTab initialTab;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/main/BottomNavFragmentArgs$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lcom/adif/elcanomovil/main/BottomNavFragmentArgs;", "fromBundle", "(Landroid/os/Bundle;)Lcom/adif/elcanomovil/main/BottomNavFragmentArgs;", "Landroidx/lifecycle/n0;", "savedStateHandle", "fromSavedStateHandle", "(Landroidx/lifecycle/n0;)Lcom/adif/elcanomovil/main/BottomNavFragmentArgs;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final BottomNavFragmentArgs fromBundle(Bundle bundle) {
            BottomNavInitialTab bottomNavInitialTab;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(BottomNavFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("initialTab")) {
                bottomNavInitialTab = null;
            } else {
                if (!Parcelable.class.isAssignableFrom(BottomNavInitialTab.class) && !Serializable.class.isAssignableFrom(BottomNavInitialTab.class)) {
                    throw new UnsupportedOperationException(BottomNavInitialTab.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bottomNavInitialTab = (BottomNavInitialTab) bundle.get("initialTab");
            }
            return new BottomNavFragmentArgs(bottomNavInitialTab);
        }

        @JvmStatic
        public final BottomNavFragmentArgs fromSavedStateHandle(n0 savedStateHandle) {
            BottomNavInitialTab bottomNavInitialTab;
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            if (!savedStateHandle.b("initialTab")) {
                bottomNavInitialTab = null;
            } else {
                if (!Parcelable.class.isAssignableFrom(BottomNavInitialTab.class) && !Serializable.class.isAssignableFrom(BottomNavInitialTab.class)) {
                    throw new UnsupportedOperationException(BottomNavInitialTab.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bottomNavInitialTab = (BottomNavInitialTab) savedStateHandle.c("initialTab");
            }
            return new BottomNavFragmentArgs(bottomNavInitialTab);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomNavFragmentArgs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BottomNavFragmentArgs copy$default(BottomNavFragmentArgs bottomNavFragmentArgs, BottomNavInitialTab bottomNavInitialTab, int i, Object obj) {
        if ((i & 1) != 0) {
            bottomNavInitialTab = bottomNavFragmentArgs.initialTab;
        }
        return bottomNavFragmentArgs.copy(bottomNavInitialTab);
    }

    @JvmStatic
    public static final BottomNavFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @JvmStatic
    public static final BottomNavFragmentArgs fromSavedStateHandle(n0 n0Var) {
        return INSTANCE.fromSavedStateHandle(n0Var);
    }

    /* renamed from: component1, reason: from getter */
    public final BottomNavInitialTab getInitialTab() {
        return this.initialTab;
    }

    public final BottomNavFragmentArgs copy(BottomNavInitialTab initialTab) {
        return new BottomNavFragmentArgs(initialTab);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BottomNavFragmentArgs) && Intrinsics.areEqual(this.initialTab, ((BottomNavFragmentArgs) other).initialTab);
    }

    public final BottomNavInitialTab getInitialTab() {
        return this.initialTab;
    }

    public int hashCode() {
        BottomNavInitialTab bottomNavInitialTab = this.initialTab;
        if (bottomNavInitialTab == null) {
            return 0;
        }
        return bottomNavInitialTab.hashCode();
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(BottomNavInitialTab.class)) {
            bundle.putParcelable("initialTab", this.initialTab);
            return bundle;
        }
        if (Serializable.class.isAssignableFrom(BottomNavInitialTab.class)) {
            bundle.putSerializable("initialTab", (Serializable) this.initialTab);
        }
        return bundle;
    }

    public final n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        if (Parcelable.class.isAssignableFrom(BottomNavInitialTab.class)) {
            n0Var.d(this.initialTab, "initialTab");
            return n0Var;
        }
        if (Serializable.class.isAssignableFrom(BottomNavInitialTab.class)) {
            n0Var.d((Serializable) this.initialTab, "initialTab");
        }
        return n0Var;
    }

    public String toString() {
        return "BottomNavFragmentArgs(initialTab=" + this.initialTab + ')';
    }

    public BottomNavFragmentArgs(BottomNavInitialTab bottomNavInitialTab) {
        this.initialTab = bottomNavInitialTab;
    }

    public /* synthetic */ BottomNavFragmentArgs(BottomNavInitialTab bottomNavInitialTab, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bottomNavInitialTab);
    }
}
