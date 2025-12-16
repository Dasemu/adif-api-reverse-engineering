package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import z0.C0665a;
import z0.InterfaceC0666b;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lz0/b;", "Landroidx/lifecycle/J;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0666b {
    @Override // z0.InterfaceC0666b
    public final Object a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C0665a c4 = C0665a.c(context);
        Intrinsics.checkNotNullExpressionValue(c4, "getInstance(context)");
        if (!c4.f9002b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        AtomicBoolean atomicBoolean = G.f3293a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!G.f3293a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new F());
        }
        C0181c0 c0181c0 = C0181c0.h;
        Intrinsics.checkNotNullParameter(context, "context");
        C0181c0 c0181c02 = C0181c0.h;
        c0181c02.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        c0181c02.f3341e = new Handler();
        c0181c02.f3342f.f(A.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0179b0(c0181c02));
        return c0181c02;
    }

    @Override // z0.InterfaceC0666b
    public final List dependencies() {
        return CollectionsKt.emptyList();
    }
}
