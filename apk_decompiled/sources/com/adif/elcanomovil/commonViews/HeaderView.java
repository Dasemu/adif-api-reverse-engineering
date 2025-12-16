package com.adif.elcanomovil.commonViews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.data.InfoHeaderData;
import com.adif.elcanomovil.commonViews.databinding.ViewHeaderBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J \u0010\u0015\u001a\u00020\u00112\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0002`\u0012J \u0010\u0017\u001a\u00020\u00112\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0002`\u0012J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0004\u0018\u0001`\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0004\u0018\u0001`\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/adif/elcanomovil/commonViews/HeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attrs", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/adif/elcanomovil/commonViews/databinding/ViewHeaderBinding;", "listenerClose", "Lkotlin/Function1;", "Lcom/adif/elcanomovil/commonViews/ButtonsEvents;", "", "Lcom/adif/elcanomovil/commonViews/HeaderListener;", "listenerOnback", "initView", "setOnBackActionListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCloseActionListener", "updateHeaderInfo", "info", "Lcom/adif/elcanomovil/commonViews/data/InfoHeaderData;", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeaderView extends ConstraintLayout {
    private ViewHeaderBinding binding;
    private Function1<? super ButtonsEvents, Unit> listenerClose;
    private Function1<? super ButtonsEvents, Unit> listenerOnback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, null);
    }

    private final void initView(Context context, AttributeSet attrs) {
        View.inflate(context, R.layout.view_header, this);
        ViewHeaderBinding bind = ViewHeaderBinding.bind(this);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        ViewHeaderBinding viewHeaderBinding = null;
        if (bind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bind = null;
        }
        final int i = 0;
        bind.buttonOnback.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.commonViews.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HeaderView f4447b;

            {
                this.f4447b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                HeaderView headerView = this.f4447b;
                switch (i4) {
                    case 0:
                        HeaderView.initView$lambda$1(headerView, view);
                        return;
                    default:
                        HeaderView.initView$lambda$3(headerView, view);
                        return;
                }
            }
        });
        ViewHeaderBinding viewHeaderBinding2 = this.binding;
        if (viewHeaderBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewHeaderBinding = viewHeaderBinding2;
        }
        final int i4 = 1;
        viewHeaderBinding.buttonClose.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.commonViews.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HeaderView f4447b;

            {
                this.f4447b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                HeaderView headerView = this.f4447b;
                switch (i42) {
                    case 0:
                        HeaderView.initView$lambda$1(headerView, view);
                        return;
                    default:
                        HeaderView.initView$lambda$3(headerView, view);
                        return;
                }
            }
        });
        context.getTheme().obtainStyledAttributes(attrs, R.styleable.HeaderView, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(HeaderView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super ButtonsEvents, Unit> function1 = this$0.listenerOnback;
        if (function1 != null) {
            function1.invoke(ButtonsEvents.EVENT_TYPE_ONBACK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(HeaderView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super ButtonsEvents, Unit> function1 = this$0.listenerClose;
        if (function1 != null) {
            function1.invoke(ButtonsEvents.EVENT_TYPE_CLOSE);
        }
    }

    public final void setOnBackActionListener(Function1<? super ButtonsEvents, Unit> listener) {
        this.listenerOnback = listener;
    }

    public final void setOnCloseActionListener(Function1<? super ButtonsEvents, Unit> listener) {
        this.listenerClose = listener;
    }

    public final void updateHeaderInfo(InfoHeaderData info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ViewHeaderBinding viewHeaderBinding = this.binding;
        ViewHeaderBinding viewHeaderBinding2 = null;
        if (viewHeaderBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewHeaderBinding = null;
        }
        viewHeaderBinding.headerTitle.setText(info.getTitle());
        Integer imageLeft = info.getImageLeft();
        if (imageLeft != null) {
            int intValue = imageLeft.intValue();
            ViewHeaderBinding viewHeaderBinding3 = this.binding;
            if (viewHeaderBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewHeaderBinding3 = null;
            }
            viewHeaderBinding3.onBackIcon.setVisibility(0);
            ViewHeaderBinding viewHeaderBinding4 = this.binding;
            if (viewHeaderBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewHeaderBinding4 = null;
            }
            viewHeaderBinding4.buttonOnback.setEnabled(true);
            ViewHeaderBinding viewHeaderBinding5 = this.binding;
            if (viewHeaderBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewHeaderBinding5 = null;
            }
            viewHeaderBinding5.buttonOnback.setBackgroundColor(getContext().getColor(R.color.transparent));
            ViewHeaderBinding viewHeaderBinding6 = this.binding;
            if (viewHeaderBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewHeaderBinding6 = null;
            }
            viewHeaderBinding6.onBackIcon.setImageDrawable(getContext().getDrawable(intValue));
        }
        Integer imageRight = info.getImageRight();
        if (imageRight != null) {
            int intValue2 = imageRight.intValue();
            ViewHeaderBinding viewHeaderBinding7 = this.binding;
            if (viewHeaderBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewHeaderBinding7 = null;
            }
            viewHeaderBinding7.onCloseIcon.setVisibility(0);
            ViewHeaderBinding viewHeaderBinding8 = this.binding;
            if (viewHeaderBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewHeaderBinding8 = null;
            }
            viewHeaderBinding8.buttonClose.setVisibility(0);
            ViewHeaderBinding viewHeaderBinding9 = this.binding;
            if (viewHeaderBinding9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewHeaderBinding9 = null;
            }
            viewHeaderBinding9.buttonClose.setEnabled(true);
            ViewHeaderBinding viewHeaderBinding10 = this.binding;
            if (viewHeaderBinding10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewHeaderBinding10 = null;
            }
            viewHeaderBinding10.buttonClose.setBackgroundColor(getContext().getColor(R.color.transparent));
            ViewHeaderBinding viewHeaderBinding11 = this.binding;
            if (viewHeaderBinding11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                viewHeaderBinding2 = viewHeaderBinding11;
            }
            viewHeaderBinding2.onCloseIcon.setImageDrawable(getContext().getDrawable(intValue2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }

    public /* synthetic */ HeaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }
}
