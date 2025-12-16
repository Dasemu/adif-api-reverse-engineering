package androidx.fragment.app;

import kotlin.jvm.internal.Intrinsics;
import n0.C0512b;
import o0.C0545w;

/* renamed from: androidx.fragment.app.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164o0 implements androidx.lifecycle.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3196a;

    @Override // androidx.lifecycle.y0
    public final androidx.lifecycle.w0 create(Class modelClass) {
        switch (this.f3196a) {
            case 0:
                return new C0166p0(true);
            case 1:
                return new C0512b();
            default:
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                return new C0545w();
        }
    }
}
