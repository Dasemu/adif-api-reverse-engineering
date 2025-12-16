package K0;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import r3.G;
import r3.I;
import r3.m;
import r3.n;
import r3.u;
import r3.z;

/* loaded from: classes.dex */
public final class e extends n {

    /* renamed from: b, reason: collision with root package name */
    public final u f994b;

    public e(u delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f994b = delegate;
    }

    public static void j(z path, String functionName, String parameterName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
    }

    @Override // r3.n
    public final void a(z path) {
        Intrinsics.checkNotNullParameter(path, "path");
        j(path, "delete", NavArguments.ARG_DYNAMIC_LINKS_TAB);
        this.f994b.a(path);
    }

    @Override // r3.n
    public final List d(z dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        j(dir, "list", "dir");
        List<z> d4 = this.f994b.d(dir);
        ArrayList arrayList = new ArrayList();
        for (z path : d4) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter("list", "functionName");
            arrayList.add(path);
        }
        CollectionsKt.sort(arrayList);
        return arrayList;
    }

    @Override // r3.n
    public final m f(z path) {
        Intrinsics.checkNotNullParameter(path, "path");
        j(path, "metadataOrNull", NavArguments.ARG_DYNAMIC_LINKS_TAB);
        m f2 = this.f994b.f(path);
        if (f2 == null) {
            return null;
        }
        z path2 = (z) f2.f8295d;
        if (path2 == null) {
            return f2;
        }
        Intrinsics.checkNotNullParameter(path2, "path");
        Intrinsics.checkNotNullParameter("metadataOrNull", "functionName");
        Map extras = (Map) f2.i;
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new m(f2.f8293b, f2.f8294c, path2, (Long) f2.f8296e, (Long) f2.f8297f, (Long) f2.f8298g, (Long) f2.h, extras);
    }

    @Override // r3.n
    public final G g(z file) {
        m f2;
        z dir = file.b();
        if (dir != null) {
            Intrinsics.checkNotNullParameter(dir, "dir");
            Intrinsics.checkNotNullParameter(dir, "dir");
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(dir, "dir");
            ArrayDeque arrayDeque = new ArrayDeque();
            while (dir != null && !c(dir)) {
                arrayDeque.addFirst(dir);
                dir = dir.b();
            }
            Iterator<E> it = arrayDeque.iterator();
            while (it.hasNext()) {
                z dir2 = (z) it.next();
                Intrinsics.checkNotNullParameter(dir2, "dir");
                Intrinsics.checkNotNullParameter(dir2, "dir");
                j(dir2, "createDirectory", "dir");
                u uVar = this.f994b;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(dir2, "dir");
                if (!dir2.e().mkdir() && ((f2 = uVar.f(dir2)) == null || !f2.f8294c)) {
                    throw new IOException("failed to create directory: " + dir2);
                }
            }
        }
        Intrinsics.checkNotNullParameter(file, "file");
        j(file, "sink", "file");
        return this.f994b.g(file);
    }

    @Override // r3.n
    public final I h(z file) {
        Intrinsics.checkNotNullParameter(file, "file");
        j(file, "source", "file");
        return this.f994b.h(file);
    }

    public final void i(z source, z target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        j(source, "atomicMove", "source");
        j(target, "atomicMove", "target");
        this.f994b.i(source, target);
    }

    public final String toString() {
        return Reflection.getOrCreateKotlinClass(e.class).getSimpleName() + '(' + this.f994b + ')';
    }
}
