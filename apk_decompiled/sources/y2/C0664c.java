package y2;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import b.u;
import java.util.Objects;

/* renamed from: y2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0664c {

    /* renamed from: a, reason: collision with root package name */
    public OnBackInvokedCallback f8989a;

    public OnBackInvokedCallback a(InterfaceC0663b interfaceC0663b) {
        Objects.requireNonNull(interfaceC0663b);
        return new u(interfaceC0663b, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r3 = r3.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(y2.InterfaceC0663b r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            android.window.OnBackInvokedCallback r0 = r1.f8989a
            if (r0 == 0) goto L5
            goto Lb
        L5:
            android.window.OnBackInvokedDispatcher r3 = P.e.d(r3)
            if (r3 != 0) goto Lc
        Lb:
            return
        Lc:
            android.window.OnBackInvokedCallback r2 = r1.a(r2)
            r1.f8989a = r2
            if (r4 == 0) goto L18
            r1 = 1000000(0xf4240, float:1.401298E-39)
            goto L19
        L18:
            r1 = 0
        L19:
            P.e.i(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C0664c.b(y2.b, android.view.View, boolean):void");
    }

    public void c(View view) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
        if (findOnBackInvokedDispatcher == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f8989a);
        this.f8989a = null;
    }
}
