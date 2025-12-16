package M;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g.N;
import l.m;
import l.x;
import m.C0462g;
import m.C0472l;
import x2.o;

/* loaded from: classes.dex */
public final class g implements x, o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1075a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1076b;

    public /* synthetic */ g(Object obj) {
        this.f1076b = obj;
    }

    public boolean a() {
        return this.f1075a;
    }

    @Override // l.x
    public void b(m mVar, boolean z3) {
        C0472l c0472l;
        if (this.f1075a) {
            return;
        }
        this.f1075a = true;
        N n4 = (N) this.f1076b;
        ActionMenuView actionMenuView = n4.f6556a.f7624a.f2480a;
        if (actionMenuView != null && (c0472l = actionMenuView.f2416t) != null) {
            c0472l.c();
            C0462g c0462g = c0472l.f7693u;
            if (c0462g != null && c0462g.b()) {
                c0462g.i.dismiss();
            }
        }
        n4.f6557b.onPanelClosed(108, mVar);
        this.f1075a = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    @Override // x2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public O.D0 c(android.view.View r11, O.D0 r12, x2.p r13) {
        /*
            r10 = this;
            O.B0 r0 = r12.f1207a
            r1 = 7
            G.c r1 = r0.f(r1)
            r2 = 32
            G.c r0 = r0.f(r2)
            int r2 = r1.f559b
            java.lang.Object r3 = r10.f1076b
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            r3.f5585w = r2
            boolean r2 = x2.m.g(r11)
            int r4 = r11.getPaddingBottom()
            int r5 = r11.getPaddingLeft()
            int r6 = r11.getPaddingRight()
            boolean r7 = r3.f5578o
            if (r7 == 0) goto L32
            int r4 = r12.a()
            r3.f5584v = r4
            int r7 = r13.f8972d
            int r4 = r4 + r7
        L32:
            boolean r7 = r3.p
            int r8 = r1.f558a
            if (r7 == 0) goto L40
            if (r2 == 0) goto L3d
            int r5 = r13.f8971c
            goto L3f
        L3d:
            int r5 = r13.f8969a
        L3f:
            int r5 = r5 + r8
        L40:
            boolean r7 = r3.f5579q
            int r9 = r1.f560c
            if (r7 == 0) goto L4f
            if (r2 == 0) goto L4b
            int r13 = r13.f8969a
            goto L4d
        L4b:
            int r13 = r13.f8971c
        L4d:
            int r6 = r13 + r9
        L4f:
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            boolean r2 = r3.f5581s
            r7 = 1
            if (r2 == 0) goto L62
            int r2 = r13.leftMargin
            if (r2 == r8) goto L62
            r13.leftMargin = r8
            r2 = r7
            goto L63
        L62:
            r2 = 0
        L63:
            boolean r8 = r3.f5582t
            if (r8 == 0) goto L6e
            int r8 = r13.rightMargin
            if (r8 == r9) goto L6e
            r13.rightMargin = r9
            r2 = r7
        L6e:
            boolean r8 = r3.f5583u
            if (r8 == 0) goto L7b
            int r8 = r13.topMargin
            int r1 = r1.f559b
            if (r8 == r1) goto L7b
            r13.topMargin = r1
            goto L7c
        L7b:
            r7 = r2
        L7c:
            if (r7 == 0) goto L81
            r11.setLayoutParams(r13)
        L81:
            int r13 = r11.getPaddingTop()
            r11.setPadding(r5, r13, r6, r4)
            boolean r10 = r10.f1075a
            if (r10 == 0) goto L90
            int r11 = r0.f561d
            r3.f5576m = r11
        L90:
            boolean r11 = r3.f5578o
            if (r11 != 0) goto L98
            if (r10 == 0) goto L97
            goto L98
        L97:
            return r12
        L98:
            r3.O()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: M.g.c(android.view.View, O.D0, x2.p):O.D0");
    }

    public boolean d(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((f) this.f1076b) == null) {
            return a();
        }
        char c4 = 2;
        for (int i4 = 0; i4 < i && c4 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            g gVar = h.f1077a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c4 = 2;
                            break;
                    }
                }
                c4 = 0;
            }
            c4 = 1;
        }
        if (c4 == 0) {
            return true;
        }
        if (c4 != 1) {
            return a();
        }
        return false;
    }

    @Override // l.x
    public boolean f(m mVar) {
        ((N) this.f1076b).f6557b.onMenuOpened(108, mVar);
        return true;
    }

    public g(f fVar, boolean z3) {
        this(fVar);
        this.f1075a = z3;
    }

    public g(boolean z3, String str) {
        this.f1075a = z3;
        this.f1076b = str;
    }

    public g(BottomSheetBehavior bottomSheetBehavior, boolean z3) {
        this.f1076b = bottomSheetBehavior;
        this.f1075a = z3;
    }
}
