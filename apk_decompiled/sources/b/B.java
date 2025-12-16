package b;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.J;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f4096a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f4097b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public r f4098c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f4099d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f4100e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4101f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4102g;

    public B(Runnable runnable) {
        this.f4096a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f4099d = i >= 34 ? x.f4145a.a(new s(this, 0), new s(this, 1), new t(this, 0), new t(this, 1)) : v.f4140a.a(new t(this, 2));
        }
    }

    public final void a(J owner, r onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.C lifecycle = owner.getLifecycle();
        if (lifecycle.b() == androidx.lifecycle.B.f3280a) {
            return;
        }
        onBackPressedCallback.addCancellable(new y(this, lifecycle, onBackPressedCallback));
        f();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new C0251A(0, this, B.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0));
    }

    public final z b(r onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f4097b.add(onBackPressedCallback);
        z zVar = new z(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(zVar);
        f();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new C0251A(0, this, B.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1));
        return zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        r rVar;
        r rVar2 = this.f4098c;
        if (rVar2 == null) {
            ArrayDeque arrayDeque = this.f4097b;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    rVar = 0;
                    break;
                } else {
                    rVar = listIterator.previous();
                    if (((r) rVar).isEnabled()) {
                        break;
                    }
                }
            }
            rVar2 = rVar;
        }
        this.f4098c = null;
        if (rVar2 != null) {
            rVar2.handleOnBackCancelled();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void d() {
        r rVar;
        r rVar2 = this.f4098c;
        if (rVar2 == null) {
            ArrayDeque arrayDeque = this.f4097b;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    rVar = 0;
                    break;
                } else {
                    rVar = listIterator.previous();
                    if (((r) rVar).isEnabled()) {
                        break;
                    }
                }
            }
            rVar2 = rVar;
        }
        this.f4098c = null;
        if (rVar2 != null) {
            rVar2.handleOnBackPressed();
        } else {
            this.f4096a.run();
        }
    }

    public final void e(boolean z3) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f4100e;
        OnBackInvokedCallback onBackInvokedCallback = this.f4099d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        v vVar = v.f4140a;
        if (z3 && !this.f4101f) {
            vVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f4101f = true;
        } else {
            if (z3 || !this.f4101f) {
                return;
            }
            vVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f4101f = false;
        }
    }

    public final void f() {
        boolean z3 = this.f4102g;
        boolean z4 = false;
        ArrayDeque arrayDeque = this.f4097b;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator<E> it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((r) it.next()).isEnabled()) {
                    z4 = true;
                    break;
                }
            }
        }
        this.f4102g = z4;
        if (z4 == z3 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        e(z4);
    }
}
