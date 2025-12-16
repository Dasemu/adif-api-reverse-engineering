package kotlinx.coroutines.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;

@Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated for removal without a replacement. It may be to define one's own `CoroutineExceptionHandler` if you just need to handle 'uncaught exceptions without a special `TestCoroutineScope` integration.")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bj\u0002`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineExceptionHandler;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlinx/coroutines/test/UncaughtExceptionCaptor;", "()V", "_coroutinesCleanedUp", "", "_exceptions", "", "", "_lock", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "uncaughtExceptions", "", "getUncaughtExceptions", "()Ljava/util/List;", "cleanupTestCoroutines", "", "handleException", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTestCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestCoroutineExceptionHandler.kt\nkotlinx/coroutines/test/TestCoroutineExceptionHandler\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n28#2,4:82\n28#2,4:87\n28#2,4:92\n20#3:86\n20#3:91\n20#3:96\n1855#4,2:97\n*S KotlinDebug\n*F\n+ 1 TestCoroutineExceptionHandler.kt\nkotlinx/coroutines/test/TestCoroutineExceptionHandler\n*L\n60#1:82,4\n69#1:87,4\n72#1:92,4\n60#1:86\n69#1:91\n72#1:96\n76#1:97,2\n*E\n"})
/* loaded from: classes3.dex */
public final class TestCoroutineExceptionHandler extends AbstractCoroutineContextElement implements CoroutineExceptionHandler, UncaughtExceptionCaptor {
    private boolean _coroutinesCleanedUp;
    private final List<Throwable> _exceptions;
    private final Object _lock;

    public TestCoroutineExceptionHandler() {
        super(CoroutineExceptionHandler.INSTANCE);
        this._exceptions = new ArrayList();
        this._lock = new Object();
    }

    @Override // kotlinx.coroutines.test.UncaughtExceptionCaptor
    public void cleanupTestCoroutines() {
        synchronized (this._lock) {
            try {
                this._coroutinesCleanedUp = true;
                Throwable th = (Throwable) CollectionsKt.firstOrNull((List) this._exceptions);
                if (th != null) {
                    Iterator it = CollectionsKt.drop(this._exceptions, 1).iterator();
                    while (it.hasNext()) {
                        ((Throwable) it.next()).printStackTrace();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlinx.coroutines.test.UncaughtExceptionCaptor
    public List<Throwable> getUncaughtExceptions() {
        List<Throwable> list;
        synchronized (this._lock) {
            list = CollectionsKt.toList(this._exceptions);
        }
        return list;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        synchronized (this._lock) {
            try {
                if (this._coroutinesCleanedUp) {
                    CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(context, exception);
                }
                this._exceptions.add(exception);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
