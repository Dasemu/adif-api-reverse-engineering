package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceNotificationType;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4618a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultIncidenceRepository f4620c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ IncidenceNotificationType f4623f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f4624g;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(DefaultIncidenceRepository defaultIncidenceRepository, String str, String str2, IncidenceNotificationType incidenceNotificationType, String str3, List list, Continuation continuation) {
        super(2, continuation);
        this.f4620c = defaultIncidenceRepository;
        this.f4621d = str;
        this.f4622e = str2;
        this.f4623f = incidenceNotificationType;
        this.f4624g = str3;
        this.h = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        n nVar = new n(this.f4620c, this.f4621d, this.f4622e, this.f4623f, this.f4624g, this.h, continuation);
        nVar.f4619b = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(1:(1:(3:8|9|10)(2:12|13))(1:14))(1:22)|15|16|9|10) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(1:(2:(5:(1:(1:(3:8|9|10)(2:12|13))(1:14))(1:22)|15|16|9|10)(6:23|24|25|26|27|(4:29|(2:31|21)|9|10)(1:32))|19)(1:36))(1:46)|37|38|39|40|(3:42|27|(0)(0))|21) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00da, code lost:
    
        if (r4.emit(r0, r17) == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        if (r6.emit(r0, r17) == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0067, code lost:
    
        if (r0.emit(r9, r17) == r2) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:25:0x003f, B:27:0x0097, B:29:0x009f, B:32:0x00b0), top: B:24:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0 A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #1 {all -> 0x0045, blocks: (B:25:0x003f, B:27:0x0097, B:29:0x009f, B:32:0x00b0), top: B:24:0x003f }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.avisa.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
