package androidx.fragment.app;

import B0.C0036n;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0 f3272a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final E0 f3273b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.fragment.app.C0] */
    static {
        E0 e02;
        try {
            Intrinsics.checkNotNull(C0036n.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            e02 = (E0) C0036n.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            e02 = null;
        }
        f3273b = e02;
    }

    public static final void a(int i, ArrayList views) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
