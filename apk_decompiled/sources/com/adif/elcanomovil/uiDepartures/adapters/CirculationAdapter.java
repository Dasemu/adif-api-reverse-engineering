package com.adif.elcanomovil.uiDepartures.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.I0;
import androidx.recyclerview.widget.Z;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.circulation.AvldmdCirculation;
import com.adif.elcanomovil.domain.entities.circulation.CercaniasCirculation;
import com.adif.elcanomovil.domain.entities.circulation.Circulation;
import com.adif.elcanomovil.domain.entities.circulation.DateHeaderCirculation;
import com.adif.elcanomovil.domain.entities.circulation.OtherCirculation;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculation;
import com.adif.elcanomovil.uiDepartures.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR$\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/adapters/CirculationAdapter;", "Landroidx/recyclerview/widget/Z;", "Lcom/adif/elcanomovil/domain/entities/circulation/Circulation;", "Landroidx/recyclerview/widget/I0;", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "circulationType", "Lkotlin/Function1;", "", "", "onObservationTapped", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculation;", "onTrainTapped", "<init>", "(Lcom/adif/elcanomovil/domain/entities/CirculationType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/I0;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/I0;I)V", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "Lkotlin/jvm/functions/Function1;", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CirculationAdapter extends Z {
    private final CirculationType circulationType;
    private final Function1<String, Unit> onObservationTapped;
    private final Function1<TrainCirculation, Unit> onTrainTapped;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.recyclerview.widget.d] */
    public CirculationAdapter(CirculationType circulationType, Function1<? super String, Unit> function1, Function1<? super TrainCirculation, Unit> onTrainTapped) {
        super(new Object());
        Intrinsics.checkNotNullParameter(circulationType, "circulationType");
        Intrinsics.checkNotNullParameter(onTrainTapped, "onTrainTapped");
        this.circulationType = circulationType;
        this.onObservationTapped = function1;
        this.onTrainTapped = onTrainTapped;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public int getItemViewType(int position) {
        Circulation circulation = (Circulation) getItem(position);
        if (circulation instanceof CercaniasCirculation) {
            return 1;
        }
        if (circulation instanceof AvldmdCirculation) {
            return 2;
        }
        return circulation instanceof OtherCirculation ? 3 : 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public void onBindViewHolder(I0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Circulation circulation = (Circulation) getItem(position);
        if ((holder instanceof CercaniasCirculationViewHolder) && (circulation instanceof CercaniasCirculation)) {
            ((CercaniasCirculationViewHolder) holder).bind((CercaniasCirculation) circulation, this.circulationType, this.onObservationTapped, this.onTrainTapped);
            return;
        }
        if ((holder instanceof AvldmdCirculationViewHolder) && (circulation instanceof AvldmdCirculation)) {
            ((AvldmdCirculationViewHolder) holder).bind((AvldmdCirculation) circulation, this.circulationType, this.onObservationTapped, this.onTrainTapped);
            return;
        }
        if ((holder instanceof CirculationDateViewHolder) && (circulation instanceof DateHeaderCirculation)) {
            ((CirculationDateViewHolder) holder).bind((DateHeaderCirculation) circulation);
        } else if ((holder instanceof OtherCirculationViewHolder) && (circulation instanceof OtherCirculation)) {
            ((OtherCirculationViewHolder) holder).bind((OtherCirculation) circulation, this.circulationType, this.onObservationTapped, this.onTrainTapped);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public I0 onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_circulation_date, parent, false);
            Intrinsics.checkNotNull(inflate);
            return new CirculationDateViewHolder(inflate);
        }
        if (viewType == 1) {
            View inflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_circulation_cercanias, parent, false);
            Intrinsics.checkNotNull(inflate2);
            return new CercaniasCirculationViewHolder(inflate2);
        }
        if (viewType != 2) {
            View inflate3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_circulation_trains, parent, false);
            Intrinsics.checkNotNull(inflate3);
            return new OtherCirculationViewHolder(inflate3);
        }
        View inflate4 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_circulation_trains, parent, false);
        Intrinsics.checkNotNull(inflate4);
        return new AvldmdCirculationViewHolder(inflate4);
    }
}
