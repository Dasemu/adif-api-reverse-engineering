package com.adif.elcanomovil.uiSelectStation.main;

import android.text.Editable;
import android.widget.EditText;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5221a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditText f5223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(EditText editText, Continuation continuation) {
        super(2, continuation);
        this.f5223c = editText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        q qVar = new q(this.f5223c, continuation);
        qVar.f5222b = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5221a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f5222b;
            Editable text = this.f5223c.getText();
            this.f5221a = 1;
            if (flowCollector.emit(text, this) == coroutine_suspended) {
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
