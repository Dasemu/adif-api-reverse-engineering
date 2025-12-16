package com.adif.elcanomovil.uiStations.adapters;

import G2.l;
import I0.a;
import I0.h;
import I0.p;
import S0.i;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.uiStations.databinding.ItemStationsPageActivitiesBinding;
import com.adif.elcanomovil.uiStations.entities.Activity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062%\u0010\u000e\u001a!\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/uiStations/adapters/ActivityViewHolder;", "Landroidx/recyclerview/widget/I0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lcom/adif/elcanomovil/uiStations/entities/Activity;", "item", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "activitie", "", "Lcom/adif/elcanomovil/uiStations/adapters/OnActivityTap;", "onActivityTap", "bind", "(Lcom/adif/elcanomovil/uiStations/entities/Activity;Lkotlin/jvm/functions/Function1;)V", "Lcom/adif/elcanomovil/uiStations/databinding/ItemStationsPageActivitiesBinding;", "itemBinding", "Lcom/adif/elcanomovil/uiStations/databinding/ItemStationsPageActivitiesBinding;", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActivitiesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivitiesAdapter.kt\ncom/adif/elcanomovil/uiStations/adapters/ActivityViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,61:1\n54#2,3:62\n24#2:65\n59#2,6:66\n*S KotlinDebug\n*F\n+ 1 ActivitiesAdapter.kt\ncom/adif/elcanomovil/uiStations/adapters/ActivityViewHolder\n*L\n52#1:62,3\n52#1:65\n52#1:66,6\n*E\n"})
/* loaded from: classes2.dex */
public final class ActivityViewHolder extends I0 {
    private final ItemStationsPageActivitiesBinding itemBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityViewHolder(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ItemStationsPageActivitiesBinding bind = ItemStationsPageActivitiesBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.itemBinding = bind;
    }

    public static final void bind$lambda$0(Function1 onActivityTap, Activity item, View view) {
        Intrinsics.checkNotNullParameter(onActivityTap, "$onActivityTap");
        Intrinsics.checkNotNullParameter(item, "$item");
        onActivityTap.invoke(item);
    }

    public final void bind(Activity item, Function1<? super Activity, Unit> onActivityTap) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onActivityTap, "onActivityTap");
        this.itemBinding.layout.setOnClickListener(new l(1, onActivityTap, item));
        AppCompatImageView serviceIcon = this.itemBinding.serviceIcon;
        Intrinsics.checkNotNullExpressionValue(serviceIcon, "serviceIcon");
        String logo = item.getLogo();
        h a2 = a.a(serviceIcon.getContext());
        i iVar = new i(serviceIcon.getContext());
        iVar.f1464c = logo;
        iVar.c(serviceIcon);
        ((p) a2).b(iVar.a());
        this.itemBinding.name.setText(item.getName());
        this.itemBinding.description.setText(item.getDescription());
        this.itemBinding.date.setText(item.getOpeningHours());
    }
}
