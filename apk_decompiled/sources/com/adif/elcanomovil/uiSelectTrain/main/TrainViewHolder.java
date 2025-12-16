package com.adif.elcanomovil.uiSelectTrain.main;

import a.AbstractC0105a;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonViews.databinding.ViewTrainOptionBinding;
import com.adif.elcanomovil.uiSelectTrain.entities.TrainInfo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B6\u0012%\u0010\t\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010R3\u0010\t\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/uiSelectTrain/main/TrainViewHolder;", "Landroidx/recyclerview/widget/I0;", "Lkotlin/Function1;", "Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainInfo;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, NavArguments.ARG_DYNAMIC_TRAIN, "", "Lcom/adif/elcanomovil/uiSelectTrain/main/OnTrainSelected;", "onTap", "Landroid/view/View;", "itemView", "<init>", "(Lkotlin/jvm/functions/Function1;Landroid/view/View;)V", "item", "bind", "(Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainInfo;)V", "Lkotlin/jvm/functions/Function1;", "Lcom/adif/elcanomovil/commonViews/databinding/ViewTrainOptionBinding;", "itemBinding", "Lcom/adif/elcanomovil/commonViews/databinding/ViewTrainOptionBinding;", "ui-select-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TrainViewHolder extends I0 {
    private final ViewTrainOptionBinding itemBinding;
    private final Function1<TrainInfo, Unit> onTap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TrainViewHolder(Function1<? super TrainInfo, Unit> onTap, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.onTap = onTap;
        ViewTrainOptionBinding bind = ViewTrainOptionBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.itemBinding = bind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(TrainViewHolder this$0, TrainInfo item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.onTap.invoke(item);
    }

    public final void bind(TrainInfo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = this.itemBinding.trainOptionTitle;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{AbstractC0105a.K(this.itemView.getContext(), item.getOperator()), AbstractC0105a.k(this.itemView.getContext(), item.getCommercialProduct())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        textView.setText(format);
        this.itemBinding.trainOptionNumber.setText(item.getCommercialNumber());
        this.itemBinding.trainOptionFromStation.setText(item.getOriginStation().getStationName());
        this.itemBinding.trainOptionToStation.setText(item.getDestinationStation().getStationName());
        this.itemBinding.getRoot().setOnClickListener(new G2.l(8, this, item));
    }
}
