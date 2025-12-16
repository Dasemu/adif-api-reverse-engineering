package com.adif.elcanomovil.uiDepartures.adapters;

import I0.p;
import S0.i;
import a.AbstractC0105a;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.circulation.OtherCirculation;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculation;
import com.adif.elcanomovil.uiDepartures.R;
import com.adif.elcanomovil.uiDepartures.databinding.ItemCirculationTrainsBinding;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJI\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/adapters/OtherCirculationViewHolder;", "Landroidx/recyclerview/widget/I0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Landroid/content/Context;", "context", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "circulationType", "Lcom/adif/elcanomovil/domain/entities/circulation/OtherCirculation;", "item", "", "setTheme", "(Landroid/content/Context;Lcom/adif/elcanomovil/domain/entities/CirculationType;Lcom/adif/elcanomovil/domain/entities/circulation/OtherCirculation;)V", "Lkotlin/Function1;", "", "onObservationTapped", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculation;", "onTrainTapped", "bind", "(Lcom/adif/elcanomovil/domain/entities/circulation/OtherCirculation;Lcom/adif/elcanomovil/domain/entities/CirculationType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/adif/elcanomovil/uiDepartures/databinding/ItemCirculationTrainsBinding;", "itemBinding", "Lcom/adif/elcanomovil/uiDepartures/databinding/ItemCirculationTrainsBinding;", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOtherCirculationViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtherCirculationViewHolder.kt\ncom/adif/elcanomovil/uiDepartures/adapters/OtherCirculationViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 5 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,219:1\n1#2:220\n256#3,2:221\n256#3,2:223\n256#3,2:225\n256#3,2:227\n256#3,2:229\n256#3,2:241\n845#4,9:231\n24#5:240\n*S KotlinDebug\n*F\n+ 1 OtherCirculationViewHolder.kt\ncom/adif/elcanomovil/uiDepartures/adapters/OtherCirculationViewHolder\n*L\n96#1:221,2\n97#1:223,2\n99#1:225,2\n103#1:227,2\n133#1:229,2\n172#1:241,2\n144#1:231,9\n158#1:240\n*E\n"})
/* loaded from: classes2.dex */
public final class OtherCirculationViewHolder extends I0 {
    private final ItemCirculationTrainsBinding itemBinding;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CirculationType.values().length];
            try {
                iArr[CirculationType.ARRIVAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CirculationType.DEPARTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OtherCirculation.State.values().length];
            try {
                iArr2[OtherCirculation.State.SUPPRESSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OtherCirculation.State.BOARDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OtherCirculation.State.DELAYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtherCirculationViewHolder(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ItemCirculationTrainsBinding bind = ItemCirculationTrainsBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.itemBinding = bind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$18$lambda$17(Function1 function1, OtherCirculation item, View view) {
        Intrinsics.checkNotNullParameter(item, "$item");
        if (function1 != null) {
            function1.invoke(item.getObservation());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$9(Function1 onTrainTapped, OtherCirculation item, View view) {
        Intrinsics.checkNotNullParameter(onTrainTapped, "$onTrainTapped");
        Intrinsics.checkNotNullParameter(item, "$item");
        onTrainTapped.invoke(item);
    }

    private final void setTheme(Context context, CirculationType circulationType, OtherCirculation item) {
        int i = WhenMappings.$EnumSwitchMapping$0[circulationType.ordinal()];
        if (i == 1) {
            TextView textView = this.itemBinding.station;
            int i4 = R.color.white;
            textView.setTextColor(context.getColor(i4));
            this.itemBinding.suppressedTrain.setColorFilter(context.getColor(i4), PorterDuff.Mode.SRC_ATOP);
            return;
        }
        if (i != 2) {
            this.itemBinding.station.setTextColor(context.getColor(R.color.yellow));
            this.itemBinding.suppressedTrain.setColorFilter(context.getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
        } else {
            this.itemBinding.station.setTextColor(context.getColor(R.color.yellow));
            this.itemBinding.suppressedTrain.setColorFilter(context.getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public final void bind(final OtherCirculation item, CirculationType circulationType, final Function1<? super String, Unit> onObservationTapped, final Function1<? super TrainCirculation, Unit> onTrainTapped) {
        List split$default;
        boolean contains$default;
        int i;
        boolean contains$default2;
        String delayedTime;
        final int i4 = 1;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(circulationType, "circulationType");
        Intrinsics.checkNotNullParameter(onTrainTapped, "onTrainTapped");
        int i5 = 8;
        final int i6 = 0;
        this.itemBinding.corporateInfo.getRoot().setVisibility(item.getShowExtended() ? 0 : 8);
        this.itemBinding.corporateInfo.tvCtc.setText(item.getCtcPlatform());
        this.itemBinding.corporateInfo.tvOper.setText(item.getOperatorPlatform());
        this.itemBinding.corporateInfo.tvPlan.setText(item.getPlannedPlatform());
        this.itemBinding.corporateInfo.tvSitra.setText(item.getSitraPlatform());
        TextView textView = this.itemBinding.corporateInfo.tvTechnician;
        String technicalNumber = item.getTechnicalNumber();
        textView.setText(technicalNumber != null ? technicalNumber.toString() : null);
        String resultantPlatform = item.getResultantPlatform();
        if (resultantPlatform != null) {
            switch (resultantPlatform.hashCode()) {
                case -145943889:
                    if (resultantPlatform.equals("RELIABLE_PLANNED")) {
                        TextView textView2 = this.itemBinding.corporateInfo.tvPlan;
                        Context context = textView2.getContext();
                        int i7 = R.color.white;
                        textView2.setTextColor(context.getColor(i7));
                        TextView textView3 = this.itemBinding.corporateInfo.tvPlanLabel;
                        textView3.setTextColor(textView3.getContext().getColor(i7));
                        break;
                    }
                    break;
                case 67058:
                    if (resultantPlatform.equals("CTC")) {
                        TextView textView4 = this.itemBinding.corporateInfo.tvCtc;
                        Context context2 = textView4.getContext();
                        int i8 = R.color.white;
                        textView4.setTextColor(context2.getColor(i8));
                        TextView textView5 = this.itemBinding.corporateInfo.tvCtcLabel;
                        textView5.setTextColor(textView5.getContext().getColor(i8));
                        break;
                    }
                    break;
                case 78910317:
                    if (resultantPlatform.equals("SITRA")) {
                        TextView textView6 = this.itemBinding.corporateInfo.tvSitra;
                        Context context3 = textView6.getContext();
                        int i9 = R.color.white;
                        textView6.setTextColor(context3.getColor(i9));
                        TextView textView7 = this.itemBinding.corporateInfo.tvSitraLabel;
                        textView7.setTextColor(textView7.getContext().getColor(i9));
                        break;
                    }
                    break;
                case 282073252:
                    if (resultantPlatform.equals("OPERATOR")) {
                        TextView textView8 = this.itemBinding.corporateInfo.tvOper;
                        Context context4 = textView8.getContext();
                        int i10 = R.color.white;
                        textView8.setTextColor(context4.getColor(i10));
                        TextView textView9 = this.itemBinding.corporateInfo.tvOperLabel;
                        textView9.setTextColor(textView9.getContext().getColor(i10));
                        break;
                    }
                    break;
            }
        }
        this.itemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.adif.elcanomovil.uiDepartures.adapters.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        OtherCirculationViewHolder.bind$lambda$9(onTrainTapped, item, view);
                        return;
                    default:
                        OtherCirculationViewHolder.bind$lambda$18$lambda$17(onTrainTapped, item, view);
                        return;
                }
            }
        });
        TextView textView10 = this.itemBinding.time;
        split$default = StringsKt__StringsKt.split$default(item.getTime() + '-', new String[]{"-"}, false, 0, 6, (Object) null);
        String str = (String) split$default.get(0);
        textView10.setText(item.getTime());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Context context5 = textView10.getContext();
        CirculationType circulationType2 = CirculationType.ARRIVAL;
        if (circulationType == circulationType2 && str.length() == 0) {
            i = R.string.circulation_description_time_arrival_empty;
        } else {
            if (circulationType == circulationType2) {
                contains$default2 = StringsKt__StringsKt.contains$default(str, (CharSequence) ":", false, 2, (Object) null);
                if (contains$default2) {
                    i = R.string.circulation_description_time_arrival_hour;
                }
            }
            if (circulationType == circulationType2) {
                i = R.string.circulation_description_time_arrival_minutes;
            } else if (str.length() == 0) {
                i = R.string.circulation_description_time_departure_empty;
            } else {
                contains$default = StringsKt__StringsKt.contains$default(str, (CharSequence) ":", false, 2, (Object) null);
                i = contains$default ? R.string.circulation_description_time_departure_hour : R.string.circulation_description_time_departure_minutes;
            }
        }
        String string = context5.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        textView10.setContentDescription(format);
        TextView textView11 = this.itemBinding.station;
        String stationShortName = item.getStationShortName();
        if (stationShortName == null) {
            stationShortName = item.getStationCode();
        }
        textView11.setText(stationShortName);
        TextView textView12 = this.itemBinding.station;
        textView12.getContext().getString(R.string.text_train_view_header_id);
        String stationLongName = item.getStationLongName();
        if (stationLongName != null && stationLongName.length() > 0) {
            String string2 = textView12.getContext().getString(WhenMappings.$EnumSwitchMapping$0[circulationType.ordinal()] == 1 ? R.string.circulation_description_time_station_arrival : R.string.circulation_description_time_station_departure);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{item.getStationShortName()}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            textView12.setContentDescription(format2);
        }
        Context context6 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        TextView platform = this.itemBinding.platform;
        Intrinsics.checkNotNullExpressionValue(platform, "platform");
        TextView warning = this.itemBinding.warning;
        Intrinsics.checkNotNullExpressionValue(warning, "warning");
        TrainCirculationMapperKt.updatePlatformAndWarningTextViews(item, context6, platform, warning);
        View indicatorLeft = this.itemBinding.indicatorLeft;
        Intrinsics.checkNotNullExpressionValue(indicatorLeft, "indicatorLeft");
        OtherCirculation.State state = item.getState();
        OtherCirculation.State state2 = OtherCirculation.State.SUPPRESSED;
        indicatorLeft.setVisibility(state == state2 ? 0 : 8);
        TextView delayedTime2 = this.itemBinding.delayedTime;
        Intrinsics.checkNotNullExpressionValue(delayedTime2, "delayedTime");
        delayedTime2.setVisibility((item.getState() != OtherCirculation.State.DELAYED || (delayedTime = item.getDelayedTime()) == null || StringsKt.isBlank(delayedTime)) ? 8 : 0);
        ImageView suppressedTrain = this.itemBinding.suppressedTrain;
        Intrinsics.checkNotNullExpressionValue(suppressedTrain, "suppressedTrain");
        suppressedTrain.setVisibility(item.getState() == state2 ? 0 : 8);
        OtherCirculation.State state3 = item.getState();
        int i11 = state3 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[state3.ordinal()];
        if (i11 == 1) {
            TextView action = this.itemBinding.action;
            Intrinsics.checkNotNullExpressionValue(action, "action");
            action.setVisibility(0);
            TextView textView13 = this.itemBinding.action;
            textView13.setText(this.itemView.getContext().getString(R.string.circulation_train_suppressed));
            textView13.setContentDescription(textView13.getContext().getString(R.string.circulation_description_suprimed));
            View view = this.itemBinding.indicatorLeft;
            Context context7 = this.itemView.getContext();
            int i12 = R.color.darkRed;
            view.setBackgroundColor(context7.getColor(i12));
            this.itemBinding.indicatorRight.setBackgroundColor(this.itemView.getContext().getColor(i12));
        } else if (i11 == 3) {
            TextView textView14 = this.itemBinding.delayedTime;
            textView14.setText(item.getDelayedTime());
            String string3 = textView14.getContext().getString(R.string.circulation_description_time_delayed);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String format3 = String.format(string3, Arrays.copyOf(new Object[]{item.getDelayedTime()}, 1));
            Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
            textView14.setContentDescription(format3);
            TextView action2 = this.itemBinding.action;
            Intrinsics.checkNotNullExpressionValue(action2, "action");
            action2.setVisibility(8);
        }
        Context applicationContext = this.itemBinding.logo.getContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext);
        i iVar = new i(applicationContext);
        iVar.f1464c = item.getImageUrl();
        iVar.f1467f = item.getImageUrl();
        iVar.b(item.getImageUrl());
        iVar.f1465d = new U0.b(this) { // from class: com.adif.elcanomovil.uiDepartures.adapters.OtherCirculationViewHolder$bind$$inlined$target$default$1
            @Override // U0.b
            public void onError(Drawable error) {
                ItemCirculationTrainsBinding itemCirculationTrainsBinding;
                ItemCirculationTrainsBinding itemCirculationTrainsBinding2;
                ItemCirculationTrainsBinding itemCirculationTrainsBinding3;
                itemCirculationTrainsBinding = OtherCirculationViewHolder.this.itemBinding;
                itemCirculationTrainsBinding.operator.setVisibility(0);
                itemCirculationTrainsBinding2 = OtherCirculationViewHolder.this.itemBinding;
                itemCirculationTrainsBinding2.product.setVisibility(0);
                itemCirculationTrainsBinding3 = OtherCirculationViewHolder.this.itemBinding;
                itemCirculationTrainsBinding3.logo.setVisibility(8);
            }

            @Override // U0.b
            public void onStart(Drawable placeholder) {
            }

            @Override // U0.b
            public void onSuccess(Drawable result) {
                ItemCirculationTrainsBinding itemCirculationTrainsBinding;
                ItemCirculationTrainsBinding itemCirculationTrainsBinding2;
                ItemCirculationTrainsBinding itemCirculationTrainsBinding3;
                ItemCirculationTrainsBinding itemCirculationTrainsBinding4;
                itemCirculationTrainsBinding = OtherCirculationViewHolder.this.itemBinding;
                itemCirculationTrainsBinding.operator.setVisibility(8);
                itemCirculationTrainsBinding2 = OtherCirculationViewHolder.this.itemBinding;
                itemCirculationTrainsBinding2.product.setVisibility(8);
                itemCirculationTrainsBinding3 = OtherCirculationViewHolder.this.itemBinding;
                itemCirculationTrainsBinding3.logo.setVisibility(0);
                itemCirculationTrainsBinding4 = OtherCirculationViewHolder.this.itemBinding;
                itemCirculationTrainsBinding4.logo.setImageDrawable(result);
            }
        };
        iVar.f1472m = null;
        iVar.f1473n = null;
        iVar.f1474o = null;
        ((p) I0.a.a(applicationContext)).b(iVar.a());
        this.itemBinding.operator.setText(AbstractC0105a.K(this.itemView.getContext(), item.getTrain().getOperator()));
        this.itemBinding.product.setText(AbstractC0105a.k(this.itemView.getContext(), item.getTrain().getCommercialProduct()));
        TextView textView15 = this.itemBinding.number;
        textView15.setText(item.getTrain().getCommercialNumber());
        String string4 = applicationContext.getString(R.string.circulation_description_number);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String format4 = String.format(string4, Arrays.copyOf(new Object[]{item.getTrain().getCommercialNumber()}, 1));
        Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
        textView15.setContentDescription(format4);
        TextView notes = this.itemBinding.notes;
        Intrinsics.checkNotNullExpressionValue(notes, "notes");
        String observation = item.getObservation();
        if (observation != null && !StringsKt.isBlank(observation)) {
            i5 = 0;
        }
        notes.setVisibility(i5);
        String observation2 = item.getObservation();
        if (observation2 == null || StringsKt.isBlank(observation2)) {
            return;
        }
        TextView textView16 = this.itemBinding.notes;
        textView16.setText(item.getObservation());
        textView16.setOnClickListener(new View.OnClickListener() { // from class: com.adif.elcanomovil.uiDepartures.adapters.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        OtherCirculationViewHolder.bind$lambda$9(onObservationTapped, item, view2);
                        return;
                    default:
                        OtherCirculationViewHolder.bind$lambda$18$lambda$17(onObservationTapped, item, view2);
                        return;
                }
            }
        });
        String string5 = applicationContext.getString(R.string.circulation_description_observations);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String format5 = String.format(string5, Arrays.copyOf(new Object[]{item.getObservation()}, 1));
        Intrinsics.checkNotNullExpressionValue(format5, "format(...)");
        textView16.setContentDescription(format5);
    }
}
