package com.adif.elcanomovil.uiTrain.main;

import android.view.View;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.uiTrain.databinding.ItemTrainDateBinding;
import com.adif.elcanomovil.uiTrain.entities.DateHeader;
import com.adif.elcanomovil.uiTrain.entities.Step;
import com.adif.elcanomovil.uiTrain.entities.StepItems;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/main/DateViewHolder;", "Landroidx/recyclerview/widget/I0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lcom/adif/elcanomovil/uiTrain/entities/DateHeader;", "item", "", "Lcom/adif/elcanomovil/uiTrain/entities/StepItems;", FirebaseAnalytics.Param.ITEMS, "", "position", "", "bind", "(Lcom/adif/elcanomovil/uiTrain/entities/DateHeader;Ljava/util/List;I)V", "Lcom/adif/elcanomovil/uiTrain/databinding/ItemTrainDateBinding;", "itemBinding", "Lcom/adif/elcanomovil/uiTrain/databinding/ItemTrainDateBinding;", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DateViewHolder extends I0 {
    private final ItemTrainDateBinding itemBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateViewHolder(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ItemTrainDateBinding bind = ItemTrainDateBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.itemBinding = bind;
    }

    public final void bind(DateHeader item, List<? extends StepItems> items, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(items, "items");
        if (position > 0 && position < items.size() - 1) {
            StepItems stepItems = items.get(position - 1);
            Intrinsics.checkNotNull(stepItems, "null cannot be cast to non-null type com.adif.elcanomovil.uiTrain.entities.Step");
            if (((Step) stepItems).getIsDepartureAudited()) {
                StepItems stepItems2 = items.get(position + 1);
                Intrinsics.checkNotNull(stepItems2, "null cannot be cast to non-null type com.adif.elcanomovil.uiTrain.entities.Step");
                if (!((Step) stepItems2).getIsArrivalAudited()) {
                    this.itemBinding.trainViewInStation.setVisibility(0);
                    this.itemBinding.formattedDate.setText(item.getFormattedDateShort());
                    return;
                }
            }
        }
        this.itemBinding.trainViewInStation.setVisibility(4);
        this.itemBinding.formattedDate.setText(item.getFormattedDate());
    }
}
