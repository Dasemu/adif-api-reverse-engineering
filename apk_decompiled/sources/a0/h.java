package a0;

import androidx.datastore.preferences.protobuf.AbstractC0110b;
import androidx.datastore.preferences.protobuf.AbstractC0128t;
import androidx.datastore.preferences.protobuf.AbstractC0130v;
import androidx.datastore.preferences.protobuf.AbstractC0133y;
import androidx.datastore.preferences.protobuf.C0109a0;
import androidx.datastore.preferences.protobuf.C0116g;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.InterfaceC0132x;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.Z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import u.AbstractC0629f;

/* loaded from: classes.dex */
public final class h extends AbstractC0130v {
    private static final h DEFAULT_INSTANCE;
    private static volatile W PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0132x strings_ = Z.f2884d;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0130v.h(h.class, hVar);
    }

    public static void i(h hVar, Set set) {
        InterfaceC0132x interfaceC0132x = hVar.strings_;
        if (!((AbstractC0110b) interfaceC0132x).f2891a) {
            int size = interfaceC0132x.size();
            hVar.strings_ = interfaceC0132x.d(size == 0 ? 10 : size * 2);
        }
        List list = hVar.strings_;
        Charset charset = AbstractC0133y.f2975a;
        set.getClass();
        if (!(set instanceof D)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(set.size() + list.size());
            }
            int size2 = list.size();
            for (Object obj : set) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size2) + " is null.";
                    for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                        list.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
            return;
        }
        List underlyingElements = ((D) set).getUnderlyingElements();
        D d4 = (D) list;
        int size4 = list.size();
        for (Object obj2 : underlyingElements) {
            if (obj2 == null) {
                String str2 = "Element at index " + (d4.size() - size4) + " is null.";
                for (int size5 = d4.size() - 1; size5 >= size4; size5--) {
                    d4.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            if (obj2 instanceof C0116g) {
                d4.e((C0116g) obj2);
            } else {
                d4.add((String) obj2);
            }
        }
    }

    public static h j() {
        return DEFAULT_INSTANCE;
    }

    public static g l() {
        return (g) ((AbstractC0128t) DEFAULT_INSTANCE.d(5));
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
                return new C0109a0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new h();
            case 4:
                return new AbstractC0128t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                W w4 = PARSER;
                if (w4 != null) {
                    return w4;
                }
                synchronized (h.class) {
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

    public final InterfaceC0132x k() {
        return this.strings_;
    }
}
