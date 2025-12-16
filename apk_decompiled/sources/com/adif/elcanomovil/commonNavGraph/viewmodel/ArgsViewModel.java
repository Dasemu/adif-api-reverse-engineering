package com.adif.elcanomovil.commonNavGraph.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.n0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o0.C0531h;
import o0.InterfaceC0530g;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0006H\u0087\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/viewmodel/ArgsViewModel;", "Landroidx/lifecycle/w0;", "Landroidx/lifecycle/n0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/n0;)V", "Lo0/g;", "Args", "Lo0/h;", "navArgs", "()Lo0/h;", "Landroidx/lifecycle/n0;", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "arguments", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class ArgsViewModel extends w0 {
    private final n0 savedStateHandle;

    public ArgsViewModel(n0 savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    public final Bundle getArguments() {
        return (Bundle) this.savedStateHandle.c(ArgsViewModelKt.BUNDLE_ARGS);
    }

    public final /* synthetic */ <Args extends InterfaceC0530g> C0531h navArgs() {
        Intrinsics.reifiedOperationMarker(4, "Args");
        return new C0531h(Reflection.getOrCreateKotlinClass(InterfaceC0530g.class), new Function0<Bundle>() { // from class: com.adif.elcanomovil.commonNavGraph.viewmodel.ArgsViewModel$navArgs$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Bundle invoke() {
                Bundle arguments = ArgsViewModel.this.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("ViewModel " + ArgsViewModel.this + " has null arguments");
            }
        });
    }
}
