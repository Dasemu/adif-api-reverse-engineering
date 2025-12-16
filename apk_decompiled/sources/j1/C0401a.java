package j1;

import android.content.Intent;
import android.net.Uri;
import com.adif.elcanomovil.domain.entities.deeplink.DeepLinkResult;
import com.adif.elcanomovil.domain.providers.DynamicLinkFacade;
import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DynamicLinkUseCase f6906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f6907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0401a(DynamicLinkUseCase dynamicLinkUseCase, Intent intent, Continuation continuation) {
        super(2, continuation);
        this.f6906b = dynamicLinkUseCase;
        this.f6907c = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0401a(this.f6906b, this.f6907c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0401a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DynamicLinkFacade dynamicLinkFacade;
        DeepLinkResult linkResult;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6905a;
        DynamicLinkUseCase dynamicLinkUseCase = this.f6906b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            dynamicLinkFacade = dynamicLinkUseCase.dynamicLinkFacade;
            this.f6905a = 1;
            obj = dynamicLinkFacade.dynamicLink(this.f6907c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Uri uri = (Uri) obj;
        if (uri == null) {
            return null;
        }
        linkResult = dynamicLinkUseCase.linkResult(uri);
        return linkResult;
    }
}
