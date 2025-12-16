package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class A {
    private static final /* synthetic */ A[] $VALUES;
    public static final C0203y Companion;
    public static final A ON_ANY;
    public static final A ON_CREATE;
    public static final A ON_DESTROY;
    public static final A ON_PAUSE;
    public static final A ON_RESUME;
    public static final A ON_START;
    public static final A ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.A] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.lifecycle.y] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.A] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.A] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.A] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.A] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.lifecycle.A] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.lifecycle.A] */
    static {
        ?? r02 = new Enum("ON_CREATE", 0);
        ON_CREATE = r02;
        ?? r12 = new Enum("ON_START", 1);
        ON_START = r12;
        ?? r22 = new Enum("ON_RESUME", 2);
        ON_RESUME = r22;
        ?? r32 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r32;
        ?? r4 = new Enum("ON_STOP", 4);
        ON_STOP = r4;
        ?? r5 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r5;
        ?? r6 = new Enum("ON_ANY", 6);
        ON_ANY = r6;
        $VALUES = new A[]{r02, r12, r22, r32, r4, r5, r6};
        Companion = new Object();
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) $VALUES.clone();
    }

    public final B a() {
        switch (AbstractC0204z.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return B.f3282c;
            case 3:
            case 4:
                return B.f3283d;
            case 5:
                return B.f3284e;
            case 6:
                return B.f3280a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
