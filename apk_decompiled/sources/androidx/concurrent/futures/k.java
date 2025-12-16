package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final k f2534a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k[] f2535b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.concurrent.futures.k, java.lang.Enum] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f2534a = r02;
        f2535b = new k[]{r02};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f2535b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
