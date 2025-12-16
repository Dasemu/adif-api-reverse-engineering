package J0;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f933a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f934b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f935c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f936d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g[] f937e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f938f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, J0.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, J0.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, J0.g] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, J0.g] */
    static {
        ?? r02 = new Enum("MEMORY_CACHE", 0);
        f933a = r02;
        ?? r12 = new Enum("MEMORY", 1);
        f934b = r12;
        ?? r22 = new Enum("DISK", 2);
        f935c = r22;
        ?? r32 = new Enum("NETWORK", 3);
        f936d = r32;
        g[] gVarArr = {r02, r12, r22, r32};
        f937e = gVarArr;
        f938f = EnumEntriesKt.enumEntries(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f937e.clone();
    }
}
