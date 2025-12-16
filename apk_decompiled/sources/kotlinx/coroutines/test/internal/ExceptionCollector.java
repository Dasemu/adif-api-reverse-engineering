package kotlinx.coroutines.test.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\"\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u0013\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\bJ\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u000e\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0006J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\bH\u0002R&\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\u0006j\u0002`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/test/internal/ExceptionCollector;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "()V", "callbacks", "", "", "Lkotlin/Function1;", "", "", "enabled", "", "lock", "Lkotlinx/coroutines/internal/SynchronizedObject;", "unprocessedExceptions", "", "addOnExceptionCallback", "owner", "callback", "equals", "other", "handleException", "exception", "context", "Lkotlin/coroutines/CoroutineContext;", "removeOnExceptionCallback", "reportException", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExceptionCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionCollector.kt\nkotlinx/coroutines/test/internal/ExceptionCollector\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n28#2,4:102\n28#2,4:109\n28#2,4:114\n20#3:106\n20#3:113\n20#3:118\n1855#4,2:107\n*S KotlinDebug\n*F\n+ 1 ExceptionCollector.kt\nkotlinx/coroutines/test/internal/ExceptionCollector\n*L\n33#1:102,4\n45#1:109,4\n58#1:114,4\n33#1:106\n45#1:113\n58#1:118\n38#1:107,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ExceptionCollector extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    private static boolean enabled;
    public static final ExceptionCollector INSTANCE = new ExceptionCollector();
    private static final Object lock = new Object();
    private static final List<Throwable> unprocessedExceptions = new ArrayList();
    private static final Map<Object, Function1<Throwable, Unit>> callbacks = new LinkedHashMap();

    private ExceptionCollector() {
        super(CoroutineExceptionHandler.INSTANCE);
    }

    private final boolean reportException(Throwable exception) {
        Iterator<Function1<Throwable, Unit>> it = callbacks.values().iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            it.next().invoke(exception);
            z3 = true;
        }
        return z3;
    }

    public final void addOnExceptionCallback(Object owner, Function1<? super Throwable, Unit> callback) {
        synchronized (lock) {
            try {
                enabled = true;
                if (callbacks.put(owner, callback) != null) {
                    throw new IllegalStateException("Check failed.");
                }
                Iterator<T> it = unprocessedExceptions.iterator();
                while (it.hasNext()) {
                    INSTANCE.reportException((Throwable) it.next());
                }
                unprocessedExceptions.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object other) {
        return (other instanceof ExceptionCollector) || (other instanceof ExceptionCollectorAsService);
    }

    public final boolean handleException(Throwable exception) {
        synchronized (lock) {
            if (!enabled) {
                return false;
            }
            if (INSTANCE.reportException(exception)) {
                return true;
            }
            unprocessedExceptions.add(exception);
            return false;
        }
    }

    public final void removeOnExceptionCallback(Object owner) {
        synchronized (lock) {
            try {
                if (enabled && callbacks.remove(owner) == null) {
                    throw new IllegalStateException("Check failed.");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        if (handleException(exception)) {
            throw ExceptionSuccessfullyProcessed.INSTANCE;
        }
    }
}
