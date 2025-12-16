package com.adif.elcanomovil.uiSubscriptions.create.views;

import D1.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.uiSubscriptions.R;
import com.adif.elcanomovil.uiSubscriptions.create.views.data.InfoDataTrain;
import com.adif.elcanomovil.uiSubscriptions.databinding.ViewSubscriptionTrainBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J \u0010\u0019\u001a\u00020\u00132\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0002`\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/create/views/TrainView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attrs", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/adif/elcanomovil/uiSubscriptions/databinding/ViewSubscriptionTrainBinding;", "infoData", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/InfoDataTrain;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/TrainAction;", "", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/OnTrainActionListener;", "configureListeners", "configureView", "info", "initView", "setOnTrainActionListener", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrainView extends ConstraintLayout {
    private ViewSubscriptionTrainBinding binding;
    private InfoDataTrain infoData;
    private Function1<? super TrainAction, Unit> listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, null);
    }

    private final void configureListeners() {
        ViewSubscriptionTrainBinding viewSubscriptionTrainBinding = this.binding;
        if (viewSubscriptionTrainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewSubscriptionTrainBinding = null;
        }
        viewSubscriptionTrainBinding.textViewMyStation.setOnClickListener(new a(this, 6));
    }

    public static final void configureListeners$lambda$0(TrainView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super TrainAction, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(TrainAction.SEARCH_MY_STATION);
        }
    }

    private final void initView(Context context, AttributeSet attrs) {
        View.inflate(context, R.layout.view_subscription_train, this);
        ViewSubscriptionTrainBinding bind = ViewSubscriptionTrainBinding.bind(this);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        configureListeners();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        r2 = kotlin.text.StringsKt__StringsKt.split$default(r2, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureView(com.adif.elcanomovil.uiSubscriptions.create.views.data.InfoDataTrain r7) {
        /*
            r6 = this;
            r6.infoData = r7
            com.adif.elcanomovil.uiSubscriptions.databinding.ViewSubscriptionTrainBinding r7 = r6.binding
            java.lang.String r0 = "binding"
            r1 = 0
            if (r7 != 0) goto Ld
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r7 = r1
        Ld:
            android.widget.TextView r7 = r7.trainOperator
            com.adif.elcanomovil.uiSubscriptions.create.views.data.InfoDataTrain r2 = r6.infoData
            if (r2 == 0) goto L18
            java.lang.String r2 = r2.getOperator()
            goto L19
        L18:
            r2 = r1
        L19:
            r7.setText(r2)
            com.adif.elcanomovil.uiSubscriptions.databinding.ViewSubscriptionTrainBinding r7 = r6.binding
            if (r7 != 0) goto L24
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r7 = r1
        L24:
            android.widget.TextView r7 = r7.trainType
            com.adif.elcanomovil.uiSubscriptions.create.views.data.InfoDataTrain r2 = r6.infoData
            if (r2 == 0) goto L2f
            java.lang.String r2 = r2.getCommercialProduct()
            goto L30
        L2f:
            r2 = r1
        L30:
            r7.setText(r2)
            com.adif.elcanomovil.uiSubscriptions.databinding.ViewSubscriptionTrainBinding r7 = r6.binding
            if (r7 != 0) goto L3b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r7 = r1
        L3b:
            android.widget.TextView r7 = r7.trainNumber
            com.adif.elcanomovil.uiSubscriptions.create.views.data.InfoDataTrain r2 = r6.infoData
            if (r2 == 0) goto L5e
            java.lang.String r2 = r2.getTrainId()
            if (r2 == 0) goto L5e
            java.lang.String r3 = "-"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            r4 = 6
            r5 = 0
            java.util.List r2 = kotlin.text.StringsKt.x(r2, r3, r5, r4)
            if (r2 == 0) goto L5e
            java.lang.Object r2 = kotlin.collections.CollectionsKt.firstOrNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L5e
            goto L60
        L5e:
            java.lang.String r2 = ""
        L60:
            r7.setText(r2)
            com.adif.elcanomovil.uiSubscriptions.databinding.ViewSubscriptionTrainBinding r7 = r6.binding
            if (r7 != 0) goto L6b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r7 = r1
        L6b:
            android.widget.TextView r7 = r7.textViewMyStation
            com.adif.elcanomovil.uiSubscriptions.create.views.data.InfoDataTrain r6 = r6.infoData
            if (r6 == 0) goto L75
            java.lang.String r1 = r6.getStationCenter()
        L75:
            r7.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiSubscriptions.create.views.TrainView.configureView(com.adif.elcanomovil.uiSubscriptions.create.views.data.InfoDataTrain):void");
    }

    public final void setOnTrainActionListener(Function1<? super TrainAction, Unit> r12) {
        this.listener = r12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }

    public /* synthetic */ TrainView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }
}
