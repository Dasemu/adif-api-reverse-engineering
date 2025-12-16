package androidx.fragment.app;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0175z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3277b;

    public /* synthetic */ RunnableC0175z(Object obj, int i) {
        this.f3276a = i;
        this.f3277b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3276a) {
            case 0:
                K k4 = (K) this.f3277b;
                F0 f02 = k4.mViewLifecycleOwner;
                f02.f3002f.b(k4.mSavedViewRegistryState);
                k4.mSavedViewRegistryState = null;
                return;
            case 1:
                Ref.ObjectRef seekCancelLambda = (Ref.ObjectRef) this.f3277b;
                Intrinsics.checkNotNullParameter(seekCancelLambda, "$seekCancelLambda");
                Function0 function0 = (Function0) seekCancelLambda.element;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            default:
                ArrayList transitioningViews = (ArrayList) this.f3277b;
                Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
                x0.a(4, transitioningViews);
                return;
        }
    }
}
