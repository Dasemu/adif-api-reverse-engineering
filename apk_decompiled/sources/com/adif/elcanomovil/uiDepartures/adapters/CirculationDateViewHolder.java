package com.adif.elcanomovil.uiDepartures.adapters;

import android.view.View;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.commonViews.databinding.ItemCirculationDateBinding;
import com.adif.elcanomovil.domain.entities.circulation.DateHeaderCirculation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/adapters/CirculationDateViewHolder;", "Landroidx/recyclerview/widget/I0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lcom/adif/elcanomovil/domain/entities/circulation/DateHeaderCirculation;", "item", "", "bind", "(Lcom/adif/elcanomovil/domain/entities/circulation/DateHeaderCirculation;)V", "Lcom/adif/elcanomovil/commonViews/databinding/ItemCirculationDateBinding;", "itemBinding", "Lcom/adif/elcanomovil/commonViews/databinding/ItemCirculationDateBinding;", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CirculationDateViewHolder extends I0 {
    private final ItemCirculationDateBinding itemBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CirculationDateViewHolder(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ItemCirculationDateBinding bind = ItemCirculationDateBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.itemBinding = bind;
    }

    public final void bind(DateHeaderCirculation item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.itemBinding.getRoot().setText(item.getDate());
    }
}
