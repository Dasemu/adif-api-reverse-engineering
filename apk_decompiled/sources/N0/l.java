package N0;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final S0.j f1191a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1192b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1193c;

    /* renamed from: d, reason: collision with root package name */
    public final S0.j f1194d;

    /* renamed from: e, reason: collision with root package name */
    public final T0.h f1195e;

    /* renamed from: f, reason: collision with root package name */
    public final I0.d f1196f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1197g;

    public l(S0.j jVar, List list, int i, S0.j jVar2, T0.h hVar, I0.d dVar, boolean z3) {
        this.f1191a = jVar;
        this.f1192b = list;
        this.f1193c = i;
        this.f1194d = jVar2;
        this.f1195e = hVar;
        this.f1196f = dVar;
        this.f1197g = z3;
    }

    public final void a(S0.j jVar, j jVar2) {
        Context context = jVar.f1477a;
        S0.j jVar3 = this.f1191a;
        if (context != jVar3.f1477a) {
            throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's context.").toString());
        }
        if (jVar.f1478b == S0.l.f1500a) {
            throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot set the request's data to null.").toString());
        }
        if (jVar.f1479c != jVar3.f1479c) {
            throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's target.").toString());
        }
        if (jVar.f1496w != jVar3.f1496w) {
            throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's lifecycle.").toString());
        }
        if (jVar.f1497x == jVar3.f1497x) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r13v3, types: [N0.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(S0.j r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof N0.k
            if (r0 == 0) goto L13
            r0 = r15
            N0.k r0 = (N0.k) r0
            int r1 = r0.f1190e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1190e = r1
            goto L18
        L13:
            N0.k r0 = new N0.k
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f1188c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1190e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            N0.j r13 = r0.f1187b
            N0.l r14 = r0.f1186a
            kotlin.ResultKt.throwOnFailure(r15)
            r12 = r14
            r14 = r13
            r13 = r12
            goto L74
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            kotlin.ResultKt.throwOnFailure(r15)
            java.util.List r15 = r13.f1192b
            int r2 = r13.f1193c
            if (r2 <= 0) goto L4c
            int r4 = r2 + (-1)
            java.lang.Object r4 = r15.get(r4)
            N0.j r4 = (N0.j) r4
            r13.a(r14, r4)
        L4c:
            java.lang.Object r15 = r15.get(r2)
            N0.j r15 = (N0.j) r15
            int r7 = r2 + 1
            N0.l r4 = new N0.l
            S0.j r5 = r13.f1191a
            I0.d r10 = r13.f1196f
            java.util.List r6 = r13.f1192b
            T0.h r9 = r13.f1195e
            boolean r11 = r13.f1197g
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.f1186a = r13
            r0.f1187b = r15
            r0.f1190e = r3
            r14 = r15
            N0.i r14 = (N0.i) r14
            java.lang.Object r15 = r14.d(r4, r0)
            if (r15 != r1) goto L74
            return r1
        L74:
            S0.k r15 = (S0.k) r15
            S0.j r0 = r15.b()
            r13.a(r0, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.l.b(S0.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
