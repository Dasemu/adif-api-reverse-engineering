package com.adif.elcanomovil.uiSubscriptions.create;

import androidx.lifecycle.X;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.domain.entities.subscription.SubscriptionType;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.uiSubscriptions.create.views.data.SubscriptionCreateViewData;
import com.adif.elcanomovil.uiSubscriptions.utils.AnticipationType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f5331a;

    /* renamed from: b, reason: collision with root package name */
    public int f5332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SubscriptionCreationViewModel f5334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f5335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f5336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f5337g;
    public final /* synthetic */ String h;
    public final /* synthetic */ AnticipationType i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, SubscriptionCreationViewModel subscriptionCreationViewModel, String str2, String str3, String str4, String str5, AnticipationType anticipationType, Continuation continuation) {
        super(2, continuation);
        this.f5333c = str;
        this.f5334d = subscriptionCreationViewModel;
        this.f5335e = str2;
        this.f5336f = str3;
        this.f5337g = str4;
        this.h = str5;
        this.i = anticipationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f5333c, this.f5334d, this.f5335e, this.f5336f, this.f5337g, this.h, this.i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        GetStationByIdUseCase getStationByIdUseCase;
        Object invoke;
        Ref.ObjectRef objectRef2;
        X x3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5332b;
        SubscriptionCreationViewModel subscriptionCreationViewModel = this.f5334d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            objectRef = new Ref.ObjectRef();
            String str = this.f5333c;
            if (str != null) {
                getStationByIdUseCase = subscriptionCreationViewModel.getStationByIdUseCase;
                this.f5331a = objectRef;
                this.f5332b = 1;
                invoke = getStationByIdUseCase.invoke(str, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef2 = objectRef;
            }
            x3 = subscriptionCreationViewModel._viewData;
            String str2 = (String) objectRef.element;
            SubscriptionType subscriptionType = SubscriptionType.TRAIN;
            String str3 = this.f5333c;
            x3.k(new SubscriptionCreateViewData(true, str2, str3, null, str3, null, this.f5335e, null, this.f5336f, this.f5337g, this.h, this.i, subscriptionType, null, null, null, 57512, null));
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef2 = this.f5331a;
        ResultKt.throwOnFailure(obj);
        invoke = obj;
        Station station = (Station) invoke;
        objectRef2.element = station != null ? station.getShortName() : 0;
        objectRef = objectRef2;
        x3 = subscriptionCreationViewModel._viewData;
        String str22 = (String) objectRef.element;
        SubscriptionType subscriptionType2 = SubscriptionType.TRAIN;
        String str32 = this.f5333c;
        x3.k(new SubscriptionCreateViewData(true, str22, str32, null, str32, null, this.f5335e, null, this.f5336f, this.f5337g, this.h, this.i, subscriptionType2, null, null, null, 57512, null));
        return Unit.INSTANCE;
    }
}
