package com.adif.elcanomovil.uiStations.main;

import android.content.Context;
import android.widget.ImageView;
import com.adif.elcanomovil.uiStations.R;
import com.adif.elcanomovil.uiStations.databinding.FragmentStationsPageServicesBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StationsPageServicesFragment f5284a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(StationsPageServicesFragment stationsPageServicesFragment) {
        super(1);
        this.f5284a = stationsPageServicesFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding;
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding2;
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding3;
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding4;
        boolean areEqual = Intrinsics.areEqual((Boolean) obj, Boolean.TRUE);
        StationsPageServicesFragment stationsPageServicesFragment = this.f5284a;
        if (areEqual) {
            fragmentStationsPageServicesBinding3 = stationsPageServicesFragment.binding;
            if (fragmentStationsPageServicesBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageServicesBinding3 = null;
            }
            fragmentStationsPageServicesBinding3.addFavourite.setImageResource(R.drawable.ic_favourite_on);
            fragmentStationsPageServicesBinding4 = stationsPageServicesFragment.binding;
            if (fragmentStationsPageServicesBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageServicesBinding4 = null;
            }
            ImageView imageView = fragmentStationsPageServicesBinding4.addFavourite;
            Context context = stationsPageServicesFragment.getContext();
            imageView.setContentDescription(context != null ? context.getString(R.string.content_description_icon_favorite_remove) : null);
        } else {
            fragmentStationsPageServicesBinding = stationsPageServicesFragment.binding;
            if (fragmentStationsPageServicesBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageServicesBinding = null;
            }
            fragmentStationsPageServicesBinding.addFavourite.setImageResource(R.drawable.ic_favourite_off);
            fragmentStationsPageServicesBinding2 = stationsPageServicesFragment.binding;
            if (fragmentStationsPageServicesBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageServicesBinding2 = null;
            }
            ImageView imageView2 = fragmentStationsPageServicesBinding2.addFavourite;
            Context context2 = stationsPageServicesFragment.getContext();
            imageView2.setContentDescription(context2 != null ? context2.getString(R.string.content_description_icon_favorite) : null);
        }
        return Unit.INSTANCE;
    }
}
