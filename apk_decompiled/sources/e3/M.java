package e3;

import java.io.File;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import r3.C0579k;
import r3.InterfaceC0577i;

/* loaded from: classes3.dex */
public abstract class M {
    public static final L Companion = new Object();

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    public static final M create(A a2, File file) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new J(a2, file, 0);
    }

    public abstract long contentLength();

    public abstract A contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC0577i interfaceC0577i);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final M create(A a2, String content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return L.b(content, a2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final M create(A a2, C0579k content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        return new J(a2, content, 1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final M create(A a2, byte[] content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length;
        Intrinsics.checkNotNullParameter(content, "content");
        return L.a(a2, content, 0, length);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final M create(A a2, byte[] content, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length;
        Intrinsics.checkNotNullParameter(content, "content");
        return L.a(a2, content, i, length);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final M create(String str, A a2) {
        Companion.getClass();
        return L.b(str, a2);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final M create(byte[] bArr) {
        L l4 = Companion;
        l4.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return L.c(l4, bArr, null, 0, 7);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final M create(byte[] bArr, A a2) {
        L l4 = Companion;
        l4.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return L.c(l4, bArr, a2, 0, 6);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final M create(byte[] bArr, A a2, int i) {
        L l4 = Companion;
        l4.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return L.c(l4, bArr, a2, i, 4);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final M create(byte[] bArr, A a2, int i, int i4) {
        Companion.getClass();
        return L.a(a2, bArr, i, i4);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final M create(C0579k c0579k, A a2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(c0579k, "<this>");
        return new J(a2, c0579k, 1);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final M create(File file, A a2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new J(a2, file, 0);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final M create(A a2, byte[] content, int i, int i4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return L.a(a2, content, i, i4);
    }
}
