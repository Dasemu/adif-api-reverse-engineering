package d;

import a.AbstractC0105a;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.A;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.H;
import androidx.lifecycle.J;
import e.AbstractC0311a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* renamed from: d.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0300i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6104a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6105b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f6106c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6107d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f6108e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f6109f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f6110g = new Bundle();

    public final boolean a(int i, int i4, Intent intent) {
        String str = (String) this.f6104a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0296e c0296e = (C0296e) this.f6108e.get(str);
        if ((c0296e != null ? c0296e.f6095a : null) != null) {
            ArrayList arrayList = this.f6107d;
            if (arrayList.contains(str)) {
                c0296e.f6095a.a(c0296e.f6096b.c(i4, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f6109f.remove(str);
        this.f6110g.putParcelable(str, new C0292a(i4, intent));
        return true;
    }

    public abstract void b(int i, AbstractC0311a abstractC0311a, Object obj);

    public final C0299h c(final String key, J lifecycleOwner, final AbstractC0311a contract, final InterfaceC0293b callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().a(B.f3283d)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(key);
        LinkedHashMap linkedHashMap = this.f6106c;
        C0297f c0297f = (C0297f) linkedHashMap.get(key);
        if (c0297f == null) {
            c0297f = new C0297f(lifecycle);
        }
        H observer = new H() { // from class: d.d
            @Override // androidx.lifecycle.H
            public final void onStateChanged(J j4, A event) {
                AbstractC0300i this$0 = AbstractC0300i.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String key2 = key;
                Intrinsics.checkNotNullParameter(key2, "$key");
                InterfaceC0293b callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                AbstractC0311a contract2 = contract;
                Intrinsics.checkNotNullParameter(contract2, "$contract");
                Intrinsics.checkNotNullParameter(j4, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (A.ON_START != event) {
                    if (A.ON_STOP == event) {
                        this$0.f6108e.remove(key2);
                        return;
                    } else {
                        if (A.ON_DESTROY == event) {
                            this$0.f(key2);
                            return;
                        }
                        return;
                    }
                }
                this$0.f6108e.put(key2, new C0296e(contract2, callback2));
                LinkedHashMap linkedHashMap2 = this$0.f6109f;
                if (linkedHashMap2.containsKey(key2)) {
                    Object obj = linkedHashMap2.get(key2);
                    linkedHashMap2.remove(key2);
                    callback2.a(obj);
                }
                Bundle bundle = this$0.f6110g;
                C0292a c0292a = (C0292a) AbstractC0105a.B(bundle, key2);
                if (c0292a != null) {
                    bundle.remove(key2);
                    callback2.a(contract2.c(c0292a.f6089a, c0292a.f6090b));
                }
            }
        };
        Intrinsics.checkNotNullParameter(observer, "observer");
        c0297f.f6097a.a(observer);
        c0297f.f6098b.add(observer);
        linkedHashMap.put(key, c0297f);
        return new C0299h(this, key, contract, 0);
    }

    public final C0299h d(String key, AbstractC0311a contract, InterfaceC0293b callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        e(key);
        this.f6108e.put(key, new C0296e(contract, callback));
        LinkedHashMap linkedHashMap = this.f6109f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            callback.a(obj);
        }
        Bundle bundle = this.f6110g;
        C0292a c0292a = (C0292a) AbstractC0105a.B(bundle, key);
        if (c0292a != null) {
            bundle.remove(key);
            callback.a(contract.c(c0292a.f6089a, c0292a.f6090b));
        }
        return new C0299h(this, key, contract, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f6105b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : SequencesKt.generateSequence(C0298g.f6099a)) {
            int intValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f6104a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                int intValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue2), str);
                linkedHashMap.put(str, Integer.valueOf(intValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String key) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f6107d.contains(key) && (num = (Integer) this.f6105b.remove(key)) != null) {
            this.f6104a.remove(num);
        }
        this.f6108e.remove(key);
        LinkedHashMap linkedHashMap = this.f6109f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder p = com.google.android.gms.measurement.internal.a.p("Dropping pending result for request ", key, ": ");
            p.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", p.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f6110g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C0292a) AbstractC0105a.B(bundle, key)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f6106c;
        C0297f c0297f = (C0297f) linkedHashMap2.get(key);
        if (c0297f != null) {
            ArrayList arrayList = c0297f.f6098b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0297f.f6097a.c((H) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
