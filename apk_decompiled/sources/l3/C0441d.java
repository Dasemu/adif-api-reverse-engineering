package l3;

import a.AbstractC0105a;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import r3.C0579k;

/* renamed from: l3.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0441d {

    /* renamed from: a, reason: collision with root package name */
    public int f7387a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7388b;

    /* renamed from: c, reason: collision with root package name */
    public final r3.C f7389c;

    /* renamed from: d, reason: collision with root package name */
    public C0440c[] f7390d;

    /* renamed from: e, reason: collision with root package name */
    public int f7391e;

    /* renamed from: f, reason: collision with root package name */
    public int f7392f;

    /* renamed from: g, reason: collision with root package name */
    public int f7393g;

    public C0441d(t source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7387a = ConstantsKt.DEFAULT_BLOCK_SIZE;
        this.f7388b = new ArrayList();
        this.f7389c = AbstractC0105a.d(source);
        this.f7390d = new C0440c[8];
        this.f7391e = 7;
    }

    public final int a(int i) {
        int i4;
        int i5 = 0;
        if (i > 0) {
            int length = this.f7390d.length;
            while (true) {
                length--;
                i4 = this.f7391e;
                if (length < i4 || i <= 0) {
                    break;
                }
                C0440c c0440c = this.f7390d[length];
                Intrinsics.checkNotNull(c0440c);
                int i6 = c0440c.f7386c;
                i -= i6;
                this.f7393g -= i6;
                this.f7392f--;
                i5++;
            }
            C0440c[] c0440cArr = this.f7390d;
            System.arraycopy(c0440cArr, i4 + 1, c0440cArr, i4 + 1 + i5, this.f7392f);
            this.f7391e += i5;
        }
        return i5;
    }

    public final C0579k b(int i) {
        if (i >= 0) {
            C0440c[] c0440cArr = f.f7401a;
            if (i <= c0440cArr.length - 1) {
                return c0440cArr[i].f7384a;
            }
        }
        int length = this.f7391e + 1 + (i - f.f7401a.length);
        if (length >= 0) {
            C0440c[] c0440cArr2 = this.f7390d;
            if (length < c0440cArr2.length) {
                C0440c c0440c = c0440cArr2[length];
                Intrinsics.checkNotNull(c0440c);
                return c0440c.f7384a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C0440c c0440c) {
        this.f7388b.add(c0440c);
        int i = this.f7387a;
        int i4 = c0440c.f7386c;
        if (i4 > i) {
            ArraysKt___ArraysJvmKt.fill$default(this.f7390d, (Object) null, 0, 0, 6, (Object) null);
            this.f7391e = this.f7390d.length - 1;
            this.f7392f = 0;
            this.f7393g = 0;
            return;
        }
        a((this.f7393g + i4) - i);
        int i5 = this.f7392f + 1;
        C0440c[] c0440cArr = this.f7390d;
        if (i5 > c0440cArr.length) {
            C0440c[] c0440cArr2 = new C0440c[c0440cArr.length * 2];
            System.arraycopy(c0440cArr, 0, c0440cArr2, c0440cArr.length, c0440cArr.length);
            this.f7391e = this.f7390d.length - 1;
            this.f7390d = c0440cArr2;
        }
        int i6 = this.f7391e;
        this.f7391e = i6 - 1;
        this.f7390d[i6] = c0440c;
        this.f7392f++;
        this.f7393g += i4;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, r3.h] */
    public final C0579k d() {
        int i;
        r3.C source = this.f7389c;
        byte readByte = source.readByte();
        byte[] bArr = f3.c.f6469a;
        int i4 = readByte & UByte.MAX_VALUE;
        int i5 = 0;
        boolean z3 = (readByte & ByteCompanionObject.MIN_VALUE) == 128;
        long e4 = e(i4, WorkQueueKt.MASK);
        if (!z3) {
            return source.h(e4);
        }
        ?? sink = new Object();
        int[] iArr = A.f7366a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        com.google.android.material.datepicker.l lVar = A.f7368c;
        com.google.android.material.datepicker.l lVar2 = lVar;
        int i6 = 0;
        for (long j4 = 0; j4 < e4; j4++) {
            byte readByte2 = source.readByte();
            byte[] bArr2 = f3.c.f6469a;
            i5 = (i5 << 8) | (readByte2 & UByte.MAX_VALUE);
            i6 += 8;
            while (i6 >= 8) {
                int i7 = (i5 >>> (i6 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                com.google.android.material.datepicker.l[] lVarArr = (com.google.android.material.datepicker.l[]) lVar2.f5667a;
                Intrinsics.checkNotNull(lVarArr);
                lVar2 = lVarArr[i7];
                Intrinsics.checkNotNull(lVar2);
                if (((com.google.android.material.datepicker.l[]) lVar2.f5667a) == null) {
                    sink.j0(lVar2.f5668b);
                    i6 -= lVar2.f5669c;
                    lVar2 = lVar;
                } else {
                    i6 -= 8;
                }
            }
        }
        while (i6 > 0) {
            int i8 = (i5 << (8 - i6)) & KotlinVersion.MAX_COMPONENT_VALUE;
            com.google.android.material.datepicker.l[] lVarArr2 = (com.google.android.material.datepicker.l[]) lVar2.f5667a;
            Intrinsics.checkNotNull(lVarArr2);
            com.google.android.material.datepicker.l lVar3 = lVarArr2[i8];
            Intrinsics.checkNotNull(lVar3);
            if (((com.google.android.material.datepicker.l[]) lVar3.f5667a) != null || (i = lVar3.f5669c) > i6) {
                break;
            }
            sink.j0(lVar3.f5668b);
            i6 -= i;
            lVar2 = lVar;
        }
        return sink.h(sink.f8284b);
    }

    public final int e(int i, int i4) {
        int i5 = i & i4;
        if (i5 < i4) {
            return i5;
        }
        int i6 = 0;
        while (true) {
            byte readByte = this.f7389c.readByte();
            byte[] bArr = f3.c.f6469a;
            int i7 = readByte & UByte.MAX_VALUE;
            if ((readByte & ByteCompanionObject.MIN_VALUE) == 0) {
                return i4 + (i7 << i6);
            }
            i4 += (readByte & ByteCompanionObject.MAX_VALUE) << i6;
            i6 += 7;
        }
    }
}
