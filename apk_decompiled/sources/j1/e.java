package j1;

import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class e extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f6926a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DynamicLinkUseCase f6928c;

    /* renamed from: d, reason: collision with root package name */
    public int f6929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DynamicLinkUseCase dynamicLinkUseCase, Continuation continuation) {
        super(continuation);
        this.f6928c = dynamicLinkUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6927b = obj;
        this.f6929d |= IntCompanionObject.MIN_VALUE;
        return this.f6928c.linkFromTrain(null, null, this);
    }
}
