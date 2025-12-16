package o0;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C0;
import androidx.lifecycle.t0;
import androidx.lifecycle.y0;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* renamed from: o0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0537n f8004b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0536m(C0537n c0537n, int i) {
        super(0);
        this.f8003a = i;
        this.f8004b = c0537n;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, o0.k, androidx.lifecycle.y0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8003a) {
            case 0:
                C0537n c0537n = this.f8004b;
                Context context = c0537n.f8005a;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new t0(applicationContext instanceof Application ? (Application) applicationContext : null, c0537n, c0537n.f8007c);
            default:
                C0537n owner = this.f8004b;
                if (!owner.f8012j) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (owner.h.f3298d == androidx.lifecycle.B.f3280a) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(owner, "owner");
                ?? factory = new Object();
                factory.f8000a = owner.i.f8636b;
                factory.f8001b = owner.h;
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(factory, "factory");
                C0 store = owner.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner, "owner");
                l0.c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store, "store");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                R0.h hVar = new R0.h(store, (y0) factory, defaultCreationExtras);
                Intrinsics.checkNotNullParameter(C0535l.class, "modelClass");
                KClass modelClass = JvmClassMappingKt.getKotlinClass(C0535l.class);
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass, "<this>");
                String qualifiedName = modelClass.getQualifiedName();
                if (qualifiedName != null) {
                    return ((C0535l) hVar.i(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName))).f8002a;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
    }
}
