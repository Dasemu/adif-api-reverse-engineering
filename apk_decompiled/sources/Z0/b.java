package Z0;

import android.location.LocationManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationManager f2162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f2163c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LocationManager locationManager, c cVar, Continuation continuation) {
        super(2, continuation);
        this.f2162b = locationManager;
        this.f2163c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f2162b, this.f2163c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f2161a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L17:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L47
        L1b:
            kotlin.ResultKt.throwOnFailure(r5)
            android.location.LocationManager r5 = r4.f2162b
            java.lang.String r1 = "gps"
            boolean r5 = r5.isProviderEnabled(r1)
            Z0.c r1 = r4.f2163c
            kotlinx.coroutines.flow.MutableSharedFlow r1 = r1.f2165b
            if (r5 == 0) goto L39
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            r4.f2161a = r3
            java.lang.Object r4 = r1.emit(r5, r4)
            if (r4 != r0) goto L47
            goto L46
        L39:
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            r4.f2161a = r2
            java.lang.Object r4 = r1.emit(r5, r4)
            if (r4 != r0) goto L47
        L46:
            return r0
        L47:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
