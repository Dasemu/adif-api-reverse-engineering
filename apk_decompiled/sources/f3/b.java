package f3;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6468b;

    public /* synthetic */ b(String str, boolean z3) {
        this.f6467a = str;
        this.f6468b = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.f6467a;
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f6468b);
        return thread;
    }
}
