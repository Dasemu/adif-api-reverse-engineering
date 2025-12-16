package androidx.fragment.app;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    public static final K0 f3046a;

    /* renamed from: b, reason: collision with root package name */
    public static final K0 f3047b;

    /* renamed from: c, reason: collision with root package name */
    public static final K0 f3048c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ K0[] f3049d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.fragment.app.K0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.fragment.app.K0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.fragment.app.K0] */
    static {
        ?? r02 = new Enum("NONE", 0);
        f3046a = r02;
        ?? r12 = new Enum("ADDING", 1);
        f3047b = r12;
        ?? r22 = new Enum("REMOVING", 2);
        f3048c = r22;
        f3049d = new K0[]{r02, r12, r22};
    }

    public static K0 valueOf(String str) {
        return (K0) Enum.valueOf(K0.class, str);
    }

    public static K0[] values() {
        return (K0[]) f3049d.clone();
    }
}
