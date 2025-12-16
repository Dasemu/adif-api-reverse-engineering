package N0;

import M0.m;
import S0.o;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public i f1128a;

    /* renamed from: b, reason: collision with root package name */
    public m f1129b;

    /* renamed from: c, reason: collision with root package name */
    public I0.c f1130c;

    /* renamed from: d, reason: collision with root package name */
    public S0.j f1131d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1132e;

    /* renamed from: f, reason: collision with root package name */
    public o f1133f;

    /* renamed from: g, reason: collision with root package name */
    public I0.d f1134g;
    public int h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f1135j;

    /* renamed from: k, reason: collision with root package name */
    public int f1136k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1135j = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.f1136k |= IntCompanionObject.MIN_VALUE;
        return i.a(this.f1135j, null, null, null, null, null, null, this);
    }
}
