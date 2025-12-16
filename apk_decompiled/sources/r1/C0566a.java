package r1;

import com.adif.elcanomovil.repositories.compositions.DefaultCompositionsRepository;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8205a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultCompositionsRepository f8207c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f8208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f8210f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f8211g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0566a(DefaultCompositionsRepository defaultCompositionsRepository, String str, String str2, long j4, String str3, Continuation continuation) {
        super(2, continuation);
        this.f8207c = defaultCompositionsRepository;
        this.f8208d = str;
        this.f8209e = str2;
        this.f8210f = j4;
        this.f8211g = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0566a c0566a = new C0566a(this.f8207c, this.f8208d, this.f8209e, this.f8210f, this.f8211g, continuation);
        c0566a.f8206b = obj;
        return c0566a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0566a) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(1:(2:(1:(1:(4:7|8|9|10)(2:12|13))(5:14|15|16|9|10))(6:22|23|24|25|26|(4:28|(2:30|21)|9|10)(1:(2:32|33)(2:34|35)))|19)(1:38))(1:47)|39|40|41|(3:43|26|(0)(0))|21) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00db, code lost:
    
        if (r3.emit(r4, r18) == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cc, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0064, code lost:
    
        if (r0.emit(r9, r18) == r2) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:24:0x003c, B:26:0x008e, B:28:0x0096, B:32:0x00b7, B:33:0x00c4, B:34:0x00c5, B:35:0x00ca), top: B:23:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.C0566a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
