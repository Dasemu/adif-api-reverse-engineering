package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p0 implements y0 {
    @Override // androidx.lifecycle.y0
    public final w0 create(Class modelClass, l0.c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new s0();
    }
}
