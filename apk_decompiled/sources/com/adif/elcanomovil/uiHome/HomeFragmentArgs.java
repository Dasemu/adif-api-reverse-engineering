package com.adif.elcanomovil.uiHome;

import android.os.Bundle;
import androidx.lifecycle.n0;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0.InterfaceC0530g;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentArgs;", "Lo0/g;", "", NavArguments.ARG_FOCUS_FAVOURITES, "<init>", "(Z)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroidx/lifecycle/n0;", "toSavedStateHandle", "()Landroidx/lifecycle/n0;", "component1", "()Z", "copy", "(Z)Lcom/adif/elcanomovil/uiHome/HomeFragmentArgs;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getFocusFavourites", "Companion", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HomeFragmentArgs implements InterfaceC0530g {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean focusFavourites;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragmentArgs$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lcom/adif/elcanomovil/uiHome/HomeFragmentArgs;", "fromBundle", "(Landroid/os/Bundle;)Lcom/adif/elcanomovil/uiHome/HomeFragmentArgs;", "Landroidx/lifecycle/n0;", "savedStateHandle", "fromSavedStateHandle", "(Landroidx/lifecycle/n0;)Lcom/adif/elcanomovil/uiHome/HomeFragmentArgs;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final HomeFragmentArgs fromBundle(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(HomeFragmentArgs.class.getClassLoader());
            return new HomeFragmentArgs(bundle.containsKey(NavArguments.ARG_FOCUS_FAVOURITES) ? bundle.getBoolean(NavArguments.ARG_FOCUS_FAVOURITES) : false);
        }

        @JvmStatic
        public final HomeFragmentArgs fromSavedStateHandle(n0 savedStateHandle) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.b(NavArguments.ARG_FOCUS_FAVOURITES)) {
                bool = (Boolean) savedStateHandle.c(NavArguments.ARG_FOCUS_FAVOURITES);
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"focusFavourites\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            return new HomeFragmentArgs(bool.booleanValue());
        }

        private Companion() {
        }
    }

    public HomeFragmentArgs() {
        this(false, 1, null);
    }

    public static /* synthetic */ HomeFragmentArgs copy$default(HomeFragmentArgs homeFragmentArgs, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = homeFragmentArgs.focusFavourites;
        }
        return homeFragmentArgs.copy(z3);
    }

    @JvmStatic
    public static final HomeFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @JvmStatic
    public static final HomeFragmentArgs fromSavedStateHandle(n0 n0Var) {
        return INSTANCE.fromSavedStateHandle(n0Var);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getFocusFavourites() {
        return this.focusFavourites;
    }

    public final HomeFragmentArgs copy(boolean focusFavourites) {
        return new HomeFragmentArgs(focusFavourites);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HomeFragmentArgs) && this.focusFavourites == ((HomeFragmentArgs) other).focusFavourites;
    }

    public final boolean getFocusFavourites() {
        return this.focusFavourites;
    }

    public int hashCode() {
        return Boolean.hashCode(this.focusFavourites);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(NavArguments.ARG_FOCUS_FAVOURITES, this.focusFavourites);
        return bundle;
    }

    public final n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        n0Var.d(Boolean.valueOf(this.focusFavourites), NavArguments.ARG_FOCUS_FAVOURITES);
        return n0Var;
    }

    public String toString() {
        return "HomeFragmentArgs(focusFavourites=" + this.focusFavourites + ')';
    }

    public HomeFragmentArgs(boolean z3) {
        this.focusFavourites = z3;
    }

    public /* synthetic */ HomeFragmentArgs(boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z3);
    }
}
