package I0;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class o extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f782a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(CoroutineExceptionHandler.Companion companion, p pVar) {
        super(companion);
        this.f782a = pVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        this.f782a.getClass();
    }
}
