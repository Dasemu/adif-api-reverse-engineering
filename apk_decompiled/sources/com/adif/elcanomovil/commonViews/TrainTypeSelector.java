package com.adif.elcanomovil.commonViews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import com.adif.elcanomovil.commonViews.databinding.ViewRadiogroupTraintypeBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001a\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002J \u0010\u0016\u001a\u00020\u000e2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0002`\u000fJ\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\u0018\u001a\u00020\u000eH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0002`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/adif/elcanomovil/commonViews/TrainTypeSelector;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/adif/elcanomovil/commonViews/databinding/ViewRadiogroupTraintypeBinding;", "isCercanias", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "Lcom/adif/elcanomovil/commonViews/OnTypeSelectionListener;", "configureListeners", "configureView", "attributes", "Landroid/content/res/TypedArray;", "initView", "attrs", "setOnTypeSelectionListener", "update", "updateSelection", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TrainTypeSelector extends FrameLayout {
    private ViewRadiogroupTraintypeBinding binding;
    private boolean isCercanias;
    private Function1<? super Boolean, Unit> listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainTypeSelector(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isCercanias = true;
        initView(context, null);
    }

    private final void configureListeners() {
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding = this.binding;
        if (viewRadiogroupTraintypeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewRadiogroupTraintypeBinding = null;
        }
        viewRadiogroupTraintypeBinding.group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.adif.elcanomovil.commonViews.g
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                TrainTypeSelector.configureListeners$lambda$1(TrainTypeSelector.this, radioGroup, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$1(TrainTypeSelector this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding = this$0.binding;
        if (viewRadiogroupTraintypeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewRadiogroupTraintypeBinding = null;
        }
        this$0.isCercanias = i == viewRadiogroupTraintypeBinding.cercanias.getId();
        this$0.updateSelection();
        Function1<? super Boolean, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(this$0.isCercanias));
        }
    }

    private final void configureView(TypedArray attributes) {
        this.isCercanias = attributes.getBoolean(R.styleable.TrainTypeSelector_isCercanias, true);
        updateSelection();
    }

    private final void initView(Context context, AttributeSet attrs) {
        View.inflate(context, R.layout.view_radiogroup_traintype, this);
        ViewRadiogroupTraintypeBinding bind = ViewRadiogroupTraintypeBinding.bind(this);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.TrainTypeSelector, 0, 0);
        Intrinsics.checkNotNull(obtainStyledAttributes);
        configureView(obtainStyledAttributes);
        configureListeners();
    }

    private final void updateSelection() {
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding = null;
        if (this.isCercanias) {
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding2 = this.binding;
            if (viewRadiogroupTraintypeBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding2 = null;
            }
            RadioGroup radioGroup = viewRadiogroupTraintypeBinding2.group;
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding3 = this.binding;
            if (viewRadiogroupTraintypeBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding3 = null;
            }
            radioGroup.check(viewRadiogroupTraintypeBinding3.cercanias.getId());
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding4 = this.binding;
            if (viewRadiogroupTraintypeBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding4 = null;
            }
            viewRadiogroupTraintypeBinding4.cercanias.setTypeface(Typeface.DEFAULT_BOLD);
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding5 = this.binding;
            if (viewRadiogroupTraintypeBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                viewRadiogroupTraintypeBinding = viewRadiogroupTraintypeBinding5;
            }
            viewRadiogroupTraintypeBinding.trains.setTypeface(Typeface.DEFAULT);
            return;
        }
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding6 = this.binding;
        if (viewRadiogroupTraintypeBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewRadiogroupTraintypeBinding6 = null;
        }
        RadioGroup radioGroup2 = viewRadiogroupTraintypeBinding6.group;
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding7 = this.binding;
        if (viewRadiogroupTraintypeBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewRadiogroupTraintypeBinding7 = null;
        }
        radioGroup2.check(viewRadiogroupTraintypeBinding7.trains.getId());
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding8 = this.binding;
        if (viewRadiogroupTraintypeBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewRadiogroupTraintypeBinding8 = null;
        }
        viewRadiogroupTraintypeBinding8.trains.setTypeface(Typeface.DEFAULT_BOLD);
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding9 = this.binding;
        if (viewRadiogroupTraintypeBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewRadiogroupTraintypeBinding = viewRadiogroupTraintypeBinding9;
        }
        viewRadiogroupTraintypeBinding.cercanias.setTypeface(Typeface.DEFAULT);
    }

    public final void setOnTypeSelectionListener(Function1<? super Boolean, Unit> listener) {
        this.listener = listener;
    }

    public final void update(boolean isCercanias) {
        this.isCercanias = isCercanias;
        updateSelection();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainTypeSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isCercanias = true;
        initView(context, attributeSet);
    }

    public /* synthetic */ TrainTypeSelector(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
