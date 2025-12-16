package U1;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import m3.l;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f1776c = l.J("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d, reason: collision with root package name */
    public static final Set f1777d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f1778e;

    /* renamed from: a, reason: collision with root package name */
    public final String f1779a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1780b;

    static {
        String J = l.J("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String J3 = l.J("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f1777d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new T1.c("proto"), new T1.c("json"))));
        f1778e = new a(J, J3);
    }

    public a(String str, String str2) {
        this.f1779a = str;
        this.f1780b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
