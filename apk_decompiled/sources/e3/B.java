package e3;

import f0.C0338b;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import r3.C0579k;

/* loaded from: classes3.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final C0579k f6202a;

    /* renamed from: b, reason: collision with root package name */
    public A f6203b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6204c;

    public B() {
        String boundary = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(boundary, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        C0579k c0579k = C0579k.f8285d;
        this.f6202a = C0338b.n(boundary);
        this.f6203b = D.f6207e;
        this.f6204c = new ArrayList();
    }
}
