package b0;

import java.util.Collections;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4160a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f4162c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0263h(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f4162c = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0263h c0263h = new C0263h(this.f4162c, continuation);
        c0263h.f4161b = obj;
        return c0263h;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0263h) create((AbstractC0262g) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4160a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0257b c0257b = (C0257b) this.f4161b;
            ResultKt.throwOnFailure(obj);
            return c0257b;
        }
        ResultKt.throwOnFailure(obj);
        Map unmodifiableMap = Collections.unmodifiableMap(((C0257b) ((AbstractC0262g) this.f4161b)).f4153a);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        C0257b c0257b2 = new C0257b(MapsKt.toMutableMap(unmodifiableMap), false);
        this.f4161b = c0257b2;
        this.f4160a = 1;
        return this.f4162c.invoke(c0257b2, this) == coroutine_suspended ? coroutine_suspended : c0257b2;
    }
}
