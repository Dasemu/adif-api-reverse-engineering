package o0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.NavGraphNavigator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;
import p0.AbstractC0549a;

/* loaded from: classes.dex */
public final class H extends E implements Iterable, KMappedMarker {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f7930n = 0;

    /* renamed from: k, reason: collision with root package name */
    public final s.k f7931k;

    /* renamed from: l, reason: collision with root package name */
    public int f7932l;

    /* renamed from: m, reason: collision with root package name */
    public String f7933m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(NavGraphNavigator navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.f7931k = new s.k();
    }

    @Override // o0.E
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof H)) {
            return false;
        }
        s.k kVar = this.f7931k;
        List mutableList = SequencesKt.toMutableList(SequencesKt.asSequence(s.h.d(kVar)));
        H h = (H) obj;
        s.k kVar2 = h.f7931k;
        s.l d4 = s.h.d(kVar2);
        while (d4.hasNext()) {
            mutableList.remove((E) d4.next());
        }
        return super.equals(obj) && kVar.f() == kVar2.f() && this.f7932l == h.f7932l && mutableList.isEmpty();
    }

    @Override // o0.E
    public final D g(C0523C navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        D g4 = super.g(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        G g5 = new G(this);
        while (g5.hasNext()) {
            D g6 = ((E) g5.next()).g(navDeepLinkRequest);
            if (g6 != null) {
                arrayList.add(g6);
            }
        }
        return (D) CollectionsKt.maxOrNull((Iterable) CollectionsKt.listOfNotNull((Object[]) new D[]{g4, (D) CollectionsKt.maxOrNull((Iterable) arrayList)}));
    }

    @Override // o0.E
    public final void h(Context context, AttributeSet attrs) {
        String valueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.h(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, AbstractC0549a.f8111d);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId == this.h) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
        }
        this.f7932l = resourceId;
        this.f7933m = null;
        Intrinsics.checkNotNullParameter(context, "context");
        if (resourceId <= 16777215) {
            valueOf = String.valueOf(resourceId);
        } else {
            try {
                valueOf = context.getResources().getResourceName(resourceId);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(resourceId);
            }
            Intrinsics.checkNotNullExpressionValue(valueOf, "try {\n                co….toString()\n            }");
        }
        this.f7933m = valueOf;
        Unit unit = Unit.INSTANCE;
        obtainAttributes.recycle();
    }

    @Override // o0.E
    public final int hashCode() {
        int i = this.f7932l;
        s.k kVar = this.f7931k;
        int f2 = kVar.f();
        for (int i4 = 0; i4 < f2; i4++) {
            i = (((i * 31) + kVar.d(i4)) * 31) + ((E) kVar.g(i4)).hashCode();
        }
        return i;
    }

    public final void i(E node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int i = node.h;
        String str = node.i;
        if (i == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = this.i;
        if (str2 != null && Intrinsics.areEqual(str, str2)) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (i == this.h) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        s.k kVar = this.f7931k;
        E e4 = (E) kVar.c(i);
        if (e4 == node) {
            return;
        }
        if (node.f7921b != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (e4 != null) {
            e4.f7921b = null;
        }
        node.f7921b = this;
        kVar.e(node.h, node);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new G(this);
    }

    public final E j(int i, boolean z3) {
        H h;
        E e4 = (E) this.f7931k.c(i);
        if (e4 != null) {
            return e4;
        }
        if (!z3 || (h = this.f7921b) == null) {
            return null;
        }
        Intrinsics.checkNotNull(h);
        return h.j(i, true);
    }

    @Override // o0.E
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        E j4 = j(this.f7932l, true);
        sb.append(" startDestination=");
        if (j4 == null) {
            String str = this.f7933m;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x" + Integer.toHexString(this.f7932l));
            }
        } else {
            sb.append("{");
            sb.append(j4.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
