package c0;

import B0.D;
import B0.u;
import R0.h;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279e {

    /* renamed from: d, reason: collision with root package name */
    public final A.a f4212d;

    /* renamed from: a, reason: collision with root package name */
    public float f4209a = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: b, reason: collision with root package name */
    public float f4210b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4211c = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4213e = false;

    /* renamed from: f, reason: collision with root package name */
    public float f4214f = Float.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f4215g = -3.4028235E38f;
    public long h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4216j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4217k = new ArrayList();
    public float i = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public C0280f f4218l = null;

    /* renamed from: m, reason: collision with root package name */
    public float f4219m = Float.MAX_VALUE;

    public C0279e(C0278d c0278d) {
        this.f4212d = new A.a(c0278d, 23);
    }

    public final void a(float f2) {
        if (this.f4213e) {
            this.f4219m = f2;
            return;
        }
        if (this.f4218l == null) {
            this.f4218l = new C0280f(f2);
        }
        C0280f c0280f = this.f4218l;
        double d4 = f2;
        c0280f.i = d4;
        double d5 = (float) d4;
        if (d5 > this.f4214f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d5 < this.f4215g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.i * 0.75f);
        c0280f.f4223d = abs;
        c0280f.f4224e = abs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z3 = this.f4213e;
        if (z3 || z3) {
            return;
        }
        this.f4213e = true;
        if (!this.f4211c) {
            this.f4210b = ((C0278d) this.f4212d.f7b).f4208a;
        }
        float f4 = this.f4210b;
        if (f4 > this.f4214f || f4 < this.f4215g) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = C0276b.f4200f;
        if (threadLocal.get() == null) {
            threadLocal.set(new C0276b());
        }
        C0276b c0276b = (C0276b) threadLocal.get();
        ArrayList arrayList = c0276b.f4202b;
        if (arrayList.size() == 0) {
            if (c0276b.f4204d == null) {
                c0276b.f4204d = new h(c0276b.f4203c);
            }
            h hVar = c0276b.f4204d;
            ((Choreographer) hVar.f1414b).postFrameCallback((ChoreographerFrameCallbackC0275a) hVar.f1415c);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void b(float f2) {
        ArrayList arrayList;
        ((C0278d) this.f4212d.f7b).f4208a = f2;
        int i = 0;
        while (true) {
            arrayList = this.f4217k;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                u uVar = (u) arrayList.get(i);
                float f4 = this.f4210b;
                D d4 = uVar.f172g;
                long max = Math.max(-1L, Math.min(d4.f203x + 1, Math.round(f4)));
                d4.E(max, uVar.f166a);
                uVar.f166a = max;
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
