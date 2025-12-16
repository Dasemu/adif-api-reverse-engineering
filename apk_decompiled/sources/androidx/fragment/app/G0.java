package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class G0 extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f3013b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f3012a = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d();
    }

    public final void d() {
        StringBuilder sb = this.f3013b;
        if (sb.length() > 0) {
            Log.d(this.f3012a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        d();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            char c4 = cArr[i + i5];
            if (c4 == '\n') {
                d();
            } else {
                this.f3013b.append(c4);
            }
        }
    }
}
