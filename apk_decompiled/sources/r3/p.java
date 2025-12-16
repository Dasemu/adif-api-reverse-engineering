package r3;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class p implements I {
    private final I delegate;

    public p(I delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @JvmName(name = "-deprecated_delegate")
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final I m1713deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @JvmName(name = "delegate")
    public final I delegate() {
        return this.delegate;
    }

    @Override // r3.I
    public long read(C0576h sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.delegate.read(sink, j4);
    }

    @Override // r3.I
    public K timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
