package T0;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1638a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f1639b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f1640c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f1641d;

    /* JADX WARN: Type inference failed for: r0v0, types: [T0.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T0.g, java.lang.Enum] */
    static {
        ?? r02 = new Enum("FILL", 0);
        f1638a = r02;
        ?? r12 = new Enum("FIT", 1);
        f1639b = r12;
        g[] gVarArr = {r02, r12};
        f1640c = gVarArr;
        f1641d = EnumEntriesKt.enumEntries(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f1640c.clone();
    }
}
