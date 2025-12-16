package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f4005a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f4006b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ t[] f4007c;

    /* JADX INFO: Fake field, exist only in values array */
    t EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.room.t] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.room.t] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.room.t] */
    static {
        ?? r02 = new Enum("AUTOMATIC", 0);
        ?? r12 = new Enum("TRUNCATE", 1);
        f4005a = r12;
        ?? r22 = new Enum("WRITE_AHEAD_LOGGING", 2);
        f4006b = r22;
        f4007c = new t[]{r02, r12, r22};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f4007c.clone();
    }
}
