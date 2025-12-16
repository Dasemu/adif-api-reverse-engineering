package i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0381b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0381b f6800a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0381b f6801b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0381b f6802c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0381b f6803d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0381b f6804e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0381b f6805f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0381b f6806g;
    public static final EnumC0381b h;
    public static final EnumC0381b i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumC0381b[] f6807j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i0.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i0.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i0.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, i0.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, i0.b] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, i0.b] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, i0.b] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, i0.b] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, i0.b] */
    static {
        ?? r02 = new Enum("PENALTY_LOG", 0);
        f6800a = r02;
        ?? r12 = new Enum("PENALTY_DEATH", 1);
        f6801b = r12;
        ?? r22 = new Enum("DETECT_FRAGMENT_REUSE", 2);
        f6802c = r22;
        ?? r32 = new Enum("DETECT_FRAGMENT_TAG_USAGE", 3);
        f6803d = r32;
        ?? r4 = new Enum("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f6804e = r4;
        ?? r5 = new Enum("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f6805f = r5;
        ?? r6 = new Enum("DETECT_SET_USER_VISIBLE_HINT", 6);
        f6806g = r6;
        ?? r7 = new Enum("DETECT_TARGET_FRAGMENT_USAGE", 7);
        h = r7;
        ?? r8 = new Enum("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        i = r8;
        f6807j = new EnumC0381b[]{r02, r12, r22, r32, r4, r5, r6, r7, r8};
    }

    public static EnumC0381b valueOf(String str) {
        return (EnumC0381b) Enum.valueOf(EnumC0381b.class, str);
    }

    public static EnumC0381b[] values() {
        return (EnumC0381b[]) f6807j.clone();
    }
}
