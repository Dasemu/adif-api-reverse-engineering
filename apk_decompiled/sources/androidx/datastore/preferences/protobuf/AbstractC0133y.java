package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0133y {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2975a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f2976b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2976b = bArr;
        ByteBuffer.wrap(bArr);
        if (0 + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw A.f();
        } catch (A e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    public static AbstractC0130v c(Object obj, Object obj2) {
        AbstractC0130v abstractC0130v = (AbstractC0130v) ((AbstractC0108a) obj);
        AbstractC0128t abstractC0128t = (AbstractC0128t) abstractC0130v.d(5);
        abstractC0128t.c();
        AbstractC0128t.d(abstractC0128t.f2971b, abstractC0130v);
        AbstractC0108a abstractC0108a = (AbstractC0108a) obj2;
        if (!abstractC0128t.f2970a.getClass().isInstance(abstractC0108a)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        abstractC0128t.c();
        AbstractC0128t.d(abstractC0128t.f2971b, (AbstractC0130v) abstractC0108a);
        return abstractC0128t.b();
    }
}
