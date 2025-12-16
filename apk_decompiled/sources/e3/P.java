package e3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.InterfaceC0578j;

/* loaded from: classes3.dex */
public final class P extends Reader {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0578j f6303a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f6304b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6305c;

    /* renamed from: d, reason: collision with root package name */
    public InputStreamReader f6306d;

    public P(InterfaceC0578j source, Charset charset) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f6303a = source;
        this.f6304b = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Unit unit;
        this.f6305c = true;
        InputStreamReader inputStreamReader = this.f6306d;
        if (inputStreamReader != null) {
            inputStreamReader.close();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f6303a.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cbuf, int i, int i4) {
        Intrinsics.checkNotNullParameter(cbuf, "cbuf");
        if (this.f6305c) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.f6306d;
        if (inputStreamReader == null) {
            InterfaceC0578j interfaceC0578j = this.f6303a;
            inputStreamReader = new InputStreamReader(interfaceC0578j.X(), f3.c.r(interfaceC0578j, this.f6304b));
            this.f6306d = inputStreamReader;
        }
        return inputStreamReader.read(cbuf, i, i4);
    }
}
