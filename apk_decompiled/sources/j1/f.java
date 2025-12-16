package j1;

import com.adif.elcanomovil.domain.BuildConfig;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculationInfo;
import com.adif.elcanomovil.domain.entities.deeplink.SocialMetaTag;
import com.adif.elcanomovil.domain.providers.DynamicLinkFacade;
import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCaseKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DynamicLinkUseCase f6931b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrainCirculationInfo f6932c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SocialMetaTag f6933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DynamicLinkUseCase dynamicLinkUseCase, TrainCirculationInfo trainCirculationInfo, SocialMetaTag socialMetaTag, Continuation continuation) {
        super(2, continuation);
        this.f6931b = dynamicLinkUseCase;
        this.f6932c = trainCirculationInfo;
        this.f6933d = socialMetaTag;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f6931b, this.f6932c, this.f6933d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DynamicLinkFacade dynamicLinkFacade;
        String asUrl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6930a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        dynamicLinkFacade = this.f6931b.dynamicLinkFacade;
        asUrl = DynamicLinkUseCaseKt.getAsUrl(this.f6932c);
        this.f6930a = 1;
        Object create = dynamicLinkFacade.create(asUrl, BuildConfig.dynamicLinkUrl, "http://adif.es/es_ES/adif_movil.shtml", "960191892", com.adif.elcanomovil.BuildConfig.APPLICATION_ID, "es.adif.adifentumovil", this.f6933d, this);
        return create == coroutine_suspended ? coroutine_suspended : create;
    }
}
