package com.adif.elcanomovil.uiStations.main;

import android.content.Context;
import android.widget.TextView;
import com.adif.elcanomovil.uiStations.R;
import com.adif.elcanomovil.uiStations.databinding.FragmentStationsBinding;
import com.adif.elcanomovil.uiStations.entities.StationHeaderData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentStationsBinding f5269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StationsFragment f5270b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FragmentStationsBinding fragmentStationsBinding, StationsFragment stationsFragment) {
        super(1);
        this.f5269a = fragmentStationsBinding;
        this.f5270b = stationsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        StationHeaderData stationHeaderData = (StationHeaderData) obj;
        int length = stationHeaderData.getStationName().length();
        StationsFragment stationsFragment = this.f5270b;
        FragmentStationsBinding fragmentStationsBinding = this.f5269a;
        if (length == 0) {
            fragmentStationsBinding.stationsStationName.setTextColor(stationsFragment.requireContext().getColor(R.color.colorTextSecondaryGrey));
            TextView textView = fragmentStationsBinding.stationsStationName;
            Context context = stationsFragment.getContext();
            textView.setText(context != null ? context.getString(R.string.select_station) : null);
        } else {
            fragmentStationsBinding.stationsStationName.setTextColor(stationsFragment.requireContext().getColor(R.color.white));
            fragmentStationsBinding.stationsStationName.setText(stationHeaderData.getStationName());
            fragmentStationsBinding.stationsStationName.setContentDescription(stationHeaderData.getStationLongName());
        }
        return Unit.INSTANCE;
    }
}
