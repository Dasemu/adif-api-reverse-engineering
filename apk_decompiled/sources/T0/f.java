package T0;

import I0.m;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import m3.l;

/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f1637a;

    public f(ImageView imageView) {
        this.f1637a = imageView;
    }

    public static l b(int i, int i4, int i5) {
        if (i == -2) {
            return b.f1632a;
        }
        int i6 = i - i5;
        if (i6 > 0) {
            return new a(i6);
        }
        int i7 = i4 - i5;
        if (i7 > 0) {
            return new a(i7);
        }
        return null;
    }

    @Override // T0.i
    public Object a(m mVar) {
        h c4 = c();
        if (c4 != null) {
            return c4;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(mVar), 1);
        cancellableContinuationImpl.initCancellability();
        ViewTreeObserver viewTreeObserver = this.f1637a.getViewTreeObserver();
        k kVar = new k(this, viewTreeObserver, cancellableContinuationImpl);
        viewTreeObserver.addOnPreDrawListener(kVar);
        cancellableContinuationImpl.invokeOnCancellation(new j(this, viewTreeObserver, kVar, 0));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(mVar);
        }
        return result;
    }

    public h c() {
        ImageView imageView = this.f1637a;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        l b4 = b(layoutParams != null ? layoutParams.width : -1, imageView.getWidth(), imageView.getPaddingRight() + imageView.getPaddingLeft());
        if (b4 == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        l b5 = b(layoutParams2 != null ? layoutParams2.height : -1, imageView.getHeight(), imageView.getPaddingBottom() + imageView.getPaddingTop());
        if (b5 == null) {
            return null;
        }
        return new h(b4, b5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return Intrinsics.areEqual(this.f1637a, ((f) obj).f1637a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f1637a.hashCode() * 31);
    }
}
