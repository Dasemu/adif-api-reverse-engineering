package androidx.constraintlayout.widget;

import w.C0643a;

/* loaded from: classes.dex */
public final class a extends c {
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C0643a f2538j;

    public boolean getAllowsGoneWidget() {
        return this.f2538j.f8639t0;
    }

    public int getMargin() {
        return this.f2538j.f8640u0;
    }

    public int getType() {
        return this.h;
    }

    @Override // androidx.constraintlayout.widget.c
    public final void h(w.d dVar, boolean z3) {
        int i = this.h;
        this.i = i;
        if (z3) {
            if (i == 5) {
                this.i = 1;
            } else if (i == 6) {
                this.i = 0;
            }
        } else if (i == 5) {
            this.i = 0;
        } else if (i == 6) {
            this.i = 1;
        }
        if (dVar instanceof C0643a) {
            ((C0643a) dVar).f8638s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z3) {
        this.f2538j.f8639t0 = z3;
    }

    public void setDpMargin(int i) {
        this.f2538j.f8640u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f2538j.f8640u0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }
}
