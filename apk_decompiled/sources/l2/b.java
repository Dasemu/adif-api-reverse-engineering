package l2;

import G2.f;
import O.X;
import X.d;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final View f7363a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f7365c;

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z3) {
        this.f7365c = swipeDismissBehavior;
        this.f7363a = view;
        this.f7364b = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar;
        SwipeDismissBehavior swipeDismissBehavior = this.f7365c;
        d dVar = swipeDismissBehavior.f5530a;
        View view = this.f7363a;
        if (dVar != null && dVar.f()) {
            WeakHashMap weakHashMap = X.f1226a;
            view.postOnAnimation(this);
        } else {
            if (!this.f7364b || (fVar = swipeDismissBehavior.f5531b) == null) {
                return;
            }
            fVar.a(view);
        }
    }
}
