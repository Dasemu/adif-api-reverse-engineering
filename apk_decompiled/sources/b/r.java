package b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class r {
    private final CopyOnWriteArrayList<InterfaceC0254c> cancellables = new CopyOnWriteArrayList<>();
    private Function0<Unit> enabledChangedCallback;
    private boolean isEnabled;

    public r(boolean z3) {
        this.isEnabled = z3;
    }

    @JvmName(name = "addCancellable")
    public final void addCancellable(InterfaceC0254c cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final Function0<Unit> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(C0253b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void handleOnBackStarted(C0253b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((InterfaceC0254c) it.next()).cancel();
        }
    }

    @JvmName(name = "removeCancellable")
    public final void removeCancellable(InterfaceC0254c cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    public final void setEnabled(boolean z3) {
        this.isEnabled = z3;
        Function0<Unit> function0 = this.enabledChangedCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(Function0<Unit> function0) {
        this.enabledChangedCallback = function0;
    }
}
