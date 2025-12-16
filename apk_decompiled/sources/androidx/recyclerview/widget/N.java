package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeFragment$prepareRecycler$swipeHandler$1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class N extends AbstractC0232n0 implements InterfaceC0241s0 {

    /* renamed from: A, reason: collision with root package name */
    public Rect f3585A;

    /* renamed from: B, reason: collision with root package name */
    public long f3586B;

    /* renamed from: d, reason: collision with root package name */
    public float f3590d;

    /* renamed from: e, reason: collision with root package name */
    public float f3591e;

    /* renamed from: f, reason: collision with root package name */
    public float f3592f;

    /* renamed from: g, reason: collision with root package name */
    public float f3593g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3594j;

    /* renamed from: k, reason: collision with root package name */
    public float f3595k;

    /* renamed from: m, reason: collision with root package name */
    public final SubscriptionHomeFragment$prepareRecycler$swipeHandler$1 f3597m;

    /* renamed from: o, reason: collision with root package name */
    public int f3599o;

    /* renamed from: q, reason: collision with root package name */
    public int f3600q;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f3601r;

    /* renamed from: t, reason: collision with root package name */
    public VelocityTracker f3603t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f3604u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f3605v;

    /* renamed from: x, reason: collision with root package name */
    public A.a f3607x;

    /* renamed from: y, reason: collision with root package name */
    public L f3608y;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3587a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final float[] f3588b = new float[2];

    /* renamed from: c, reason: collision with root package name */
    public I0 f3589c = null;

    /* renamed from: l, reason: collision with root package name */
    public int f3596l = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f3598n = 0;
    public final ArrayList p = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final RunnableC0247y f3602s = new RunnableC0247y(this, 1);

    /* renamed from: w, reason: collision with root package name */
    public View f3606w = null;

    /* renamed from: z, reason: collision with root package name */
    public final G f3609z = new G(this);

    public N(SubscriptionHomeFragment$prepareRecycler$swipeHandler$1 subscriptionHomeFragment$prepareRecycler$swipeHandler$1) {
        this.f3597m = subscriptionHomeFragment$prepareRecycler$swipeHandler$1;
    }

    public static boolean i(View view, float f2, float f4, float f5, float f6) {
        return f2 >= f5 && f2 <= f5 + ((float) view.getWidth()) && f4 >= f6 && f4 <= f6 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.InterfaceC0241s0
    public final void a(View view) {
    }

    @Override // androidx.recyclerview.widget.InterfaceC0241s0
    public final void b(View view) {
        k(view);
        I0 M3 = this.f3601r.M(view);
        if (M3 == null) {
            return;
        }
        I0 i02 = this.f3589c;
        if (i02 != null && M3 == i02) {
            l(null, 0);
            return;
        }
        f(M3, false);
        if (this.f3587a.remove(M3.itemView)) {
            this.f3597m.clearView(this.f3601r, M3);
        }
    }

    public final int c(I0 i02, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i4 = this.h > BitmapDescriptorFactory.HUE_RED ? 8 : 4;
        VelocityTracker velocityTracker = this.f3603t;
        SubscriptionHomeFragment$prepareRecycler$swipeHandler$1 subscriptionHomeFragment$prepareRecycler$swipeHandler$1 = this.f3597m;
        if (velocityTracker != null && this.f3596l > -1) {
            velocityTracker.computeCurrentVelocity(1000, subscriptionHomeFragment$prepareRecycler$swipeHandler$1.getSwipeVelocityThreshold(this.f3593g));
            float xVelocity = this.f3603t.getXVelocity(this.f3596l);
            float yVelocity = this.f3603t.getYVelocity(this.f3596l);
            int i5 = xVelocity > BitmapDescriptorFactory.HUE_RED ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i5 & i) != 0 && i4 == i5 && abs >= subscriptionHomeFragment$prepareRecycler$swipeHandler$1.getSwipeEscapeVelocity(this.f3592f) && abs > Math.abs(yVelocity)) {
                return i5;
            }
        }
        float swipeThreshold = subscriptionHomeFragment$prepareRecycler$swipeHandler$1.getSwipeThreshold(i02) * this.f3601r.getWidth();
        if ((i & i4) == 0 || Math.abs(this.h) <= swipeThreshold) {
            return 0;
        }
        return i4;
    }

    public final void d(int i, int i4, MotionEvent motionEvent) {
        int absoluteMovementFlags;
        View g4;
        if (this.f3589c == null && i == 2 && this.f3598n != 2) {
            SubscriptionHomeFragment$prepareRecycler$swipeHandler$1 subscriptionHomeFragment$prepareRecycler$swipeHandler$1 = this.f3597m;
            if (subscriptionHomeFragment$prepareRecycler$swipeHandler$1.isItemViewSwipeEnabled() && this.f3601r.getScrollState() != 1) {
                AbstractC0238q0 layoutManager = this.f3601r.getLayoutManager();
                int i5 = this.f3596l;
                I0 i02 = null;
                if (i5 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i5);
                    float x3 = motionEvent.getX(findPointerIndex) - this.f3590d;
                    float y3 = motionEvent.getY(findPointerIndex) - this.f3591e;
                    float abs = Math.abs(x3);
                    float abs2 = Math.abs(y3);
                    float f2 = this.f3600q;
                    if ((abs >= f2 || abs2 >= f2) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (g4 = g(motionEvent)) != null))) {
                        i02 = this.f3601r.M(g4);
                    }
                }
                if (i02 == null || (absoluteMovementFlags = (subscriptionHomeFragment$prepareRecycler$swipeHandler$1.getAbsoluteMovementFlags(this.f3601r, i02) & 65280) >> 8) == 0) {
                    return;
                }
                float x4 = motionEvent.getX(i4);
                float y4 = motionEvent.getY(i4);
                float f4 = x4 - this.f3590d;
                float f5 = y4 - this.f3591e;
                float abs3 = Math.abs(f4);
                float abs4 = Math.abs(f5);
                float f6 = this.f3600q;
                if (abs3 >= f6 || abs4 >= f6) {
                    if (abs3 > abs4) {
                        if (f4 < BitmapDescriptorFactory.HUE_RED && (absoluteMovementFlags & 4) == 0) {
                            return;
                        }
                        if (f4 > BitmapDescriptorFactory.HUE_RED && (absoluteMovementFlags & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f5 < BitmapDescriptorFactory.HUE_RED && (absoluteMovementFlags & 1) == 0) {
                            return;
                        }
                        if (f5 > BitmapDescriptorFactory.HUE_RED && (absoluteMovementFlags & 2) == 0) {
                            return;
                        }
                    }
                    this.i = BitmapDescriptorFactory.HUE_RED;
                    this.h = BitmapDescriptorFactory.HUE_RED;
                    this.f3596l = motionEvent.getPointerId(0);
                    l(i02, 1);
                }
            }
        }
    }

    public final int e(I0 i02, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i4 = this.i > BitmapDescriptorFactory.HUE_RED ? 2 : 1;
        VelocityTracker velocityTracker = this.f3603t;
        SubscriptionHomeFragment$prepareRecycler$swipeHandler$1 subscriptionHomeFragment$prepareRecycler$swipeHandler$1 = this.f3597m;
        if (velocityTracker != null && this.f3596l > -1) {
            velocityTracker.computeCurrentVelocity(1000, subscriptionHomeFragment$prepareRecycler$swipeHandler$1.getSwipeVelocityThreshold(this.f3593g));
            float xVelocity = this.f3603t.getXVelocity(this.f3596l);
            float yVelocity = this.f3603t.getYVelocity(this.f3596l);
            int i5 = yVelocity > BitmapDescriptorFactory.HUE_RED ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i5 & i) != 0 && i5 == i4 && abs >= subscriptionHomeFragment$prepareRecycler$swipeHandler$1.getSwipeEscapeVelocity(this.f3592f) && abs > Math.abs(xVelocity)) {
                return i5;
            }
        }
        float swipeThreshold = subscriptionHomeFragment$prepareRecycler$swipeHandler$1.getSwipeThreshold(i02) * this.f3601r.getHeight();
        if ((i & i4) == 0 || Math.abs(this.i) <= swipeThreshold) {
            return 0;
        }
        return i4;
    }

    public final void f(I0 i02, boolean z3) {
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            H h = (H) arrayList.get(size);
            if (h.f3535e == i02) {
                h.f3539k |= z3;
                if (!h.f3540l) {
                    h.f3537g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View g(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        I0 i02 = this.f3589c;
        if (i02 != null) {
            View view = i02.itemView;
            if (i(view, x3, y3, this.f3594j + this.h, this.f3595k + this.i)) {
                return view;
            }
        }
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            H h = (H) arrayList.get(size);
            View view2 = h.f3535e.itemView;
            if (i(view2, x3, y3, h.i, h.f3538j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.f3601r;
        for (int e4 = recyclerView.f3682f.e() - 1; e4 >= 0; e4--) {
            View d4 = recyclerView.f3682f.d(e4);
            float translationX = d4.getTranslationX();
            float translationY = d4.getTranslationY();
            if (x3 >= d4.getLeft() + translationX && x3 <= d4.getRight() + translationX && y3 >= d4.getTop() + translationY && y3 <= d4.getBottom() + translationY) {
                return d4;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0232n0
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, E0 e02) {
        rect.setEmpty();
    }

    public final void h(float[] fArr) {
        if ((this.f3599o & 12) != 0) {
            fArr[0] = (this.f3594j + this.h) - this.f3589c.itemView.getLeft();
        } else {
            fArr[0] = this.f3589c.itemView.getTranslationX();
        }
        if ((this.f3599o & 3) != 0) {
            fArr[1] = (this.f3595k + this.i) - this.f3589c.itemView.getTop();
        } else {
            fArr[1] = this.f3589c.itemView.getTranslationY();
        }
    }

    public final void j(I0 i02) {
        int i;
        int i4;
        int i5;
        if (this.f3601r.isLayoutRequested()) {
            return;
        }
        char c4 = 2;
        if (this.f3598n != 2) {
            return;
        }
        SubscriptionHomeFragment$prepareRecycler$swipeHandler$1 subscriptionHomeFragment$prepareRecycler$swipeHandler$1 = this.f3597m;
        float moveThreshold = subscriptionHomeFragment$prepareRecycler$swipeHandler$1.getMoveThreshold(i02);
        int i6 = (int) (this.f3594j + this.h);
        int i7 = (int) (this.f3595k + this.i);
        if (Math.abs(i7 - i02.itemView.getTop()) >= i02.itemView.getHeight() * moveThreshold || Math.abs(i6 - i02.itemView.getLeft()) >= i02.itemView.getWidth() * moveThreshold) {
            ArrayList arrayList = this.f3604u;
            if (arrayList == null) {
                this.f3604u = new ArrayList();
                this.f3605v = new ArrayList();
            } else {
                arrayList.clear();
                this.f3605v.clear();
            }
            int boundingBoxMargin = subscriptionHomeFragment$prepareRecycler$swipeHandler$1.getBoundingBoxMargin();
            int round = Math.round(this.f3594j + this.h) - boundingBoxMargin;
            int round2 = Math.round(this.f3595k + this.i) - boundingBoxMargin;
            int i8 = boundingBoxMargin * 2;
            int width = i02.itemView.getWidth() + round + i8;
            int height = i02.itemView.getHeight() + round2 + i8;
            int i9 = (round + width) / 2;
            int i10 = (round2 + height) / 2;
            AbstractC0238q0 layoutManager = this.f3601r.getLayoutManager();
            int v3 = layoutManager.v();
            int i11 = 0;
            while (i11 < v3) {
                char c5 = c4;
                View u3 = layoutManager.u(i11);
                if (u3 != i02.itemView && u3.getBottom() >= round2 && u3.getTop() <= height && u3.getRight() >= round && u3.getLeft() <= width) {
                    I0 M3 = this.f3601r.M(u3);
                    i = i9;
                    if (subscriptionHomeFragment$prepareRecycler$swipeHandler$1.canDropOver(this.f3601r, this.f3589c, M3)) {
                        int abs = Math.abs(i - ((u3.getRight() + u3.getLeft()) / 2));
                        int abs2 = Math.abs(i10 - ((u3.getBottom() + u3.getTop()) / 2));
                        int i12 = (abs2 * abs2) + (abs * abs);
                        int size = this.f3604u.size();
                        i4 = round;
                        i5 = round2;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < size) {
                            int i15 = size;
                            if (i12 <= ((Integer) this.f3605v.get(i13)).intValue()) {
                                break;
                            }
                            i14++;
                            i13++;
                            size = i15;
                        }
                        this.f3604u.add(i14, M3);
                        this.f3605v.add(i14, Integer.valueOf(i12));
                        i11++;
                        c4 = c5;
                        round = i4;
                        i9 = i;
                        round2 = i5;
                    }
                } else {
                    i = i9;
                }
                i4 = round;
                i5 = round2;
                i11++;
                c4 = c5;
                round = i4;
                i9 = i;
                round2 = i5;
            }
            ArrayList arrayList2 = this.f3604u;
            if (arrayList2.size() == 0) {
                return;
            }
            I0 chooseDropTarget = subscriptionHomeFragment$prepareRecycler$swipeHandler$1.chooseDropTarget(i02, arrayList2, i6, i7);
            if (chooseDropTarget == null) {
                this.f3604u.clear();
                this.f3605v.clear();
                return;
            }
            int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
            int absoluteAdapterPosition2 = i02.getAbsoluteAdapterPosition();
            if (subscriptionHomeFragment$prepareRecycler$swipeHandler$1.onMove(this.f3601r, i02, chooseDropTarget)) {
                this.f3597m.onMoved(this.f3601r, i02, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i6, i7);
            }
        }
    }

    public final void k(View view) {
        if (view == this.f3606w) {
            this.f3606w = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0092, code lost:
    
        if (r8 > 0) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(androidx.recyclerview.widget.I0 r22, int r23) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.N.l(androidx.recyclerview.widget.I0, int):void");
    }

    public final void m(int i, int i4, MotionEvent motionEvent) {
        float x3 = motionEvent.getX(i4);
        float y3 = motionEvent.getY(i4);
        float f2 = x3 - this.f3590d;
        this.h = f2;
        this.i = y3 - this.f3591e;
        if ((i & 4) == 0) {
            this.h = Math.max(BitmapDescriptorFactory.HUE_RED, f2);
        }
        if ((i & 8) == 0) {
            this.h = Math.min(BitmapDescriptorFactory.HUE_RED, this.h);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(BitmapDescriptorFactory.HUE_RED, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(BitmapDescriptorFactory.HUE_RED, this.i);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0232n0
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, E0 e02) {
        float f2;
        float f4;
        if (this.f3589c != null) {
            float[] fArr = this.f3588b;
            h(fArr);
            float f5 = fArr[0];
            f4 = fArr[1];
            f2 = f5;
        } else {
            f2 = 0.0f;
            f4 = 0.0f;
        }
        this.f3597m.onDraw(canvas, recyclerView, this.f3589c, this.p, this.f3598n, f2, f4);
    }

    @Override // androidx.recyclerview.widget.AbstractC0232n0
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, E0 e02) {
        float f2;
        float f4;
        if (this.f3589c != null) {
            float[] fArr = this.f3588b;
            h(fArr);
            float f5 = fArr[0];
            f4 = fArr[1];
            f2 = f5;
        } else {
            f2 = 0.0f;
            f4 = 0.0f;
        }
        this.f3597m.onDrawOver(canvas, recyclerView, this.f3589c, this.p, this.f3598n, f2, f4);
    }
}
