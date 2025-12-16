package com.adif.elcanomovil.uiAvisa.components.details;

import C.w;
import android.os.Bundle;
import androidx.lifecycle.n0;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0.InterfaceC0530g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsFragmentArgs;", "Lo0/g;", "", "argIdIncidence", "<init>", "(I)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroidx/lifecycle/n0;", "toSavedStateHandle", "()Landroidx/lifecycle/n0;", "component1", "()I", "copy", "(I)Lcom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsFragmentArgs;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getArgIdIncidence", "Companion", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IssueDetailsFragmentArgs implements InterfaceC0530g {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int argIdIncidence;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsFragmentArgs$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lcom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsFragmentArgs;", "fromBundle", "(Landroid/os/Bundle;)Lcom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsFragmentArgs;", "Landroidx/lifecycle/n0;", "savedStateHandle", "fromSavedStateHandle", "(Landroidx/lifecycle/n0;)Lcom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsFragmentArgs;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final IssueDetailsFragmentArgs fromBundle(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(IssueDetailsFragmentArgs.class.getClassLoader());
            if (bundle.containsKey(NavArguments.ARG_AVISA_INCIDENCE_ID)) {
                return new IssueDetailsFragmentArgs(bundle.getInt(NavArguments.ARG_AVISA_INCIDENCE_ID));
            }
            throw new IllegalArgumentException("Required argument \"arg_idIncidence\" is missing and does not have an android:defaultValue");
        }

        @JvmStatic
        public final IssueDetailsFragmentArgs fromSavedStateHandle(n0 savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            if (!savedStateHandle.b(NavArguments.ARG_AVISA_INCIDENCE_ID)) {
                throw new IllegalArgumentException("Required argument \"arg_idIncidence\" is missing and does not have an android:defaultValue");
            }
            Integer num = (Integer) savedStateHandle.c(NavArguments.ARG_AVISA_INCIDENCE_ID);
            if (num != null) {
                return new IssueDetailsFragmentArgs(num.intValue());
            }
            throw new IllegalArgumentException("Argument \"arg_idIncidence\" of type integer does not support null values");
        }

        private Companion() {
        }
    }

    public IssueDetailsFragmentArgs(int i) {
        this.argIdIncidence = i;
    }

    public static /* synthetic */ IssueDetailsFragmentArgs copy$default(IssueDetailsFragmentArgs issueDetailsFragmentArgs, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = issueDetailsFragmentArgs.argIdIncidence;
        }
        return issueDetailsFragmentArgs.copy(i);
    }

    @JvmStatic
    public static final IssueDetailsFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @JvmStatic
    public static final IssueDetailsFragmentArgs fromSavedStateHandle(n0 n0Var) {
        return INSTANCE.fromSavedStateHandle(n0Var);
    }

    /* renamed from: component1, reason: from getter */
    public final int getArgIdIncidence() {
        return this.argIdIncidence;
    }

    public final IssueDetailsFragmentArgs copy(int argIdIncidence) {
        return new IssueDetailsFragmentArgs(argIdIncidence);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IssueDetailsFragmentArgs) && this.argIdIncidence == ((IssueDetailsFragmentArgs) other).argIdIncidence;
    }

    public final int getArgIdIncidence() {
        return this.argIdIncidence;
    }

    public int hashCode() {
        return Integer.hashCode(this.argIdIncidence);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(NavArguments.ARG_AVISA_INCIDENCE_ID, this.argIdIncidence);
        return bundle;
    }

    public final n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        n0Var.d(Integer.valueOf(this.argIdIncidence), NavArguments.ARG_AVISA_INCIDENCE_ID);
        return n0Var;
    }

    public String toString() {
        return w.p(new StringBuilder("IssueDetailsFragmentArgs(argIdIncidence="), this.argIdIncidence, ')');
    }
}
