package Y;

import b0.C0265j;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes.dex */
public final class F implements InterfaceC0091g {

    /* renamed from: j, reason: collision with root package name */
    public static final LinkedHashSet f2053j = new LinkedHashSet();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f2054k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final J0.e f2055a;

    /* renamed from: b, reason: collision with root package name */
    public final E2.e f2056b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f2057c;

    /* renamed from: d, reason: collision with root package name */
    public final Flow f2058d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2059e;

    /* renamed from: f, reason: collision with root package name */
    public final Lazy f2060f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f2061g;
    public List h;
    public final A.j i;

    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, A.j] */
    public F(J0.e produceFile, List initTasksList, E2.e corruptionHandler, CoroutineScope scope) {
        C0265j serializer = C0265j.f4163a;
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f2055a = produceFile;
        this.f2056b = corruptionHandler;
        this.f2057c = scope;
        this.f2058d = FlowKt.flow(new t(this, null));
        this.f2059e = ".tmp";
        this.f2060f = LazyKt.lazy(new J0.e(this, 1));
        this.f2061g = StateFlowKt.MutableStateFlow(H.f2062a);
        this.h = CollectionsKt.toList(initTasksList);
        I1.b onComplete = new I1.b(this, 2);
        p consumeMessage = new p(this, null);
        o onUndeliveredElement = o.f2090a;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        ?? obj = new Object();
        obj.f27a = scope;
        obj.f28b = consumeMessage;
        obj.f29c = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        obj.f30d = new AtomicInteger(0);
        Job job = (Job) scope.getCoroutineContext().get(Job.INSTANCE);
        if (job != null) {
            job.invokeOnCompletion(new T0.j(onComplete, obj, onUndeliveredElement, 1));
        }
        this.i = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(5:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(5:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:53)|(2:40|(2:42|(1:44))(2:45|46))(2:47|(2:49|50)(2:51|52)))|27)|24))|59|6|7|(0)(0)|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
    
        if (r8 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0037, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v0, types: [Y.F, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [Y.F] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(Y.F r8, Y.l r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.F.c(Y.F, Y.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // Y.InterfaceC0091g
    public final Object a(Function2 function2, Continuation continuation) {
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.i.l(new l(function2, CompletableDeferred$default, (G) this.f2061g.getValue(), continuation.getContext()));
        return CompletableDeferred$default.await(continuation);
    }

    @Override // Y.InterfaceC0091g
    public final Flow b() {
        return this.f2058d;
    }

    public final File d() {
        return (File) this.f2060f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.F.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.Unit, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Y.y
            if (r0 == 0) goto L13
            r0 = r5
            Y.y r0 = (Y.y) r0
            int r1 = r0.f2130d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2130d = r1
            goto L18
        L13:
            Y.y r0 = new Y.y
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2128b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2130d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Y.F r4 = r0.f2127a
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L2b
            goto L43
        L2b:
            r5 = move-exception
            goto L46
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f2127a = r4     // Catch: java.lang.Throwable -> L2b
            r0.f2130d = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r4 = r4.e(r0)     // Catch: java.lang.Throwable -> L2b
            if (r4 != r1) goto L43
            return r1
        L43:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L46:
            kotlinx.coroutines.flow.MutableStateFlow r4 = r4.f2061g
            Y.i r0 = new Y.i
            r0.<init>(r5)
            r4.setValue(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.F.f(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        r4.f2061g.setValue(new Y.i(r5));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Y.z
            if (r0 == 0) goto L13
            r0 = r5
            Y.z r0 = (Y.z) r0
            int r1 = r0.f2134d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2134d = r1
            goto L18
        L13:
            Y.z r0 = new Y.z
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2132b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2134d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Y.F r4 = r0.f2131a
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L2b
            goto L4d
        L2b:
            r5 = move-exception
            goto L43
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f2131a = r4     // Catch: java.lang.Throwable -> L2b
            r0.f2134d = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r4 = r4.e(r0)     // Catch: java.lang.Throwable -> L2b
            if (r4 != r1) goto L4d
            return r1
        L43:
            kotlinx.coroutines.flow.MutableStateFlow r4 = r4.f2061g
            Y.i r0 = new Y.i
            r0.<init>(r5)
            r4.setValue(r0)
        L4d:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.F.g(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [Y.F] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [Y.A] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [Y.F] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Y.A
            if (r0 == 0) goto L13
            r0 = r6
            Y.A r0 = (Y.A) r0
            int r1 = r0.f2031e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2031e = r1
            goto L18
        L13:
            Y.A r0 = new Y.A
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f2029c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2031e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.io.FileInputStream r5 = r0.f2028b
            Y.F r0 = r0.f2027a
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
            goto L56
        L2d:
            r6 = move-exception
            goto L64
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6a
            java.io.File r2 = r5.d()     // Catch: java.io.FileNotFoundException -> L6a
            r6.<init>(r2)     // Catch: java.io.FileNotFoundException -> L6a
            b0.j r2 = b0.C0265j.f4163a     // Catch: java.lang.Throwable -> L62
            r0.f2027a = r5     // Catch: java.lang.Throwable -> L62
            r0.f2028b = r6     // Catch: java.lang.Throwable -> L62
            r0.f2031e = r3     // Catch: java.lang.Throwable -> L62
            b0.b r0 = r2.a(r6)     // Catch: java.lang.Throwable -> L62
            if (r0 != r1) goto L52
            return r1
        L52:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L56:
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r5, r1)     // Catch: java.io.FileNotFoundException -> L5b
            return r6
        L5b:
            r5 = move-exception
            goto L6d
        L5d:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
            goto L64
        L62:
            r0 = move-exception
            goto L5d
        L64:
            throw r6     // Catch: java.lang.Throwable -> L65
        L65:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r5, r6)     // Catch: java.io.FileNotFoundException -> L5b
            throw r1     // Catch: java.io.FileNotFoundException -> L5b
        L6a:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6d:
            java.io.File r6 = r0.d()
            boolean r6 = r6.exists()
            if (r6 != 0) goto L7d
            b0.b r5 = new b0.b
            r5.<init>(r3)
            return r5
        L7d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.F.h(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Y.B
            if (r0 == 0) goto L13
            r0 = r6
            Y.B r0 = (Y.B) r0
            int r1 = r0.f2036e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2036e = r1
            goto L18
        L13:
            Y.B r0 = new Y.B
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f2034c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2036e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L6a
            if (r2 == r4) goto L60
            r5 = 3
            if (r2 == r3) goto L3f
            if (r2 != r5) goto L37
            java.lang.Object r5 = r0.f2033b
            java.lang.Object r0 = r0.f2032a
            Y.a r0 = (Y.C0085a) r0
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.io.IOException -> L35
            return r5
        L35:
            r5 = move-exception
            goto L5c
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            java.lang.Object r2 = r0.f2033b
            Y.a r2 = (Y.C0085a) r2
            java.lang.Object r3 = r0.f2032a
            Y.F r3 = (Y.F) r3
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f2032a = r2     // Catch: java.io.IOException -> L5a
            r0.f2033b = r6     // Catch: java.io.IOException -> L5a
            r0.f2036e = r5     // Catch: java.io.IOException -> L5a
            java.lang.Object r5 = r3.k(r6, r0)     // Catch: java.io.IOException -> L5a
            if (r5 != r1) goto L57
            goto L77
        L57:
            return r6
        L58:
            r0 = r2
            goto L5c
        L5a:
            r5 = move-exception
            goto L58
        L5c:
            kotlin.ExceptionsKt.addSuppressed(r0, r5)
            throw r0
        L60:
            java.lang.Object r5 = r0.f2032a
            Y.F r5 = (Y.F) r5
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: Y.C0085a -> L68
            return r6
        L68:
            r6 = move-exception
            goto L79
        L6a:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f2032a = r5     // Catch: Y.C0085a -> L68
            r0.f2036e = r4     // Catch: Y.C0085a -> L68
            java.lang.Object r5 = r5.h(r0)     // Catch: Y.C0085a -> L68
            if (r5 != r1) goto L78
        L77:
            return r1
        L78:
            return r5
        L79:
            E2.e r1 = r5.f2056b
            r0.f2032a = r5
            r0.f2033b = r6
            r0.f2036e = r3
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.F.i(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.jvm.functions.Function2 r10, kotlin.coroutines.CoroutineContext r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof Y.C
            if (r0 == 0) goto L13
            r0 = r12
            Y.C r0 = (Y.C) r0
            int r1 = r0.f2042f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2042f = r1
            goto L18
        L13:
            Y.C r0 = new Y.C
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f2040d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2042f
            java.lang.String r3 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r4 = 0
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L49
            if (r2 == r7) goto L3d
            if (r2 != r6) goto L35
            java.lang.Object r9 = r0.f2038b
            Y.F r10 = r0.f2037a
            kotlin.ResultKt.throwOnFailure(r12)
            goto La3
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            java.lang.Object r9 = r0.f2039c
            java.lang.Object r10 = r0.f2038b
            Y.b r10 = (Y.C0086b) r10
            Y.F r11 = r0.f2037a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L7d
        L49:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlinx.coroutines.flow.MutableStateFlow r12 = r9.f2061g
            java.lang.Object r12 = r12.getValue()
            Y.b r12 = (Y.C0086b) r12
            java.lang.Object r2 = r12.f2063a
            if (r2 == 0) goto L5d
            int r2 = r2.hashCode()
            goto L5e
        L5d:
            r2 = r4
        L5e:
            int r8 = r12.f2064b
            if (r2 != r8) goto Lba
            Y.D r2 = new Y.D
            java.lang.Object r8 = r12.f2063a
            r2.<init>(r10, r8, r5)
            r0.f2037a = r9
            r0.f2038b = r12
            r0.f2039c = r8
            r0.f2042f = r7
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r11, r2, r0)
            if (r10 != r1) goto L78
            goto La0
        L78:
            r11 = r12
            r12 = r10
            r10 = r11
            r11 = r9
            r9 = r8
        L7d:
            java.lang.Object r2 = r10.f2063a
            if (r2 == 0) goto L86
            int r2 = r2.hashCode()
            goto L87
        L86:
            r2 = r4
        L87:
            int r10 = r10.f2064b
            if (r2 != r10) goto Lb4
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r12)
            if (r10 == 0) goto L92
            return r9
        L92:
            r0.f2037a = r11
            r0.f2038b = r12
            r0.f2039c = r5
            r0.f2042f = r6
            java.lang.Object r9 = r11.k(r12, r0)
            if (r9 != r1) goto La1
        La0:
            return r1
        La1:
            r10 = r11
            r9 = r12
        La3:
            kotlinx.coroutines.flow.MutableStateFlow r10 = r10.f2061g
            Y.b r11 = new Y.b
            if (r9 == 0) goto Lad
            int r4 = r9.hashCode()
        Lad:
            r11.<init>(r9, r4)
            r10.setValue(r11)
            return r9
        Lb4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        Lba:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.F.j(kotlin.jvm.functions.Function2, kotlin.coroutines.CoroutineContext, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7 A[Catch: IOException -> 0x00be, TRY_ENTER, TryCatch #3 {IOException -> 0x00be, blocks: (B:15:0x0097, B:20:0x00a7, B:21:0x00bd, B:28:0x00c8, B:29:0x00cb, B:25:0x00c6), top: B:7:0x0023, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.F.k(java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
