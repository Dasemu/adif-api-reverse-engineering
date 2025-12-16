package l3;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import r3.C0576h;
import r3.C0579k;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final C0576h f7394a;

    /* renamed from: b, reason: collision with root package name */
    public int f7395b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7396c;

    /* renamed from: d, reason: collision with root package name */
    public int f7397d;

    /* renamed from: e, reason: collision with root package name */
    public C0440c[] f7398e;

    /* renamed from: f, reason: collision with root package name */
    public int f7399f;

    /* renamed from: g, reason: collision with root package name */
    public int f7400g;
    public int h;

    public e(C0576h out) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f7394a = out;
        this.f7395b = Integer.MAX_VALUE;
        this.f7397d = ConstantsKt.DEFAULT_BLOCK_SIZE;
        this.f7398e = new C0440c[8];
        this.f7399f = 7;
    }

    public final void a(int i) {
        int i4;
        if (i > 0) {
            int length = this.f7398e.length - 1;
            int i5 = 0;
            while (true) {
                i4 = this.f7399f;
                if (length < i4 || i <= 0) {
                    break;
                }
                C0440c c0440c = this.f7398e[length];
                Intrinsics.checkNotNull(c0440c);
                i -= c0440c.f7386c;
                int i6 = this.h;
                C0440c c0440c2 = this.f7398e[length];
                Intrinsics.checkNotNull(c0440c2);
                this.h = i6 - c0440c2.f7386c;
                this.f7400g--;
                i5++;
                length--;
            }
            C0440c[] c0440cArr = this.f7398e;
            int i7 = i4 + 1;
            System.arraycopy(c0440cArr, i7, c0440cArr, i7 + i5, this.f7400g);
            C0440c[] c0440cArr2 = this.f7398e;
            int i8 = this.f7399f + 1;
            Arrays.fill(c0440cArr2, i8, i8 + i5, (Object) null);
            this.f7399f += i5;
        }
    }

    public final void b(C0440c c0440c) {
        int i = this.f7397d;
        int i4 = c0440c.f7386c;
        if (i4 > i) {
            ArraysKt___ArraysJvmKt.fill$default(this.f7398e, (Object) null, 0, 0, 6, (Object) null);
            this.f7399f = this.f7398e.length - 1;
            this.f7400g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i4) - i);
        int i5 = this.f7400g + 1;
        C0440c[] c0440cArr = this.f7398e;
        if (i5 > c0440cArr.length) {
            C0440c[] c0440cArr2 = new C0440c[c0440cArr.length * 2];
            System.arraycopy(c0440cArr, 0, c0440cArr2, c0440cArr.length, c0440cArr.length);
            this.f7399f = this.f7398e.length - 1;
            this.f7398e = c0440cArr2;
        }
        int i6 = this.f7399f;
        this.f7399f = i6 - 1;
        this.f7398e[i6] = c0440c;
        this.f7400g++;
        this.h += i4;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, r3.h] */
    public final void c(C0579k source) {
        Intrinsics.checkNotNullParameter(source, "data");
        C0576h c0576h = this.f7394a;
        int[] iArr = A.f7366a;
        Intrinsics.checkNotNullParameter(source, "bytes");
        int d4 = source.d();
        long j4 = 0;
        for (int i = 0; i < d4; i++) {
            byte i4 = source.i(i);
            byte[] bArr = f3.c.f6469a;
            j4 += A.f7367b[i4 & UByte.MAX_VALUE];
        }
        if (((int) ((j4 + 7) >> 3)) >= source.d()) {
            e(source.d(), WorkQueueKt.MASK, 0);
            c0576h.h0(source);
            return;
        }
        ?? sink = new Object();
        int[] iArr2 = A.f7366a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int d5 = source.d();
        long j5 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < d5; i6++) {
            byte i7 = source.i(i6);
            byte[] bArr2 = f3.c.f6469a;
            int i8 = i7 & UByte.MAX_VALUE;
            int i9 = A.f7366a[i8];
            byte b4 = A.f7367b[i8];
            j5 = (j5 << b4) | i9;
            i5 += b4;
            while (i5 >= 8) {
                i5 -= 8;
                sink.j0((int) (j5 >> i5));
            }
        }
        if (i5 > 0) {
            sink.j0((int) ((255 >>> i5) | (j5 << (8 - i5))));
        }
        C0579k h = sink.h(sink.f8284b);
        e(h.d(), WorkQueueKt.MASK, 128);
        c0576h.h0(h);
    }

    public final void d(ArrayList headerBlock) {
        int i;
        int i4;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f7396c) {
            int i5 = this.f7395b;
            if (i5 < this.f7397d) {
                e(i5, 31, 32);
            }
            this.f7396c = false;
            this.f7395b = Integer.MAX_VALUE;
            e(this.f7397d, 31, 32);
        }
        int size = headerBlock.size();
        for (int i6 = 0; i6 < size; i6++) {
            C0440c c0440c = (C0440c) headerBlock.get(i6);
            C0579k p = c0440c.f7384a.p();
            Integer num = (Integer) f.f7402b.get(p);
            C0579k c0579k = c0440c.f7385b;
            if (num != null) {
                int intValue = num.intValue();
                i4 = intValue + 1;
                if (2 <= i4 && i4 < 8) {
                    C0440c[] c0440cArr = f.f7401a;
                    if (Intrinsics.areEqual(c0440cArr[intValue].f7385b, c0579k)) {
                        i = i4;
                    } else if (Intrinsics.areEqual(c0440cArr[i4].f7385b, c0579k)) {
                        i4 = intValue + 2;
                        i = i4;
                    }
                }
                i = i4;
                i4 = -1;
            } else {
                i = -1;
                i4 = -1;
            }
            if (i4 == -1) {
                int i7 = this.f7399f + 1;
                int length = this.f7398e.length;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    C0440c c0440c2 = this.f7398e[i7];
                    Intrinsics.checkNotNull(c0440c2);
                    if (Intrinsics.areEqual(c0440c2.f7384a, p)) {
                        C0440c c0440c3 = this.f7398e[i7];
                        Intrinsics.checkNotNull(c0440c3);
                        if (Intrinsics.areEqual(c0440c3.f7385b, c0579k)) {
                            i4 = f.f7401a.length + (i7 - this.f7399f);
                            break;
                        } else if (i == -1) {
                            i = (i7 - this.f7399f) + f.f7401a.length;
                        }
                    }
                    i7++;
                }
            }
            if (i4 != -1) {
                e(i4, WorkQueueKt.MASK, 128);
            } else if (i == -1) {
                this.f7394a.j0(64);
                c(p);
                c(c0579k);
                b(c0440c);
            } else {
                C0579k prefix = C0440c.f7380d;
                p.getClass();
                Intrinsics.checkNotNullParameter(prefix, "prefix");
                if (!p.l(0, prefix, prefix.d()) || Intrinsics.areEqual(C0440c.i, p)) {
                    e(i, 63, 64);
                    c(c0579k);
                    b(c0440c);
                } else {
                    e(i, 15, 0);
                    c(c0579k);
                }
            }
        }
    }

    public final void e(int i, int i4, int i5) {
        C0576h c0576h = this.f7394a;
        if (i < i4) {
            c0576h.j0(i | i5);
            return;
        }
        c0576h.j0(i5 | i4);
        int i6 = i - i4;
        while (i6 >= 128) {
            c0576h.j0(128 | (i6 & WorkQueueKt.MASK));
            i6 >>>= 7;
        }
        c0576h.j0(i6);
    }
}
