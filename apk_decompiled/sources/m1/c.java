package m1;

import com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManageLogosUseCase f7802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7803c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ManageLogosUseCase manageLogosUseCase, String str, Continuation continuation) {
        super(2, continuation);
        this.f7802b = manageLogosUseCase;
        this.f7803c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f7802b, this.f7803c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r8.setLogo(r2, r5, r7) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r8 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f7801a
            java.lang.String r2 = r7.f7803c
            com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCase r3 = r7.f7802b
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4a
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1e:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L32
        L22:
            kotlin.ResultKt.throwOnFailure(r8)
            com.adif.elcanomovil.domain.providers.LogoProvider r8 = com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCase.access$getLogoProvider$p(r3)
            r7.f7801a = r5
            java.lang.Object r8 = r8.download(r2, r7)
            if (r8 != r0) goto L32
            goto L49
        L32:
            if (r8 == 0) goto L4a
            com.adif.elcanomovil.domain.repositories.logos.LogosInfoRepository r8 = com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCase.access$getLogosInfoRepository$p(r3)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            long r5 = r1.getTime()
            r7.f7801a = r4
            java.lang.Object r7 = r8.setLogo(r2, r5, r7)
            if (r7 != r0) goto L4a
        L49:
            return r0
        L4a:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
