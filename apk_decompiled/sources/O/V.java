package O;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class V implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0081w f1225a;

    public V(InterfaceC0081w interfaceC0081w) {
        this.f1225a = interfaceC0081w;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0064f c0064f = new C0064f(new A.a(contentInfo));
        C0064f a2 = ((U.w) this.f1225a).a(view, c0064f);
        if (a2 == null) {
            return null;
        }
        if (a2 == c0064f) {
            return contentInfo;
        }
        ContentInfo f2 = a2.f1244a.f();
        Objects.requireNonNull(f2);
        return B2.e.h(f2);
    }
}
