package L;

import P.t;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class h implements Q0.i, t {

    /* renamed from: a, reason: collision with root package name */
    public int f1036a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1037b;

    public h() {
        this.f1037b = new LinkedHashMap();
    }

    @Override // Q0.i
    public synchronized boolean a(Q0.b bVar) {
        return ((LinkedHashMap) this.f1037b).remove(bVar) != null;
    }

    @Override // Q0.i
    public synchronized Q0.c b(Q0.b bVar) {
        try {
            ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.f1037b).get(bVar);
            Q0.c cVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Q0.g gVar = (Q0.g) arrayList.get(i);
                Bitmap bitmap = (Bitmap) gVar.f1365b.get();
                Q0.c cVar2 = bitmap != null ? new Q0.c(bitmap, gVar.f1366c) : null;
                if (cVar2 != null) {
                    cVar = cVar2;
                    break;
                }
                i++;
            }
            int i4 = this.f1036a;
            this.f1036a = i4 + 1;
            if (i4 >= 10) {
                f();
            }
            return cVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Q0.i
    public synchronized void c(int i) {
        if (i >= 10 && i != 20) {
            f();
        }
    }

    @Override // P.t
    public boolean d(View view) {
        ((BottomSheetBehavior) this.f1037b).H(this.f1036a);
        return true;
    }

    @Override // Q0.i
    public synchronized void e(Q0.b bVar, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1037b;
            Object obj = linkedHashMap.get(bVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(bVar, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            Q0.g gVar = new Q0.g(identityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    arrayList.add(gVar);
                    break;
                }
                Q0.g gVar2 = (Q0.g) arrayList.get(i4);
                if (i < gVar2.f1367d) {
                    i4++;
                } else if (gVar2.f1364a == identityHashCode && gVar2.f1365b.get() == bitmap) {
                    arrayList.set(i4, gVar);
                } else {
                    arrayList.add(i4, gVar);
                }
            }
            int i5 = this.f1036a;
            this.f1036a = i5 + 1;
            if (i5 >= 10) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void f() {
        WeakReference weakReference;
        this.f1036a = 0;
        Iterator it = ((LinkedHashMap) this.f1037b).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                Q0.g gVar = (Q0.g) CollectionsKt.firstOrNull((List) arrayList);
                if (((gVar == null || (weakReference = gVar.f1365b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    int i5 = i4 - i;
                    if (((Q0.g) arrayList.get(i5)).f1365b.get() == null) {
                        arrayList.remove(i5);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public h(int i, i[] iVarArr) {
        this.f1036a = i;
        this.f1037b = iVarArr;
    }

    public h(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f1037b = bottomSheetBehavior;
        this.f1036a = i;
    }
}
