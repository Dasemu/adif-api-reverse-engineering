package s3;

import a.AbstractC0105a;
import com.google.firebase.sessions.settings.RemoteSettings;
import f0.C0338b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import r3.G;
import r3.I;
import r3.m;
import r3.n;
import r3.u;
import r3.z;

/* loaded from: classes3.dex */
public final class h extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final z f8485e;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f8486b;

    /* renamed from: c, reason: collision with root package name */
    public final u f8487c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f8488d;

    static {
        String str = z.f8321b;
        f8485e = C0338b.o(RemoteSettings.FORWARD_SLASH_STRING);
    }

    public h(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        u systemFileSystem = n.f8299a;
        Intrinsics.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.f8486b = classLoader;
        this.f8487c = systemFileSystem;
        this.f8488d = LazyKt.lazy(new J0.e(this, 12));
    }

    @Override // r3.n
    public final void a(z path) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // r3.n
    public final List d(z child) {
        int collectionSizeOrDefault;
        String removePrefix;
        String replace$default;
        Intrinsics.checkNotNullParameter(child, "dir");
        z zVar = f8485e;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        String q4 = c.b(zVar, child, true).c(zVar).f8322a.q();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z3 = false;
        for (Pair pair : (List) this.f8488d.getValue()) {
            n nVar = (n) pair.component1();
            z base = (z) pair.component2();
            try {
                List d4 = nVar.d(base.d(q4));
                ArrayList arrayList = new ArrayList();
                for (Object obj : d4) {
                    if (C0338b.e((z) obj)) {
                        arrayList.add(obj);
                    }
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    z zVar2 = (z) it.next();
                    Intrinsics.checkNotNullParameter(zVar2, "<this>");
                    Intrinsics.checkNotNullParameter(base, "base");
                    removePrefix = StringsKt__StringsKt.removePrefix(zVar2.f8322a.q(), (CharSequence) base.f8322a.q());
                    replace$default = StringsKt__StringsJVMKt.replace$default(removePrefix, '\\', '/', false, 4, (Object) null);
                    arrayList2.add(zVar.d(replace$default));
                }
                CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, arrayList2);
                z3 = true;
            } catch (IOException unused) {
            }
        }
        if (z3) {
            return CollectionsKt.toList(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + child);
    }

    @Override // r3.n
    public final m f(z child) {
        Intrinsics.checkNotNullParameter(child, "path");
        if (!C0338b.e(child)) {
            return null;
        }
        z zVar = f8485e;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        String q4 = c.b(zVar, child, true).c(zVar).f8322a.q();
        for (Pair pair : (List) this.f8488d.getValue()) {
            m f2 = ((n) pair.component1()).f(((z) pair.component2()).d(q4));
            if (f2 != null) {
                return f2;
            }
        }
        return null;
    }

    @Override // r3.n
    public final G g(z file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // r3.n
    public final I h(z child) {
        Intrinsics.checkNotNullParameter(child, "file");
        if (!C0338b.e(child)) {
            throw new FileNotFoundException("file not found: " + child);
        }
        z zVar = f8485e;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        InputStream resourceAsStream = this.f8486b.getResourceAsStream(c.b(zVar, child, false).c(zVar).f8322a.q());
        if (resourceAsStream != null) {
            return AbstractC0105a.R(resourceAsStream);
        }
        throw new FileNotFoundException("file not found: " + child);
    }
}
