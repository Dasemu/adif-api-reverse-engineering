package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n.C0508b;
import o.C0515a;
import o.C0517c;
import v0.C0636a;

/* loaded from: classes.dex */
public final class L extends C {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3296b;

    /* renamed from: c, reason: collision with root package name */
    public C0515a f3297c;

    /* renamed from: d, reason: collision with root package name */
    public B f3298d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f3299e;

    /* renamed from: f, reason: collision with root package name */
    public int f3300f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3301g;
    public boolean h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final MutableStateFlow f3302j;

    public L(J provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f3296b = true;
        this.f3297c = new C0515a();
        B b4 = B.f3281b;
        this.f3298d = b4;
        this.i = new ArrayList();
        this.f3299e = new WeakReference(provider);
        this.f3302j = StateFlowKt.MutableStateFlow(b4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, androidx.lifecycle.K] */
    @Override // androidx.lifecycle.C
    public final void a(I object) {
        H h;
        J j4;
        ArrayList arrayList = this.i;
        Intrinsics.checkNotNullParameter(object, "observer");
        e("addObserver");
        B b4 = this.f3298d;
        B initialState = B.f3280a;
        if (b4 != initialState) {
            initialState = B.f3281b;
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        ?? obj = new Object();
        Intrinsics.checkNotNull(object);
        HashMap hashMap = M.f3303a;
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z3 = object instanceof H;
        boolean z4 = object instanceof InterfaceC0192m;
        if (z3 && z4) {
            h = new C0194o((InterfaceC0192m) object, (H) object);
        } else if (z4) {
            h = new C0194o((InterfaceC0192m) object, (H) null);
        } else if (z3) {
            h = (H) object;
        } else {
            Class<?> cls = object.getClass();
            if (M.c(cls) == 2) {
                Object obj2 = M.f3304b.get(cls);
                Intrinsics.checkNotNull(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    M.a((Constructor) list.get(0), object);
                    Intrinsics.checkNotNullParameter(null, "generatedAdapter");
                    h = new Object();
                } else {
                    int size = list.size();
                    InterfaceC0199u[] interfaceC0199uArr = new InterfaceC0199u[size];
                    for (int i = 0; i < size; i++) {
                        M.a((Constructor) list.get(i), object);
                        interfaceC0199uArr[i] = null;
                    }
                    h = new C0636a(interfaceC0199uArr);
                }
            } else {
                h = new C0194o(object);
            }
        }
        obj.f3295b = h;
        obj.f3294a = initialState;
        if (((K) this.f3297c.b(object, obj)) == null && (j4 = (J) this.f3299e.get()) != null) {
            boolean z5 = this.f3300f != 0 || this.f3301g;
            B d4 = d(object);
            this.f3300f++;
            while (obj.f3294a.compareTo(d4) < 0 && this.f3297c.f7883e.containsKey(object)) {
                arrayList.add(obj.f3294a);
                C0203y c0203y = A.Companion;
                B b5 = obj.f3294a;
                c0203y.getClass();
                A b6 = C0203y.b(b5);
                if (b6 == null) {
                    throw new IllegalStateException("no event up from " + obj.f3294a);
                }
                obj.a(j4, b6);
                arrayList.remove(arrayList.size() - 1);
                d4 = d(object);
            }
            if (!z5) {
                i();
            }
            this.f3300f--;
        }
    }

    @Override // androidx.lifecycle.C
    public final B b() {
        return this.f3298d;
    }

    @Override // androidx.lifecycle.C
    public final void c(I observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        e("removeObserver");
        this.f3297c.c(observer);
    }

    public final B d(I i) {
        K k4;
        HashMap hashMap = this.f3297c.f7883e;
        C0517c c0517c = hashMap.containsKey(i) ? ((C0517c) hashMap.get(i)).f7890d : null;
        B state1 = (c0517c == null || (k4 = (K) c0517c.f7888b) == null) ? null : k4.f3294a;
        ArrayList arrayList = this.i;
        B b4 = arrayList.isEmpty() ? null : (B) arrayList.get(arrayList.size() - 1);
        B state12 = this.f3298d;
        Intrinsics.checkNotNullParameter(state12, "state1");
        if (state1 == null || state1.compareTo(state12) >= 0) {
            state1 = state12;
        }
        Intrinsics.checkNotNullParameter(state1, "state1");
        return (b4 == null || b4.compareTo(state1) >= 0) ? state1 : b4;
    }

    public final void e(String str) {
        if (this.f3296b && !C0508b.L().M()) {
            throw new IllegalStateException(C.w.o("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void f(A event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e("handleLifecycleEvent");
        g(event.a());
    }

    public final void g(B b4) {
        B b5 = this.f3298d;
        if (b5 == b4) {
            return;
        }
        B b6 = B.f3281b;
        B b7 = B.f3280a;
        if (b5 == b6 && b4 == b7) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + b4 + ", but was " + this.f3298d + " in component " + this.f3299e.get()).toString());
        }
        this.f3298d = b4;
        if (this.f3301g || this.f3300f != 0) {
            this.h = true;
            return;
        }
        this.f3301g = true;
        i();
        this.f3301g = false;
        if (this.f3298d == b7) {
            this.f3297c = new C0515a();
        }
    }

    public final void h(B state) {
        Intrinsics.checkNotNullParameter(state, "state");
        e("setCurrentState");
        g(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.h = false;
        r7.f3302j.setValue(r7.f3298d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.L.i():void");
    }
}
