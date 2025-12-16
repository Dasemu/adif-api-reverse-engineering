package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public B f3294a;

    /* renamed from: b, reason: collision with root package name */
    public H f3295b;

    public final void a(J j4, A event) {
        Intrinsics.checkNotNullParameter(event, "event");
        B a2 = event.a();
        B state1 = this.f3294a;
        Intrinsics.checkNotNullParameter(state1, "state1");
        if (a2.compareTo(state1) < 0) {
            state1 = a2;
        }
        this.f3294a = state1;
        Intrinsics.checkNotNull(j4);
        this.f3295b.onStateChanged(j4, event);
        this.f3294a = a2;
    }
}
