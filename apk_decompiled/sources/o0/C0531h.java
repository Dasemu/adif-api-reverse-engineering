package o0;

import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* renamed from: o0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531h implements Lazy {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f7991a;

    /* renamed from: b, reason: collision with root package name */
    public final Lambda f7992b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0530g f7993c;

    /* JADX WARN: Multi-variable type inference failed */
    public C0531h(KClass navArgsClass, Function0 argumentProducer) {
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        this.f7991a = navArgsClass;
        this.f7992b = (Lambda) argumentProducer;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.Lazy
    public final Object getValue() {
        InterfaceC0530g interfaceC0530g = this.f7993c;
        if (interfaceC0530g != null) {
            return interfaceC0530g;
        }
        Bundle bundle = (Bundle) this.f7992b.invoke();
        s.e eVar = AbstractC0532i.f7995b;
        KClass kClass = this.f7991a;
        Method method = (Method) eVar.get(kClass);
        if (method == null) {
            method = JvmClassMappingKt.getJavaClass(kClass).getMethod("fromBundle", (Class[]) Arrays.copyOf(AbstractC0532i.f7994a, 1));
            eVar.put(kClass, method);
            Intrinsics.checkNotNullExpressionValue(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Object invoke = method.invoke(null, bundle);
        if (invoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        }
        InterfaceC0530g interfaceC0530g2 = (InterfaceC0530g) invoke;
        this.f7993c = interfaceC0530g2;
        return interfaceC0530g2;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f7993c != null;
    }
}
