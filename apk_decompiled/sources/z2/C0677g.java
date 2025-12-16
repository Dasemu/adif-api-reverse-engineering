package z2;

import B0.B;
import B0.C0023a;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import k2.C0417a;
import l.SubMenuC0422E;
import l.m;
import l.o;
import l.y;

/* renamed from: z2.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0677g implements y {

    /* renamed from: a, reason: collision with root package name */
    public n2.b f9084a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9085b;

    /* renamed from: c, reason: collision with root package name */
    public int f9086c;

    @Override // l.y
    public final void b(m mVar, boolean z3) {
    }

    @Override // l.y
    public final void d(Parcelable parcelable) {
        SparseArray sparseArray;
        if (parcelable instanceof C0676f) {
            n2.b bVar = this.f9084a;
            C0676f c0676f = (C0676f) parcelable;
            int i = c0676f.f9082a;
            int size = bVar.f9058E.f7246f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                MenuItem item = bVar.f9058E.getItem(i4);
                if (i == item.getItemId()) {
                    bVar.f9065g = i;
                    bVar.h = i4;
                    item.setChecked(true);
                    break;
                }
                i4++;
            }
            Context context = this.f9084a.getContext();
            x2.f fVar = c0676f.f9083b;
            SparseArray sparseArray2 = new SparseArray(fVar.size());
            for (int i5 = 0; i5 < fVar.size(); i5++) {
                int keyAt = fVar.keyAt(i5);
                k2.b bVar2 = (k2.b) fVar.valueAt(i5);
                sparseArray2.put(keyAt, bVar2 != null ? new C0417a(context, bVar2) : null);
            }
            n2.b bVar3 = this.f9084a;
            bVar3.getClass();
            int i6 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = bVar3.f9074s;
                if (i6 >= size2) {
                    break;
                }
                int keyAt2 = sparseArray2.keyAt(i6);
                if (sparseArray.indexOfKey(keyAt2) < 0) {
                    sparseArray.append(keyAt2, (C0417a) sparseArray2.get(keyAt2));
                }
                i6++;
            }
            AbstractC0673c[] abstractC0673cArr = bVar3.f9064f;
            if (abstractC0673cArr != null) {
                for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                    C0417a c0417a = (C0417a) sparseArray.get(abstractC0673c.getId());
                    if (c0417a != null) {
                        abstractC0673c.setBadge(c0417a);
                    }
                }
            }
        }
    }

    @Override // l.y
    public final boolean g(o oVar) {
        return false;
    }

    @Override // l.y
    public final int getId() {
        return this.f9086c;
    }

    @Override // l.y
    public final void h(boolean z3) {
        C0023a c0023a;
        if (this.f9085b) {
            return;
        }
        if (z3) {
            this.f9084a.b();
            return;
        }
        n2.b bVar = this.f9084a;
        m mVar = bVar.f9058E;
        if (mVar == null || bVar.f9064f == null) {
            return;
        }
        int size = mVar.f7246f.size();
        if (size != bVar.f9064f.length) {
            bVar.b();
            return;
        }
        int i = bVar.f9065g;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = bVar.f9058E.getItem(i4);
            if (item.isChecked()) {
                bVar.f9065g = item.getItemId();
                bVar.h = i4;
            }
        }
        if (i != bVar.f9065g && (c0023a = bVar.f9059a) != null) {
            B.a(bVar, c0023a);
        }
        int i5 = bVar.f9063e;
        boolean z4 = i5 != -1 ? i5 == 0 : bVar.f9058E.l().size() > 3;
        for (int i6 = 0; i6 < size; i6++) {
            bVar.f9057D.f9085b = true;
            bVar.f9064f[i6].setLabelVisibilityMode(bVar.f9063e);
            bVar.f9064f[i6].setShifting(z4);
            bVar.f9064f[i6].b((o) bVar.f9058E.getItem(i6));
            bVar.f9057D.f9085b = false;
        }
    }

    @Override // l.y
    public final void i(Context context, m mVar) {
        this.f9084a.f9058E = mVar;
    }

    @Override // l.y
    public final boolean j() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, z2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.util.SparseArray, x2.f] */
    @Override // l.y
    public final Parcelable k() {
        ?? obj = new Object();
        obj.f9082a = this.f9084a.getSelectedItemId();
        SparseArray<C0417a> badgeDrawables = this.f9084a.getBadgeDrawables();
        ?? sparseArray = new SparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int keyAt = badgeDrawables.keyAt(i);
            C0417a valueAt = badgeDrawables.valueAt(i);
            sparseArray.put(keyAt, valueAt != null ? valueAt.f7054e.f7088a : null);
        }
        obj.f9083b = sparseArray;
        return obj;
    }

    @Override // l.y
    public final boolean l(SubMenuC0422E subMenuC0422E) {
        return false;
    }

    @Override // l.y
    public final boolean m(o oVar) {
        return false;
    }
}
