package g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import v0.C0639d;
import v0.InterfaceC0638c;

/* renamed from: g.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363j implements InterfaceC0638c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6650a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6651b;

    public C0363j(C0639d registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f6651b = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // v0.InterfaceC0638c
    public final Bundle a() {
        switch (this.f6650a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0364k) this.f6651b).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f6651b));
                return bundle2;
        }
    }

    public C0363j(AbstractActivityC0364k abstractActivityC0364k) {
        this.f6651b = abstractActivityC0364k;
    }
}
