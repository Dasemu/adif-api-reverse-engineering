package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0141d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3108c;

    public /* synthetic */ RunnableC0141d(int i, Object obj, Object obj2) {
        this.f3106a = i;
        this.f3107b = obj;
        this.f3108c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3106a) {
            case 0:
                C0168s this$0 = (C0168s) this.f3107b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                J0 operation = (J0) this.f3108c;
                Intrinsics.checkNotNullParameter(operation, "$operation");
                this$0.a(operation);
                return;
            default:
                C0167q this$02 = (C0167q) this.f3107b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ViewGroup container = (ViewGroup) this.f3108c;
                Intrinsics.checkNotNullParameter(container, "$container");
                Iterator it = this$02.f3208c.iterator();
                while (it.hasNext()) {
                    J0 j02 = ((r) it.next()).f3181a;
                    View view = j02.f3038c.getView();
                    if (view != null) {
                        j02.f3036a.a(view, container);
                    }
                }
                return;
        }
    }
}
