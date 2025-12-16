package retrofit2;

import e3.A;
import e3.B;
import e3.C;
import e3.C0329o;
import e3.C0331q;
import e3.C0333t;
import e3.C0334u;
import e3.C0335v;
import e3.D;
import e3.H;
import e3.M;
import e3.r;
import e3.w;
import e3.z;
import f3.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;
import r3.InterfaceC0577i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RequestBuilder {
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private final w baseUrl;
    private M body;
    private A contentType;
    private C0331q formBuilder;
    private final boolean hasBody;
    private final C0333t headersBuilder;
    private final String method;
    private B multipartBuilder;
    private String relativeUrl;
    private final H requestBuilder = new H();
    private C0335v urlBuilder;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* loaded from: classes3.dex */
    public static class ContentTypeOverridingRequestBody extends M {
        private final A contentType;
        private final M delegate;

        public ContentTypeOverridingRequestBody(M m4, A a2) {
            this.delegate = m4;
            this.contentType = a2;
        }

        @Override // e3.M
        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        @Override // e3.M
        public A contentType() {
            return this.contentType;
        }

        @Override // e3.M
        public void writeTo(InterfaceC0577i interfaceC0577i) throws IOException {
            this.delegate.writeTo(interfaceC0577i);
        }
    }

    public RequestBuilder(String str, w wVar, String str2, C0334u c0334u, A a2, boolean z3, boolean z4, boolean z5) {
        this.method = str;
        this.baseUrl = wVar;
        this.relativeUrl = str2;
        this.contentType = a2;
        this.hasBody = z3;
        if (c0334u != null) {
            this.headersBuilder = c0334u.c();
        } else {
            this.headersBuilder = new C0333t();
        }
        if (z4) {
            this.formBuilder = new C0331q();
            return;
        }
        if (z5) {
            B b4 = new B();
            this.multipartBuilder = b4;
            A type = D.f6208f;
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type.f6200b, "multipart")) {
                b4.f6203b = type;
            } else {
                throw new IllegalArgumentException(("multipart != " + type).toString());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, r3.h] */
    private static String canonicalizeForPath(String str, boolean z3) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) == -1 && (z3 || (codePointAt != 47 && codePointAt != 37))) {
                i += Character.charCount(codePointAt);
            } else {
                ?? obj = new Object();
                obj.p0(str, 0, i);
                canonicalizeForPath(obj, str, i, length, z3);
                return obj.e0();
            }
        }
        return str;
    }

    public void addFormField(String name, String value, boolean z3) {
        if (z3) {
            C0331q c0331q = this.formBuilder;
            c0331q.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            c0331q.f6394a.add(C0329o.b(0, 0, 83, name, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
            c0331q.f6395b.add(C0329o.b(0, 0, 83, value, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
            return;
        }
        C0331q c0331q2 = this.formBuilder;
        c0331q2.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        c0331q2.f6394a.add(C0329o.b(0, 0, 91, name, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
        c0331q2.f6395b.add(C0329o.b(0, 0, 91, value, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
    }

    public void addHeader(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.headersBuilder.a(str, str2);
            return;
        }
        try {
            Pattern pattern = A.f6197d;
            this.contentType = z.a(str2);
        } catch (IllegalArgumentException e4) {
            throw new IllegalArgumentException(C.w.z("Malformed content type: ", str2), e4);
        }
    }

    public void addHeaders(C0334u headers) {
        C0333t c0333t = this.headersBuilder;
        c0333t.getClass();
        Intrinsics.checkNotNullParameter(headers, "headers");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            c0333t.b(headers.b(i), headers.f(i));
        }
    }

    public void addPart(C0334u c0334u, M body) {
        B b4 = this.multipartBuilder;
        b4.getClass();
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(body, "body");
        if ((c0334u != null ? c0334u.a("Content-Type") : null) == null) {
            if ((c0334u != null ? c0334u.a("Content-Length") : null) == null) {
                C part = new C(c0334u, body);
                Intrinsics.checkNotNullParameter(part, "part");
                b4.f6204c.add(part);
                return;
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        throw new IllegalArgumentException("Unexpected header: Content-Type");
    }

    public void addPathParam(String str, String str2, boolean z3) {
        if (this.relativeUrl == null) {
            throw new AssertionError();
        }
        String canonicalizeForPath = canonicalizeForPath(str2, z3);
        String replace = this.relativeUrl.replace("{" + str + "}", canonicalizeForPath);
        if (PATH_TRAVERSAL.matcher(replace).matches()) {
            throw new IllegalArgumentException(C.w.z("@Path parameters shouldn't perform path traversal ('.' or '..'): ", str2));
        }
        this.relativeUrl = replace;
    }

    public void addQueryParam(String name, String str, boolean z3) {
        String str2 = this.relativeUrl;
        if (str2 != null) {
            C0335v f2 = this.baseUrl.f(str2);
            this.urlBuilder = f2;
            if (f2 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
            this.relativeUrl = null;
        }
        if (z3) {
            C0335v c0335v = this.urlBuilder;
            c0335v.getClass();
            Intrinsics.checkNotNullParameter(name, "encodedName");
            if (c0335v.f6411g == null) {
                c0335v.f6411g = new ArrayList();
            }
            ArrayList arrayList = c0335v.f6411g;
            Intrinsics.checkNotNull(arrayList);
            arrayList.add(C0329o.b(0, 0, 211, name, " \"'<>#&="));
            ArrayList arrayList2 = c0335v.f6411g;
            Intrinsics.checkNotNull(arrayList2);
            arrayList2.add(str != null ? C0329o.b(0, 0, 211, str, " \"'<>#&=") : null);
            return;
        }
        C0335v c0335v2 = this.urlBuilder;
        c0335v2.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        if (c0335v2.f6411g == null) {
            c0335v2.f6411g = new ArrayList();
        }
        ArrayList arrayList3 = c0335v2.f6411g;
        Intrinsics.checkNotNull(arrayList3);
        arrayList3.add(C0329o.b(0, 0, 219, name, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        ArrayList arrayList4 = c0335v2.f6411g;
        Intrinsics.checkNotNull(arrayList4);
        arrayList4.add(str != null ? C0329o.b(0, 0, 219, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }

    public <T> void addTag(Class<T> cls, T t2) {
        this.requestBuilder.f(cls, t2);
    }

    public H get() {
        w url;
        C0335v c0335v = this.urlBuilder;
        if (c0335v != null) {
            url = c0335v.a();
        } else {
            w wVar = this.baseUrl;
            String link = this.relativeUrl;
            wVar.getClass();
            Intrinsics.checkNotNullParameter(link, "link");
            C0335v f2 = wVar.f(link);
            url = f2 != null ? f2.a() : null;
            if (url == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        M m4 = this.body;
        if (m4 == null) {
            C0331q c0331q = this.formBuilder;
            if (c0331q != null) {
                m4 = new r(c0331q.f6394a, c0331q.f6395b);
            } else {
                B b4 = this.multipartBuilder;
                if (b4 != null) {
                    ArrayList arrayList = b4.f6204c;
                    if (arrayList.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    m4 = new D(b4.f6202a, b4.f6203b, c.w(arrayList));
                } else if (this.hasBody) {
                    m4 = M.create((A) null, new byte[0]);
                }
            }
        }
        A a2 = this.contentType;
        if (a2 != null) {
            if (m4 != null) {
                m4 = new ContentTypeOverridingRequestBody(m4, a2);
            } else {
                this.headersBuilder.a("Content-Type", a2.f6199a);
            }
        }
        H h = this.requestBuilder;
        h.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        h.f6262a = url;
        C0334u headers = this.headersBuilder.d();
        Intrinsics.checkNotNullParameter(headers, "headers");
        h.f6264c = headers.c();
        h.d(this.method, m4);
        return h;
    }

    public void setBody(M m4) {
        this.body = m4;
    }

    public void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [r3.h] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    private static void canonicalizeForPath(C0576h c0576h, String str, int i, int i4, boolean z3) {
        ?? r02 = 0;
        while (i < i4) {
            int codePointAt = str.codePointAt(i);
            if (!z3 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt >= 32 && codePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) == -1 && (z3 || (codePointAt != 47 && codePointAt != 37))) {
                    c0576h.q0(codePointAt);
                } else {
                    if (r02 == 0) {
                        r02 = new Object();
                    }
                    r02.q0(codePointAt);
                    while (!r02.x()) {
                        byte readByte = r02.readByte();
                        int i5 = readByte & UByte.MAX_VALUE;
                        c0576h.j0(37);
                        char[] cArr = HEX_DIGITS;
                        c0576h.j0(cArr[(i5 >> 4) & 15]);
                        c0576h.j0(cArr[readByte & 15]);
                    }
                }
            }
            i += Character.charCount(codePointAt);
            r02 = r02;
        }
    }

    public void addPart(C part) {
        B b4 = this.multipartBuilder;
        b4.getClass();
        Intrinsics.checkNotNullParameter(part, "part");
        b4.f6204c.add(part);
    }
}
