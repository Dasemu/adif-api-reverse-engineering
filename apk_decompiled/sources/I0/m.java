package I0;

import S0.q;
import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class m extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public p f769a;

    /* renamed from: b, reason: collision with root package name */
    public q f770b;

    /* renamed from: c, reason: collision with root package name */
    public S0.j f771c;

    /* renamed from: d, reason: collision with root package name */
    public d f772d;

    /* renamed from: e, reason: collision with root package name */
    public Bitmap f773e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f774f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f775g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f775g = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f774f = obj;
        this.h |= IntCompanionObject.MIN_VALUE;
        return p.a(this.f775g, null, 0, this);
    }
}
