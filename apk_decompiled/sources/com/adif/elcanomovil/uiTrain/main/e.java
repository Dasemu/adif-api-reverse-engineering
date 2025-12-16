package com.adif.elcanomovil.uiTrain.main;

import a.AbstractC0105a;
import android.content.Context;
import android.widget.TextView;
import com.adif.elcanomovil.commonViews.extensions.ViewKt;
import com.adif.elcanomovil.extensions.FragmentExtensionsKt;
import com.adif.elcanomovil.uiTrain.databinding.TrainSituationFragmentBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrainSituationFragment f5407b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TrainSituationFragment trainSituationFragment, int i) {
        super(1);
        this.f5406a = i;
        this.f5407b = trainSituationFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrainSituationFragmentBinding trainSituationFragmentBinding;
        TrainSituationFragmentBinding trainSituationFragmentBinding2;
        TrainSituationFragmentBinding trainSituationFragmentBinding3;
        TrainSituationFragmentBinding trainSituationFragmentBinding4;
        TrainSituationFragmentBinding trainSituationFragmentBinding5;
        TrainSituationFragmentBinding trainSituationFragmentBinding6;
        TrainSituationFragmentBinding trainSituationFragmentBinding7;
        TrainSituationFragmentBinding trainSituationFragmentBinding8;
        Context context;
        TrainSituationViewModel viewModel;
        switch (this.f5406a) {
            case 0:
                String str = (String) obj;
                if (str != null) {
                    ViewKt.showSnackbar(this.f5407b, str, 0);
                }
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj;
                trainSituationFragmentBinding = this.f5407b.binding;
                if (trainSituationFragmentBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    trainSituationFragmentBinding = null;
                }
                trainSituationFragmentBinding.stationFrom.setText(str2);
                return Unit.INSTANCE;
            case 2:
                String str3 = (String) obj;
                trainSituationFragmentBinding2 = this.f5407b.binding;
                if (trainSituationFragmentBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    trainSituationFragmentBinding2 = null;
                }
                trainSituationFragmentBinding2.stationTo.setText(str3);
                return Unit.INSTANCE;
            case 3:
                String str4 = (String) obj;
                TrainSituationFragment trainSituationFragment = this.f5407b;
                trainSituationFragmentBinding3 = trainSituationFragment.binding;
                TrainSituationFragmentBinding trainSituationFragmentBinding9 = null;
                if (trainSituationFragmentBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    trainSituationFragmentBinding3 = null;
                }
                TextView textView = trainSituationFragmentBinding3.trainNumber;
                textView.setText(str4);
                int i = 0;
                textView.setVisibility(0);
                trainSituationFragmentBinding4 = trainSituationFragment.binding;
                if (trainSituationFragmentBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    trainSituationFragmentBinding9 = trainSituationFragmentBinding4;
                }
                TextView textView2 = trainSituationFragmentBinding9.tvHintText;
                if (str4 != null && !StringsKt.isBlank(str4)) {
                    i = 8;
                }
                textView2.setVisibility(i);
                return Unit.INSTANCE;
            case 4:
                String str5 = (String) obj;
                TrainSituationFragment trainSituationFragment2 = this.f5407b;
                trainSituationFragmentBinding5 = trainSituationFragment2.binding;
                TrainSituationFragmentBinding trainSituationFragmentBinding10 = null;
                if (trainSituationFragmentBinding5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    trainSituationFragmentBinding5 = null;
                }
                TextView textView3 = trainSituationFragmentBinding5.trainType;
                textView3.setText(AbstractC0105a.k(textView3.getContext(), str5));
                int i4 = 0;
                textView3.setVisibility(0);
                trainSituationFragmentBinding6 = trainSituationFragment2.binding;
                if (trainSituationFragmentBinding6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    trainSituationFragmentBinding10 = trainSituationFragmentBinding6;
                }
                TextView textView4 = trainSituationFragmentBinding10.tvHintText;
                if (str5 != null && !StringsKt.isBlank(str5)) {
                    i4 = 8;
                }
                textView4.setVisibility(i4);
                return Unit.INSTANCE;
            case 5:
                String str6 = (String) obj;
                TrainSituationFragment trainSituationFragment3 = this.f5407b;
                trainSituationFragmentBinding7 = trainSituationFragment3.binding;
                TrainSituationFragmentBinding trainSituationFragmentBinding11 = null;
                if (trainSituationFragmentBinding7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    trainSituationFragmentBinding7 = null;
                }
                TextView textView5 = trainSituationFragmentBinding7.trainOperator;
                textView5.setText(AbstractC0105a.K(textView5.getContext(), str6));
                int i5 = 0;
                textView5.setVisibility(0);
                trainSituationFragmentBinding8 = trainSituationFragment3.binding;
                if (trainSituationFragmentBinding8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    trainSituationFragmentBinding11 = trainSituationFragmentBinding8;
                }
                TextView textView6 = trainSituationFragmentBinding11.tvHintText;
                if (str6 != null && !StringsKt.isBlank(str6)) {
                    i5 = 8;
                }
                textView6.setVisibility(i5);
                return Unit.INSTANCE;
            case 6:
                String str7 = (String) obj;
                if (str7 != null && (context = this.f5407b.getContext()) != null) {
                    Intrinsics.checkNotNull(context);
                    FragmentExtensionsKt.shareLink(context, str7);
                }
                return Unit.INSTANCE;
            default:
                b.r addCallback = (b.r) obj;
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                viewModel = this.f5407b.getViewModel();
                viewModel.handleBackButtonTapped();
                return Unit.INSTANCE;
        }
    }
}
