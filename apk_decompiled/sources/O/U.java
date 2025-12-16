package O;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class U {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0064f b(View view, C0064f c0064f) {
        ContentInfo f2 = c0064f.f1244a.f();
        Objects.requireNonNull(f2);
        ContentInfo h = B2.e.h(f2);
        ContentInfo performReceiveContent = view.performReceiveContent(h);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == h ? c0064f : new C0064f(new A.a(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0081w interfaceC0081w) {
        if (interfaceC0081w == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new V(interfaceC0081w));
        }
    }
}
