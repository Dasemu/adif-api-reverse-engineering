package com.adif.elcanomovil.uiSelectTrain.main;

import com.adif.elcanomovil.domain.usecases.recentSearch.SaveRecentTrainSearchUseCase;
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
    public int f5253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectTrainViewModel f5254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5255c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f5257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f5258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f5259g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f5260j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SelectTrainViewModel selectTrainViewModel, String str, String str2, String str3, String str4, String str5, long j4, long j5, String str6, Continuation continuation) {
        super(2, continuation);
        this.f5254b = selectTrainViewModel;
        this.f5255c = str;
        this.f5256d = str2;
        this.f5257e = str3;
        this.f5258f = str4;
        this.f5259g = str5;
        this.h = j4;
        this.i = j5;
        this.f5260j = str6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f5254b, this.f5255c, this.f5256d, this.f5257e, this.f5258f, this.f5259g, this.h, this.i, this.f5260j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SaveRecentTrainSearchUseCase saveRecentTrainSearchUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5253a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                saveRecentTrainSearchUseCase = this.f5254b.saveRecentTrainSearchesUseCase;
                String str = this.f5255c;
                String str2 = this.f5256d;
                String str3 = this.f5257e;
                String str4 = this.f5258f;
                String str5 = this.f5259g;
                long j4 = this.h;
                long j5 = this.i;
                String str6 = this.f5260j;
                this.f5253a = 1;
                if (saveRecentTrainSearchUseCase.invoke(str, str2, str3, str4, str5, j4, j5, str6, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e4) {
            m3.l.g(e4);
        }
        return Unit.INSTANCE;
    }
}
