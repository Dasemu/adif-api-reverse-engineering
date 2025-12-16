package T0;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1634a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f1635b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f1636c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, T0.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, T0.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, T0.d] */
    static {
        ?? r02 = new Enum("EXACT", 0);
        ?? r12 = new Enum("INEXACT", 1);
        ?? r22 = new Enum("AUTOMATIC", 2);
        f1634a = r22;
        d[] dVarArr = {r02, r12, r22};
        f1635b = dVarArr;
        f1636c = EnumEntriesKt.enumEntries(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f1635b.clone();
    }
}
