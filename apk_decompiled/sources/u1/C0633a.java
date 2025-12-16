package u1;

import com.adif.elcanomovil.repositories.linecolours.DefaultLineColoursRepository;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DefaultLineColoursRepository f8618a;

    /* renamed from: b, reason: collision with root package name */
    public String f8619b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8620c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultLineColoursRepository f8621d;

    /* renamed from: e, reason: collision with root package name */
    public int f8622e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0633a(DefaultLineColoursRepository defaultLineColoursRepository, Continuation continuation) {
        super(continuation);
        this.f8621d = defaultLineColoursRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8620c = obj;
        this.f8622e |= IntCompanionObject.MIN_VALUE;
        return this.f8621d.getLineColorRGB(null, null, this);
    }
}
