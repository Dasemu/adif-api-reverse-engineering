package R0;

import android.graphics.Bitmap;
import e3.C0333t;
import e3.C0334u;
import e3.O;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import r3.B;
import r3.C;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f1393a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f1394b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1395c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1396d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1397e;

    /* renamed from: f, reason: collision with root package name */
    public final C0334u f1398f;

    public b(C c4) {
        int indexOf$default;
        CharSequence trim;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f1393a = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new a(this, 0));
        this.f1394b = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new a(this, 1));
        this.f1395c = Long.parseLong(c4.a0(LongCompanionObject.MAX_VALUE));
        this.f1396d = Long.parseLong(c4.a0(LongCompanionObject.MAX_VALUE));
        this.f1397e = Integer.parseInt(c4.a0(LongCompanionObject.MAX_VALUE)) > 0;
        int parseInt = Integer.parseInt(c4.a0(LongCompanionObject.MAX_VALUE));
        C0333t c0333t = new C0333t();
        for (int i = 0; i < parseInt; i++) {
            String a02 = c4.a0(LongCompanionObject.MAX_VALUE);
            Bitmap.Config[] configArr = W0.f.f1887a;
            indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) a02, ':', 0, false, 6, (Object) null);
            if (indexOf$default != -1) {
                String substring = a02.substring(0, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                trim = StringsKt__StringsKt.trim((CharSequence) substring);
                String obj = trim.toString();
                String substring2 = a02.substring(indexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                c0333t.c(obj, substring2);
            } else {
                throw new IllegalArgumentException("Unexpected header: ".concat(a02).toString());
            }
        }
        this.f1398f = c0333t.d();
    }

    public final void a(B b4) {
        b4.R(this.f1395c);
        b4.y(10);
        b4.R(this.f1396d);
        b4.y(10);
        b4.R(this.f1397e ? 1L : 0L);
        b4.y(10);
        C0334u c0334u = this.f1398f;
        b4.R(c0334u.size());
        b4.y(10);
        int size = c0334u.size();
        for (int i = 0; i < size; i++) {
            b4.Q(c0334u.b(i));
            b4.Q(": ");
            b4.Q(c0334u.f(i));
            b4.y(10);
        }
    }

    public b(O o4) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f1393a = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new a(this, 0));
        this.f1394b = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new a(this, 1));
        this.f1395c = o4.f6299k;
        this.f1396d = o4.f6300l;
        this.f1397e = o4.f6295e != null;
        this.f1398f = o4.f6296f;
    }
}
