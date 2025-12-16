package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.recyclerview.widget.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0218g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0218g0 f3817a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0218g0[] f3818b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.recyclerview.widget.g0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.recyclerview.widget.g0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.recyclerview.widget.g0] */
    static {
        ?? r02 = new Enum("ALLOW", 0);
        f3817a = r02;
        f3818b = new EnumC0218g0[]{r02, new Enum("PREVENT_WHEN_EMPTY", 1), new Enum("PREVENT", 2)};
    }

    public static EnumC0218g0 valueOf(String str) {
        return (EnumC0218g0) Enum.valueOf(EnumC0218g0.class, str);
    }

    public static EnumC0218g0[] values() {
        return (EnumC0218g0[]) f3818b.clone();
    }
}
