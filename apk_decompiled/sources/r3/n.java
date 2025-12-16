package r3;

import f0.C0338b;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final u f8299a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [r3.u] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r02;
        try {
            Class.forName("java.nio.file.Files");
            r02 = new Object();
        } catch (ClassNotFoundException unused) {
            r02 = new Object();
        }
        f8299a = r02;
        String str = z.f8321b;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        C0338b.o(property);
        ClassLoader classLoader = s3.h.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        new s3.h(classLoader);
    }

    public abstract void a(z zVar);

    public final void b(z path) {
        Intrinsics.checkNotNullParameter(path, "path");
        a(path);
    }

    public final boolean c(z path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return f(path) != null;
    }

    public abstract List d(z zVar);

    public final m e(z path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        m f2 = f(path);
        if (f2 != null) {
            return f2;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public abstract m f(z zVar);

    public abstract G g(z zVar);

    public abstract I h(z zVar);
}
