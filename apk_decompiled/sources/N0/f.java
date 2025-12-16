package N0;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class f extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public i f1161a;

    /* renamed from: b, reason: collision with root package name */
    public l f1162b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1163c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f1164d;

    /* renamed from: e, reason: collision with root package name */
    public int f1165e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1164d = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1163c = obj;
        this.f1165e |= IntCompanionObject.MIN_VALUE;
        return this.f1164d.d(null, this);
    }
}
