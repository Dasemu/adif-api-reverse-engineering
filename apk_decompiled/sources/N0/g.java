package N0;

import S0.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f1166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f1167b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S0.j f1168c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f1170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I0.d f1171f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q0.b f1172g;
    public final /* synthetic */ l h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, S0.j jVar, Object obj, o oVar, I0.d dVar, Q0.b bVar, l lVar, Continuation continuation) {
        super(2, continuation);
        this.f1167b = iVar;
        this.f1168c = jVar;
        this.f1169d = obj;
        this.f1170e = oVar;
        this.f1171f = dVar;
        this.f1172g = bVar;
        this.h = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f1167b, this.f1168c, this.f1169d, this.f1170e, this.f1171f, this.f1172g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.f1166a
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.throwOnFailure(r14)
            r8 = r13
            goto L2f
        L10:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L18:
            kotlin.ResultKt.throwOnFailure(r14)
            r13.f1166a = r2
            S0.o r6 = r13.f1170e
            I0.d r7 = r13.f1171f
            N0.i r3 = r13.f1167b
            S0.j r4 = r13.f1168c
            java.lang.Object r5 = r13.f1169d
            r8 = r13
            java.lang.Object r14 = N0.i.b(r3, r4, r5, r6, r7, r8)
            if (r14 != r0) goto L2f
            return r0
        L2f:
            N0.a r14 = (N0.a) r14
            N0.i r13 = r8.f1167b
            A.a r13 = r13.f1185c
            S0.j r0 = r8.f1168c
            S0.b r0 = r0.p
            boolean r0 = r0.f1448b
            r1 = 0
            r3 = 0
            Q0.b r4 = r8.f1172g
            if (r0 != 0) goto L43
        L41:
            r13 = r1
            goto L97
        L43:
            java.lang.Object r13 = r13.f7b
            I0.p r13 = (I0.p) r13
            kotlin.Lazy r13 = r13.f784b
            java.lang.Object r13 = r13.getValue()
            Q0.d r13 = (Q0.d) r13
            if (r13 == 0) goto L41
            if (r4 != 0) goto L54
            goto L41
        L54:
            android.graphics.drawable.Drawable r0 = r14.f1124a
            boolean r5 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r5 == 0) goto L5d
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            goto L5e
        L5d:
            r0 = r3
        L5e:
            if (r0 == 0) goto L41
            android.graphics.Bitmap r0 = r0.getBitmap()
            if (r0 != 0) goto L67
            goto L41
        L67:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            boolean r6 = r14.f1125b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r7 = "coil#is_sampled"
            r5.put(r7, r6)
            java.lang.String r6 = r14.f1127d
            if (r6 == 0) goto L80
            java.lang.String r7 = "coil#disk_cache_key"
            r5.put(r7, r6)
        L80:
            java.util.Map r6 = r4.f1355b
            java.util.Map r6 = m3.l.a0(r6)
            Q0.b r7 = new Q0.b
            java.lang.String r9 = r4.f1354a
            r7.<init>(r9, r6)
            java.util.Map r5 = m3.l.a0(r5)
            Q0.h r13 = r13.f1358a
            r13.h(r7, r0, r5)
            r13 = r2
        L97:
            android.graphics.drawable.Drawable r6 = r14.f1124a
            if (r13 == 0) goto L9d
            r9 = r4
            goto L9e
        L9d:
            r9 = r3
        L9e:
            android.graphics.Bitmap$Config[] r13 = W0.f.f1887a
            N0.l r13 = r8.h
            if (r13 == 0) goto Laa
            boolean r13 = r13.f1197g
            if (r13 == 0) goto Laa
            r12 = r2
            goto Lab
        Laa:
            r12 = r1
        Lab:
            S0.r r5 = new S0.r
            java.lang.String r10 = r14.f1127d
            boolean r11 = r14.f1125b
            S0.j r7 = r8.f1168c
            J0.g r8 = r14.f1126c
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
