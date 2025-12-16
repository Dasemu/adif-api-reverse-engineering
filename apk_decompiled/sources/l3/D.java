package l3;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class D extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0439b f7372a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(EnumC0439b errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f7372a = errorCode;
    }
}
