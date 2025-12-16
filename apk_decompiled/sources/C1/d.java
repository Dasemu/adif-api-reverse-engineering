package C1;

import com.adif.elcanomovil.uiAvisa.components.authenticator.DefaultAuthenticationProvider;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultAuthenticationProvider f349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DefaultAuthenticationProvider defaultAuthenticationProvider, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f349b = defaultAuthenticationProvider;
        this.f350c = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f349b, this.f350c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0085, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r9).collect(r1, r8) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r9).collect(r1, r8) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r9 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r9 == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f348a
            com.adif.elcanomovil.uiAvisa.components.authenticator.DefaultAuthenticationProvider r2 = r8.f349b
            kotlin.jvm.functions.Function0 r3 = r8.f350c
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L2d
            if (r1 == r7) goto L29
            if (r1 == r6) goto L25
            if (r1 == r5) goto L21
            if (r1 != r4) goto L19
            goto L25
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L21:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L77
        L25:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L88
        L29:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L56
        L2d:
            kotlin.ResultKt.throwOnFailure(r9)
            com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage r9 = com.adif.elcanomovil.uiAvisa.components.authenticator.DefaultAuthenticationProvider.access$getPreferenceStorage$p(r2)
            com.adif.elcanomovil.serviceStorage.model.avisa.AvisaToken r9 = r9.getAvisaToken()
            if (r9 == 0) goto L3f
            java.lang.String r9 = r9.getAccessToken()
            goto L40
        L3f:
            r9 = 0
        L40:
            if (r9 == 0) goto L67
            boolean r9 = kotlin.text.StringsKt.isBlank(r9)
            if (r9 == 0) goto L49
            goto L67
        L49:
            com.adif.elcanomovil.domain.usecases.avisa.user.LoginAvisaUserUseCase r9 = com.adif.elcanomovil.uiAvisa.components.authenticator.DefaultAuthenticationProvider.access$getLoginAvisaUserUseCase$p(r2)
            r8.f348a = r7
            java.lang.Object r9 = r9.invoke(r8)
            if (r9 != r0) goto L56
            goto L87
        L56:
            kotlinx.coroutines.flow.Flow r9 = (kotlinx.coroutines.flow.Flow) r9
            C1.a r1 = new C1.a
            r4 = 0
            r1.<init>(r2, r3, r4)
            r8.f348a = r6
            java.lang.Object r8 = r9.collect(r1, r8)
            if (r8 != r0) goto L88
            goto L87
        L67:
            com.adif.elcanomovil.uiAvisa.components.authenticator.DefaultAuthenticationProvider.access$setOneTry$p(r2, r7)
            com.adif.elcanomovil.domain.usecases.avisa.user.RegisterAvisaUserUseCase r9 = com.adif.elcanomovil.uiAvisa.components.authenticator.DefaultAuthenticationProvider.access$getRegisterAvisaUserUseCase$p(r2)
            r8.f348a = r5
            java.lang.Object r9 = r9.invoke(r8)
            if (r9 != r0) goto L77
            goto L87
        L77:
            kotlinx.coroutines.flow.Flow r9 = (kotlinx.coroutines.flow.Flow) r9
            C1.a r1 = new C1.a
            r5 = 1
            r1.<init>(r2, r3, r5)
            r8.f348a = r4
            java.lang.Object r8 = r9.collect(r1, r8)
            if (r8 != r0) goto L88
        L87:
            return r0
        L88:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
