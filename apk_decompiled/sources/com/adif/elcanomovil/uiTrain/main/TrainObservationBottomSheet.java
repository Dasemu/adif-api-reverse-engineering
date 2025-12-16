package com.adif.elcanomovil.uiTrain.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.K;
import com.adif.elcanomovil.uiTrain.R;
import com.adif.elcanomovil.uiTrain.databinding.BottomSheetTrainObservationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import o0.C0531h;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/main/TrainObservationBottomSheet;", "Lo2/f;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/adif/elcanomovil/uiTrain/main/TrainObservationBottomSheetArgs;", "args$delegate", "Lo0/h;", "getArgs", "()Lcom/adif/elcanomovil/uiTrain/main/TrainObservationBottomSheetArgs;", "args", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrainObservationBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainObservationBottomSheet.kt\ncom/adif/elcanomovil/uiTrain/main/TrainObservationBottomSheet\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,36:1\n42#2,3:37\n*S KotlinDebug\n*F\n+ 1 TrainObservationBottomSheet.kt\ncom/adif/elcanomovil/uiTrain/main/TrainObservationBottomSheet\n*L\n14#1:37,3\n*E\n"})
/* loaded from: classes3.dex */
public final class TrainObservationBottomSheet extends o2.f {

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final C0531h args = new C0531h(Reflection.getOrCreateKotlinClass(TrainObservationBottomSheetArgs.class), new Function0<Bundle>() { // from class: com.adif.elcanomovil.uiTrain.main.TrainObservationBottomSheet$special$$inlined$navArgs$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            Bundle arguments = K.this.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + K.this + " has null arguments");
        }
    });

    private final TrainObservationBottomSheetArgs getArgs() {
        return (TrainObservationBottomSheetArgs) this.args.getValue();
    }

    @Override // androidx.fragment.app.K
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.bottom_sheet_train_observation, container, false);
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BottomSheetTrainObservationBinding bind = BottomSheetTrainObservationBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        bind.getRoot().setBackgroundColor(-16777216);
        bind.observationBottomsheetText.setText(getArgs().getObservation());
    }
}
