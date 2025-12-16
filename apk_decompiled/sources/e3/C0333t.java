package e3;

import a.AbstractC0105a;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: e3.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0333t {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6403a = new ArrayList(20);

    public final void a(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        AbstractC0105a.g(name);
        AbstractC0105a.h(value, name);
        b(name, value);
    }

    public final void b(String name, String value) {
        CharSequence trim;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = this.f6403a;
        arrayList.add(name);
        trim = StringsKt__StringsKt.trim((CharSequence) value);
        arrayList.add(trim.toString());
    }

    public final void c(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i = 0; i < length; i++) {
            char charAt = name.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(f3.c.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), name).toString());
            }
        }
        b(name, value);
    }

    public final C0334u d() {
        return new C0334u((String[]) this.f6403a.toArray(new String[0]));
    }

    public final void e(String name) {
        boolean equals;
        Intrinsics.checkNotNullParameter(name, "name");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6403a;
            if (i >= arrayList.size()) {
                return;
            }
            equals = StringsKt__StringsJVMKt.equals(name, (String) arrayList.get(i), true);
            if (equals) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }
}
