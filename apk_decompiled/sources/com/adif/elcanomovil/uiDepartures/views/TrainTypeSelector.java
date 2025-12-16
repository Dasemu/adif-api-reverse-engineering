package com.adif.elcanomovil.uiDepartures.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.uiDepartures.R;
import com.adif.elcanomovil.uiDepartures.databinding.ViewRadiogroupTraintypeBinding;
import com.adif.elcanomovil.uiDepartures.views.TrainTypeSelector;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001a\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0002J \u0010\u001a\u001a\u00020\u00102\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0002`\u0011J/\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\r¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0013H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0002`\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/views/TrainTypeSelector;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/adif/elcanomovil/uiDepartures/databinding/ViewRadiogroupTraintypeBinding;", "isCercanias", "Lcom/adif/elcanomovil/domain/entities/TrainType;", "isRodalies", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "Lcom/adif/elcanomovil/uiDepartures/views/OnTypeSelectionListener;", "trafficAvailable", "Lcom/adif/elcanomovil/uiDepartures/views/TrafficAvailability;", "configureListeners", "configureView", "attributes", "Landroid/content/res/TypedArray;", "initView", "attrs", "setOnTypeSelectionListener", "update", "trainType", "hasBothTraffic", "showCorporate", "(Lcom/adif/elcanomovil/domain/entities/TrainType;Ljava/lang/Boolean;Lcom/adif/elcanomovil/uiDepartures/views/TrafficAvailability;Z)V", "updateSelection", "trafficAvailability", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrainTypeSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainTypeSelector.kt\ncom/adif/elcanomovil/uiDepartures/views/TrainTypeSelector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
/* loaded from: classes2.dex */
public final class TrainTypeSelector extends FrameLayout {
    private ViewRadiogroupTraintypeBinding binding;
    private TrainType isCercanias;
    private boolean isRodalies;
    private Function1<? super TrainType, Unit> listener;
    private TrafficAvailability trafficAvailable;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrainType.values().length];
            try {
                iArr[TrainType.CERCANIAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrainType.AVELDMD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrainType.CORPORATE_OTHERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainTypeSelector(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isCercanias = TrainType.CERCANIAS;
        this.trafficAvailable = TrafficAvailability.BOTH;
        initView(context, null);
    }

    private final void configureListeners() {
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding = this.binding;
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding2 = null;
        if (viewRadiogroupTraintypeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewRadiogroupTraintypeBinding = null;
        }
        final int i = 0;
        viewRadiogroupTraintypeBinding.cercanias.setOnClickListener(new View.OnClickListener(this) { // from class: F1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainTypeSelector f537b;

            {
                this.f537b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                TrainTypeSelector trainTypeSelector = this.f537b;
                switch (i4) {
                    case 0:
                        TrainTypeSelector.configureListeners$lambda$2(trainTypeSelector, view);
                        return;
                    case 1:
                        TrainTypeSelector.configureListeners$lambda$3(trainTypeSelector, view);
                        return;
                    default:
                        TrainTypeSelector.configureListeners$lambda$4(trainTypeSelector, view);
                        return;
                }
            }
        });
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding3 = this.binding;
        if (viewRadiogroupTraintypeBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewRadiogroupTraintypeBinding3 = null;
        }
        final int i4 = 1;
        viewRadiogroupTraintypeBinding3.trains.setOnClickListener(new View.OnClickListener(this) { // from class: F1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainTypeSelector f537b;

            {
                this.f537b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                TrainTypeSelector trainTypeSelector = this.f537b;
                switch (i42) {
                    case 0:
                        TrainTypeSelector.configureListeners$lambda$2(trainTypeSelector, view);
                        return;
                    case 1:
                        TrainTypeSelector.configureListeners$lambda$3(trainTypeSelector, view);
                        return;
                    default:
                        TrainTypeSelector.configureListeners$lambda$4(trainTypeSelector, view);
                        return;
                }
            }
        });
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding4 = this.binding;
        if (viewRadiogroupTraintypeBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewRadiogroupTraintypeBinding2 = viewRadiogroupTraintypeBinding4;
        }
        final int i5 = 2;
        viewRadiogroupTraintypeBinding2.others.setOnClickListener(new View.OnClickListener(this) { // from class: F1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainTypeSelector f537b;

            {
                this.f537b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i5;
                TrainTypeSelector trainTypeSelector = this.f537b;
                switch (i42) {
                    case 0:
                        TrainTypeSelector.configureListeners$lambda$2(trainTypeSelector, view);
                        return;
                    case 1:
                        TrainTypeSelector.configureListeners$lambda$3(trainTypeSelector, view);
                        return;
                    default:
                        TrainTypeSelector.configureListeners$lambda$4(trainTypeSelector, view);
                        return;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$2(TrainTypeSelector this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding = this$0.binding;
        if (viewRadiogroupTraintypeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewRadiogroupTraintypeBinding = null;
        }
        viewRadiogroupTraintypeBinding.cercanias.setChecked(true);
        this$0.isCercanias = TrainType.CERCANIAS;
        this$0.updateSelection(this$0.trafficAvailable);
        Function1<? super TrainType, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(this$0.isCercanias);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$3(TrainTypeSelector this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding = this$0.binding;
        if (viewRadiogroupTraintypeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewRadiogroupTraintypeBinding = null;
        }
        viewRadiogroupTraintypeBinding.trains.setChecked(true);
        this$0.isCercanias = TrainType.AVELDMD;
        this$0.updateSelection(this$0.trafficAvailable);
        Function1<? super TrainType, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(this$0.isCercanias);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$4(TrainTypeSelector this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding = this$0.binding;
        if (viewRadiogroupTraintypeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewRadiogroupTraintypeBinding = null;
        }
        viewRadiogroupTraintypeBinding.trains.setChecked(true);
        this$0.isCercanias = TrainType.CORPORATE_OTHERS;
        this$0.updateSelection(this$0.trafficAvailable);
        Function1<? super TrainType, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(this$0.isCercanias);
        }
    }

    private final void configureView(TypedArray attributes) {
        this.isCercanias = attributes.getBoolean(R.styleable.TrainTypeSelector_isCercanias, true) ? TrainType.CERCANIAS : TrainType.AVELDMD;
        updateSelection(this.trafficAvailable);
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

    public static /* synthetic */ void update$default(TrainTypeSelector trainTypeSelector, TrainType trainType, Boolean bool, TrafficAvailability trafficAvailability, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        trainTypeSelector.update(trainType, bool, trafficAvailability, z3);
    }

    private final void updateSelection(TrafficAvailability trafficAvailability) {
        this.trafficAvailable = trafficAvailability;
        int i = WhenMappings.$EnumSwitchMapping$0[this.isCercanias.ordinal()];
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding = null;
        if (i == 1) {
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
            RadioButton radioButton = viewRadiogroupTraintypeBinding4.others;
            Typeface typeface = Typeface.DEFAULT;
            radioButton.setTypeface(typeface);
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding5 = this.binding;
            if (viewRadiogroupTraintypeBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding5 = null;
            }
            viewRadiogroupTraintypeBinding5.trains.setTypeface(typeface);
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding6 = this.binding;
            if (viewRadiogroupTraintypeBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding6 = null;
            }
            viewRadiogroupTraintypeBinding6.cercanias.setTypeface(Typeface.DEFAULT_BOLD);
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding7 = this.binding;
            if (viewRadiogroupTraintypeBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding7 = null;
            }
            viewRadiogroupTraintypeBinding7.trains.setEnabled(trafficAvailability.hasAVELDMD());
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding8 = this.binding;
            if (viewRadiogroupTraintypeBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding8 = null;
            }
            viewRadiogroupTraintypeBinding8.cercanias.setEnabled(true);
        } else if (i == 2) {
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding9 = this.binding;
            if (viewRadiogroupTraintypeBinding9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding9 = null;
            }
            RadioGroup radioGroup2 = viewRadiogroupTraintypeBinding9.group;
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding10 = this.binding;
            if (viewRadiogroupTraintypeBinding10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding10 = null;
            }
            radioGroup2.check(viewRadiogroupTraintypeBinding10.trains.getId());
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding11 = this.binding;
            if (viewRadiogroupTraintypeBinding11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding11 = null;
            }
            RadioButton radioButton2 = viewRadiogroupTraintypeBinding11.others;
            Typeface typeface2 = Typeface.DEFAULT;
            radioButton2.setTypeface(typeface2);
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding12 = this.binding;
            if (viewRadiogroupTraintypeBinding12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding12 = null;
            }
            viewRadiogroupTraintypeBinding12.trains.setTypeface(Typeface.DEFAULT_BOLD);
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding13 = this.binding;
            if (viewRadiogroupTraintypeBinding13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding13 = null;
            }
            viewRadiogroupTraintypeBinding13.cercanias.setTypeface(typeface2);
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding14 = this.binding;
            if (viewRadiogroupTraintypeBinding14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding14 = null;
            }
            viewRadiogroupTraintypeBinding14.trains.setEnabled(true);
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding15 = this.binding;
            if (viewRadiogroupTraintypeBinding15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding15 = null;
            }
            viewRadiogroupTraintypeBinding15.cercanias.setEnabled(trafficAvailability.hasCercanias());
        } else if (i == 3) {
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding16 = this.binding;
            if (viewRadiogroupTraintypeBinding16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding16 = null;
            }
            RadioGroup radioGroup3 = viewRadiogroupTraintypeBinding16.group;
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding17 = this.binding;
            if (viewRadiogroupTraintypeBinding17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding17 = null;
            }
            radioGroup3.check(viewRadiogroupTraintypeBinding17.others.getId());
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding18 = this.binding;
            if (viewRadiogroupTraintypeBinding18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding18 = null;
            }
            viewRadiogroupTraintypeBinding18.others.setTypeface(Typeface.DEFAULT_BOLD);
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding19 = this.binding;
            if (viewRadiogroupTraintypeBinding19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding19 = null;
            }
            RadioButton radioButton3 = viewRadiogroupTraintypeBinding19.trains;
            Typeface typeface3 = Typeface.DEFAULT;
            radioButton3.setTypeface(typeface3);
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding20 = this.binding;
            if (viewRadiogroupTraintypeBinding20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding20 = null;
            }
            viewRadiogroupTraintypeBinding20.cercanias.setTypeface(typeface3);
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding21 = this.binding;
            if (viewRadiogroupTraintypeBinding21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding21 = null;
            }
            viewRadiogroupTraintypeBinding21.trains.setEnabled(trafficAvailability.hasAVELDMD());
            ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding22 = this.binding;
            if (viewRadiogroupTraintypeBinding22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewRadiogroupTraintypeBinding22 = null;
            }
            viewRadiogroupTraintypeBinding22.cercanias.setEnabled(trafficAvailability.hasCercanias());
        }
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding23 = this.binding;
        if (viewRadiogroupTraintypeBinding23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewRadiogroupTraintypeBinding = viewRadiogroupTraintypeBinding23;
        }
        viewRadiogroupTraintypeBinding.cercanias.setText(this.isRodalies ? R.string.circulation_traintype_rodalies : R.string.circulation_traintype_cercanias);
    }

    public final void setOnTypeSelectionListener(Function1<? super TrainType, Unit> listener) {
        this.listener = listener;
    }

    public final void update(TrainType trainType, Boolean isRodalies, TrafficAvailability hasBothTraffic, boolean showCorporate) {
        Intrinsics.checkNotNullParameter(trainType, "trainType");
        Intrinsics.checkNotNullParameter(hasBothTraffic, "hasBothTraffic");
        if (isRodalies != null) {
            this.isRodalies = isRodalies.booleanValue();
        }
        this.isCercanias = trainType;
        updateSelection(hasBothTraffic);
        ViewRadiogroupTraintypeBinding viewRadiogroupTraintypeBinding = this.binding;
        if (viewRadiogroupTraintypeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewRadiogroupTraintypeBinding = null;
        }
        viewRadiogroupTraintypeBinding.others.setVisibility(showCorporate ? 0 : 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainTypeSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isCercanias = TrainType.CERCANIAS;
        this.trafficAvailable = TrafficAvailability.BOTH;
        initView(context, attributeSet);
    }

    public /* synthetic */ TrainTypeSelector(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
