package N0;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public i f1137a;

    /* renamed from: b, reason: collision with root package name */
    public S0.j f1138b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1139c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1140d;

    /* renamed from: e, reason: collision with root package name */
    public Ref.ObjectRef f1141e;

    /* renamed from: f, reason: collision with root package name */
    public Ref.ObjectRef f1142f;

    /* renamed from: g, reason: collision with root package name */
    public Ref.ObjectRef f1143g;
    public Ref.ObjectRef h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f1144j;

    /* renamed from: k, reason: collision with root package name */
    public int f1145k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1144j = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.f1145k |= IntCompanionObject.MIN_VALUE;
        return i.b(this.f1144j, null, null, null, null, this);
    }
}
