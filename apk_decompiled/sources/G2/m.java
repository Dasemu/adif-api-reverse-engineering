package G2;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.adif.elcanomovil.R;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes3.dex */
public final class m extends k {

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f623D = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* renamed from: B, reason: collision with root package name */
    public final AccessibilityManager f624B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f625C;

    public m(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f624B = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static m f(View view, String str, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f623D);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        m mVar = new m(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) mVar.i.getChildAt(0)).getMessageView().setText(str);
        mVar.f610k = i;
        return mVar;
    }

    public final void g() {
        A.j h = A.j.h();
        int i = this.f610k;
        boolean z3 = false;
        int i4 = -2;
        if (i != -2) {
            i4 = this.f624B.getRecommendedTimeoutMillis(i, (this.f625C ? 4 : 0) | 3);
        }
        g gVar = this.f619u;
        synchronized (h.f27a) {
            try {
                if (h.k(gVar)) {
                    o oVar = (o) h.f29c;
                    oVar.f628b = i4;
                    ((Handler) h.f28b).removeCallbacksAndMessages(oVar);
                    h.o((o) h.f29c);
                    return;
                }
                o oVar2 = (o) h.f30d;
                if (oVar2 != null && oVar2.f627a.get() == gVar) {
                    z3 = true;
                }
                if (z3) {
                    ((o) h.f30d).f628b = i4;
                } else {
                    h.f30d = new o(i4, gVar);
                }
                o oVar3 = (o) h.f29c;
                if (oVar3 == null || !h.a(oVar3, 4)) {
                    h.f29c = null;
                    h.p();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
