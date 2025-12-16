package S0;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.lifecycle.C;
import androidx.lifecycle.J;
import e3.C0333t;
import e3.C0334u;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1462a;

    /* renamed from: b, reason: collision with root package name */
    public c f1463b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1464c;

    /* renamed from: d, reason: collision with root package name */
    public U0.b f1465d;

    /* renamed from: e, reason: collision with root package name */
    public Q0.b f1466e;

    /* renamed from: f, reason: collision with root package name */
    public String f1467f;

    /* renamed from: g, reason: collision with root package name */
    public final List f1468g;
    public final C0333t h;
    public final Map i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1469j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1470k;

    /* renamed from: l, reason: collision with root package name */
    public final A.a f1471l;

    /* renamed from: m, reason: collision with root package name */
    public C f1472m;

    /* renamed from: n, reason: collision with root package name */
    public T0.i f1473n;

    /* renamed from: o, reason: collision with root package name */
    public T0.g f1474o;

    public i(Context context) {
        this.f1462a = context;
        this.f1463b = W0.d.f1886a;
        this.f1464c = null;
        this.f1465d = null;
        this.f1466e = null;
        this.f1467f = null;
        this.f1468g = CollectionsKt.emptyList();
        this.h = null;
        this.i = null;
        this.f1469j = true;
        this.f1470k = true;
        this.f1471l = null;
        this.f1472m = null;
        this.f1473n = null;
        this.f1474o = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [S0.d, java.lang.Object] */
    public final j a() {
        b bVar;
        C c4;
        ImageView.ScaleType scaleType;
        C lifecycle;
        Object obj = this.f1464c;
        if (obj == null) {
            obj = l.f1500a;
        }
        Object obj2 = obj;
        U0.b bVar2 = this.f1465d;
        Q0.b bVar3 = this.f1466e;
        String str = this.f1467f;
        c cVar = this.f1463b;
        Bitmap.Config config = cVar.f1455g;
        T0.d dVar = cVar.f1454f;
        V0.d dVar2 = cVar.f1453e;
        C0333t c0333t = this.h;
        C0334u d4 = c0333t != null ? c0333t.d() : null;
        if (d4 == null) {
            d4 = W0.f.f1889c;
        } else {
            Bitmap.Config[] configArr = W0.f.f1887a;
        }
        C0334u c0334u = d4;
        Map map = this.i;
        s sVar = map != null ? new s(m3.l.a0(map)) : null;
        if (sVar == null) {
            sVar = s.f1524b;
        }
        s sVar2 = sVar;
        this.f1463b.getClass();
        this.f1463b.getClass();
        c cVar2 = this.f1463b;
        b bVar4 = cVar2.h;
        b bVar5 = cVar2.i;
        b bVar6 = cVar2.f1456j;
        MainCoroutineDispatcher mainCoroutineDispatcher = cVar2.f1449a;
        CoroutineDispatcher coroutineDispatcher = cVar2.f1450b;
        CoroutineDispatcher coroutineDispatcher2 = cVar2.f1451c;
        CoroutineDispatcher coroutineDispatcher3 = cVar2.f1452d;
        C c5 = this.f1472m;
        Context context = this.f1462a;
        if (c5 == null) {
            U0.b bVar7 = this.f1465d;
            bVar = bVar4;
            Object context2 = bVar7 instanceof U0.a ? ((U0.a) bVar7).f1775b.getContext() : context;
            while (true) {
                if (context2 instanceof J) {
                    lifecycle = ((J) context2).getLifecycle();
                    break;
                }
                if (!(context2 instanceof ContextWrapper)) {
                    lifecycle = null;
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            if (lifecycle == null) {
                lifecycle = h.f1460b;
            }
            c4 = lifecycle;
        } else {
            bVar = bVar4;
            c4 = c5;
        }
        T0.i iVar = this.f1473n;
        if (iVar == null) {
            U0.b bVar8 = this.f1465d;
            if (bVar8 instanceof U0.a) {
                ImageView imageView = ((U0.a) bVar8).f1775b;
                if (imageView == null || !((scaleType = imageView.getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) {
                    iVar = new T0.f(imageView);
                } else {
                    T0.h hVar = T0.h.f1642c;
                    iVar = new Object();
                }
            } else {
                iVar = new T0.c(context);
            }
        }
        T0.i iVar2 = iVar;
        T0.g gVar = this.f1474o;
        if (gVar == null) {
            U0.b bVar9 = this.f1465d;
            U0.a aVar = bVar9 instanceof U0.a ? (U0.a) bVar9 : null;
            ImageView imageView2 = aVar != null ? aVar.f1775b : null;
            if (imageView2 != null) {
                Bitmap.Config[] configArr2 = W0.f.f1887a;
                ImageView.ScaleType scaleType2 = imageView2.getScaleType();
                int i = scaleType2 == null ? -1 : W0.e.$EnumSwitchMapping$1[scaleType2.ordinal()];
                gVar = (i == 1 || i == 2 || i == 3 || i == 4) ? T0.g.f1639b : T0.g.f1638a;
            } else {
                gVar = T0.g.f1639b;
            }
        }
        T0.g gVar2 = gVar;
        A.a aVar2 = this.f1471l;
        p pVar = aVar2 != null ? new p(m3.l.a0((Map) aVar2.f7b)) : null;
        if (pVar == null) {
            pVar = p.f1515b;
        }
        return new j(this.f1462a, obj2, bVar2, bVar3, str, config, dVar, this.f1468g, dVar2, c0334u, sVar2, this.f1469j, true, false, this.f1470k, bVar, bVar5, bVar6, mainCoroutineDispatcher, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, c4, iVar2, gVar2, pVar, new Object(), this.f1463b);
    }

    public final void b(String str) {
        this.f1466e = str != null ? new Q0.b(str) : null;
    }

    public final void c(ImageView imageView) {
        this.f1465d = new U0.a(imageView);
        this.f1472m = null;
        this.f1473n = null;
        this.f1474o = null;
    }

    public i(j jVar, Context context) {
        this.f1462a = context;
        this.f1463b = jVar.f1476B;
        this.f1464c = jVar.f1478b;
        this.f1465d = jVar.f1479c;
        this.f1466e = jVar.f1480d;
        this.f1467f = jVar.f1481e;
        this.f1468g = jVar.h;
        this.h = jVar.f1484j.c();
        this.i = MapsKt.toMutableMap(jVar.f1485k.f1525a);
        this.f1469j = jVar.f1486l;
        this.f1470k = jVar.f1489o;
        p pVar = jVar.f1499z;
        pVar.getClass();
        this.f1471l = new A.a(pVar);
        if (jVar.f1477a == context) {
            this.f1472m = jVar.f1496w;
            this.f1473n = jVar.f1497x;
            this.f1474o = jVar.f1498y;
        } else {
            this.f1472m = null;
            this.f1473n = null;
            this.f1474o = null;
        }
    }
}
