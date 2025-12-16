package I0;

import android.util.Base64;
import androidx.lifecycle.C0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class b implements Lazy {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f738a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f739b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f740c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f741d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f742e;

    /* renamed from: f, reason: collision with root package name */
    public Object f743f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(KClass viewModelClass, Function0 storeProducer, Function0 factoryProducer, Function0 extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.f739b = viewModelClass;
        this.f740c = (Lambda) storeProducer;
        this.f741d = factoryProducer;
        this.f742e = (Lambda) extrasProducer;
    }

    public void a(M0.f fVar, Class cls) {
        ((List) this.f742e).add(TuplesKt.to(fVar, cls));
    }

    public void b(P0.a aVar, Class cls) {
        ((List) this.f740c).add(TuplesKt.to(aVar, cls));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.Lazy
    public Object getValue() {
        w0 w0Var = (w0) this.f743f;
        if (w0Var != null) {
            return w0Var;
        }
        C0 store = (C0) ((Lambda) this.f740c).invoke();
        y0 factory = (y0) ((Function0) this.f741d).invoke();
        l0.c defaultCreationExtras = (l0.c) ((Lambda) this.f742e).invoke();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "extras");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        R0.h hVar = new R0.h(store, factory, defaultCreationExtras);
        KClass modelClass = (KClass) this.f739b;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        String qualifiedName = modelClass.getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        w0 i = hVar.i(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName));
        this.f743f = i;
        return i;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return ((w0) this.f743f) != null;
    }

    public String toString() {
        switch (this.f738a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f740c) + ", mProviderPackage: " + ((String) this.f741d) + ", mQuery: " + ((String) this.f742e) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f739b;
                    if (i >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i4 = 0; i4 < list2.size(); i4++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i++;
                }
            default:
                return super.toString();
        }
    }

    public b(String str, String str2, String str3, List list) {
        str.getClass();
        this.f740c = str;
        str2.getClass();
        this.f741d = str2;
        this.f742e = str3;
        list.getClass();
        this.f739b = list;
        this.f743f = str + "-" + str2 + "-" + str3;
    }

    public b(c cVar) {
        this.f739b = CollectionsKt.toMutableList((Collection) cVar.f744a);
        this.f740c = CollectionsKt.toMutableList((Collection) cVar.f745b);
        this.f741d = CollectionsKt.toMutableList((Collection) cVar.f746c);
        this.f742e = CollectionsKt.toMutableList((Collection) cVar.f747d);
        this.f743f = CollectionsKt.toMutableList((Collection) cVar.f748e);
    }
}
