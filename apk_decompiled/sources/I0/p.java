package I0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import e3.w;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public final S0.c f783a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f784b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f785c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f786d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineScope f787e = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()).plus(new o(CoroutineExceptionHandler.INSTANCE, this)));

    /* renamed from: f, reason: collision with root package name */
    public final F.i f788f;

    /* renamed from: g, reason: collision with root package name */
    public final c f789g;
    public final List h;

    public p(Context context, S0.c cVar, Lazy lazy, Lazy lazy2, Lazy lazy3, c cVar2, W0.h hVar) {
        this.f783a = cVar;
        this.f784b = lazy;
        this.f785c = lazy2;
        this.f786d = lazy3;
        W0.j jVar = new W0.j(this, context, hVar.f1893b);
        F.i iVar = new F.i(5, this, jVar);
        this.f788f = iVar;
        b bVar = new b(cVar2);
        bVar.b(new P0.a(2), w.class);
        bVar.b(new P0.a(5), String.class);
        bVar.b(new P0.a(1), Uri.class);
        bVar.b(new P0.a(4), Uri.class);
        bVar.b(new P0.a(3), Integer.class);
        bVar.b(new P0.a(0), byte[].class);
        Object obj = new Object();
        List list = (List) bVar.f741d;
        list.add(TuplesKt.to(obj, Uri.class));
        list.add(TuplesKt.to(new O0.a(hVar.f1892a), File.class));
        bVar.a(new M0.i(lazy3, lazy2, hVar.f1894c), Uri.class);
        bVar.a(new M0.a(5), File.class);
        bVar.a(new M0.a(0), Uri.class);
        bVar.a(new M0.a(3), Uri.class);
        bVar.a(new M0.a(6), Uri.class);
        bVar.a(new M0.a(4), Drawable.class);
        bVar.a(new M0.a(1), Bitmap.class);
        bVar.a(new M0.a(2), ByteBuffer.class);
        J0.c cVar3 = new J0.c(hVar.f1895d, hVar.f1896e);
        List list2 = (List) bVar.f743f;
        list2.add(cVar3);
        List Z = m3.l.Z((List) bVar.f739b);
        this.f789g = new c(Z, m3.l.Z((List) bVar.f740c), m3.l.Z(list), m3.l.Z((List) bVar.f742e), m3.l.Z(list2));
        this.h = CollectionsKt.plus((Collection<? extends N0.i>) Z, new N0.i(this, iVar));
        new AtomicBoolean(false);
        context.registerComponentCallbacks(jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ef A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:23:0x00e5, B:25:0x00ef, B:26:0x00f2, B:28:0x00fd, B:29:0x0100, B:14:0x00c4, B:16:0x00ca, B:18:0x00cf, B:70:0x019e, B:71:0x01a5), top: B:13:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:23:0x00e5, B:25:0x00ef, B:26:0x00f2, B:28:0x00fd, B:29:0x0100, B:14:0x00c4, B:16:0x00ca, B:18:0x00cf, B:70:0x019e, B:71:0x01a5), top: B:13:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149 A[Catch: all -> 0x0183, TryCatch #1 {all -> 0x0183, blocks: (B:37:0x0143, B:39:0x0149, B:42:0x015b, B:43:0x0178, B:46:0x015f, B:48:0x016c, B:49:0x0172, B:50:0x0185, B:52:0x0189), top: B:36:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0185 A[Catch: all -> 0x0183, TryCatch #1 {all -> 0x0183, blocks: (B:37:0x0143, B:39:0x0149, B:42:0x015b, B:43:0x0178, B:46:0x015f, B:48:0x016c, B:49:0x0172, B:50:0x0185, B:52:0x0189), top: B:36:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01aa A[Catch: all -> 0x01bc, TRY_LEAVE, TryCatch #5 {all -> 0x01bc, blocks: (B:57:0x01a6, B:59:0x01aa, B:62:0x01be, B:63:0x01c7), top: B:56:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01be A[Catch: all -> 0x01bc, TRY_ENTER, TryCatch #5 {all -> 0x01bc, blocks: (B:57:0x01a6, B:59:0x01aa, B:62:0x01be, B:63:0x01c7), top: B:56:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007f  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [S0.q] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, S0.j] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, I0.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(I0.p r19, S0.j r20, int r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.p.a(I0.p, S0.j, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void c(S0.f fVar, U0.b bVar, d dVar) {
        S0.j jVar = fVar.f1458b;
        boolean z3 = bVar instanceof U0.a;
        Drawable drawable = fVar.f1457a;
        if (z3) {
            V0.e a2 = jVar.i.a((U0.a) bVar, fVar);
            if (a2 instanceof V0.c) {
                ((U0.a) bVar).b(drawable);
            } else {
                dVar.getClass();
                a2.a();
            }
        } else if (bVar != null) {
            bVar.onError(drawable);
        }
        dVar.getClass();
        jVar.getClass();
    }

    public final S0.e b(S0.j jVar) {
        Deferred async$default = BuildersKt.async$default(this.f787e, null, null, new j(this, jVar, null), 3, null);
        U0.b bVar = jVar.f1479c;
        return bVar instanceof U0.a ? W0.f.c(((U0.a) bVar).f1775b).a(async$default) : new S0.n(async$default);
    }
}
