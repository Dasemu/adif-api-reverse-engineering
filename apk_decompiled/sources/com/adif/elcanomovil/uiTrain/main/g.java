package com.adif.elcanomovil.uiTrain.main;

import android.content.Context;
import android.widget.ImageView;
import com.adif.elcanomovil.uiTrain.R;
import com.adif.elcanomovil.uiTrain.databinding.TrainSituationFragmentBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrainSituationFragment f5409a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TrainSituationFragment trainSituationFragment) {
        super(1);
        this.f5409a = trainSituationFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrainSituationFragmentBinding trainSituationFragmentBinding;
        TrainSituationFragmentBinding trainSituationFragmentBinding2;
        TrainSituationFragmentBinding trainSituationFragmentBinding3;
        TrainSituationFragmentBinding trainSituationFragmentBinding4;
        Boolean bool = (Boolean) obj;
        Intrinsics.checkNotNull(bool);
        boolean booleanValue = bool.booleanValue();
        TrainSituationFragment trainSituationFragment = this.f5409a;
        if (booleanValue) {
            trainSituationFragmentBinding3 = trainSituationFragment.binding;
            if (trainSituationFragmentBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                trainSituationFragmentBinding3 = null;
            }
            trainSituationFragmentBinding3.favourite.setImageResource(R.drawable.ic_favourite_on);
            trainSituationFragmentBinding4 = trainSituationFragment.binding;
            if (trainSituationFragmentBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                trainSituationFragmentBinding4 = null;
            }
            ImageView imageView = trainSituationFragmentBinding4.favourite;
            Context context = trainSituationFragment.getContext();
            imageView.setContentDescription(context != null ? context.getString(R.string.content_description_icon_favorite_remove) : null);
        } else {
            trainSituationFragmentBinding = trainSituationFragment.binding;
            if (trainSituationFragmentBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                trainSituationFragmentBinding = null;
            }
            trainSituationFragmentBinding.favourite.setImageResource(R.drawable.ic_favourite_off);
            trainSituationFragmentBinding2 = trainSituationFragment.binding;
            if (trainSituationFragmentBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                trainSituationFragmentBinding2 = null;
            }
            ImageView imageView2 = trainSituationFragmentBinding2.favourite;
            Context context2 = trainSituationFragment.getContext();
            imageView2.setContentDescription(context2 != null ? context2.getString(R.string.content_description_icon_favorite) : null);
        }
        return Unit.INSTANCE;
    }
}
