package v0;

import android.os.Bundle;
import androidx.lifecycle.C0201w;
import g.C0363j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.C0516b;
import o.C0520f;

/* renamed from: v0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f8630b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f8631c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8632d;

    /* renamed from: e, reason: collision with root package name */
    public C0363j f8633e;

    /* renamed from: a, reason: collision with root package name */
    public final C0520f f8629a = new C0520f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f8634f = true;

    public final Bundle a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f8632d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f8631c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(key);
        Bundle bundle3 = this.f8631c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f8631c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f8631c = null;
        return bundle2;
    }

    public final InterfaceC0638c b() {
        String str;
        InterfaceC0638c interfaceC0638c;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        Iterator it = this.f8629a.iterator();
        do {
            C0516b c0516b = (C0516b) it;
            if (!c0516b.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) c0516b.next();
            Intrinsics.checkNotNullExpressionValue(components, "components");
            str = (String) components.getKey();
            interfaceC0638c = (InterfaceC0638c) components.getValue();
        } while (!Intrinsics.areEqual(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC0638c;
    }

    public final void c(String key, InterfaceC0638c provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (((InterfaceC0638c) this.f8629a.b(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        Intrinsics.checkNotNullParameter(C0201w.class, "clazz");
        if (!this.f8634f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0363j c0363j = this.f8633e;
        if (c0363j == null) {
            c0363j = new C0363j(this);
        }
        this.f8633e = c0363j;
        try {
            C0201w.class.getDeclaredConstructor(new Class[0]);
            C0363j c0363j2 = this.f8633e;
            if (c0363j2 != null) {
                String className = C0201w.class.getName();
                Intrinsics.checkNotNullExpressionValue(className, "clazz.name");
                Intrinsics.checkNotNullParameter(className, "className");
                ((LinkedHashSet) c0363j2.f6651b).add(className);
            }
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class " + C0201w.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }
}
