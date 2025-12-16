package com.adif.elcanomovil.uiAvisa.components.home;

import C.w;
import android.os.Bundle;
import com.adif.elcanomovil.commonNavGraph.R;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import o0.F;

/* loaded from: classes.dex */
public final class c implements F {

    /* renamed from: a, reason: collision with root package name */
    public final int f4900a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4901b = R.id.to_issueDetailsFragment;

    public c(int i) {
        this.f4900a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f4900a == ((c) obj).f4900a;
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f4901b;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt(NavArguments.ARG_AVISA_INCIDENCE_ID, this.f4900a);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4900a);
    }

    public final String toString() {
        return w.p(new StringBuilder("ToIssueDetailsFragment(argIdIncidence="), this.f4900a, ')');
    }
}
