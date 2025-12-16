package com.adif.elcanomovil.uiDepartures.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.uiDepartures.R;
import com.adif.elcanomovil.uiDepartures.databinding.ViewCirculationHeaderBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\u001e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/views/OneWayCirculationHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attrs", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/adif/elcanomovil/uiDepartures/databinding/ViewCirculationHeaderBinding;", "circulationType", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "isCercanias", "Lcom/adif/elcanomovil/domain/entities/TrainType;", "isDepartures", "", "configureHeader", "", "attributes", "Landroid/content/res/TypedArray;", "initView", "update", "updateHeader", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OneWayCirculationHeaderView extends ConstraintLayout {
    private ViewCirculationHeaderBinding binding;
    private CirculationType circulationType;
    private TrainType isCercanias;
    private boolean isDepartures;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneWayCirculationHeaderView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isCercanias = TrainType.CERCANIAS;
        this.isDepartures = true;
        initView(context, null);
    }

    private final void configureHeader(TypedArray attributes) {
        this.isCercanias = attributes.getBoolean(R.styleable.OneWayCirculationHeaderView_isCercanias, true) ? TrainType.CERCANIAS : TrainType.AVELDMD;
        this.isDepartures = attributes.getBoolean(R.styleable.OneWayCirculationHeaderView_isDepartures, true);
        updateHeader(null);
    }

    private final void initView(Context context, AttributeSet attrs) {
        View.inflate(context, R.layout.view_circulation_header, this);
        ViewCirculationHeaderBinding bind = ViewCirculationHeaderBinding.bind(this);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.OneWayCirculationHeaderView, 0, 0);
        Intrinsics.checkNotNull(obtainStyledAttributes);
        configureHeader(obtainStyledAttributes);
    }

    private final void updateHeader(CirculationType circulationType) {
        ViewCirculationHeaderBinding viewCirculationHeaderBinding = this.binding;
        ViewCirculationHeaderBinding viewCirculationHeaderBinding2 = null;
        if (viewCirculationHeaderBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewCirculationHeaderBinding = null;
        }
        viewCirculationHeaderBinding.type.setText(this.isCercanias == TrainType.CERCANIAS ? getContext().getString(R.string.circulation_header_line) : getContext().getString(R.string.circulation_header_train));
        CirculationType circulationType2 = CirculationType.BETWEEN_STATIONS;
        if (circulationType == circulationType2) {
            ViewCirculationHeaderBinding viewCirculationHeaderBinding3 = this.binding;
            if (viewCirculationHeaderBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewCirculationHeaderBinding3 = null;
            }
            viewCirculationHeaderBinding3.time.setText(getContext().getString(R.string.circulation_header_departure_arrival));
        } else {
            ViewCirculationHeaderBinding viewCirculationHeaderBinding4 = this.binding;
            if (viewCirculationHeaderBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewCirculationHeaderBinding4 = null;
            }
            viewCirculationHeaderBinding4.time.setText(getContext().getString(R.string.circulation_header_time));
        }
        if (this.isDepartures || circulationType == circulationType2) {
            ViewCirculationHeaderBinding viewCirculationHeaderBinding5 = this.binding;
            if (viewCirculationHeaderBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                viewCirculationHeaderBinding5 = null;
            }
            viewCirculationHeaderBinding5.station.setTextColor(getContext().getColor(R.color.yellow));
            ViewCirculationHeaderBinding viewCirculationHeaderBinding6 = this.binding;
            if (viewCirculationHeaderBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                viewCirculationHeaderBinding2 = viewCirculationHeaderBinding6;
            }
            viewCirculationHeaderBinding2.station.setText(getContext().getString(R.string.circulation_header_destination));
            return;
        }
        ViewCirculationHeaderBinding viewCirculationHeaderBinding7 = this.binding;
        if (viewCirculationHeaderBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewCirculationHeaderBinding7 = null;
        }
        viewCirculationHeaderBinding7.station.setTextColor(getContext().getColor(R.color.white));
        ViewCirculationHeaderBinding viewCirculationHeaderBinding8 = this.binding;
        if (viewCirculationHeaderBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewCirculationHeaderBinding2 = viewCirculationHeaderBinding8;
        }
        viewCirculationHeaderBinding2.station.setText(getContext().getString(R.string.circulation_header_origin));
    }

    public final void update(TrainType isCercanias, boolean isDepartures, CirculationType circulationType) {
        Intrinsics.checkNotNullParameter(isCercanias, "isCercanias");
        Intrinsics.checkNotNullParameter(circulationType, "circulationType");
        this.isCercanias = isCercanias;
        this.isDepartures = isDepartures;
        this.circulationType = circulationType;
        updateHeader(circulationType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneWayCirculationHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isCercanias = TrainType.CERCANIAS;
        this.isDepartures = true;
        initView(context, attributeSet);
    }

    public /* synthetic */ OneWayCirculationHeaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneWayCirculationHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isCercanias = TrainType.CERCANIAS;
        this.isDepartures = true;
        initView(context, attributeSet);
    }
}
