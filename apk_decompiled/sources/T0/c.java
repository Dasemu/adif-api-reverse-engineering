package T0;

import I0.m;
import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1633a;

    public c(Context context) {
        this.f1633a = context;
    }

    @Override // T0.i
    public final Object a(m mVar) {
        DisplayMetrics displayMetrics = this.f1633a.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new h(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return Intrinsics.areEqual(this.f1633a, ((c) obj).f1633a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1633a.hashCode();
    }
}
