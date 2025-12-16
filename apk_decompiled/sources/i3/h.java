package i3;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6858a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j referent, Object obj) {
        super(referent);
        Intrinsics.checkNotNullParameter(referent, "referent");
        this.f6858a = obj;
    }
}
