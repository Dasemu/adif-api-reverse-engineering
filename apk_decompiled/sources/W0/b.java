package W0;

import androidx.lifecycle.InterfaceC0192m;
import androidx.lifecycle.J;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public final class b implements InterfaceC0192m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f1885a;

    public b(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f1885a = cancellableContinuationImpl;
    }

    @Override // androidx.lifecycle.InterfaceC0192m
    public final void x(J j4) {
        Result.Companion companion = Result.INSTANCE;
        this.f1885a.resumeWith(Result.m116constructorimpl(Unit.INSTANCE));
    }
}
