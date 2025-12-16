package com.adif.elcanomovil.uiAvisa.components.home;

import android.content.Context;
import androidx.lifecycle.Q;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.domain.entities.avisa.incidence.Incidence;
import com.adif.elcanomovil.domain.usecases.avisa.incidence.GetIncidencesUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.station.GetAvisaStationCategoriesUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.station.GetAvisaStationsUseCase;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import com.adif.elcanomovil.uiAvisa.R;
import com.adif.elcanomovil.uiAvisa.components.authenticator.AuthenticationProvider;
import dagger.hilt.android.lifecycle.HiltViewModel;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@HiltViewModel
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u0013J\r\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u0013J\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0010J\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u0010J\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n '*\u0004\u0018\u00010\u00160\u00160&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010(R&\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0+0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u00106\u001a\b\u0012\u0004\u0012\u000202058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R#\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*0\u00158F¢\u0006\u0006\u001a\u0004\b@\u0010\u0018R\u001d\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0+0\u00158F¢\u0006\u0006\u001a\u0004\bB\u0010\u0018¨\u0006D"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/home/AvisaHomeViewModel;", "Landroidx/lifecycle/w0;", "Lcom/adif/elcanomovil/domain/usecases/avisa/incidence/GetIncidencesUseCase;", "getIncidencesUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/station/GetAvisaStationsUseCase;", "getStationsUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/station/GetAvisaStationCategoriesUseCase;", "getAvisaStationCategoriesUseCase", "Lcom/adif/elcanomovil/uiAvisa/components/authenticator/AuthenticationProvider;", "authProvider", "Landroid/content/Context;", "context", "<init>", "(Lcom/adif/elcanomovil/domain/usecases/avisa/incidence/GetIncidencesUseCase;Lcom/adif/elcanomovil/domain/usecases/avisa/station/GetAvisaStationsUseCase;Lcom/adif/elcanomovil/domain/usecases/avisa/station/GetAvisaStationCategoriesUseCase;Lcom/adif/elcanomovil/uiAvisa/components/authenticator/AuthenticationProvider;Landroid/content/Context;)V", "", "loadPreviousData", "()V", "Lkotlinx/coroutines/Job;", "fetchCategories", "()Lkotlinx/coroutines/Job;", "fetchStations", "Landroidx/lifecycle/Q;", "", "canContinue", "()Landroidx/lifecycle/Q;", "retryAuth", "fetchIncidences", "showErrorDialog", "navigateToCreateIncidence", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/Incidence;", "issue", "navigateToIncidenceDetails", "(Lcom/adif/elcanomovil/domain/entities/avisa/incidence/Incidence;)V", "Lcom/adif/elcanomovil/domain/usecases/avisa/incidence/GetIncidencesUseCase;", "Lcom/adif/elcanomovil/domain/usecases/avisa/station/GetAvisaStationsUseCase;", "Lcom/adif/elcanomovil/domain/usecases/avisa/station/GetAvisaStationCategoriesUseCase;", "Lcom/adif/elcanomovil/uiAvisa/components/authenticator/AuthenticationProvider;", "Landroid/content/Context;", "Landroidx/lifecycle/X;", "kotlin.jvm.PlatformType", "Landroidx/lifecycle/X;", "Landroidx/lifecycle/W;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceStation;", "_userListIncidences", "Landroidx/lifecycle/W;", "Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStation;", "_stationsList", "Lb1/f;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "navigationFlow", "Lb1/f;", "Lb1/a;", "navigation", "Lb1/a;", "getNavigation", "()Lb1/a;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "mandatoryUpdateActions$delegate", "Lkotlin/Lazy;", "getMandatoryUpdateActions", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "mandatoryUpdateActions", "getUserListIncidences", "userListIncidences", "getStationsList", "stationsList", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AvisaHomeViewModel extends w0 {
    private final W _stationsList;
    private final W _userListIncidences;
    private final AuthenticationProvider authProvider;
    private final X canContinue;
    private final Context context;
    private final GetAvisaStationCategoriesUseCase getAvisaStationCategoriesUseCase;
    private final GetIncidencesUseCase getIncidencesUseCase;
    private final GetAvisaStationsUseCase getStationsUseCase;

    /* renamed from: mandatoryUpdateActions$delegate, reason: from kotlin metadata */
    private final Lazy mandatoryUpdateActions;
    private final InterfaceC0266a navigation;
    private final b1.f navigationFlow;

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    @Inject
    public AvisaHomeViewModel(GetIncidencesUseCase getIncidencesUseCase, GetAvisaStationsUseCase getStationsUseCase, GetAvisaStationCategoriesUseCase getAvisaStationCategoriesUseCase, AuthenticationProvider authProvider, @ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(getIncidencesUseCase, "getIncidencesUseCase");
        Intrinsics.checkNotNullParameter(getStationsUseCase, "getStationsUseCase");
        Intrinsics.checkNotNullParameter(getAvisaStationCategoriesUseCase, "getAvisaStationCategoriesUseCase");
        Intrinsics.checkNotNullParameter(authProvider, "authProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.getIncidencesUseCase = getIncidencesUseCase;
        this.getStationsUseCase = getStationsUseCase;
        this.getAvisaStationCategoriesUseCase = getAvisaStationCategoriesUseCase;
        this.authProvider = authProvider;
        this.context = context;
        this.canContinue = new Q(Boolean.FALSE);
        this._userListIncidences = new W();
        this._stationsList = new W();
        b1.f fVar = new b1.f();
        this.navigationFlow = fVar;
        this.navigation = fVar;
        loadPreviousData();
        this.mandatoryUpdateActions = LazyKt.lazy(new l(this));
    }

    public static final /* synthetic */ void access$loadPreviousData(AvisaHomeViewModel avisaHomeViewModel) {
        avisaHomeViewModel.loadPreviousData();
    }

    private final Job fetchCategories() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getMain(), null, new f(this, null), 2, null);
        return launch$default;
    }

    private final Job fetchStations() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getMain(), null, new k(this, null), 2, null);
        return launch$default;
    }

    private final AlertActions getMandatoryUpdateActions() {
        return (AlertActions) this.mandatoryUpdateActions.getValue();
    }

    public final void loadPreviousData() {
        fetchCategories();
        fetchStations();
    }

    public final Q canContinue() {
        return this.canContinue;
    }

    public final Job fetchIncidences() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getMain(), null, new i(this, null), 2, null);
        return launch$default;
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }

    public final Q getStationsList() {
        return this._stationsList;
    }

    public final Q getUserListIncidences() {
        return this._userListIncidences;
    }

    public final void navigateToCreateIncidence() {
        this.navigationFlow.b(new Navigation.RootDirection(BottomNavFragmentDirections.INSTANCE.toNewIssueFragment(), null, 2, null));
    }

    public final void navigateToIncidenceDetails(Incidence issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        this.navigationFlow.b(new Navigation.Direction(AvisaHomeFragmentDirections.INSTANCE.toIssueDetailsFragment(issue.getId()), null, 2, null));
    }

    public final Job retryAuth() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getIO(), null, new m(this, null), 2, null);
        return launch$default;
    }

    public final void showErrorDialog() {
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        String string = this.context.getString(R.string.generic_error_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this.context.getString(R.string.generic_error_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.navigationFlow.b(new Navigation.RootDirection(companion.toAlertDialog(false, false, string, string2, getMandatoryUpdateActions(), AlertType.WARNING), null, 2, null));
    }
}
