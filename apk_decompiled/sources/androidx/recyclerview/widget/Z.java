package androidx.recyclerview.widget;

import java.util.List;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class Z extends AbstractC0220h0 {
    final C0217g mDiffer;
    private final InterfaceC0213e mListener;

    public Z(AbstractC0211d abstractC0211d) {
        Y y3 = new Y(this);
        this.mListener = y3;
        C0209c c0209c = new C0209c(this);
        synchronized (AbstractC0211d.f3799a) {
            try {
                if (AbstractC0211d.f3800b == null) {
                    AbstractC0211d.f3800b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0217g c0217g = new C0217g(c0209c, new F.i(8, AbstractC0211d.f3800b, abstractC0211d));
        this.mDiffer = c0217g;
        c0217g.f3813d.add(y3);
    }

    public List<Object> getCurrentList() {
        return this.mDiffer.f3815f;
    }

    public Object getItem(int i) {
        return this.mDiffer.f3815f.get(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public int getItemCount() {
        return this.mDiffer.f3815f.size();
    }

    public void onCurrentListChanged(List<Object> list, List<Object> list2) {
    }

    public void submitList(List<Object> list) {
        this.mDiffer.b(list, null);
    }

    public void submitList(List<Object> list, Runnable runnable) {
        this.mDiffer.b(list, runnable);
    }
}
