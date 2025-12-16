package o0;

import a.AbstractC0105a;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.C0;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import t.AbstractC0613a;

/* renamed from: o0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0544v {

    /* renamed from: A, reason: collision with root package name */
    public int f8043A;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f8044B;

    /* renamed from: C, reason: collision with root package name */
    public final Lazy f8045C;

    /* renamed from: D, reason: collision with root package name */
    public final MutableSharedFlow f8046D;

    /* renamed from: E, reason: collision with root package name */
    public final SharedFlow f8047E;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8048a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f8049b;

    /* renamed from: c, reason: collision with root package name */
    public H f8050c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f8051d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable[] f8052e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8053f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f8054g;
    public final MutableStateFlow h;
    public final StateFlow i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f8055j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f8056k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f8057l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f8058m;

    /* renamed from: n, reason: collision with root package name */
    public NavHostFragment f8059n;

    /* renamed from: o, reason: collision with root package name */
    public b.B f8060o;
    public C0545w p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f8061q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.lifecycle.B f8062r;

    /* renamed from: s, reason: collision with root package name */
    public final C0539p f8063s;

    /* renamed from: t, reason: collision with root package name */
    public final b.C f8064t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8065u;

    /* renamed from: v, reason: collision with root package name */
    public final W f8066v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f8067w;

    /* renamed from: x, reason: collision with root package name */
    public Lambda f8068x;

    /* renamed from: y, reason: collision with root package name */
    public C0542t f8069y;

    /* renamed from: z, reason: collision with root package name */
    public final LinkedHashMap f8070z;

    public AbstractC0544v(Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8048a = context;
        Iterator it = SequencesKt.generateSequence(context, C0526c.f7977c).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f8049b = (Activity) obj;
        this.f8054g = new ArrayDeque();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.h = MutableStateFlow;
        this.i = FlowKt.asStateFlow(MutableStateFlow);
        this.f8055j = new LinkedHashMap();
        this.f8056k = new LinkedHashMap();
        this.f8057l = new LinkedHashMap();
        this.f8058m = new LinkedHashMap();
        this.f8061q = new CopyOnWriteArrayList();
        this.f8062r = androidx.lifecycle.B.f3281b;
        this.f8063s = new C0539p(this, 0);
        this.f8064t = new b.C(this);
        this.f8065u = true;
        W w3 = new W();
        this.f8066v = w3;
        this.f8067w = new LinkedHashMap();
        this.f8070z = new LinkedHashMap();
        w3.a(new NavGraphNavigator(w3));
        w3.a(new ActivityNavigator(this.f8048a));
        this.f8044B = new ArrayList();
        this.f8045C = LazyKt.lazy(new J0.e(this, 11));
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.f8046D = MutableSharedFlow$default;
        this.f8047E = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public static E e(E e4, int i) {
        H h;
        if (e4.h == i) {
            return e4;
        }
        if (e4 instanceof H) {
            h = (H) e4;
        } else {
            h = e4.f7921b;
            Intrinsics.checkNotNull(h);
        }
        return h.j(i, true);
    }

    public static /* synthetic */ void t(AbstractC0544v abstractC0544v, C0537n c0537n) {
        abstractC0544v.s(c0537n, false, new ArrayDeque());
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0183, code lost:
    
        if (r12.hasNext() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0185, code lost:
    
        r14 = (o0.C0537n) r12.next();
        r0 = r10.f8067w.get(r10.f8066v.b(r14.f8006b.f7920a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x019b, code lost:
    
        if (r0 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019d, code lost:
    
        ((o0.C0540q) r0).a(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01bb, code lost:
    
        throw new java.lang.IllegalStateException(C.w.r(new java.lang.StringBuilder("NavigatorBackStack for "), r11.f7920a, " should already be created").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01bc, code lost:
    
        r3.addAll(r1);
        r3.add(r13);
        r11 = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends o0.C0537n>) r1, r13).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d0, code lost:
    
        if (r11.hasNext() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d2, code lost:
    
        r12 = (o0.C0537n) r11.next();
        r13 = r12.f8006b.f7921b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01dc, code lost:
    
        if (r13 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01de, code lost:
    
        l(r12, f(r13.h));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0130, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0095, code lost:
    
        r4 = ((o0.C0537n) r1.first()).f8006b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r1 = new kotlin.collections.ArrayDeque();
        r4 = r11 instanceof o0.H;
        r5 = r10.f8048a;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r4 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
        r4 = r4.f7921b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        r7 = r14.listIterator(r14.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r7.hasPrevious() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        r8 = r7.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((o0.C0537n) r8).f8006b, r4) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        r8 = (o0.C0537n) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r8 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        r8 = f0.C0338b.k(r5, r4, r12, j(), r10.p);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r1.addFirst(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r3.isEmpty() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0007, code lost:
    
        if (r1 == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (((o0.C0537n) r3.last()).f8006b != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        t(r10, (o0.C0537n) r3.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if (r4 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        if (r4 != r11) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        if (r1.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        if (r4 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
    
        if (d(r4.h) != null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
    
        r4 = r4.f7921b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        if (r4 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r3.isEmpty() != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ab, code lost:
    
        r7 = r14.listIterator(r14.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
    
        if (r7.hasPrevious() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        r8 = r7.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((o0.C0537n) r8).f8006b, r4) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ca, code lost:
    
        r8 = (o0.C0537n) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cc, code lost:
    
        if (r8 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ce, code lost:
    
        r8 = f0.C0338b.k(r5, r4, r4.b(r12), j(), r10.p);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
    
        r1.addFirst(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c9, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e4, code lost:
    
        if (r1.isEmpty() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e7, code lost:
    
        r0 = ((o0.C0537n) r1.first()).f8006b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if ((((o0.C0537n) r3.last()).f8006b instanceof o0.InterfaceC0528e) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f3, code lost:
    
        if (r3.isEmpty() != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ff, code lost:
    
        if ((((o0.C0537n) r3.last()).f8006b instanceof o0.H) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0111, code lost:
    
        if (((o0.H) ((o0.C0537n) r3.last()).f8006b).j(r0.h, false) != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0113, code lost:
    
        t(r10, (o0.C0537n) r3.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011d, code lost:
    
        r0 = (o0.C0537n) r3.firstOrNull();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0123, code lost:
    
        if (r0 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0125, code lost:
    
        r0 = (o0.C0537n) r1.firstOrNull();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012b, code lost:
    
        if (r0 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012d, code lost:
    
        r0 = r0.f8006b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0137, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r10.f8050c) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0139, code lost:
    
        r14 = r14.listIterator(r14.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0145, code lost:
    
        if (r14.hasPrevious() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0147, code lost:
    
        r0 = r14.previous();
        r2 = ((o0.C0537n) r0).f8006b;
        r4 = r10.f8050c;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r(((o0.C0537n) r3.last()).f8006b.h, true, false) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0159, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, r4) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015b, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015c, code lost:
    
        r6 = (o0.C0537n) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015e, code lost:
    
        if (r6 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        r14 = r10.f8050c;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r14);
        r0 = r10.f8050c;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r6 = f0.C0338b.k(r5, r14, r0.b(r12), j(), r10.p);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0178, code lost:
    
        r1.addFirst(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017b, code lost:
    
        r12 = r1.iterator();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(o0.E r11, android.os.Bundle r12, o0.C0537n r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.AbstractC0544v.a(o0.E, android.os.Bundle, o0.n, java.util.List):void");
    }

    public final void b(r listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8061q.add(listener);
        ArrayDeque arrayDeque = this.f8054g;
        if (arrayDeque.isEmpty()) {
            return;
        }
        C0537n c0537n = (C0537n) arrayDeque.last();
        listener.a(this, c0537n.f8006b, c0537n.f8007c);
    }

    public final boolean c() {
        ArrayDeque arrayDeque;
        while (true) {
            arrayDeque = this.f8054g;
            if (arrayDeque.isEmpty() || !(((C0537n) arrayDeque.last()).f8006b instanceof H)) {
                break;
            }
            t(this, (C0537n) arrayDeque.last());
        }
        C0537n c0537n = (C0537n) arrayDeque.lastOrNull();
        ArrayList arrayList = this.f8044B;
        if (c0537n != null) {
            arrayList.add(c0537n);
        }
        this.f8043A++;
        y();
        int i = this.f8043A - 1;
        this.f8043A = i;
        if (i == 0) {
            List<C0537n> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            arrayList.clear();
            for (C0537n c0537n2 : mutableList) {
                Iterator it = this.f8061q.iterator();
                while (it.hasNext()) {
                    ((r) it.next()).a(this, c0537n2.f8006b, c0537n2.f8007c);
                }
                this.f8046D.tryEmit(c0537n2);
            }
            this.h.tryEmit(u());
        }
        return c0537n != null;
    }

    public final E d(int i) {
        E e4;
        H h = this.f8050c;
        if (h == null) {
            return null;
        }
        Intrinsics.checkNotNull(h);
        if (h.h == i) {
            return this.f8050c;
        }
        C0537n c0537n = (C0537n) this.f8054g.lastOrNull();
        if (c0537n == null || (e4 = c0537n.f8006b) == null) {
            e4 = this.f8050c;
            Intrinsics.checkNotNull(e4);
        }
        return e(e4, i);
    }

    public final C0537n f(int i) {
        Object obj;
        ArrayDeque arrayDeque = this.f8054g;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((C0537n) obj).f8006b.h == i) {
                break;
            }
        }
        C0537n c0537n = (C0537n) obj;
        if (c0537n != null) {
            return c0537n;
        }
        StringBuilder t2 = C.w.t(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        t2.append(g());
        throw new IllegalArgumentException(t2.toString().toString());
    }

    public final E g() {
        C0537n c0537n = (C0537n) this.f8054g.lastOrNull();
        if (c0537n != null) {
            return c0537n.f8006b;
        }
        return null;
    }

    public final int h() {
        int i = 0;
        ArrayDeque arrayDeque = this.f8054g;
        if (arrayDeque != null && arrayDeque.isEmpty()) {
            return 0;
        }
        Iterator<E> it = arrayDeque.iterator();
        while (it.hasNext()) {
            if (!(((C0537n) it.next()).f8006b instanceof H) && (i = i + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    public final H i() {
        H h = this.f8050c;
        if (h == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        if (h != null) {
            return h;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
    }

    public final androidx.lifecycle.B j() {
        return this.f8059n == null ? androidx.lifecycle.B.f3282c : this.f8062r;
    }

    public final C0537n k() {
        Object obj;
        Iterator it = CollectionsKt.reversed(this.f8054g).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = SequencesKt.asSequence(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (!(((C0537n) obj).f8006b instanceof H)) {
                break;
            }
        }
        return (C0537n) obj;
    }

    public final void l(C0537n c0537n, C0537n c0537n2) {
        this.f8055j.put(c0537n, c0537n2);
        LinkedHashMap linkedHashMap = this.f8056k;
        if (linkedHashMap.get(c0537n2) == null) {
            linkedHashMap.put(c0537n2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c0537n2);
        Intrinsics.checkNotNull(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public final void m(int i, Bundle bundle, K k4) {
        int i4;
        int i5;
        ArrayDeque arrayDeque = this.f8054g;
        E e4 = arrayDeque.isEmpty() ? this.f8050c : ((C0537n) arrayDeque.last()).f8006b;
        if (e4 == null) {
            throw new IllegalStateException("no current navigation node");
        }
        C0529f f2 = e4.f(i);
        Bundle bundle2 = null;
        if (f2 != null) {
            if (k4 == null) {
                k4 = f2.f7989b;
            }
            Bundle bundle3 = f2.f7990c;
            i4 = f2.f7988a;
            if (bundle3 != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundle3);
            }
        } else {
            i4 = i;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (i4 == 0 && k4 != null && (i5 = k4.f7939c) != -1) {
            if (r(i5, k4.f7940d, false)) {
                c();
                return;
            }
            return;
        }
        if (i4 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        E d4 = d(i4);
        if (d4 != null) {
            o(d4, bundle2, k4);
            return;
        }
        int i6 = E.f7919j;
        Context context = this.f8048a;
        String x3 = AbstractC0105a.x(context, i4);
        if (f2 == null) {
            throw new IllegalArgumentException("Navigation action/destination " + x3 + " cannot be found from the current destination " + e4);
        }
        StringBuilder p = com.google.android.gms.measurement.internal.a.p("Navigation destination ", x3, " referenced from action ");
        p.append(AbstractC0105a.x(context, i));
        p.append(" cannot be found from the current destination ");
        p.append(e4);
        throw new IllegalArgumentException(p.toString().toString());
    }

    public final void n(C0523C request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(request, "request");
        H h = this.f8050c;
        Intrinsics.checkNotNull(h);
        D g4 = h.g(request);
        if (g4 == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this.f8050c);
        }
        Bundle bundle = g4.f7915b;
        E e4 = g4.f7914a;
        Bundle b4 = e4.b(bundle);
        if (b4 == null) {
            b4 = new Bundle();
        }
        Intent intent = new Intent();
        intent.setDataAndType(request.f7911a, request.f7913c);
        intent.setAction(request.f7912b);
        b4.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        o(e4, b4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f6 A[LOOP:1: B:20:0x00f0->B:22:0x00f6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(o0.E r18, android.os.Bundle r19, o0.K r20) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.AbstractC0544v.o(o0.E, android.os.Bundle, o0.K):void");
    }

    public final void p(F directions) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        m(directions.getActionId(), directions.getArguments(), null);
    }

    public final boolean q() {
        if (this.f8054g.isEmpty()) {
            return false;
        }
        E g4 = g();
        Intrinsics.checkNotNull(g4);
        return r(g4.h, true, false) && c();
    }

    public final boolean r(int i, boolean z3, boolean z4) {
        E e4;
        AbstractC0544v abstractC0544v;
        boolean z5;
        String str;
        ArrayDeque arrayDeque = this.f8054g;
        if (arrayDeque.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.reversed(arrayDeque).iterator();
        while (true) {
            if (!it.hasNext()) {
                e4 = null;
                break;
            }
            e4 = ((C0537n) it.next()).f8006b;
            V b4 = this.f8066v.b(e4.f7920a);
            if (z3 || e4.h != i) {
                arrayList.add(b4);
            }
            if (e4.h == i) {
                break;
            }
        }
        if (e4 == null) {
            int i4 = E.f7919j;
            Log.i("NavController", "Ignoring popBackStack to destination " + AbstractC0105a.x(this.f8048a, i) + " as it was not found on the current back stack");
            return false;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                abstractC0544v = this;
                z5 = z4;
                break;
            }
            V v3 = (V) it2.next();
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            C0537n c0537n = (C0537n) arrayDeque.last();
            abstractC0544v = this;
            z5 = z4;
            abstractC0544v.f8069y = new C0542t(booleanRef2, booleanRef, abstractC0544v, z5, arrayDeque2);
            v3.i(c0537n, z5);
            abstractC0544v.f8069y = null;
            if (!booleanRef2.element) {
                break;
            }
            this = abstractC0544v;
            z4 = z5;
        }
        if (z5) {
            LinkedHashMap linkedHashMap = abstractC0544v.f8057l;
            if (!z3) {
                Iterator it3 = SequencesKt.takeWhile(SequencesKt.generateSequence(e4, C0526c.f7980f), new com.adif.elcanomovil.main.b(abstractC0544v, 1)).iterator();
                while (it3.hasNext()) {
                    Integer valueOf = Integer.valueOf(((E) it3.next()).h);
                    C0538o c0538o = (C0538o) arrayDeque2.firstOrNull();
                    linkedHashMap.put(valueOf, c0538o != null ? c0538o.f8016a : null);
                }
            }
            if (!arrayDeque2.isEmpty()) {
                C0538o c0538o2 = (C0538o) arrayDeque2.first();
                Iterator it4 = SequencesKt.takeWhile(SequencesKt.generateSequence(abstractC0544v.d(c0538o2.f8017b), C0526c.f7981g), new com.adif.elcanomovil.main.b(abstractC0544v, 2)).iterator();
                while (true) {
                    boolean hasNext = it4.hasNext();
                    str = c0538o2.f8016a;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((E) it4.next()).h), str);
                }
                abstractC0544v.f8058m.put(str, arrayDeque2);
            }
        }
        abstractC0544v.z();
        return booleanRef.element;
    }

    public final void s(C0537n c0537n, boolean z3, ArrayDeque arrayDeque) {
        C0545w c0545w;
        StateFlow stateFlow;
        Set set;
        ArrayDeque arrayDeque2 = this.f8054g;
        C0537n c0537n2 = (C0537n) arrayDeque2.last();
        if (!Intrinsics.areEqual(c0537n2, c0537n)) {
            throw new IllegalStateException(("Attempted to pop " + c0537n.f8006b + ", which is not the top of the back stack (" + c0537n2.f8006b + ')').toString());
        }
        arrayDeque2.removeLast();
        C0540q c0540q = (C0540q) this.f8067w.get(this.f8066v.b(c0537n2.f8006b.f7920a));
        boolean z4 = true;
        if ((c0540q == null || (stateFlow = c0540q.f8027f) == null || (set = (Set) stateFlow.getValue()) == null || !set.contains(c0537n2)) && !this.f8056k.containsKey(c0537n2)) {
            z4 = false;
        }
        androidx.lifecycle.B b4 = c0537n2.h.f3298d;
        androidx.lifecycle.B b5 = androidx.lifecycle.B.f3282c;
        if (b4.a(b5)) {
            if (z3) {
                c0537n2.a(b5);
                arrayDeque.addFirst(new C0538o(c0537n2));
            }
            if (z4) {
                c0537n2.a(b5);
            } else {
                c0537n2.a(androidx.lifecycle.B.f3280a);
                x(c0537n2);
            }
        }
        if (z3 || z4 || (c0545w = this.p) == null) {
            return;
        }
        String backStackEntryId = c0537n2.f8010f;
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        C0 c02 = (C0) c0545w.f8072a.remove(backStackEntryId);
        if (c02 != null) {
            c02.a();
        }
    }

    public final ArrayList u() {
        androidx.lifecycle.B b4;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8067w.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            b4 = androidx.lifecycle.B.f3283d;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((C0540q) it.next()).f8027f.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C0537n c0537n = (C0537n) obj;
                if (!arrayList.contains(c0537n) && !c0537n.f8015m.a(b4)) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<E> it2 = this.f8054g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C0537n c0537n2 = (C0537n) next;
            if (!arrayList.contains(c0537n2) && c0537n2.f8015m.a(b4)) {
                arrayList3.add(next);
            }
        }
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((C0537n) next2).f8006b instanceof H)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean v(int i, Bundle bundle, K k4) {
        E i4;
        C0537n c0537n;
        E e4;
        LinkedHashMap linkedHashMap = this.f8057l;
        if (!linkedHashMap.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        CollectionsKt__MutableCollectionsKt.removeAll(linkedHashMap.values(), new I1.b(str, 18));
        ArrayDeque arrayDeque = (ArrayDeque) TypeIntrinsics.asMutableMap(this.f8058m).remove(str);
        ArrayList arrayList = new ArrayList();
        C0537n c0537n2 = (C0537n) this.f8054g.lastOrNull();
        if (c0537n2 == null || (i4 = c0537n2.f8006b) == null) {
            i4 = i();
        }
        if (arrayDeque != null) {
            Iterator<E> it = arrayDeque.iterator();
            while (it.hasNext()) {
                C0538o c0538o = (C0538o) it.next();
                E e5 = e(i4, c0538o.f8017b);
                Context context = this.f8048a;
                if (e5 == null) {
                    int i5 = E.f7919j;
                    throw new IllegalStateException(("Restore State failed: destination " + AbstractC0105a.x(context, c0538o.f8017b) + " cannot be found from the current destination " + i4).toString());
                }
                arrayList.add(c0538o.a(context, e5, j(), this.p));
                i4 = e5;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((C0537n) next).f8006b instanceof H)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it3.hasNext()) {
                break;
            }
            C0537n c0537n3 = (C0537n) it3.next();
            List list = (List) CollectionsKt.lastOrNull((List) arrayList2);
            if (list != null && (c0537n = (C0537n) CollectionsKt.last(list)) != null && (e4 = c0537n.f8006b) != null) {
                str2 = e4.f7920a;
            }
            if (Intrinsics.areEqual(str2, c0537n3.f8006b.f7920a)) {
                list.add(c0537n3);
            } else {
                arrayList2.add(CollectionsKt.mutableListOf(c0537n3));
            }
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            V b4 = this.f8066v.b(((C0537n) CollectionsKt.first(list2)).f8006b.f7920a);
            AbstractC0544v abstractC0544v = this;
            Bundle bundle2 = bundle;
            abstractC0544v.f8068x = new C0543u(booleanRef, arrayList, new Ref.IntRef(), abstractC0544v, bundle2);
            b4.d(list2, k4);
            abstractC0544v.f8068x = null;
            this = abstractC0544v;
            bundle = bundle2;
        }
        return booleanRef.element;
    }

    public final void w(H graph, Bundle bundle) {
        Activity activity;
        String str;
        E j4;
        H h;
        Bundle bundle2;
        E j5;
        H h4;
        ArrayList<String> stringArrayList;
        Intrinsics.checkNotNullParameter(graph, "graph");
        boolean areEqual = Intrinsics.areEqual(this.f8050c, graph);
        ArrayDeque arrayDeque = this.f8054g;
        int i = 0;
        if (areEqual) {
            s.k kVar = graph.f7931k;
            int f2 = kVar.f();
            while (i < f2) {
                E newDestination = (E) kVar.g(i);
                H h5 = this.f8050c;
                Intrinsics.checkNotNull(h5);
                s.k kVar2 = h5.f7931k;
                if (kVar2.f8353a) {
                    s.h.a(kVar2);
                }
                int a2 = AbstractC0613a.a(kVar2.f8354b, kVar2.f8356d, i);
                if (a2 >= 0) {
                    Object[] objArr = kVar2.f8355c;
                    Object obj = objArr[a2];
                    objArr[a2] = newDestination;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<E> it = arrayDeque.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    C0537n c0537n = (C0537n) next;
                    if (newDestination != null && c0537n.f8006b.h == newDestination.h) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C0537n c0537n2 = (C0537n) it2.next();
                    Intrinsics.checkNotNullExpressionValue(newDestination, "newDestination");
                    c0537n2.getClass();
                    Intrinsics.checkNotNullParameter(newDestination, "<set-?>");
                    c0537n2.f8006b = newDestination;
                }
                i++;
            }
            return;
        }
        H h6 = this.f8050c;
        LinkedHashMap linkedHashMap = this.f8067w;
        if (h6 != null) {
            Iterator it3 = new ArrayList(this.f8057l.keySet()).iterator();
            while (it3.hasNext()) {
                Integer id = (Integer) it3.next();
                Intrinsics.checkNotNullExpressionValue(id, "id");
                int intValue = id.intValue();
                Iterator it4 = linkedHashMap.values().iterator();
                while (it4.hasNext()) {
                    ((C0540q) it4.next()).f8025d = true;
                }
                boolean v3 = v(intValue, null, null);
                Iterator it5 = linkedHashMap.values().iterator();
                while (it5.hasNext()) {
                    ((C0540q) it5.next()).f8025d = false;
                }
                if (v3) {
                    r(intValue, true, false);
                }
            }
            r(h6.h, true, false);
        }
        this.f8050c = graph;
        Bundle bundle3 = this.f8051d;
        W w3 = this.f8066v;
        if (bundle3 != null && (stringArrayList = bundle3.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it6 = stringArrayList.iterator();
            while (it6.hasNext()) {
                String name = it6.next();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                V b4 = w3.b(name);
                Bundle bundle4 = bundle3.getBundle(name);
                if (bundle4 != null) {
                    b4.g(bundle4);
                }
            }
        }
        Parcelable[] parcelableArr = this.f8052e;
        Context context = this.f8048a;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                C0538o c0538o = (C0538o) parcelable;
                E d4 = d(c0538o.f8017b);
                if (d4 == null) {
                    int i4 = E.f7919j;
                    StringBuilder p = com.google.android.gms.measurement.internal.a.p("Restoring the Navigation back stack failed: destination ", AbstractC0105a.x(context, c0538o.f8017b), " cannot be found from the current destination ");
                    p.append(g());
                    throw new IllegalStateException(p.toString());
                }
                C0537n a4 = c0538o.a(context, d4, j(), this.p);
                V b5 = w3.b(d4.f7920a);
                Object obj2 = linkedHashMap.get(b5);
                if (obj2 == null) {
                    obj2 = new C0540q(this, b5);
                    linkedHashMap.put(b5, obj2);
                }
                arrayDeque.add(a4);
                ((C0540q) obj2).a(a4);
                H h7 = a4.f8006b.f7921b;
                if (h7 != null) {
                    l(a4, f(h7.h));
                }
            }
            z();
            this.f8052e = null;
        }
        Collection values = MapsKt.toMap(w3.f7967a).values();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : values) {
            if (!((V) obj3).f7965b) {
                arrayList2.add(obj3);
            }
        }
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            V v4 = (V) it7.next();
            Object obj4 = linkedHashMap.get(v4);
            if (obj4 == null) {
                obj4 = new C0540q(this, v4);
                linkedHashMap.put(v4, obj4);
            }
            v4.e((C0540q) obj4);
        }
        if (this.f8050c == null || !arrayDeque.isEmpty()) {
            c();
            return;
        }
        if (!this.f8053f && (activity = this.f8049b) != null) {
            Intrinsics.checkNotNull(activity);
            Intent intent = activity.getIntent();
            if (intent != null) {
                Bundle extras = intent.getExtras();
                int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
                ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                Bundle bundle5 = new Bundle();
                Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                if (bundle6 != null) {
                    bundle5.putAll(bundle6);
                }
                if (intArray == null || intArray.length == 0) {
                    H h8 = this.f8050c;
                    Intrinsics.checkNotNull(h8);
                    D g4 = h8.g(new C0523C(intent));
                    if (g4 != null) {
                        E e4 = g4.f7914a;
                        int[] c4 = e4.c(null);
                        Bundle b6 = e4.b(g4.f7915b);
                        if (b6 != null) {
                            bundle5.putAll(b6);
                        }
                        intArray = c4;
                        parcelableArrayList = null;
                    }
                }
                if (intArray != null && intArray.length != 0) {
                    H h9 = this.f8050c;
                    int length = intArray.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            str = null;
                            break;
                        }
                        int i6 = intArray[i5];
                        if (i5 == 0) {
                            H h10 = this.f8050c;
                            Intrinsics.checkNotNull(h10);
                            j5 = h10.h == i6 ? this.f8050c : null;
                        } else {
                            Intrinsics.checkNotNull(h9);
                            j5 = h9.j(i6, true);
                        }
                        if (j5 == null) {
                            int i7 = E.f7919j;
                            str = AbstractC0105a.x(context, i6);
                            break;
                        }
                        if (i5 != intArray.length - 1 && (j5 instanceof H)) {
                            while (true) {
                                h4 = (H) j5;
                                Intrinsics.checkNotNull(h4);
                                if (!(h4.j(h4.f7932l, true) instanceof H)) {
                                    break;
                                } else {
                                    j5 = h4.j(h4.f7932l, true);
                                }
                            }
                            h9 = h4;
                        }
                        i5++;
                    }
                    if (str == null) {
                        bundle5.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                        int length2 = intArray.length;
                        Bundle[] bundleArr = new Bundle[length2];
                        for (int i8 = 0; i8 < length2; i8++) {
                            Bundle bundle7 = new Bundle();
                            bundle7.putAll(bundle5);
                            if (parcelableArrayList != null && (bundle2 = (Bundle) parcelableArrayList.get(i8)) != null) {
                                bundle7.putAll(bundle2);
                            }
                            bundleArr[i8] = bundle7;
                        }
                        int flags = intent.getFlags();
                        int i9 = 268435456 & flags;
                        if (i9 != 0 && (flags & 32768) == 0) {
                            intent.addFlags(32768);
                            C.M m4 = new C.M(context);
                            ComponentName component = intent.getComponent();
                            if (component == null) {
                                component = intent.resolveActivity(m4.f234b.getPackageManager());
                            }
                            if (component != null) {
                                m4.a(component);
                            }
                            m4.f233a.add(intent);
                            Intrinsics.checkNotNullExpressionValue(m4, "create(context)\n        …ntWithParentStack(intent)");
                            m4.b();
                            activity.finish();
                            activity.overridePendingTransition(0, 0);
                            return;
                        }
                        if (i9 != 0) {
                            if (!arrayDeque.isEmpty()) {
                                H h11 = this.f8050c;
                                Intrinsics.checkNotNull(h11);
                                r(h11.h, true, false);
                            }
                            while (i < intArray.length) {
                                int i10 = intArray[i];
                                int i11 = i + 1;
                                Bundle bundle8 = bundleArr[i];
                                E d5 = d(i10);
                                if (d5 == null) {
                                    int i12 = E.f7919j;
                                    StringBuilder p3 = com.google.android.gms.measurement.internal.a.p("Deep Linking failed: destination ", AbstractC0105a.x(context, i10), " cannot be found from the current destination ");
                                    p3.append(g());
                                    throw new IllegalStateException(p3.toString());
                                }
                                o(d5, bundle8, m3.l.K(new b1.e(4, d5, this)));
                                i = i11;
                            }
                            return;
                        }
                        H h12 = this.f8050c;
                        int length3 = intArray.length;
                        while (i < length3) {
                            int i13 = intArray[i];
                            Bundle bundle9 = bundleArr[i];
                            if (i == 0) {
                                j4 = this.f8050c;
                            } else {
                                Intrinsics.checkNotNull(h12);
                                j4 = h12.j(i13, true);
                            }
                            if (j4 == null) {
                                int i14 = E.f7919j;
                                throw new IllegalStateException("Deep Linking failed: destination " + AbstractC0105a.x(context, i13) + " cannot be found in graph " + h12);
                            }
                            if (i == intArray.length - 1) {
                                H h13 = this.f8050c;
                                Intrinsics.checkNotNull(h13);
                                o(j4, bundle9, new K(false, false, h13.h, true, false, 0, 0, -1, -1));
                            } else if (j4 instanceof H) {
                                while (true) {
                                    h = (H) j4;
                                    Intrinsics.checkNotNull(h);
                                    if (!(h.j(h.f7932l, true) instanceof H)) {
                                        break;
                                    } else {
                                        j4 = h.j(h.f7932l, true);
                                    }
                                }
                                h12 = h;
                            }
                            i++;
                        }
                        this.f8053f = true;
                        return;
                    }
                    Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                }
            }
        }
        E e5 = this.f8050c;
        Intrinsics.checkNotNull(e5);
        o(e5, bundle, null);
    }

    public final void x(C0537n child) {
        C0545w c0545w;
        Intrinsics.checkNotNullParameter(child, "child");
        C0537n entry = (C0537n) this.f8055j.remove(child);
        if (entry == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f8056k;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(entry);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            C0540q c0540q = (C0540q) this.f8067w.get(this.f8066v.b(entry.f8006b.f7920a));
            if (c0540q != null) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                AbstractC0544v abstractC0544v = c0540q.h;
                boolean areEqual = Intrinsics.areEqual(abstractC0544v.f8070z.get(entry), Boolean.TRUE);
                Intrinsics.checkNotNullParameter(entry, "entry");
                MutableStateFlow mutableStateFlow = c0540q.f8024c;
                mutableStateFlow.setValue(SetsKt.minus((Set<? extends C0537n>) mutableStateFlow.getValue(), entry));
                abstractC0544v.f8070z.remove(entry);
                ArrayDeque arrayDeque = abstractC0544v.f8054g;
                boolean contains = arrayDeque.contains(entry);
                MutableStateFlow mutableStateFlow2 = abstractC0544v.h;
                if (!contains) {
                    abstractC0544v.x(entry);
                    if (entry.h.f3298d.a(androidx.lifecycle.B.f3282c)) {
                        entry.a(androidx.lifecycle.B.f3280a);
                    }
                    boolean isEmpty = arrayDeque.isEmpty();
                    String backStackEntryId = entry.f8010f;
                    if (!isEmpty) {
                        Iterator<E> it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((C0537n) it.next()).f8010f, backStackEntryId)) {
                                break;
                            }
                        }
                    }
                    if (!areEqual && (c0545w = abstractC0544v.p) != null) {
                        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
                        C0 c02 = (C0) c0545w.f8072a.remove(backStackEntryId);
                        if (c02 != null) {
                            c02.a();
                        }
                    }
                    abstractC0544v.y();
                    mutableStateFlow2.tryEmit(abstractC0544v.u());
                } else if (!c0540q.f8025d) {
                    abstractC0544v.y();
                    mutableStateFlow2.tryEmit(abstractC0544v.u());
                }
            }
            linkedHashMap.remove(entry);
        }
    }

    public final void y() {
        E e4;
        AtomicInteger atomicInteger;
        StateFlow stateFlow;
        Set set;
        List<C0537n> mutableList = CollectionsKt.toMutableList((Collection) this.f8054g);
        if (mutableList.isEmpty()) {
            return;
        }
        E e5 = ((C0537n) CollectionsKt.last(mutableList)).f8006b;
        if (e5 instanceof InterfaceC0528e) {
            Iterator it = CollectionsKt.reversed(mutableList).iterator();
            while (it.hasNext()) {
                e4 = ((C0537n) it.next()).f8006b;
                if (!(e4 instanceof H) && !(e4 instanceof InterfaceC0528e)) {
                    break;
                }
            }
        }
        e4 = null;
        HashMap hashMap = new HashMap();
        for (C0537n c0537n : CollectionsKt.reversed(mutableList)) {
            androidx.lifecycle.B b4 = c0537n.f8015m;
            E e6 = c0537n.f8006b;
            androidx.lifecycle.B b5 = androidx.lifecycle.B.f3284e;
            androidx.lifecycle.B b6 = androidx.lifecycle.B.f3283d;
            if (e5 != null && e6.h == e5.h) {
                if (b4 != b5) {
                    C0540q c0540q = (C0540q) this.f8067w.get(this.f8066v.b(e6.f7920a));
                    if (Intrinsics.areEqual((c0540q == null || (stateFlow = c0540q.f8027f) == null || (set = (Set) stateFlow.getValue()) == null) ? null : Boolean.valueOf(set.contains(c0537n)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f8056k.get(c0537n)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(c0537n, b6);
                    } else {
                        hashMap.put(c0537n, b5);
                    }
                }
                e5 = e5.f7921b;
            } else if (e4 == null || e6.h != e4.h) {
                c0537n.a(androidx.lifecycle.B.f3282c);
            } else {
                if (b4 == b5) {
                    c0537n.a(b6);
                } else if (b4 != b6) {
                    hashMap.put(c0537n, b6);
                }
                e4 = e4.f7921b;
            }
        }
        for (C0537n c0537n2 : mutableList) {
            androidx.lifecycle.B b7 = (androidx.lifecycle.B) hashMap.get(c0537n2);
            if (b7 != null) {
                c0537n2.a(b7);
            } else {
                c0537n2.b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (h() > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z() {
        /*
            r2 = this;
            boolean r0 = r2.f8065u
            if (r0 == 0) goto Lc
            int r0 = r2.h()
            r1 = 1
            if (r0 <= r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            b.C r2 = r2.f8064t
            r2.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.AbstractC0544v.z():void");
    }
}
