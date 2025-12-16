package t1;

import com.adif.elcanomovil.repositories.favourites.DefaultFavoritesRepository;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8543a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultFavoritesRepository f8545c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f8546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f8548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f8549g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DefaultFavoritesRepository defaultFavoritesRepository, String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        super(2, continuation);
        this.f8545c = defaultFavoritesRepository;
        this.f8546d = str;
        this.f8547e = str2;
        this.f8548f = str3;
        this.f8549g = str4;
        this.h = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        j jVar = new j(this.f8545c, this.f8546d, this.f8547e, this.f8548f, this.f8549g, this.h, continuation);
        jVar.f8544b = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(1:2)|(1:(1:(4:(1:(1:(3:9|10|11)(2:13|14))(1:15))(1:17)|16|10|11)(5:18|19|20|21|(4:23|(2:25|26)|10|11)(1:27)))(1:29))(1:40)|30|31|32|(3:34|21|(0)(0))|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f0, code lost:
    
        if (r1.emit(r0, r29) == r8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f4, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f5, code lost:
    
        r0 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE.error(r0, null);
        r29.f8544b = null;
        r29.f8543a = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0103, code lost:
    
        if (r1.emit(r0, r29) != r8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0066, code lost:
    
        if (r1.emit(r3, r29) == r8) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:16:0x002e, B:19:0x0041, B:21:0x00be, B:23:0x00c8, B:27:0x00d9), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:16:0x002e, B:19:0x0041, B:21:0x00be, B:23:0x00c8, B:27:0x00d9), top: B:2:0x0010 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
