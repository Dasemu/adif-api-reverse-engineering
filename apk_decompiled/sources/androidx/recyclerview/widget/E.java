package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public final class E implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f3503e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final r f3504f = new r(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3505a;

    /* renamed from: b, reason: collision with root package name */
    public long f3506b;

    /* renamed from: c, reason: collision with root package name */
    public long f3507c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3508d;

    public static I0 c(RecyclerView recyclerView, int i, long j4) {
        int h = recyclerView.f3682f.h();
        for (int i4 = 0; i4 < h; i4++) {
            I0 N3 = RecyclerView.N(recyclerView.f3682f.g(i4));
            if (N3.mPosition == i && !N3.isInvalid()) {
                return null;
            }
        }
        y0 y0Var = recyclerView.f3676c;
        try {
            recyclerView.V();
            I0 k4 = y0Var.k(i, j4);
            if (k4 != null) {
                if (!k4.isBound() || k4.isInvalid()) {
                    y0Var.a(k4, false);
                } else {
                    y0Var.h(k4.itemView);
                }
            }
            recyclerView.W(false);
            return k4;
        } catch (Throwable th) {
            recyclerView.W(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i4) {
        if (recyclerView.f3705s) {
            if (RecyclerView.A0 && !this.f3505a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f3506b == 0) {
                this.f3506b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        Z2.y yVar = recyclerView.f3685g0;
        yVar.f2311a = i;
        yVar.f2312b = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j4) {
        D d4;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        D d5;
        ArrayList arrayList = this.f3505a;
        int size = arrayList.size();
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i4);
            if (recyclerView3.getWindowVisibility() == 0) {
                Z2.y yVar = recyclerView3.f3685g0;
                yVar.c(recyclerView3, false);
                i += yVar.f2313c;
            }
        }
        ArrayList arrayList2 = this.f3508d;
        arrayList2.ensureCapacity(i);
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i6);
            if (recyclerView4.getWindowVisibility() == 0) {
                Z2.y yVar2 = recyclerView4.f3685g0;
                int abs = Math.abs(yVar2.f2312b) + Math.abs(yVar2.f2311a);
                for (int i7 = 0; i7 < yVar2.f2313c * 2; i7 += 2) {
                    if (i5 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        d5 = obj;
                    } else {
                        d5 = (D) arrayList2.get(i5);
                    }
                    int[] iArr = (int[]) yVar2.f2314d;
                    int i8 = iArr[i7 + 1];
                    d5.f3498a = i8 <= abs;
                    d5.f3499b = abs;
                    d5.f3500c = i8;
                    d5.f3501d = recyclerView4;
                    d5.f3502e = iArr[i7];
                    i5++;
                }
            }
        }
        Collections.sort(arrayList2, f3504f);
        for (int i9 = 0; i9 < arrayList2.size() && (recyclerView = (d4 = (D) arrayList2.get(i9)).f3501d) != null; i9++) {
            I0 c4 = c(recyclerView, d4.f3502e, d4.f3498a ? LongCompanionObject.MAX_VALUE : j4);
            if (c4 != null && c4.mNestedRecyclerView != null && c4.isBound() && !c4.isInvalid() && (recyclerView2 = c4.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.f3653D && recyclerView2.f3682f.h() != 0) {
                    AbstractC0230m0 abstractC0230m0 = recyclerView2.f3661M;
                    if (abstractC0230m0 != null) {
                        abstractC0230m0.e();
                    }
                    AbstractC0238q0 abstractC0238q0 = recyclerView2.f3696n;
                    y0 y0Var = recyclerView2.f3676c;
                    if (abstractC0238q0 != null) {
                        abstractC0238q0.n0(y0Var);
                        recyclerView2.f3696n.o0(y0Var);
                    }
                    y0Var.f3936a.clear();
                    y0Var.f();
                }
                Z2.y yVar3 = recyclerView2.f3685g0;
                yVar3.c(recyclerView2, true);
                if (yVar3.f2313c != 0) {
                    try {
                        Trace.beginSection("RV Nested Prefetch");
                        E0 e02 = recyclerView2.f3686h0;
                        AbstractC0220h0 abstractC0220h0 = recyclerView2.f3694m;
                        e02.f3512d = 1;
                        e02.f3513e = abstractC0220h0.getItemCount();
                        e02.f3515g = false;
                        e02.h = false;
                        e02.i = false;
                        for (int i10 = 0; i10 < yVar3.f2313c * 2; i10 += 2) {
                            c(recyclerView2, ((int[]) yVar3.f2314d)[i10], j4);
                        }
                        d4.f3498a = false;
                        d4.f3499b = 0;
                        d4.f3500c = 0;
                        d4.f3501d = null;
                        d4.f3502e = 0;
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            d4.f3498a = false;
            d4.f3499b = 0;
            d4.f3500c = 0;
            d4.f3501d = null;
            d4.f3502e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f3505a;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            long j4 = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                if (recyclerView.getWindowVisibility() == 0) {
                    j4 = Math.max(recyclerView.getDrawingTime(), j4);
                }
            }
            if (j4 == 0) {
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j4) + this.f3507c);
        } finally {
            this.f3506b = 0L;
            Trace.endSection();
        }
    }
}
