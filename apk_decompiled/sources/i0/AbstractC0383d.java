package i0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.AbstractC0158l0;
import androidx.fragment.app.K;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0383d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0382c f6811a = C0382c.f6808c;

    public static C0382c a(K k4) {
        while (k4 != null) {
            if (k4.isAdded()) {
                AbstractC0158l0 parentFragmentManager = k4.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                parentFragmentManager.getClass();
            }
            k4 = k4.getParentFragment();
        }
        return f6811a;
    }

    public static void b(C0382c c0382c, AbstractC0392m abstractC0392m) {
        K k4 = abstractC0392m.f6812a;
        String name = k4.getClass().getName();
        EnumC0381b enumC0381b = EnumC0381b.f6800a;
        Set set = c0382c.f6809a;
        if (set.contains(enumC0381b)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), abstractC0392m);
        }
        if (set.contains(EnumC0381b.f6801b)) {
            F.n nVar = new F.n(8, name, abstractC0392m);
            if (!k4.isAdded()) {
                nVar.run();
                throw null;
            }
            Handler handler = k4.getParentFragmentManager().f3177w.f3076c;
            if (Intrinsics.areEqual(handler.getLooper(), Looper.myLooper())) {
                nVar.run();
                throw null;
            }
            handler.post(nVar);
        }
    }

    public static void c(AbstractC0392m abstractC0392m) {
        if (AbstractC0158l0.M(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(abstractC0392m.f6812a.getClass().getName()), abstractC0392m);
        }
    }

    public static final void d(K fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        AbstractC0392m abstractC0392m = new AbstractC0392m(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        c(abstractC0392m);
        C0382c a2 = a(fragment);
        if (a2.f6809a.contains(EnumC0381b.f6802c) && e(a2, fragment.getClass(), C0380a.class)) {
            b(a2, abstractC0392m);
        }
    }

    public static boolean e(C0382c c0382c, Class cls, Class cls2) {
        Set set = (Set) c0382c.f6810b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual(cls2.getSuperclass(), AbstractC0392m.class) || !CollectionsKt.contains(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
