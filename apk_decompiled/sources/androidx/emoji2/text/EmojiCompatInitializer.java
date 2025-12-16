package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.C;
import androidx.lifecycle.J;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.recyclerview.widget.AbstractC0208b0;
import d0.g;
import d0.h;
import d0.i;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import z0.C0665a;
import z0.InterfaceC0666b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0666b {
    /* JADX WARN: Type inference failed for: r0v0, types: [d0.p, androidx.recyclerview.widget.b0] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, d0.g, W1.k] */
    @Override // z0.InterfaceC0666b
    public final Object a(Context context) {
        Object obj;
        ?? obj2 = new Object();
        obj2.f1936a = context.getApplicationContext();
        ?? abstractC0208b0 = new AbstractC0208b0((g) obj2);
        abstractC0208b0.f3793a = 1;
        if (h.f6123k == null) {
            synchronized (h.f6122j) {
                try {
                    if (h.f6123k == null) {
                        h.f6123k = new h(abstractC0208b0);
                    }
                } finally {
                }
            }
        }
        C0665a c4 = C0665a.c(context);
        c4.getClass();
        synchronized (C0665a.f9000e) {
            try {
                obj = c4.f9001a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c4.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        C lifecycle = ((J) obj).getLifecycle();
        lifecycle.a(new i(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // z0.InterfaceC0666b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
