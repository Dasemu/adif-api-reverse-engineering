package com.adif.elcanomovil.uiDepartures.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.uiDepartures.R;
import com.adif.elcanomovil.uiDepartures.databinding.ViewCirculationStationBinding;
import com.adif.elcanomovil.uiDepartures.entities.ObservationAlert;
import com.adif.elcanomovil.uiDepartures.views.StationHeaderView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\"\u001a\u00020\u0019H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%H\u0002J\u000e\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0011J\u000e\u0010(\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0011J\u001a\u0010)\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010*\u001a\u00020\u0019H\u0014J\b\u0010+\u001a\u00020\u0019H\u0014J \u0010,\u001a\u00020\u00192\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017j\u0002`\u001aJ \u0010-\u001a\u00020\u00192\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017j\u0002`.JX\u0010/\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u00100\u001a\u0002012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\u0016\u00102\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u00100\u001a\u000201J\u001f\u00103\u001a\u00020\u00192\b\u00104\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u00105\u001a\u000206¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020\u00192\u0006\u00100\u001a\u000201H\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017j\u0002`\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/views/StationHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attrs", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/adif/elcanomovil/uiDepartures/databinding/ViewCirculationStationBinding;", "circulationType", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "hasObservation", "", "isCercanias", "Lcom/adif/elcanomovil/domain/entities/TrainType;", "isFavourite", "isRodalies", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lcom/adif/elcanomovil/uiDepartures/views/StationAction;", "", "Lcom/adif/elcanomovil/uiDepartures/views/OnStationActionListener;", "observationMessage", "", "observationTitle", "station", "stationLong", "stationTo", "stationToLong", "configureListeners", "configureView", "attributes", "Landroid/content/res/TypedArray;", "hideButtons", "hide", "hideSwith", "initView", "onDetachedFromWindow", "onFinishInflate", "setOnStationActionListener", "setOnTypeSelectionListener", "Lcom/adif/elcanomovil/uiDepartures/views/OnTypeSelectionListener;", "update", "hasBothTraffic", "Lcom/adif/elcanomovil/uiDepartures/views/TrafficAvailability;", "updateFavourite", "updateObservations", "observation", "warningType", "Lcom/adif/elcanomovil/uiDepartures/entities/ObservationAlert;", "(Ljava/lang/Boolean;Lcom/adif/elcanomovil/uiDepartures/entities/ObservationAlert;)V", "updateStation", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStationHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationHeaderView.kt\ncom/adif/elcanomovil/uiDepartures/views/StationHeaderView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,273:1\n256#2,2:274\n*S KotlinDebug\n*F\n+ 1 StationHeaderView.kt\ncom/adif/elcanomovil/uiDepartures/views/StationHeaderView\n*L\n225#1:274,2\n*E\n"})
/* loaded from: classes2.dex */
public final class StationHeaderView extends ConstraintLayout {
    private ViewCirculationStationBinding binding;
    private CirculationType circulationType;
    private boolean hasObservation;
    private TrainType isCercanias;
    private boolean isFavourite;
    private boolean isRodalies;
    private Function1<? super StationAction, Unit> listener;
    private String observationMessage;
    private String observationTitle;
    private String station;
    private String stationLong;
    private String stationTo;
    private String stationToLong;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CirculationType.values().length];
            try {
                iArr[CirculationType.DEPARTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CirculationType.ARRIVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CirculationType.BETWEEN_STATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ObservationAlert.values().length];
            try {
                iArr2[ObservationAlert.NOTHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ObservationAlert.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ObservationAlert.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StationHeaderView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isCercanias = TrainType.CERCANIAS;
        this.isRodalies = true;
        this.station = "";
        this.stationLong = "";
        this.observationTitle = "";
        this.observationMessage = "";
        this.circulationType = CirculationType.DEPARTURE;
        initView(context, null);
    }

    private final void configureListeners() {
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageButton imageButton;
        TextView textView2;
        TextView textView3;
        ImageView imageView4;
        ViewCirculationStationBinding viewCirculationStationBinding = this.binding;
        if (viewCirculationStationBinding != null && (imageView4 = viewCirculationStationBinding.favourite) != null) {
            final int i = 0;
            imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: F1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StationHeaderView f535b;

                {
                    this.f535b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i;
                    StationHeaderView stationHeaderView = this.f535b;
                    switch (i4) {
                        case 0:
                            StationHeaderView.configureListeners$lambda$7(stationHeaderView, view);
                            return;
                        case 1:
                            StationHeaderView.configureListeners$lambda$8(stationHeaderView, view);
                            return;
                        case 2:
                            StationHeaderView.configureListeners$lambda$9(stationHeaderView, view);
                            return;
                        case 3:
                            StationHeaderView.configureListeners$lambda$10(stationHeaderView, view);
                            return;
                        case 4:
                            StationHeaderView.configureListeners$lambda$11(stationHeaderView, view);
                            return;
                        case 5:
                            StationHeaderView.configureListeners$lambda$12(stationHeaderView, view);
                            return;
                        case 6:
                            StationHeaderView.configureListeners$lambda$13(stationHeaderView, view);
                            return;
                        default:
                            StationHeaderView.configureListeners$lambda$14(stationHeaderView, view);
                            return;
                    }
                }
            });
        }
        ViewCirculationStationBinding viewCirculationStationBinding2 = this.binding;
        if (viewCirculationStationBinding2 != null && (textView3 = viewCirculationStationBinding2.station) != null) {
            final int i4 = 1;
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: F1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StationHeaderView f535b;

                {
                    this.f535b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i4;
                    StationHeaderView stationHeaderView = this.f535b;
                    switch (i42) {
                        case 0:
                            StationHeaderView.configureListeners$lambda$7(stationHeaderView, view);
                            return;
                        case 1:
                            StationHeaderView.configureListeners$lambda$8(stationHeaderView, view);
                            return;
                        case 2:
                            StationHeaderView.configureListeners$lambda$9(stationHeaderView, view);
                            return;
                        case 3:
                            StationHeaderView.configureListeners$lambda$10(stationHeaderView, view);
                            return;
                        case 4:
                            StationHeaderView.configureListeners$lambda$11(stationHeaderView, view);
                            return;
                        case 5:
                            StationHeaderView.configureListeners$lambda$12(stationHeaderView, view);
                            return;
                        case 6:
                            StationHeaderView.configureListeners$lambda$13(stationHeaderView, view);
                            return;
                        default:
                            StationHeaderView.configureListeners$lambda$14(stationHeaderView, view);
                            return;
                    }
                }
            });
        }
        ViewCirculationStationBinding viewCirculationStationBinding3 = this.binding;
        if (viewCirculationStationBinding3 != null && (textView2 = viewCirculationStationBinding3.stationTo) != null) {
            final int i5 = 2;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: F1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StationHeaderView f535b;

                {
                    this.f535b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i5;
                    StationHeaderView stationHeaderView = this.f535b;
                    switch (i42) {
                        case 0:
                            StationHeaderView.configureListeners$lambda$7(stationHeaderView, view);
                            return;
                        case 1:
                            StationHeaderView.configureListeners$lambda$8(stationHeaderView, view);
                            return;
                        case 2:
                            StationHeaderView.configureListeners$lambda$9(stationHeaderView, view);
                            return;
                        case 3:
                            StationHeaderView.configureListeners$lambda$10(stationHeaderView, view);
                            return;
                        case 4:
                            StationHeaderView.configureListeners$lambda$11(stationHeaderView, view);
                            return;
                        case 5:
                            StationHeaderView.configureListeners$lambda$12(stationHeaderView, view);
                            return;
                        case 6:
                            StationHeaderView.configureListeners$lambda$13(stationHeaderView, view);
                            return;
                        default:
                            StationHeaderView.configureListeners$lambda$14(stationHeaderView, view);
                            return;
                    }
                }
            });
        }
        ViewCirculationStationBinding viewCirculationStationBinding4 = this.binding;
        if (viewCirculationStationBinding4 != null && (imageButton = viewCirculationStationBinding4.switchStations) != null) {
            final int i6 = 3;
            imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: F1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StationHeaderView f535b;

                {
                    this.f535b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i6;
                    StationHeaderView stationHeaderView = this.f535b;
                    switch (i42) {
                        case 0:
                            StationHeaderView.configureListeners$lambda$7(stationHeaderView, view);
                            return;
                        case 1:
                            StationHeaderView.configureListeners$lambda$8(stationHeaderView, view);
                            return;
                        case 2:
                            StationHeaderView.configureListeners$lambda$9(stationHeaderView, view);
                            return;
                        case 3:
                            StationHeaderView.configureListeners$lambda$10(stationHeaderView, view);
                            return;
                        case 4:
                            StationHeaderView.configureListeners$lambda$11(stationHeaderView, view);
                            return;
                        case 5:
                            StationHeaderView.configureListeners$lambda$12(stationHeaderView, view);
                            return;
                        case 6:
                            StationHeaderView.configureListeners$lambda$13(stationHeaderView, view);
                            return;
                        default:
                            StationHeaderView.configureListeners$lambda$14(stationHeaderView, view);
                            return;
                    }
                }
            });
        }
        ViewCirculationStationBinding viewCirculationStationBinding5 = this.binding;
        if (viewCirculationStationBinding5 != null && (imageView3 = viewCirculationStationBinding5.observations) != null) {
            final int i7 = 4;
            imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: F1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StationHeaderView f535b;

                {
                    this.f535b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i7;
                    StationHeaderView stationHeaderView = this.f535b;
                    switch (i42) {
                        case 0:
                            StationHeaderView.configureListeners$lambda$7(stationHeaderView, view);
                            return;
                        case 1:
                            StationHeaderView.configureListeners$lambda$8(stationHeaderView, view);
                            return;
                        case 2:
                            StationHeaderView.configureListeners$lambda$9(stationHeaderView, view);
                            return;
                        case 3:
                            StationHeaderView.configureListeners$lambda$10(stationHeaderView, view);
                            return;
                        case 4:
                            StationHeaderView.configureListeners$lambda$11(stationHeaderView, view);
                            return;
                        case 5:
                            StationHeaderView.configureListeners$lambda$12(stationHeaderView, view);
                            return;
                        case 6:
                            StationHeaderView.configureListeners$lambda$13(stationHeaderView, view);
                            return;
                        default:
                            StationHeaderView.configureListeners$lambda$14(stationHeaderView, view);
                            return;
                    }
                }
            });
        }
        ViewCirculationStationBinding viewCirculationStationBinding6 = this.binding;
        if (viewCirculationStationBinding6 != null && (imageView2 = viewCirculationStationBinding6.share) != null) {
            final int i8 = 5;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: F1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StationHeaderView f535b;

                {
                    this.f535b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i8;
                    StationHeaderView stationHeaderView = this.f535b;
                    switch (i42) {
                        case 0:
                            StationHeaderView.configureListeners$lambda$7(stationHeaderView, view);
                            return;
                        case 1:
                            StationHeaderView.configureListeners$lambda$8(stationHeaderView, view);
                            return;
                        case 2:
                            StationHeaderView.configureListeners$lambda$9(stationHeaderView, view);
                            return;
                        case 3:
                            StationHeaderView.configureListeners$lambda$10(stationHeaderView, view);
                            return;
                        case 4:
                            StationHeaderView.configureListeners$lambda$11(stationHeaderView, view);
                            return;
                        case 5:
                            StationHeaderView.configureListeners$lambda$12(stationHeaderView, view);
                            return;
                        case 6:
                            StationHeaderView.configureListeners$lambda$13(stationHeaderView, view);
                            return;
                        default:
                            StationHeaderView.configureListeners$lambda$14(stationHeaderView, view);
                            return;
                    }
                }
            });
        }
        ViewCirculationStationBinding viewCirculationStationBinding7 = this.binding;
        if (viewCirculationStationBinding7 != null && (imageView = viewCirculationStationBinding7.twitter) != null) {
            final int i9 = 6;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: F1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StationHeaderView f535b;

                {
                    this.f535b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i9;
                    StationHeaderView stationHeaderView = this.f535b;
                    switch (i42) {
                        case 0:
                            StationHeaderView.configureListeners$lambda$7(stationHeaderView, view);
                            return;
                        case 1:
                            StationHeaderView.configureListeners$lambda$8(stationHeaderView, view);
                            return;
                        case 2:
                            StationHeaderView.configureListeners$lambda$9(stationHeaderView, view);
                            return;
                        case 3:
                            StationHeaderView.configureListeners$lambda$10(stationHeaderView, view);
                            return;
                        case 4:
                            StationHeaderView.configureListeners$lambda$11(stationHeaderView, view);
                            return;
                        case 5:
                            StationHeaderView.configureListeners$lambda$12(stationHeaderView, view);
                            return;
                        case 6:
                            StationHeaderView.configureListeners$lambda$13(stationHeaderView, view);
                            return;
                        default:
                            StationHeaderView.configureListeners$lambda$14(stationHeaderView, view);
                            return;
                    }
                }
            });
        }
        ViewCirculationStationBinding viewCirculationStationBinding8 = this.binding;
        if (viewCirculationStationBinding8 == null || (textView = viewCirculationStationBinding8.filters) == null) {
            return;
        }
        final int i10 = 7;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: F1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StationHeaderView f535b;

            {
                this.f535b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i10;
                StationHeaderView stationHeaderView = this.f535b;
                switch (i42) {
                    case 0:
                        StationHeaderView.configureListeners$lambda$7(stationHeaderView, view);
                        return;
                    case 1:
                        StationHeaderView.configureListeners$lambda$8(stationHeaderView, view);
                        return;
                    case 2:
                        StationHeaderView.configureListeners$lambda$9(stationHeaderView, view);
                        return;
                    case 3:
                        StationHeaderView.configureListeners$lambda$10(stationHeaderView, view);
                        return;
                    case 4:
                        StationHeaderView.configureListeners$lambda$11(stationHeaderView, view);
                        return;
                    case 5:
                        StationHeaderView.configureListeners$lambda$12(stationHeaderView, view);
                        return;
                    case 6:
                        StationHeaderView.configureListeners$lambda$13(stationHeaderView, view);
                        return;
                    default:
                        StationHeaderView.configureListeners$lambda$14(stationHeaderView, view);
                        return;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$10(StationHeaderView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super StationAction, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(StationAction.SWITCH_STATIONS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$11(StationHeaderView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super StationAction, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(StationAction.SHOW_OBSERVATIONS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$12(StationHeaderView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super StationAction, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(StationAction.SHARE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$13(StationHeaderView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super StationAction, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(StationAction.SUBSCRIPTION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$14(StationHeaderView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super StationAction, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(StationAction.SHOW_FILTERS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$7(StationHeaderView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super StationAction, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(StationAction.FAV);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$8(StationHeaderView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super StationAction, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(StationAction.SEARCH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$9(StationHeaderView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super StationAction, Unit> function1 = this$0.listener;
        if (function1 != null) {
            function1.invoke(StationAction.SEARCH_TO);
        }
    }

    private final void configureView(TypedArray attributes) {
        ViewCirculationStationBinding viewCirculationStationBinding = this.binding;
        TextView textView = viewCirculationStationBinding != null ? viewCirculationStationBinding.filters : null;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.isCercanias = attributes.getBoolean(R.styleable.StationHeaderView_isCercanias, true) ? TrainType.CERCANIAS : TrainType.AVELDMD;
        this.hasObservation = attributes.getBoolean(R.styleable.StationHeaderView_observation, false);
        String string = attributes.getString(R.styleable.StationHeaderView_station);
        if (string == null) {
            string = "";
        }
        this.station = string;
        String string2 = attributes.getString(R.styleable.StationHeaderView_observationTitle);
        if (string2 == null) {
            string2 = "";
        }
        this.observationTitle = string2;
        String string3 = attributes.getString(R.styleable.StationHeaderView_observationMessage);
        this.observationMessage = string3 != null ? string3 : "";
    }

    private final void initView(Context context, AttributeSet attrs) {
        View.inflate(context, R.layout.view_circulation_station, this);
        this.binding = ViewCirculationStationBinding.bind(this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.OneWayCirculationHeaderView, 0, 0);
        Intrinsics.checkNotNull(obtainStyledAttributes);
        configureView(obtainStyledAttributes);
        configureListeners();
    }

    public static /* synthetic */ void updateObservations$default(StationHeaderView stationHeaderView, Boolean bool, ObservationAlert observationAlert, int i, Object obj) {
        if ((i & 2) != 0) {
            observationAlert = ObservationAlert.NOTHING;
        }
        stationHeaderView.updateObservations(bool, observationAlert);
    }

    private final void updateStation(TrafficAvailability hasBothTraffic) {
        ImageView imageView;
        ImageView imageView2;
        TrainTypeSelector trainTypeSelector;
        ConstraintLayout root;
        ViewCirculationStationBinding viewCirculationStationBinding = this.binding;
        TextView textView = viewCirculationStationBinding != null ? viewCirculationStationBinding.station : null;
        if (textView != null) {
            textView.setText(this.station);
        }
        ViewCirculationStationBinding viewCirculationStationBinding2 = this.binding;
        TextView textView2 = viewCirculationStationBinding2 != null ? viewCirculationStationBinding2.station : null;
        if (textView2 != null) {
            textView2.setContentDescription(this.stationLong);
        }
        ViewCirculationStationBinding viewCirculationStationBinding3 = this.binding;
        ImageView imageView3 = (viewCirculationStationBinding3 == null || (root = viewCirculationStationBinding3.getRoot()) == null) ? null : (ImageView) root.findViewWithTag("indicator");
        if (imageView3 != null) {
            imageView3.setVisibility(this.circulationType == CirculationType.BETWEEN_STATIONS ? 0 : 8);
        }
        if (WhenMappings.$EnumSwitchMapping$0[this.circulationType.ordinal()] == 3) {
            ViewCirculationStationBinding viewCirculationStationBinding4 = this.binding;
            TextView textView3 = viewCirculationStationBinding4 != null ? viewCirculationStationBinding4.circulationType : null;
            if (textView3 != null) {
                textView3.setText(getContext().getString(R.string.circulation_between_stations));
            }
            ViewCirculationStationBinding viewCirculationStationBinding5 = this.binding;
            TextView textView4 = viewCirculationStationBinding5 != null ? viewCirculationStationBinding5.stationTo : null;
            if (textView4 != null) {
                textView4.setText(this.stationTo);
            }
            ViewCirculationStationBinding viewCirculationStationBinding6 = this.binding;
            TextView textView5 = viewCirculationStationBinding6 != null ? viewCirculationStationBinding6.stationTo : null;
            if (textView5 != null) {
                textView5.setContentDescription(this.stationToLong);
            }
            ViewCirculationStationBinding viewCirculationStationBinding7 = this.binding;
            TextView textView6 = viewCirculationStationBinding7 != null ? viewCirculationStationBinding7.stationTo : null;
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
            ViewCirculationStationBinding viewCirculationStationBinding8 = this.binding;
            ImageView imageView4 = viewCirculationStationBinding8 != null ? viewCirculationStationBinding8.searchTo : null;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
            ViewCirculationStationBinding viewCirculationStationBinding9 = this.binding;
            ImageButton imageButton = viewCirculationStationBinding9 != null ? viewCirculationStationBinding9.switchStations : null;
            if (imageButton != null) {
                imageButton.setVisibility(0);
            }
            ViewCirculationStationBinding viewCirculationStationBinding10 = this.binding;
            ImageView imageView5 = viewCirculationStationBinding10 != null ? viewCirculationStationBinding10.directionArrow : null;
            if (imageView5 != null) {
                imageView5.setVisibility(0);
            }
            ViewCirculationStationBinding viewCirculationStationBinding11 = this.binding;
            TextView textView7 = viewCirculationStationBinding11 != null ? viewCirculationStationBinding11.stationTo : null;
            if (textView7 != null) {
                textView7.setVisibility(0);
            }
        } else {
            ViewCirculationStationBinding viewCirculationStationBinding12 = this.binding;
            TextView textView8 = viewCirculationStationBinding12 != null ? viewCirculationStationBinding12.circulationType : null;
            if (textView8 != null) {
                textView8.setText(this.circulationType == CirculationType.ARRIVAL ? getContext().getString(R.string.arrival_title) : getContext().getString(R.string.departures_title));
            }
            ViewCirculationStationBinding viewCirculationStationBinding13 = this.binding;
            TextView textView9 = viewCirculationStationBinding13 != null ? viewCirculationStationBinding13.stationTo : null;
            if (textView9 != null) {
                textView9.setVisibility(8);
            }
            ViewCirculationStationBinding viewCirculationStationBinding14 = this.binding;
            ImageView imageView6 = viewCirculationStationBinding14 != null ? viewCirculationStationBinding14.searchTo : null;
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
            ViewCirculationStationBinding viewCirculationStationBinding15 = this.binding;
            ImageButton imageButton2 = viewCirculationStationBinding15 != null ? viewCirculationStationBinding15.switchStations : null;
            if (imageButton2 != null) {
                imageButton2.setVisibility(8);
            }
            ViewCirculationStationBinding viewCirculationStationBinding16 = this.binding;
            ImageView imageView7 = viewCirculationStationBinding16 != null ? viewCirculationStationBinding16.directionArrow : null;
            if (imageView7 != null) {
                imageView7.setVisibility(8);
            }
            ViewCirculationStationBinding viewCirculationStationBinding17 = this.binding;
            TextView textView10 = viewCirculationStationBinding17 != null ? viewCirculationStationBinding17.stationTo : null;
            if (textView10 != null) {
                textView10.setVisibility(8);
            }
            ViewCirculationStationBinding viewCirculationStationBinding18 = this.binding;
            TextView textView11 = viewCirculationStationBinding18 != null ? viewCirculationStationBinding18.station : null;
            if (textView11 != null) {
                textView11.setHint((this.circulationType == CirculationType.DEPARTURE ? getContext().getString(R.string.content_description_origin_station) : getContext().getString(R.string.content_description_destination_station)).toString());
            }
        }
        ViewCirculationStationBinding viewCirculationStationBinding19 = this.binding;
        if (viewCirculationStationBinding19 != null && (trainTypeSelector = viewCirculationStationBinding19.trainSelector) != null) {
            trainTypeSelector.update(this.isCercanias, Boolean.valueOf(this.isRodalies), hasBothTraffic, false);
        }
        if (this.isFavourite) {
            ViewCirculationStationBinding viewCirculationStationBinding20 = this.binding;
            if (viewCirculationStationBinding20 != null && (imageView2 = viewCirculationStationBinding20.favourite) != null) {
                imageView2.setImageResource(R.drawable.ic_favourite_on);
            }
            ViewCirculationStationBinding viewCirculationStationBinding21 = this.binding;
            ImageView imageView8 = viewCirculationStationBinding21 != null ? viewCirculationStationBinding21.favourite : null;
            if (imageView8 == null) {
                return;
            }
            Context context = getContext();
            imageView8.setContentDescription(context != null ? context.getString(R.string.content_description_icon_favorite_remove) : null);
            return;
        }
        ViewCirculationStationBinding viewCirculationStationBinding22 = this.binding;
        if (viewCirculationStationBinding22 != null && (imageView = viewCirculationStationBinding22.favourite) != null) {
            imageView.setImageResource(R.drawable.ic_favourite_off);
        }
        ViewCirculationStationBinding viewCirculationStationBinding23 = this.binding;
        ImageView imageView9 = viewCirculationStationBinding23 != null ? viewCirculationStationBinding23.favourite : null;
        if (imageView9 == null) {
            return;
        }
        Context context2 = getContext();
        imageView9.setContentDescription(context2 != null ? context2.getString(R.string.content_description_icon_favorite) : null);
    }

    public final void hideButtons(boolean hide) {
        int i = hide ? 8 : 0;
        ViewCirculationStationBinding viewCirculationStationBinding = this.binding;
        ImageView imageView = viewCirculationStationBinding != null ? viewCirculationStationBinding.observations : null;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        ViewCirculationStationBinding viewCirculationStationBinding2 = this.binding;
        ImageView imageView2 = viewCirculationStationBinding2 != null ? viewCirculationStationBinding2.share : null;
        if (imageView2 != null) {
            imageView2.setVisibility(i);
        }
        ViewCirculationStationBinding viewCirculationStationBinding3 = this.binding;
        ImageView imageView3 = viewCirculationStationBinding3 != null ? viewCirculationStationBinding3.twitter : null;
        if (imageView3 != null) {
            imageView3.setVisibility(i);
        }
        ViewCirculationStationBinding viewCirculationStationBinding4 = this.binding;
        ImageView imageView4 = viewCirculationStationBinding4 != null ? viewCirculationStationBinding4.favourite : null;
        if (imageView4 == null) {
            return;
        }
        imageView4.setVisibility(i);
    }

    public final void hideSwith(boolean hide) {
        int i = hide ? 8 : 0;
        ViewCirculationStationBinding viewCirculationStationBinding = this.binding;
        ImageButton imageButton = viewCirculationStationBinding != null ? viewCirculationStationBinding.switchStations : null;
        if (imageButton == null) {
            return;
        }
        imageButton.setVisibility(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public final void setOnStationActionListener(Function1<? super StationAction, Unit> listener) {
        this.listener = listener;
    }

    public final void setOnTypeSelectionListener(Function1<? super TrainType, Unit> listener) {
        TrainTypeSelector trainTypeSelector;
        ViewCirculationStationBinding viewCirculationStationBinding = this.binding;
        if (viewCirculationStationBinding == null || (trainTypeSelector = viewCirculationStationBinding.trainSelector) == null) {
            return;
        }
        trainTypeSelector.setOnTypeSelectionListener(listener);
    }

    public final void update(TrainType isCercanias, boolean isRodalies, TrafficAvailability hasBothTraffic, String station, String stationLong, boolean isFavourite, String stationTo, String stationToLong, CirculationType circulationType) {
        Unit unit;
        ImageView imageView;
        Unit unit2;
        String string;
        ConstraintLayout root;
        TextView textView;
        TextView textView2;
        ImageView imageView2;
        TextView textView3;
        TextView textView4;
        Intrinsics.checkNotNullParameter(isCercanias, "isCercanias");
        Intrinsics.checkNotNullParameter(hasBothTraffic, "hasBothTraffic");
        Intrinsics.checkNotNullParameter(circulationType, "circulationType");
        this.isCercanias = isCercanias;
        this.isRodalies = isRodalies;
        TextView textView5 = null;
        if (station != null) {
            ViewCirculationStationBinding viewCirculationStationBinding = this.binding;
            if (viewCirculationStationBinding != null && (textView4 = viewCirculationStationBinding.station) != null) {
                textView4.setTextColor(getContext().getColor(R.color.white));
            }
            this.station = station;
            if (stationLong != null) {
                station = stationLong;
            }
            this.stationLong = station;
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ViewCirculationStationBinding viewCirculationStationBinding2 = this.binding;
            if (viewCirculationStationBinding2 != null && (textView3 = viewCirculationStationBinding2.station) != null) {
                textView3.setTextColor(getContext().getColor(R.color.colorTextSecondaryGrey));
            }
            String string2 = getContext().getString(R.string.select_station);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this.station = string2;
        }
        this.isFavourite = isFavourite;
        this.observationTitle = "";
        this.observationMessage = "";
        if (isFavourite) {
            ViewCirculationStationBinding viewCirculationStationBinding3 = this.binding;
            if (viewCirculationStationBinding3 != null && (imageView2 = viewCirculationStationBinding3.favourite) != null) {
                imageView2.setImageResource(R.drawable.ic_favourite_on);
            }
            ViewCirculationStationBinding viewCirculationStationBinding4 = this.binding;
            ImageView imageView3 = viewCirculationStationBinding4 != null ? viewCirculationStationBinding4.favourite : null;
            if (imageView3 != null) {
                Context context = getContext();
                imageView3.setContentDescription(context != null ? context.getString(R.string.content_description_icon_favorite_remove) : null);
            }
        } else {
            ViewCirculationStationBinding viewCirculationStationBinding5 = this.binding;
            if (viewCirculationStationBinding5 != null && (imageView = viewCirculationStationBinding5.favourite) != null) {
                imageView.setImageResource(R.drawable.ic_favourite_off);
            }
            ViewCirculationStationBinding viewCirculationStationBinding6 = this.binding;
            ImageView imageView4 = viewCirculationStationBinding6 != null ? viewCirculationStationBinding6.favourite : null;
            if (imageView4 != null) {
                Context context2 = getContext();
                imageView4.setContentDescription(context2 != null ? context2.getString(R.string.content_description_icon_favorite) : null);
            }
        }
        if (stationTo != null) {
            ViewCirculationStationBinding viewCirculationStationBinding7 = this.binding;
            if (viewCirculationStationBinding7 != null && (textView2 = viewCirculationStationBinding7.stationTo) != null) {
                textView2.setTextColor(getContext().getColor(R.color.white));
            }
            this.stationTo = stationTo;
            if (stationToLong != null) {
                stationTo = stationToLong;
            }
            this.stationToLong = stationTo;
            unit2 = Unit.INSTANCE;
        } else {
            unit2 = null;
        }
        if (unit2 == null) {
            ViewCirculationStationBinding viewCirculationStationBinding8 = this.binding;
            if (viewCirculationStationBinding8 != null && (textView = viewCirculationStationBinding8.stationTo) != null) {
                textView.setTextColor(getContext().getColor(R.color.colorTextSecondaryGrey));
            }
            this.stationTo = getContext().getString(R.string.select_station);
        }
        this.circulationType = circulationType;
        ViewCirculationStationBinding viewCirculationStationBinding9 = this.binding;
        if (viewCirculationStationBinding9 != null && (root = viewCirculationStationBinding9.getRoot()) != null) {
            textView5 = (TextView) root.findViewWithTag("circulationType");
        }
        if (textView5 != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[circulationType.ordinal()];
            if (i == 1) {
                string = getContext().getString(R.string.departures_title);
            } else if (i == 2) {
                string = getContext().getString(R.string.arrival_title);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                string = getContext().getString(R.string.circulation_between_stations);
            }
            textView5.setText(string);
        }
        updateStation(hasBothTraffic);
    }

    public final void updateFavourite(boolean isFavourite, TrafficAvailability hasBothTraffic) {
        Intrinsics.checkNotNullParameter(hasBothTraffic, "hasBothTraffic");
        this.isFavourite = isFavourite;
        updateStation(hasBothTraffic);
    }

    public final void updateObservations(Boolean observation, ObservationAlert warningType) {
        ImageView imageView;
        ViewCirculationStationBinding viewCirculationStationBinding;
        ImageView imageView2;
        Intrinsics.checkNotNullParameter(warningType, "warningType");
        this.hasObservation = observation != null;
        int i = WhenMappings.$EnumSwitchMapping$1[warningType.ordinal()];
        if (i == 1) {
            ViewCirculationStationBinding viewCirculationStationBinding2 = this.binding;
            ImageView imageView3 = viewCirculationStationBinding2 != null ? viewCirculationStationBinding2.observations : null;
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(4);
            return;
        }
        if (i != 2) {
            if (i != 3 || (viewCirculationStationBinding = this.binding) == null || (imageView2 = viewCirculationStationBinding.observations) == null) {
                return;
            }
            imageView2.setVisibility(0);
            imageView2.setImageTintList(ColorStateList.valueOf(imageView2.getContext().getColor(R.color.colorPrimary)));
            return;
        }
        ViewCirculationStationBinding viewCirculationStationBinding3 = this.binding;
        if (viewCirculationStationBinding3 == null || (imageView = viewCirculationStationBinding3.observations) == null) {
            return;
        }
        imageView.setVisibility(0);
        imageView.setImageTintList(ColorStateList.valueOf(imageView.getContext().getColor(R.color.white)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StationHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isCercanias = TrainType.CERCANIAS;
        this.isRodalies = true;
        this.station = "";
        this.stationLong = "";
        this.observationTitle = "";
        this.observationMessage = "";
        this.circulationType = CirculationType.DEPARTURE;
        initView(context, attributeSet);
    }

    public /* synthetic */ StationHeaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StationHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isCercanias = TrainType.CERCANIAS;
        this.isRodalies = true;
        this.station = "";
        this.stationLong = "";
        this.observationTitle = "";
        this.observationMessage = "";
        this.circulationType = CirculationType.DEPARTURE;
        initView(context, attributeSet);
    }
}
