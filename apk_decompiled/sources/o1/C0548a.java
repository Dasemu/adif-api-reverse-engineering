package o1;

import com.adif.elcanomovil.domain.usecases.user.GetUserLastLocationUseCase;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetUserLastLocationUseCase f8080b;

    /* renamed from: c, reason: collision with root package name */
    public int f8081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0548a(GetUserLastLocationUseCase getUserLastLocationUseCase, Continuation continuation) {
        super(continuation);
        this.f8080b = getUserLastLocationUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8079a = obj;
        this.f8081c |= IntCompanionObject.MIN_VALUE;
        return this.f8080b.invoke(this);
    }
}
