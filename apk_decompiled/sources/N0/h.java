package N0;

import S0.o;
import a.AbstractC0106b;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public List f1173a;

    /* renamed from: b, reason: collision with root package name */
    public o f1174b;

    /* renamed from: c, reason: collision with root package name */
    public int f1175c;

    /* renamed from: d, reason: collision with root package name */
    public int f1176d;

    /* renamed from: e, reason: collision with root package name */
    public int f1177e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1178f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f1179g;
    public final /* synthetic */ a h;
    public final /* synthetic */ o i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f1180j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I0.d f1181k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S0.j f1182l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, a aVar, o oVar, List list, I0.d dVar, S0.j jVar, Continuation continuation) {
        super(2, continuation);
        this.f1179g = iVar;
        this.h = aVar;
        this.i = oVar;
        this.f1180j = list;
        this.f1181k = dVar;
        this.f1182l = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f1179g, this.h, this.i, this.f1180j, this.f1181k, this.f1182l, continuation);
        hVar.f1178f = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        o oVar;
        Bitmap e4;
        List list;
        int size;
        int i;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f1177e;
        a aVar = this.h;
        I0.d dVar = this.f1181k;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.f1178f;
            Drawable drawable = aVar.f1124a;
            boolean z3 = drawable instanceof BitmapDrawable;
            oVar = this.i;
            if (z3) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (ArraysKt.contains(W0.f.f1887a, config)) {
                    e4 = bitmap;
                    dVar.getClass();
                    list = this.f1180j;
                    size = list.size();
                    i = 0;
                }
            }
            e4 = AbstractC0106b.e(drawable, oVar.f1503b, oVar.f1505d, oVar.f1506e, oVar.f1507f);
            dVar.getClass();
            list = this.f1180j;
            size = list.size();
            i = 0;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.f1176d;
            int i5 = this.f1175c;
            oVar = this.f1174b;
            list = this.f1173a;
            coroutineScope = (CoroutineScope) this.f1178f;
            ResultKt.throwOnFailure(obj);
            e4 = (Bitmap) obj;
            CoroutineScopeKt.ensureActive(coroutineScope);
            i = i5 + 1;
        }
        if (i >= size) {
            dVar.getClass();
            return new a(new BitmapDrawable(this.f1182l.f1477a.getResources(), e4), aVar.f1125b, aVar.f1126c, aVar.f1127d);
        }
        if (list.get(i) != null) {
            throw new ClassCastException();
        }
        T0.h hVar = oVar.f1505d;
        this.f1178f = coroutineScope;
        this.f1173a = list;
        this.f1174b = oVar;
        this.f1175c = i;
        this.f1176d = size;
        this.f1177e = 1;
        throw null;
    }
}
