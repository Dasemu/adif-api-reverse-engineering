package com.adif.elcanomovil.commonViews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.data.StationOptionViewEntity;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.commonViews.databinding.ViewStationOptionBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001a\u0010!\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010J\u0017\u0010&\u001a\u00020\u00112\b\u0010'\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0002\u0010)J\u0012\u0010*\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u001c\u0010*\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u0012\u00101\u001a\u00020\u00112\b\u00102\u001a\u0004\u0018\u000100H\u0002J\u0012\u00103\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u000100H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R.\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0002`\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u00065"}, d2 = {"Lcom/adif/elcanomovil/commonViews/StationOptionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attrs", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/adif/elcanomovil/commonViews/databinding/ViewStationOptionBinding;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lcom/adif/elcanomovil/commonViews/data/StationOptionViewEntity;", "", "Lcom/adif/elcanomovil/commonViews/StationOptionListener;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "value", "stationOption", "setStationOption", "(Lcom/adif/elcanomovil/commonViews/data/StationOptionViewEntity;)V", "stationOptionSubtitle", "Landroid/widget/TextView;", "getStationOptionSubtitle", "()Landroid/widget/TextView;", "stationOptionTitle", "getStationOptionTitle", "initView", "setEnabled", "enabled", "", "updateData", "updateDistance", "distance", "", "(Ljava/lang/Float;)V", "updateIcon", "icon", "Landroid/graphics/drawable/Drawable;", "type", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;", "comercialTypeZone", "", "updateSubtitle", "subtitle", "updateTitle", "title", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStationOptionView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationOptionView.kt\ncom/adif/elcanomovil/commonViews/StationOptionView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,254:1\n1#2:255\n*E\n"})
/* loaded from: classes.dex */
public final class StationOptionView extends ConstraintLayout {
    private ViewStationOptionBinding binding;
    private Function1<? super StationOptionViewEntity, Unit> listener;
    private StationOptionViewEntity stationOption;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StationViewEntity.TypeComercialStation.values().length];
            try {
                iArr[StationViewEntity.TypeComercialStation.EXTERNAL_MANAGEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StationViewEntity.TypeComercialStation.NOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StationViewEntity.TypeComercialStation.OTHERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StationViewEntity.TypeComercialStation.TIENDAS_ESTACION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StationViewEntity.TypeComercialStation.VIALIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StationViewEntity.Type.values().length];
            try {
                iArr2[StationViewEntity.Type.WORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[StationViewEntity.Type.HOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[StationViewEntity.Type.DEPARTURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[StationViewEntity.Type.ARRIVALS.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[StationViewEntity.Type.INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[StationViewEntity.Type.COMMERCIAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[StationViewEntity.Type.FAVORITE.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[StationViewEntity.Type.NEAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StationOptionView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, null);
    }

    private final void initView(Context context, AttributeSet attrs) {
        ViewStationOptionBinding inflate = ViewStationOptionBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        ViewStationOptionBinding viewStationOptionBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        inflate.getRoot().setOnClickListener(new D1.a(this, 8));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.StationOptionView, 0, 0);
        try {
            updateTitle(obtainStyledAttributes.getString(R.styleable.StationOptionView_titleText));
            updateSubtitle(obtainStyledAttributes.getString(R.styleable.StationOptionView_subtitleText));
            updateIcon(obtainStyledAttributes.getDrawable(R.styleable.StationOptionView_iconDrawable));
            int color = obtainStyledAttributes.getColor(R.styleable.StationOptionView_titleTextColor, context.getColor(R.color.white));
            ViewStationOptionBinding viewStationOptionBinding2 = this.binding;
            if (viewStationOptionBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationOptionBinding2 = null;
            }
            viewStationOptionBinding2.stationOptionTitle.setTextColor(color);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.StationOptionView_titleTextSize, (int) context.getResources().getDimension(R.dimen.select_station_text_size));
            ViewStationOptionBinding viewStationOptionBinding3 = this.binding;
            if (viewStationOptionBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationOptionBinding3 = null;
            }
            viewStationOptionBinding3.stationOptionTitle.setTextSize(0, dimensionPixelSize);
            int color2 = obtainStyledAttributes.getColor(R.styleable.StationOptionView_subtitleTextColor, context.getColor(R.color.colorTextSecondaryGrey));
            ViewStationOptionBinding viewStationOptionBinding4 = this.binding;
            if (viewStationOptionBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationOptionBinding4 = null;
            }
            viewStationOptionBinding4.stationOptionSubtitle.setTextColor(color2);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.StationOptionView_subtitleTextSize, (int) context.getResources().getDimension(R.dimen.medium_text_size));
            ViewStationOptionBinding viewStationOptionBinding5 = this.binding;
            if (viewStationOptionBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                viewStationOptionBinding = viewStationOptionBinding5;
            }
            viewStationOptionBinding.stationOptionSubtitle.setTextSize(0, dimensionPixelSize2);
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static final void initView$lambda$0(StationOptionView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super StationOptionViewEntity, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(this$0.stationOption);
        }
    }

    private final void setStationOption(StationOptionViewEntity stationOptionViewEntity) {
        this.stationOption = stationOptionViewEntity;
        setEnabled(stationOptionViewEntity != null ? stationOptionViewEntity.isEnabled() : false);
        StationOptionViewEntity stationOptionViewEntity2 = this.stationOption;
        updateTitle(stationOptionViewEntity2 != null ? stationOptionViewEntity2.getTitle() : null);
        StationOptionViewEntity stationOptionViewEntity3 = this.stationOption;
        updateSubtitle(stationOptionViewEntity3 != null ? stationOptionViewEntity3.getSubtitle() : null);
        StationOptionViewEntity stationOptionViewEntity4 = this.stationOption;
        StationViewEntity.Type type = stationOptionViewEntity4 != null ? stationOptionViewEntity4.getType() : null;
        StationOptionViewEntity stationOptionViewEntity5 = this.stationOption;
        updateIcon(type, stationOptionViewEntity5 != null ? stationOptionViewEntity5.getCommercialZoneType() : null);
        StationOptionViewEntity stationOptionViewEntity6 = this.stationOption;
        updateDistance(stationOptionViewEntity6 != null ? stationOptionViewEntity6.getDistance() : null);
    }

    private final void updateDistance(Float distance) {
        int intValue;
        ViewStationOptionBinding viewStationOptionBinding = this.binding;
        if (viewStationOptionBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationOptionBinding = null;
        }
        TextView textView = viewStationOptionBinding.stationOptionDistance;
        if (distance != null) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getDefault(), null, new e(distance, textView, null), 2, null);
            Integer num = 0;
            intValue = num.intValue();
        } else {
            Integer num2 = 8;
            intValue = num2.intValue();
        }
        textView.setVisibility(intValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        if (r3 == null) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateIcon(com.adif.elcanomovil.commonViews.data.StationViewEntity.Type r3, java.lang.String r4) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.commonViews.StationOptionView.updateIcon(com.adif.elcanomovil.commonViews.data.StationViewEntity$Type, java.lang.String):void");
    }

    private final void updateSubtitle(String subtitle) {
        if (subtitle != null) {
            ViewStationOptionBinding viewStationOptionBinding = this.binding;
            if (viewStationOptionBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationOptionBinding = null;
            }
            TextView textView = viewStationOptionBinding.stationOptionSubtitle;
            textView.setText(subtitle);
            textView.setSelected(true);
        }
    }

    private final void updateTitle(String title) {
        if (title != null) {
            ViewStationOptionBinding viewStationOptionBinding = this.binding;
            if (viewStationOptionBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewStationOptionBinding = null;
            }
            viewStationOptionBinding.stationOptionTitle.setText(title);
        }
    }

    public final Function1<StationOptionViewEntity, Unit> getListener() {
        return this.listener;
    }

    public final TextView getStationOptionSubtitle() {
        ViewStationOptionBinding viewStationOptionBinding = this.binding;
        if (viewStationOptionBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationOptionBinding = null;
        }
        TextView stationOptionSubtitle = viewStationOptionBinding.stationOptionSubtitle;
        Intrinsics.checkNotNullExpressionValue(stationOptionSubtitle, "stationOptionSubtitle");
        return stationOptionSubtitle;
    }

    public final TextView getStationOptionTitle() {
        ViewStationOptionBinding viewStationOptionBinding = this.binding;
        if (viewStationOptionBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationOptionBinding = null;
        }
        TextView stationOptionTitle = viewStationOptionBinding.stationOptionTitle;
        Intrinsics.checkNotNullExpressionValue(stationOptionTitle, "stationOptionTitle");
        return stationOptionTitle;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        ViewStationOptionBinding viewStationOptionBinding = this.binding;
        if (viewStationOptionBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationOptionBinding = null;
        }
        viewStationOptionBinding.stationOptionDisabledView.setVisibility(enabled ? 8 : 0);
    }

    public final void setListener(Function1<? super StationOptionViewEntity, Unit> function1) {
        this.listener = function1;
    }

    public final void updateData(StationOptionViewEntity stationOption) {
        setStationOption(stationOption);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StationOptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }

    public /* synthetic */ StationOptionView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StationOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }

    private final void updateIcon(Drawable icon) {
        int intValue;
        ViewStationOptionBinding viewStationOptionBinding = this.binding;
        ViewStationOptionBinding viewStationOptionBinding2 = null;
        if (viewStationOptionBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationOptionBinding = null;
        }
        ImageView imageView = viewStationOptionBinding.stationOptionIcon;
        if (icon != null) {
            ViewStationOptionBinding viewStationOptionBinding3 = this.binding;
            if (viewStationOptionBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                viewStationOptionBinding2 = viewStationOptionBinding3;
            }
            viewStationOptionBinding2.stationOptionIcon.setImageDrawable(icon);
            Integer num = 0;
            intValue = num.intValue();
        } else {
            Integer num2 = 8;
            intValue = num2.intValue();
        }
        imageView.setVisibility(intValue);
    }
}
