package i0;

import androidx.fragment.app.K;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0392m extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final K f6812a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0392m(K fragment, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f6812a = fragment;
    }
}
