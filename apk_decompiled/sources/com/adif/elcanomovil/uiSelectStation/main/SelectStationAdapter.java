package com.adif.elcanomovil.uiSelectStation.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.I0;
import androidx.recyclerview.widget.Z;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.uiSelectStation.R;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B.\u0012%\u0010\n\u001a!\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R3\u0010\n\u001a!\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationAdapter;", "Landroidx/recyclerview/widget/Z;", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "Landroidx/recyclerview/widget/I0;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "station", "", "Lcom/adif/elcanomovil/uiSelectStation/main/OnStationSelected;", "onTap", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/I0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/I0;I)V", "Lkotlin/jvm/functions/Function1;", "ui-select-station_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectStationAdapter extends Z {
    private final Function1<Station, Unit> onTap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.recyclerview.widget.d] */
    public SelectStationAdapter(Function1<? super Station, Unit> onTap) {
        super(new Object());
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        this.onTap = onTap;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public void onBindViewHolder(I0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Station station = (Station) getItem(position);
        if (holder instanceof StationViewHolder) {
            Intrinsics.checkNotNull(station);
            ((StationViewHolder) holder).bind(station);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public I0 onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_station_option, parent, false);
        Function1<Station, Unit> function1 = this.onTap;
        Intrinsics.checkNotNull(inflate);
        return new StationViewHolder(function1, inflate);
    }
}
