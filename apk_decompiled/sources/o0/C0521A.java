package o0;

import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: o0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0521A {

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f7898m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a, reason: collision with root package name */
    public final String f7899a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7900b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7901c;

    /* renamed from: f, reason: collision with root package name */
    public final String f7904f;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7906j;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7908l;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7902d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f7903e = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Lazy f7905g = LazyKt.lazy(new z(this, 1));

    /* renamed from: k, reason: collision with root package name */
    public final Lazy f7907k = LazyKt.lazy(new z(this, 0));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r17v0, types: [o0.A] */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v20 */
    public C0521A(String str, String str2, String str3) {
        int i;
        List emptyList;
        String replace$default;
        String replace$default2;
        String replace$default3;
        this.f7899a = str;
        this.f7900b = str2;
        this.f7901c = str3;
        int i4 = 0;
        boolean z3 = true;
        if (str != null) {
            Uri parse = Uri.parse(str);
            boolean z4 = parse.getQuery() != null;
            this.h = z4;
            StringBuilder sb = new StringBuilder("^");
            if (!f7898m.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern fillInPattern = Pattern.compile("\\{(.+?)\\}");
            if (z4) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String substring = str.substring(0, matcher.start());
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Intrinsics.checkNotNullExpressionValue(fillInPattern, "fillInPattern");
                    this.f7908l = a(substring, sb, fillInPattern);
                }
                Iterator<String> it = parse.getQueryParameterNames().iterator();
                while (it.hasNext()) {
                    String paramName = it.next();
                    StringBuilder sb2 = new StringBuilder();
                    String queryParam = parse.getQueryParameter(paramName);
                    if (queryParam == null) {
                        this.i = z3;
                        queryParam = paramName;
                    }
                    ?? matcher2 = fillInPattern.matcher(queryParam);
                    C0547y c0547y = new C0547y();
                    int i5 = i4;
                    boolean z5 = z3;
                    while (matcher2.find()) {
                        Iterator<String> it2 = it;
                        String name = matcher2.group(z5);
                        if (name == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        Intrinsics.checkNotNullParameter(name, "name");
                        c0547y.f8076b.add(name);
                        Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                        String substring2 = queryParam.substring(i5, matcher2.start());
                        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(Pattern.quote(substring2));
                        sb2.append("(.+?)?");
                        i5 = matcher2.end();
                        it = it2;
                        z5 = z5;
                    }
                    Iterator<String> it3 = it;
                    boolean z6 = z5;
                    if (i5 < queryParam.length()) {
                        Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                        String substring3 = queryParam.substring(i5);
                        Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
                        sb2.append(Pattern.quote(substring3));
                    }
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "argRegex.toString()");
                    replace$default3 = StringsKt__StringsJVMKt.replace$default(sb3, ".*", "\\E.*\\Q", false, 4, (Object) null);
                    c0547y.f8075a = replace$default3;
                    LinkedHashMap linkedHashMap = this.f7903e;
                    Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
                    linkedHashMap.put(paramName, c0547y);
                    it = it3;
                    z3 = z6;
                    i4 = 0;
                }
                i = z3 ? 1 : 0;
            } else {
                i = 1;
                Intrinsics.checkNotNullExpressionValue(fillInPattern, "fillInPattern");
                this.f7908l = a(str, sb, fillInPattern);
            }
            String sb4 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "uriRegex.toString()");
            replace$default2 = StringsKt__StringsJVMKt.replace$default(sb4, ".*", "\\E.*\\Q", false, 4, (Object) null);
            this.f7904f = replace$default2;
        } else {
            i = 1;
        }
        if (this.f7901c != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f7901c).matches()) {
                throw new IllegalArgumentException(C.w.r(new StringBuilder("The given mimeType "), this.f7901c, " does not match to required \"type/subtype\" format").toString());
            }
            String mimeType = this.f7901c;
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            List<String> split = new Regex(RemoteSettings.FORWARD_SLASH_STRING).split(mimeType, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt.emptyList();
            replace$default = StringsKt__StringsJVMKt.replace$default("^(" + ((String) emptyList.get(0)) + "|[*]+)/(" + ((String) emptyList.get(i)) + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, (Object) null);
            this.f7906j = replace$default;
        }
    }

    public static void b(Bundle bundle, String key, String value, C0533j c0533j) {
        if (c0533j == null) {
            bundle.putString(key, value);
            return;
        }
        T t2 = c0533j.f7996a;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        t2.d(bundle, key, t2.c(value));
    }

    public final boolean a(String str, StringBuilder sb, Pattern pattern) {
        boolean contains$default;
        Matcher matcher = pattern.matcher(str);
        contains$default = StringsKt__StringsKt.contains$default(str, (CharSequence) ".*", false, 2, (Object) null);
        boolean z3 = !contains$default;
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f7902d.add(group);
            String substring = str.substring(i, matcher.start());
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(Pattern.quote(substring));
            sb.append("([^/]+?)");
            i = matcher.end();
            z3 = false;
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(substring2));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z3;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0521A)) {
            C0521A c0521a = (C0521A) obj;
            if (Intrinsics.areEqual(this.f7899a, c0521a.f7899a) && Intrinsics.areEqual(this.f7900b, c0521a.f7900b) && Intrinsics.areEqual(this.f7901c, c0521a.f7901c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7899a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7900b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7901c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
