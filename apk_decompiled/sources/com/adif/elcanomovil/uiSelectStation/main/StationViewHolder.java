package com.adif.elcanomovil.uiSelectStation.main;

import android.view.View;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.commonViews.databinding.ViewStationOptionBinding;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.extensions.FloatExtensionsKt;
import com.adif.elcanomovil.uiSelectStation.R;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B6\u0012%\u0010\t\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016R3\u0010\t\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/adif/elcanomovil/uiSelectStation/main/StationViewHolder;", "Landroidx/recyclerview/widget/I0;", "Lkotlin/Function1;", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "station", "", "Lcom/adif/elcanomovil/uiSelectStation/main/OnStationSelected;", "onTap", "Landroid/view/View;", "itemView", "<init>", "(Lkotlin/jvm/functions/Function1;Landroid/view/View;)V", "", "typeTraffic", "", "commuterNetwork", "paintTypeTraffic", "(ILjava/lang/String;)Ljava/lang/String;", "item", "bind", "(Lcom/adif/elcanomovil/domain/entities/station/Station;)V", "Lkotlin/jvm/functions/Function1;", "Lcom/adif/elcanomovil/commonViews/databinding/ViewStationOptionBinding;", "itemBinding", "Lcom/adif/elcanomovil/commonViews/databinding/ViewStationOptionBinding;", "ui-select-station_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StationViewHolder extends I0 {
    private final ViewStationOptionBinding itemBinding;
    private final Function1<Station, Unit> onTap;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StationViewEntity.TypeTraffic.values().length];
            try {
                iArr[StationViewEntity.TypeTraffic.CERCANIAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StationViewEntity.TypeTraffic.AVLDMD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StationViewEntity.TypeTraffic.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StationViewHolder(Function1<? super Station, Unit> onTap, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.onTap = onTap;
        ViewStationOptionBinding bind = ViewStationOptionBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.itemBinding = bind;
    }

    public static /* synthetic */ void a(StationViewHolder stationViewHolder, Station station, View view) {
        bind$lambda$2(stationViewHolder, station, view);
    }

    public static final void bind$lambda$2(StationViewHolder this$0, Station item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.onTap.invoke(item);
    }

    private final String paintTypeTraffic(int typeTraffic, String commuterNetwork) {
        boolean equals;
        String string = this.itemView.getContext().getString(R.string.circulation_traintype_cercanias);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this.itemView.getContext().getString(R.string.circulation_traintype_both);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        equals = StringsKt__StringsJVMKt.equals(commuterNetwork, "RODALIES_CATALUNYA", true);
        if (equals) {
            string = this.itemView.getContext().getString(R.string.circulation_traintype_rodalies);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            string2 = this.itemView.getContext().getString(R.string.circulation_traintype_both_rodalies);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        StationViewEntity.TypeTraffic invoke = StationViewEntity.TypeTraffic.INSTANCE.invoke(typeTraffic);
        int i = invoke == null ? -1 : WhenMappings.$EnumSwitchMapping$0[invoke.ordinal()];
        if (i == 1) {
            return string;
        }
        if (i != 2) {
            return i != 3 ? "" : string2;
        }
        String string3 = this.itemView.getContext().getString(R.string.circulation_traintype_others);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public final void bind(Station item) {
        Unit unit;
        String distance;
        Intrinsics.checkNotNullParameter(item, "item");
        this.itemBinding.stationOptionTitle.setText(item.getShortName());
        this.itemBinding.stationOptionTitle.setContentDescription(item.getLongName());
        this.itemBinding.stationOptionSubtitle.setText(paintTypeTraffic(item.getTrafficType(), item.getCommuterNetwork()));
        Float distance2 = item.getDistance();
        if (distance2 == null || (distance = FloatExtensionsKt.toDistance(distance2.floatValue())) == null) {
            unit = null;
        } else {
            this.itemBinding.stationOptionDistance.setVisibility(0);
            this.itemBinding.stationOptionDistance.setText(distance);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.itemBinding.stationOptionDistance.setVisibility(8);
        }
        this.itemBinding.getRoot().setOnClickListener(new G2.l(7, this, item));
    }
}
