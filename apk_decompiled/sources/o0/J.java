package o0;

import a.AbstractC0105a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f7934c = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final Context f7935a;

    /* renamed from: b, reason: collision with root package name */
    public final W f7936b;

    public J(Context context, W navigatorProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f7935a = context;
        this.f7936b = navigatorProvider;
    }

    public static C0533j c(TypedArray typedArray, Resources resources, int i) {
        T type;
        Object obj;
        boolean z3;
        T t2;
        boolean z4 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = f7934c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i);
            if (string.startsWith("java")) {
                try {
                    type = AbstractC0105a.u("j$" + string.substring(4), resourcePackageName);
                } catch (RuntimeException e4) {
                    if (!(e4.getCause() instanceof ClassNotFoundException)) {
                        throw e4;
                    }
                }
            }
            type = AbstractC0105a.u(string, resourcePackageName);
        } else {
            type = null;
        }
        boolean value = typedArray.getValue(1, typedValue);
        T t4 = T.f7957e;
        M m4 = T.i;
        M m5 = T.f7961k;
        M m6 = T.f7954b;
        M m7 = T.f7959g;
        if (value) {
            M m8 = T.f7955c;
            if (type == m8) {
                int i4 = typedValue.resourceId;
                if (i4 == 0) {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + type.b() + ". Must be a reference to a resource.");
                    }
                    i4 = 0;
                }
                obj = Integer.valueOf(i4);
            } else {
                int i5 = typedValue.resourceId;
                if (i5 != 0) {
                    if (type != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + type.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                    obj = Integer.valueOf(i5);
                    type = m8;
                } else if (type == m5) {
                    obj = typedArray.getString(1);
                } else {
                    int i6 = typedValue.type;
                    if (i6 == 3) {
                        String value2 = typedValue.string.toString();
                        if (type == null) {
                            Intrinsics.checkNotNullParameter(value2, "value");
                            try {
                                try {
                                    try {
                                        try {
                                            m6.c(value2);
                                            type = m6;
                                        } catch (IllegalArgumentException unused) {
                                            m7.c(value2);
                                            type = m7;
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        type = m5;
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    t4.c(value2);
                                    type = t4;
                                }
                            } catch (IllegalArgumentException unused4) {
                                m4.c(value2);
                                type = m4;
                            }
                        }
                        obj = type.c(value2);
                    } else if (i6 == 4) {
                        type = m3.d.h(typedValue, type, m7, string, "float");
                        obj = Float.valueOf(typedValue.getFloat());
                    } else if (i6 == 5) {
                        type = m3.d.h(typedValue, type, m6, string, "dimension");
                        obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i6 == 18) {
                        type = m3.d.h(typedValue, type, m4, string, "boolean");
                        obj = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i6 < 16 || i6 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        if (type == m7) {
                            type = m3.d.h(typedValue, type, m7, string, "float");
                            obj = Float.valueOf(typedValue.data);
                        } else {
                            type = m3.d.h(typedValue, type, m6, string, "integer");
                            obj = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        } else {
            obj = null;
        }
        if (obj != null) {
            z3 = true;
        } else {
            obj = null;
            z3 = false;
        }
        if (type != null) {
            Intrinsics.checkNotNullParameter(type, "type");
            t2 = type;
        } else {
            t2 = null;
        }
        if (t2 == null) {
            if (obj instanceof Integer) {
                t4 = m6;
            } else if (obj instanceof int[]) {
                t4 = T.f7956d;
            } else if (!(obj instanceof Long)) {
                if (obj instanceof long[]) {
                    t4 = T.f7958f;
                } else if (obj instanceof Float) {
                    t4 = m7;
                } else if (obj instanceof float[]) {
                    t4 = T.h;
                } else if (obj instanceof Boolean) {
                    t4 = m4;
                } else if (obj instanceof boolean[]) {
                    t4 = T.f7960j;
                } else if ((obj instanceof String) || obj == null) {
                    t4 = m5;
                } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    t4 = T.f7962l;
                } else {
                    if (obj.getClass().isArray()) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        Intrinsics.checkNotNull(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType2 = obj.getClass().getComponentType();
                            if (componentType2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                            }
                            t4 = new O(componentType2);
                        }
                    }
                    if (obj.getClass().isArray()) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        Intrinsics.checkNotNull(componentType3);
                        if (Serializable.class.isAssignableFrom(componentType3)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            if (componentType4 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            }
                            t4 = new Q(componentType4);
                        }
                    }
                    if (obj instanceof Parcelable) {
                        t4 = new P(obj.getClass());
                    } else if (obj instanceof Enum) {
                        t4 = new N(obj.getClass());
                    } else {
                        if (!(obj instanceof Serializable)) {
                            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        t4 = new S(obj.getClass());
                    }
                }
            }
            t2 = t4;
        }
        return new C0533j(t2, z4, obj, z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0122, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0294, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o0.E a(android.content.res.Resources r30, android.content.res.XmlResourceParser r31, android.util.AttributeSet r32, int r33) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.J.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):o0.E");
    }

    public final H b(int i) {
        int next;
        Resources res = this.f7935a.getResources();
        XmlResourceParser xml = res.getXml(i);
        Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e4) {
                    throw new RuntimeException("Exception inflating " + res.getResourceName(i) + " line " + xml.getLineNumber(), e4);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        Intrinsics.checkNotNullExpressionValue(res, "res");
        Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
        E a2 = a(res, xml, attrs, i);
        if (a2 instanceof H) {
            return (H) a2;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
