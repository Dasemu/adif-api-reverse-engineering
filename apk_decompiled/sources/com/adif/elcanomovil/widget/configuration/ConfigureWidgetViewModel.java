package com.adif.elcanomovil.widget.configuration;

import androidx.lifecycle.Q;
import androidx.lifecycle.X;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import b1.InterfaceC0266a;
import b1.f;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.adif.elcanomovil.uiDepartures.views.StationAction;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@HiltViewModel
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u001e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001f\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010%R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0&8\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010%R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c0&8\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u0016\u00101\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020;0>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lcom/adif/elcanomovil/widget/configuration/ConfigureWidgetViewModel;", "Landroidx/lifecycle/w0;", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "preferenceStorage", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "getStationByIdUseCase", "<init>", "(Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;)V", "", "stationCode", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "loadStationInfo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "checkEnableCreateWidgetButton", "()V", "handleSearchButtonTap", "handleSearchToButtonTap", "createWidget", "switchStation", "Lkotlinx/coroutines/Job;", "changeStation", "(Ljava/lang/String;)Lkotlinx/coroutines/Job;", "changeStationTo", "Lcom/adif/elcanomovil/uiDepartures/views/StationAction;", "action", "handleHeaderButtonTap", "(Lcom/adif/elcanomovil/uiDepartures/views/StationAction;)V", "", "it", "handleTrainTypeChange", "(Z)V", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "Landroidx/lifecycle/X;", "Lcom/adif/elcanomovil/widget/configuration/WidgetViewConfigData;", "_viewData", "Landroidx/lifecycle/X;", "Landroidx/lifecycle/Q;", "viewData", "Landroidx/lifecycle/Q;", "getViewData", "()Landroidx/lifecycle/Q;", "_showCreateWidgetButton", "showCreateWidgetButton", "getShowCreateWidgetButton", "_finishCreateWidget", "finishCreateWidget", "getFinishCreateWidget", "isCercanias", "Z", "", "widgetId", "I", "getWidgetId", "()I", "setWidgetId", "(I)V", "Lb1/f;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "navigationFlow", "Lb1/f;", "Lb1/a;", "navigation", "Lb1/a;", "getNavigation", "()Lb1/a;", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfigureWidgetViewModel extends w0 {
    private X _finishCreateWidget;
    private X _showCreateWidgetButton;
    private X _viewData;
    private final Q finishCreateWidget;
    private final GetStationByIdUseCase getStationByIdUseCase;
    private boolean isCercanias;
    private final InterfaceC0266a navigation;
    private final f navigationFlow;
    private final PreferenceStorage preferenceStorage;
    private final Q showCreateWidgetButton;
    private final Q viewData;
    private int widgetId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StationAction.values().length];
            try {
                iArr[StationAction.SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StationAction.SEARCH_TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StationAction.CREATE_WIDGET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StationAction.SWITCH_STATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    /* JADX WARN: Type inference failed for: r10v2, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    /* JADX WARN: Type inference failed for: r10v3, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    @Inject
    public ConfigureWidgetViewModel(PreferenceStorage preferenceStorage, GetStationByIdUseCase getStationByIdUseCase) {
        Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
        Intrinsics.checkNotNullParameter(getStationByIdUseCase, "getStationByIdUseCase");
        this.preferenceStorage = preferenceStorage;
        this.getStationByIdUseCase = getStationByIdUseCase;
        ?? q4 = new Q();
        this._viewData = q4;
        this.viewData = q4;
        ?? q5 = new Q();
        this._showCreateWidgetButton = q5;
        this.showCreateWidgetButton = q5;
        ?? q6 = new Q();
        this._finishCreateWidget = q6;
        this.finishCreateWidget = q6;
        this.isCercanias = true;
        f fVar = new f();
        this.navigationFlow = fVar;
        this.navigation = fVar;
        this._viewData.j(new WidgetViewConfigData(null, null, null, null, null, null, 45, null));
        X x3 = this._viewData;
        x3.k(x3.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkEnableCreateWidgetButton() {
        String stationToCode;
        String stationName;
        String stationToName;
        WidgetViewConfigData widgetViewConfigData = (WidgetViewConfigData) this._viewData.d();
        if (widgetViewConfigData != null) {
            X x3 = this._showCreateWidgetButton;
            String stationCode = widgetViewConfigData.getStationCode();
            x3.k(Boolean.valueOf(stationCode != null && stationCode.length() > 0 && (stationToCode = widgetViewConfigData.getStationToCode()) != null && stationToCode.length() > 0 && (stationName = widgetViewConfigData.getStationName()) != null && stationName.length() > 0 && (stationToName = widgetViewConfigData.getStationToName()) != null && stationToName.length() > 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x0017, B:9:0x002a, B:10:0x0030, B:12:0x003a, B:13:0x0040, B:15:0x004a, B:16:0x0050, B:18:0x005a, B:19:0x005e, B:21:0x0072, B:23:0x0080, B:25:0x008a, B:29:0x0099, B:38:0x0012), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x0017, B:9:0x002a, B:10:0x0030, B:12:0x003a, B:13:0x0040, B:15:0x004a, B:16:0x0050, B:18:0x005a, B:19:0x005e, B:21:0x0072, B:23:0x0080, B:25:0x008a, B:29:0x0099, B:38:0x0012), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x0017, B:9:0x002a, B:10:0x0030, B:12:0x003a, B:13:0x0040, B:15:0x004a, B:16:0x0050, B:18:0x005a, B:19:0x005e, B:21:0x0072, B:23:0x0080, B:25:0x008a, B:29:0x0099, B:38:0x0012), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x0017, B:9:0x002a, B:10:0x0030, B:12:0x003a, B:13:0x0040, B:15:0x004a, B:16:0x0050, B:18:0x005a, B:19:0x005e, B:21:0x0072, B:23:0x0080, B:25:0x008a, B:29:0x0099, B:38:0x0012), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x0017, B:9:0x002a, B:10:0x0030, B:12:0x003a, B:13:0x0040, B:15:0x004a, B:16:0x0050, B:18:0x005a, B:19:0x005e, B:21:0x0072, B:23:0x0080, B:25:0x008a, B:29:0x0099, B:38:0x0012), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x0017, B:9:0x002a, B:10:0x0030, B:12:0x003a, B:13:0x0040, B:15:0x004a, B:16:0x0050, B:18:0x005a, B:19:0x005e, B:21:0x0072, B:23:0x0080, B:25:0x008a, B:29:0x0099, B:38:0x0012), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void createWidget() {
        /*
            r13 = this;
            com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage r0 = r13.preferenceStorage     // Catch: java.lang.Exception -> Lf
            java.util.Map r0 = r0.getWidgetInfo()     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto L12
            java.util.Map r0 = kotlin.collections.MapsKt.toMutableMap(r0)     // Catch: java.lang.Exception -> Lf
            if (r0 != 0) goto L17
            goto L12
        Lf:
            r0 = move-exception
            goto Lad
        L12:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Exception -> Lf
            r0.<init>()     // Catch: java.lang.Exception -> Lf
        L17:
            int r1 = r13.widgetId     // Catch: java.lang.Exception -> Lf
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Lf
            com.adif.elcanomovil.serviceStorage.model.FavouriteEntity r2 = new com.adif.elcanomovil.serviceStorage.model.FavouriteEntity     // Catch: java.lang.Exception -> Lf
            androidx.lifecycle.Q r3 = r13.viewData     // Catch: java.lang.Exception -> Lf
            java.lang.Object r3 = r3.d()     // Catch: java.lang.Exception -> Lf
            com.adif.elcanomovil.widget.configuration.WidgetViewConfigData r3 = (com.adif.elcanomovil.widget.configuration.WidgetViewConfigData) r3     // Catch: java.lang.Exception -> Lf
            r4 = 0
            if (r3 == 0) goto L2f
            java.lang.String r3 = r3.getStationCode()     // Catch: java.lang.Exception -> Lf
            goto L30
        L2f:
            r3 = r4
        L30:
            androidx.lifecycle.Q r5 = r13.viewData     // Catch: java.lang.Exception -> Lf
            java.lang.Object r5 = r5.d()     // Catch: java.lang.Exception -> Lf
            com.adif.elcanomovil.widget.configuration.WidgetViewConfigData r5 = (com.adif.elcanomovil.widget.configuration.WidgetViewConfigData) r5     // Catch: java.lang.Exception -> Lf
            if (r5 == 0) goto L3f
            java.lang.String r5 = r5.getStationName()     // Catch: java.lang.Exception -> Lf
            goto L40
        L3f:
            r5 = r4
        L40:
            androidx.lifecycle.Q r6 = r13.viewData     // Catch: java.lang.Exception -> Lf
            java.lang.Object r6 = r6.d()     // Catch: java.lang.Exception -> Lf
            com.adif.elcanomovil.widget.configuration.WidgetViewConfigData r6 = (com.adif.elcanomovil.widget.configuration.WidgetViewConfigData) r6     // Catch: java.lang.Exception -> Lf
            if (r6 == 0) goto L4f
            java.lang.String r6 = r6.getStationToCode()     // Catch: java.lang.Exception -> Lf
            goto L50
        L4f:
            r6 = r4
        L50:
            androidx.lifecycle.Q r7 = r13.viewData     // Catch: java.lang.Exception -> Lf
            java.lang.Object r7 = r7.d()     // Catch: java.lang.Exception -> Lf
            com.adif.elcanomovil.widget.configuration.WidgetViewConfigData r7 = (com.adif.elcanomovil.widget.configuration.WidgetViewConfigData) r7     // Catch: java.lang.Exception -> Lf
            if (r7 == 0) goto L5e
            java.lang.String r4 = r7.getStationToName()     // Catch: java.lang.Exception -> Lf
        L5e:
            r7 = r4
            java.lang.String r8 = ""
            boolean r4 = r13.isCercanias     // Catch: java.lang.Exception -> Lf
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> Lf
            androidx.lifecycle.Q r4 = r13.viewData     // Catch: java.lang.Exception -> Lf
            java.lang.Object r4 = r4.d()     // Catch: java.lang.Exception -> Lf
            com.adif.elcanomovil.widget.configuration.WidgetViewConfigData r4 = (com.adif.elcanomovil.widget.configuration.WidgetViewConfigData) r4     // Catch: java.lang.Exception -> Lf
            r10 = 0
            if (r4 == 0) goto L7d
            java.lang.Boolean r4 = r4.getStationIsRodalies()     // Catch: java.lang.Exception -> Lf
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lf
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r11)     // Catch: java.lang.Exception -> Lf
            goto L7e
        L7d:
            r4 = r10
        L7e:
            if (r4 == 0) goto L99
            androidx.lifecycle.Q r4 = r13.viewData     // Catch: java.lang.Exception -> Lf
            java.lang.Object r4 = r4.d()     // Catch: java.lang.Exception -> Lf
            com.adif.elcanomovil.widget.configuration.WidgetViewConfigData r4 = (com.adif.elcanomovil.widget.configuration.WidgetViewConfigData) r4     // Catch: java.lang.Exception -> Lf
            if (r4 == 0) goto L95
            java.lang.Boolean r4 = r4.getStationToIsRodalies()     // Catch: java.lang.Exception -> Lf
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lf
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r11)     // Catch: java.lang.Exception -> Lf
            goto L96
        L95:
            r4 = r10
        L96:
            if (r4 == 0) goto L99
            r10 = 1
        L99:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Exception -> Lf
            r12 = 0
            r4 = r3
            r3 = 0
            r11 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Lf
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lf
            com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage r1 = r13.preferenceStorage     // Catch: java.lang.Exception -> Lf
            r1.setWidgetInfo(r0)     // Catch: java.lang.Exception -> Lf
            goto Lb0
        Lad:
            m3.l.g(r0)
        Lb0:
            androidx.lifecycle.X r13 = r13._finishCreateWidget
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r13.j(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.widget.configuration.ConfigureWidgetViewModel.createWidget():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleSearchButtonTap() {
        this.navigationFlow.b(new Navigation.Direction(ConfigureWidgetFragmentDirections.INSTANCE.actionDeparturesFragmentToSelectStationFragment(NavArguments.StationSelectionType.STATION.toString()), null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleSearchToButtonTap() {
        this.navigationFlow.b(new Navigation.Direction(ConfigureWidgetFragmentDirections.INSTANCE.actionDeparturesFragmentToSelectStationFragment(NavArguments.StationSelectionType.STATION_TO.toString()), null, 2, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadStationInfo(String str, Continuation<? super Station> continuation) {
        return this.getStationByIdUseCase.invoke(str, continuation);
    }

    private final void switchStation() {
        WidgetViewConfigData widgetViewConfigData = (WidgetViewConfigData) this._viewData.d();
        if (widgetViewConfigData != null) {
            WidgetViewConfigData widgetViewConfigData2 = (WidgetViewConfigData) this._viewData.d();
            String stationCode = widgetViewConfigData2 != null ? widgetViewConfigData2.getStationCode() : null;
            WidgetViewConfigData widgetViewConfigData3 = (WidgetViewConfigData) this._viewData.d();
            String stationName = widgetViewConfigData3 != null ? widgetViewConfigData3.getStationName() : null;
            widgetViewConfigData.setStationCode(widgetViewConfigData.getStationToCode());
            widgetViewConfigData.setStationName(widgetViewConfigData.getStationToName());
            widgetViewConfigData.setStationToName(stationName);
            widgetViewConfigData.setStationToCode(stationCode);
            X x3 = this._viewData;
            x3.k(x3.d());
        }
    }

    public final Job changeStation(String stationCode) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        return BuildersKt.launch$default(q0.j(this), Dispatchers.getIO(), null, new ConfigureWidgetViewModel$changeStation$1(this, stationCode, null), 2, null);
    }

    public final Job changeStationTo(String stationCode) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        return BuildersKt.launch$default(q0.j(this), Dispatchers.getIO(), null, new ConfigureWidgetViewModel$changeStationTo$1(this, stationCode, null), 2, null);
    }

    public final Q getFinishCreateWidget() {
        return this.finishCreateWidget;
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }

    public final Q getShowCreateWidgetButton() {
        return this.showCreateWidgetButton;
    }

    public final Q getViewData() {
        return this.viewData;
    }

    public final int getWidgetId() {
        return this.widgetId;
    }

    public final void handleHeaderButtonTap(StationAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            handleSearchButtonTap();
            return;
        }
        if (i == 2) {
            handleSearchToButtonTap();
        } else if (i == 3) {
            createWidget();
        } else {
            if (i != 4) {
                return;
            }
            switchStation();
        }
    }

    public final void handleTrainTypeChange(boolean it) {
        this.isCercanias = it;
    }

    public final void setWidgetId(int i) {
        this.widgetId = i;
    }
}
