package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes.dex */
public final class f0 implements H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f3362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f3363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f3364c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A f3365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f3366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Mutex f3367f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f3368g;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(A a2, Ref.ObjectRef objectRef, CoroutineScope coroutineScope, A a4, CancellableContinuationImpl cancellableContinuationImpl, Mutex mutex, Function2 function2) {
        this.f3362a = a2;
        this.f3363b = objectRef;
        this.f3364c = coroutineScope;
        this.f3365d = a4;
        this.f3366e = cancellableContinuationImpl;
        this.f3367f = mutex;
        this.f3368g = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, kotlinx.coroutines.Job] */
    @Override // androidx.lifecycle.H
    public final void onStateChanged(J j4, A event) {
        ?? launch$default;
        Intrinsics.checkNotNullParameter(j4, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        Ref.ObjectRef objectRef = this.f3363b;
        if (event == this.f3362a) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.f3364c, null, null, new e0(this.f3367f, this.f3368g, null), 3, null);
            objectRef.element = launch$default;
            return;
        }
        if (event == this.f3365d) {
            Job job = (Job) objectRef.element;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            objectRef.element = null;
        }
        if (event == A.ON_DESTROY) {
            Result.Companion companion = Result.INSTANCE;
            this.f3366e.resumeWith(Result.m116constructorimpl(Unit.INSTANCE));
        }
    }
}
