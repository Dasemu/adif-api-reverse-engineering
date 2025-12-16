package com.adif.elcanomovil.uiSelectTrain.main;

import androidx.lifecycle.C0189j;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.q0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes2.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5261a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectTrainViewModel f5263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SelectTrainViewModel selectTrainViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5263c = selectTrainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        i iVar = new i(this.f5263c, continuation);
        iVar.f5262b = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((U) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5261a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            U u3 = (U) this.f5262b;
            mutableStateFlow = this.f5263c._savedSearchData;
            C0189j a2 = q0.a(FlowKt.filterNotNull(mutableStateFlow), null, 3);
            this.f5261a = 1;
            u3.getClass();
            if (BuildersKt.withContext(u3.f3327b, new T(u3, a2, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
