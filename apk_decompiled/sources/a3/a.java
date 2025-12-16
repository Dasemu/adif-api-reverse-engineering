package a3;

import Z2.AbstractC0104l;
import Z2.G;
import Z2.InterfaceC0103k;
import Z2.K;
import Z2.L;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class a implements InterfaceC0103k {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2330a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2331b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2332c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2333d;

    public a(Class cls, String str, List list, List list2) {
        this.f2330a = cls;
        this.f2331b = str;
        this.f2332c = list;
        this.f2333d = list2;
    }

    @Override // Z2.InterfaceC0103k
    public final AbstractC0104l a(Type type, Set set, G g4) {
        if (L.d(type) != this.f2330a || !set.isEmpty()) {
            return null;
        }
        List list = this.f2333d;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(g4.b((Type) list.get(i)));
        }
        return new K(this.f2331b, this.f2332c, list, arrayList).nullSafe();
    }
}
