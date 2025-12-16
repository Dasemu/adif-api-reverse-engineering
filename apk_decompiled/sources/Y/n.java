package Y;

import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f2089a;

    public n(FileOutputStream fileOutputStream) {
        Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.f2089a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f2089a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f2089a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b4) {
        Intrinsics.checkNotNullParameter(b4, "b");
        this.f2089a.write(b4);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i, int i4) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f2089a.write(bytes, i, i4);
    }
}
