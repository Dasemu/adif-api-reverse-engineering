package j1;

import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f6908a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DynamicLinkUseCase f6910c;

    /* renamed from: d, reason: collision with root package name */
    public int f6911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0402b(DynamicLinkUseCase dynamicLinkUseCase, Continuation continuation) {
        super(continuation);
        this.f6910c = dynamicLinkUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6909b = obj;
        this.f6911d |= IntCompanionObject.MIN_VALUE;
        return this.f6910c.linkFromDeparture(null, null, false, null, null, this);
    }
}
