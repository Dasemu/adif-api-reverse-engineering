package com.adif.elcanomovil.uiTrain.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.uiTrain.R;
import com.adif.elcanomovil.uiTrain.entities.DateHeader;
import com.adif.elcanomovil.uiTrain.entities.Step;
import com.adif.elcanomovil.uiTrain.entities.StepItems;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012%\u0010\n\u001a!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t\u0012%\u0010\f\u001a!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0015\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b#\u0010$R3\u0010\n\u001a!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R3\u0010\f\u001a!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u0016\u0010(\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006)"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/main/TrainSituationAdapter;", "Landroidx/recyclerview/widget/h0;", "Landroidx/recyclerview/widget/I0;", "Lkotlin/Function1;", "Lcom/adif/elcanomovil/uiTrain/entities/Step;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "step", "", "Lcom/adif/elcanomovil/uiTrain/main/OnStepSelected;", "onTap", "Lcom/adif/elcanomovil/uiTrain/main/OnObservationSelected;", "onObservationTap", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "Lcom/adif/elcanomovil/uiTrain/entities/StepItems;", FirebaseAnalytics.Param.ITEMS, "", "isCercanias", "extendedInfo", "update", "(Ljava/util/List;ZZ)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/I0;", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/I0;I)V", "Lkotlin/jvm/functions/Function1;", "Ljava/util/List;", "Z", "showExtendedInfo", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrainSituationAdapter extends AbstractC0220h0 {
    private boolean isCercanias;
    private List<? extends StepItems> items;
    private final Function1<Step, Unit> onObservationTap;
    private final Function1<Step, Unit> onTap;
    private boolean showExtendedInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public TrainSituationAdapter(Function1<? super Step, Unit> onTap, Function1<? super Step, Unit> onObservationTap) {
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        Intrinsics.checkNotNullParameter(onObservationTap, "onObservationTap");
        this.onTap = onTap;
        this.onObservationTap = onObservationTap;
        this.items = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public int getItemViewType(int position) {
        return this.items.get(position) instanceof Step ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public void onBindViewHolder(I0 holder, int position) {
        int i;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof StepViewHolder) {
            StepItems stepItems = this.items.get(position);
            Intrinsics.checkNotNull(stepItems, "null cannot be cast to non-null type com.adif.elcanomovil.uiTrain.entities.Step");
            i = position;
            ((StepViewHolder) holder).bind((Step) stepItems, this.items, i, this.isCercanias, this.showExtendedInfo);
        } else {
            i = position;
        }
        if (holder instanceof DateViewHolder) {
            StepItems stepItems2 = this.items.get(i);
            Intrinsics.checkNotNull(stepItems2, "null cannot be cast to non-null type com.adif.elcanomovil.uiTrain.entities.DateHeader");
            ((DateViewHolder) holder).bind((DateHeader) stepItems2, this.items, i);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public I0 onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_train_date, parent, false);
            Intrinsics.checkNotNull(inflate);
            return new DateViewHolder(inflate);
        }
        View inflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_train_situation, parent, false);
        Function1<Step, Unit> function1 = this.onTap;
        Function1<Step, Unit> function12 = this.onObservationTap;
        Intrinsics.checkNotNull(inflate2);
        return new StepViewHolder(function1, function12, inflate2);
    }

    public final void update(List<? extends StepItems> items, boolean isCercanias, boolean extendedInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.isCercanias = isCercanias;
        this.showExtendedInfo = extendedInfo;
        notifyDataSetChanged();
    }
}
