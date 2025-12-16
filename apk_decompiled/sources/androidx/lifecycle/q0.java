package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import com.adif.elcanomovil.R;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import l0.C0435a;
import m0.C0501a;
import m0.C0503c;
import n.C0508b;
import v0.C0636a;
import v0.C0639d;
import v0.InterfaceC0638c;

/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final E2.e f3417a = new E2.e(23);

    /* renamed from: b, reason: collision with root package name */
    public static final E2.e f3418b = new E2.e(24);

    /* renamed from: c, reason: collision with root package name */
    public static final E2.e f3419c = new E2.e(22);

    /* renamed from: d, reason: collision with root package name */
    public static final C0503c f3420d = new Object();

    public static C0189j a(Flow flow, CoroutineContext context, int i) {
        if ((i & 1) != 0) {
            context = EmptyCoroutineContext.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        C0189j k4 = k(context, new C0198t(flow, null));
        if (flow instanceof StateFlow) {
            if (C0508b.L().M()) {
                k4.j(((StateFlow) flow).getValue());
                return k4;
            }
            k4.k(((StateFlow) flow).getValue());
        }
        return k4;
    }

    public static final void b(w0 viewModel, C0639d registry, C lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        o0 o0Var = (o0) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (o0Var == null || o0Var.f3414c) {
            return;
        }
        o0Var.Y(registry, lifecycle);
        n(registry, lifecycle);
    }

    public static final o0 c(C0639d registry, C lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(str);
        Bundle a2 = registry.a(str);
        Class[] clsArr = n0.f3403f;
        o0 o0Var = new o0(str, d(a2, bundle));
        o0Var.Y(registry, lifecycle);
        n(registry, lifecycle);
        return o0Var;
    }

    public static n0 d(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new n0();
            }
            HashMap hashMap = new HashMap();
            for (String key : bundle2.keySet()) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, bundle2.get(key));
            }
            return new n0(hashMap);
        }
        ClassLoader classLoader = n0.class.getClassLoader();
        Intrinsics.checkNotNull(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(UserMetadata.KEYDATA_FILENAME);
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new n0(linkedHashMap);
    }

    public static final n0 e(l0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        v0.f fVar = (v0.f) cVar.a(f3417a);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        D0 d02 = (D0) cVar.a(f3418b);
        if (d02 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) cVar.a(f3419c);
        String key = (String) cVar.a(C0503c.f7792a);
        if (key == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        InterfaceC0638c b4 = fVar.getSavedStateRegistry().b();
        r0 r0Var = b4 instanceof r0 ? (r0) b4 : null;
        if (r0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        s0 i = i(d02);
        n0 n0Var = (n0) i.f3428a.get(key);
        if (n0Var != null) {
            return n0Var;
        }
        Class[] clsArr = n0.f3403f;
        Intrinsics.checkNotNullParameter(key, "key");
        r0Var.c();
        Bundle bundle2 = r0Var.f3426c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(key) : null;
        Bundle bundle4 = r0Var.f3426c;
        if (bundle4 != null) {
            bundle4.remove(key);
        }
        Bundle bundle5 = r0Var.f3426c;
        if (bundle5 != null && bundle5.isEmpty()) {
            r0Var.f3426c = null;
        }
        n0 d4 = d(bundle3, bundle);
        i.f3428a.put(key, d4);
        return d4;
    }

    public static final void f(v0.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        B b4 = fVar.getLifecycle().b();
        if (b4 != B.f3281b && b4 != B.f3282c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.getSavedStateRegistry().b() == null) {
            r0 r0Var = new r0(fVar.getSavedStateRegistry(), (D0) fVar);
            fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", r0Var);
            fVar.getLifecycle().a(new C0636a(r0Var));
        }
    }

    public static final E g(C c4) {
        Intrinsics.checkNotNullParameter(c4, "<this>");
        while (true) {
            E e4 = (E) c4.f3287a.get();
            if (e4 != null) {
                return e4;
            }
            E e5 = new E(c4, SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
            AtomicReference atomicReference = c4.f3287a;
            while (!atomicReference.compareAndSet(null, e5)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            BuildersKt.launch$default(e5, Dispatchers.getMain().getImmediate(), null, new D(e5, null), 2, null);
            return e5;
        }
    }

    public static final E h(J j4) {
        Intrinsics.checkNotNullParameter(j4, "<this>");
        return g(j4.getLifecycle());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.lifecycle.y0] */
    public static final s0 i(D0 owner) {
        Intrinsics.checkNotNullParameter(owner, "<this>");
        ?? factory = new Object();
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        C0 store = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(owner, "owner");
        l0.c defaultCreationExtras = owner instanceof InterfaceC0200v ? ((InterfaceC0200v) owner).getDefaultViewModelCreationExtras() : C0435a.f7312b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        R0.h hVar = new R0.h(store, (y0) factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesVM", "key");
        Intrinsics.checkNotNullParameter(s0.class, "modelClass");
        return (s0) hVar.i(JvmClassMappingKt.getKotlinClass(s0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final C0501a j(w0 w0Var) {
        C0501a c0501a;
        CoroutineContext coroutineContext;
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        synchronized (f3420d) {
            c0501a = (C0501a) w0Var.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c0501a == null) {
                try {
                    try {
                        coroutineContext = Dispatchers.getMain().getImmediate();
                    } catch (NotImplementedError unused) {
                        coroutineContext = EmptyCoroutineContext.INSTANCE;
                    }
                } catch (IllegalStateException unused2) {
                    coroutineContext = EmptyCoroutineContext.INSTANCE;
                }
                C0501a c0501a2 = new C0501a(coroutineContext.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
                w0Var.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c0501a2);
                c0501a = c0501a2;
            }
        }
        return c0501a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.W, java.lang.Object, androidx.lifecycle.j] */
    public static final C0189j k(CoroutineContext context, Function2 block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        ?? w3 = new W();
        w3.f3392m = new C0182d(w3, block, CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate().plus(context).plus(SupervisorKt.SupervisorJob((Job) context.get(Job.INSTANCE)))), new J0.e(w3, 2));
        return w3;
    }

    public static final Object l(C c4, Function2 function2, SuspendLambda suspendLambda) {
        Object coroutineScope;
        return (c4.b() != B.f3280a && (coroutineScope = CoroutineScopeKt.coroutineScope(new h0(c4, function2, null), suspendLambda)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? coroutineScope : Unit.INSTANCE;
    }

    public static final void m(View view, J j4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, j4);
    }

    public static void n(C0639d c0639d, C c4) {
        B b4 = c4.b();
        if (b4 == B.f3281b || b4.a(B.f3283d)) {
            c0639d.d();
        } else {
            c4.a(new C0194o(1, c4, c0639d));
        }
    }
}
