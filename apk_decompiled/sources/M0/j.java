package M0;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class j extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1096b;

    /* renamed from: c, reason: collision with root package name */
    public int f1097c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1096b = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1095a = obj;
        this.f1097c |= IntCompanionObject.MIN_VALUE;
        return this.f1096b.b(null, this);
    }
}
