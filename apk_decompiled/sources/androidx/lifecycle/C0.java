package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3288a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f3288a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((w0) it.next()).clear$lifecycle_viewmodel_release();
        }
        linkedHashMap.clear();
    }
}
