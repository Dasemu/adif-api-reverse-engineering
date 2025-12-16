package androidx.lifecycle;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187h extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C0189j f3379a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0189j f3381c;

    /* renamed from: d, reason: collision with root package name */
    public int f3382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0187h(C0189j c0189j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3381c = c0189j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3380b = obj;
        this.f3382d |= IntCompanionObject.MIN_VALUE;
        return this.f3381c.l(this);
    }
}
