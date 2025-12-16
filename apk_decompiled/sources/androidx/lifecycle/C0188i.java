package androidx.lifecycle;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188i extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C0189j f3387a;

    /* renamed from: b, reason: collision with root package name */
    public Q f3388b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3389c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0189j f3390d;

    /* renamed from: e, reason: collision with root package name */
    public int f3391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0188i(C0189j c0189j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3390d = c0189j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3389c = obj;
        this.f3391e |= IntCompanionObject.MIN_VALUE;
        return this.f3390d.m(null, this);
    }
}
