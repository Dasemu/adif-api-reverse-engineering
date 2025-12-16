package V1;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f1872a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y[] f1873b;

    /* JADX WARN: Type inference failed for: r0v0, types: [V1.y, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [V1.y, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [V1.y, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [V1.y, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [V1.y, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [V1.y, java.lang.Enum, java.lang.Object] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f1872a = r02;
        ?? r12 = new Enum("UNMETERED_ONLY", 1);
        ?? r22 = new Enum("UNMETERED_OR_DAILY", 2);
        ?? r32 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        ?? r4 = new Enum("NEVER", 4);
        ?? r5 = new Enum("UNRECOGNIZED", 5);
        f1873b = new y[]{r02, r12, r22, r32, r4, r5};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r02);
        sparseArray.put(1, r12);
        sparseArray.put(2, r22);
        sparseArray.put(3, r32);
        sparseArray.put(4, r4);
        sparseArray.put(-1, r5);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f1873b.clone();
    }
}
