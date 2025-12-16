package o0;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: b, reason: collision with root package name */
    public static final M f7954b = new M(false, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final M f7955c = new M(false, 8);

    /* renamed from: d, reason: collision with root package name */
    public static final M f7956d = new M(true, 4);

    /* renamed from: e, reason: collision with root package name */
    public static final M f7957e = new M(false, 7);

    /* renamed from: f, reason: collision with root package name */
    public static final M f7958f = new M(true, 6);

    /* renamed from: g, reason: collision with root package name */
    public static final M f7959g = new M(false, 3);
    public static final M h = new M(true, 2);
    public static final M i = new M(false, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final M f7960j = new M(true, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final M f7961k = new M(true, 10);

    /* renamed from: l, reason: collision with root package name */
    public static final M f7962l = new M(true, 9);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7963a;

    public T(boolean z3) {
        this.f7963a = z3;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public abstract Object c(String str);

    public abstract void d(Bundle bundle, String str, Object obj);

    public final String toString() {
        return b();
    }
}
