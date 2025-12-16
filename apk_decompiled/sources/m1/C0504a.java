package m1;

import com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCase;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManageLogosUseCase f7794b;

    /* renamed from: c, reason: collision with root package name */
    public int f7795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0504a(ManageLogosUseCase manageLogosUseCase, Continuation continuation) {
        super(continuation);
        this.f7794b = manageLogosUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object checkFetchInfo;
        this.f7793a = obj;
        this.f7795c |= IntCompanionObject.MIN_VALUE;
        checkFetchInfo = this.f7794b.checkFetchInfo(null, this);
        return checkFetchInfo;
    }
}
