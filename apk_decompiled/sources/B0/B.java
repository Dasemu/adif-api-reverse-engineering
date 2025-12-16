package B0;

import android.view.ViewGroup;
import com.adif.elcanomovil.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final C0023a f88a = new C0023a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f89b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f90c = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener, B0.A] */
    public static void a(ViewGroup viewGroup, x xVar) {
        ArrayList arrayList = f90c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (xVar == null) {
            xVar = f88a;
        }
        x clone = xVar.clone();
        c(viewGroup, clone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        ?? obj = new Object();
        obj.f86a = clone;
        obj.f87b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(obj);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, s.e, s.j] */
    public static s.e b() {
        s.e eVar;
        ThreadLocal threadLocal = f89b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (s.e) weakReference.get()) != null) {
            return eVar;
        }
        ?? jVar = new s.j(0);
        threadLocal.set(new WeakReference(jVar));
        return jVar;
    }

    public static void c(ViewGroup viewGroup, x xVar) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((x) it.next()).y(viewGroup);
            }
        }
        if (xVar != null) {
            xVar.h(viewGroup, true);
        }
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
    }
}
