package S0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import e3.C0334u;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1502a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f1503b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorSpace f1504c;

    /* renamed from: d, reason: collision with root package name */
    public final T0.h f1505d;

    /* renamed from: e, reason: collision with root package name */
    public final T0.g f1506e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1507f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1508g;
    public final boolean h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final C0334u f1509j;

    /* renamed from: k, reason: collision with root package name */
    public final s f1510k;

    /* renamed from: l, reason: collision with root package name */
    public final p f1511l;

    /* renamed from: m, reason: collision with root package name */
    public final b f1512m;

    /* renamed from: n, reason: collision with root package name */
    public final b f1513n;

    /* renamed from: o, reason: collision with root package name */
    public final b f1514o;

    public o(Context context, Bitmap.Config config, ColorSpace colorSpace, T0.h hVar, T0.g gVar, boolean z3, boolean z4, boolean z5, String str, C0334u c0334u, s sVar, p pVar, b bVar, b bVar2, b bVar3) {
        this.f1502a = context;
        this.f1503b = config;
        this.f1504c = colorSpace;
        this.f1505d = hVar;
        this.f1506e = gVar;
        this.f1507f = z3;
        this.f1508g = z4;
        this.h = z5;
        this.i = str;
        this.f1509j = c0334u;
        this.f1510k = sVar;
        this.f1511l = pVar;
        this.f1512m = bVar;
        this.f1513n = bVar2;
        this.f1514o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f1502a, oVar.f1502a) && this.f1503b == oVar.f1503b && Intrinsics.areEqual(this.f1504c, oVar.f1504c) && Intrinsics.areEqual(this.f1505d, oVar.f1505d) && this.f1506e == oVar.f1506e && this.f1507f == oVar.f1507f && this.f1508g == oVar.f1508g && this.h == oVar.h && Intrinsics.areEqual(this.i, oVar.i) && Intrinsics.areEqual(this.f1509j, oVar.f1509j) && Intrinsics.areEqual(this.f1510k, oVar.f1510k) && Intrinsics.areEqual(this.f1511l, oVar.f1511l) && this.f1512m == oVar.f1512m && this.f1513n == oVar.f1513n && this.f1514o == oVar.f1514o;
    }

    public final int hashCode() {
        int hashCode = (this.f1503b.hashCode() + (this.f1502a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f1504c;
        int c4 = C.w.c(C.w.c(C.w.c((this.f1506e.hashCode() + ((this.f1505d.hashCode() + ((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f1507f), 31, this.f1508g), 31, this.h);
        String str = this.i;
        return this.f1514o.hashCode() + ((this.f1513n.hashCode() + ((this.f1512m.hashCode() + ((this.f1511l.f1516a.hashCode() + ((this.f1510k.f1525a.hashCode() + ((((c4 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f1509j.f6404a)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
