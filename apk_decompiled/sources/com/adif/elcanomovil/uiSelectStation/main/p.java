package com.adif.elcanomovil.uiSelectStation.main;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes2.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5218a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditText f5220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(EditText editText, Continuation continuation) {
        super(2, continuation);
        this.f5220c = editText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        p pVar = new p(this.f5220c, continuation);
        pVar.f5219b = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5218a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.f5219b;
            TextWatcher textWatcher = new TextWatcher() { // from class: com.adif.elcanomovil.uiSelectStation.main.TextChangesKt$textChanges$1$listener$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s4) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence s4, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence s4, int start, int before, int count) {
                    producerScope.mo1630trySendJP2dKIU(String.valueOf(s4));
                }
            };
            EditText editText = this.f5220c;
            editText.addTextChangedListener(textWatcher);
            a0.b bVar = new a0.b(2, editText, textWatcher);
            this.f5218a = 1;
            if (ProduceKt.awaitClose(producerScope, bVar, this) == coroutine_suspended) {
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
