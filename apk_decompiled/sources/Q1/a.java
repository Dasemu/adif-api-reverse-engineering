package Q1;

import com.adif.elcanomovil.widget.domain.usecases.GetWidgetInfoUseCase;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes3.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f1368a;

    /* renamed from: b, reason: collision with root package name */
    public String f1369b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1370c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1371d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GetWidgetInfoUseCase f1373f;

    /* renamed from: g, reason: collision with root package name */
    public int f1374g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GetWidgetInfoUseCase getWidgetInfoUseCase, Continuation continuation) {
        super(continuation);
        this.f1373f = getWidgetInfoUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1372e = obj;
        this.f1374g |= IntCompanionObject.MIN_VALUE;
        return this.f1373f.invoke(null, null, false, this);
    }
}
