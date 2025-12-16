package J0;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f946a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ l[] f947b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f948c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, J0.l] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, J0.l] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, J0.l] */
    static {
        ?? r02 = new Enum("IGNORE", 0);
        ?? r12 = new Enum("RESPECT_PERFORMANCE", 1);
        f946a = r12;
        l[] lVarArr = {r02, r12, new Enum("RESPECT_ALL", 2)};
        f947b = lVarArr;
        f948c = EnumEntriesKt.enumEntries(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f947b.clone();
    }
}
