package androidx.lifecycle;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182d {

    /* renamed from: a, reason: collision with root package name */
    public final C0189j f3344a;

    /* renamed from: b, reason: collision with root package name */
    public final SuspendLambda f3345b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f3346c;

    /* renamed from: d, reason: collision with root package name */
    public final J0.e f3347d;

    /* renamed from: e, reason: collision with root package name */
    public Job f3348e;

    /* renamed from: f, reason: collision with root package name */
    public Job f3349f;

    /* JADX WARN: Multi-variable type inference failed */
    public C0182d(C0189j liveData, Function2 block, CoroutineScope scope, J0.e onDone) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        this.f3344a = liveData;
        this.f3345b = (SuspendLambda) block;
        this.f3346c = scope;
        this.f3347d = onDone;
    }
}
