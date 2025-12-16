package com.adif.elcanomovil.uiStations.adapters;

import I0.h;
import I0.p;
import L1.a;
import S0.i;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.uiStations.R;
import com.adif.elcanomovil.uiStations.databinding.ItemStationsPageCommercialBinding;
import com.adif.elcanomovil.uiStations.entities.Services;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JD\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062%\u0010\u000e\u001a!\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bj\u0002`\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/adif/elcanomovil/uiStations/adapters/CommercialViewHolder;", "Landroidx/recyclerview/widget/I0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lcom/adif/elcanomovil/uiStations/entities/Services;", "item", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "service", "", "Lcom/adif/elcanomovil/uiStations/adapters/OnServiceTap;", "onServiceTap", "", "position", "bind", "(Lcom/adif/elcanomovil/uiStations/entities/Services;Lkotlin/jvm/functions/Function1;I)V", "Lcom/adif/elcanomovil/uiStations/databinding/ItemStationsPageCommercialBinding;", "itemBinding", "Lcom/adif/elcanomovil/uiStations/databinding/ItemStationsPageCommercialBinding;", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommercialAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommercialAdapter.kt\ncom/adif/elcanomovil/uiStations/adapters/CommercialViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,68:1\n54#2,3:69\n24#2:72\n59#2,6:73\n*S KotlinDebug\n*F\n+ 1 CommercialAdapter.kt\ncom/adif/elcanomovil/uiStations/adapters/CommercialViewHolder\n*L\n58#1:69,3\n58#1:72\n58#1:73,6\n*E\n"})
/* loaded from: classes2.dex */
public final class CommercialViewHolder extends I0 {
    private final ItemStationsPageCommercialBinding itemBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialViewHolder(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ItemStationsPageCommercialBinding bind = ItemStationsPageCommercialBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.itemBinding = bind;
    }

    public static final void bind$lambda$1$lambda$0(Function1 onServiceTap, Services item, View view) {
        Intrinsics.checkNotNullParameter(onServiceTap, "$onServiceTap");
        Intrinsics.checkNotNullParameter(item, "$item");
        onServiceTap.invoke(item);
    }

    public final void bind(Services item, Function1<? super Services, Unit> onServiceTap, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onServiceTap, "onServiceTap");
        ConstraintLayout constraintLayout = this.itemBinding.layout;
        constraintLayout.setOnClickListener(new a(item, onServiceTap, 0));
        constraintLayout.setBackgroundResource(position % 2 == 0 ? R.color.black : R.color.darkLight);
        AppCompatImageView serviceIcon = this.itemBinding.serviceIcon;
        Intrinsics.checkNotNullExpressionValue(serviceIcon, "serviceIcon");
        String logo = item.getLogo();
        h a2 = I0.a.a(serviceIcon.getContext());
        i iVar = new i(serviceIcon.getContext());
        iVar.f1464c = logo;
        iVar.c(serviceIcon);
        ((p) a2).b(iVar.a());
        this.itemBinding.name.setText(item.getName());
        this.itemBinding.type.setText(item.getDescription());
        AppCompatImageView appCompatImageView = this.itemBinding.offerIcon;
        String offerName = item.getOfferName();
        appCompatImageView.setVisibility((offerName == null || !(StringsKt.isBlank(offerName) ^ true)) ? 8 : 0);
    }
}
