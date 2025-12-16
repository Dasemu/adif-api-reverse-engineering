package com.adif.elcanomovil.commonViews;

import android.widget.TextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f4448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4449b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TextView textView, String str, Continuation continuation) {
        super(2, continuation);
        this.f4448a = textView;
        this.f4449b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f4448a, this.f4449b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f4448a.setText(this.f4449b);
        return Unit.INSTANCE;
    }
}
