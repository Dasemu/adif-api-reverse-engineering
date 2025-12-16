package androidx.room;

import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3959a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3961c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f3962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f3963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String[] f3964f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Callable f3965g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z3, u uVar, FlowCollector flowCollector, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.f3961c = z3;
        this.f3962d = uVar;
        this.f3963e = flowCollector;
        this.f3964f = strArr;
        this.f3965g = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        String[] strArr = this.f3964f;
        Callable callable = this.f3965g;
        d dVar = new d(this.f3961c, this.f3962d, this.f3963e, strArr, callable, continuation);
        dVar.f3960b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineDispatcher coroutineDispatcher;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3959a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f3960b;
            Channel Channel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
            F.i iVar = new F.i(this.f3964f, Channel$default);
            Channel$default.mo1630trySendJP2dKIU(Unit.INSTANCE);
            if (coroutineScope.getCoroutineContext().get(A.f3944a) != null) {
                throw new ClassCastException();
            }
            boolean z3 = this.f3961c;
            u uVar = this.f3962d;
            if (z3) {
                Map<String, Object> backingFieldMap = uVar.getBackingFieldMap();
                Object obj2 = backingFieldMap.get("TransactionDispatcher");
                if (obj2 == null) {
                    obj2 = ExecutorsKt.from(uVar.getTransactionExecutor());
                    backingFieldMap.put("TransactionDispatcher", obj2);
                }
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
                coroutineDispatcher = (CoroutineDispatcher) obj2;
            } else {
                Map<String, Object> backingFieldMap2 = uVar.getBackingFieldMap();
                Object obj3 = backingFieldMap2.get("QueryDispatcher");
                if (obj3 == null) {
                    obj3 = ExecutorsKt.from(uVar.getQueryExecutor());
                    backingFieldMap2.put("QueryDispatcher", obj3);
                }
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
                coroutineDispatcher = (CoroutineDispatcher) obj3;
            }
            CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
            Channel Channel$default2 = ChannelKt.Channel$default(0, null, null, 7, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineDispatcher2, null, new c(this.f3962d, iVar, Channel$default, this.f3965g, Channel$default2, null), 2, null);
            this.f3959a = 1;
            if (FlowKt.emitAll(this.f3963e, Channel$default2, this) == coroutine_suspended) {
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
