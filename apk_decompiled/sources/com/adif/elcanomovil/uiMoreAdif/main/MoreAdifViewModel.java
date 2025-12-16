package com.adif.elcanomovil.uiMoreAdif.main;

import android.net.Uri;
import androidx.lifecycle.w0;
import b1.InterfaceC0266a;
import b1.f;
import com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab;
import com.adif.elcanomovil.commonNavGraph.arguments.ChildDirections;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.navigation.DeeplinkRoutes;
import com.adif.elcanomovil.commonNavGraph.navigation.IntentAction;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.uiMoreAdif.MoreActions;
import com.adif.elcanomovil.uiMoreAdif.MoreItem;
import com.adif.elcanomovil.uiMoreAdif.OptionsProvider;
import com.adif.elcanomovil.uiMoreAdif.main.MoreAdifFragmentDirections;
import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@HiltViewModel
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0011\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/main/MoreAdifViewModel;", "Landroidx/lifecycle/w0;", "Lcom/adif/elcanomovil/uiMoreAdif/OptionsProvider;", "provider", "<init>", "(Lcom/adif/elcanomovil/uiMoreAdif/OptionsProvider;)V", "Lcom/adif/elcanomovil/uiMoreAdif/MoreActions;", "item", "", "optionItemTapped", "(Lcom/adif/elcanomovil/uiMoreAdif/MoreActions;)V", "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "", NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "checkDestination", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "Lcom/adif/elcanomovil/uiMoreAdif/OptionsProvider;", "Lb1/f;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "navigationFlow", "Lb1/f;", "Lb1/a;", "navigation", "Lb1/a;", "getNavigation", "()Lb1/a;", "", "Lcom/adif/elcanomovil/uiMoreAdif/MoreItem;", "getItems", "()Ljava/util/List;", FirebaseAnalytics.Param.ITEMS, "ui-more-adif_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MoreAdifViewModel extends w0 {
    private final InterfaceC0266a navigation;
    private final f navigationFlow;
    private final OptionsProvider provider;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MoreActions.values().length];
            try {
                iArr[MoreActions.HELP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MoreActions.ACCESSIBILITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MoreActions.CONTACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MoreActions.ABOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MoreActions.NOTICES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MoreActions.TRAIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MoreActions.FAVOURITES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MoreActions.SUBSCRIPTIONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MoreActions.LOST_OBJECTS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MoreActions.NETWORK_STATUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public MoreAdifViewModel(OptionsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
        f fVar = new f();
        this.navigationFlow = fVar;
        this.navigation = fVar;
    }

    public final void checkDestination(String commercialNumber, String originStationCode, String destinationStationCode, Long launchingDate) {
    }

    public final List<MoreItem> getItems() {
        return this.provider.getItems();
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }

    public final void optionItemTapped(MoreActions item) {
        Object direction;
        Intrinsics.checkNotNullParameter(item, "item");
        f fVar = this.navigationFlow;
        switch (WhenMappings.$EnumSwitchMapping$0[item.ordinal()]) {
            case 1:
                direction = new Navigation.Direction(MoreAdifFragmentDirections.INSTANCE.toHelpFragment(), null, 2, null);
                break;
            case 2:
                direction = new Navigation.Direction(MoreAdifFragmentDirections.INSTANCE.toAccessibilityFragment(), null, 2, null);
                break;
            case 3:
                direction = new Navigation.Direction(MoreAdifFragmentDirections.INSTANCE.toContactFragment(), null, 2, null);
                break;
            case 4:
                direction = new Navigation.Direction(MoreAdifFragmentDirections.INSTANCE.toAboutFragment(), null, 2, null);
                break;
            case 5:
                direction = new Navigation.Direction(MoreAdifFragmentDirections.INSTANCE.toAvisaHomeFragment(), null, 2, null);
                break;
            case 6:
                direction = new Navigation.Direction(MoreAdifFragmentDirections.Companion.toTrainSituationFragment$default(MoreAdifFragmentDirections.INSTANCE, null, null, null, 0L, null, null, null, NavArguments.ARG_DYNAMIC_MORE_ADIF, WorkQueueKt.MASK, null), null, 2, null);
                break;
            case 7:
                ChildDirections.Companion companion = ChildDirections.INSTANCE;
                Uri build = Uri.parse(DeeplinkRoutes.favourites).buildUpon().appendQueryParameter(NavArguments.ARG_FOCUS_FAVOURITES, "true").build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                direction = new Navigation.TabDirection(new BottomNavInitialTab.MoreAdif(companion.fromRoutes(build)));
                break;
            case 8:
                direction = new Navigation.Direction(MoreAdifFragmentDirections.INSTANCE.toSubscriptionHomeFragment(), null, 2, null);
                break;
            case 9:
                Uri parse = Uri.parse("https://adif.findmylost.es");
                Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                direction = new Navigation.Intent(new IntentAction.View(parse));
                break;
            case 10:
                Uri parse2 = Uri.parse("https://www.adif.es/estado-de-la-red");
                Intrinsics.checkNotNullExpressionValue(parse2, "parse(...)");
                direction = new Navigation.Intent(new IntentAction.View(parse2));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        fVar.b(direction);
    }
}
