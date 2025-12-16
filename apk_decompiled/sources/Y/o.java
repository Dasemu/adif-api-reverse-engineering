package Y;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;

/* loaded from: classes.dex */
public final class o extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final o f2090a = new Lambda(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m msg = (m) obj;
        Throwable th = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg instanceof l) {
            CompletableDeferred completableDeferred = ((l) msg).f2086b;
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            completableDeferred.completeExceptionally(th);
        }
        return Unit.INSTANCE;
    }
}
