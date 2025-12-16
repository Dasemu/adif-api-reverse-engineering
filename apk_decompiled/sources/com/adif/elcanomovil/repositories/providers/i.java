package com.adif.elcanomovil.repositories.providers;

import I0.l;
import I0.p;
import S0.k;
import android.content.Context;
import f0.C0338b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import r3.C0579k;

/* loaded from: classes.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultLogoProvider f4657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4658c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DefaultLogoProvider defaultLogoProvider, String str, Continuation continuation) {
        super(2, continuation);
        this.f4657b = defaultLogoProvider;
        this.f4658c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f4657b, this.f4658c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        boolean z3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4656a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            context = this.f4657b.context;
            K0.j jVar = (K0.j) ((p) I0.a.a(context)).f785c.getValue();
            if (jVar != null) {
                String str = this.f4658c;
                K0.g gVar = jVar.f1014b;
                C0579k c0579k = C0579k.f8285d;
                String e4 = C0338b.n(str).c("SHA-256").e();
                synchronized (gVar) {
                    gVar.e();
                    K0.g.f0(e4);
                    gVar.O();
                    K0.c cVar = (K0.c) gVar.f1002f.get(e4);
                    if (cVar == null) {
                        z3 = false;
                    } else {
                        gVar.d0(cVar);
                        if (gVar.h <= gVar.f998b) {
                            gVar.f1008n = false;
                        }
                        z3 = true;
                    }
                }
                Boxing.boxBoolean(z3);
            }
            context2 = this.f4657b.context;
            Q0.d dVar = (Q0.d) ((p) I0.a.a(context2)).f784b.getValue();
            if (dVar != null) {
                Q0.b bVar = new Q0.b(this.f4658c);
                Boxing.boxBoolean(dVar.f1358a.a(bVar) || dVar.f1359b.a(bVar));
            }
            context3 = this.f4657b.context;
            S0.i iVar = new S0.i(context3);
            String str2 = this.f4658c;
            iVar.f1464c = str2;
            iVar.f1467f = str2;
            iVar.b(str2);
            S0.j a2 = iVar.a();
            context4 = this.f4657b.context;
            I0.h a4 = I0.a.a(context4);
            this.f4656a = 1;
            p pVar = (p) a4;
            pVar.getClass();
            obj = CoroutineScopeKt.coroutineScope(new l(pVar, a2, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((k) obj).a();
    }
}
