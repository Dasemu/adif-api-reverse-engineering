package S0;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f1443c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f1444d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f1445e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f1446f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1447a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1448b;

    static {
        b bVar = new b("ENABLED", 0, true, true);
        f1443c = bVar;
        b bVar2 = new b("READ_ONLY", 1, true, false);
        b bVar3 = new b("WRITE_ONLY", 2, false, true);
        b bVar4 = new b("DISABLED", 3, false, false);
        f1444d = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f1445e = bVarArr;
        f1446f = EnumEntriesKt.enumEntries(bVarArr);
    }

    public b(String str, int i, boolean z3, boolean z4) {
        this.f1447a = z3;
        this.f1448b = z4;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1445e.clone();
    }
}
