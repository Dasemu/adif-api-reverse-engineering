package kotlinx.coroutines.test.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J6\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u0002H\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002H\f0\u000fH\u0096\u0001¢\u0006\u0002\u0010\u0011J(\u0010\u0012\u001a\u0004\u0018\u0001H\u0013\"\b\b\u0000\u0010\u0013*\u00020\u00102\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0004H\u0096\u0003¢\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0096\u0001J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001d\u001a\u00020\u00182\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0001J\u0011\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0003R\u0016\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/test/internal/ExceptionCollectorAsService;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "()V", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "equals", "", "other", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "hashCode", "", "minusKey", "plus", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExceptionCollectorAsService implements CoroutineExceptionHandler {
    private final /* synthetic */ ExceptionCollector $$delegate_0 = ExceptionCollector.INSTANCE;

    public boolean equals(Object other) {
        return (other instanceof ExceptionCollectorAsService) || (other instanceof ExceptionCollector);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R initial, Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        return (R) this.$$delegate_0.fold(initial, operation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) this.$$delegate_0.get(key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key<?> getKey() {
        return this.$$delegate_0.getKey();
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        this.$$delegate_0.handleException(context, exception);
    }

    public int hashCode() {
        return ExceptionCollector.INSTANCE.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return this.$$delegate_0.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext context) {
        return this.$$delegate_0.plus(context);
    }
}
