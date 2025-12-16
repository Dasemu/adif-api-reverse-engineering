package i3;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final IOException f6890a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f6891b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f6890a = firstConnectException;
        this.f6891b = firstConnectException;
    }
}
