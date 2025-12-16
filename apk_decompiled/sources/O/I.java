package O;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public int f1218a;

    /* renamed from: b, reason: collision with root package name */
    public int f1219b;

    /* renamed from: c, reason: collision with root package name */
    public int f1220c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1221d;

    public I() {
        if (E2.e.f384c == null) {
            E2.e.f384c = new E2.e(29);
        }
    }

    public int a(int i) {
        if (i < this.f1220c) {
            return ((ByteBuffer) this.f1221d).getShort(this.f1219b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f1219b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f1219b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f1218a);
            if (!((Class) this.f1221d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            WeakHashMap weakHashMap = X.f1226a;
            View.AccessibilityDelegate a2 = S.a(view);
            C0056b c0056b = a2 != null ? a2 instanceof C0054a ? ((C0054a) a2).f1230a : new C0056b(a2) : null;
            if (c0056b == null) {
                c0056b = new C0056b();
            }
            X.j(view, c0056b);
            view.setTag(this.f1218a, obj);
            X.e(view, this.f1220c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
