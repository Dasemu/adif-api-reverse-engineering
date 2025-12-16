package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public final class y0 extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f3275b;

    public /* synthetic */ y0(int i, Rect rect) {
        this.f3274a = i;
        this.f3275b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f3274a) {
            case 0:
                return this.f3275b;
            default:
                Rect rect = this.f3275b;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
