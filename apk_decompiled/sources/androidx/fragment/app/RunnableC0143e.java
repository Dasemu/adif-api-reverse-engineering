package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0143e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3113c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3114d;

    public /* synthetic */ RunnableC0143e(Object obj, Object obj2, Object obj3, int i) {
        this.f3111a = i;
        this.f3112b = obj;
        this.f3113c = obj2;
        this.f3114d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3111a) {
            case 0:
                ViewGroup container = (ViewGroup) this.f3112b;
                Intrinsics.checkNotNullParameter(container, "$container");
                C0147g this$0 = (C0147g) this.f3114d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                container.endViewTransition((View) this.f3113c);
                this$0.f3121c.f3181a.c(this$0);
                return;
            case 1:
                C0167q this$02 = (C0167q) this.f3114d;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                K inFragment = ((J0) this.f3112b).f3038c;
                K outFragment = ((J0) this.f3113c).f3038c;
                boolean z3 = this$02.f3218o;
                s.e sharedElements = this$02.f3217n;
                C0 c02 = x0.f3272a;
                Intrinsics.checkNotNullParameter(inFragment, "inFragment");
                Intrinsics.checkNotNullParameter(outFragment, "outFragment");
                Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
                if (z3) {
                    outFragment.getEnterTransitionCallback();
                    return;
                } else {
                    inFragment.getEnterTransitionCallback();
                    return;
                }
            case 2:
                E0 impl = (E0) this.f3112b;
                Intrinsics.checkNotNullParameter(impl, "$impl");
                Rect lastInEpicenterRect = (Rect) this.f3114d;
                Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
                E0.j(lastInEpicenterRect, (View) this.f3113c);
                return;
            case 3:
                Utils.lambda$callTask$3((Callable) this.f3112b, (Executor) this.f3113c, (TaskCompletionSource) this.f3114d);
                return;
            case 4:
                ConfigGetParameterHandler.a((BiConsumer) this.f3112b, (String) this.f3113c, (ConfigContainer) this.f3114d);
                return;
            default:
                W1.k kVar = (W1.k) this.f3112b;
                m3.l lVar = (m3.l) this.f3113c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f3114d;
                kVar.getClass();
                try {
                    d0.p l4 = m3.d.l(kVar.f1936a);
                    if (l4 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    d0.o oVar = (d0.o) ((d0.g) l4.f3794b);
                    synchronized (oVar.f6143d) {
                        oVar.f6145f = threadPoolExecutor;
                    }
                    ((d0.g) l4.f3794b).a(new d0.j(lVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    lVar.L(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
