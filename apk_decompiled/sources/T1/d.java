package T1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1658a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f1659b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f1660c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f1661d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, T1.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, T1.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, T1.d] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f1658a = r02;
        ?? r12 = new Enum("VERY_LOW", 1);
        f1659b = r12;
        ?? r22 = new Enum("HIGHEST", 2);
        f1660c = r22;
        f1661d = new d[]{r02, r12, r22};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f1661d.clone();
    }
}
