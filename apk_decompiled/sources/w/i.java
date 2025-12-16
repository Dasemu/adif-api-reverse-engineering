package w;

import java.util.ArrayList;
import x.m;

/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f8800q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f8801r0 = 0;

    public final void R(int i, ArrayList arrayList, m mVar) {
        for (int i4 = 0; i4 < this.f8801r0; i4++) {
            d dVar = this.f8800q0[i4];
            ArrayList arrayList2 = mVar.f8839a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i5 = 0; i5 < this.f8801r0; i5++) {
            x.g.b(this.f8800q0[i5], i, arrayList, mVar);
        }
    }

    public void S() {
    }
}
