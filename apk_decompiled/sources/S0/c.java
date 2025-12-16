package S0;

import android.graphics.Bitmap;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MainCoroutineDispatcher f1449a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f1450b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f1451c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineDispatcher f1452d;

    /* renamed from: e, reason: collision with root package name */
    public final V0.d f1453e;

    /* renamed from: f, reason: collision with root package name */
    public final T0.d f1454f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f1455g;
    public final b h;
    public final b i;

    /* renamed from: j, reason: collision with root package name */
    public final b f1456j;

    public c(MainCoroutineDispatcher mainCoroutineDispatcher, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, V0.d dVar, T0.d dVar2, Bitmap.Config config, b bVar, b bVar2, b bVar3) {
        this.f1449a = mainCoroutineDispatcher;
        this.f1450b = coroutineDispatcher;
        this.f1451c = coroutineDispatcher2;
        this.f1452d = coroutineDispatcher3;
        this.f1453e = dVar;
        this.f1454f = dVar2;
        this.f1455g = config;
        this.h = bVar;
        this.i = bVar2;
        this.f1456j = bVar3;
    }

    public static c a(c cVar, V0.d dVar, int i) {
        b bVar = b.f1443c;
        MainCoroutineDispatcher mainCoroutineDispatcher = cVar.f1449a;
        CoroutineDispatcher coroutineDispatcher = cVar.f1450b;
        CoroutineDispatcher coroutineDispatcher2 = cVar.f1451c;
        CoroutineDispatcher coroutineDispatcher3 = cVar.f1452d;
        if ((i & 16) != 0) {
            dVar = cVar.f1453e;
        }
        V0.d dVar2 = dVar;
        T0.d dVar3 = cVar.f1454f;
        Bitmap.Config config = cVar.f1455g;
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        b bVar2 = (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? cVar.h : bVar;
        b bVar3 = (i & 8192) != 0 ? cVar.i : bVar;
        if ((i & 16384) != 0) {
            bVar = cVar.f1456j;
        }
        cVar.getClass();
        return new c(mainCoroutineDispatcher, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, dVar2, dVar3, config, bVar2, bVar3, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f1449a, cVar.f1449a) && Intrinsics.areEqual(this.f1450b, cVar.f1450b) && Intrinsics.areEqual(this.f1451c, cVar.f1451c) && Intrinsics.areEqual(this.f1452d, cVar.f1452d) && Intrinsics.areEqual(this.f1453e, cVar.f1453e) && this.f1454f == cVar.f1454f && this.f1455g == cVar.f1455g && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && this.h == cVar.h && this.i == cVar.i && this.f1456j == cVar.f1456j;
    }

    public final int hashCode() {
        return this.f1456j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + C.w.c(C.w.c((this.f1455g.hashCode() + ((this.f1454f.hashCode() + ((this.f1453e.hashCode() + ((this.f1452d.hashCode() + ((this.f1451c.hashCode() + ((this.f1450b.hashCode() + (this.f1449a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, true), 923521, false)) * 31)) * 31);
    }
}
