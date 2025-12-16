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
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public FlowCollector f8164a;

    /* renamed from: b, reason: collision with root package name */
    public AsyncResult.Companion f8165b;

    /* renamed from: c, reason: collision with root package name */
    public CirculationMapper f8166c;

    /* renamed from: d, reason: collision with root package name */
    public int f8167d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DefaultCirculationRepository f8169f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f8170g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f8171j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f8172k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DefaultCirculationRepository defaultCirculationRepository, boolean z3, String str, String str2, long j4, String str3, Continuation continuation) {
        super(2, continuation);
        this.f8169f = defaultCirculationRepository;
        this.f8170g = z3;
        this.h = str;
        this.i = str2;
        this.f8171j = j4;
        this.f8172k = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f8169f, this.f8170g, this.h, this.i, this.f8171j, this.f8172k, continuation);
        dVar.f8168e = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        if (r5.emit(r15, r14) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d1, code lost:
    
        if (r2.emit(r15, r14) != r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
