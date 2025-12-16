package androidx.fragment.app;

import android.util.Log;
import i0.AbstractC0383d;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135a extends w0 implements InterfaceC0150h0 {

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC0158l0 f3084q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3085r;

    /* renamed from: s, reason: collision with root package name */
    public int f3086s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3087t;

    public C0135a(AbstractC0158l0 abstractC0158l0) {
        abstractC0158l0.J();
        V v3 = abstractC0158l0.f3177w;
        if (v3 != null) {
            v3.f3075b.getClassLoader();
        }
        this.f3086s = -1;
        this.f3087t = false;
        this.f3084q = abstractC0158l0;
    }

    @Override // androidx.fragment.app.InterfaceC0150h0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3263g) {
            return true;
        }
        this.f3084q.f3161d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.w0
    public final void c(int i, K k4, String str, int i4) {
        String str2 = k4.mPreviousWho;
        if (str2 != null) {
            AbstractC0383d.d(k4, str2);
        }
        Class<?> cls = k4.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = k4.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + k4 + ": was " + k4.mTag + " now " + str);
            }
            k4.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + k4 + " with tag " + str + " to container view with no id");
            }
            int i5 = k4.mFragmentId;
            if (i5 != 0 && i5 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + k4 + ": was " + k4.mFragmentId + " now " + i);
            }
            k4.mFragmentId = i;
            k4.mContainerId = i;
        }
        b(new v0(k4, i4));
        k4.mFragmentManager = this.f3084q;
    }

    public final void d(int i) {
        if (this.f3263g) {
            if (AbstractC0158l0.M(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f3257a;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                v0 v0Var = (v0) arrayList.get(i4);
                K k4 = v0Var.f3250b;
                if (k4 != null) {
                    k4.mBackStackNesting += i;
                    if (AbstractC0158l0.M(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + v0Var.f3250b + " to " + v0Var.f3250b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final int e(boolean z3) {
        if (this.f3085r) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new G0());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f3085r = true;
        boolean z4 = this.f3263g;
        AbstractC0158l0 abstractC0158l0 = this.f3084q;
        if (z4) {
            this.f3086s = abstractC0158l0.f3165j.getAndIncrement();
        } else {
            this.f3086s = -1;
        }
        abstractC0158l0.y(this, z3);
        return this.f3086s;
    }

    public final void f(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3086s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3085r);
            if (this.f3262f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3262f));
            }
            if (this.f3258b != 0 || this.f3259c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3258b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3259c));
            }
            if (this.f3260d != 0 || this.f3261e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3260d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3261e));
            }
            if (this.f3264j != 0 || this.f3265k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3264j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3265k);
            }
            if (this.f3266l != 0 || this.f3267m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3266l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3267m);
            }
        }
        ArrayList arrayList = this.f3257a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v0 v0Var = (v0) arrayList.get(i);
            switch (v0Var.f3249a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + v0Var.f3249a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(v0Var.f3250b);
            if (z3) {
                if (v0Var.f3252d != 0 || v0Var.f3253e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(v0Var.f3252d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(v0Var.f3253e));
                }
                if (v0Var.f3254f != 0 || v0Var.f3255g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(v0Var.f3254f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(v0Var.f3255g));
                }
            }
        }
    }

    public final C0135a g(K k4) {
        AbstractC0158l0 abstractC0158l0 = k4.mFragmentManager;
        if (abstractC0158l0 == null || abstractC0158l0 == this.f3084q) {
            b(new v0(k4, 3));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + k4.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.fragment.app.v0] */
    public final C0135a h(K k4, androidx.lifecycle.B b4) {
        AbstractC0158l0 abstractC0158l0 = k4.mFragmentManager;
        AbstractC0158l0 abstractC0158l02 = this.f3084q;
        if (abstractC0158l0 != abstractC0158l02) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + abstractC0158l02);
        }
        if (b4 == androidx.lifecycle.B.f3281b && k4.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + b4 + " after the Fragment has been created");
        }
        if (b4 == androidx.lifecycle.B.f3280a) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + b4 + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        ?? obj = new Object();
        obj.f3249a = 10;
        obj.f3250b = k4;
        obj.f3251c = false;
        obj.h = k4.mMaxState;
        obj.i = b4;
        b(obj);
        return this;
    }

    public final C0135a i(K k4) {
        AbstractC0158l0 abstractC0158l0 = k4.mFragmentManager;
        if (abstractC0158l0 == null || abstractC0158l0 == this.f3084q) {
            b(new v0(k4, 8));
            return this;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + k4.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3086s >= 0) {
            sb.append(" #");
            sb.append(this.f3086s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, androidx.fragment.app.v0] */
    public C0135a(C0135a c0135a) {
        c0135a.f3084q.J();
        V v3 = c0135a.f3084q.f3177w;
        if (v3 != null) {
            v3.f3075b.getClassLoader();
        }
        Iterator it = c0135a.f3257a.iterator();
        while (it.hasNext()) {
            v0 v0Var = (v0) it.next();
            ArrayList arrayList = this.f3257a;
            ?? obj = new Object();
            obj.f3249a = v0Var.f3249a;
            obj.f3250b = v0Var.f3250b;
            obj.f3251c = v0Var.f3251c;
            obj.f3252d = v0Var.f3252d;
            obj.f3253e = v0Var.f3253e;
            obj.f3254f = v0Var.f3254f;
            obj.f3255g = v0Var.f3255g;
            obj.h = v0Var.h;
            obj.i = v0Var.i;
            arrayList.add(obj);
        }
        this.f3258b = c0135a.f3258b;
        this.f3259c = c0135a.f3259c;
        this.f3260d = c0135a.f3260d;
        this.f3261e = c0135a.f3261e;
        this.f3262f = c0135a.f3262f;
        this.f3263g = c0135a.f3263g;
        this.h = c0135a.h;
        this.i = c0135a.i;
        this.f3266l = c0135a.f3266l;
        this.f3267m = c0135a.f3267m;
        this.f3264j = c0135a.f3264j;
        this.f3265k = c0135a.f3265k;
        if (c0135a.f3268n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f3268n = arrayList2;
            arrayList2.addAll(c0135a.f3268n);
        }
        if (c0135a.f3269o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f3269o = arrayList3;
            arrayList3.addAll(c0135a.f3269o);
        }
        this.p = c0135a.p;
        this.f3086s = -1;
        this.f3087t = false;
        this.f3084q = c0135a.f3084q;
        this.f3085r = c0135a.f3085r;
        this.f3086s = c0135a.f3086s;
        this.f3087t = c0135a.f3087t;
    }
}
