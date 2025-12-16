package com.adif.elcanomovil.uiHome;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class x extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public String f5144a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f5146c;

    /* renamed from: d, reason: collision with root package name */
    public int f5147d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(HomeViewModel homeViewModel, Continuation continuation) {
        super(continuation);
        this.f5146c = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleTrainTap;
        this.f5145b = obj;
        this.f5147d |= IntCompanionObject.MIN_VALUE;
        handleTrainTap = this.f5146c.handleTrainTap(null, this);
        return handleTrainTap;
    }
}
