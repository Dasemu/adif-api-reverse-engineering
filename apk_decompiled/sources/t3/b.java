package t3;

import C.w;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f8550a = new ThreadLocal();

    public void a(String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        d(6, null, str, Arrays.copyOf(args, args.length));
    }

    public void b(Throwable th) {
        d(6, th, null, new Object[0]);
    }

    public abstract void c(int i, String str, String str2, Throwable th);

    public final void d(int i, Throwable th, String message, Object... args) {
        ThreadLocal threadLocal = this.f8550a;
        String str = (String) threadLocal.get();
        if (str != null) {
            threadLocal.remove();
        }
        if (message != null && message.length() != 0) {
            if (args.length != 0) {
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(args, "args");
                Object[] copyOf = Arrays.copyOf(args, args.length);
                message = w.s(copyOf, copyOf.length, message, "java.lang.String.format(this, *args)");
            }
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) message);
                sb.append('\n');
                StringWriter stringWriter = new StringWriter(256);
                PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String stringWriter2 = stringWriter.toString();
                Intrinsics.checkNotNullExpressionValue(stringWriter2, "sw.toString()");
                sb.append(stringWriter2);
                message = sb.toString();
            }
        } else {
            if (th == null) {
                return;
            }
            StringWriter stringWriter3 = new StringWriter(256);
            PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter3, false);
            th.printStackTrace(printWriter2);
            printWriter2.flush();
            message = stringWriter3.toString();
            Intrinsics.checkNotNullExpressionValue(message, "sw.toString()");
        }
        c(i, str, message, th);
    }

    public void e(String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        d(5, null, str, Arrays.copyOf(args, args.length));
    }
}
