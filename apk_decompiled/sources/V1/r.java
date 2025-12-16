package V1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1866a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ r[] f1867b;

    /* JADX INFO: Fake field, exist only in values array */
    r EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, V1.r] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, V1.r] */
    static {
        ?? r02 = new Enum("UNKNOWN", 0);
        ?? r12 = new Enum("ANDROID_FIREBASE", 1);
        f1866a = r12;
        f1867b = new r[]{r02, r12};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f1867b.clone();
    }
}
