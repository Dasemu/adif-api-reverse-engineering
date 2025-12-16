package n0;

import R0.h;
import androidx.fragment.app.C0164o0;
import androidx.lifecycle.C0;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import java.io.PrintWriter;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import l0.C0435a;
import s.k;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0513c extends AbstractC0511a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7841a;

    /* renamed from: b, reason: collision with root package name */
    public final C0512b f7842b;

    public C0513c(J j4, C0 store) {
        this.f7841a = j4;
        C0164o0 factory = C0512b.f7839b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        C0435a defaultCreationExtras = C0435a.f7312b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h hVar = new h(store, (y0) factory, (l0.c) defaultCreationExtras);
        Intrinsics.checkNotNullParameter(C0512b.class, "modelClass");
        KClass modelClass = JvmClassMappingKt.getKotlinClass(C0512b.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        String qualifiedName = modelClass.getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f7842b = (C0512b) hVar.i(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName));
    }

    public final void b(String str, PrintWriter printWriter) {
        k kVar = this.f7842b.f7840a;
        if (kVar.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (kVar.f() <= 0) {
                return;
            }
            if (kVar.g(0) != null) {
                throw new ClassCastException();
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(kVar.d(0));
            printWriter.print(": ");
            throw null;
        }
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f7841a;
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}}");
        return sb.toString();
    }
}
