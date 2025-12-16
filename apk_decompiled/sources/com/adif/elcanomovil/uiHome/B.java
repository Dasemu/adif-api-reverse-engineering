package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.StationServiceType;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.domain.usecases.tabs.TabDataHolder;
import com.adif.elcanomovil.uiHome.data.UserFavoriteVO;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;

/* loaded from: classes2.dex */
public final class B extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserFavoriteVO f5056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f5057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(UserFavoriteVO userFavoriteVO, HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5056b = userFavoriteVO;
        this.f5057c = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new B(this.f5056b, this.f5057c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TabDataHolder tabDataHolder;
        Channel channel;
        TabDataHolder tabDataHolder2;
        Channel channel2;
        TabDataHolder tabDataHolder3;
        Channel channel3;
        TabDataHolder tabDataHolder4;
        Channel channel4;
        List split$default;
        Channel channel5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5055a;
        HomeViewModel homeViewModel = this.f5057c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UserFavoriteVO userFavoriteVO = this.f5056b;
            int i4 = HomeViewModel$onUserFavoritePressed$1$WhenMappings.$EnumSwitchMapping$0[userFavoriteVO.getType().ordinal()];
            if (i4 == 1) {
                tabDataHolder = homeViewModel.tabDataHolder;
                String identifierStation = userFavoriteVO.getIdentifierStation();
                if (identifierStation == null) {
                    identifierStation = "";
                }
                tabDataHolder.push(new TabDataHolder.TabData.Stations(identifierStation, StationServiceType.SERVICES));
                channel = homeViewModel._navigation;
                channel.mo1630trySendJP2dKIU(new Navigation.TabDirection(new BottomNavInitialTab.Station(null, 1, null)));
            } else if (i4 == 2) {
                tabDataHolder2 = homeViewModel.tabDataHolder;
                tabDataHolder2.push(new TabDataHolder.TabData.Departures(userFavoriteVO.getIdentifierStation(), null, CirculationType.DEPARTURE, userFavoriteVO.getTrafficType() != StationViewEntity.TypeTraffic.AVLDMD ? TrainType.CERCANIAS : TrainType.AVELDMD));
                channel2 = homeViewModel._navigation;
                channel2.mo1630trySendJP2dKIU(new Navigation.TabDirection(new BottomNavInitialTab.Departures(null, 1, null)));
            } else if (i4 == 3) {
                tabDataHolder3 = homeViewModel.tabDataHolder;
                tabDataHolder3.push(new TabDataHolder.TabData.Departures(userFavoriteVO.getIdentifierStation(), null, CirculationType.ARRIVAL, userFavoriteVO.getTrafficType() != StationViewEntity.TypeTraffic.AVLDMD ? TrainType.CERCANIAS : TrainType.AVELDMD));
                channel3 = homeViewModel._navigation;
                channel3.mo1630trySendJP2dKIU(new Navigation.TabDirection(new BottomNavInitialTab.Departures(null, 1, null)));
            } else if (i4 == 4) {
                tabDataHolder4 = homeViewModel.tabDataHolder;
                tabDataHolder4.push(new TabDataHolder.TabData.Departures(userFavoriteVO.getIdentifierStation(), userFavoriteVO.getIdentifierToStation(), CirculationType.BETWEEN_STATIONS, userFavoriteVO.getTrafficType() != StationViewEntity.TypeTraffic.AVLDMD ? TrainType.CERCANIAS : TrainType.AVELDMD));
                channel4 = homeViewModel._navigation;
                channel4.mo1630trySendJP2dKIU(new Navigation.TabDirection(new BottomNavInitialTab.Departures(null, 1, null)));
            } else if (i4 == 5) {
                split$default = StringsKt__StringsKt.split$default(userFavoriteVO.getTitle(), new String[]{"#"}, false, 0, 6, (Object) null);
                String str = (String) split$default.get(1);
                this.f5055a = 1;
                obj = homeViewModel.handleTrainTap(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Navigation navigation = (Navigation) obj;
        if (navigation != null) {
            channel5 = homeViewModel._navigation;
            ChannelResult.m1640boximpl(channel5.mo1630trySendJP2dKIU(navigation));
        }
        return Unit.INSTANCE;
    }
}
