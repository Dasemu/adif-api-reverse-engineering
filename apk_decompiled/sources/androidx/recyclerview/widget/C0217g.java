package androidx.recyclerview.widget;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: androidx.recyclerview.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217g {
    public static final ExecutorC0215f h = new ExecutorC0215f();

    /* renamed from: a, reason: collision with root package name */
    public final C0209c f3810a;

    /* renamed from: b, reason: collision with root package name */
    public final F.i f3811b;

    /* renamed from: e, reason: collision with root package name */
    public List f3814e;

    /* renamed from: g, reason: collision with root package name */
    public int f3816g;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f3813d = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public List f3815f = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorC0215f f3812c = h;

    public C0217g(C0209c c0209c, F.i iVar) {
        this.f3810a = c0209c;
        this.f3811b = iVar;
    }

    public final void a(List list, Runnable runnable) {
        Iterator it = this.f3813d.iterator();
        while (it.hasNext()) {
            InterfaceC0213e interfaceC0213e = (InterfaceC0213e) it.next();
            ((Y) interfaceC0213e).f3781a.onCurrentListChanged(list, this.f3815f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i = this.f3816g + 1;
        this.f3816g = i;
        List list2 = this.f3814e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f3815f;
        C0209c c0209c = this.f3810a;
        if (list == null) {
            int size = list2.size();
            this.f3814e = null;
            this.f3815f = Collections.EMPTY_LIST;
            c0209c.e(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            ((ExecutorService) this.f3811b.f490b).execute(new androidx.fragment.app.D0(this, list2, list, i, runnable));
            return;
        }
        this.f3814e = list;
        this.f3815f = Collections.unmodifiableList(list);
        c0209c.d(0, list.size());
        a(list3, runnable);
    }
}
