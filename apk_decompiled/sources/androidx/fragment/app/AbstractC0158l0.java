package androidx.fragment.app;

import O.InterfaceC0070k;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.adif.elcanomovil.R;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import d.AbstractC0300i;
import d.C0299h;
import d.InterfaceC0301j;
import i0.AbstractC0383d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import l0.C0435a;
import v0.C0639d;

/* renamed from: androidx.fragment.app.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0158l0 {

    /* renamed from: C, reason: collision with root package name */
    public C0299h f3145C;

    /* renamed from: D, reason: collision with root package name */
    public C0299h f3146D;

    /* renamed from: E, reason: collision with root package name */
    public C0299h f3147E;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3149G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f3150H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f3151I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f3152K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f3153L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f3154M;

    /* renamed from: N, reason: collision with root package name */
    public ArrayList f3155N;

    /* renamed from: O, reason: collision with root package name */
    public C0166p0 f3156O;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3159b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3162e;

    /* renamed from: g, reason: collision with root package name */
    public b.B f3164g;

    /* renamed from: q, reason: collision with root package name */
    public final Z f3171q;

    /* renamed from: r, reason: collision with root package name */
    public final Z f3172r;

    /* renamed from: s, reason: collision with root package name */
    public final Z f3173s;

    /* renamed from: t, reason: collision with root package name */
    public final Z f3174t;

    /* renamed from: w, reason: collision with root package name */
    public V f3177w;

    /* renamed from: x, reason: collision with root package name */
    public T f3178x;

    /* renamed from: y, reason: collision with root package name */
    public K f3179y;

    /* renamed from: z, reason: collision with root package name */
    public K f3180z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3158a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final u0 f3160c = new u0();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3161d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final X f3163f = new X(this);
    public C0135a h = null;
    public final C0138b0 i = new C0138b0(this);

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f3165j = new AtomicInteger();

    /* renamed from: k, reason: collision with root package name */
    public final Map f3166k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    public final Map f3167l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final Map f3168m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3169n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final Q f3170o = new Q(this);
    public final CopyOnWriteArrayList p = new CopyOnWriteArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final C0140c0 f3175u = new C0140c0(this);

    /* renamed from: v, reason: collision with root package name */
    public int f3176v = -1;

    /* renamed from: A, reason: collision with root package name */
    public final C0142d0 f3143A = new C0142d0(this);

    /* renamed from: B, reason: collision with root package name */
    public final E2.e f3144B = new E2.e(21);

    /* renamed from: F, reason: collision with root package name */
    public ArrayDeque f3148F = new ArrayDeque();

    /* renamed from: P, reason: collision with root package name */
    public final RunnableC0169t f3157P = new RunnableC0169t(this, 2);

    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.Z] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.Z] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.Z] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.Z] */
    public AbstractC0158l0() {
        final int i = 0;
        this.f3171q = new N.a(this) { // from class: androidx.fragment.app.Z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC0158l0 f3083b;

            {
                this.f3083b = this;
            }

            @Override // N.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC0158l0 abstractC0158l0 = this.f3083b;
                        if (abstractC0158l0.O()) {
                            abstractC0158l0.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0158l0 abstractC0158l02 = this.f3083b;
                        if (abstractC0158l02.O() && num.intValue() == 80) {
                            abstractC0158l02.m(false);
                            return;
                        }
                        return;
                    case 2:
                        C.n nVar = (C.n) obj;
                        AbstractC0158l0 abstractC0158l03 = this.f3083b;
                        if (abstractC0158l03.O()) {
                            abstractC0158l03.n(nVar.f236a, false);
                            return;
                        }
                        return;
                    default:
                        C.J j4 = (C.J) obj;
                        AbstractC0158l0 abstractC0158l04 = this.f3083b;
                        if (abstractC0158l04.O()) {
                            abstractC0158l04.s(j4.f232a, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i4 = 1;
        this.f3172r = new N.a(this) { // from class: androidx.fragment.app.Z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC0158l0 f3083b;

            {
                this.f3083b = this;
            }

            @Override // N.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC0158l0 abstractC0158l0 = this.f3083b;
                        if (abstractC0158l0.O()) {
                            abstractC0158l0.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0158l0 abstractC0158l02 = this.f3083b;
                        if (abstractC0158l02.O() && num.intValue() == 80) {
                            abstractC0158l02.m(false);
                            return;
                        }
                        return;
                    case 2:
                        C.n nVar = (C.n) obj;
                        AbstractC0158l0 abstractC0158l03 = this.f3083b;
                        if (abstractC0158l03.O()) {
                            abstractC0158l03.n(nVar.f236a, false);
                            return;
                        }
                        return;
                    default:
                        C.J j4 = (C.J) obj;
                        AbstractC0158l0 abstractC0158l04 = this.f3083b;
                        if (abstractC0158l04.O()) {
                            abstractC0158l04.s(j4.f232a, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i5 = 2;
        this.f3173s = new N.a(this) { // from class: androidx.fragment.app.Z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC0158l0 f3083b;

            {
                this.f3083b = this;
            }

            @Override // N.a
            public final void a(Object obj) {
                switch (i5) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC0158l0 abstractC0158l0 = this.f3083b;
                        if (abstractC0158l0.O()) {
                            abstractC0158l0.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0158l0 abstractC0158l02 = this.f3083b;
                        if (abstractC0158l02.O() && num.intValue() == 80) {
                            abstractC0158l02.m(false);
                            return;
                        }
                        return;
                    case 2:
                        C.n nVar = (C.n) obj;
                        AbstractC0158l0 abstractC0158l03 = this.f3083b;
                        if (abstractC0158l03.O()) {
                            abstractC0158l03.n(nVar.f236a, false);
                            return;
                        }
                        return;
                    default:
                        C.J j4 = (C.J) obj;
                        AbstractC0158l0 abstractC0158l04 = this.f3083b;
                        if (abstractC0158l04.O()) {
                            abstractC0158l04.s(j4.f232a, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i6 = 3;
        this.f3174t = new N.a(this) { // from class: androidx.fragment.app.Z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC0158l0 f3083b;

            {
                this.f3083b = this;
            }

            @Override // N.a
            public final void a(Object obj) {
                switch (i6) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC0158l0 abstractC0158l0 = this.f3083b;
                        if (abstractC0158l0.O()) {
                            abstractC0158l0.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC0158l0 abstractC0158l02 = this.f3083b;
                        if (abstractC0158l02.O() && num.intValue() == 80) {
                            abstractC0158l02.m(false);
                            return;
                        }
                        return;
                    case 2:
                        C.n nVar = (C.n) obj;
                        AbstractC0158l0 abstractC0158l03 = this.f3083b;
                        if (abstractC0158l03.O()) {
                            abstractC0158l03.n(nVar.f236a, false);
                            return;
                        }
                        return;
                    default:
                        C.J j4 = (C.J) obj;
                        AbstractC0158l0 abstractC0158l04 = this.f3083b;
                        if (abstractC0158l04.O()) {
                            abstractC0158l04.s(j4.f232a, false);
                            return;
                        }
                        return;
                }
            }
        };
    }

    public static HashSet H(C0135a c0135a) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < c0135a.f3257a.size(); i++) {
            K k4 = ((v0) c0135a.f3257a.get(i)).f3250b;
            if (k4 != null && c0135a.f3263g) {
                hashSet.add(k4);
            }
        }
        return hashSet;
    }

    public static boolean M(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean N(K k4) {
        if (k4.mHasMenu && k4.mMenuVisible) {
            return true;
        }
        Iterator it = k4.mChildFragmentManager.f3160c.e().iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            K k5 = (K) it.next();
            if (k5 != null) {
                z3 = N(k5);
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    public static boolean P(K k4) {
        if (k4 == null) {
            return true;
        }
        AbstractC0158l0 abstractC0158l0 = k4.mFragmentManager;
        return k4.equals(abstractC0158l0.f3180z) && P(abstractC0158l0.f3179y);
    }

    public static void h0(K k4) {
        if (M(2)) {
            Log.v("FragmentManager", "show: " + k4);
        }
        if (k4.mHidden) {
            k4.mHidden = false;
            k4.mHiddenChanged = !k4.mHiddenChanged;
        }
    }

    public final boolean A(boolean z3) {
        boolean z4;
        z(z3);
        boolean z5 = false;
        while (true) {
            ArrayList arrayList = this.f3153L;
            ArrayList arrayList2 = this.f3154M;
            synchronized (this.f3158a) {
                if (this.f3158a.isEmpty()) {
                    z4 = false;
                } else {
                    try {
                        int size = this.f3158a.size();
                        z4 = false;
                        for (int i = 0; i < size; i++) {
                            z4 |= ((InterfaceC0150h0) this.f3158a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z4) {
                k0();
                v();
                this.f3160c.f3245b.values().removeAll(Collections.singleton(null));
                return z5;
            }
            z5 = true;
            this.f3159b = true;
            try {
                Y(this.f3153L, this.f3154M);
            } finally {
                d();
            }
        }
    }

    public final void B(C0135a c0135a, boolean z3) {
        if (z3 && (this.f3177w == null || this.J)) {
            return;
        }
        z(z3);
        c0135a.a(this.f3153L, this.f3154M);
        this.f3159b = true;
        try {
            Y(this.f3153L, this.f3154M);
            d();
            k0();
            v();
            this.f3160c.f3245b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:136:0x022b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:163:0x02f2. Please report as an issue. */
    public final void C(ArrayList arrayList, ArrayList arrayList2, int i, int i4) {
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        int i8;
        boolean z5;
        int i9;
        int i10;
        int i11 = i;
        boolean z6 = ((C0135a) arrayList.get(i11)).p;
        ArrayList arrayList3 = this.f3155N;
        if (arrayList3 == null) {
            this.f3155N = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f3155N;
        u0 u0Var = this.f3160c;
        arrayList4.addAll(u0Var.f());
        K k4 = this.f3180z;
        int i12 = i11;
        boolean z7 = false;
        while (true) {
            int i13 = 1;
            if (i12 >= i4) {
                boolean z8 = z6;
                boolean z9 = z7;
                this.f3155N.clear();
                if (!z8 && this.f3176v >= 1) {
                    for (int i14 = i11; i14 < i4; i14++) {
                        Iterator it = ((C0135a) arrayList.get(i14)).f3257a.iterator();
                        while (it.hasNext()) {
                            K k5 = ((v0) it.next()).f3250b;
                            if (k5 != null && k5.mFragmentManager != null) {
                                u0Var.g(g(k5));
                            }
                        }
                    }
                }
                int i15 = i11;
                while (i15 < i4) {
                    C0135a c0135a = (C0135a) arrayList.get(i15);
                    if (((Boolean) arrayList2.get(i15)).booleanValue()) {
                        c0135a.d(-1);
                        ArrayList arrayList5 = c0135a.f3257a;
                        boolean z10 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            v0 v0Var = (v0) arrayList5.get(size);
                            K k6 = v0Var.f3250b;
                            if (k6 != null) {
                                k6.mBeingSaved = c0135a.f3087t;
                                k6.setPopDirection(z10);
                                int i16 = c0135a.f3262f;
                                int i17 = 8194;
                                int i18 = 4097;
                                if (i16 != 4097) {
                                    if (i16 != 8194) {
                                        i17 = 4100;
                                        i18 = 8197;
                                        if (i16 != 8197) {
                                            if (i16 == 4099) {
                                                i17 = 4099;
                                            } else if (i16 != 4100) {
                                                i17 = 0;
                                            }
                                        }
                                    }
                                    i17 = i18;
                                }
                                k6.setNextTransition(i17);
                                k6.setSharedElementNames(c0135a.f3269o, c0135a.f3268n);
                            }
                            int i19 = v0Var.f3249a;
                            AbstractC0158l0 abstractC0158l0 = c0135a.f3084q;
                            switch (i19) {
                                case 1:
                                    k6.setAnimations(v0Var.f3252d, v0Var.f3253e, v0Var.f3254f, v0Var.f3255g);
                                    z10 = true;
                                    abstractC0158l0.d0(k6, true);
                                    abstractC0158l0.X(k6);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + v0Var.f3249a);
                                case 3:
                                    k6.setAnimations(v0Var.f3252d, v0Var.f3253e, v0Var.f3254f, v0Var.f3255g);
                                    abstractC0158l0.a(k6);
                                    z10 = true;
                                case 4:
                                    k6.setAnimations(v0Var.f3252d, v0Var.f3253e, v0Var.f3254f, v0Var.f3255g);
                                    abstractC0158l0.getClass();
                                    h0(k6);
                                    z10 = true;
                                case 5:
                                    k6.setAnimations(v0Var.f3252d, v0Var.f3253e, v0Var.f3254f, v0Var.f3255g);
                                    abstractC0158l0.d0(k6, true);
                                    abstractC0158l0.L(k6);
                                    z10 = true;
                                case 6:
                                    k6.setAnimations(v0Var.f3252d, v0Var.f3253e, v0Var.f3254f, v0Var.f3255g);
                                    abstractC0158l0.c(k6);
                                    z10 = true;
                                case 7:
                                    k6.setAnimations(v0Var.f3252d, v0Var.f3253e, v0Var.f3254f, v0Var.f3255g);
                                    abstractC0158l0.d0(k6, true);
                                    abstractC0158l0.h(k6);
                                    z10 = true;
                                case 8:
                                    abstractC0158l0.f0(null);
                                    z10 = true;
                                case 9:
                                    abstractC0158l0.f0(k6);
                                    z10 = true;
                                case 10:
                                    abstractC0158l0.e0(k6, v0Var.h);
                                    z10 = true;
                            }
                        }
                    } else {
                        c0135a.d(1);
                        ArrayList arrayList6 = c0135a.f3257a;
                        int size2 = arrayList6.size();
                        int i20 = 0;
                        while (i20 < size2) {
                            v0 v0Var2 = (v0) arrayList6.get(i20);
                            K k7 = v0Var2.f3250b;
                            if (k7 != null) {
                                k7.mBeingSaved = c0135a.f3087t;
                                k7.setPopDirection(false);
                                k7.setNextTransition(c0135a.f3262f);
                                k7.setSharedElementNames(c0135a.f3268n, c0135a.f3269o);
                            }
                            int i21 = v0Var2.f3249a;
                            AbstractC0158l0 abstractC0158l02 = c0135a.f3084q;
                            switch (i21) {
                                case 1:
                                    i5 = i15;
                                    k7.setAnimations(v0Var2.f3252d, v0Var2.f3253e, v0Var2.f3254f, v0Var2.f3255g);
                                    abstractC0158l02.d0(k7, false);
                                    abstractC0158l02.a(k7);
                                    i20++;
                                    i15 = i5;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + v0Var2.f3249a);
                                case 3:
                                    i5 = i15;
                                    k7.setAnimations(v0Var2.f3252d, v0Var2.f3253e, v0Var2.f3254f, v0Var2.f3255g);
                                    abstractC0158l02.X(k7);
                                    i20++;
                                    i15 = i5;
                                case 4:
                                    i5 = i15;
                                    k7.setAnimations(v0Var2.f3252d, v0Var2.f3253e, v0Var2.f3254f, v0Var2.f3255g);
                                    abstractC0158l02.L(k7);
                                    i20++;
                                    i15 = i5;
                                case 5:
                                    i5 = i15;
                                    k7.setAnimations(v0Var2.f3252d, v0Var2.f3253e, v0Var2.f3254f, v0Var2.f3255g);
                                    abstractC0158l02.d0(k7, false);
                                    h0(k7);
                                    i20++;
                                    i15 = i5;
                                case 6:
                                    i5 = i15;
                                    k7.setAnimations(v0Var2.f3252d, v0Var2.f3253e, v0Var2.f3254f, v0Var2.f3255g);
                                    abstractC0158l02.h(k7);
                                    i20++;
                                    i15 = i5;
                                case 7:
                                    i5 = i15;
                                    k7.setAnimations(v0Var2.f3252d, v0Var2.f3253e, v0Var2.f3254f, v0Var2.f3255g);
                                    abstractC0158l02.d0(k7, false);
                                    abstractC0158l02.c(k7);
                                    i20++;
                                    i15 = i5;
                                case 8:
                                    abstractC0158l02.f0(k7);
                                    i5 = i15;
                                    i20++;
                                    i15 = i5;
                                case 9:
                                    abstractC0158l02.f0(null);
                                    i5 = i15;
                                    i20++;
                                    i15 = i5;
                                case 10:
                                    abstractC0158l02.e0(k7, v0Var2.i);
                                    i5 = i15;
                                    i20++;
                                    i15 = i5;
                            }
                        }
                    }
                    i15++;
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i4 - 1)).booleanValue();
                ArrayList arrayList7 = this.f3169n;
                if (z9 && !arrayList7.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(H((C0135a) it2.next()));
                    }
                    if (this.h == null) {
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                throw new ClassCastException();
                            }
                            Iterator it4 = linkedHashSet.iterator();
                            if (it4.hasNext()) {
                                throw null;
                            }
                        }
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            if (it5.next() != null) {
                                throw new ClassCastException();
                            }
                            Iterator it6 = linkedHashSet.iterator();
                            if (it6.hasNext()) {
                                throw null;
                            }
                        }
                    }
                }
                for (int i22 = i11; i22 < i4; i22++) {
                    C0135a c0135a2 = (C0135a) arrayList.get(i22);
                    if (booleanValue) {
                        for (int size3 = c0135a2.f3257a.size() - 1; size3 >= 0; size3--) {
                            K k8 = ((v0) c0135a2.f3257a.get(size3)).f3250b;
                            if (k8 != null) {
                                g(k8).k();
                            }
                        }
                    } else {
                        Iterator it7 = c0135a2.f3257a.iterator();
                        while (it7.hasNext()) {
                            K k9 = ((v0) it7.next()).f3250b;
                            if (k9 != null) {
                                g(k9).k();
                            }
                        }
                    }
                }
                R(this.f3176v, true);
                Iterator it8 = f(arrayList, i11, i4).iterator();
                while (it8.hasNext()) {
                    O0 o02 = (O0) it8.next();
                    o02.f3064d = booleanValue;
                    o02.n();
                    o02.i();
                }
                while (i11 < i4) {
                    C0135a c0135a3 = (C0135a) arrayList.get(i11);
                    if (((Boolean) arrayList2.get(i11)).booleanValue() && c0135a3.f3086s >= 0) {
                        c0135a3.f3086s = -1;
                    }
                    c0135a3.getClass();
                    i11++;
                }
                if (!z9 || arrayList7.size() <= 0) {
                    return;
                }
                arrayList7.get(0).getClass();
                throw new ClassCastException();
            }
            C0135a c0135a4 = (C0135a) arrayList.get(i12);
            if (((Boolean) arrayList2.get(i12)).booleanValue()) {
                z3 = z6;
                i6 = i12;
                z4 = z7;
                int i23 = 1;
                ArrayList arrayList8 = this.f3155N;
                ArrayList arrayList9 = c0135a4.f3257a;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    v0 v0Var3 = (v0) arrayList9.get(size4);
                    int i24 = v0Var3.f3249a;
                    if (i24 != i23) {
                        if (i24 != 3) {
                            switch (i24) {
                                case 8:
                                    k4 = null;
                                    break;
                                case 9:
                                    k4 = v0Var3.f3250b;
                                    break;
                                case 10:
                                    v0Var3.i = v0Var3.h;
                                    break;
                            }
                            size4--;
                            i23 = 1;
                        }
                        arrayList8.add(v0Var3.f3250b);
                        size4--;
                        i23 = 1;
                    }
                    arrayList8.remove(v0Var3.f3250b);
                    size4--;
                    i23 = 1;
                }
            } else {
                ArrayList arrayList10 = this.f3155N;
                int i25 = 0;
                while (true) {
                    ArrayList arrayList11 = c0135a4.f3257a;
                    if (i25 < arrayList11.size()) {
                        v0 v0Var4 = (v0) arrayList11.get(i25);
                        boolean z11 = z6;
                        int i26 = v0Var4.f3249a;
                        if (i26 != i13) {
                            i7 = i12;
                            if (i26 != 2) {
                                if (i26 == 3 || i26 == 6) {
                                    arrayList10.remove(v0Var4.f3250b);
                                    K k10 = v0Var4.f3250b;
                                    if (k10 == k4) {
                                        arrayList11.add(i25, new v0(k10, 9));
                                        i25++;
                                        z5 = z7;
                                        k4 = null;
                                        i8 = 1;
                                    }
                                } else if (i26 == 7) {
                                    i8 = 1;
                                } else if (i26 == 8) {
                                    arrayList11.add(i25, new v0(k4, 9, 0));
                                    v0Var4.f3251c = true;
                                    i25++;
                                    k4 = v0Var4.f3250b;
                                }
                                z5 = z7;
                                i8 = 1;
                            } else {
                                K k11 = v0Var4.f3250b;
                                int i27 = k11.mContainerId;
                                int size5 = arrayList10.size() - 1;
                                boolean z12 = false;
                                while (size5 >= 0) {
                                    int i28 = size5;
                                    K k12 = (K) arrayList10.get(size5);
                                    boolean z13 = z7;
                                    if (k12.mContainerId != i27) {
                                        i9 = i27;
                                    } else if (k12 == k11) {
                                        i9 = i27;
                                        z12 = true;
                                    } else {
                                        if (k12 == k4) {
                                            i9 = i27;
                                            i10 = 0;
                                            arrayList11.add(i25, new v0(k12, 9, 0));
                                            i25++;
                                            k4 = null;
                                        } else {
                                            i9 = i27;
                                            i10 = 0;
                                        }
                                        v0 v0Var5 = new v0(k12, 3, i10);
                                        v0Var5.f3252d = v0Var4.f3252d;
                                        v0Var5.f3254f = v0Var4.f3254f;
                                        v0Var5.f3253e = v0Var4.f3253e;
                                        v0Var5.f3255g = v0Var4.f3255g;
                                        arrayList11.add(i25, v0Var5);
                                        arrayList10.remove(k12);
                                        i25++;
                                        k4 = k4;
                                    }
                                    size5 = i28 - 1;
                                    i27 = i9;
                                    z7 = z13;
                                }
                                z5 = z7;
                                i8 = 1;
                                if (z12) {
                                    arrayList11.remove(i25);
                                    i25--;
                                } else {
                                    v0Var4.f3249a = 1;
                                    v0Var4.f3251c = true;
                                    arrayList10.add(k11);
                                }
                            }
                            i25 += i8;
                            i13 = i8;
                            z6 = z11;
                            i12 = i7;
                            z7 = z5;
                        } else {
                            i7 = i12;
                            i8 = i13;
                        }
                        z5 = z7;
                        arrayList10.add(v0Var4.f3250b);
                        i25 += i8;
                        i13 = i8;
                        z6 = z11;
                        i12 = i7;
                        z7 = z5;
                    } else {
                        z3 = z6;
                        i6 = i12;
                        z4 = z7;
                    }
                }
            }
            z7 = z4 || c0135a4.f3263g;
            i12 = i6 + 1;
            z6 = z3;
        }
    }

    public final int D(String str, int i, boolean z3) {
        if (this.f3161d.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z3) {
                return 0;
            }
            return this.f3161d.size() - 1;
        }
        int size = this.f3161d.size() - 1;
        while (size >= 0) {
            C0135a c0135a = (C0135a) this.f3161d.get(size);
            if ((str != null && str.equals(c0135a.i)) || (i >= 0 && i == c0135a.f3086s)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z3) {
            if (size == this.f3161d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C0135a c0135a2 = (C0135a) this.f3161d.get(size - 1);
            if ((str == null || !str.equals(c0135a2.i)) && (i < 0 || i != c0135a2.f3086s)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final K E(int i) {
        u0 u0Var = this.f3160c;
        ArrayList arrayList = u0Var.f3244a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            K k4 = (K) arrayList.get(size);
            if (k4 != null && k4.mFragmentId == i) {
                return k4;
            }
        }
        for (t0 t0Var : u0Var.f3245b.values()) {
            if (t0Var != null) {
                K k5 = t0Var.f3240c;
                if (k5.mFragmentId == i) {
                    return k5;
                }
            }
        }
        return null;
    }

    public final K F(String str) {
        u0 u0Var = this.f3160c;
        if (str != null) {
            ArrayList arrayList = u0Var.f3244a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                K k4 = (K) arrayList.get(size);
                if (k4 != null && str.equals(k4.mTag)) {
                    return k4;
                }
            }
        }
        if (str == null) {
            u0Var.getClass();
            return null;
        }
        for (t0 t0Var : u0Var.f3245b.values()) {
            if (t0Var != null) {
                K k5 = t0Var.f3240c;
                if (str.equals(k5.mTag)) {
                    return k5;
                }
            }
        }
        return null;
    }

    public final void G() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            O0 o02 = (O0) it.next();
            if (o02.f3065e) {
                if (M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                o02.f3065e = false;
                o02.i();
            }
        }
    }

    public final ViewGroup I(K k4) {
        ViewGroup viewGroup = k4.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (k4.mContainerId <= 0 || !this.f3178x.c()) {
            return null;
        }
        View b4 = this.f3178x.b(k4.mContainerId);
        if (b4 instanceof ViewGroup) {
            return (ViewGroup) b4;
        }
        return null;
    }

    public final C0142d0 J() {
        K k4 = this.f3179y;
        return k4 != null ? k4.mFragmentManager.J() : this.f3143A;
    }

    public final E2.e K() {
        K k4 = this.f3179y;
        return k4 != null ? k4.mFragmentManager.K() : this.f3144B;
    }

    public final void L(K k4) {
        if (M(2)) {
            Log.v("FragmentManager", "hide: " + k4);
        }
        if (k4.mHidden) {
            return;
        }
        k4.mHidden = true;
        k4.mHiddenChanged = true ^ k4.mHiddenChanged;
        g0(k4);
    }

    public final boolean O() {
        K k4 = this.f3179y;
        if (k4 == null) {
            return true;
        }
        return k4.isAdded() && this.f3179y.getParentFragmentManager().O();
    }

    public final boolean Q() {
        return this.f3150H || this.f3151I;
    }

    public final void R(int i, boolean z3) {
        HashMap hashMap;
        V v3;
        if (this.f3177w == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z3 || i != this.f3176v) {
            this.f3176v = i;
            u0 u0Var = this.f3160c;
            Iterator it = u0Var.f3244a.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = u0Var.f3245b;
                if (!hasNext) {
                    break;
                }
                t0 t0Var = (t0) hashMap.get(((K) it.next()).mWho);
                if (t0Var != null) {
                    t0Var.k();
                }
            }
            for (t0 t0Var2 : hashMap.values()) {
                if (t0Var2 != null) {
                    t0Var2.k();
                    K k4 = t0Var2.f3240c;
                    if (k4.mRemoving && !k4.isInBackStack()) {
                        if (k4.mBeingSaved && !u0Var.f3246c.containsKey(k4.mWho)) {
                            u0Var.i(t0Var2.n(), k4.mWho);
                        }
                        u0Var.h(t0Var2);
                    }
                }
            }
            i0();
            if (this.f3149G && (v3 = this.f3177w) != null && this.f3176v == 7) {
                ((O) v3).f3060e.invalidateMenu();
                this.f3149G = false;
            }
        }
    }

    public final void S() {
        if (this.f3177w == null) {
            return;
        }
        this.f3150H = false;
        this.f3151I = false;
        this.f3156O.f3207f = false;
        for (K k4 : this.f3160c.f()) {
            if (k4 != null) {
                k4.noteStateNotSaved();
            }
        }
    }

    public final boolean T() {
        return U(-1, 0);
    }

    public final boolean U(int i, int i4) {
        A(false);
        z(true);
        K k4 = this.f3180z;
        if (k4 != null && i < 0 && k4.getChildFragmentManager().T()) {
            return true;
        }
        boolean V3 = V(this.f3153L, this.f3154M, null, i, i4);
        if (V3) {
            this.f3159b = true;
            try {
                Y(this.f3153L, this.f3154M);
            } finally {
                d();
            }
        }
        k0();
        v();
        this.f3160c.f3245b.values().removeAll(Collections.singleton(null));
        return V3;
    }

    public final boolean V(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i4) {
        int D3 = D(str, i, (i4 & 1) != 0);
        if (D3 < 0) {
            return false;
        }
        for (int size = this.f3161d.size() - 1; size >= D3; size--) {
            arrayList.add((C0135a) this.f3161d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void W(Bundle bundle, String str, K k4) {
        if (k4.mFragmentManager == this) {
            bundle.putString(str, k4.mWho);
        } else {
            j0(new IllegalStateException(C.w.m("Fragment ", k4, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void X(K k4) {
        if (M(2)) {
            Log.v("FragmentManager", "remove: " + k4 + " nesting=" + k4.mBackStackNesting);
        }
        boolean isInBackStack = k4.isInBackStack();
        if (k4.mDetached && isInBackStack) {
            return;
        }
        u0 u0Var = this.f3160c;
        synchronized (u0Var.f3244a) {
            u0Var.f3244a.remove(k4);
        }
        k4.mAdded = false;
        if (N(k4)) {
            this.f3149G = true;
        }
        k4.mRemoving = true;
        g0(k4);
    }

    public final void Y(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i4 = 0;
        while (i < size) {
            if (!((C0135a) arrayList.get(i)).p) {
                if (i4 != i) {
                    C(arrayList, arrayList2, i4, i);
                }
                i4 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i4 < size && ((Boolean) arrayList2.get(i4)).booleanValue() && !((C0135a) arrayList.get(i4)).p) {
                        i4++;
                    }
                }
                C(arrayList, arrayList2, i, i4);
                i = i4 - 1;
            }
            i++;
        }
        if (i4 != size) {
            C(arrayList, arrayList2, i4, size);
        }
    }

    public final void Z(Bundle bundle) {
        Q q4;
        t0 t0Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f3177w.f3075b.getClassLoader());
                this.f3167l.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f3177w.f3075b.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        u0 u0Var = this.f3160c;
        HashMap hashMap2 = u0Var.f3246c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        C0162n0 c0162n0 = (C0162n0) bundle.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE);
        if (c0162n0 == null) {
            return;
        }
        HashMap hashMap3 = u0Var.f3245b;
        hashMap3.clear();
        Iterator it = c0162n0.f3185a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            q4 = this.f3170o;
            if (!hasNext) {
                break;
            }
            Bundle i = u0Var.i(null, (String) it.next());
            if (i != null) {
                K k4 = (K) this.f3156O.f3202a.get(((r0) i.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE)).f3224b);
                if (k4 != null) {
                    if (M(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + k4);
                    }
                    t0Var = new t0(q4, u0Var, k4, i);
                } else {
                    t0Var = new t0(this.f3170o, this.f3160c, this.f3177w.f3075b.getClassLoader(), J(), i);
                }
                K k5 = t0Var.f3240c;
                k5.mSavedFragmentState = i;
                k5.mFragmentManager = this;
                if (M(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k5.mWho + "): " + k5);
                }
                t0Var.l(this.f3177w.f3075b.getClassLoader());
                u0Var.g(t0Var);
                t0Var.f3242e = this.f3176v;
            }
        }
        C0166p0 c0166p0 = this.f3156O;
        c0166p0.getClass();
        Iterator it2 = new ArrayList(c0166p0.f3202a.values()).iterator();
        while (it2.hasNext()) {
            K k6 = (K) it2.next();
            if (hashMap3.get(k6.mWho) == null) {
                if (M(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + k6 + " that was not found in the set of active Fragments " + c0162n0.f3185a);
                }
                this.f3156O.g(k6);
                k6.mFragmentManager = this;
                t0 t0Var2 = new t0(q4, u0Var, k6);
                t0Var2.f3242e = 1;
                t0Var2.k();
                k6.mRemoving = true;
                t0Var2.k();
            }
        }
        ArrayList<String> arrayList = c0162n0.f3186b;
        u0Var.f3244a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                K b4 = u0Var.b(str3);
                if (b4 == null) {
                    throw new IllegalStateException(C.w.o("No instantiated fragment for (", str3, ")"));
                }
                if (M(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b4);
                }
                u0Var.a(b4);
            }
        }
        if (c0162n0.f3187c != null) {
            this.f3161d = new ArrayList(c0162n0.f3187c.length);
            int i4 = 0;
            while (true) {
                C0137b[] c0137bArr = c0162n0.f3187c;
                if (i4 >= c0137bArr.length) {
                    break;
                }
                C0137b c0137b = c0137bArr[i4];
                c0137b.getClass();
                C0135a c0135a = new C0135a(this);
                c0137b.a(c0135a);
                c0135a.f3086s = c0137b.f3096g;
                int i5 = 0;
                while (true) {
                    ArrayList arrayList2 = c0137b.f3091b;
                    if (i5 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i5);
                    if (str4 != null) {
                        ((v0) c0135a.f3257a.get(i5)).f3250b = u0Var.b(str4);
                    }
                    i5++;
                }
                c0135a.d(1);
                if (M(2)) {
                    StringBuilder t2 = C.w.t(i4, "restoreAllState: back stack #", " (index ");
                    t2.append(c0135a.f3086s);
                    t2.append("): ");
                    t2.append(c0135a);
                    Log.v("FragmentManager", t2.toString());
                    PrintWriter printWriter = new PrintWriter(new G0());
                    c0135a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3161d.add(c0135a);
                i4++;
            }
        } else {
            this.f3161d = new ArrayList();
        }
        this.f3165j.set(c0162n0.f3188d);
        String str5 = c0162n0.f3189e;
        if (str5 != null) {
            K b5 = u0Var.b(str5);
            this.f3180z = b5;
            r(b5);
        }
        ArrayList arrayList3 = c0162n0.f3190f;
        if (arrayList3 != null) {
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                this.f3166k.put((String) arrayList3.get(i6), (C0139c) c0162n0.f3191g.get(i6));
            }
        }
        this.f3148F = new ArrayDeque(c0162n0.h);
    }

    public final t0 a(K k4) {
        String str = k4.mPreviousWho;
        if (str != null) {
            AbstractC0383d.d(k4, str);
        }
        if (M(2)) {
            Log.v("FragmentManager", "add: " + k4);
        }
        t0 g4 = g(k4);
        k4.mFragmentManager = this;
        u0 u0Var = this.f3160c;
        u0Var.g(g4);
        if (!k4.mDetached) {
            u0Var.a(k4);
            k4.mRemoving = false;
            if (k4.mView == null) {
                k4.mHiddenChanged = false;
            }
            if (N(k4)) {
                this.f3149G = true;
            }
        }
        return g4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.os.Parcelable, androidx.fragment.app.n0, java.lang.Object] */
    public final Bundle a0() {
        ArrayList arrayList;
        C0137b[] c0137bArr;
        Bundle bundle = new Bundle();
        G();
        x();
        A(true);
        this.f3150H = true;
        this.f3156O.f3207f = true;
        u0 u0Var = this.f3160c;
        u0Var.getClass();
        HashMap hashMap = u0Var.f3245b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (t0 t0Var : hashMap.values()) {
            if (t0Var != null) {
                K k4 = t0Var.f3240c;
                u0Var.i(t0Var.n(), k4.mWho);
                arrayList2.add(k4.mWho);
                if (M(2)) {
                    Log.v("FragmentManager", "Saved state of " + k4 + ": " + k4.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.f3160c.f3246c;
        if (!hashMap2.isEmpty()) {
            u0 u0Var2 = this.f3160c;
            synchronized (u0Var2.f3244a) {
                try {
                    if (u0Var2.f3244a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(u0Var2.f3244a.size());
                        Iterator it = u0Var2.f3244a.iterator();
                        while (it.hasNext()) {
                            K k5 = (K) it.next();
                            arrayList.add(k5.mWho);
                            if (M(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + k5.mWho + "): " + k5);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.f3161d.size();
            if (size > 0) {
                c0137bArr = new C0137b[size];
                for (int i = 0; i < size; i++) {
                    c0137bArr[i] = new C0137b((C0135a) this.f3161d.get(i));
                    if (M(2)) {
                        StringBuilder t2 = C.w.t(i, "saveAllState: adding back stack #", ": ");
                        t2.append(this.f3161d.get(i));
                        Log.v("FragmentManager", t2.toString());
                    }
                }
            } else {
                c0137bArr = null;
            }
            ?? obj = new Object();
            obj.f3189e = null;
            ArrayList arrayList3 = new ArrayList();
            obj.f3190f = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            obj.f3191g = arrayList4;
            obj.f3185a = arrayList2;
            obj.f3186b = arrayList;
            obj.f3187c = c0137bArr;
            obj.f3188d = this.f3165j.get();
            K k6 = this.f3180z;
            if (k6 != null) {
                obj.f3189e = k6.mWho;
            }
            arrayList3.addAll(this.f3166k.keySet());
            arrayList4.addAll(this.f3166k.values());
            obj.h = new ArrayList(this.f3148F);
            bundle.putParcelable(RemoteConfigConstants.ResponseFieldKey.STATE, obj);
            for (String str : this.f3167l.keySet()) {
                bundle.putBundle(C.w.z("result_", str), (Bundle) this.f3167l.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(C.w.z("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        } else if (M(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(V v3, T t2, K k4) {
        if (this.f3177w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f3177w = v3;
        this.f3178x = t2;
        this.f3179y = k4;
        CopyOnWriteArrayList copyOnWriteArrayList = this.p;
        if (k4 != null) {
            copyOnWriteArrayList.add(new C0144e0(k4));
        } else if (v3 instanceof q0) {
            copyOnWriteArrayList.add((q0) v3);
        }
        if (this.f3179y != null) {
            k0();
        }
        if (v3 instanceof b.D) {
            b.D d4 = (b.D) v3;
            b.B onBackPressedDispatcher = d4.getOnBackPressedDispatcher();
            this.f3164g = onBackPressedDispatcher;
            androidx.lifecycle.J j4 = d4;
            if (k4 != null) {
                j4 = k4;
            }
            onBackPressedDispatcher.a(j4, this.i);
        }
        if (k4 != null) {
            C0166p0 c0166p0 = k4.mFragmentManager.f3156O;
            HashMap hashMap = c0166p0.f3203b;
            C0166p0 c0166p02 = (C0166p0) hashMap.get(k4.mWho);
            if (c0166p02 == null) {
                c0166p02 = new C0166p0(c0166p0.f3205d);
                hashMap.put(k4.mWho, c0166p02);
            }
            this.f3156O = c0166p02;
        } else if (v3 instanceof androidx.lifecycle.D0) {
            androidx.lifecycle.C0 store = ((androidx.lifecycle.D0) v3).getViewModelStore();
            C0164o0 factory = C0166p0.f3201g;
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            C0435a defaultCreationExtras = C0435a.f7312b;
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
            R0.h hVar = new R0.h(store, (androidx.lifecycle.y0) factory, (l0.c) defaultCreationExtras);
            Intrinsics.checkNotNullParameter(C0166p0.class, "modelClass");
            KClass modelClass = JvmClassMappingKt.getKotlinClass(C0166p0.class);
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(modelClass, "<this>");
            String qualifiedName = modelClass.getQualifiedName();
            if (qualifiedName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f3156O = (C0166p0) hVar.i(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName));
        } else {
            this.f3156O = new C0166p0(false);
        }
        this.f3156O.f3207f = Q();
        this.f3160c.f3247d = this.f3156O;
        Object obj = this.f3177w;
        if ((obj instanceof v0.f) && k4 == null) {
            C0639d savedStateRegistry = ((v0.f) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new L(this, 1));
            Bundle a2 = savedStateRegistry.a("android:support:fragments");
            if (a2 != null) {
                Z(a2);
            }
        }
        Object obj2 = this.f3177w;
        if (obj2 instanceof InterfaceC0301j) {
            AbstractC0300i activityResultRegistry = ((InterfaceC0301j) obj2).getActivityResultRegistry();
            String z3 = C.w.z("FragmentManager:", k4 != null ? C.w.r(new StringBuilder(), k4.mWho, ":") : "");
            this.f3145C = activityResultRegistry.d(C.w.n(z3, "StartActivityForResult"), new C0146f0(3), new C0136a0(this, 1));
            this.f3146D = activityResultRegistry.d(C.w.n(z3, "StartIntentSenderForResult"), new C0146f0(0), new C0136a0(this, 2));
            this.f3147E = activityResultRegistry.d(C.w.n(z3, "RequestPermissions"), new C0146f0(1), new C0136a0(this, 0));
        }
        Object obj3 = this.f3177w;
        if (obj3 instanceof D.l) {
            ((D.l) obj3).addOnConfigurationChangedListener(this.f3171q);
        }
        Object obj4 = this.f3177w;
        if (obj4 instanceof D.m) {
            ((D.m) obj4).addOnTrimMemoryListener(this.f3172r);
        }
        Object obj5 = this.f3177w;
        if (obj5 instanceof C.H) {
            ((C.H) obj5).addOnMultiWindowModeChangedListener(this.f3173s);
        }
        Object obj6 = this.f3177w;
        if (obj6 instanceof C.I) {
            ((C.I) obj6).addOnPictureInPictureModeChangedListener(this.f3174t);
        }
        Object obj7 = this.f3177w;
        if ((obj7 instanceof InterfaceC0070k) && k4 == null) {
            ((InterfaceC0070k) obj7).addMenuProvider(this.f3175u);
        }
    }

    public final J b0(K k4) {
        t0 t0Var = (t0) this.f3160c.f3245b.get(k4.mWho);
        if (t0Var != null) {
            K k5 = t0Var.f3240c;
            if (k5.equals(k4)) {
                if (k5.mState > -1) {
                    return new J(t0Var.n());
                }
                return null;
            }
        }
        j0(new IllegalStateException(C.w.m("Fragment ", k4, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void c(K k4) {
        if (M(2)) {
            Log.v("FragmentManager", "attach: " + k4);
        }
        if (k4.mDetached) {
            k4.mDetached = false;
            if (k4.mAdded) {
                return;
            }
            this.f3160c.a(k4);
            if (M(2)) {
                Log.v("FragmentManager", "add from attach: " + k4);
            }
            if (N(k4)) {
                this.f3149G = true;
            }
        }
    }

    public final void c0() {
        synchronized (this.f3158a) {
            try {
                if (this.f3158a.size() == 1) {
                    this.f3177w.f3076c.removeCallbacks(this.f3157P);
                    this.f3177w.f3076c.post(this.f3157P);
                    k0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.f3159b = false;
        this.f3154M.clear();
        this.f3153L.clear();
    }

    public final void d0(K k4, boolean z3) {
        ViewGroup I3 = I(k4);
        if (I3 == null || !(I3 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) I3).setDrawDisappearingViewsLast(!z3);
    }

    public final HashSet e() {
        O0 o02;
        HashSet hashSet = new HashSet();
        Iterator it = this.f3160c.d().iterator();
        while (it.hasNext()) {
            ViewGroup container = ((t0) it.next()).f3240c.mContainer;
            if (container != null) {
                E2.e factory = K();
                Intrinsics.checkNotNullParameter(container, "container");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object tag = container.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof O0) {
                    o02 = (O0) tag;
                } else {
                    factory.getClass();
                    Intrinsics.checkNotNullParameter(container, "container");
                    o02 = new O0(container);
                    Intrinsics.checkNotNullExpressionValue(o02, "factory.createController(container)");
                    container.setTag(R.id.special_effects_controller_view_tag, o02);
                }
                hashSet.add(o02);
            }
        }
        return hashSet;
    }

    public final void e0(K k4, androidx.lifecycle.B b4) {
        if (k4.equals(this.f3160c.b(k4.mWho)) && (k4.mHost == null || k4.mFragmentManager == this)) {
            k4.mMaxState = b4;
            return;
        }
        throw new IllegalArgumentException("Fragment " + k4 + " is not an active fragment of FragmentManager " + this);
    }

    public final HashSet f(ArrayList arrayList, int i, int i4) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i4) {
            Iterator it = ((C0135a) arrayList.get(i)).f3257a.iterator();
            while (it.hasNext()) {
                K k4 = ((v0) it.next()).f3250b;
                if (k4 != null && (viewGroup = k4.mContainer) != null) {
                    hashSet.add(O0.m(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void f0(K k4) {
        if (k4 != null) {
            if (!k4.equals(this.f3160c.b(k4.mWho)) || (k4.mHost != null && k4.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + k4 + " is not an active fragment of FragmentManager " + this);
            }
        }
        K k5 = this.f3180z;
        this.f3180z = k4;
        r(k5);
        r(this.f3180z);
    }

    public final t0 g(K k4) {
        String str = k4.mWho;
        u0 u0Var = this.f3160c;
        t0 t0Var = (t0) u0Var.f3245b.get(str);
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0Var2 = new t0(this.f3170o, u0Var, k4);
        t0Var2.l(this.f3177w.f3075b.getClassLoader());
        t0Var2.f3242e = this.f3176v;
        return t0Var2;
    }

    public final void g0(K k4) {
        ViewGroup I3 = I(k4);
        if (I3 != null) {
            if (k4.getPopExitAnim() + k4.getPopEnterAnim() + k4.getExitAnim() + k4.getEnterAnim() > 0) {
                if (I3.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    I3.setTag(R.id.visible_removing_fragment_view_tag, k4);
                }
                ((K) I3.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(k4.getPopDirection());
            }
        }
    }

    public final void h(K k4) {
        if (M(2)) {
            Log.v("FragmentManager", "detach: " + k4);
        }
        if (k4.mDetached) {
            return;
        }
        k4.mDetached = true;
        if (k4.mAdded) {
            if (M(2)) {
                Log.v("FragmentManager", "remove from detach: " + k4);
            }
            u0 u0Var = this.f3160c;
            synchronized (u0Var.f3244a) {
                u0Var.f3244a.remove(k4);
            }
            k4.mAdded = false;
            if (N(k4)) {
                this.f3149G = true;
            }
            g0(k4);
        }
    }

    public final void i(boolean z3, Configuration configuration) {
        if (z3 && (this.f3177w instanceof D.l)) {
            j0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (K k4 : this.f3160c.f()) {
            if (k4 != null) {
                k4.performConfigurationChanged(configuration);
                if (z3) {
                    k4.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final void i0() {
        Iterator it = this.f3160c.d().iterator();
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            K k4 = t0Var.f3240c;
            if (k4.mDeferStart) {
                if (this.f3159b) {
                    this.f3152K = true;
                } else {
                    k4.mDeferStart = false;
                    t0Var.k();
                }
            }
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.f3176v < 1) {
            return false;
        }
        for (K k4 : this.f3160c.f()) {
            if (k4 != null && k4.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void j0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new G0());
        V v3 = this.f3177w;
        if (v3 == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e4) {
                Log.e("FragmentManager", "Failed dumping state", e4);
                throw runtimeException;
            }
        }
        try {
            ((O) v3).f3060e.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e5) {
            Log.e("FragmentManager", "Failed dumping state", e5);
            throw runtimeException;
        }
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.f3176v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (K k4 : this.f3160c.f()) {
            if (k4 != null && k4.isMenuVisible() && k4.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(k4);
                z3 = true;
            }
        }
        if (this.f3162e != null) {
            for (int i = 0; i < this.f3162e.size(); i++) {
                K k5 = (K) this.f3162e.get(i);
                if (arrayList == null || !arrayList.contains(k5)) {
                    k5.onDestroyOptionsMenu();
                }
            }
        }
        this.f3162e = arrayList;
        return z3;
    }

    public final void k0() {
        synchronized (this.f3158a) {
            try {
                if (!this.f3158a.isEmpty()) {
                    this.i.setEnabled(true);
                    if (M(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z3 = this.f3161d.size() + (this.h != null ? 1 : 0) > 0 && P(this.f3179y);
                if (M(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z3);
                }
                this.i.setEnabled(z3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        boolean z3 = true;
        this.J = true;
        A(true);
        x();
        V v3 = this.f3177w;
        boolean z4 = v3 instanceof androidx.lifecycle.D0;
        u0 u0Var = this.f3160c;
        if (z4) {
            z3 = u0Var.f3247d.f3206e;
        } else {
            P p = v3.f3075b;
            if (p != null) {
                z3 = true ^ p.isChangingConfigurations();
            }
        }
        if (z3) {
            Iterator it = this.f3166k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C0139c) it.next()).f3103a.iterator();
                while (it2.hasNext()) {
                    u0Var.f3247d.c((String) it2.next(), false);
                }
            }
        }
        u(-1);
        Object obj = this.f3177w;
        if (obj instanceof D.m) {
            ((D.m) obj).removeOnTrimMemoryListener(this.f3172r);
        }
        Object obj2 = this.f3177w;
        if (obj2 instanceof D.l) {
            ((D.l) obj2).removeOnConfigurationChangedListener(this.f3171q);
        }
        Object obj3 = this.f3177w;
        if (obj3 instanceof C.H) {
            ((C.H) obj3).removeOnMultiWindowModeChangedListener(this.f3173s);
        }
        Object obj4 = this.f3177w;
        if (obj4 instanceof C.I) {
            ((C.I) obj4).removeOnPictureInPictureModeChangedListener(this.f3174t);
        }
        Object obj5 = this.f3177w;
        if ((obj5 instanceof InterfaceC0070k) && this.f3179y == null) {
            ((InterfaceC0070k) obj5).removeMenuProvider(this.f3175u);
        }
        this.f3177w = null;
        this.f3178x = null;
        this.f3179y = null;
        if (this.f3164g != null) {
            this.i.remove();
            this.f3164g = null;
        }
        C0299h c0299h = this.f3145C;
        if (c0299h != null) {
            c0299h.b();
            this.f3146D.b();
            this.f3147E.b();
        }
    }

    public final void m(boolean z3) {
        if (z3 && (this.f3177w instanceof D.m)) {
            j0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (K k4 : this.f3160c.f()) {
            if (k4 != null) {
                k4.performLowMemory();
                if (z3) {
                    k4.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void n(boolean z3, boolean z4) {
        if (z4 && (this.f3177w instanceof C.H)) {
            j0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (K k4 : this.f3160c.f()) {
            if (k4 != null) {
                k4.performMultiWindowModeChanged(z3);
                if (z4) {
                    k4.mChildFragmentManager.n(z3, true);
                }
            }
        }
    }

    public final void o() {
        Iterator it = this.f3160c.e().iterator();
        while (it.hasNext()) {
            K k4 = (K) it.next();
            if (k4 != null) {
                k4.onHiddenChanged(k4.isHidden());
                k4.mChildFragmentManager.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.f3176v < 1) {
            return false;
        }
        for (K k4 : this.f3160c.f()) {
            if (k4 != null && k4.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.f3176v < 1) {
            return;
        }
        for (K k4 : this.f3160c.f()) {
            if (k4 != null) {
                k4.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r(K k4) {
        if (k4 != null) {
            if (k4.equals(this.f3160c.b(k4.mWho))) {
                k4.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z3, boolean z4) {
        if (z4 && (this.f3177w instanceof C.I)) {
            j0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (K k4 : this.f3160c.f()) {
            if (k4 != null) {
                k4.performPictureInPictureModeChanged(z3);
                if (z4) {
                    k4.mChildFragmentManager.s(z3, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z3 = false;
        if (this.f3176v < 1) {
            return false;
        }
        for (K k4 : this.f3160c.f()) {
            if (k4 != null && k4.isMenuVisible() && k4.performPrepareOptionsMenu(menu)) {
                z3 = true;
            }
        }
        return z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        K k4 = this.f3179y;
        if (k4 != null) {
            sb.append(k4.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3179y)));
            sb.append("}");
        } else {
            V v3 = this.f3177w;
            if (v3 != null) {
                sb.append(v3.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f3177w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.f3159b = true;
            for (t0 t0Var : this.f3160c.f3245b.values()) {
                if (t0Var != null) {
                    t0Var.f3242e = i;
                }
            }
            R(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((O0) it.next()).l();
            }
            this.f3159b = false;
            A(true);
        } catch (Throwable th) {
            this.f3159b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.f3152K) {
            this.f3152K = false;
            i0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String n4 = C.w.n(str, "    ");
        u0 u0Var = this.f3160c;
        u0Var.getClass();
        String str2 = str + "    ";
        HashMap hashMap = u0Var.f3245b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (t0 t0Var : hashMap.values()) {
                printWriter.print(str);
                if (t0Var != null) {
                    K k4 = t0Var.f3240c;
                    printWriter.println(k4);
                    k4.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = u0Var.f3244a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                K k5 = (K) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(k5.toString());
            }
        }
        ArrayList arrayList2 = this.f3162e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size; i4++) {
                K k6 = (K) this.f3162e.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(k6.toString());
            }
        }
        int size3 = this.f3161d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                C0135a c0135a = (C0135a) this.f3161d.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(c0135a.toString());
                c0135a.f(n4, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3165j.get());
        synchronized (this.f3158a) {
            try {
                int size4 = this.f3158a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i6 = 0; i6 < size4; i6++) {
                        Object obj = (InterfaceC0150h0) this.f3158a.get(i6);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i6);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3177w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3178x);
        if (this.f3179y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3179y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3176v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3150H);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3151I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.f3149G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3149G);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((O0) it.next()).l();
        }
    }

    public final void y(InterfaceC0150h0 interfaceC0150h0, boolean z3) {
        if (!z3) {
            if (this.f3177w == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (Q()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f3158a) {
            try {
                if (this.f3177w == null) {
                    if (!z3) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f3158a.add(interfaceC0150h0);
                    c0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z3) {
        if (this.f3159b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f3177w == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f3177w.f3076c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z3 && Q()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f3153L == null) {
            this.f3153L = new ArrayList();
            this.f3154M = new ArrayList();
        }
    }
}
