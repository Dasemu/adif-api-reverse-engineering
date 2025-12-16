package com.adif.elcanomovil.uiTrain.main;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.commonViews.utils.ScreenUtils;
import com.adif.elcanomovil.uiDepartures.adapters.TrainCirculationMapperKt;
import com.adif.elcanomovil.uiTrain.R;
import com.adif.elcanomovil.uiTrain.databinding.ItemTrainSituationBinding;
import com.adif.elcanomovil.uiTrain.entities.Step;
import com.adif.elcanomovil.uiTrain.entities.StepItems;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B]\u0012%\u0010\t\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b\u0012%\u0010\u000b\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J;\u0010\"\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b$\u0010%R3\u0010\t\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R3\u0010\u000b\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/main/StepViewHolder;", "Landroidx/recyclerview/widget/I0;", "Lkotlin/Function1;", "Lcom/adif/elcanomovil/uiTrain/entities/Step;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "step", "", "Lcom/adif/elcanomovil/uiTrain/main/OnStepSelected;", "onTap", "Lcom/adif/elcanomovil/uiTrain/main/OnObservationSelected;", "onObservationTap", "Landroid/view/View;", "itemView", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/view/View;)V", "", "position", "", "isCercanias", "size", "item", "setSuppressedVisibility", "(IZILcom/adif/elcanomovil/uiTrain/entities/Step;)V", "changePathColors", "(Lcom/adif/elcanomovil/uiTrain/entities/Step;)V", "drawVisiblePath", "(II)V", "", "Lcom/adif/elcanomovil/uiTrain/entities/StepItems;", FirebaseAnalytics.Param.ITEMS, "setTrainPosition", "(ILjava/util/List;Lcom/adif/elcanomovil/uiTrain/entities/Step;)V", "showExtended", "bind", "(Lcom/adif/elcanomovil/uiTrain/entities/Step;Ljava/util/List;IZZ)V", "isSuppressed", "(IILcom/adif/elcanomovil/uiTrain/entities/Step;)Z", "Lkotlin/jvm/functions/Function1;", "Lcom/adif/elcanomovil/uiTrain/databinding/ItemTrainSituationBinding;", "itemBinding", "Lcom/adif/elcanomovil/uiTrain/databinding/ItemTrainSituationBinding;", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrainSituationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainSituationAdapter.kt\ncom/adif/elcanomovil/uiTrain/main/StepViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,459:1\n1#2:460\n256#3,2:461\n310#3:463\n326#3,4:464\n311#3:468\n*S KotlinDebug\n*F\n+ 1 TrainSituationAdapter.kt\ncom/adif/elcanomovil/uiTrain/main/StepViewHolder\n*L\n165#1:461,2\n178#1:463\n178#1:464,4\n178#1:468\n*E\n"})
/* loaded from: classes3.dex */
public final class StepViewHolder extends I0 {
    private final ItemTrainSituationBinding itemBinding;
    private final Function1<Step, Unit> onObservationTap;
    private final Function1<Step, Unit> onTap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StepViewHolder(Function1<? super Step, Unit> onTap, Function1<? super Step, Unit> onObservationTap, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        Intrinsics.checkNotNullParameter(onObservationTap, "onObservationTap");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.onTap = onTap;
        this.onObservationTap = onObservationTap;
        ItemTrainSituationBinding bind = ItemTrainSituationBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.itemBinding = bind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$11(StepViewHolder this$0, Step item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.onObservationTap.invoke(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$13(StepViewHolder this$0, Step item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.onTap.invoke(item);
    }

    private final void changePathColors(Step item) {
        Step.State departureState = item.getDepartureState();
        Step.State state = Step.State.SUPPRESSED;
        if (departureState == state || item.getArrivalState() == state) {
            ItemTrainSituationBinding itemTrainSituationBinding = this.itemBinding;
            itemTrainSituationBinding.stationDot.setColorFilter(itemTrainSituationBinding.getRoot().getResources().getColor(R.color.red, null));
        } else {
            ItemTrainSituationBinding itemTrainSituationBinding2 = this.itemBinding;
            itemTrainSituationBinding2.stationDot.setColorFilter(itemTrainSituationBinding2.getRoot().getResources().getColor(R.color.black, null));
        }
        if (item.getDepartureState() == state) {
            ItemTrainSituationBinding itemTrainSituationBinding3 = this.itemBinding;
            ImageView imageView = itemTrainSituationBinding3.pathViewFirstStation;
            Resources resources = itemTrainSituationBinding3.getRoot().getResources();
            int i = R.color.trainPathRed;
            imageView.setColorFilter(resources.getColor(i, null));
            ItemTrainSituationBinding itemTrainSituationBinding4 = this.itemBinding;
            itemTrainSituationBinding4.pathViewDeparture.setColorFilter(itemTrainSituationBinding4.getRoot().getResources().getColor(i, null));
        } else if (item.getIsDepartureAudited()) {
            ItemTrainSituationBinding itemTrainSituationBinding5 = this.itemBinding;
            ImageView imageView2 = itemTrainSituationBinding5.pathViewFirstStation;
            Resources resources2 = itemTrainSituationBinding5.getRoot().getResources();
            int i4 = R.color.trainPathYellow;
            imageView2.setColorFilter(resources2.getColor(i4, null));
            ItemTrainSituationBinding itemTrainSituationBinding6 = this.itemBinding;
            itemTrainSituationBinding6.pathViewDeparture.setColorFilter(itemTrainSituationBinding6.getRoot().getResources().getColor(i4, null));
        } else {
            ItemTrainSituationBinding itemTrainSituationBinding7 = this.itemBinding;
            ImageView imageView3 = itemTrainSituationBinding7.pathViewFirstStation;
            Resources resources3 = itemTrainSituationBinding7.getRoot().getResources();
            int i5 = R.color.trainPathGrey;
            imageView3.setColorFilter(resources3.getColor(i5, null));
            ItemTrainSituationBinding itemTrainSituationBinding8 = this.itemBinding;
            itemTrainSituationBinding8.pathViewDeparture.setColorFilter(itemTrainSituationBinding8.getRoot().getResources().getColor(i5, null));
        }
        if (item.getArrivalState() == state) {
            ItemTrainSituationBinding itemTrainSituationBinding9 = this.itemBinding;
            ImageView imageView4 = itemTrainSituationBinding9.pathViewArrival;
            Resources resources4 = itemTrainSituationBinding9.getRoot().getResources();
            int i6 = R.color.trainPathRed;
            imageView4.setColorFilter(resources4.getColor(i6, null));
            ItemTrainSituationBinding itemTrainSituationBinding10 = this.itemBinding;
            itemTrainSituationBinding10.pathViewLastStation.setColorFilter(itemTrainSituationBinding10.getRoot().getResources().getColor(i6, null));
            return;
        }
        if (item.getIsArrivalAudited()) {
            ItemTrainSituationBinding itemTrainSituationBinding11 = this.itemBinding;
            ImageView imageView5 = itemTrainSituationBinding11.pathViewArrival;
            Resources resources5 = itemTrainSituationBinding11.getRoot().getResources();
            int i7 = R.color.trainPathYellow;
            imageView5.setColorFilter(resources5.getColor(i7, null));
            ItemTrainSituationBinding itemTrainSituationBinding12 = this.itemBinding;
            itemTrainSituationBinding12.pathViewLastStation.setColorFilter(itemTrainSituationBinding12.getRoot().getResources().getColor(i7, null));
            return;
        }
        ItemTrainSituationBinding itemTrainSituationBinding13 = this.itemBinding;
        ImageView imageView6 = itemTrainSituationBinding13.pathViewArrival;
        Resources resources6 = itemTrainSituationBinding13.getRoot().getResources();
        int i8 = R.color.trainPathGrey;
        imageView6.setColorFilter(resources6.getColor(i8, null));
        ItemTrainSituationBinding itemTrainSituationBinding14 = this.itemBinding;
        itemTrainSituationBinding14.pathViewLastStation.setColorFilter(itemTrainSituationBinding14.getRoot().getResources().getColor(i8, null));
    }

    private final void drawVisiblePath(int position, int size) {
        if (position == 0) {
            this.itemBinding.pathViewFirstStation.setVisibility(0);
            this.itemBinding.pathViewArrival.setVisibility(4);
            this.itemBinding.pathViewDeparture.setVisibility(4);
            this.itemBinding.pathViewLastStation.setVisibility(4);
            return;
        }
        if (position == size - 1) {
            this.itemBinding.pathViewFirstStation.setVisibility(4);
            this.itemBinding.pathViewArrival.setVisibility(4);
            this.itemBinding.pathViewDeparture.setVisibility(4);
            this.itemBinding.pathViewLastStation.setVisibility(0);
            return;
        }
        this.itemBinding.pathViewFirstStation.setVisibility(4);
        this.itemBinding.pathViewArrival.setVisibility(0);
        this.itemBinding.pathViewDeparture.setVisibility(0);
        this.itemBinding.pathViewLastStation.setVisibility(4);
    }

    private final void setSuppressedVisibility(int position, boolean isCercanias, int size, Step item) {
        if (!isSuppressed(position, size, item)) {
            this.itemBinding.delayedTime.setVisibility((Intrinsics.areEqual(item.getTime(), item.getDelayedTime()) || item.getIsDepartureAudited() || (item.getIsArrivalAudited() && position == size + (-1)) || isCercanias) ? 8 : 0);
            this.itemBinding.state.setVisibility(8);
            this.itemBinding.indicatorLeft.setVisibility(8);
            this.itemBinding.indicatorRight.setVisibility(8);
            this.itemBinding.suppressedTrain.setVisibility(8);
            return;
        }
        this.itemBinding.delayedTime.setVisibility(8);
        this.itemBinding.state.setVisibility(0);
        this.itemBinding.indicatorLeft.setVisibility(0);
        this.itemBinding.indicatorRight.setVisibility(0);
        this.itemBinding.suppressedTrain.setVisibility(0);
        this.itemBinding.platform.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setTrainPosition(int r6, java.util.List<? extends com.adif.elcanomovil.uiTrain.entities.StepItems> r7, com.adif.elcanomovil.uiTrain.entities.Step r8) {
        /*
            r5 = this;
            kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
            r0.<init>()
            int r1 = r7.size()
            int r1 = r1 + (-1)
            r2 = 4
            r3 = 0
            if (r6 >= r1) goto L3d
            boolean r1 = r8.getIsDepartureAudited()
            if (r1 == 0) goto L3d
            com.adif.elcanomovil.uiTrain.entities.Step r1 = setTrainPosition$nextStep(r7, r6, r0)
            boolean r1 = r1.getIsArrivalAudited()
            if (r1 != 0) goto L3d
            com.adif.elcanomovil.uiTrain.entities.Step$State r1 = r8.getDepartureState()
            com.adif.elcanomovil.uiTrain.entities.Step$State r4 = com.adif.elcanomovil.uiTrain.entities.Step.State.SUPPRESSED
            if (r1 == r4) goto L3d
            com.adif.elcanomovil.uiTrain.entities.Step r1 = setTrainPosition$nextStep(r7, r6, r0)
            com.adif.elcanomovil.uiTrain.entities.Step$State r1 = r1.getArrivalState()
            if (r1 == r4) goto L3d
            boolean r1 = r0.element
            if (r1 != 0) goto L3d
            com.adif.elcanomovil.uiTrain.databinding.ItemTrainSituationBinding r1 = r5.itemBinding
            androidx.appcompat.widget.AppCompatImageView r1 = r1.trainDepartured
            r1.setVisibility(r3)
            goto L44
        L3d:
            com.adif.elcanomovil.uiTrain.databinding.ItemTrainSituationBinding r1 = r5.itemBinding
            androidx.appcompat.widget.AppCompatImageView r1 = r1.trainDepartured
            r1.setVisibility(r2)
        L44:
            if (r6 <= 0) goto L74
            com.adif.elcanomovil.uiTrain.entities.Step r1 = setTrainPosition$previousStep(r7, r6, r0)
            boolean r1 = r1.getIsDepartureAudited()
            if (r1 == 0) goto L74
            boolean r1 = r8.getIsArrivalAudited()
            if (r1 != 0) goto L74
            com.adif.elcanomovil.uiTrain.entities.Step$State r1 = r8.getArrivalState()
            com.adif.elcanomovil.uiTrain.entities.Step$State r4 = com.adif.elcanomovil.uiTrain.entities.Step.State.SUPPRESSED
            if (r1 == r4) goto L74
            com.adif.elcanomovil.uiTrain.entities.Step r7 = setTrainPosition$previousStep(r7, r6, r0)
            com.adif.elcanomovil.uiTrain.entities.Step$State r7 = r7.getDepartureState()
            if (r7 == r4) goto L74
            boolean r7 = r0.element
            if (r7 != 0) goto L74
            com.adif.elcanomovil.uiTrain.databinding.ItemTrainSituationBinding r7 = r5.itemBinding
            androidx.appcompat.widget.AppCompatImageView r7 = r7.trainViewArriving
            r7.setVisibility(r3)
            goto L7b
        L74:
            com.adif.elcanomovil.uiTrain.databinding.ItemTrainSituationBinding r7 = r5.itemBinding
            androidx.appcompat.widget.AppCompatImageView r7 = r7.trainViewArriving
            r7.setVisibility(r2)
        L7b:
            boolean r7 = r8.getIsArrivalAudited()
            if (r7 == 0) goto L8f
            boolean r7 = r8.getIsDepartureAudited()
            if (r7 != 0) goto L8f
            com.adif.elcanomovil.uiTrain.entities.Step$State r7 = r8.getDepartureState()
            com.adif.elcanomovil.uiTrain.entities.Step$State r0 = com.adif.elcanomovil.uiTrain.entities.Step.State.SUPPRESSED
            if (r7 != r0) goto L9f
        L8f:
            if (r6 != 0) goto La7
            boolean r6 = r8.getIsDepartureAudited()
            if (r6 != 0) goto La7
            com.adif.elcanomovil.uiTrain.entities.Step$State r6 = r8.getDepartureState()
            com.adif.elcanomovil.uiTrain.entities.Step$State r7 = com.adif.elcanomovil.uiTrain.entities.Step.State.SUPPRESSED
            if (r6 == r7) goto La7
        L9f:
            com.adif.elcanomovil.uiTrain.databinding.ItemTrainSituationBinding r5 = r5.itemBinding
            androidx.appcompat.widget.AppCompatImageView r5 = r5.trainViewInStation
            r5.setVisibility(r3)
            return
        La7:
            com.adif.elcanomovil.uiTrain.databinding.ItemTrainSituationBinding r5 = r5.itemBinding
            androidx.appcompat.widget.AppCompatImageView r5 = r5.trainViewInStation
            r5.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiTrain.main.StepViewHolder.setTrainPosition(int, java.util.List, com.adif.elcanomovil.uiTrain.entities.Step):void");
    }

    private static final Step setTrainPosition$nextStep(List<? extends StepItems> list, int i, Ref.BooleanRef booleanRef) {
        int i4 = i + 1;
        if (list.get(i4) instanceof Step) {
            StepItems stepItems = list.get(i4);
            Intrinsics.checkNotNull(stepItems, "null cannot be cast to non-null type com.adif.elcanomovil.uiTrain.entities.Step");
            return (Step) stepItems;
        }
        booleanRef.element = true;
        StepItems stepItems2 = list.get(i + 2);
        Intrinsics.checkNotNull(stepItems2, "null cannot be cast to non-null type com.adif.elcanomovil.uiTrain.entities.Step");
        return (Step) stepItems2;
    }

    private static final Step setTrainPosition$previousStep(List<? extends StepItems> list, int i, Ref.BooleanRef booleanRef) {
        int i4 = i - 1;
        if (list.get(i4) instanceof Step) {
            StepItems stepItems = list.get(i4);
            Intrinsics.checkNotNull(stepItems, "null cannot be cast to non-null type com.adif.elcanomovil.uiTrain.entities.Step");
            return (Step) stepItems;
        }
        booleanRef.element = true;
        StepItems stepItems2 = list.get(i - 2);
        Intrinsics.checkNotNull(stepItems2, "null cannot be cast to non-null type com.adif.elcanomovil.uiTrain.entities.Step");
        return (Step) stepItems2;
    }

    public final void bind(final Step item, List<? extends StepItems> items, int position, boolean isCercanias, boolean showExtended) {
        String s4;
        int i;
        int i4;
        int i5;
        int i6;
        final int i7 = 0;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(items, "items");
        drawVisiblePath(position, items.size());
        changePathColors(item);
        setTrainPosition(position, items, item);
        TextView textView = this.itemBinding.time;
        textView.setText(item.getTime());
        final int i8 = 1;
        if (item.getIsDepartureAudited()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = textView.getContext().getString(R.string.content_train_departure_one);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            s4 = C.w.s(new Object[]{item.getTime()}, 1, string, "format(...)");
        } else if (Intrinsics.areEqual(item.getTime(), item.getDelayedTime()) || isCercanias) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String string2 = textView.getContext().getString(R.string.content_train_departure_two);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            s4 = C.w.s(new Object[]{item.getTime()}, 1, string2, "format(...)");
        } else {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String string3 = textView.getContext().getString(R.string.content_train_departure_three);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            s4 = C.w.s(new Object[]{item.getTime(), item.getDelayedTime()}, 2, string3, "format(...)");
        }
        textView.setContentDescription(s4);
        this.itemBinding.corporate.getRoot().setVisibility(showExtended ? 0 : 8);
        this.itemBinding.corporate.tvSitra.setText(item.getSitraPlatform());
        this.itemBinding.corporate.tvPlan.setText(item.getPlannedPlatform());
        this.itemBinding.corporate.tvCtc.setText(item.getCtcPlatform());
        this.itemBinding.corporate.tvOper.setText(item.getOperatorPlatform());
        TextView textView2 = this.itemBinding.corporate.tvTechnician;
        String technicalNumber = item.getTechnicalNumber();
        if (technicalNumber == null) {
            technicalNumber = null;
        }
        textView2.setText(technicalNumber);
        String resultantPlatform = item.getResultantPlatform();
        if (resultantPlatform != null) {
            switch (resultantPlatform.hashCode()) {
                case -145943889:
                    if (resultantPlatform.equals("RELIABLE_PLANNED")) {
                        TextView textView3 = this.itemBinding.corporate.tvPlan;
                        Context context = textView3.getContext();
                        int i9 = R.color.white;
                        textView3.setTextColor(context.getColor(i9));
                        TextView textView4 = this.itemBinding.corporate.tvPlanLabel;
                        textView4.setTextColor(textView4.getContext().getColor(i9));
                        break;
                    }
                    break;
                case 67058:
                    if (resultantPlatform.equals("CTC")) {
                        TextView textView5 = this.itemBinding.corporate.tvCtc;
                        Context context2 = textView5.getContext();
                        int i10 = R.color.white;
                        textView5.setTextColor(context2.getColor(i10));
                        TextView textView6 = this.itemBinding.corporate.tvCtcLabel;
                        textView6.setTextColor(textView6.getContext().getColor(i10));
                        break;
                    }
                    break;
                case 78910317:
                    if (resultantPlatform.equals("SITRA")) {
                        TextView textView7 = this.itemBinding.corporate.tvSitra;
                        Context context3 = textView7.getContext();
                        int i11 = R.color.white;
                        textView7.setTextColor(context3.getColor(i11));
                        TextView textView8 = this.itemBinding.corporate.tvSitraLabel;
                        textView8.setTextColor(textView8.getContext().getColor(i11));
                        break;
                    }
                    break;
                case 282073252:
                    if (resultantPlatform.equals("OPERATOR")) {
                        TextView textView9 = this.itemBinding.corporate.tvOper;
                        Context context4 = textView9.getContext();
                        int i12 = R.color.white;
                        textView9.setTextColor(context4.getColor(i12));
                        TextView textView10 = this.itemBinding.corporate.tvOperLabel;
                        textView10.setTextColor(textView10.getContext().getColor(i12));
                        break;
                    }
                    break;
            }
        }
        this.itemBinding.delayedTime.setText(item.getDelayedTime());
        this.itemBinding.delayedTime.setVisibility(isCercanias ? 8 : 0);
        TextView textView11 = this.itemBinding.station;
        textView11.setText(item.getStationName());
        String string4 = textView11.getContext().getString(R.string.content_train_station);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String format = String.format(string4, Arrays.copyOf(new Object[]{item.getStationName()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        textView11.setContentDescription(format);
        this.itemBinding.notes.setText(item.getNotes());
        if (StringsKt.isBlank(item.getNotes())) {
            this.itemBinding.notes.setVisibility(8);
        } else {
            this.itemBinding.notes.setVisibility(0);
        }
        this.itemBinding.notes.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiTrain.main.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StepViewHolder f5398b;

            {
                this.f5398b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        StepViewHolder.bind$lambda$11(this.f5398b, item, view);
                        return;
                    default:
                        StepViewHolder.bind$lambda$13(this.f5398b, item, view);
                        return;
                }
            }
        });
        this.itemBinding.warning.setVisibility(8);
        TextView textView12 = this.itemBinding.platform;
        Intrinsics.checkNotNull(textView12);
        textView12.setVisibility(!item.getPlatformMuted() ? 0 : 8);
        textView12.setText(TrainCirculationMapperKt.getPlatformText(item));
        textView12.setAlpha(TrainCirculationMapperKt.getPlatformTextAlpha(item));
        String string5 = textView12.getContext().getString(R.string.content_train_via);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String format2 = String.format(string5, Arrays.copyOf(new Object[]{item.getPlatform()}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        textView12.setContentDescription(format2);
        this.itemBinding.getRoot().setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiTrain.main.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StepViewHolder f5398b;

            {
                this.f5398b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        StepViewHolder.bind$lambda$11(this.f5398b, item, view);
                        return;
                    default:
                        StepViewHolder.bind$lambda$13(this.f5398b, item, view);
                        return;
                }
            }
        });
        boolean isEmpty = item.getComposition().isEmpty();
        boolean z3 = !isEmpty;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        float f4 = (showExtended ? 40.0f : 0.0f) + 80.0f;
        if (!isEmpty) {
            f2 = 30.0f;
        }
        float f5 = f4 + f2;
        ConstraintLayout root = this.itemBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = (int) ScreenUtils.INSTANCE.dpToPx(f5);
        root.setLayoutParams(layoutParams);
        ImageView imageView = this.itemBinding.pathViewArrival;
        Context context5 = imageView.getContext();
        if (z3) {
            i = R.drawable.rectangle_step;
        } else {
            if (!isEmpty) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.rectangle_step;
        }
        imageView.setImageDrawable(D.h.getDrawable(context5, i));
        ImageView imageView2 = this.itemBinding.pathViewDeparture;
        Context context6 = imageView2.getContext();
        if (z3) {
            i4 = R.drawable.rectangle_step;
        } else {
            if (!isEmpty) {
                throw new NoWhenBranchMatchedException();
            }
            i4 = R.drawable.rectangle_step;
        }
        imageView2.setImageDrawable(D.h.getDrawable(context6, i4));
        ImageView imageView3 = this.itemBinding.pathViewFirstStation;
        Context context7 = imageView3.getContext();
        if (z3) {
            i5 = R.drawable.first_step;
        } else {
            if (!isEmpty) {
                throw new NoWhenBranchMatchedException();
            }
            i5 = R.drawable.first_step;
        }
        imageView3.setImageDrawable(D.h.getDrawable(context7, i5));
        ImageView imageView4 = this.itemBinding.pathViewLastStation;
        Context context8 = imageView4.getContext();
        if (z3) {
            i6 = R.drawable.last_step;
        } else {
            if (!isEmpty) {
                throw new NoWhenBranchMatchedException();
            }
            i6 = R.drawable.last_step;
        }
        imageView4.setImageDrawable(D.h.getDrawable(context8, i6));
        if (isEmpty) {
            this.itemBinding.trainComposition.update(CollectionsKt.emptyList());
            this.itemBinding.trainComposition.setVisibility(8);
        } else {
            this.itemBinding.trainComposition.update(item.getComposition());
            this.itemBinding.trainComposition.setVisibility(0);
        }
        setSuppressedVisibility(position, isCercanias, items.size(), item);
    }

    public final boolean isSuppressed(int position, int size, Step item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int i = size - 1;
        return (position < i && item.getDepartureState() == Step.State.SUPPRESSED) || (position == i && item.getArrivalState() == Step.State.SUPPRESSED);
    }
}
