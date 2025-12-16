package j1;

import com.adif.elcanomovil.domain.entities.CirculationType;
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
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6919a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f6921c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DynamicLinkUseCase f6922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f6925g;
    public final /* synthetic */ CirculationType h;
    public final /* synthetic */ SocialMetaTag i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Ref.ObjectRef objectRef, DynamicLinkUseCase dynamicLinkUseCase, String str, String str2, boolean z3, CirculationType circulationType, SocialMetaTag socialMetaTag, Continuation continuation) {
        super(2, continuation);
        this.f6921c = objectRef;
        this.f6922d = dynamicLinkUseCase;
        this.f6923e = str;
        this.f6924f = str2;
        this.f6925g = z3;
        this.h = circulationType;
        this.i = socialMetaTag;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f6921c, this.f6922d, this.f6923e, this.f6924f, this.f6925g, this.h, this.i, continuation);
        dVar.f6920b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Ref.ObjectRef objectRef;
        T t2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6919a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            async$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.f6920b, Dispatchers.getIO(), null, new c(this.f6922d, this.f6923e, this.f6924f, this.f6925g, this.h, this.i, null), 2, null);
            Ref.ObjectRef objectRef2 = this.f6921c;
            this.f6920b = objectRef2;
            this.f6919a = 1;
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
            objectRef = (Ref.ObjectRef) this.f6920b;
            ResultKt.throwOnFailure(obj);
            t2 = obj;
        }
        objectRef.element = t2;
        return Unit.INSTANCE;
    }
}
