package U1;

import C.w;
import X1.h;
import android.content.Context;
import android.net.ConnectivityManager;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import f0.C0338b;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes3.dex */
public final class c implements h {

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f1785b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1786c;

    /* renamed from: e, reason: collision with root package name */
    public final C0338b f1788e;

    /* renamed from: f, reason: collision with root package name */
    public final C0338b f1789f;

    /* renamed from: a, reason: collision with root package name */
    public final DataEncoder f1784a = new JsonDataEncoderBuilder().configureWith(V1.h.f1830a).ignoreNullValues(true).build();

    /* renamed from: d, reason: collision with root package name */
    public final URL f1787d = b(a.f1776c);

    /* renamed from: g, reason: collision with root package name */
    public final int f1790g = 130000;

    public c(Context context, C0338b c0338b, C0338b c0338b2) {
        this.f1786c = context;
        this.f1785b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f1788e = c0338b2;
        this.f1789f = c0338b;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e4) {
            throw new IllegalArgumentException(w.z("Invalid url: ", str), e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((V1.v) V1.v.f1868a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final W1.i a(W1.i r7) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.c.a(W1.i):W1.i");
    }
}
