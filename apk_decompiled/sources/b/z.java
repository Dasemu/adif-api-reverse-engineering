package b;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z implements InterfaceC0254c {

    /* renamed from: a, reason: collision with root package name */
    public final r f4150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f4151b;

    public z(B b4, r onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f4151b = b4;
        this.f4150a = onBackPressedCallback;
    }

    @Override // b.InterfaceC0254c
    public final void cancel() {
        B b4 = this.f4151b;
        ArrayDeque arrayDeque = b4.f4097b;
        r rVar = this.f4150a;
        arrayDeque.remove(rVar);
        if (Intrinsics.areEqual(b4.f4098c, rVar)) {
            rVar.handleOnBackCancelled();
            b4.f4098c = null;
        }
        rVar.removeCancellable(this);
        Function0<Unit> enabledChangedCallback$activity_release = rVar.getEnabledChangedCallback$activity_release();
        if (enabledChangedCallback$activity_release != null) {
            enabledChangedCallback$activity_release.invoke();
        }
        rVar.setEnabledChangedCallback$activity_release(null);
    }
}
