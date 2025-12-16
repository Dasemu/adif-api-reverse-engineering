package C;

import O.InterfaceC0069j;
import O.X;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import java.util.WeakHashMap;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: C.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0048l extends Activity implements androidx.lifecycle.J, InterfaceC0069j {
    private final s.j extraDataMap = new s.j(0);
    private final androidx.lifecycle.L lifecycleRegistry = new androidx.lifecycle.L(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullExpressionValue(getWindow().getDecorView(), "window.decorView");
        WeakHashMap weakHashMap = X.f1226a;
        return superDispatchKeyEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullExpressionValue(getWindow().getDecorView(), "window.decorView");
        WeakHashMap weakHashMap = X.f1226a;
        return super.dispatchKeyShortcutEvent(event);
    }

    @Deprecated(message = "Use {@link View#getTag(int)} with the window's decor view.")
    public <T extends AbstractC0047k> T getExtraData(Class<T> extraDataClass) {
        Intrinsics.checkNotNullParameter(extraDataClass, "extraDataClass");
        if (this.extraDataMap.get(extraDataClass) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // androidx.lifecycle.J
    public androidx.lifecycle.C getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = k0.f3396a;
        i0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.lifecycleRegistry.h(androidx.lifecycle.B.f3282c);
        super.onSaveInstanceState(outState);
    }

    @Deprecated(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    public void putExtraData(AbstractC0047k extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r3.equals("--contentcapture") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r3.equals("--list-dumpables") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r3.equals("--dump-dumpable") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 31) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r3.equals("--autofill") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldDumpInternalState(java.lang.String[] r3) {
        /*
            r2 = this;
            r2 = 1
            r0 = 0
            if (r3 == 0) goto L4f
            int r1 = r3.length
            if (r1 != 0) goto L8
            goto L4f
        L8:
            r3 = r3[r0]
            int r1 = r3.hashCode()
            switch(r1) {
                case -645125871: goto L3f;
                case 100470631: goto L2f;
                case 472614934: goto L26;
                case 1159329357: goto L1d;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L4f
        L12:
            java.lang.String r1 = "--autofill"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L1b
            goto L4f
        L1b:
            r0 = r2
            goto L4f
        L1d:
            java.lang.String r1 = "--contentcapture"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L1b
            goto L4f
        L26:
            java.lang.String r1 = "--list-dumpables"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L38
            goto L4f
        L2f:
            java.lang.String r1 = "--dump-dumpable"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L38
            goto L4f
        L38:
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r3 < r1) goto L4f
            goto L1b
        L3f:
            java.lang.String r1 = "--translation"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L48
            goto L4f
        L48:
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r3 < r1) goto L4f
            goto L1b
        L4f:
            r2 = r2 ^ r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: C.AbstractActivityC0048l.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // O.InterfaceC0069j
    public boolean superDispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
