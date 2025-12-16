package E2;

import android.graphics.Matrix;
import android.graphics.Path;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public float f461a;

    /* renamed from: b, reason: collision with root package name */
    public float f462b;

    /* renamed from: c, reason: collision with root package name */
    public float f463c;

    /* renamed from: d, reason: collision with root package name */
    public float f464d;

    /* renamed from: e, reason: collision with root package name */
    public float f465e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f466f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f467g = new ArrayList();

    public t() {
        d(BitmapDescriptorFactory.HUE_RED, 270.0f, BitmapDescriptorFactory.HUE_RED);
    }

    public final void a(float f2) {
        float f4 = this.f464d;
        if (f4 == f2) {
            return;
        }
        float f5 = ((f2 - f4) + 360.0f) % 360.0f;
        if (f5 > 180.0f) {
            return;
        }
        float f6 = this.f462b;
        float f7 = this.f463c;
        p pVar = new p(f6, f7, f6, f7);
        pVar.f456f = this.f464d;
        pVar.f457g = f5;
        this.f467g.add(new n(pVar));
        this.f464d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f466f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((r) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E2.q, E2.r, java.lang.Object] */
    public final void c(float f2, float f4) {
        ?? rVar = new r();
        rVar.f458b = f2;
        rVar.f459c = f4;
        this.f466f.add(rVar);
        o oVar = new o(rVar, this.f462b, this.f463c);
        float a2 = oVar.a() + 270.0f;
        float a4 = oVar.a() + 270.0f;
        a(a2);
        this.f467g.add(oVar);
        this.f464d = a4;
        this.f462b = f2;
        this.f463c = f4;
    }

    public final void d(float f2, float f4, float f5) {
        this.f461a = f2;
        this.f462b = BitmapDescriptorFactory.HUE_RED;
        this.f463c = f2;
        this.f464d = f4;
        this.f465e = (f4 + f5) % 360.0f;
        this.f466f.clear();
        this.f467g.clear();
    }
}
