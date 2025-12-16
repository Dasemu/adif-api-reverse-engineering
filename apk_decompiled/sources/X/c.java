package X;

import E2.e;
import P.k;
import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f1986a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1987b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1988c;

    /* renamed from: d, reason: collision with root package name */
    public final e f1989d;

    public c(boolean z3, e eVar) {
        this.f1988c = z3;
        this.f1989d = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f1989d.getClass();
        Rect rect = this.f1986a;
        ((k) obj).f(rect);
        Rect rect2 = this.f1987b;
        ((k) obj2).f(rect2);
        int i = rect.top;
        int i4 = rect2.top;
        if (i < i4) {
            return -1;
        }
        if (i > i4) {
            return 1;
        }
        int i5 = rect.left;
        int i6 = rect2.left;
        boolean z3 = this.f1988c;
        if (i5 < i6) {
            return z3 ? 1 : -1;
        }
        if (i5 > i6) {
            return z3 ? -1 : 1;
        }
        int i7 = rect.bottom;
        int i8 = rect2.bottom;
        if (i7 < i8) {
            return -1;
        }
        if (i7 > i8) {
            return 1;
        }
        int i9 = rect.right;
        int i10 = rect2.right;
        if (i9 < i10) {
            return z3 ? 1 : -1;
        }
        if (i9 > i10) {
            return z3 ? -1 : 1;
        }
        return 0;
    }
}
