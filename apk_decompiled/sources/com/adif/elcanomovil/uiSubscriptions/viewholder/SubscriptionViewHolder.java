package com.adif.elcanomovil.uiSubscriptions.viewholder;

import G2.l;
import O1.a;
import O1.b;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.commonViews.DayView;
import com.adif.elcanomovil.domain.entities.subscription.Destination;
import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.domain.entities.subscription.SubscriptionType;
import com.adif.elcanomovil.resources.StringUtils;
import com.adif.elcanomovil.uiSubscriptions.R;
import com.adif.elcanomovil.uiSubscriptions.adapters.SubscriptionsEvents;
import com.adif.elcanomovil.uiSubscriptions.databinding.ItemSubscriptionBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.switchmaterial.SwitchMaterial;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ=\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u001e\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00060\u0016j\u0002`\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR.\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00060\u0016j\u0002`\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010 ¨\u0006!"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/viewholder/SubscriptionViewHolder;", "Landroidx/recyclerview/widget/I0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "", "subscriptions", "()V", "", "color", "visibilityDayView", "paintStatusView", "(II)V", "paintGeneralView", "paintJourneyView", "paintTrainView", "paintViewInfoDays", "Landroid/content/Context;", "context", "Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;", "item", "Lkotlin/Function2;", "Lcom/adif/elcanomovil/uiSubscriptions/adapters/SubscriptionsEvents;", "Lcom/adif/elcanomovil/uiSubscriptions/adapters/SubscriptionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bind", "(Landroid/content/Context;Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;Lkotlin/jvm/functions/Function2;)V", "Lcom/adif/elcanomovil/uiSubscriptions/databinding/ItemSubscriptionBinding;", "itemBinding", "Lcom/adif/elcanomovil/uiSubscriptions/databinding/ItemSubscriptionBinding;", "Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;", "Lkotlin/jvm/functions/Function2;", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSubscriptionViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionViewHolder.kt\ncom/adif/elcanomovil/uiSubscriptions/viewholder/SubscriptionViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,194:1\n1#2:195\n13365#3,2:196\n*S KotlinDebug\n*F\n+ 1 SubscriptionViewHolder.kt\ncom/adif/elcanomovil/uiSubscriptions/viewholder/SubscriptionViewHolder\n*L\n146#1:196,2\n*E\n"})
/* loaded from: classes3.dex */
public final class SubscriptionViewHolder extends I0 {
    private Subscription item;
    private final ItemSubscriptionBinding itemBinding;
    private Function2<? super SubscriptionsEvents, ? super Subscription, Unit> listener;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionType.values().length];
            try {
                iArr[SubscriptionType.JOURNEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionType.TRAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionViewHolder(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ItemSubscriptionBinding bind = ItemSubscriptionBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.itemBinding = bind;
    }

    public static final void bind$lambda$0(SubscriptionViewHolder this$0, Subscription item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        Function2<? super SubscriptionsEvents, ? super Subscription, Unit> function2 = this$0.listener;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            function2 = null;
        }
        function2.invoke(SubscriptionsEvents.EVENT_TYPE_SHOW_DETAIL, item);
    }

    private final void paintGeneralView() {
        SwitchMaterial switchMaterial = this.itemBinding.switchActiveSubscripition;
        Subscription subscription = this.item;
        Subscription subscription2 = null;
        if (subscription == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
            subscription = null;
        }
        switchMaterial.setChecked(subscription.getActive());
        Subscription subscription3 = this.item;
        if (subscription3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
            subscription3 = null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[subscription3.getTypeSubscription().ordinal()];
        if (i == 1) {
            paintJourneyView();
        } else if (i == 2) {
            paintTrainView();
        }
        paintViewInfoDays();
        Subscription subscription4 = this.item;
        if (subscription4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
        } else {
            subscription2 = subscription4;
        }
        if (subscription2.getActive()) {
            paintStatusView(this.itemView.getContext().getColor(R.color.black), 8);
        } else {
            paintStatusView(this.itemView.getContext().getColor(R.color.black), 8);
        }
    }

    private final void paintJourneyView() {
        Unit unit;
        this.itemBinding.directionArrow.setVisibility(0);
        this.itemBinding.textViewTrainPrefix.setVisibility(8);
        this.itemBinding.textViewFor.setVisibility(0);
        this.itemBinding.textViewFrom.setVisibility(0);
        this.itemBinding.textViewTime.setVisibility(0);
        TextView textView = this.itemBinding.station;
        Subscription subscription = this.item;
        Subscription subscription2 = null;
        if (subscription == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
            subscription = null;
        }
        textView.setText(subscription.getOrigin().getName());
        Subscription subscription3 = this.item;
        if (subscription3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
            subscription3 = null;
        }
        Destination destination = subscription3.getDestination();
        if (destination != null) {
            this.itemBinding.stationTo.setVisibility(0);
            this.itemBinding.stationTo.setText(destination.getName());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.itemBinding.stationTo.setVisibility(8);
        }
        TextView textView2 = this.itemBinding.textViewDuration;
        Subscription subscription4 = this.item;
        if (subscription4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
            subscription4 = null;
        }
        textView2.setText(subscription4.getTimeStart());
        TextView textView3 = this.itemBinding.textViewTime;
        Subscription subscription5 = this.item;
        if (subscription5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
        } else {
            subscription2 = subscription5;
        }
        textView3.setText(subscription2.getTimeEnd());
    }

    private final void paintStatusView(int color, int visibilityDayView) {
        this.itemBinding.containerSubscriptionItem.setBackgroundColor(color);
        this.itemBinding.dayOne.setDisable(visibilityDayView);
        this.itemBinding.dayTwo.setDisable(visibilityDayView);
        this.itemBinding.dayThree.setDisable(visibilityDayView);
        this.itemBinding.dayFour.setDisable(visibilityDayView);
        this.itemBinding.dayFive.setDisable(visibilityDayView);
        this.itemBinding.daySix.setDisable(visibilityDayView);
        this.itemBinding.daySeven.setDisable(visibilityDayView);
    }

    private final void paintTrainView() {
        List split$default;
        this.itemBinding.directionArrow.setVisibility(4);
        this.itemBinding.textViewTrainPrefix.setVisibility(0);
        StringUtils.Companion companion = StringUtils.INSTANCE;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String string = this.itemView.getContext().getString(R.string.text_train_view_header);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Subscription subscription = this.item;
        Subscription subscription2 = null;
        if (subscription == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
            subscription = null;
        }
        companion.textStyle(context, string, subscription.getSubscriptionType(), R.font.open_sans_regular, this.itemView.getContext().getColor(R.color.white));
        TextView textView = this.itemBinding.stationTo;
        Subscription subscription3 = this.item;
        if (subscription3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
            subscription3 = null;
        }
        textView.setText(subscription3.getOrigin().getShortName());
        this.itemBinding.station.setVisibility(4);
        this.itemBinding.textViewInfoTrain.setVisibility(0);
        TextView textView2 = this.itemBinding.trainOperator;
        Subscription subscription4 = this.item;
        if (subscription4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
            subscription4 = null;
        }
        textView2.setText(subscription4.getOperator());
        TextView textView3 = this.itemBinding.trainType;
        Subscription subscription5 = this.item;
        if (subscription5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
            subscription5 = null;
        }
        textView3.setText(subscription5.getCommercialProduct());
        TextView textView4 = this.itemBinding.trainNumber;
        Subscription subscription6 = this.item;
        if (subscription6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
            subscription6 = null;
        }
        split$default = StringsKt__StringsKt.split$default(subscription6.getSubscriptionType(), new String[]{"-"}, false, 0, 6, (Object) null);
        String str = (String) CollectionsKt.firstOrNull(split$default);
        if (str == null) {
            str = "";
        }
        textView4.setText(str);
        this.itemBinding.textViewFrom.setVisibility(0);
        TextView textView5 = this.itemBinding.textViewDuration;
        StringBuilder sb = new StringBuilder();
        Subscription subscription7 = this.item;
        if (subscription7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
        } else {
            subscription2 = subscription7;
        }
        sb.append(subscription2.getTimeCenter());
        sb.append(this.itemView.getContext().getString(R.string.text_train));
        textView5.setText(sb.toString());
        this.itemBinding.textViewFor.setVisibility(8);
        this.itemBinding.textViewTime.setVisibility(8);
    }

    private final void paintViewInfoDays() {
        Subscription subscription = this.item;
        if (subscription == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
            subscription = null;
        }
        String str = subscription.getRepeats();
        Intrinsics.checkNotNullParameter(str, "str");
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        DayView dayOne = this.itemBinding.dayOne;
        Intrinsics.checkNotNullExpressionValue(dayOne, "dayOne");
        String string = this.itemView.getContext().getString(R.string.common_weekday_monday);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this.itemView.getContext().getString(R.string.accessibility_weekday_monday);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        DayView.initInfoView$default(dayOne, string, string2, false, false, 4, null);
        DayView dayTwo = this.itemBinding.dayTwo;
        Intrinsics.checkNotNullExpressionValue(dayTwo, "dayTwo");
        String string3 = this.itemView.getContext().getString(R.string.common_weekday_tuesday);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = this.itemView.getContext().getString(R.string.accessibility_weekday_tuesday);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        DayView.initInfoView$default(dayTwo, string3, string4, false, false, 4, null);
        DayView dayThree = this.itemBinding.dayThree;
        Intrinsics.checkNotNullExpressionValue(dayThree, "dayThree");
        String string5 = this.itemView.getContext().getString(R.string.common_weekday_wednesday);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = this.itemView.getContext().getString(R.string.accessibility_weekday_wednesday);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        DayView.initInfoView$default(dayThree, string5, string6, false, false, 4, null);
        DayView dayFour = this.itemBinding.dayFour;
        Intrinsics.checkNotNullExpressionValue(dayFour, "dayFour");
        String string7 = this.itemView.getContext().getString(R.string.common_weekday_thursday);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        String string8 = this.itemView.getContext().getString(R.string.accessibility_weekday_thursday);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        DayView.initInfoView$default(dayFour, string7, string8, false, false, 4, null);
        DayView dayFive = this.itemBinding.dayFive;
        Intrinsics.checkNotNullExpressionValue(dayFive, "dayFive");
        String string9 = this.itemView.getContext().getString(R.string.common_weekday_friday);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        String string10 = this.itemView.getContext().getString(R.string.accessibility_weekday_friday);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        DayView.initInfoView$default(dayFive, string9, string10, false, false, 4, null);
        DayView daySix = this.itemBinding.daySix;
        Intrinsics.checkNotNullExpressionValue(daySix, "daySix");
        String string11 = this.itemView.getContext().getString(R.string.common_weekday_saturday);
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        String string12 = this.itemView.getContext().getString(R.string.accessibility_weekday_saturday);
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        DayView.initInfoView$default(daySix, string11, string12, false, false, 4, null);
        DayView daySeven = this.itemBinding.daySeven;
        Intrinsics.checkNotNullExpressionValue(daySeven, "daySeven");
        String string13 = this.itemView.getContext().getString(R.string.common_weekday_sunday);
        Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
        String string14 = this.itemView.getContext().getString(R.string.accessibility_weekday_sunday);
        Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
        DayView.initInfoView$default(daySeven, string13, string14, false, false, 4, null);
        for (char c4 : charArray) {
            char upperCase = Character.toUpperCase(c4);
            if (upperCase == 'L') {
                DayView dayView = this.itemBinding.dayOne;
                String string15 = this.itemView.getContext().getString(R.string.common_weekday_monday);
                Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                String string16 = this.itemView.getContext().getString(R.string.accessibility_weekday_monday);
                Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                dayView.initInfoView(string15, string16, true, false);
            } else if (upperCase == 'M') {
                DayView dayView2 = this.itemBinding.dayTwo;
                String string17 = this.itemView.getContext().getString(R.string.common_weekday_tuesday);
                Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
                String string18 = this.itemView.getContext().getString(R.string.accessibility_weekday_tuesday);
                Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
                dayView2.initInfoView(string17, string18, true, false);
            } else if (upperCase == 'X') {
                DayView dayView3 = this.itemBinding.dayThree;
                String string19 = this.itemView.getContext().getString(R.string.common_weekday_wednesday);
                Intrinsics.checkNotNullExpressionValue(string19, "getString(...)");
                String string20 = this.itemView.getContext().getString(R.string.accessibility_weekday_wednesday);
                Intrinsics.checkNotNullExpressionValue(string20, "getString(...)");
                dayView3.initInfoView(string19, string20, true, false);
            } else if (upperCase == 'J') {
                DayView dayView4 = this.itemBinding.dayFour;
                String string21 = this.itemView.getContext().getString(R.string.common_weekday_thursday);
                Intrinsics.checkNotNullExpressionValue(string21, "getString(...)");
                String string22 = this.itemView.getContext().getString(R.string.accessibility_weekday_thursday);
                Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
                dayView4.initInfoView(string21, string22, true, false);
            } else if (upperCase == 'V') {
                DayView dayView5 = this.itemBinding.dayFive;
                String string23 = this.itemView.getContext().getString(R.string.common_weekday_friday);
                Intrinsics.checkNotNullExpressionValue(string23, "getString(...)");
                String string24 = this.itemView.getContext().getString(R.string.accessibility_weekday_friday);
                Intrinsics.checkNotNullExpressionValue(string24, "getString(...)");
                dayView5.initInfoView(string23, string24, true, false);
            } else if (upperCase == 'S') {
                DayView dayView6 = this.itemBinding.daySix;
                String string25 = this.itemView.getContext().getString(R.string.common_weekday_saturday);
                Intrinsics.checkNotNullExpressionValue(string25, "getString(...)");
                String string26 = this.itemView.getContext().getString(R.string.accessibility_weekday_saturday);
                Intrinsics.checkNotNullExpressionValue(string26, "getString(...)");
                dayView6.initInfoView(string25, string26, true, false);
            } else if (upperCase == 'D') {
                DayView dayView7 = this.itemBinding.daySeven;
                String string27 = this.itemView.getContext().getString(R.string.common_weekday_sunday);
                Intrinsics.checkNotNullExpressionValue(string27, "getString(...)");
                String string28 = this.itemView.getContext().getString(R.string.accessibility_weekday_sunday);
                Intrinsics.checkNotNullExpressionValue(string28, "getString(...)");
                dayView7.initInfoView(string27, string28, true, false);
            }
        }
    }

    private final void subscriptions() {
        this.itemBinding.switchActiveSubscripition.setOnCheckedChangeListener(new a(this, 0));
        this.itemBinding.dayOne.setOnClickListener(b.f1319b);
        this.itemBinding.dayTwo.setOnClickListener(b.f1320c);
        this.itemBinding.dayThree.setOnClickListener(b.f1321d);
        this.itemBinding.dayFour.setOnClickListener(b.f1322e);
        this.itemBinding.dayFive.setOnClickListener(b.f1323f);
        this.itemBinding.daySix.setOnClickListener(b.f1324g);
        this.itemBinding.daySeven.setOnClickListener(b.h);
    }

    public static final void subscriptions$lambda$1(SubscriptionViewHolder this$0, CompoundButton compoundButton, boolean z3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (compoundButton.isPressed()) {
            Subscription subscription = null;
            if (z3) {
                Function2<? super SubscriptionsEvents, ? super Subscription, Unit> function2 = this$0.listener;
                if (function2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    function2 = null;
                }
                SubscriptionsEvents subscriptionsEvents = SubscriptionsEvents.EVENT_TYPE_ENABLE_SUBSCRIPTION;
                Subscription subscription2 = this$0.item;
                if (subscription2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("item");
                } else {
                    subscription = subscription2;
                }
                function2.invoke(subscriptionsEvents, subscription);
                return;
            }
            Function2<? super SubscriptionsEvents, ? super Subscription, Unit> function22 = this$0.listener;
            if (function22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                function22 = null;
            }
            SubscriptionsEvents subscriptionsEvents2 = SubscriptionsEvents.EVENT_TYPE_DISABLE_SUBSCRIPTION;
            Subscription subscription3 = this$0.item;
            if (subscription3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("item");
            } else {
                subscription = subscription3;
            }
            function22.invoke(subscriptionsEvents2, subscription);
        }
    }

    public final void bind(Context context, Subscription item, Function2<? super SubscriptionsEvents, ? super Subscription, Unit> r4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(r4, "listener");
        this.item = item;
        this.listener = r4;
        subscriptions();
        paintGeneralView();
        this.itemView.setOnClickListener(new l(2, this, item));
    }
}
