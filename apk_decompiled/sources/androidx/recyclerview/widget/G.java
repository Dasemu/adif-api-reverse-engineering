package androidx.recyclerview.widget;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class G implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f3523a;

    public G(N n4) {
        this.f3523a = n4;
    }

    @Override // androidx.recyclerview.widget.u0
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        N n4 = this.f3523a;
        ((GestureDetector) n4.f3607x.f7b).onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        H h = null;
        if (actionMasked == 0) {
            n4.f3596l = motionEvent.getPointerId(0);
            n4.f3590d = motionEvent.getX();
            n4.f3591e = motionEvent.getY();
            VelocityTracker velocityTracker = n4.f3603t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            n4.f3603t = VelocityTracker.obtain();
            if (n4.f3589c == null) {
                ArrayList arrayList = n4.p;
                if (!arrayList.isEmpty()) {
                    View g4 = n4.g(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        H h4 = (H) arrayList.get(size);
                        if (h4.f3535e.itemView == g4) {
                            h = h4;
                            break;
                        }
                        size--;
                    }
                }
                if (h != null) {
                    n4.f3590d -= h.i;
                    n4.f3591e -= h.f3538j;
                    I0 i02 = h.f3535e;
                    n4.f(i02, true);
                    if (n4.f3587a.remove(i02.itemView)) {
                        n4.f3597m.clearView(n4.f3601r, i02);
                    }
                    n4.l(i02, h.f3536f);
                    n4.m(n4.f3599o, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            n4.f3596l = -1;
            n4.l(null, 0);
        } else {
            int i = n4.f3596l;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                n4.d(actionMasked, findPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = n4.f3603t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return n4.f3589c != null;
    }

    @Override // androidx.recyclerview.widget.u0
    public final void onRequestDisallowInterceptTouchEvent(boolean z3) {
        if (z3) {
            this.f3523a.l(null, 0);
        }
    }

    @Override // androidx.recyclerview.widget.u0
    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        N n4 = this.f3523a;
        ((GestureDetector) n4.f3607x.f7b).onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = n4.f3603t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (n4.f3596l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(n4.f3596l);
        if (findPointerIndex >= 0) {
            n4.d(actionMasked, findPointerIndex, motionEvent);
        }
        I0 i02 = n4.f3589c;
        if (i02 == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex >= 0) {
                    n4.m(n4.f3599o, findPointerIndex, motionEvent);
                    n4.j(i02);
                    RecyclerView recyclerView2 = n4.f3601r;
                    RunnableC0247y runnableC0247y = n4.f3602s;
                    recyclerView2.removeCallbacks(runnableC0247y);
                    runnableC0247y.run();
                    n4.f3601r.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == n4.f3596l) {
                    n4.f3596l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    n4.m(n4.f3599o, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = n4.f3603t;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        n4.l(null, 0);
        n4.f3596l = -1;
    }
}
