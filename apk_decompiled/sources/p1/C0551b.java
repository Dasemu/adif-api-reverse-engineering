package p1;

import com.adif.elcanomovil.observers.UpdateStationsObserver;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UpdateStationsObserver f8118b;

    /* renamed from: c, reason: collision with root package name */
    public int f8119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0551b(UpdateStationsObserver updateStationsObserver, Continuation continuation) {
        super(continuation);
        this.f8118b = updateStationsObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8117a = obj;
        this.f8119c |= IntCompanionObject.MIN_VALUE;
        return this.f8118b.start(this);
    }
}
