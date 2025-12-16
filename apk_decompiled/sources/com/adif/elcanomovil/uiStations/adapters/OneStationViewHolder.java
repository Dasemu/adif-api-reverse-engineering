package com.adif.elcanomovil.uiStations.adapters;

import I0.h;
import I0.p;
import L1.a;
import S0.i;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.uiStations.databinding.ItemStationsPageServicesBinding;
import com.adif.elcanomovil.uiStations.entities.Services;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062%\u0010\u000e\u001a!\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/uiStations/adapters/OneStationViewHolder;", "Landroidx/recyclerview/widget/I0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lcom/adif/elcanomovil/uiStations/entities/Services;", "item", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "service", "", "Lcom/adif/elcanomovil/uiStations/adapters/OnServiceTap;", "onServiceTap", "bind", "(Lcom/adif/elcanomovil/uiStations/entities/Services;Lkotlin/jvm/functions/Function1;)V", "Lcom/adif/elcanomovil/uiStations/databinding/ItemStationsPageServicesBinding;", "itemBinding", "Lcom/adif/elcanomovil/uiStations/databinding/ItemStationsPageServicesBinding;", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nServiceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceAdapter.kt\ncom/adif/elcanomovil/uiStations/adapters/OneStationViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,63:1\n54#2,3:64\n24#2:67\n59#2,6:68\n*S KotlinDebug\n*F\n+ 1 ServiceAdapter.kt\ncom/adif/elcanomovil/uiStations/adapters/OneStationViewHolder\n*L\n58#1:64,3\n58#1:67\n58#1:68,6\n*E\n"})
/* loaded from: classes2.dex */
public final class OneStationViewHolder extends I0 {
    private final ItemStationsPageServicesBinding itemBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStationViewHolder(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ItemStationsPageServicesBinding bind = ItemStationsPageServicesBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.itemBinding = bind;
    }

    public static final void bind$lambda$0(Function1 onServiceTap, Services item, View view) {
        Intrinsics.checkNotNullParameter(onServiceTap, "$onServiceTap");
        Intrinsics.checkNotNullParameter(item, "$item");
        onServiceTap.invoke(item);
    }

    public final void bind(Services item, Function1<? super Services, Unit> onServiceTap) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onServiceTap, "onServiceTap");
        this.itemBinding.button.setOnClickListener(new a(item, onServiceTap, 2));
        this.itemBinding.button.setContentDescription(item.getName());
        String logo = item.getLogo();
        if (logo == null || StringsKt.isBlank(logo)) {
            this.itemBinding.name.setText(item.getName());
            this.itemBinding.name.setVisibility(0);
            return;
        }
        this.itemBinding.name.setVisibility(8);
        this.itemBinding.icon.setVisibility(0);
        ImageButton icon = this.itemBinding.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        String logo2 = item.getLogo();
        h a2 = I0.a.a(icon.getContext());
        i iVar = new i(icon.getContext());
        iVar.f1464c = logo2;
        iVar.c(icon);
        ((p) a2).b(iVar.a());
    }
}
