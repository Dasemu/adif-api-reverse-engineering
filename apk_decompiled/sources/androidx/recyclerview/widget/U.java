package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3754a;

    /* renamed from: b, reason: collision with root package name */
    public int f3755b;

    /* renamed from: c, reason: collision with root package name */
    public int f3756c;

    /* renamed from: d, reason: collision with root package name */
    public int f3757d;

    /* renamed from: e, reason: collision with root package name */
    public int f3758e;

    /* renamed from: f, reason: collision with root package name */
    public int f3759f;

    /* renamed from: g, reason: collision with root package name */
    public int f3760g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3761j;

    /* renamed from: k, reason: collision with root package name */
    public List f3762k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3763l;

    public final void a(View view) {
        int layoutPosition;
        int size = this.f3762k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            View view3 = ((I0) this.f3762k.get(i4)).itemView;
            C0239r0 c0239r0 = (C0239r0) view3.getLayoutParams();
            if (view3 != view && !c0239r0.f3897a.isRemoved() && (layoutPosition = (c0239r0.f3897a.getLayoutPosition() - this.f3757d) * this.f3758e) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f3757d = -1;
        } else {
            this.f3757d = ((C0239r0) view2.getLayoutParams()).f3897a.getLayoutPosition();
        }
    }

    public final View b(y0 y0Var) {
        List list = this.f3762k;
        if (list == null) {
            View view = y0Var.k(this.f3757d, LongCompanionObject.MAX_VALUE).itemView;
            this.f3757d += this.f3758e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((I0) this.f3762k.get(i)).itemView;
            C0239r0 c0239r0 = (C0239r0) view2.getLayoutParams();
            if (!c0239r0.f3897a.isRemoved() && this.f3757d == c0239r0.f3897a.getLayoutPosition()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
