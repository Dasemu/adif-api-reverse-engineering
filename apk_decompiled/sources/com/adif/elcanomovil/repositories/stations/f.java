package com.adif.elcanomovil.repositories.stations;

import com.adif.elcanomovil.domain.entities.MapRegion;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultStationsRepository f4679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapRegion f4680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DefaultStationsRepository defaultStationsRepository, MapRegion mapRegion, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f4679a = defaultStationsRepository;
        this.f4680b = mapRegion;
        this.f4681c = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f4679a, this.f4680b, this.f4681c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DefaultStationsRepository defaultStationsRepository = this.f4679a;
        return FlowKt.flow(new DefaultStationsRepository$fetchForRegion$2$invokeSuspend$$inlined$networkBoundResource$1(null, defaultStationsRepository, this.f4680b, this.f4681c, defaultStationsRepository, defaultStationsRepository, defaultStationsRepository));
    }
}
