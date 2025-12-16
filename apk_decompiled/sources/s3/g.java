package s3;

import f0.C0338b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import r3.z;

/* loaded from: classes3.dex */
public final class g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f8484a = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i entry = (i) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        z zVar = h.f8485e;
        return Boolean.valueOf(C0338b.e(entry.f8489a));
    }
}
