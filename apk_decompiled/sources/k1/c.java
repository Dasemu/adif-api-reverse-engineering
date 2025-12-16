package k1;

import com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public GetDepartureCirculationsUseCase f7026a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7027b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7028c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7029d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7030e;

    /* renamed from: f, reason: collision with root package name */
    public Collection f7031f;

    /* renamed from: g, reason: collision with root package name */
    public List f7032g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7033j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f7034k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ GetDepartureCirculationsUseCase f7035l;

    /* renamed from: m, reason: collision with root package name */
    public int f7036m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GetDepartureCirculationsUseCase getDepartureCirculationsUseCase, Continuation continuation) {
        super(continuation);
        this.f7035l = getDepartureCirculationsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7034k = obj;
        this.f7036m |= IntCompanionObject.MIN_VALUE;
        return this.f7035l.invoke(null, null, null, null, 0, false, false, this);
    }
}
