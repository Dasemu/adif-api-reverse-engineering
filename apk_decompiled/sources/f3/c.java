package f3;

import a.AbstractC0105a;
import a.AbstractC0106b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e3.C0334u;
import e3.F;
import e3.L;
import e3.M;
import e3.O;
import e3.Q;
import e3.S;
import e3.T;
import e3.w;
import f0.C0338b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import l3.C0440c;
import r3.C0579k;
import r3.I;
import r3.InterfaceC0578j;
import r3.x;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f6469a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0334u f6470b = AbstractC0105a.I(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final Q f6471c;

    /* renamed from: d, reason: collision with root package name */
    public static final x f6472d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f6473e;

    /* renamed from: f, reason: collision with root package name */
    public static final Regex f6474f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f6475g;

    static {
        byte[] bArr = new byte[0];
        f6469a = bArr;
        T.Companion.getClass();
        f6471c = S.c(bArr, null);
        L.c(M.Companion, bArr, null, 0, 7);
        int i = x.f8316c;
        C0579k c0579k = C0579k.f8285d;
        f6472d = AbstractC0106b.w(C0338b.m("efbbbf"), C0338b.m("feff"), C0338b.m("fffe"), C0338b.m("0000ffff"), C0338b.m("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f6473e = timeZone;
        f6474f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = F.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f6475g = StringsKt.t(StringsKt.s(name, "okhttp3."), "Client");
    }

    public static final boolean a(w wVar, w other) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(wVar.f6416d, other.f6416d) && wVar.f6417e == other.f6417e && Intrinsics.areEqual(wVar.f6413a, other.f6413a);
    }

    public static final int b(long j4) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter("timeout", AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (j4 < 0) {
            throw new IllegalStateException("timeout < 0".toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j4);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.".toString());
        }
        if (millis != 0 || j4 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small.".toString());
    }

    public static final void c(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e5) {
            if (!Intrinsics.areEqual(e5.getMessage(), "bio == null")) {
                throw e5;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(String str, char c4, int i, int i4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i4) {
            if (str.charAt(i) == c4) {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static final int f(String str, int i, int i4, String delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i < i4) {
            if (StringsKt.d(delimiters, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static final boolean g(I i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(i, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return t(i, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format2, "format(locale, format, *args)");
        return format2;
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator it = ArrayIteratorKt.iterator(strArr2);
                while (it.hasNext()) {
                    if (comparator.compare(str, (String) it.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(O o4) {
        Intrinsics.checkNotNullParameter(o4, "<this>");
        String a2 = o4.f6296f.a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        Intrinsics.checkNotNullParameter(a2, "<this>");
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List unmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int l(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Intrinsics.compare((int) charAt, 31) <= 0 || Intrinsics.compare((int) charAt, WorkQueueKt.MASK) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(String str, int i, int i4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i4) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static final int n(String str, int i, int i4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i5 = i4 - 1;
        if (i <= i5) {
            while (true) {
                char charAt = str.charAt(i5);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i5 + 1;
                }
                if (i5 == i) {
                    break;
                }
                i5--;
            }
        }
        return i;
    }

    public static final String[] o(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, other[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.j(name, "Authorization") || StringsKt.j(name, "Cookie") || StringsKt.j(name, "Proxy-Authorization") || StringsKt.j(name, "Set-Cookie");
    }

    public static final int q(char c4) {
        if ('0' <= c4 && c4 < ':') {
            return c4 - '0';
        }
        if ('a' <= c4 && c4 < 'g') {
            return c4 - 'W';
        }
        if ('A' > c4 || c4 >= 'G') {
            return -1;
        }
        return c4 - '7';
    }

    public static final Charset r(InterfaceC0578j interfaceC0578j, Charset charset) {
        Intrinsics.checkNotNullParameter(interfaceC0578j, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int C3 = interfaceC0578j.C(f6472d);
        if (C3 == -1) {
            return charset;
        }
        if (C3 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (C3 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (C3 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (C3 == 3) {
            return Charsets.INSTANCE.UTF32_BE();
        }
        if (C3 == 4) {
            return Charsets.INSTANCE.UTF32_LE();
        }
        throw new AssertionError();
    }

    public static final int s(InterfaceC0578j interfaceC0578j) {
        Intrinsics.checkNotNullParameter(interfaceC0578j, "<this>");
        return (interfaceC0578j.readByte() & UByte.MAX_VALUE) | ((interfaceC0578j.readByte() & UByte.MAX_VALUE) << 16) | ((interfaceC0578j.readByte() & UByte.MAX_VALUE) << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, r3.h] */
    public static final boolean t(I i, int i4) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(i, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c4 = i.timeout().e() ? i.timeout().c() - nanoTime : Long.MAX_VALUE;
        i.timeout().d(Math.min(c4, timeUnit.toNanos(i4)) + nanoTime);
        try {
            ?? obj = new Object();
            while (i.read(obj, 8192L) != -1) {
                obj.d();
            }
            if (c4 == LongCompanionObject.MAX_VALUE) {
                i.timeout().a();
                return true;
            }
            i.timeout().d(nanoTime + c4);
            return true;
        } catch (InterruptedIOException unused) {
            if (c4 == LongCompanionObject.MAX_VALUE) {
                i.timeout().a();
                return false;
            }
            i.timeout().d(nanoTime + c4);
            return false;
        } catch (Throwable th) {
            if (c4 == LongCompanionObject.MAX_VALUE) {
                i.timeout().a();
            } else {
                i.timeout().d(nanoTime + c4);
            }
            throw th;
        }
    }

    public static final C0334u u(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0440c c0440c = (C0440c) it.next();
            String name = c0440c.f7384a.q();
            String value = c0440c.f7385b.q();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(name);
            arrayList.add(StringsKt.P(value).toString());
        }
        return new C0334u((String[]) arrayList.toArray(new String[0]));
    }

    public static final String v(w wVar, boolean z3) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        boolean e4 = StringsKt.e(wVar.f6416d, ":");
        String str = wVar.f6416d;
        if (e4) {
            str = "[" + str + ']';
        }
        int i = wVar.f6417e;
        if (!z3) {
            String scheme = wVar.f6413a;
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (i == (Intrinsics.areEqual(scheme, "http") ? 80 : Intrinsics.areEqual(scheme, "https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List w(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int x(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String y(String str, int i, int i4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int m4 = m(str, i, i4);
        String substring = str.substring(m4, n(str, m4, i4));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
