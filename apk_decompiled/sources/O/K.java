package O;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class K implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public D0 f1222a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0080v f1224c;

    public K(View view, InterfaceC0080v interfaceC0080v) {
        this.f1223b = view;
        this.f1224c = interfaceC0080v;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        D0 f2 = D0.f(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0080v interfaceC0080v = this.f1224c;
        if (i < 30) {
            L.a(windowInsets, this.f1223b);
            if (f2.equals(this.f1222a)) {
                return interfaceC0080v.g(view, f2).e();
            }
        }
        this.f1222a = f2;
        D0 g4 = interfaceC0080v.g(view, f2);
        if (i >= 30) {
            return g4.e();
        }
        WeakHashMap weakHashMap = X.f1226a;
        J.c(view);
        return g4.e();
    }
}
