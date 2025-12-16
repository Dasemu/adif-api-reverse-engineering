package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242t {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3904a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3905b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f3906c;

    /* renamed from: d, reason: collision with root package name */
    public final C0209c f3907d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3908e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3909f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3910g;

    public C0242t(C0209c c0209c, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int[] iArr3;
        int[] iArr4;
        C0209c c0209c2;
        int i;
        C0240s c0240s;
        int i4;
        this.f3904a = arrayList;
        this.f3905b = iArr;
        this.f3906c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f3907d = c0209c;
        androidx.fragment.app.D0 d02 = (androidx.fragment.app.D0) c0209c.f3796a;
        int size = d02.f2990c.size();
        this.f3908e = size;
        int size2 = d02.f2991d.size();
        this.f3909f = size2;
        this.f3910g = true;
        C0240s c0240s2 = arrayList.isEmpty() ? null : (C0240s) arrayList.get(0);
        if (c0240s2 == null || c0240s2.f3901a != 0 || c0240s2.f3902b != 0) {
            arrayList.add(0, new C0240s(0, 0, 0));
        }
        arrayList.add(new C0240s(size, size2, 0));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            iArr3 = this.f3906c;
            iArr4 = this.f3905b;
            c0209c2 = this.f3907d;
            if (!hasNext) {
                break;
            }
            C0240s c0240s3 = (C0240s) it.next();
            for (int i5 = 0; i5 < c0240s3.f3903c; i5++) {
                int i6 = c0240s3.f3901a + i5;
                int i7 = c0240s3.f3902b + i5;
                int i8 = c0209c2.a(i6, i7) ? 1 : 2;
                iArr4[i6] = (i7 << 4) | i8;
                iArr3[i7] = (i6 << 4) | i8;
            }
        }
        if (this.f3910g) {
            Iterator it2 = arrayList.iterator();
            int i9 = 0;
            while (it2.hasNext()) {
                C0240s c0240s4 = (C0240s) it2.next();
                while (true) {
                    i = c0240s4.f3901a;
                    if (i9 < i) {
                        if (iArr4[i9] == 0) {
                            int size3 = arrayList.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                if (i10 < size3) {
                                    c0240s = (C0240s) arrayList.get(i10);
                                    while (true) {
                                        i4 = c0240s.f3902b;
                                        if (i11 < i4) {
                                            if (iArr3[i11] == 0 && c0209c2.b(i9, i11)) {
                                                int i12 = c0209c2.a(i9, i11) ? 8 : 4;
                                                iArr4[i9] = (i11 << 4) | i12;
                                                iArr3[i11] = i12 | (i9 << 4);
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                                i11 = c0240s.f3903c + i4;
                                i10++;
                            }
                        }
                        i9++;
                    }
                }
                i9 = c0240s4.f3903c + i;
            }
        }
    }

    public static C0243u a(ArrayDeque arrayDeque, int i, boolean z3) {
        C0243u c0243u;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0243u = null;
                break;
            }
            c0243u = (C0243u) it.next();
            if (c0243u.f3911a == i && c0243u.f3913c == z3) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C0243u c0243u2 = (C0243u) it.next();
            if (z3) {
                c0243u2.f3912b--;
            } else {
                c0243u2.f3912b++;
            }
        }
        return c0243u;
    }
}
