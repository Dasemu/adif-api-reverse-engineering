package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f8862a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f8863b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f8864c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f8865d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f8866e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g[] f8867f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x0.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x0.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, x0.g] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, x0.g] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, x0.g] */
    static {
        ?? r02 = new Enum("ON_CONFIGURE", 0);
        f8862a = r02;
        ?? r12 = new Enum("ON_CREATE", 1);
        f8863b = r12;
        ?? r22 = new Enum("ON_UPGRADE", 2);
        f8864c = r22;
        ?? r32 = new Enum("ON_DOWNGRADE", 3);
        f8865d = r32;
        ?? r4 = new Enum("ON_OPEN", 4);
        f8866e = r4;
        f8867f = new g[]{r02, r12, r22, r32, r4};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f8867f.clone();
    }
}
