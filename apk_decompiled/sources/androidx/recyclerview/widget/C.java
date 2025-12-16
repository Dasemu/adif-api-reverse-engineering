package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class C extends AbstractC0232n0 implements u0 {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f3464C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f3465D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f3466A;

    /* renamed from: B, reason: collision with root package name */
    public final RunnableC0247y f3467B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3468a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3469b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f3470c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f3471d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3472e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3473f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f3474g;
    public final Drawable h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3475j;

    /* renamed from: k, reason: collision with root package name */
    public int f3476k;

    /* renamed from: l, reason: collision with root package name */
    public int f3477l;

    /* renamed from: m, reason: collision with root package name */
    public float f3478m;

    /* renamed from: n, reason: collision with root package name */
    public int f3479n;

    /* renamed from: o, reason: collision with root package name */
    public int f3480o;
    public float p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f3483s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f3490z;

    /* renamed from: q, reason: collision with root package name */
    public int f3481q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f3482r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3484t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3485u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f3486v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f3487w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f3488x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f3489y = new int[2];

    public C(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i4, int i5) {
        int i6 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f3490z = ofFloat;
        this.f3466A = 0;
        RunnableC0247y runnableC0247y = new RunnableC0247y(this, i6);
        this.f3467B = runnableC0247y;
        C0248z c0248z = new C0248z(this);
        this.f3470c = stateListDrawable;
        this.f3471d = drawable;
        this.f3474g = stateListDrawable2;
        this.h = drawable2;
        this.f3472e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3473f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3475j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3468a = i4;
        this.f3469b = i5;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        ofFloat.addListener(new A(this));
        ofFloat.addUpdateListener(new B(this, i6));
        RecyclerView recyclerView2 = this.f3483s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.e0(this);
            RecyclerView recyclerView3 = this.f3483s;
            recyclerView3.f3701q.remove(this);
            if (recyclerView3.f3703r == this) {
                recyclerView3.f3703r = null;
            }
            ArrayList arrayList = this.f3483s.f3689j0;
            if (arrayList != null) {
                arrayList.remove(c0248z);
            }
            this.f3483s.removeCallbacks(runnableC0247y);
        }
        this.f3483s = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(this);
            this.f3483s.j(this);
            this.f3483s.k(c0248z);
        }
    }

    public static int e(float f2, float f4, int[] iArr, int i, int i4, int i5) {
        int i6 = iArr[1] - iArr[0];
        if (i6 != 0) {
            int i7 = i - i5;
            int i8 = (int) (((f4 - f2) / i6) * i7);
            int i9 = i4 + i8;
            if (i9 < i7 && i9 >= 0) {
                return i8;
            }
        }
        return 0;
    }

    public final boolean c(float f2, float f4) {
        if (f4 < this.f3482r - this.i) {
            return false;
        }
        int i = this.f3480o;
        int i4 = this.f3479n;
        return f2 >= ((float) (i - (i4 / 2))) && f2 <= ((float) ((i4 / 2) + i));
    }

    public final boolean d(float f2, float f4) {
        RecyclerView recyclerView = this.f3483s;
        WeakHashMap weakHashMap = O.X.f1226a;
        boolean z3 = recyclerView.getLayoutDirection() == 1;
        int i = this.f3472e;
        if (!z3 ? f2 >= this.f3481q - i : f2 <= i) {
            int i4 = this.f3477l;
            int i5 = this.f3476k / 2;
            if (f4 >= i4 - i5 && f4 <= i5 + i4) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        RunnableC0247y runnableC0247y = this.f3467B;
        StateListDrawable stateListDrawable = this.f3470c;
        if (i == 2 && this.f3486v != 2) {
            stateListDrawable.setState(f3464C);
            this.f3483s.removeCallbacks(runnableC0247y);
        }
        if (i == 0) {
            this.f3483s.invalidate();
        } else {
            g();
        }
        if (this.f3486v == 2 && i != 2) {
            stateListDrawable.setState(f3465D);
            this.f3483s.removeCallbacks(runnableC0247y);
            this.f3483s.postDelayed(runnableC0247y, 1200);
        } else if (i == 1) {
            this.f3483s.removeCallbacks(runnableC0247y);
            this.f3483s.postDelayed(runnableC0247y, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f3486v = i;
    }

    public final void g() {
        int i = this.f3466A;
        ValueAnimator valueAnimator = this.f3490z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f3466A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.AbstractC0232n0
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, E0 e02) {
        int i = this.f3481q;
        RecyclerView recyclerView2 = this.f3483s;
        if (i != recyclerView2.getWidth() || this.f3482r != recyclerView2.getHeight()) {
            this.f3481q = recyclerView2.getWidth();
            this.f3482r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f3466A != 0) {
            if (this.f3484t) {
                int i4 = this.f3481q;
                int i5 = this.f3472e;
                int i6 = i4 - i5;
                int i7 = this.f3477l;
                int i8 = this.f3476k;
                int i9 = i7 - (i8 / 2);
                StateListDrawable stateListDrawable = this.f3470c;
                stateListDrawable.setBounds(0, 0, i5, i8);
                int i10 = this.f3482r;
                int i11 = this.f3473f;
                Drawable drawable = this.f3471d;
                drawable.setBounds(0, 0, i11, i10);
                WeakHashMap weakHashMap = O.X.f1226a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i5, i9);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i5, -i9);
                } else {
                    canvas.translate(i6, BitmapDescriptorFactory.HUE_RED);
                    drawable.draw(canvas);
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, i9);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i6, -i9);
                }
            }
            if (this.f3485u) {
                int i12 = this.f3482r;
                int i13 = this.i;
                int i14 = i12 - i13;
                int i15 = this.f3480o;
                int i16 = this.f3479n;
                int i17 = i15 - (i16 / 2);
                StateListDrawable stateListDrawable2 = this.f3474g;
                stateListDrawable2.setBounds(0, 0, i16, i13);
                int i18 = this.f3481q;
                int i19 = this.f3475j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i18, i19);
                canvas.translate(BitmapDescriptorFactory.HUE_RED, i14);
                drawable2.draw(canvas);
                canvas.translate(i17, BitmapDescriptorFactory.HUE_RED);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i17, -i14);
            }
        }
    }

    @Override // androidx.recyclerview.widget.u0
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f3486v;
        if (i != 1) {
            return i == 2;
        }
        boolean d4 = d(motionEvent.getX(), motionEvent.getY());
        boolean c4 = c(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!d4 && !c4) {
            return false;
        }
        if (c4) {
            this.f3487w = 1;
            this.p = (int) motionEvent.getX();
        } else if (d4) {
            this.f3487w = 2;
            this.f3478m = (int) motionEvent.getY();
        }
        f(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.u0
    public final void onRequestDisallowInterceptTouchEvent(boolean z3) {
    }

    @Override // androidx.recyclerview.widget.u0
    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3486v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean d4 = d(motionEvent.getX(), motionEvent.getY());
            boolean c4 = c(motionEvent.getX(), motionEvent.getY());
            if (d4 || c4) {
                if (c4) {
                    this.f3487w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (d4) {
                    this.f3487w = 2;
                    this.f3478m = (int) motionEvent.getY();
                }
                f(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f3486v == 2) {
            this.f3478m = BitmapDescriptorFactory.HUE_RED;
            this.p = BitmapDescriptorFactory.HUE_RED;
            f(1);
            this.f3487w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f3486v == 2) {
            g();
            int i = this.f3487w;
            int i4 = this.f3469b;
            if (i == 1) {
                float x3 = motionEvent.getX();
                int[] iArr = this.f3489y;
                iArr[0] = i4;
                int i5 = this.f3481q - i4;
                iArr[1] = i5;
                float max = Math.max(i4, Math.min(i5, x3));
                if (Math.abs(this.f3480o - max) >= 2.0f) {
                    int e4 = e(this.p, max, iArr, this.f3483s.computeHorizontalScrollRange(), this.f3483s.computeHorizontalScrollOffset(), this.f3481q);
                    if (e4 != 0) {
                        this.f3483s.scrollBy(e4, 0);
                    }
                    this.p = max;
                }
            }
            if (this.f3487w == 2) {
                float y3 = motionEvent.getY();
                int[] iArr2 = this.f3488x;
                iArr2[0] = i4;
                int i6 = this.f3482r - i4;
                iArr2[1] = i6;
                float max2 = Math.max(i4, Math.min(i6, y3));
                if (Math.abs(this.f3477l - max2) < 2.0f) {
                    return;
                }
                int e5 = e(this.f3478m, max2, iArr2, this.f3483s.computeVerticalScrollRange(), this.f3483s.computeVerticalScrollOffset(), this.f3482r);
                if (e5 != 0) {
                    this.f3483s.scrollBy(0, e5);
                }
                this.f3478m = max2;
            }
        }
    }
}
