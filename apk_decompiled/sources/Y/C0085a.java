package Y;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085a extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0085a(String message, int i) {
        super(message, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
