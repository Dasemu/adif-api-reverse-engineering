package r3;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes3.dex */
public interface G extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    K timeout();

    void z(C0576h c0576h, long j4);
}
