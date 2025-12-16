package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class v extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public HomeViewModel f5105a;

    /* renamed from: b, reason: collision with root package name */
    public StationViewEntityMapper f5106b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5107c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f5108d;

    /* renamed from: e, reason: collision with root package name */
    public int f5109e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(HomeViewModel homeViewModel, Continuation continuation) {
        super(continuation);
        this.f5108d = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchHomeStation;
        this.f5107c = obj;
        this.f5109e |= IntCompanionObject.MIN_VALUE;
        fetchHomeStation = this.f5108d.fetchHomeStation(this);
        return fetchHomeStation;
    }
}
