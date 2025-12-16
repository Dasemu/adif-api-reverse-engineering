package com.adif.elcanomovil.uiDepartures.adapters;

import C.w;
import I0.p;
import S0.i;
import S0.j;
import a.AbstractC0106b;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.circulation.CercaniasCirculation;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculation;
import com.adif.elcanomovil.uiDepartures.R;
import com.adif.elcanomovil.uiDepartures.databinding.ItemCirculationCercaniasBinding;
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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/adapters/CercaniasCirculationViewHolder;", "Landroidx/recyclerview/widget/I0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lcom/adif/elcanomovil/domain/entities/circulation/CercaniasCirculation;", "item", "", "updateLineInformation", "(Lcom/adif/elcanomovil/domain/entities/circulation/CercaniasCirculation;)V", "", "lineContentDescription", "setLineInformationLegacyFormat", "(Lcom/adif/elcanomovil/domain/entities/circulation/CercaniasCirculation;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "circulationType", "setTheme", "(Landroid/content/Context;Lcom/adif/elcanomovil/domain/entities/CirculationType;)V", "Lkotlin/Function1;", "onObservationTapped", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculation;", "onTrainTapped", "bind", "(Lcom/adif/elcanomovil/domain/entities/circulation/CercaniasCirculation;Lcom/adif/elcanomovil/domain/entities/CirculationType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/adif/elcanomovil/uiDepartures/databinding/ItemCirculationCercaniasBinding;", "itemBinding", "Lcom/adif/elcanomovil/uiDepartures/databinding/ItemCirculationCercaniasBinding;", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCercaniasCirculationViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CercaniasCirculationViewHolder.kt\ncom/adif/elcanomovil/uiDepartures/adapters/CercaniasCirculationViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 5 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,203:1\n1#2:204\n256#3,2:205\n849#4,5:207\n24#5:212\n*S KotlinDebug\n*F\n+ 1 CercaniasCirculationViewHolder.kt\ncom/adif/elcanomovil/uiDepartures/adapters/CercaniasCirculationViewHolder\n*L\n109#1:205,2\n144#1:207,5\n159#1:212\n*E\n"})
/* loaded from: classes2.dex */
public final class CercaniasCirculationViewHolder extends I0 {
    private final ItemCirculationCercaniasBinding itemBinding;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CercaniasCirculationViewHolder(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ItemCirculationCercaniasBinding bind = ItemCirculationCercaniasBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.itemBinding = bind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$14(Function1 function1, CercaniasCirculation item, View view) {
        Intrinsics.checkNotNullParameter(item, "$item");
        if (function1 != null) {
            function1.invoke(item.getObservation());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$9(Function1 onTrainTapped, CercaniasCirculation item, View view) {
        Intrinsics.checkNotNullParameter(onTrainTapped, "$onTrainTapped");
        Intrinsics.checkNotNullParameter(item, "$item");
        onTrainTapped.invoke(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLineInformationLegacyFormat(CercaniasCirculation item, String lineContentDescription) {
        this.itemBinding.line.setVisibility(0);
        this.itemBinding.logo.setVisibility(8);
        this.itemBinding.line.setText(item.getLine().getName());
        this.itemBinding.line.setContentDescription(lineContentDescription);
        this.itemBinding.line.setBackgroundColor(Color.parseColor(item.getLine().getColor()));
        AbstractC0106b.m(this.itemView.getContext(), R.color.black);
    }

    private final void setTheme(Context context, CirculationType circulationType) {
        int i = WhenMappings.$EnumSwitchMapping$0[circulationType.ordinal()];
        if (i == 1) {
            TextView textView = this.itemBinding.station;
            int i4 = R.color.white;
            textView.setTextColor(context.getColor(i4));
            this.itemBinding.accessibility.setColorFilter(context.getColor(i4), PorterDuff.Mode.SRC_ATOP);
            return;
        }
        if (i != 2) {
            this.itemBinding.station.setTextColor(context.getColor(R.color.yellow));
            this.itemBinding.accessibility.setColorFilter(context.getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
        } else {
            this.itemBinding.station.setTextColor(context.getColor(R.color.yellow));
            this.itemBinding.accessibility.setColorFilter(context.getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
        }
    }

    private final void updateLineInformation(final CercaniasCirculation item) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = this.itemView.getContext().getString(R.string.circulation_description_line);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        final String s4 = w.s(new Object[]{item.getLine().getName()}, 1, string, "format(...)");
        Context context = this.itemBinding.line.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        i iVar = new i(context);
        iVar.f1464c = item.getLine().getIconUrl();
        iVar.f1467f = item.getLine().getIconUrl();
        iVar.b(item.getLine().getIconUrl());
        iVar.f1465d = new U0.b(item, s4, this, item, s4, this, s4) { // from class: com.adif.elcanomovil.uiDepartures.adapters.CercaniasCirculationViewHolder$updateLineInformation$$inlined$target$1
            final /* synthetic */ CercaniasCirculation $item$inlined;
            final /* synthetic */ CercaniasCirculation $item$inlined$1;
            final /* synthetic */ String $lineContentDescription$inlined;
            final /* synthetic */ String $lineContentDescription$inlined$1;
            final /* synthetic */ String $lineContentDescription$inlined$2;

            {
                this.$item$inlined$1 = item;
                this.$lineContentDescription$inlined$1 = s4;
                this.$lineContentDescription$inlined$2 = s4;
            }

            @Override // U0.b
            public void onError(Drawable error) {
                CercaniasCirculationViewHolder.this.setLineInformationLegacyFormat(this.$item$inlined$1, this.$lineContentDescription$inlined$1);
            }

            @Override // U0.b
            public void onStart(Drawable placeholder) {
                CercaniasCirculationViewHolder.this.setLineInformationLegacyFormat(this.$item$inlined, this.$lineContentDescription$inlined);
            }

            @Override // U0.b
            public void onSuccess(Drawable result) {
                ItemCirculationCercaniasBinding itemCirculationCercaniasBinding;
                ItemCirculationCercaniasBinding itemCirculationCercaniasBinding2;
                ItemCirculationCercaniasBinding itemCirculationCercaniasBinding3;
                ItemCirculationCercaniasBinding itemCirculationCercaniasBinding4;
                itemCirculationCercaniasBinding = CercaniasCirculationViewHolder.this.itemBinding;
                itemCirculationCercaniasBinding.line.setVisibility(8);
                itemCirculationCercaniasBinding2 = CercaniasCirculationViewHolder.this.itemBinding;
                itemCirculationCercaniasBinding2.logo.setVisibility(0);
                itemCirculationCercaniasBinding3 = CercaniasCirculationViewHolder.this.itemBinding;
                itemCirculationCercaniasBinding3.logo.setImageDrawable(result);
                itemCirculationCercaniasBinding4 = CercaniasCirculationViewHolder.this.itemBinding;
                itemCirculationCercaniasBinding4.logo.setContentDescription(this.$lineContentDescription$inlined$2);
            }
        };
        iVar.f1472m = null;
        iVar.f1473n = null;
        iVar.f1474o = null;
        j a2 = iVar.a();
        Context context2 = this.itemBinding.line.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ((p) I0.a.a(context2)).b(a2);
    }

    public final void bind(final CercaniasCirculation item, CirculationType circulationType, final Function1<? super String, Unit> onObservationTapped, final Function1<? super TrainCirculation, Unit> onTrainTapped) {
        List split$default;
        boolean contains$default;
        int i;
        boolean contains$default2;
        String stationShortName;
        String string;
        String observation;
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
        if (technicalNumber == null) {
            technicalNumber = null;
        }
        textView.setText(technicalNumber);
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
        this.itemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.adif.elcanomovil.uiDepartures.adapters.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        CercaniasCirculationViewHolder.bind$lambda$9(onTrainTapped, item, view);
                        return;
                    default:
                        CercaniasCirculationViewHolder.bind$lambda$14(onTrainTapped, item, view);
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
        String string2 = context5.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String format = String.format(string2, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        textView10.setContentDescription(format);
        Context context6 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        if (AbstractC0106b.r(context6)) {
            stationShortName = item.getStationLongName();
            if (stationShortName == null) {
                stationShortName = item.getStationCode();
            }
        } else {
            stationShortName = item.getStationShortName();
            if (stationShortName == null) {
                stationShortName = item.getStationCode();
            }
        }
        TextView textView11 = this.itemBinding.station;
        textView11.setText(stationShortName);
        textView11.getContext().getString(R.string.text_train_view_header_id);
        if (stationShortName.length() > 0) {
            String string3 = WhenMappings.$EnumSwitchMapping$0[circulationType.ordinal()] == 1 ? textView11.getContext().getString(R.string.circulation_description_time_station_arrival) : textView11.getContext().getString(R.string.circulation_description_time_station_departure);
            Intrinsics.checkNotNull(string3);
            String format2 = String.format(string3, Arrays.copyOf(new Object[]{item.getStationLongName()}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            textView11.setContentDescription(format2);
        }
        updateLineInformation(item);
        this.itemBinding.accessibility.setVisibility(item.getAccessibleStation() ? 0 : 4);
        Context context7 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        TextView platform = this.itemBinding.platform;
        Intrinsics.checkNotNullExpressionValue(platform, "platform");
        TextView warning = this.itemBinding.warning;
        Intrinsics.checkNotNullExpressionValue(warning, "warning");
        TrainCirculationMapperKt.updatePlatformAndWarningTextViews(item, context7, platform, warning);
        TextView notes = this.itemBinding.notes;
        Intrinsics.checkNotNullExpressionValue(notes, "notes");
        if (item.isShortTrain() || ((observation = item.getObservation()) != null && !StringsKt.isBlank(observation))) {
            i5 = 0;
        }
        notes.setVisibility(i5);
        String observation2 = item.getObservation();
        if (observation2 == null || StringsKt.isBlank(observation2) || !item.isShortTrain()) {
            String observation3 = item.getObservation();
            string = (observation3 == null || StringsKt.isBlank(observation3)) ? item.isShortTrain() ? this.itemView.getContext().getString(R.string.circulation_train_short) : "" : item.getObservation();
        } else {
            string = this.itemView.getContext().getString(R.string.circulation_train_short_plus_observation, item.getObservation());
        }
        TextView textView12 = this.itemBinding.notes;
        textView12.setText(string);
        String string4 = textView12.getContext().getString(R.string.circulation_description_observations);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String format3 = String.format(string4, Arrays.copyOf(new Object[]{string}, 1));
        Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
        textView12.setContentDescription(format3);
        String observation4 = item.getObservation();
        if (observation4 != null && observation4.length() != 0) {
            this.itemBinding.notes.setOnClickListener(new View.OnClickListener() { // from class: com.adif.elcanomovil.uiDepartures.adapters.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            CercaniasCirculationViewHolder.bind$lambda$9(onObservationTapped, item, view);
                            return;
                        default:
                            CercaniasCirculationViewHolder.bind$lambda$14(onObservationTapped, item, view);
                            return;
                    }
                }
            });
        }
        Context context8 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        setTheme(context8, circulationType);
    }
}
