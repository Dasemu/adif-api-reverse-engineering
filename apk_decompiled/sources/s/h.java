package s;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;
import t.AbstractC0613a;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f8348a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f8349b = new Object();

    public static final void a(k kVar) {
        int i = kVar.f8356d;
        int[] iArr = kVar.f8354b;
        Object[] objArr = kVar.f8355c;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            if (obj != f8349b) {
                if (i5 != i4) {
                    iArr[i4] = iArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        kVar.f8353a = false;
        kVar.f8356d = i4;
    }

    public static final void b(f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int[] iArr = new int[i];
        fVar.getClass();
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        fVar.f8341a = iArr;
        Object[] objArr = new Object[i];
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        fVar.f8342b = objArr;
    }

    public static final int c(f fVar, Object obj, int i) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i4 = fVar.f8343c;
        if (i4 == 0) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        try {
            int a2 = AbstractC0613a.a(fVar.f8341a, fVar.f8343c, i);
            if (a2 < 0 || Intrinsics.areEqual(obj, fVar.f8342b[a2])) {
                return a2;
            }
            int i5 = a2 + 1;
            while (i5 < i4 && fVar.f8341a[i5] == i) {
                if (Intrinsics.areEqual(obj, fVar.f8342b[i5])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = a2 - 1; i6 >= 0 && fVar.f8341a[i6] == i; i6--) {
                if (Intrinsics.areEqual(obj, fVar.f8342b[i6])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final l d(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return new l(kVar);
    }
}
