package com.adif.elcanomovil.widget.configuration;

import androidx.lifecycle.X;
import com.adif.elcanomovil.domain.entities.station.Station;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.adif.elcanomovil.widget.configuration.ConfigureWidgetViewModel$changeStation$1", f = "ConfigureWidgetViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class ConfigureWidgetViewModel$changeStation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $stationCode;
    int label;
    final /* synthetic */ ConfigureWidgetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigureWidgetViewModel$changeStation$1(ConfigureWidgetViewModel configureWidgetViewModel, String str, Continuation<? super ConfigureWidgetViewModel$changeStation$1> continuation) {
        super(2, continuation);
        this.this$0 = configureWidgetViewModel;
        this.$stationCode = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConfigureWidgetViewModel$changeStation$1(this.this$0, this.$stationCode, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        X x3;
        X x4;
        X x5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ConfigureWidgetViewModel configureWidgetViewModel = this.this$0;
            String str = this.$stationCode;
            this.label = 1;
            obj = configureWidgetViewModel.loadStationInfo(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Station station = (Station) obj;
        if (station != null) {
            ConfigureWidgetViewModel configureWidgetViewModel2 = this.this$0;
            x3 = configureWidgetViewModel2._viewData;
            WidgetViewConfigData widgetViewConfigData = (WidgetViewConfigData) x3.d();
            if (widgetViewConfigData != null) {
                widgetViewConfigData.setStationCode(station.getStationCode());
            }
            WidgetViewConfigData widgetViewConfigData2 = (WidgetViewConfigData) configureWidgetViewModel2.getViewData().d();
            if (widgetViewConfigData2 != null) {
                widgetViewConfigData2.setStationName(station.getShortName());
            }
            WidgetViewConfigData widgetViewConfigData3 = (WidgetViewConfigData) configureWidgetViewModel2.getViewData().d();
            if (widgetViewConfigData3 != null) {
                widgetViewConfigData3.setStationIsRodalies(Boxing.boxBoolean(Intrinsics.areEqual(station.getCommuterNetwork(), "RODALIES_CATALUNYA")));
            }
            configureWidgetViewModel2.checkEnableCreateWidgetButton();
            x4 = configureWidgetViewModel2._viewData;
            x5 = configureWidgetViewModel2._viewData;
            x4.k(x5.d());
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConfigureWidgetViewModel$changeStation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
