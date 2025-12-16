package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public static final B f3280a;

    /* renamed from: b, reason: collision with root package name */
    public static final B f3281b;

    /* renamed from: c, reason: collision with root package name */
    public static final B f3282c;

    /* renamed from: d, reason: collision with root package name */
    public static final B f3283d;

    /* renamed from: e, reason: collision with root package name */
    public static final B f3284e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ B[] f3285f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.B] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.B] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.B] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.B] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.B] */
    static {
        ?? r02 = new Enum("DESTROYED", 0);
        f3280a = r02;
        ?? r12 = new Enum("INITIALIZED", 1);
        f3281b = r12;
        ?? r22 = new Enum(DebugCoroutineInfoImplKt.CREATED, 2);
        f3282c = r22;
        ?? r32 = new Enum("STARTED", 3);
        f3283d = r32;
        ?? r4 = new Enum("RESUMED", 4);
        f3284e = r4;
        f3285f = new B[]{r02, r12, r22, r32, r4};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f3285f.clone();
    }

    public final boolean a(B state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return compareTo(state) >= 0;
    }
}
