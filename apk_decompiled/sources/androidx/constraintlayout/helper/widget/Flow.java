package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.s;
import androidx.constraintlayout.widget.u;
import java.util.ArrayList;
import java.util.HashMap;
import w.d;
import w.g;
import w.i;

/* loaded from: classes.dex */
public class Flow extends u {

    /* renamed from: j, reason: collision with root package name */
    public final g f2536j;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, x.b] */
    /* JADX WARN: Type inference failed for: r8v1, types: [w.g, w.i] */
    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2546a = new int[32];
        this.f2552g = new HashMap();
        this.f2548c = context;
        super.g(attributeSet);
        ?? iVar = new i();
        iVar.f8786s0 = 0;
        iVar.f8787t0 = 0;
        iVar.f8788u0 = 0;
        iVar.f8789v0 = 0;
        iVar.f8790w0 = 0;
        iVar.f8791x0 = 0;
        iVar.f8792y0 = false;
        iVar.f8793z0 = 0;
        iVar.A0 = 0;
        iVar.f8761B0 = new Object();
        iVar.f8762C0 = null;
        iVar.f8763D0 = -1;
        iVar.E0 = -1;
        iVar.f8764F0 = -1;
        iVar.f8765G0 = -1;
        iVar.f8766H0 = -1;
        iVar.f8767I0 = -1;
        iVar.f8768J0 = 0.5f;
        iVar.f8769K0 = 0.5f;
        iVar.f8770L0 = 0.5f;
        iVar.f8771M0 = 0.5f;
        iVar.f8772N0 = 0.5f;
        iVar.f8773O0 = 0.5f;
        iVar.f8774P0 = 0;
        iVar.f8775Q0 = 0;
        iVar.f8776R0 = 2;
        iVar.f8777S0 = 2;
        iVar.f8778T0 = 0;
        iVar.f8779U0 = -1;
        iVar.f8780V0 = 0;
        iVar.f8781W0 = new ArrayList();
        iVar.f8782X0 = null;
        iVar.Y0 = null;
        iVar.f8783Z0 = null;
        iVar.f8785b1 = 0;
        this.f2536j = iVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f2749b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f2536j.f8780V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.f2536j;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f8786s0 = dimensionPixelSize;
                    gVar.f8787t0 = dimensionPixelSize;
                    gVar.f8788u0 = dimensionPixelSize;
                    gVar.f8789v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar2 = this.f2536j;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f8788u0 = dimensionPixelSize2;
                    gVar2.f8790w0 = dimensionPixelSize2;
                    gVar2.f8791x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f2536j.f8789v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f2536j.f8790w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f2536j.f8786s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f2536j.f8791x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f2536j.f8787t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f2536j.f8778T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f2536j.f8763D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f2536j.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f2536j.f8764F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f2536j.f8766H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f2536j.f8765G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f2536j.f8767I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f2536j.f8768J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f2536j.f8770L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f2536j.f8772N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f2536j.f8771M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f2536j.f8773O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f2536j.f8769K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f2536j.f8776R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f2536j.f8777S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f2536j.f8774P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f2536j.f8775Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f2536j.f8779U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2549d = this.f2536j;
        i();
    }

    @Override // androidx.constraintlayout.widget.c
    public final void h(d dVar, boolean z3) {
        g gVar = this.f2536j;
        int i = gVar.f8788u0;
        if (i > 0 || gVar.f8789v0 > 0) {
            if (z3) {
                gVar.f8790w0 = gVar.f8789v0;
                gVar.f8791x0 = i;
            } else {
                gVar.f8790w0 = i;
                gVar.f8791x0 = gVar.f8789v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06f1  */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    @Override // androidx.constraintlayout.widget.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(w.g r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(w.g, int, int):void");
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public final void onMeasure(int i, int i4) {
        j(this.f2536j, i, i4);
    }

    public void setFirstHorizontalBias(float f2) {
        this.f2536j.f8770L0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f2536j.f8764F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.f2536j.f8771M0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f2536j.f8765G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f2536j.f8776R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.f2536j.f8768J0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f2536j.f8774P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f2536j.f8763D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f2) {
        this.f2536j.f8772N0 = f2;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f2536j.f8766H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f2) {
        this.f2536j.f8773O0 = f2;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f2536j.f8767I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f2536j.f8779U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f2536j.f8780V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.f2536j;
        gVar.f8786s0 = i;
        gVar.f8787t0 = i;
        gVar.f8788u0 = i;
        gVar.f8789v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f2536j.f8787t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f2536j.f8790w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f2536j.f8791x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f2536j.f8786s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f2536j.f8777S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.f2536j.f8769K0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f2536j.f8775Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f2536j.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f2536j.f8778T0 = i;
        requestLayout();
    }
}
