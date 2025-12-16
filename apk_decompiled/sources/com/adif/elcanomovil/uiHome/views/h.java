package com.adif.elcanomovil.uiHome.views;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeMapViewModel f5134a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(HomeMapViewModel homeMapViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5134a = homeMapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f5134a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        HomeMapViewModel homeMapViewModel = this.f5134a;
        arrayList = homeMapViewModel.stationsMarkers;
        homeMapViewModel.notifyViewStationsMarkersUpdated(arrayList);
        return Unit.INSTANCE;
    }
}
