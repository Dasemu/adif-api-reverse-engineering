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
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DynamicLinkUseCase f6913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6914c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CirculationType f6917f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SocialMetaTag f6918g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DynamicLinkUseCase dynamicLinkUseCase, String str, String str2, boolean z3, CirculationType circulationType, SocialMetaTag socialMetaTag, Continuation continuation) {
        super(2, continuation);
        this.f6913b = dynamicLinkUseCase;
        this.f6914c = str;
        this.f6915d = str2;
        this.f6916e = z3;
        this.f6917f = circulationType;
        this.f6918g = socialMetaTag;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f6913b, this.f6914c, this.f6915d, this.f6916e, this.f6917f, this.f6918g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object generateFromDeparturesTab;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6912a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.f6912a = 1;
        generateFromDeparturesTab = this.f6913b.generateFromDeparturesTab(this.f6914c, this.f6915d, this.f6916e, this.f6917f, this.f6918g, this);
        return generateFromDeparturesTab == coroutine_suspended ? coroutine_suspended : generateFromDeparturesTab;
    }
}
