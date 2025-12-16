package V1;

/* loaded from: classes3.dex */
public final class i extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1831a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1832b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1833c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1834d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1835e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1836f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1837g;
    public final String h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1838j;

    /* renamed from: k, reason: collision with root package name */
    public final String f1839k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1840l;

    public i(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f1831a = num;
        this.f1832b = str;
        this.f1833c = str2;
        this.f1834d = str3;
        this.f1835e = str4;
        this.f1836f = str5;
        this.f1837g = str6;
        this.h = str7;
        this.i = str8;
        this.f1838j = str9;
        this.f1839k = str10;
        this.f1840l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f1831a;
            if (num != null ? num.equals(((i) aVar).f1831a) : ((i) aVar).f1831a == null) {
                String str = this.f1832b;
                if (str != null ? str.equals(((i) aVar).f1832b) : ((i) aVar).f1832b == null) {
                    String str2 = this.f1833c;
                    if (str2 != null ? str2.equals(((i) aVar).f1833c) : ((i) aVar).f1833c == null) {
                        String str3 = this.f1834d;
                        if (str3 != null ? str3.equals(((i) aVar).f1834d) : ((i) aVar).f1834d == null) {
                            String str4 = this.f1835e;
                            if (str4 != null ? str4.equals(((i) aVar).f1835e) : ((i) aVar).f1835e == null) {
                                String str5 = this.f1836f;
                                if (str5 != null ? str5.equals(((i) aVar).f1836f) : ((i) aVar).f1836f == null) {
                                    String str6 = this.f1837g;
                                    if (str6 != null ? str6.equals(((i) aVar).f1837g) : ((i) aVar).f1837g == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(((i) aVar).h) : ((i) aVar).h == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(((i) aVar).i) : ((i) aVar).i == null) {
                                                String str9 = this.f1838j;
                                                if (str9 != null ? str9.equals(((i) aVar).f1838j) : ((i) aVar).f1838j == null) {
                                                    String str10 = this.f1839k;
                                                    if (str10 != null ? str10.equals(((i) aVar).f1839k) : ((i) aVar).f1839k == null) {
                                                        String str11 = this.f1840l;
                                                        if (str11 != null ? str11.equals(((i) aVar).f1840l) : ((i) aVar).f1840l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f1831a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f1832b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f1833c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1834d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f1835e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f1836f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f1837g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f1838j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f1839k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f1840l;
        return hashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f1831a);
        sb.append(", model=");
        sb.append(this.f1832b);
        sb.append(", hardware=");
        sb.append(this.f1833c);
        sb.append(", device=");
        sb.append(this.f1834d);
        sb.append(", product=");
        sb.append(this.f1835e);
        sb.append(", osBuild=");
        sb.append(this.f1836f);
        sb.append(", manufacturer=");
        sb.append(this.f1837g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.f1838j);
        sb.append(", mccMnc=");
        sb.append(this.f1839k);
        sb.append(", applicationBuild=");
        return C.w.r(sb, this.f1840l, "}");
    }
}
