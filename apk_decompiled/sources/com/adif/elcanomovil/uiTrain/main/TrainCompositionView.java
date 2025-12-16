package com.adif.elcanomovil.uiTrain.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.domain.entities.compositions.Empty;
import com.adif.elcanomovil.domain.entities.compositions.Wagon;
import com.adif.elcanomovil.uiTrain.R;
import com.adif.elcanomovil.uiTrain.databinding.TrainCompositionViewBinding;
import com.google.firebase.messaging.Constants;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\u0014\u0010\u0013\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/main/TrainCompositionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attrs", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/adif/elcanomovil/uiTrain/main/TrainCompositionAdapter;", "binding", "Lcom/adif/elcanomovil/uiTrain/databinding/TrainCompositionViewBinding;", "configureView", "", "initView", "update", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/adif/elcanomovil/domain/entities/compositions/Wagon;", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrainCompositionView extends ConstraintLayout {
    private TrainCompositionAdapter adapter;
    private TrainCompositionViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainCompositionView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, null);
    }

    private final void configureView() {
        this.adapter = new TrainCompositionAdapter();
        TrainCompositionViewBinding trainCompositionViewBinding = this.binding;
        TrainCompositionAdapter trainCompositionAdapter = null;
        if (trainCompositionViewBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainCompositionViewBinding = null;
        }
        RecyclerView recyclerView = trainCompositionViewBinding.rvComposition;
        TrainCompositionAdapter trainCompositionAdapter2 = this.adapter;
        if (trainCompositionAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            trainCompositionAdapter = trainCompositionAdapter2;
        }
        recyclerView.setAdapter(trainCompositionAdapter);
    }

    private final void initView(Context context, AttributeSet attrs) {
        View.inflate(context, R.layout.train_composition_view, this);
        TrainCompositionViewBinding bind = TrainCompositionViewBinding.bind(this);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        configureView();
    }

    public final void update(List<? extends Wagon> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        List mutableList = CollectionsKt.toMutableList((Collection) data);
        mutableList.add(new Empty());
        List<? extends Wagon> list = CollectionsKt.toList(mutableList);
        TrainCompositionViewBinding trainCompositionViewBinding = null;
        if (!data.isEmpty()) {
            TrainCompositionViewBinding trainCompositionViewBinding2 = this.binding;
            if (trainCompositionViewBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                trainCompositionViewBinding2 = null;
            }
            trainCompositionViewBinding2.parent.setVisibility(0);
            TrainCompositionViewBinding trainCompositionViewBinding3 = this.binding;
            if (trainCompositionViewBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                trainCompositionViewBinding3 = null;
            }
            trainCompositionViewBinding3.ivTrainDirection.setVisibility(0);
            TrainCompositionViewBinding trainCompositionViewBinding4 = this.binding;
            if (trainCompositionViewBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                trainCompositionViewBinding4 = null;
            }
            trainCompositionViewBinding4.rvComposition.setVisibility(0);
            TrainCompositionViewBinding trainCompositionViewBinding5 = this.binding;
            if (trainCompositionViewBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                trainCompositionViewBinding5 = null;
            }
            trainCompositionViewBinding5.vShadow.setVisibility(0);
        }
        TrainCompositionAdapter trainCompositionAdapter = this.adapter;
        if (trainCompositionAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            trainCompositionAdapter = null;
        }
        trainCompositionAdapter.update(list);
        TrainCompositionViewBinding trainCompositionViewBinding6 = this.binding;
        if (trainCompositionViewBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            trainCompositionViewBinding = trainCompositionViewBinding6;
        }
        trainCompositionViewBinding.rvComposition.j0(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainCompositionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }

    public /* synthetic */ TrainCompositionView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainCompositionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }
}
