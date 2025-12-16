package e3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;
import r3.InterfaceC0577i;

/* loaded from: classes3.dex */
public final class r extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final A f6396c;

    /* renamed from: a, reason: collision with root package name */
    public final List f6397a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6398b;

    static {
        Pattern pattern = A.f6197d;
        f6396c = z.a("application/x-www-form-urlencoded");
    }

    public r(ArrayList encodedNames, ArrayList encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f6397a = f3.c.w(encodedNames);
        this.f6398b = f3.c.w(encodedValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(InterfaceC0577i interfaceC0577i, boolean z3) {
        C0576h c0576h;
        if (z3) {
            c0576h = new Object();
        } else {
            Intrinsics.checkNotNull(interfaceC0577i);
            c0576h = interfaceC0577i.a();
        }
        List list = this.f6397a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c0576h.j0(38);
            }
            c0576h.o0((String) list.get(i));
            c0576h.j0(61);
            c0576h.o0((String) this.f6398b.get(i));
        }
        if (!z3) {
            return 0L;
        }
        long j4 = c0576h.f8284b;
        c0576h.d();
        return j4;
    }

    @Override // e3.M
    public final long contentLength() {
        return a(null, true);
    }

    @Override // e3.M
    public final A contentType() {
        return f6396c;
    }

    @Override // e3.M
    public final void writeTo(InterfaceC0577i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
