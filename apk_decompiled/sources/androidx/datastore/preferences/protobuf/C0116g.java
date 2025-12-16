package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0116g implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0116g f2909c = new C0116g(AbstractC0133y.f2976b);

    /* renamed from: d, reason: collision with root package name */
    public static final C0115f f2910d;

    /* renamed from: a, reason: collision with root package name */
    public int f2911a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2912b;

    static {
        f2910d = AbstractC0112c.a() ? new C0115f(1) : new C0115f(0);
    }

    public C0116g(byte[] bArr) {
        bArr.getClass();
        this.f2912b = bArr;
    }

    public static C0116g a(int i, int i4, byte[] bArr) {
        byte[] copyOfRange;
        int i5 = i + i4;
        int length = bArr.length;
        if (((i5 - i) | i | i5 | (length - i5)) < 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException(C.w.i(i, "Beginning index: ", " < 0"));
            }
            if (i5 < i) {
                throw new IndexOutOfBoundsException(C.w.k("Beginning index larger than ending index: ", i, i5, ", "));
            }
            throw new IndexOutOfBoundsException(C.w.k("End index: ", i5, length, " >= "));
        }
        switch (f2910d.f2908a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i, i4 + i);
                break;
            default:
                copyOfRange = new byte[i4];
                System.arraycopy(bArr, i, copyOfRange, 0, i4);
                break;
        }
        return new C0116g(copyOfRange);
    }

    public int b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0116g) || size() != ((C0116g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0116g)) {
            return obj.equals(this);
        }
        C0116g c0116g = (C0116g) obj;
        int i = this.f2911a;
        int i4 = c0116g.f2911a;
        if (i != 0 && i4 != 0 && i != i4) {
            return false;
        }
        int size = size();
        if (size > c0116g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0116g.size()) {
            StringBuilder t2 = C.w.t(size, "Ran off end of other: 0, ", ", ");
            t2.append(c0116g.size());
            throw new IllegalArgumentException(t2.toString());
        }
        int b4 = b() + size;
        int b5 = b();
        int b6 = c0116g.b();
        while (b5 < b4) {
            if (this.f2912b[b5] != c0116g.f2912b[b6]) {
                return false;
            }
            b5++;
            b6++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f2911a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int b4 = b();
        int i4 = size;
        for (int i5 = b4; i5 < b4 + size; i5++) {
            i4 = (i4 * 31) + this.f2912b[i5];
        }
        if (i4 == 0) {
            i4 = 1;
        }
        this.f2911a = i4;
        return i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0114e(this);
    }

    public int size() {
        return this.f2912b.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
