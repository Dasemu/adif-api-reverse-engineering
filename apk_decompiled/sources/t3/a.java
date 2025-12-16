package t3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends b {
    @Override // t3.b
    public final void a(String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (b bVar : c.f8553c) {
            bVar.a(str, Arrays.copyOf(args, args.length));
        }
    }

    @Override // t3.b
    public final void b(Throwable th) {
        for (b bVar : c.f8553c) {
            bVar.b(th);
        }
    }

    @Override // t3.b
    public final void c(int i, String str, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new AssertionError();
    }

    @Override // t3.b
    public final void e(String str, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (b bVar : c.f8553c) {
            bVar.e(str, Arrays.copyOf(args, args.length));
        }
    }
}
