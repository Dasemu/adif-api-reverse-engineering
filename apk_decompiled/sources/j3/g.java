package j3;

import e3.I;
import e3.O;
import e3.x;
import e3.y;
import i3.j;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g implements x {

    /* renamed from: a, reason: collision with root package name */
    public final j f6948a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6949b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6950c;

    /* renamed from: d, reason: collision with root package name */
    public final i3.e f6951d;

    /* renamed from: e, reason: collision with root package name */
    public final I f6952e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6953f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6954g;
    public final int h;
    public int i;

    public g(j call, ArrayList interceptors, int i, i3.e eVar, I request, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f6948a = call;
        this.f6949b = interceptors;
        this.f6950c = i;
        this.f6951d = eVar;
        this.f6952e = request;
        this.f6953f = i4;
        this.f6954g = i5;
        this.h = i6;
    }

    public static g a(g gVar, int i, i3.e eVar, I i4, int i5) {
        if ((i5 & 1) != 0) {
            i = gVar.f6950c;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            eVar = gVar.f6951d;
        }
        i3.e eVar2 = eVar;
        if ((i5 & 4) != 0) {
            i4 = gVar.f6952e;
        }
        I request = i4;
        int i7 = gVar.f6953f;
        int i8 = gVar.f6954g;
        int i9 = gVar.h;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        return new g(gVar.f6948a, gVar.f6949b, i6, eVar2, request, i7, i8, i9);
    }

    public final O b(I request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = this.f6949b;
        int size = arrayList.size();
        int i = this.f6950c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        i3.e eVar = this.f6951d;
        if (eVar != null) {
            if (!eVar.f6843b.b(request.f6267a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i4 = i + 1;
        g a2 = a(this, i4, null, request, 58);
        y yVar = (y) arrayList.get(i);
        O intercept = yVar.intercept(a2);
        if (intercept == null) {
            throw new NullPointerException("interceptor " + yVar + " returned null");
        }
        if (eVar != null && i4 < arrayList.size() && a2.i != 1) {
            throw new IllegalStateException(("network interceptor " + yVar + " must call proceed() exactly once").toString());
        }
        if (intercept.f6297g != null) {
            return intercept;
        }
        throw new IllegalStateException(("interceptor " + yVar + " returned a response with no body").toString());
    }
}
