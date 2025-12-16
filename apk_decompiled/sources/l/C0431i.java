package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0357d;
import g.C0361h;
import g.DialogInterfaceC0362i;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0431i implements y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f7228a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f7229b;

    /* renamed from: c, reason: collision with root package name */
    public m f7230c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f7231d;

    /* renamed from: e, reason: collision with root package name */
    public x f7232e;

    /* renamed from: f, reason: collision with root package name */
    public C0430h f7233f;

    public C0431i(ContextWrapper contextWrapper) {
        this.f7228a = contextWrapper;
        this.f7229b = LayoutInflater.from(contextWrapper);
    }

    @Override // l.y
    public final void b(m mVar, boolean z3) {
        x xVar = this.f7232e;
        if (xVar != null) {
            xVar.b(mVar, z3);
        }
    }

    @Override // l.y
    public final void d(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f7231d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // l.y
    public final void e(x xVar) {
        throw null;
    }

    @Override // l.y
    public final boolean g(o oVar) {
        return false;
    }

    @Override // l.y
    public final int getId() {
        return 0;
    }

    @Override // l.y
    public final void h(boolean z3) {
        C0430h c0430h = this.f7233f;
        if (c0430h != null) {
            c0430h.notifyDataSetChanged();
        }
    }

    @Override // l.y
    public final void i(Context context, m mVar) {
        if (this.f7228a != null) {
            this.f7228a = context;
            if (this.f7229b == null) {
                this.f7229b = LayoutInflater.from(context);
            }
        }
        this.f7230c = mVar;
        C0430h c0430h = this.f7233f;
        if (c0430h != null) {
            c0430h.notifyDataSetChanged();
        }
    }

    @Override // l.y
    public final boolean j() {
        return false;
    }

    @Override // l.y
    public final Parcelable k() {
        if (this.f7231d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f7231d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, l.x, java.lang.Object, l.n, android.content.DialogInterface$OnDismissListener] */
    @Override // l.y
    public final boolean l(SubMenuC0422E subMenuC0422E) {
        if (!subMenuC0422E.hasVisibleItems()) {
            return false;
        }
        ?? obj = new Object();
        obj.f7262a = subMenuC0422E;
        Context context = subMenuC0422E.f7241a;
        C0361h c0361h = new C0361h(context);
        C0357d c0357d = c0361h.f6647a;
        C0431i c0431i = new C0431i(c0357d.f6601a);
        obj.f7264c = c0431i;
        c0431i.f7232e = obj;
        subMenuC0422E.b(c0431i, context);
        C0431i c0431i2 = obj.f7264c;
        if (c0431i2.f7233f == null) {
            c0431i2.f7233f = new C0430h(c0431i2);
        }
        c0357d.f6613o = c0431i2.f7233f;
        c0357d.p = obj;
        View view = subMenuC0422E.f7253o;
        if (view != null) {
            c0357d.f6605e = view;
        } else {
            c0357d.f6603c = subMenuC0422E.f7252n;
            c0357d.f6604d = subMenuC0422E.f7251m;
        }
        c0357d.f6612n = obj;
        DialogInterfaceC0362i a2 = c0361h.a();
        obj.f7263b = a2;
        a2.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f7263b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f7263b.show();
        x xVar = this.f7232e;
        if (xVar == null) {
            return true;
        }
        xVar.f(subMenuC0422E);
        return true;
    }

    @Override // l.y
    public final boolean m(o oVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        this.f7230c.q(this.f7233f.getItem(i), this, 0);
    }
}
