package e3;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: e3.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0327m {
    public static int a(String str, int i, int i4, boolean z3) {
        while (i < i4) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z3)) {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static long b(int i, String str) {
        int indexOf$default;
        int a2 = a(str, 0, i, false);
        Matcher matcher = C0328n.f6379m.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (a2 < i) {
            int a4 = a(str, a2 + 1, i, true);
            matcher.region(a2, a4);
            if (i5 == -1 && matcher.usePattern(C0328n.f6379m).matches()) {
                String group = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group, "matcher.group(1)");
                i5 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                Intrinsics.checkNotNullExpressionValue(group2, "matcher.group(2)");
                i8 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                Intrinsics.checkNotNullExpressionValue(group3, "matcher.group(3)");
                i9 = Integer.parseInt(group3);
            } else if (i6 == -1 && matcher.usePattern(C0328n.f6378l).matches()) {
                String group4 = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group4, "matcher.group(1)");
                i6 = Integer.parseInt(group4);
            } else {
                if (i7 == -1) {
                    Pattern pattern = C0328n.f6377k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(group5, "matcher.group(1)");
                        Locale US = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(US, "US");
                        String lowerCase = group5.toLowerCase(US);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        Intrinsics.checkNotNullExpressionValue(pattern2, "MONTH_PATTERN.pattern()");
                        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) pattern2, lowerCase, 0, false, 6, (Object) null);
                        i7 = indexOf$default / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(C0328n.f6376j).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group6, "matcher.group(1)");
                    i4 = Integer.parseInt(group6);
                }
            }
            a2 = a(str, a4 + 1, i, false);
        }
        if (70 <= i4 && i4 < 100) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 < 70) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i6 || i6 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i5 < 0 || i5 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 < 0 || i8 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i9 < 0 || i9 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f3.c.f6473e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i7 - 1);
        gregorianCalendar.set(5, i6);
        gregorianCalendar.set(11, i5);
        gregorianCalendar.set(12, i8);
        gregorianCalendar.set(13, i9);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }
}
