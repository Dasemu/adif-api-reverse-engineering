package C1;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.entities.utils.Status;
import com.adif.elcanomovil.domain.usecases.avisa.user.RefreshAvisaUserUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.user.RegisterAvisaUserUseCase;
import com.adif.elcanomovil.uiAvisa.components.authenticator.DefaultAuthenticationProvider;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class a implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultAuthenticationProvider f340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f341c;

    public /* synthetic */ a(DefaultAuthenticationProvider defaultAuthenticationProvider, Function0 function0, int i) {
        this.f339a = i;
        this.f340b = defaultAuthenticationProvider;
        this.f341c = function0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r7).collect(r6, r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.adif.elcanomovil.domain.entities.utils.AsyncResult r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof C1.c
            if (r0 == 0) goto L13
            r0 = r7
            C1.c r0 = (C1.c) r0
            int r1 = r0.f347d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f347d = r1
            goto L18
        L13:
            C1.c r0 = new C1.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f345b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f347d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r7)
            goto L74
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            C1.a r5 = r0.f344a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5e
        L3a:
            kotlin.ResultKt.throwOnFailure(r7)
            com.adif.elcanomovil.domain.entities.utils.Status r7 = r6.getStatus()
            com.adif.elcanomovil.domain.entities.utils.Status r2 = com.adif.elcanomovil.domain.entities.utils.Status.LOADING
            if (r7 == r2) goto L7e
            com.adif.elcanomovil.domain.entities.utils.Status r6 = r6.getStatus()
            com.adif.elcanomovil.domain.entities.utils.Status r7 = com.adif.elcanomovil.domain.entities.utils.Status.SUCCESS
            if (r6 != r7) goto L77
            com.adif.elcanomovil.uiAvisa.components.authenticator.DefaultAuthenticationProvider r6 = r5.f340b
            com.adif.elcanomovil.domain.usecases.avisa.user.LoginAvisaUserUseCase r6 = com.adif.elcanomovil.uiAvisa.components.authenticator.DefaultAuthenticationProvider.access$getLoginAvisaUserUseCase$p(r6)
            r0.f344a = r5
            r0.f347d = r4
            java.lang.Object r7 = r6.invoke(r0)
            if (r7 != r1) goto L5e
            goto L73
        L5e:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            C1.b r6 = new C1.b
            kotlin.jvm.functions.Function0 r5 = r5.f341c
            r2 = 0
            r6.<init>(r5, r2)
            r5 = 0
            r0.f344a = r5
            r0.f347d = r3
            java.lang.Object r5 = r7.collect(r6, r0)
            if (r5 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L77:
            kotlin.jvm.functions.Function0 r5 = r5.f341c
            if (r5 == 0) goto L7e
            r5.invoke()
        L7e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.a.a(com.adif.elcanomovil.domain.entities.utils.AsyncResult, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean z3;
        RegisterAvisaUserUseCase registerAvisaUserUseCase;
        RefreshAvisaUserUseCase refreshAvisaUserUseCase;
        switch (this.f339a) {
            case 0:
                AsyncResult asyncResult = (AsyncResult) obj;
                Status status = asyncResult.getStatus();
                Status status2 = Status.ERROR;
                Function0 function0 = this.f341c;
                if (status == status2) {
                    DefaultAuthenticationProvider defaultAuthenticationProvider = this.f340b;
                    z3 = defaultAuthenticationProvider.oneTry;
                    if (!z3) {
                        Throwable throwable = asyncResult.getThrowable();
                        if (throwable != null) {
                            defaultAuthenticationProvider.oneTry = true;
                            if (throwable instanceof R0.e) {
                                if (((R0.e) throwable).f1410a.f6294d == 401) {
                                    refreshAvisaUserUseCase = defaultAuthenticationProvider.refreshAvisaUserUseCase;
                                    Object invoke = refreshAvisaUserUseCase.invoke(continuation);
                                    if (invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                        return invoke;
                                    }
                                } else {
                                    registerAvisaUserUseCase = defaultAuthenticationProvider.registerAvisaUserUseCase;
                                    Object invoke2 = registerAvisaUserUseCase.invoke(continuation);
                                    if (invoke2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                        return invoke2;
                                    }
                                }
                            } else if (function0 != null) {
                                function0.invoke();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                if (asyncResult.getStatus() == Status.SUCCESS && function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            default:
                return a((AsyncResult) obj, continuation);
        }
    }
}
