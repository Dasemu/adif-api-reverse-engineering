package androidx.lifecycle;

import a.AbstractC0106b;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import v0.InterfaceC0638c;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f3403f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3404a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3405b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3406c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f3407d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0638c f3408e;

    public n0(HashMap initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3404a = linkedHashMap;
        this.f3405b = new LinkedHashMap();
        this.f3406c = new LinkedHashMap();
        this.f3407d = new LinkedHashMap();
        this.f3408e = new l0(this, 0);
        linkedHashMap.putAll(initialState);
    }

    public static Bundle a(n0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (Map.Entry entry : MapsKt.toMap(this$0.f3405b).entrySet()) {
            this$0.d(((InterfaceC0638c) entry.getValue()).a(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = this$0.f3404a;
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return AbstractC0106b.b(TuplesKt.to(UserMetadata.KEYDATA_FILENAME, arrayList), TuplesKt.to("values", arrayList2));
    }

    public final boolean b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f3404a.containsKey(key);
    }

    public final Object c(String key) {
        LinkedHashMap linkedHashMap = this.f3404a;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return linkedHashMap.get(key);
        } catch (ClassCastException unused) {
            Intrinsics.checkNotNullParameter(key, "key");
            linkedHashMap.remove(key);
            m0 m0Var = (m0) this.f3406c.remove(key);
            if (m0Var != null) {
                m0Var.f3402m = null;
            }
            this.f3407d.remove(key);
            return null;
        }
    }

    public final void d(Object obj, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            Class[] clsArr = f3403f;
            for (int i = 0; i < 29; i++) {
                Class cls = clsArr[i];
                Intrinsics.checkNotNull(cls);
                if (!cls.isInstance(obj)) {
                }
            }
            StringBuilder sb = new StringBuilder("Can't put value with type ");
            Intrinsics.checkNotNull(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f3406c.get(key);
        X x3 = obj2 instanceof X ? (X) obj2 : null;
        if (x3 != null) {
            x3.j(obj);
        } else {
            this.f3404a.put(key, obj);
        }
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f3407d.get(key);
        if (mutableStateFlow == null) {
            return;
        }
        mutableStateFlow.setValue(obj);
    }

    public n0() {
        this.f3404a = new LinkedHashMap();
        this.f3405b = new LinkedHashMap();
        this.f3406c = new LinkedHashMap();
        this.f3407d = new LinkedHashMap();
        this.f3408e = new l0(this, 0);
    }
}
