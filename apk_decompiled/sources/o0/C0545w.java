package o0;

import androidx.fragment.app.C0164o0;
import androidx.lifecycle.C0;
import androidx.lifecycle.w0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545w extends w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0164o0 f8071b = new C0164o0(2);

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8072a = new LinkedHashMap();

    @Override // androidx.lifecycle.w0
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.f8072a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((C0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f8072a.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
