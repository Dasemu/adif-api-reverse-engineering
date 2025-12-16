package B0;

import android.view.View;
import java.util.ArrayList;

/* renamed from: B0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033k implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f147b;

    public C0033k(View view, ArrayList arrayList) {
        this.f146a = view;
        this.f147b = arrayList;
    }

    @Override // B0.v
    public final void a(x xVar) {
        xVar.A(this);
        xVar.a(this);
    }

    @Override // B0.v
    public final void b() {
    }

    @Override // B0.v
    public final void c(x xVar) {
        xVar.A(this);
        this.f146a.setVisibility(8);
        ArrayList arrayList = this.f147b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // B0.v
    public final void d() {
    }

    @Override // B0.v
    public final void e(x xVar) {
    }
}
