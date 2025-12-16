package androidx.recyclerview.widget;

import O.C0079u;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3809a;

    public /* synthetic */ C0216f0(RecyclerView recyclerView) {
        this.f3809a = recyclerView;
    }

    public void a(C0205a c0205a) {
        int i = c0205a.f3782a;
        RecyclerView recyclerView = this.f3809a;
        if (i == 1) {
            recyclerView.f3696n.c0(c0205a.f3783b, c0205a.f3785d);
            return;
        }
        if (i == 2) {
            recyclerView.f3696n.f0(c0205a.f3783b, c0205a.f3785d);
        } else if (i == 4) {
            recyclerView.f3696n.g0(c0205a.f3783b, c0205a.f3785d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f3696n.e0(c0205a.f3783b, c0205a.f3785d);
        }
    }

    public I0 b(int i) {
        RecyclerView recyclerView = this.f3809a;
        int h = recyclerView.f3682f.h();
        int i4 = 0;
        I0 i02 = null;
        while (true) {
            if (i4 >= h) {
                break;
            }
            I0 N3 = RecyclerView.N(recyclerView.f3682f.g(i4));
            if (N3 != null && !N3.isRemoved() && N3.mPosition == i) {
                if (!recyclerView.f3682f.f3828c.contains(N3.itemView)) {
                    i02 = N3;
                    break;
                }
                i02 = N3;
            }
            i4++;
        }
        if (i02 != null) {
            if (!recyclerView.f3682f.f3828c.contains(i02.itemView)) {
                return i02;
            }
            if (RecyclerView.f3642B0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void c(int i, int i4, Object obj) {
        int i5;
        int i6;
        RecyclerView recyclerView = this.f3809a;
        int h = recyclerView.f3682f.h();
        int i7 = i4 + i;
        for (int i8 = 0; i8 < h; i8++) {
            View g4 = recyclerView.f3682f.g(i8);
            I0 N3 = RecyclerView.N(g4);
            if (N3 != null && !N3.shouldIgnore() && (i6 = N3.mPosition) >= i && i6 < i7) {
                N3.addFlags(2);
                N3.addChangePayload(obj);
                ((C0239r0) g4.getLayoutParams()).f3899c = true;
            }
        }
        y0 y0Var = recyclerView.f3676c;
        ArrayList arrayList = y0Var.f3938c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            I0 i02 = (I0) arrayList.get(size);
            if (i02 != null && (i5 = i02.mPosition) >= i && i5 < i7) {
                i02.addFlags(2);
                y0Var.g(size);
            }
        }
        recyclerView.f3693l0 = true;
    }

    public void d(int i, int i4) {
        RecyclerView recyclerView = this.f3809a;
        int h = recyclerView.f3682f.h();
        for (int i5 = 0; i5 < h; i5++) {
            I0 N3 = RecyclerView.N(recyclerView.f3682f.g(i5));
            if (N3 != null && !N3.shouldIgnore() && N3.mPosition >= i) {
                if (RecyclerView.f3642B0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i5 + " holder " + N3 + " now at position " + (N3.mPosition + i4));
                }
                N3.offsetPosition(i4, false);
                recyclerView.f3686h0.f3514f = true;
            }
        }
        ArrayList arrayList = recyclerView.f3676c.f3938c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            I0 i02 = (I0) arrayList.get(i6);
            if (i02 != null && i02.mPosition >= i) {
                if (RecyclerView.f3642B0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i6 + " holder " + i02 + " now at position " + (i02.mPosition + i4));
                }
                i02.offsetPosition(i4, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3691k0 = true;
    }

    public void e(int i, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        RecyclerView recyclerView = this.f3809a;
        int h = recyclerView.f3682f.h();
        int i12 = -1;
        if (i < i4) {
            i6 = i;
            i5 = i4;
            i7 = -1;
        } else {
            i5 = i;
            i6 = i4;
            i7 = 1;
        }
        for (int i13 = 0; i13 < h; i13++) {
            I0 N3 = RecyclerView.N(recyclerView.f3682f.g(i13));
            if (N3 != null && (i11 = N3.mPosition) >= i6 && i11 <= i5) {
                if (RecyclerView.f3642B0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i13 + " holder " + N3);
                }
                if (N3.mPosition == i) {
                    N3.offsetPosition(i4 - i, false);
                } else {
                    N3.offsetPosition(i7, false);
                }
                recyclerView.f3686h0.f3514f = true;
            }
        }
        y0 y0Var = recyclerView.f3676c;
        y0Var.getClass();
        if (i < i4) {
            i9 = i;
            i8 = i4;
        } else {
            i8 = i;
            i9 = i4;
            i12 = 1;
        }
        ArrayList arrayList = y0Var.f3938c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            I0 i02 = (I0) arrayList.get(i14);
            if (i02 != null && (i10 = i02.mPosition) >= i9 && i10 <= i8) {
                if (i10 == i) {
                    i02.offsetPosition(i4 - i, false);
                } else {
                    i02.offsetPosition(i12, false);
                }
                if (RecyclerView.f3642B0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i14 + " holder " + i02);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3691k0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(androidx.recyclerview.widget.I0 r8, O.C0079u r9, O.C0079u r10) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r7 = r7.f3809a
            r7.getClass()
            r0 = 0
            r8.setIsRecyclable(r0)
            androidx.recyclerview.widget.m0 r0 = r7.f3661M
            r1 = r0
            androidx.recyclerview.widget.q r1 = (androidx.recyclerview.widget.C0237q) r1
            if (r9 == 0) goto L20
            r1.getClass()
            int r3 = r9.f1298a
            int r5 = r10.f1298a
            if (r3 != r5) goto L22
            int r0 = r9.f1299b
            int r2 = r10.f1299b
            if (r0 == r2) goto L20
            goto L22
        L20:
            r2 = r8
            goto L2c
        L22:
            int r4 = r9.f1299b
            int r6 = r10.f1299b
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L3b
        L2c:
            r1.l(r2)
            android.view.View r8 = r2.itemView
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r1.i
            r8.add(r2)
            r8 = 1
        L3b:
            if (r8 == 0) goto L40
            r7.Y()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0216f0.f(androidx.recyclerview.widget.I0, O.u, O.u):void");
    }

    public void g(I0 i02, C0079u c0079u, C0079u c0079u2) {
        boolean z3;
        RecyclerView recyclerView = this.f3809a;
        recyclerView.f3676c.l(i02);
        recyclerView.h(i02);
        i02.setIsRecyclable(false);
        C0237q c0237q = (C0237q) recyclerView.f3661M;
        c0237q.getClass();
        int i = c0079u.f1298a;
        int i4 = c0079u.f1299b;
        View view = i02.itemView;
        int left = c0079u2 == null ? view.getLeft() : c0079u2.f1298a;
        int top = c0079u2 == null ? view.getTop() : c0079u2.f1299b;
        if (i02.isRemoved() || (i == left && i4 == top)) {
            c0237q.l(i02);
            c0237q.h.add(i02);
            z3 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z3 = c0237q.g(i02, i, i4, left, top);
        }
        if (z3) {
            recyclerView.Y();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f3809a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
