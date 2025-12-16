package a0;

import Z2.y;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0128t;
import androidx.datastore.preferences.protobuf.AbstractC0130v;
import androidx.datastore.preferences.protobuf.AbstractC0133y;
import androidx.datastore.preferences.protobuf.C0109a0;
import androidx.datastore.preferences.protobuf.C0117h;
import androidx.datastore.preferences.protobuf.C0122m;
import androidx.datastore.preferences.protobuf.InterfaceC0111b0;
import androidx.datastore.preferences.protobuf.M;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.Y;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;
import u.AbstractC0629f;

/* loaded from: classes.dex */
public final class f extends AbstractC0130v {
    private static final f DEFAULT_INSTANCE;
    private static volatile W PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private M preferences_ = M.f2857b;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0130v.h(f.class, fVar);
    }

    public static M i(f fVar) {
        M m4 = fVar.preferences_;
        if (!m4.f2858a) {
            fVar.preferences_ = m4.b();
        }
        return fVar.preferences_;
    }

    public static d k() {
        return (d) ((AbstractC0128t) DEFAULT_INSTANCE.d(5));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, Z2.y] */
    public static f l(FileInputStream fileInputStream) {
        y yVar;
        f fVar = DEFAULT_INSTANCE;
        C0117h c0117h = new C0117h(fileInputStream);
        C0122m a2 = C0122m.a();
        AbstractC0130v abstractC0130v = (AbstractC0130v) fVar.d(4);
        try {
            Y y3 = Y.f2881c;
            y3.getClass();
            InterfaceC0111b0 a4 = y3.a(abstractC0130v.getClass());
            y yVar2 = c0117h.f2917b;
            if (yVar2 != null) {
                yVar = yVar2;
            } else {
                ?? obj = new Object();
                obj.f2313c = 0;
                Charset charset = AbstractC0133y.f2975a;
                obj.f2314d = c0117h;
                c0117h.f2917b = obj;
                yVar = obj;
            }
            a4.c(abstractC0130v, yVar, a2);
            a4.d(abstractC0130v);
            if (abstractC0130v.g()) {
                return (f) abstractC0130v;
            }
            throw new IOException(new Q2.j().getMessage());
        } catch (IOException e4) {
            if (e4.getCause() instanceof A) {
                throw ((A) e4.getCause());
            }
            throw new IOException(e4.getMessage());
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof A) {
                throw ((A) e5.getCause());
            }
            throw e5;
        }
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, androidx.datastore.preferences.protobuf.W] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0130v
    public final Object d(int i) {
        W w3;
        switch (AbstractC0629f.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0109a0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f2328a});
            case 3:
                return new f();
            case 4:
                return new AbstractC0128t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                W w4 = PARSER;
                if (w4 != null) {
                    return w4;
                }
                synchronized (f.class) {
                    try {
                        W w5 = PARSER;
                        w3 = w5;
                        if (w5 == null) {
                            ?? obj = new Object();
                            PARSER = obj;
                            w3 = obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return w3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map j() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
