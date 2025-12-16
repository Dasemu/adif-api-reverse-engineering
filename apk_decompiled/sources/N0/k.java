package N0;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class k extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public l f1186a;

    /* renamed from: b, reason: collision with root package name */
    public j f1187b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1188c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f1189d;

    /* renamed from: e, reason: collision with root package name */
    public int f1190e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1189d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1188c = obj;
        this.f1190e |= IntCompanionObject.MIN_VALUE;
        return this.f1189d.b(null, this);
    }
}
