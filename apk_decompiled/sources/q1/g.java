package q1;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.repositories.circulation.CirculationMapper;
import com.adif.elcanomovil.repositories.circulation.DefaultCirculationRepository;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public FlowCollector f8177a;

    /* renamed from: b, reason: collision with root package name */
    public AsyncResult.Companion f8178b;

    /* renamed from: c, reason: collision with root package name */
    public CirculationMapper f8179c;

    /* renamed from: d, reason: collision with root package name */
    public int f8180d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DefaultCirculationRepository f8182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f8183g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DefaultCirculationRepository defaultCirculationRepository, boolean z3, String str, Continuation continuation) {
        super(2, continuation);
        this.f8182f = defaultCirculationRepository;
        this.f8183g = z3;
        this.h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(this.f8182f, this.f8183g, this.h, continuation);
        gVar.f8181e = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bc, code lost:
    
        if (r4.emit(r14, r13) != r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0128, code lost:
    
        if (r2.emit(r14, r13) != r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f8, code lost:
    
        if (r2.emit(r14, r13) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0110, code lost:
    
        if (r2.emit(r14, r13) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        if (r2.emit(r14, r13) != r1) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.flow.FlowCollector] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
