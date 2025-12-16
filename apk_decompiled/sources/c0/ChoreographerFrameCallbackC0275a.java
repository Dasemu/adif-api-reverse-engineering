package c0;

import B0.t;
import B0.u;
import B0.w;
import B0.x;
import R0.h;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.fragment.app.RunnableC0141d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import s.j;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0275a implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f4199a;

    public ChoreographerFrameCallbackC0275a(h hVar) {
        this.f4199a = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [B0.x, B0.D] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        ArrayList arrayList;
        boolean z3;
        ArrayList arrayList2;
        long j5;
        long j6;
        int i;
        A.a aVar = (A.a) this.f4199a.f1413a;
        aVar.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        C0276b c0276b = (C0276b) aVar.f7b;
        c0276b.getClass();
        long uptimeMillis2 = SystemClock.uptimeMillis();
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            arrayList = c0276b.f4202b;
            int i5 = 1;
            if (i4 >= arrayList.size()) {
                break;
            }
            C0279e c0279e = (C0279e) arrayList.get(i4);
            if (c0279e != null) {
                j jVar = c0276b.f4201a;
                Long l4 = (Long) jVar.get(c0279e);
                if (l4 != null) {
                    if (l4.longValue() < uptimeMillis2) {
                        jVar.remove(c0279e);
                    }
                }
                long j7 = c0279e.h;
                if (j7 == 0) {
                    c0279e.h = uptimeMillis;
                    c0279e.b(c0279e.f4210b);
                } else {
                    long j8 = uptimeMillis - j7;
                    c0279e.h = uptimeMillis;
                    if (c0279e.f4219m != Float.MAX_VALUE) {
                        C0280f c0280f = c0279e.f4218l;
                        double d4 = c0280f.i;
                        long j9 = j8 / 2;
                        C0277c a2 = c0280f.a(c0279e.f4210b, c0279e.f4209a, j9);
                        C0280f c0280f2 = c0279e.f4218l;
                        c0280f2.i = c0279e.f4219m;
                        c0279e.f4219m = Float.MAX_VALUE;
                        C0277c a4 = c0280f2.a(a2.f4206a, a2.f4207b, j9);
                        c0279e.f4210b = a4.f4206a;
                        c0279e.f4209a = a4.f4207b;
                    } else {
                        C0277c a5 = c0279e.f4218l.a(c0279e.f4210b, c0279e.f4209a, j8);
                        c0279e.f4210b = a5.f4206a;
                        c0279e.f4209a = a5.f4207b;
                    }
                    float max = Math.max(c0279e.f4210b, c0279e.f4215g);
                    c0279e.f4210b = max;
                    c0279e.f4210b = Math.min(max, c0279e.f4214f);
                    float f2 = c0279e.f4209a;
                    C0280f c0280f3 = c0279e.f4218l;
                    c0280f3.getClass();
                    if (Math.abs(f2) >= c0280f3.f4224e || Math.abs(r8 - ((float) c0280f3.i)) >= c0280f3.f4223d) {
                        z3 = z4 ? 1 : 0;
                    } else {
                        c0279e.f4210b = (float) c0279e.f4218l.i;
                        c0279e.f4209a = BitmapDescriptorFactory.HUE_RED;
                        z3 = true;
                    }
                    float min = Math.min(c0279e.f4210b, c0279e.f4214f);
                    c0279e.f4210b = min;
                    float max2 = Math.max(min, c0279e.f4215g);
                    c0279e.f4210b = max2;
                    c0279e.b(max2);
                    if (z3) {
                        c0279e.f4213e = z4;
                        ThreadLocal threadLocal = C0276b.f4200f;
                        if (threadLocal.get() == null) {
                            threadLocal.set(new C0276b());
                        }
                        C0276b c0276b2 = (C0276b) threadLocal.get();
                        c0276b2.f4201a.remove(c0279e);
                        ArrayList arrayList3 = c0276b2.f4202b;
                        int indexOf = arrayList3.indexOf(c0279e);
                        x xVar = null;
                        if (indexOf >= 0) {
                            arrayList3.set(indexOf, null);
                            c0276b2.f4205e = true;
                        }
                        c0279e.h = 0L;
                        c0279e.f4211c = z4;
                        int i6 = z4 ? 1 : 0;
                        boolean z5 = z4;
                        while (true) {
                            arrayList2 = c0279e.f4216j;
                            if (i6 >= arrayList2.size()) {
                                break;
                            }
                            if (arrayList2.get(i6) != null) {
                                t tVar = (t) arrayList2.get(i6);
                                float f4 = c0279e.f4210b;
                                u uVar = tVar.f165a;
                                w wVar = w.f174c;
                                ?? r14 = uVar.f172g;
                                if (f4 < 1.0f) {
                                    long j10 = r14.f203x;
                                    x O2 = r14.O(z5);
                                    x xVar2 = O2.f198s;
                                    O2.f198s = xVar;
                                    j6 = uptimeMillis;
                                    r14.E(-1L, uVar.f166a);
                                    r14.E(j10, -1L);
                                    uVar.f166a = j10;
                                    RunnableC0141d runnableC0141d = uVar.f171f;
                                    if (runnableC0141d != null) {
                                        runnableC0141d.run();
                                    }
                                    r14.f200u.clear();
                                    if (xVar2 != null) {
                                        i = 1;
                                        xVar2.x(xVar2, wVar, true);
                                    } else {
                                        i = 1;
                                    }
                                } else {
                                    j6 = uptimeMillis;
                                    i = i5;
                                    r14.x(r14, wVar, z5);
                                }
                            } else {
                                j6 = uptimeMillis;
                                i = i5;
                            }
                            i6++;
                            i5 = i;
                            uptimeMillis = j6;
                            z5 = 0;
                            xVar = null;
                        }
                        j5 = uptimeMillis;
                        for (int size = arrayList2.size() - i5; size >= 0; size--) {
                            if (arrayList2.get(size) == null) {
                                arrayList2.remove(size);
                            }
                        }
                        i4++;
                        uptimeMillis = j5;
                        z4 = false;
                    }
                }
            }
            j5 = uptimeMillis;
            i4++;
            uptimeMillis = j5;
            z4 = false;
        }
        if (c0276b.f4205e) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                if (arrayList.get(size2) == null) {
                    arrayList.remove(size2);
                }
            }
            c0276b.f4205e = false;
        }
        if (arrayList.size() > 0) {
            if (c0276b.f4204d == null) {
                c0276b.f4204d = new h(c0276b.f4203c);
            }
            h hVar = c0276b.f4204d;
            ((Choreographer) hVar.f1414b).postFrameCallback((ChoreographerFrameCallbackC0275a) hVar.f1415c);
        }
    }
}
