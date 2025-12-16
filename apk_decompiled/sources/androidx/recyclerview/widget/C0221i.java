package androidx.recyclerview.widget;

import e3.C0333t;
import e3.C0334u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: androidx.recyclerview.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3823a;

    /* renamed from: b, reason: collision with root package name */
    public long f3824b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3825c;

    public C0221i(d1.i systemWrapper) {
        this.f3823a = 1;
        Intrinsics.checkNotNullParameter(systemWrapper, "systemWrapper");
        this.f3825c = systemWrapper;
    }

    public void a(int i) {
        if (i < 64) {
            this.f3824b &= ~(1 << i);
            return;
        }
        C0221i c0221i = (C0221i) this.f3825c;
        if (c0221i != null) {
            c0221i.a(i - 64);
        }
    }

    public int b(int i) {
        C0221i c0221i = (C0221i) this.f3825c;
        if (c0221i == null) {
            if (i >= 64) {
                return Long.bitCount(this.f3824b);
            }
            return Long.bitCount(((1 << i) - 1) & this.f3824b);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.f3824b);
        }
        return Long.bitCount(this.f3824b) + c0221i.b(i - 64);
    }

    public void c() {
        if (((C0221i) this.f3825c) == null) {
            this.f3825c = new C0221i();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return ((1 << i) & this.f3824b) != 0;
        }
        c();
        return ((C0221i) this.f3825c).d(i - 64);
    }

    public void e(int i, boolean z3) {
        if (i >= 64) {
            c();
            ((C0221i) this.f3825c).e(i - 64, z3);
            return;
        }
        long j4 = this.f3824b;
        boolean z4 = (Long.MIN_VALUE & j4) != 0;
        long j5 = (1 << i) - 1;
        this.f3824b = ((j4 & (~j5)) << 1) | (j4 & j5);
        if (z3) {
            i(i);
        } else {
            a(i);
        }
        if (z4 || ((C0221i) this.f3825c) != null) {
            c();
            ((C0221i) this.f3825c).e(0, z4);
        }
    }

    public C0334u f() {
        int indexOf$default;
        C0333t c0333t = new C0333t();
        while (true) {
            String line = ((r3.C) this.f3825c).a0(this.f3824b);
            this.f3824b -= line.length();
            if (line.length() == 0) {
                return c0333t.d();
            }
            Intrinsics.checkNotNullParameter(line, "line");
            indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) line, ':', 1, false, 4, (Object) null);
            if (indexOf$default != -1) {
                String substring = line.substring(0, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(indexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                c0333t.b(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
                c0333t.b("", substring3);
            } else {
                c0333t.b("", line);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((C0221i) this.f3825c).g(i - 64);
        }
        long j4 = 1 << i;
        long j5 = this.f3824b;
        boolean z3 = (j5 & j4) != 0;
        long j6 = j5 & (~j4);
        this.f3824b = j6;
        long j7 = j4 - 1;
        this.f3824b = (j6 & j7) | Long.rotateRight((~j7) & j6, 1);
        C0221i c0221i = (C0221i) this.f3825c;
        if (c0221i != null) {
            if (c0221i.d(0)) {
                i(63);
            }
            ((C0221i) this.f3825c).g(0);
        }
        return z3;
    }

    public void h() {
        this.f3824b = 0L;
        C0221i c0221i = (C0221i) this.f3825c;
        if (c0221i != null) {
            c0221i.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f3824b |= 1 << i;
        } else {
            c();
            ((C0221i) this.f3825c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f3823a) {
            case 0:
                if (((C0221i) this.f3825c) == null) {
                    return Long.toBinaryString(this.f3824b);
                }
                return ((C0221i) this.f3825c).toString() + "xx" + Long.toBinaryString(this.f3824b);
            default:
                return super.toString();
        }
    }

    public C0221i(r3.C source) {
        this.f3823a = 2;
        Intrinsics.checkNotNullParameter(source, "source");
        this.f3825c = source;
        this.f3824b = 262144L;
    }

    public C0221i() {
        this.f3823a = 0;
        this.f3824b = 0L;
    }
}
