package L;

import android.graphics.Typeface;
import androidx.fragment.app.D0;
import androidx.recyclerview.widget.C0209c;
import androidx.recyclerview.widget.C0217g;
import androidx.recyclerview.widget.C0219h;
import androidx.recyclerview.widget.C0240s;
import androidx.recyclerview.widget.C0242t;
import androidx.recyclerview.widget.C0243u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1020c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f1018a = i;
        this.f1019b = obj;
        this.f1020c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C0242t c0242t;
        int i;
        int i4;
        int i5;
        int i6;
        switch (this.f1018a) {
            case 0:
                F.b bVar = (F.b) ((A.a) this.f1019b).f7b;
                if (bVar != null) {
                    bVar.h((Typeface) this.f1020c);
                    return;
                }
                return;
            case 1:
                ((e) this.f1019b).a(this.f1020c);
                return;
            default:
                D0 d02 = (D0) this.f1020c;
                C0217g c0217g = (C0217g) d02.f2993f;
                if (c0217g.f3816g == d02.f2989b) {
                    List list = c0217g.f3815f;
                    List list2 = d02.f2991d;
                    c0217g.f3814e = list2;
                    c0217g.f3815f = Collections.unmodifiableList(list2);
                    C0242t c0242t2 = (C0242t) this.f1019b;
                    C0219h c0219h = new C0219h(c0217g.f3810a);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    ArrayList arrayList = c0242t2.f3904a;
                    int i7 = 1;
                    int size = arrayList.size() - 1;
                    int i8 = c0242t2.f3908e;
                    int i9 = c0242t2.f3909f;
                    int i10 = i8;
                    while (size >= 0) {
                        C0240s c0240s = (C0240s) arrayList.get(size);
                        int i11 = c0240s.f3901a;
                        int i12 = c0240s.f3903c;
                        int i13 = i11 + i12;
                        int i14 = c0240s.f3902b;
                        int i15 = i7;
                        int i16 = i14 + i12;
                        ArrayList arrayList2 = arrayList;
                        while (true) {
                            int[] iArr = c0242t2.f3905b;
                            C0209c c0209c = c0242t2.f3907d;
                            int i17 = size;
                            int i18 = 0;
                            if (i10 > i13) {
                                i10--;
                                int i19 = iArr[i10];
                                if ((i19 & 12) != 0) {
                                    int i20 = i8;
                                    int i21 = i19 >> 4;
                                    C0243u a2 = C0242t.a(arrayDeque, i21, false);
                                    if (a2 != null) {
                                        int i22 = (i20 - a2.f3912b) - 1;
                                        c0219h.c(i10, i22);
                                        if ((i19 & 4) != 0) {
                                            c0209c.c(i10, i21);
                                            c0219h.b(i22, i15);
                                        }
                                    } else {
                                        boolean z3 = i15;
                                        arrayDeque.add(new C0243u(i10, (i20 - i10) - (z3 ? 1 : 0), z3));
                                    }
                                    i8 = i20;
                                } else {
                                    int i23 = i15;
                                    int i24 = i8;
                                    if (c0219h.f3820b != 2 || (i6 = c0219h.f3821c) < i10 || i6 > i10 + 1) {
                                        c0219h.a();
                                        c0219h.f3821c = i10;
                                        c0219h.f3822d = i23;
                                        c0219h.f3820b = 2;
                                    } else {
                                        c0219h.f3822d += i23;
                                        c0219h.f3821c = i10;
                                    }
                                    i8 = i24 - 1;
                                }
                                size = i17;
                                i15 = 1;
                            } else {
                                while (i9 > i16) {
                                    i9--;
                                    int i25 = c0242t2.f3906c[i9];
                                    if ((i25 & 12) != 0) {
                                        int i26 = i25 >> 4;
                                        c0242t = c0242t2;
                                        i4 = i16;
                                        C0243u a4 = C0242t.a(arrayDeque, i26, true);
                                        if (a4 == null) {
                                            arrayDeque.add(new C0243u(i9, i8 - i10, false));
                                            i = 0;
                                        } else {
                                            i = 0;
                                            c0219h.c((i8 - a4.f3912b) - 1, i10);
                                            if ((i25 & 4) != 0) {
                                                c0209c.c(i26, i9);
                                                c0219h.b(i10, 1);
                                            }
                                        }
                                    } else {
                                        c0242t = c0242t2;
                                        i = i18;
                                        i4 = i16;
                                        if (c0219h.f3820b == 1 && i10 >= (i5 = c0219h.f3821c)) {
                                            int i27 = c0219h.f3822d;
                                            if (i10 <= i5 + i27) {
                                                c0219h.f3822d = i27 + 1;
                                                c0219h.f3821c = Math.min(i10, i5);
                                                i8++;
                                            }
                                        }
                                        c0219h.a();
                                        c0219h.f3821c = i10;
                                        c0219h.f3822d = 1;
                                        c0219h.f3820b = 1;
                                        i8++;
                                    }
                                    i18 = i;
                                    c0242t2 = c0242t;
                                    i16 = i4;
                                }
                                C0242t c0242t3 = c0242t2;
                                i10 = c0240s.f3901a;
                                int i28 = i10;
                                int i29 = i14;
                                while (i18 < i12) {
                                    if ((iArr[i28] & 15) == 2) {
                                        c0209c.c(i28, i29);
                                        c0219h.b(i28, 1);
                                    }
                                    i28++;
                                    i29++;
                                    i18++;
                                }
                                size = i17 - 1;
                                i7 = 1;
                                i9 = i14;
                                arrayList = arrayList2;
                                c0242t2 = c0242t3;
                            }
                        }
                    }
                    c0219h.a();
                    c0217g.a(list, (Runnable) d02.f2992e);
                    return;
                }
                return;
        }
    }

    public a(D0 d02, C0242t c0242t) {
        this.f1018a = 2;
        this.f1020c = d02;
        this.f1019b = c0242t;
    }
}
