package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;

/* loaded from: classes.dex */
public final class r implements DisposableHandle {

    /* renamed from: a, reason: collision with root package name */
    public final Q f3421a;

    /* renamed from: b, reason: collision with root package name */
    public final C0189j f3422b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3423c;

    public r(Q source, C0189j mediator) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        this.f3421a = source;
        this.f3422b = mediator;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate()), null, null, new C0195p(this, null), 3, null);
    }
}
