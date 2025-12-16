package N0;

import S0.o;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class e extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public i f1153a;

    /* renamed from: b, reason: collision with root package name */
    public I0.c f1154b;

    /* renamed from: c, reason: collision with root package name */
    public S0.j f1155c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1156d;

    /* renamed from: e, reason: collision with root package name */
    public o f1157e;

    /* renamed from: f, reason: collision with root package name */
    public I0.d f1158f;

    /* renamed from: g, reason: collision with root package name */
    public int f1159g;
    public /* synthetic */ Object h;
    public final /* synthetic */ i i;

    /* renamed from: j, reason: collision with root package name */
    public int f1160j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f1160j |= IntCompanionObject.MIN_VALUE;
        return this.i.c(null, null, null, null, null, this);
    }
}
