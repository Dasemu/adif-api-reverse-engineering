package com.adif.elcanomovil.commonViews;

import F.q;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.databinding.ViewDayBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ*\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\rJ\u001a\u0010 \u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\u0006\u0010!\u001a\u00020\u0019J\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\nJ\u001a\u0010$\u001a\u00020\u00192\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018j\u0002`\u001aR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u001c\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018j\u0004\u0018\u0001`\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/adif/elcanomovil/commonViews/DayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attrs", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "getActive", "()Z", "setActive", "(Z)V", "binding", "Lcom/adif/elcanomovil/commonViews/databinding/ViewDayBinding;", "<set-?>", "enable", "getEnable", "listenerOnClick", "Lkotlin/Function0;", "", "Lcom/adif/elcanomovil/commonViews/DayListener;", "initInfoView", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "accessibilityData", "selected", "initView", "paintStatus", "setDisable", "status", "setOnClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DayView extends ConstraintLayout {
    private boolean active;
    private ViewDayBinding binding;
    private boolean enable;
    private Function0<Unit> listenerOnClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DayView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.enable = true;
        initView(context, null);
    }

    public static /* synthetic */ void initInfoView$default(DayView dayView, String str, String str2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z4 = true;
        }
        dayView.initInfoView(str, str2, z3, z4);
    }

    private final void initView(Context context, AttributeSet attrs) {
        View.inflate(context, R.layout.view_day, this);
        ViewDayBinding bind = ViewDayBinding.bind(this);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        ViewDayBinding viewDayBinding = null;
        if (bind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bind = null;
        }
        Button button = bind.buttonOnclick;
        int i = R.color.transparent;
        button.setBackgroundColor(D.h.getColor(context, i));
        ViewDayBinding viewDayBinding2 = this.binding;
        if (viewDayBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewDayBinding2 = null;
        }
        viewDayBinding2.dayTitle.setBackgroundColor(D.h.getColor(context, i));
        ViewDayBinding viewDayBinding3 = this.binding;
        if (viewDayBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewDayBinding = viewDayBinding3;
        }
        viewDayBinding.buttonOnclick.setOnClickListener(new D1.a(this, 7));
        context.getTheme().obtainStyledAttributes(attrs, R.styleable.DayView, 0, 0);
    }

    public static final void initView$lambda$1(DayView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.enable) {
            this$0.active = !this$0.active;
            this$0.paintStatus();
            Function0<Unit> function0 = this$0.listenerOnClick;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final boolean getActive() {
        return this.active;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final void initInfoView(String r22, String accessibilityData, boolean selected, boolean enable) {
        Intrinsics.checkNotNullParameter(r22, "data");
        Intrinsics.checkNotNullParameter(accessibilityData, "accessibilityData");
        this.active = selected;
        this.enable = enable;
        ViewDayBinding viewDayBinding = this.binding;
        ViewDayBinding viewDayBinding2 = null;
        if (viewDayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewDayBinding = null;
        }
        viewDayBinding.dayTitle.setText(r22);
        ViewDayBinding viewDayBinding3 = this.binding;
        if (viewDayBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewDayBinding2 = viewDayBinding3;
        }
        viewDayBinding2.buttonOnclick.setContentDescription(accessibilityData);
        paintStatus();
    }

    public final void paintStatus() {
        ViewDayBinding viewDayBinding = this.binding;
        ViewDayBinding viewDayBinding2 = null;
        if (viewDayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewDayBinding = null;
        }
        viewDayBinding.dayTitle.getText().toString();
        if (this.active) {
            ViewDayBinding viewDayBinding3 = this.binding;
            if (viewDayBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewDayBinding3 = null;
            }
            viewDayBinding3.dayTitle.setTextColor(getContext().getColor(R.color.black));
            ViewDayBinding viewDayBinding4 = this.binding;
            if (viewDayBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewDayBinding4 = null;
            }
            viewDayBinding4.dayBackground.setBackground(D.h.getDrawable(getContext(), R.drawable.background_observation_yellow));
            Typeface a2 = q.a(getContext().getApplicationContext(), R.font.open_sans_bold);
            ViewDayBinding viewDayBinding5 = this.binding;
            if (viewDayBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                viewDayBinding2 = viewDayBinding5;
            }
            viewDayBinding2.dayTitle.setTypeface(a2);
            return;
        }
        ViewDayBinding viewDayBinding6 = this.binding;
        if (viewDayBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewDayBinding6 = null;
        }
        viewDayBinding6.dayTitle.setTextColor(getContext().getColor(R.color.white));
        ViewDayBinding viewDayBinding7 = this.binding;
        if (viewDayBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewDayBinding7 = null;
        }
        viewDayBinding7.dayBackground.setBackground(D.h.getDrawable(getContext(), R.drawable.shape_stroke_yellow));
        Typeface a4 = q.a(getContext().getApplicationContext(), R.font.open_sans_regular);
        ViewDayBinding viewDayBinding8 = this.binding;
        if (viewDayBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewDayBinding2 = viewDayBinding8;
        }
        viewDayBinding2.dayTitle.setTypeface(a4);
    }

    public final void setActive(boolean z3) {
        this.active = z3;
    }

    public final void setDisable(int status) {
        ViewDayBinding viewDayBinding = this.binding;
        if (viewDayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewDayBinding = null;
        }
        viewDayBinding.disableView.setVisibility(status);
    }

    public final void setOnClickListener(Function0<Unit> r12) {
        this.listenerOnClick = r12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.enable = true;
        initView(context, attributeSet);
    }

    public /* synthetic */ DayView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.enable = true;
        initView(context, attributeSet);
    }
}
