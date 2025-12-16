package j1;

import com.adif.elcanomovil.domain.entities.circulation.TrainCirculationInfo;
import com.adif.elcanomovil.domain.entities.deeplink.SocialMetaTag;
import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6934a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6935b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f6936c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DynamicLinkUseCase f6937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TrainCirculationInfo f6938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SocialMetaTag f6939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Ref.ObjectRef objectRef, DynamicLinkUseCase dynamicLinkUseCase, TrainCirculationInfo trainCirculationInfo, SocialMetaTag socialMetaTag, Continuation continuation) {
        super(2, continuation);
        this.f6936c = objectRef;
        this.f6937d = dynamicLinkUseCase;
        this.f6938e = trainCirculationInfo;
        this.f6939f = socialMetaTag;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(this.f6936c, this.f6937d, this.f6938e, this.f6939f, continuation);
        gVar.f6935b = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Ref.ObjectRef objectRef;
        T t2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6934a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            async$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.f6935b, Dispatchers.getIO(), null, new f(this.f6937d, this.f6938e, this.f6939f, null), 2, null);
            Ref.ObjectRef objectRef2 = this.f6936c;
            this.f6935b = objectRef2;
            this.f6934a = 1;
            Object await = async$default.await(this);
            if (await == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
            t2 = await;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.f6935b;
            ResultKt.throwOnFailure(obj);
            t2 = obj;
        }
        objectRef.element = t2;
        return Unit.INSTANCE;
    }
}
