package com.adif.elcanomovil.uiAvisa.components.details;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f4892b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4893c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IssueDetailsViewModel f4894d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, boolean z3, IssueDetailsViewModel issueDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4892b = list;
        this.f4893c = z3;
        this.f4894d = issueDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f4892b, this.f4893c, this.f4894d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4891a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io = Dispatchers.getIO();
            f fVar = new f(this.f4892b, this.f4893c, this.f4894d, null);
            this.f4891a = 1;
            if (BuildersKt.withContext(io, fVar, this) == coroutine_suspended) {
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
