package X;

import O.X;
import P.k;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import s2.C0610c;

/* loaded from: classes.dex */
public final class a extends A.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f1975c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(11);
        this.f1975c = bVar;
    }

    @Override // A.a
    public final k m(int i) {
        return new k(AccessibilityNodeInfo.obtain(this.f1975c.n(i).f1341a));
    }

    @Override // A.a
    public final k o(int i) {
        b bVar = this.f1975c;
        int i4 = i == 2 ? bVar.f1983k : bVar.f1984l;
        if (i4 == Integer.MIN_VALUE) {
            return null;
        }
        return m(i4);
    }

    @Override // A.a
    public final boolean v(int i, int i4, Bundle bundle) {
        int i5;
        b bVar = this.f1975c;
        Chip chip = bVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = X.f1226a;
            return chip.performAccessibilityAction(i4, bundle);
        }
        if (i4 == 1) {
            return bVar.p(i);
        }
        if (i4 == 2) {
            return bVar.j(i);
        }
        boolean z3 = false;
        if (i4 == 64) {
            AccessibilityManager accessibilityManager = bVar.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i5 = bVar.f1983k) == i) {
                return false;
            }
            if (i5 != Integer.MIN_VALUE) {
                bVar.f1983k = IntCompanionObject.MIN_VALUE;
                bVar.i.invalidate();
                bVar.q(i5, 65536);
            }
            bVar.f1983k = i;
            chip.invalidate();
            bVar.q(i, 32768);
            return true;
        }
        if (i4 == 128) {
            if (bVar.f1983k != i) {
                return false;
            }
            bVar.f1983k = IntCompanionObject.MIN_VALUE;
            chip.invalidate();
            bVar.q(i, 65536);
            return true;
        }
        C0610c c0610c = (C0610c) bVar;
        if (i4 == 16) {
            Chip chip2 = c0610c.f8413q;
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z3 = true;
                }
                if (chip2.f5627s) {
                    chip2.f5626r.q(1, 1);
                }
            }
        }
        return z3;
    }
}
