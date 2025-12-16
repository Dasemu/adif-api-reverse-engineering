package b;

import android.window.OnBackInvokedCallback;
import g.LayoutInflaterFactory2C0351E;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC0663b;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4139b;

    public /* synthetic */ u(Object obj, int i) {
        this.f4138a = i;
        this.f4139b = obj;
    }

    public final void onBackInvoked() {
        int i = this.f4138a;
        Object obj = this.f4139b;
        switch (i) {
            case 0:
                Function0 onBackInvoked = (Function0) obj;
                Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                return;
            case 1:
                ((LayoutInflaterFactory2C0351E) obj).E();
                return;
            case 2:
                ((Runnable) obj).run();
                return;
            default:
                ((InterfaceC0663b) obj).a();
                return;
        }
    }
}
