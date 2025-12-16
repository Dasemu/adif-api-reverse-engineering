package R0;

import android.graphics.Bitmap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e3.C0334u;
import e3.I;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final I f1399a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1400b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f1401c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1402d;

    /* renamed from: e, reason: collision with root package name */
    public final Date f1403e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1404f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f1405g;
    public final long h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1406j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1407k;

    public c(I i, b bVar) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean equals4;
        boolean equals5;
        int i4;
        this.f1399a = i;
        this.f1400b = bVar;
        this.f1407k = -1;
        if (bVar != null) {
            this.h = bVar.f1395c;
            this.i = bVar.f1396d;
            C0334u c0334u = bVar.f1398f;
            int size = c0334u.size();
            for (int i5 = 0; i5 < size; i5++) {
                String b4 = c0334u.b(i5);
                equals = StringsKt__StringsJVMKt.equals(b4, "Date", true);
                Date date = null;
                if (equals) {
                    Intrinsics.checkNotNullParameter("Date", AppMeasurementSdk.ConditionalUserProperty.NAME);
                    String a2 = c0334u.a("Date");
                    if (a2 != null) {
                        j3.c cVar = j3.d.f6945a;
                        Intrinsics.checkNotNullParameter(a2, "<this>");
                        if (a2.length() != 0) {
                            ParsePosition parsePosition = new ParsePosition(0);
                            Date parse = ((DateFormat) j3.d.f6945a.get()).parse(a2, parsePosition);
                            if (parsePosition.getIndex() == a2.length()) {
                                date = parse;
                            } else {
                                String[] strArr = j3.d.f6946b;
                                synchronized (strArr) {
                                    try {
                                        int length = strArr.length;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= length) {
                                                Unit unit = Unit.INSTANCE;
                                                break;
                                            }
                                            DateFormat[] dateFormatArr = j3.d.f6947c;
                                            DateFormat dateFormat = dateFormatArr[i6];
                                            if (dateFormat == null) {
                                                dateFormat = new SimpleDateFormat(j3.d.f6946b[i6], Locale.US);
                                                dateFormat.setTimeZone(f3.c.f6473e);
                                                dateFormatArr[i6] = dateFormat;
                                            }
                                            parsePosition.setIndex(0);
                                            Date parse2 = dateFormat.parse(a2, parsePosition);
                                            if (parsePosition.getIndex() != 0) {
                                                date = parse2;
                                                break;
                                            }
                                            i6++;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                    this.f1401c = date;
                    this.f1402d = c0334u.f(i5);
                } else {
                    equals2 = StringsKt__StringsJVMKt.equals(b4, "Expires", true);
                    if (equals2) {
                        Intrinsics.checkNotNullParameter("Expires", AppMeasurementSdk.ConditionalUserProperty.NAME);
                        String a4 = c0334u.a("Expires");
                        if (a4 != null) {
                            j3.c cVar2 = j3.d.f6945a;
                            Intrinsics.checkNotNullParameter(a4, "<this>");
                            if (a4.length() != 0) {
                                ParsePosition parsePosition2 = new ParsePosition(0);
                                Date parse3 = ((DateFormat) j3.d.f6945a.get()).parse(a4, parsePosition2);
                                if (parsePosition2.getIndex() == a4.length()) {
                                    date = parse3;
                                } else {
                                    String[] strArr2 = j3.d.f6946b;
                                    synchronized (strArr2) {
                                        try {
                                            int length2 = strArr2.length;
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 >= length2) {
                                                    Unit unit2 = Unit.INSTANCE;
                                                    break;
                                                }
                                                DateFormat[] dateFormatArr2 = j3.d.f6947c;
                                                DateFormat dateFormat2 = dateFormatArr2[i7];
                                                if (dateFormat2 == null) {
                                                    dateFormat2 = new SimpleDateFormat(j3.d.f6946b[i7], Locale.US);
                                                    dateFormat2.setTimeZone(f3.c.f6473e);
                                                    dateFormatArr2[i7] = dateFormat2;
                                                }
                                                parsePosition2.setIndex(0);
                                                Date parse4 = dateFormat2.parse(a4, parsePosition2);
                                                if (parsePosition2.getIndex() != 0) {
                                                    date = parse4;
                                                    break;
                                                }
                                                i7++;
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        }
                        this.f1405g = date;
                    } else {
                        equals3 = StringsKt__StringsJVMKt.equals(b4, "Last-Modified", true);
                        if (equals3) {
                            Intrinsics.checkNotNullParameter("Last-Modified", AppMeasurementSdk.ConditionalUserProperty.NAME);
                            String a5 = c0334u.a("Last-Modified");
                            if (a5 != null) {
                                j3.c cVar3 = j3.d.f6945a;
                                Intrinsics.checkNotNullParameter(a5, "<this>");
                                if (a5.length() != 0) {
                                    ParsePosition parsePosition3 = new ParsePosition(0);
                                    Date parse5 = ((DateFormat) j3.d.f6945a.get()).parse(a5, parsePosition3);
                                    if (parsePosition3.getIndex() == a5.length()) {
                                        date = parse5;
                                    } else {
                                        String[] strArr3 = j3.d.f6946b;
                                        synchronized (strArr3) {
                                            try {
                                                int length3 = strArr3.length;
                                                int i8 = 0;
                                                while (true) {
                                                    if (i8 >= length3) {
                                                        Unit unit3 = Unit.INSTANCE;
                                                        break;
                                                    }
                                                    DateFormat[] dateFormatArr3 = j3.d.f6947c;
                                                    DateFormat dateFormat3 = dateFormatArr3[i8];
                                                    if (dateFormat3 == null) {
                                                        dateFormat3 = new SimpleDateFormat(j3.d.f6946b[i8], Locale.US);
                                                        dateFormat3.setTimeZone(f3.c.f6473e);
                                                        dateFormatArr3[i8] = dateFormat3;
                                                    }
                                                    parsePosition3.setIndex(0);
                                                    Date parse6 = dateFormat3.parse(a5, parsePosition3);
                                                    if (parsePosition3.getIndex() != 0) {
                                                        date = parse6;
                                                        break;
                                                    }
                                                    i8++;
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                            this.f1403e = date;
                            this.f1404f = c0334u.f(i5);
                        } else {
                            equals4 = StringsKt__StringsJVMKt.equals(b4, "ETag", true);
                            if (equals4) {
                                this.f1406j = c0334u.f(i5);
                            } else {
                                equals5 = StringsKt__StringsJVMKt.equals(b4, "Age", true);
                                if (equals5) {
                                    String f2 = c0334u.f(i5);
                                    Bitmap.Config[] configArr = W0.f.f1887a;
                                    Long longOrNull = StringsKt.toLongOrNull(f2);
                                    if (longOrNull != null) {
                                        long longValue = longOrNull.longValue();
                                        i4 = longValue > 2147483647L ? Integer.MAX_VALUE : longValue < 0 ? 0 : (int) longValue;
                                    } else {
                                        i4 = -1;
                                    }
                                    this.f1407k = i4;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        if (r4 > 0) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final R0.d a() {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.c.a():R0.d");
    }
}
