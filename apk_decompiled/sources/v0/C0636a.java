package v0;

import C.w;
import android.os.Bundle;
import androidx.lifecycle.A;
import androidx.lifecycle.C0;
import androidx.lifecycle.C0201w;
import androidx.lifecycle.D0;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0199u;
import androidx.lifecycle.J;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import androidx.lifecycle.w0;
import b.o;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0636a implements H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8627a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8628b;

    public C0636a(InterfaceC0199u[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f8628b = generatedAdapters;
    }

    @Override // androidx.lifecycle.H
    public final void onStateChanged(J source, A event) {
        switch (this.f8627a) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != A.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                source.getLifecycle().c(this);
                f owner = (f) this.f8628b;
                Bundle a2 = owner.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (a2 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, C0636a.class.getClassLoader()).asSubclass(InterfaceC0637b.class);
                        Intrinsics.checkNotNullExpressionValue(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                constr…wInstance()\n            }");
                                ((C0201w) ((InterfaceC0637b) newInstance)).getClass();
                                Intrinsics.checkNotNullParameter(owner, "owner");
                                if (!(owner instanceof D0)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                C0 viewModelStore = ((D0) owner).getViewModelStore();
                                C0639d savedStateRegistry = owner.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f3288a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String key = (String) it.next();
                                    Intrinsics.checkNotNullParameter(key, "key");
                                    w0 w0Var = (w0) linkedHashMap.get(key);
                                    Intrinsics.checkNotNull(w0Var);
                                    q0.b(w0Var, savedStateRegistry, owner.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e4) {
                                throw new RuntimeException(w.z("Failed to instantiate ", str), e4);
                            }
                        } catch (NoSuchMethodException e5) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
                        }
                    } catch (ClassNotFoundException e6) {
                        throw new RuntimeException(w.o("Class ", str, " wasn't found"), e6);
                    }
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                new HashMap();
                InterfaceC0199u[] interfaceC0199uArr = (InterfaceC0199u[]) this.f8628b;
                if (interfaceC0199uArr.length > 0) {
                    InterfaceC0199u interfaceC0199u = interfaceC0199uArr[0];
                    throw null;
                }
                if (interfaceC0199uArr.length <= 0) {
                    return;
                }
                InterfaceC0199u interfaceC0199u2 = interfaceC0199uArr[0];
                throw null;
            case 2:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != A.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
                }
                source.getLifecycle().c(this);
                ((r0) this.f8628b).c();
                return;
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                o oVar = (o) this.f8628b;
                o.access$ensureViewModelStore(oVar);
                oVar.getLifecycle().c(this);
                return;
        }
    }

    public C0636a(f owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f8628b = owner;
    }

    public C0636a(r0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f8628b = provider;
    }

    public C0636a(o oVar) {
        this.f8628b = oVar;
    }
}
