package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.adif.elcanomovil.R;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7303a;

    /* renamed from: b, reason: collision with root package name */
    public final m f7304b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7305c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7306d;

    /* renamed from: e, reason: collision with root package name */
    public View f7307e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7309g;
    public x h;
    public u i;

    /* renamed from: j, reason: collision with root package name */
    public v f7310j;

    /* renamed from: f, reason: collision with root package name */
    public int f7308f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final v f7311k = new v(this);

    public w(int i, Context context, View view, m mVar, boolean z3) {
        this.f7303a = context;
        this.f7304b = mVar;
        this.f7307e = view;
        this.f7305c = z3;
        this.f7306d = i;
    }

    public final u a() {
        u viewOnKeyListenerC0421D;
        if (this.i == null) {
            Context context = this.f7303a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0421D = new ViewOnKeyListenerC0429g(context, this.f7307e, this.f7306d, this.f7305c);
            } else {
                View view = this.f7307e;
                Context context2 = this.f7303a;
                boolean z3 = this.f7305c;
                viewOnKeyListenerC0421D = new ViewOnKeyListenerC0421D(this.f7306d, context2, view, this.f7304b, z3);
            }
            viewOnKeyListenerC0421D.n(this.f7304b);
            viewOnKeyListenerC0421D.t(this.f7311k);
            viewOnKeyListenerC0421D.p(this.f7307e);
            viewOnKeyListenerC0421D.e(this.h);
            viewOnKeyListenerC0421D.q(this.f7309g);
            viewOnKeyListenerC0421D.r(this.f7308f);
            this.i = viewOnKeyListenerC0421D;
        }
        return this.i;
    }

    public final boolean b() {
        u uVar = this.i;
        return uVar != null && uVar.a();
    }

    public void c() {
        this.i = null;
        v vVar = this.f7310j;
        if (vVar != null) {
            vVar.onDismiss();
        }
    }

    public final void d(int i, int i4, boolean z3, boolean z4) {
        u a2 = a();
        a2.u(z4);
        if (z3) {
            if ((Gravity.getAbsoluteGravity(this.f7308f, this.f7307e.getLayoutDirection()) & 7) == 5) {
                i -= this.f7307e.getWidth();
            }
            a2.s(i);
            a2.v(i4);
            int i5 = (int) ((this.f7303a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f7301a = new Rect(i - i5, i4 - i5, i + i5, i4 + i5);
        }
        a2.c();
    }
}
