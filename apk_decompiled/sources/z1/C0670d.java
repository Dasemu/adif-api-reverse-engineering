package z1;

import com.adif.elcanomovil.serviceNetworking.pinning.PinningRepository;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: z1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670d extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public PinningRepository f9012a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9013b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PinningRepository f9014c;

    /* renamed from: d, reason: collision with root package name */
    public int f9015d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0670d(PinningRepository pinningRepository, Continuation continuation) {
        super(continuation);
        this.f9014c = pinningRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9013b = obj;
        this.f9015d |= IntCompanionObject.MIN_VALUE;
        return this.f9014c.getPins(this);
    }
}
