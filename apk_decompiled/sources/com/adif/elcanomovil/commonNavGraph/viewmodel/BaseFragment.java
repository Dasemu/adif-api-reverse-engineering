package com.adif.elcanomovil.commonNavGraph.viewmodel;

import android.os.Bundle;
import androidx.fragment.app.K;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/viewmodel/BaseFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "Landroid/os/Bundle;", "args", "", "setArguments", "(Landroid/os/Bundle;)V", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class BaseFragment extends K {
    @Override // androidx.fragment.app.K
    public void setArguments(Bundle args) {
        if (args == null) {
            super.setArguments(null);
        } else {
            if (args.getBundle(ArgsViewModelKt.BUNDLE_ARGS) != null) {
                super.setArguments(args);
                return;
            }
            Bundle bundle = new Bundle(args);
            bundle.putBundle(ArgsViewModelKt.BUNDLE_ARGS, args);
            super.setArguments(bundle);
        }
    }
}
