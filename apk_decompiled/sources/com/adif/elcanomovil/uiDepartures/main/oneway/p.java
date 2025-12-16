package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCase;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public CirculationsViewModel f5010a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f5011b;

    /* renamed from: c, reason: collision with root package name */
    public int f5012c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f5013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CirculationsViewModel f5014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(List list, CirculationsViewModel circulationsViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5013d = list;
        this.f5014e = circulationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f5013d, this.f5014e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CirculationsViewModel circulationsViewModel;
        Iterator it;
        ManageLogosUseCase manageLogosUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5012c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = this.f5013d;
            if (list != null) {
                Iterator it2 = list.iterator();
                circulationsViewModel = this.f5014e;
                it = it2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = this.f5011b;
        circulationsViewModel = this.f5010a;
        ResultKt.throwOnFailure(obj);
        while (it.hasNext()) {
            String str = (String) it.next();
            manageLogosUseCase = circulationsViewModel.manageLogosUseCase;
            this.f5010a = circulationsViewModel;
            this.f5011b = it;
            this.f5012c = 1;
            if (manageLogosUseCase.invoke(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
