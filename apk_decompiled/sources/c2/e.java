package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f4243a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f4244b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f4245c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e[] f4246d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c2.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c2.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, c2.e] */
    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f4243a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f4244b = r12;
        ?? r22 = new Enum("DEVICE_CHARGING", 2);
        f4245c = r22;
        f4246d = new e[]{r02, r12, r22};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f4246d.clone();
    }
}
