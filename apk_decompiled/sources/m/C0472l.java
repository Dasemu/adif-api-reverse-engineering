package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.adif.elcanomovil.R;
import java.util.ArrayList;
import l.InterfaceC0418A;
import l.SubMenuC0422E;

/* renamed from: m.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472l implements l.y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7676a;

    /* renamed from: b, reason: collision with root package name */
    public Context f7677b;

    /* renamed from: c, reason: collision with root package name */
    public l.m f7678c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f7679d;

    /* renamed from: e, reason: collision with root package name */
    public l.x f7680e;
    public InterfaceC0418A h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C0468j f7683j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f7684k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7685l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7686m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7687n;

    /* renamed from: o, reason: collision with root package name */
    public int f7688o;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public int f7689q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7690r;

    /* renamed from: t, reason: collision with root package name */
    public C0462g f7692t;

    /* renamed from: u, reason: collision with root package name */
    public C0462g f7693u;

    /* renamed from: v, reason: collision with root package name */
    public RunnableC0466i f7694v;

    /* renamed from: w, reason: collision with root package name */
    public C0464h f7695w;

    /* renamed from: y, reason: collision with root package name */
    public int f7697y;

    /* renamed from: f, reason: collision with root package name */
    public final int f7681f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f7682g = R.layout.abc_action_menu_item_layout;

    /* renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f7691s = new SparseBooleanArray();

    /* renamed from: x, reason: collision with root package name */
    public final h3.d f7696x = new h3.d(this, 5);

    public C0472l(Context context) {
        this.f7676a = context;
        this.f7679d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.z] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View a(l.o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof l.z ? (l.z) view : (l.z) this.f7679d.inflate(this.f7682g, viewGroup, false);
            actionMenuItemView.b(oVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f7695w == null) {
                this.f7695w = new C0464h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f7695w);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(oVar.f7267C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0476n)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // l.y
    public final void b(l.m mVar, boolean z3) {
        c();
        C0462g c0462g = this.f7693u;
        if (c0462g != null && c0462g.b()) {
            c0462g.i.dismiss();
        }
        l.x xVar = this.f7680e;
        if (xVar != null) {
            xVar.b(mVar, z3);
        }
    }

    public final boolean c() {
        Object obj;
        RunnableC0466i runnableC0466i = this.f7694v;
        if (runnableC0466i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0466i);
            this.f7694v = null;
            return true;
        }
        C0462g c0462g = this.f7692t;
        if (c0462g == null) {
            return false;
        }
        if (c0462g.b()) {
            c0462g.i.dismiss();
        }
        return true;
    }

    @Override // l.y
    public final void d(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof C0470k) && (i = ((C0470k) parcelable).f7673a) > 0 && (findItem = this.f7678c.findItem(i)) != null) {
            l((SubMenuC0422E) findItem.getSubMenu());
        }
    }

    @Override // l.y
    public final void e(l.x xVar) {
        throw null;
    }

    public final boolean f() {
        C0462g c0462g = this.f7692t;
        return c0462g != null && c0462g.b();
    }

    @Override // l.y
    public final boolean g(l.o oVar) {
        return false;
    }

    @Override // l.y
    public final int getId() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.y
    public final void h(boolean z3) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            l.m mVar = this.f7678c;
            if (mVar != null) {
                mVar.i();
                ArrayList l4 = this.f7678c.l();
                int size = l4.size();
                i = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    l.o oVar = (l.o) l4.get(i4);
                    if ((oVar.f7288x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        l.o itemData = childAt instanceof l.z ? ((l.z) childAt).getItemData() : null;
                        View a2 = a(oVar, childAt, viewGroup);
                        if (oVar != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.h).addView(a2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f7683j) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.h).requestLayout();
        l.m mVar2 = this.f7678c;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.i;
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                l.p pVar = ((l.o) arrayList2.get(i5)).f7265A;
            }
        }
        l.m mVar3 = this.f7678c;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.f7248j;
        }
        if (this.f7686m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !((l.o) arrayList.get(0)).f7267C;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f7683j == null) {
                this.f7683j = new C0468j(this, this.f7676a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f7683j.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f7683j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0468j c0468j = this.f7683j;
                actionMenuView.getClass();
                C0476n j4 = ActionMenuView.j();
                j4.f7709a = true;
                actionMenuView.addView(c0468j, j4);
            }
        } else {
            C0468j c0468j2 = this.f7683j;
            if (c0468j2 != null) {
                Object parent = c0468j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f7683j);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f7686m);
    }

    @Override // l.y
    public final void i(Context context, l.m mVar) {
        this.f7677b = context;
        LayoutInflater.from(context);
        this.f7678c = mVar;
        Resources resources = context.getResources();
        if (!this.f7687n) {
            this.f7686m = true;
        }
        int i = 2;
        this.f7688o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600 || ((i4 > 960 && i5 > 720) || (i4 > 720 && i5 > 960))) {
            i = 5;
        } else if (i4 >= 500 || ((i4 > 640 && i5 > 480) || (i4 > 480 && i5 > 640))) {
            i = 4;
        } else if (i4 >= 360) {
            i = 3;
        }
        this.f7689q = i;
        int i6 = this.f7688o;
        if (this.f7686m) {
            if (this.f7683j == null) {
                C0468j c0468j = new C0468j(this, this.f7676a);
                this.f7683j = c0468j;
                if (this.f7685l) {
                    c0468j.setImageDrawable(this.f7684k);
                    this.f7684k = null;
                    this.f7685l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f7683j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i6 -= this.f7683j.getMeasuredWidth();
        } else {
            this.f7683j = null;
        }
        this.p = i6;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // l.y
    public final boolean j() {
        int i;
        ArrayList arrayList;
        int i4;
        boolean z3;
        C0472l c0472l = this;
        l.m mVar = c0472l.f7678c;
        if (mVar != null) {
            arrayList = mVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i5 = c0472l.f7689q;
        int i6 = c0472l.p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0472l.h;
        int i7 = 0;
        boolean z4 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i4 = 2;
            z3 = true;
            if (i7 >= i) {
                break;
            }
            l.o oVar = (l.o) arrayList.get(i7);
            int i10 = oVar.f7289y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z4 = true;
            }
            if (c0472l.f7690r && oVar.f7267C) {
                i5 = 0;
            }
            i7++;
        }
        if (c0472l.f7686m && (z4 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = c0472l.f7691s;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            l.o oVar2 = (l.o) arrayList.get(i12);
            int i14 = oVar2.f7289y;
            boolean z5 = (i14 & 2) == i4 ? z3 : false;
            int i15 = oVar2.f7269b;
            if (z5) {
                View a2 = c0472l.a(oVar2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z3);
                }
                oVar2.g(z3);
            } else if ((i14 & 1) == z3) {
                boolean z6 = sparseBooleanArray.get(i15);
                boolean z7 = ((i11 > 0 || z6) && i6 > 0) ? z3 : false;
                if (z7) {
                    View a4 = c0472l.a(oVar2, null, viewGroup);
                    a4.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a4.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z7 &= i6 + i13 > 0;
                }
                if (z7 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z6) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i12; i16++) {
                        l.o oVar3 = (l.o) arrayList.get(i16);
                        if (oVar3.f7269b == i15) {
                            if ((oVar3.f7288x & 32) == 32) {
                                i11++;
                            }
                            oVar3.g(false);
                        }
                    }
                }
                if (z7) {
                    i11--;
                }
                oVar2.g(z7);
            } else {
                oVar2.g(false);
                i12++;
                i4 = 2;
                c0472l = this;
                z3 = true;
            }
            i12++;
            i4 = 2;
            c0472l = this;
            z3 = true;
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object, m.k] */
    @Override // l.y
    public final Parcelable k() {
        ?? obj = new Object();
        obj.f7673a = this.f7697y;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.y
    public final boolean l(SubMenuC0422E subMenuC0422E) {
        boolean z3;
        if (subMenuC0422E.hasVisibleItems()) {
            SubMenuC0422E subMenuC0422E2 = subMenuC0422E;
            while (true) {
                l.m mVar = subMenuC0422E2.f7179z;
                if (mVar == this.f7678c) {
                    break;
                }
                subMenuC0422E2 = (SubMenuC0422E) mVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof l.z) && ((l.z) childAt).getItemData() == subMenuC0422E2.f7178A) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.f7697y = subMenuC0422E.f7178A.f7268a;
                int size = subMenuC0422E.f7246f.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        z3 = false;
                        break;
                    }
                    MenuItem item = subMenuC0422E.getItem(i4);
                    if (item.isVisible() && item.getIcon() != null) {
                        z3 = true;
                        break;
                    }
                    i4++;
                }
                C0462g c0462g = new C0462g(this, this.f7677b, subMenuC0422E, view);
                this.f7693u = c0462g;
                c0462g.f7309g = z3;
                l.u uVar = c0462g.i;
                if (uVar != null) {
                    uVar.q(z3);
                }
                C0462g c0462g2 = this.f7693u;
                if (!c0462g2.b()) {
                    if (c0462g2.f7307e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0462g2.d(0, 0, false, false);
                }
                l.x xVar = this.f7680e;
                if (xVar != null) {
                    xVar.f(subMenuC0422E);
                }
                return true;
            }
        }
        return false;
    }

    @Override // l.y
    public final boolean m(l.o oVar) {
        return false;
    }

    public final boolean n() {
        l.m mVar;
        if (!this.f7686m || f() || (mVar = this.f7678c) == null || this.h == null || this.f7694v != null) {
            return false;
        }
        mVar.i();
        if (mVar.f7248j.isEmpty()) {
            return false;
        }
        RunnableC0466i runnableC0466i = new RunnableC0466i(this, new C0462g(this, this.f7677b, this.f7678c, this.f7683j));
        this.f7694v = runnableC0466i;
        ((View) this.h).post(runnableC0466i);
        return true;
    }
}
