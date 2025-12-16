package k;

import O.h0;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0414k {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f7013c;

    /* renamed from: d, reason: collision with root package name */
    public m3.l f7014d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7015e;

    /* renamed from: b, reason: collision with root package name */
    public long f7012b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final C0413j f7016f = new C0413j(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7011a = new ArrayList();

    public final void a() {
        if (this.f7015e) {
            Iterator it = this.f7011a.iterator();
            while (it.hasNext()) {
                ((h0) it.next()).b();
            }
            this.f7015e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f7015e) {
            return;
        }
        Iterator it = this.f7011a.iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            long j4 = this.f7012b;
            if (j4 >= 0) {
                h0Var.c(j4);
            }
            BaseInterpolator baseInterpolator = this.f7013c;
            if (baseInterpolator != null && (view = (View) h0Var.f1255a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f7014d != null) {
                h0Var.d(this.f7016f);
            }
            View view2 = (View) h0Var.f1255a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f7015e = true;
    }
}
