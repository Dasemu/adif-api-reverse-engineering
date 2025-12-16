package com.adif.elcanomovil.main;

import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.n0;
import androidx.lifecycle.q0;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.R;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.navigation.IntentAction;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationEvent;
import com.adif.elcanomovil.commonNavGraph.viewmodel.ArgsViewModel;
import com.adif.elcanomovil.domain.entities.VersionUpdateStatus;
import com.adif.elcanomovil.domain.usecases.GetVersionUpdateStatusUseCase;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.io.File;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00102\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00102\b\b\u0001\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u0012J\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b#\u0010\u0018J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010*J\u0019\u0010.\u001a\u0004\u0018\u00010(2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u0010!J\u000f\u00101\u001a\u00020\u0010H\u0002¢\u0006\u0004\b1\u0010!J\u000f\u00102\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u0010!J\u001b\u00104\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b4\u00105J\u001b\u00106\u001a\u0004\u0018\u00010\u00192\b\b\u0001\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00108R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00150?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00150B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00190?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010AR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00190B8\u0006¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020(0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010AR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020(0B8\u0006¢\u0006\f\n\u0004\bK\u0010D\u001a\u0004\bL\u0010FR*\u0010M\u001a\u0004\u0018\u0001038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bM\u0010N\u0012\u0004\bS\u0010!\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001b\u0010_\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010Y\u001a\u0004\b^\u0010[R\u001b\u0010b\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010Y\u001a\u0004\ba\u0010[R\u001b\u0010e\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010Y\u001a\u0004\bd\u0010[¨\u0006f"}, d2 = {"Lcom/adif/elcanomovil/main/BottomNavViewModel;", "Lcom/adif/elcanomovil/commonNavGraph/viewmodel/ArgsViewModel;", "Landroidx/lifecycle/n0;", "savedStateHandle", "Lcom/adif/elcanomovil/domain/usecases/GetVersionUpdateStatusUseCase;", "getVersionUpdateStatusUseCase", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "preferenceStorage", "Ld1/g;", "stringProvider", "Ld1/f;", "rootDetector", "<init>", "(Landroidx/lifecycle/n0;Lcom/adif/elcanomovil/domain/usecases/GetVersionUpdateStatusUseCase;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Ld1/g;Ld1/f;)V", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;", "action", "", "handleMandatoryTermnsAlertResult", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;)V", "handleMandatoryUpdateAlertResult", "handleOptionalUpdateAlertResult", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;", "tab", "onTabNavigationItemChanged", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;)V", "", "destinationId", "onNavigationChanged", "(I)V", "itemId", "onNavigationItemReselected", "handleRootDetectedAlertResult", "checkConditions", "()V", "initialTab", "handleInitialTab", "Landroid/net/Uri;", "deepLinkData", "handleDeepLink", "(Landroid/net/Uri;)V", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "createTermsAlert", "()Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "createRootDetectedAlert", "Lcom/adif/elcanomovil/domain/entities/VersionUpdateStatus;", "versionUpdateStatus", "createAlert", "(Lcom/adif/elcanomovil/domain/entities/VersionUpdateStatus;)Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "checkUpdateVersion", "updateButtonTapped", "exitButtonTapped", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationEvent$BottomNavTab;", "toBottomNavTab", "(I)Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationEvent$BottomNavTab;", "toBaseFragment", "(I)Ljava/lang/Integer;", "Landroidx/lifecycle/n0;", "Lcom/adif/elcanomovil/domain/usecases/GetVersionUpdateStatusUseCase;", "getGetVersionUpdateStatusUseCase", "()Lcom/adif/elcanomovil/domain/usecases/GetVersionUpdateStatusUseCase;", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "Ld1/g;", "Ld1/f;", "Lb1/f;", "_selectedTab", "Lb1/f;", "Lb1/a;", "selectedTab", "Lb1/a;", "getSelectedTab", "()Lb1/a;", "_popBackTo", "popBackTo", "getPopBackTo", "navigationFlow", "navigation", "getNavigation", "currentDestination", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationEvent$BottomNavTab;", "getCurrentDestination$app_proNon_corporateRelease", "()Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationEvent$BottomNavTab;", "setCurrentDestination$app_proNon_corporateRelease", "(Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationEvent$BottomNavTab;)V", "getCurrentDestination$app_proNon_corporateRelease$annotations", "", "updateUrl", "Ljava/lang/String;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "mandatoryTermnsActions$delegate", "Lkotlin/Lazy;", "getMandatoryTermnsActions", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "mandatoryTermnsActions", "mandatoryUpdateActions$delegate", "getMandatoryUpdateActions", "mandatoryUpdateActions", "optionalUpdateActions$delegate", "getOptionalUpdateActions", "optionalUpdateActions", "rootDetectedActions$delegate", "getRootDetectedActions", "rootDetectedActions", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomNavViewModel extends ArgsViewModel {
    private final b1.f _popBackTo;
    private final b1.f _selectedTab;
    private NavigationEvent.BottomNavTab currentDestination;
    private final GetVersionUpdateStatusUseCase getVersionUpdateStatusUseCase;

    /* renamed from: mandatoryTermnsActions$delegate, reason: from kotlin metadata */
    private final Lazy mandatoryTermnsActions;

    /* renamed from: mandatoryUpdateActions$delegate, reason: from kotlin metadata */
    private final Lazy mandatoryUpdateActions;
    private final InterfaceC0266a navigation;
    private final b1.f navigationFlow;

    /* renamed from: optionalUpdateActions$delegate, reason: from kotlin metadata */
    private final Lazy optionalUpdateActions;
    private final InterfaceC0266a popBackTo;
    private final PreferenceStorage preferenceStorage;

    /* renamed from: rootDetectedActions$delegate, reason: from kotlin metadata */
    private final Lazy rootDetectedActions;
    private final d1.f rootDetector;
    private final n0 savedStateHandle;
    private final InterfaceC0266a selectedTab;
    private final d1.g stringProvider;
    private String updateUrl;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlertAction.Style.values().length];
            try {
                iArr[AlertAction.Style.NEGATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertAction.Style.POSITIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public BottomNavViewModel(n0 savedStateHandle, GetVersionUpdateStatusUseCase getVersionUpdateStatusUseCase, PreferenceStorage preferenceStorage, d1.g stringProvider, d1.f rootDetector) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(getVersionUpdateStatusUseCase, "getVersionUpdateStatusUseCase");
        Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
        Intrinsics.checkNotNullParameter(stringProvider, "stringProvider");
        Intrinsics.checkNotNullParameter(rootDetector, "rootDetector");
        this.savedStateHandle = savedStateHandle;
        this.getVersionUpdateStatusUseCase = getVersionUpdateStatusUseCase;
        this.preferenceStorage = preferenceStorage;
        this.stringProvider = stringProvider;
        this.rootDetector = rootDetector;
        b1.f fVar = new b1.f();
        this._selectedTab = fVar;
        this.selectedTab = fVar;
        b1.f fVar2 = new b1.f();
        this._popBackTo = fVar2;
        this.popBackTo = fVar2;
        b1.f fVar3 = new b1.f();
        this.navigationFlow = fVar3;
        this.navigation = fVar3;
        this.mandatoryTermnsActions = LazyKt.lazy(new l(this));
        this.mandatoryUpdateActions = LazyKt.lazy(new m(this));
        this.optionalUpdateActions = LazyKt.lazy(new n(this));
        this.rootDetectedActions = LazyKt.lazy(new o(this));
        Bundle arguments = getArguments();
        Object obj = arguments != null ? arguments.get("initialTab") : null;
        handleInitialTab(obj instanceof BottomNavInitialTab ? (BottomNavInitialTab) obj : null);
    }

    public static final /* synthetic */ b1.f access$getNavigationFlow$p(BottomNavViewModel bottomNavViewModel) {
        return bottomNavViewModel.navigationFlow;
    }

    private final void checkUpdateVersion() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new k(this, null), 3, null);
    }

    public final Navigation createAlert(VersionUpdateStatus versionUpdateStatus) {
        if (versionUpdateStatus instanceof VersionUpdateStatus.Forced) {
            this.updateUrl = ((VersionUpdateStatus.Forced) versionUpdateStatus).getUrl();
            return new Navigation.Direction(BottomNavFragmentDirections.INSTANCE.toAlertDialog(true, false, ((d1.h) this.stringProvider).a(R.string.update_title), ((d1.h) this.stringProvider).a(R.string.update_mandatory_message), getMandatoryUpdateActions(), AlertType.INFO), null, 2, null);
        }
        if (versionUpdateStatus instanceof VersionUpdateStatus.Optional) {
            this.updateUrl = ((VersionUpdateStatus.Optional) versionUpdateStatus).getUrl();
            return new Navigation.Direction(BottomNavFragmentDirections.INSTANCE.toAlertDialog(false, true, ((d1.h) this.stringProvider).a(R.string.update_title), ((d1.h) this.stringProvider).a(R.string.update_optional_message), getOptionalUpdateActions(), AlertType.INFO), null, 2, null);
        }
        if (Intrinsics.areEqual(versionUpdateStatus, VersionUpdateStatus.Valid.INSTANCE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Navigation createRootDetectedAlert() {
        return new Navigation.Direction(BottomNavFragmentDirections.INSTANCE.toAlertDialog(true, false, ((d1.h) this.stringProvider).a(R.string.root_detection_title), ((d1.h) this.stringProvider).a(R.string.root_detection_message), getRootDetectedActions(), AlertType.ERROR), null, 2, null);
    }

    private final Navigation createTermsAlert() {
        return new Navigation.Direction(BottomNavFragmentDirections.INSTANCE.toAlertDialog(true, false, ((d1.h) this.stringProvider).a(R.string.about_conditions), ((d1.h) this.stringProvider).a(R.string.about_conditions_content), getMandatoryTermnsActions(), AlertType.INFO), null, 2, null);
    }

    private final void exitButtonTapped() {
        System.exit(-1);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public static /* synthetic */ void getCurrentDestination$app_proNon_corporateRelease$annotations() {
    }

    private final AlertActions getMandatoryTermnsActions() {
        return (AlertActions) this.mandatoryTermnsActions.getValue();
    }

    private final AlertActions getMandatoryUpdateActions() {
        return (AlertActions) this.mandatoryUpdateActions.getValue();
    }

    private final AlertActions getOptionalUpdateActions() {
        return (AlertActions) this.optionalUpdateActions.getValue();
    }

    private final AlertActions getRootDetectedActions() {
        return (AlertActions) this.rootDetectedActions.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void handleDeepLink(Uri deepLinkData) {
        Object home;
        List<String> pathSegments = deepLinkData.getPathSegments();
        b1.f fVar = this._selectedTab;
        String str = pathSegments.get(0);
        if (str != null) {
            switch (str.hashCode()) {
                case -219506315:
                    if (str.equals("moreAdif")) {
                        home = BottomNavInitialTab.INSTANCE.getMORE_ADIF();
                        break;
                    }
                    break;
                case 3208415:
                    if (str.equals("home")) {
                        home = BottomNavInitialTab.INSTANCE.getHOME();
                        break;
                    }
                    break;
                case 848434687:
                    if (str.equals(NavArguments.ARG_DYNAMIC_DEPARTURES)) {
                        home = BottomNavInitialTab.INSTANCE.getDEPARTURES();
                        break;
                    }
                    break;
                case 1318331839:
                    if (str.equals("stations")) {
                        home = BottomNavInitialTab.INSTANCE.getSTATIONS();
                        break;
                    }
                    break;
            }
            fVar.b(home);
        }
        home = BottomNavInitialTab.INSTANCE.getHOME();
        fVar.b(home);
    }

    private final void handleInitialTab(BottomNavInitialTab initialTab) {
        if (initialTab == null) {
            return;
        }
        Boolean bool = (Boolean) this.savedStateHandle.c("arguments_handled");
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        this._selectedTab.b(initialTab);
        this.savedStateHandle.d(Boolean.TRUE, "arguments_handled");
    }

    private final Integer toBaseFragment(int itemId) {
        switch (itemId) {
            case R.id.departures_tab_navigation /* 2131296513 */:
                return Integer.valueOf(R.id.departuresFragment);
            case R.id.home_tab_navigation /* 2131296654 */:
                return Integer.valueOf(R.id.homeFragment);
            case R.id.more_adif_tab_navigation /* 2131296817 */:
                return Integer.valueOf(R.id.moreAdifFragment);
            case R.id.stations_tab_navigation /* 2131297100 */:
                return Integer.valueOf(R.id.stationsFragment);
            default:
                return null;
        }
    }

    private final NavigationEvent.BottomNavTab toBottomNavTab(int destinationId) {
        switch (destinationId) {
            case R.id.departuresFragment /* 2131296512 */:
                return NavigationEvent.BottomNavTab.Departures;
            case R.id.homeFragment /* 2131296653 */:
                return NavigationEvent.BottomNavTab.Home;
            case R.id.moreAdifFragment /* 2131296816 */:
                return NavigationEvent.BottomNavTab.MoreAdif;
            case R.id.stationsFragment /* 2131297098 */:
                return NavigationEvent.BottomNavTab.Station;
            default:
                return null;
        }
    }

    private final void updateButtonTapped() {
        String str = this.updateUrl;
        if (str == null) {
            return;
        }
        b1.f fVar = this.navigationFlow;
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        fVar.b(new Navigation.Intent(new IntentAction.View(parse)));
        this.updateUrl = null;
    }

    public final void checkConditions() {
        this.rootDetector.getClass();
        String[] strArr = {"/system/bin/su", "/system/xbin/su", "/system/app/Superuser.apk", "/sbin/su", "/system/bin/.ext/.su", "/system/usr/we-need-root/su-backup", "/system/xbin/mu"};
        for (int i = 0; i < 7; i++) {
            if (new File(strArr[i]).exists()) {
                this.navigationFlow.b(createRootDetectedAlert());
                return;
            }
        }
        if (this.preferenceStorage.isTermsAccepted()) {
            checkUpdateVersion();
        } else {
            this.navigationFlow.b(createTermsAlert());
        }
    }

    /* renamed from: getCurrentDestination$app_proNon_corporateRelease, reason: from getter */
    public final NavigationEvent.BottomNavTab getCurrentDestination() {
        return this.currentDestination;
    }

    public final GetVersionUpdateStatusUseCase getGetVersionUpdateStatusUseCase() {
        return this.getVersionUpdateStatusUseCase;
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }

    public final InterfaceC0266a getPopBackTo() {
        return this.popBackTo;
    }

    public final InterfaceC0266a getSelectedTab() {
        return this.selectedTab;
    }

    public final void handleMandatoryTermnsAlertResult(AlertAction.Style action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            exitButtonTapped();
        } else {
            if (i != 2) {
                return;
            }
            this.preferenceStorage.setTermsAccepted(true);
            checkUpdateVersion();
        }
    }

    public final void handleMandatoryUpdateAlertResult(AlertAction.Style action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            exitButtonTapped();
        } else {
            if (i != 2) {
                return;
            }
            updateButtonTapped();
        }
    }

    public final void handleOptionalUpdateAlertResult(AlertAction.Style action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action == AlertAction.Style.POSITIVE) {
            updateButtonTapped();
        }
    }

    public final void handleRootDetectedAlertResult(AlertAction.Style action) {
        Intrinsics.checkNotNullParameter(action, "action");
        exitButtonTapped();
    }

    public final void onNavigationChanged(int destinationId) {
        NavigationEvent.BottomNavTab bottomNavTab = toBottomNavTab(destinationId);
        if (bottomNavTab != null) {
            this.currentDestination = bottomNavTab;
        }
    }

    public final void onNavigationItemReselected(int itemId) {
        Integer baseFragment = toBaseFragment(itemId);
        if (baseFragment != null) {
            this._popBackTo.b(Integer.valueOf(baseFragment.intValue()));
        }
    }

    public final void onTabNavigationItemChanged(BottomNavInitialTab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this._selectedTab.b(tab);
    }

    public final void setCurrentDestination$app_proNon_corporateRelease(NavigationEvent.BottomNavTab bottomNavTab) {
        this.currentDestination = bottomNavTab;
    }
}
