package com.adif.elcanomovil.commonViews;

import android.widget.TextView;
import com.adif.elcanomovil.resources.StringUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Float f4451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextView f4452c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Float f2, TextView textView, Continuation continuation) {
        super(2, continuation);
        this.f4451b = f2;
        this.f4452c = textView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f4451b, this.f4452c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4450a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String distanceToStringkKm = StringUtils.INSTANCE.distanceToStringkKm(Boxing.boxDouble(this.f4451b.floatValue()));
            MainCoroutineDispatcher main = Dispatchers.getMain();
            d dVar = new d(this.f4452c, distanceToStringkKm, null);
            this.f4450a = 1;
            if (BuildersKt.withContext(main, dVar, this) == coroutine_suspended) {
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
