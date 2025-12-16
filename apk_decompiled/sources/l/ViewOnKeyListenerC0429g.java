package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.adif.elcanomovil.R;
import java.util.ArrayList;
import java.util.Iterator;
import m.AbstractC0500z0;
import m.C0;
import m.C0475m0;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0429g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f7204b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7205c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7206d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7207e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f7208f;

    /* renamed from: n, reason: collision with root package name */
    public View f7214n;

    /* renamed from: o, reason: collision with root package name */
    public View f7215o;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7216q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7217r;

    /* renamed from: s, reason: collision with root package name */
    public int f7218s;

    /* renamed from: t, reason: collision with root package name */
    public int f7219t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7221v;

    /* renamed from: w, reason: collision with root package name */
    public x f7222w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f7223x;

    /* renamed from: y, reason: collision with root package name */
    public v f7224y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7225z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f7209g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0426d i = new ViewTreeObserverOnGlobalLayoutListenerC0426d(this, 0);

    /* renamed from: j, reason: collision with root package name */
    public final I2.o f7210j = new I2.o(this, 1);

    /* renamed from: k, reason: collision with root package name */
    public final h3.d f7211k = new h3.d(this, 2);

    /* renamed from: l, reason: collision with root package name */
    public int f7212l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f7213m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7220u = false;

    public ViewOnKeyListenerC0429g(Context context, View view, int i, boolean z3) {
        this.f7204b = context;
        this.f7214n = view;
        this.f7206d = i;
        this.f7207e = z3;
        this.p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f7205c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f7208f = new Handler();
    }

    @Override // l.InterfaceC0420C
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0428f) arrayList.get(0)).f7201a.f7782z.isShowing();
    }

    @Override // l.y
    public final void b(m mVar, boolean z3) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((C0428f) arrayList.get(i)).f7202b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i4 = i + 1;
        if (i4 < arrayList.size()) {
            ((C0428f) arrayList.get(i4)).f7202b.c(false);
        }
        C0428f c0428f = (C0428f) arrayList.remove(i);
        c0428f.f7202b.r(this);
        boolean z4 = this.f7225z;
        C0 c02 = c0428f.f7201a;
        if (z4) {
            AbstractC0500z0.b(c02.f7782z, null);
            c02.f7782z.setAnimationStyle(0);
        }
        c02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.p = ((C0428f) arrayList.get(size2 - 1)).f7203c;
        } else {
            this.p = this.f7214n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z3) {
                ((C0428f) arrayList.get(0)).f7202b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.f7222w;
        if (xVar != null) {
            xVar.b(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f7223x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f7223x.removeGlobalOnLayoutListener(this.i);
            }
            this.f7223x = null;
        }
        this.f7215o.removeOnAttachStateChangeListener(this.f7210j);
        this.f7224y.onDismiss();
    }

    @Override // l.InterfaceC0420C
    public final void c() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f7209g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x((m) it.next());
        }
        arrayList.clear();
        View view = this.f7214n;
        this.f7215o = view;
        if (view != null) {
            boolean z3 = this.f7223x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f7223x = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f7215o.addOnAttachStateChangeListener(this.f7210j);
        }
    }

    @Override // l.y
    public final void d(Parcelable parcelable) {
    }

    @Override // l.InterfaceC0420C
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C0428f[] c0428fArr = (C0428f[]) arrayList.toArray(new C0428f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0428f c0428f = c0428fArr[i];
                if (c0428f.f7201a.f7782z.isShowing()) {
                    c0428f.f7201a.dismiss();
                }
            }
        }
    }

    @Override // l.y
    public final void e(x xVar) {
        this.f7222w = xVar;
    }

    @Override // l.InterfaceC0420C
    public final C0475m0 f() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0428f) arrayList.get(arrayList.size() - 1)).f7201a.f7762c;
    }

    @Override // l.y
    public final void h(boolean z3) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0428f) it.next()).f7201a.f7762c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0432j) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.y
    public final boolean j() {
        return false;
    }

    @Override // l.y
    public final Parcelable k() {
        return null;
    }

    @Override // l.y
    public final boolean l(SubMenuC0422E subMenuC0422E) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0428f c0428f = (C0428f) it.next();
            if (subMenuC0422E == c0428f.f7202b) {
                c0428f.f7201a.f7762c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0422E.hasVisibleItems()) {
            return false;
        }
        n(subMenuC0422E);
        x xVar = this.f7222w;
        if (xVar != null) {
            xVar.f(subMenuC0422E);
        }
        return true;
    }

    @Override // l.u
    public final void n(m mVar) {
        mVar.b(this, this.f7204b);
        if (a()) {
            x(mVar);
        } else {
            this.f7209g.add(mVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0428f c0428f;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0428f = null;
                break;
            }
            c0428f = (C0428f) arrayList.get(i);
            if (!c0428f.f7201a.f7782z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0428f != null) {
            c0428f.f7202b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.u
    public final void p(View view) {
        if (this.f7214n != view) {
            this.f7214n = view;
            this.f7213m = Gravity.getAbsoluteGravity(this.f7212l, view.getLayoutDirection());
        }
    }

    @Override // l.u
    public final void q(boolean z3) {
        this.f7220u = z3;
    }

    @Override // l.u
    public final void r(int i) {
        if (this.f7212l != i) {
            this.f7212l = i;
            this.f7213m = Gravity.getAbsoluteGravity(i, this.f7214n.getLayoutDirection());
        }
    }

    @Override // l.u
    public final void s(int i) {
        this.f7216q = true;
        this.f7218s = i;
    }

    @Override // l.u
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f7224y = (v) onDismissListener;
    }

    @Override // l.u
    public final void u(boolean z3) {
        this.f7221v = z3;
    }

    @Override // l.u
    public final void v(int i) {
        this.f7217r = true;
        this.f7219t = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x012a, code lost:
    
        if (((r8.getWidth() + r9[0]) + r5) > r11.right) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x012c, code lost:
    
        r13 = 0;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012f, code lost:
    
        r8 = 1;
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0135, code lost:
    
        if ((r9[0] - r5) < 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Type inference failed for: r7v0, types: [m.x0, m.C0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(l.m r18) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnKeyListenerC0429g.x(l.m):void");
    }
}
