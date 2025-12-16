package retrofit2;

import e3.C0334u;
import e3.G;
import e3.H;
import e3.I;
import e3.N;
import e3.O;
import e3.T;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.OkHttpCall;

/* loaded from: classes3.dex */
public final class Response<T> {
    private final T body;
    private final T errorBody;
    private final O rawResponse;

    private Response(O o4, T t2, T t4) {
        this.rawResponse = o4;
        this.body = t2;
        this.errorBody = t4;
    }

    public static <T> Response<T> error(int i, T t2) {
        Objects.requireNonNull(t2, "body == null");
        if (i >= 400) {
            ArrayList arrayList = new ArrayList(20);
            OkHttpCall.NoContentResponseBody noContentResponseBody = new OkHttpCall.NoContentResponseBody(t2.contentType(), t2.contentLength());
            Intrinsics.checkNotNullParameter("Response.error()", "message");
            G protocol = G.HTTP_1_1;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            H h = new H();
            h.g("http://localhost/");
            I request = h.a();
            Intrinsics.checkNotNullParameter(request, "request");
            if (i >= 0) {
                return error(t2, new O(request, protocol, "Response.error()", i, null, new C0334u((String[]) arrayList.toArray(new String[0])), noContentResponseBody, null, null, null, 0L, 0L, null));
            }
            throw new IllegalStateException(com.google.android.gms.measurement.internal.a.l(i, "code < 0: ").toString());
        }
        throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "code < 400: "));
    }

    public static <T> Response<T> success(T t2, C0334u c0334u) {
        Objects.requireNonNull(c0334u, "headers == null");
        N n4 = new N();
        n4.f6282c = 200;
        Intrinsics.checkNotNullParameter("OK", "message");
        n4.f6283d = "OK";
        G protocol = G.HTTP_1_1;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        n4.f6281b = protocol;
        n4.c(c0334u);
        H h = new H();
        h.g("http://localhost/");
        I request = h.a();
        Intrinsics.checkNotNullParameter(request, "request");
        n4.f6280a = request;
        return success(t2, n4.a());
    }

    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.f6294d;
    }

    public T errorBody() {
        return this.errorBody;
    }

    public C0334u headers() {
        return this.rawResponse.f6296f;
    }

    public boolean isSuccessful() {
        return this.rawResponse.e();
    }

    public String message() {
        return this.rawResponse.f6293c;
    }

    public O raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    public static <T> Response<T> success(T t2, O o4) {
        Objects.requireNonNull(o4, "rawResponse == null");
        if (o4.e()) {
            return new Response<>(o4, t2, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public static <T> Response<T> success(int i, T t2) {
        if (i >= 200 && i < 300) {
            ArrayList arrayList = new ArrayList(20);
            Intrinsics.checkNotNullParameter("Response.success()", "message");
            G protocol = G.HTTP_1_1;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            H h = new H();
            h.g("http://localhost/");
            I request = h.a();
            Intrinsics.checkNotNullParameter(request, "request");
            if (i >= 0) {
                return success(t2, new O(request, protocol, "Response.success()", i, null, new C0334u((String[]) arrayList.toArray(new String[0])), null, null, null, null, 0L, 0L, null));
            }
            throw new IllegalStateException(com.google.android.gms.measurement.internal.a.l(i, "code < 0: ").toString());
        }
        throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "code < 200 or >= 300: "));
    }

    public static <T> Response<T> error(T t2, O o4) {
        Objects.requireNonNull(t2, "body == null");
        Objects.requireNonNull(o4, "rawResponse == null");
        if (!o4.e()) {
            return new Response<>(o4, null, t2);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> Response<T> success(T t2) {
        ArrayList arrayList = new ArrayList(20);
        Intrinsics.checkNotNullParameter("OK", "message");
        G protocol = G.HTTP_1_1;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        H h = new H();
        h.g("http://localhost/");
        I request = h.a();
        Intrinsics.checkNotNullParameter(request, "request");
        return success(t2, new O(request, protocol, "OK", 200, null, new C0334u((String[]) arrayList.toArray(new String[0])), null, null, null, null, 0L, 0L, null));
    }
}
