package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class w extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public HomeViewModel f5139a;

    /* renamed from: b, reason: collision with root package name */
    public StationViewEntityMapper f5140b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5141c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f5142d;

    /* renamed from: e, reason: collision with root package name */
    public int f5143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(HomeViewModel homeViewModel, Continuation continuation) {
        super(continuation);
        this.f5142d = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchWorkStation;
        this.f5141c = obj;
        this.f5143e |= IntCompanionObject.MIN_VALUE;
        fetchWorkStation = this.f5142d.fetchWorkStation(this);
        return fetchWorkStation;
    }
}
