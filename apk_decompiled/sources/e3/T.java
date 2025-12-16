package e3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import r3.C0579k;
import r3.InterfaceC0578j;

/* loaded from: classes3.dex */
public abstract class T implements Closeable {
    public static final S Companion = new Object();
    private Reader reader;

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @JvmStatic
    public static final T create(A a2, long j4, InterfaceC0578j content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return S.a(a2, j4, content);
    }

    public final InputStream byteStream() {
        return source().X();
    }

    public final C0579k byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException(C.w.l("Cannot buffer entire body for content length: ", contentLength));
        }
        InterfaceC0578j source = source();
        try {
            C0579k g4 = source.g();
            CloseableKt.closeFinally(source, null);
            int d4 = g4.d();
            if (contentLength == -1 || contentLength == d4) {
                return g4;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + d4 + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException(C.w.l("Cannot buffer entire body for content length: ", contentLength));
        }
        InterfaceC0578j source = source();
        try {
            byte[] w3 = source.w();
            CloseableKt.closeFinally(source, null);
            int length = w3.length;
            if (contentLength == -1 || contentLength == length) {
                return w3;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Charset charset;
        Reader reader = this.reader;
        if (reader == null) {
            InterfaceC0578j source = source();
            A contentType = contentType();
            if (contentType == null || (charset = contentType.a(Charsets.UTF_8)) == null) {
                charset = Charsets.UTF_8;
            }
            reader = new P(source, charset);
            this.reader = reader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f3.c.c(source());
    }

    public abstract long contentLength();

    public abstract A contentType();

    public abstract InterfaceC0578j source();

    public final String string() throws IOException {
        Charset charset;
        InterfaceC0578j source = source();
        try {
            A contentType = contentType();
            if (contentType == null || (charset = contentType.a(Charsets.UTF_8)) == null) {
                charset = Charsets.UTF_8;
            }
            String W3 = source.W(f3.c.r(source, charset));
            CloseableKt.closeFinally(source, null);
            return W3;
        } finally {
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final T create(A a2, String content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return S.b(content, a2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [r3.j, java.lang.Object, r3.h] */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final T create(A a2, C0579k content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        ?? obj = new Object();
        obj.h0(content);
        return S.a(a2, content.d(), obj);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final T create(A a2, byte[] content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return S.c(content, a2);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final T create(String str, A a2) {
        Companion.getClass();
        return S.b(str, a2);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final T create(InterfaceC0578j interfaceC0578j, A a2, long j4) {
        Companion.getClass();
        return S.a(a2, j4, interfaceC0578j);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final T create(byte[] bArr, A a2) {
        Companion.getClass();
        return S.c(bArr, a2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [r3.j, java.lang.Object, r3.h] */
    @JvmStatic
    @JvmName(name = "create")
    public static final T create(C0579k c0579k, A a2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(c0579k, "<this>");
        ?? obj = new Object();
        obj.h0(c0579k);
        return S.a(a2, c0579k.d(), obj);
    }
}
