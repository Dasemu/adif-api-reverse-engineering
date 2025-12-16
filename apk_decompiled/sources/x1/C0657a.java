package x1;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.repositories.stationObservations.DefaultStationsObservationsRepository;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public FlowCollector f8882a;

    /* renamed from: b, reason: collision with root package name */
    public AsyncResult.Companion f8883b;

    /* renamed from: c, reason: collision with root package name */
    public int f8884c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f8886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DefaultStationsObservationsRepository f8887f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0657a(List list, DefaultStationsObservationsRepository defaultStationsObservationsRepository, Continuation continuation) {
        super(2, continuation);
        this.f8886e = list;
        this.f8887f = defaultStationsObservationsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0657a c0657a = new C0657a(this.f8886e, this.f8887f, continuation);
        c0657a.f8885d = obj;
        return c0657a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0657a) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        if (r6.emit(r12, r11) != r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f1, code lost:
    
        if (r1.emit(r12, r11) != r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
    
        if (r1.emit(r12, r11) != r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        if (r1.emit(r12, r11) == r0) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.C0657a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
