package androidx.viewpager2.adapter;

import C.w;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList f4069a;

    public static void a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw w.g(it);
        }
    }
}
