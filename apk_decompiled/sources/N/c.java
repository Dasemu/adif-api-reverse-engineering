package N;

import kotlin.jvm.internal.Intrinsics;
import u.C0625b;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1121a;

    /* renamed from: b, reason: collision with root package name */
    public int f1122b;

    public c(int i) {
        if (i > 0) {
            this.f1121a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public Object a() {
        int i = this.f1122b;
        if (i <= 0) {
            return null;
        }
        int i4 = i - 1;
        Object[] objArr = this.f1121a;
        Object obj = objArr[i4];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i4] = null;
        this.f1122b--;
        return obj;
    }

    public void b(C0625b c0625b) {
        int i = this.f1122b;
        Object[] objArr = this.f1121a;
        if (i < objArr.length) {
            objArr[i] = c0625b;
            this.f1122b = i + 1;
        }
    }

    public boolean c(Object instance) {
        Object[] objArr;
        boolean z3;
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i = this.f1122b;
        int i4 = 0;
        while (true) {
            objArr = this.f1121a;
            if (i4 >= i) {
                z3 = false;
                break;
            }
            if (objArr[i4] == instance) {
                z3 = true;
                break;
            }
            i4++;
        }
        if (z3) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i5 = this.f1122b;
        if (i5 >= objArr.length) {
            return false;
        }
        objArr[i5] = instance;
        this.f1122b = i5 + 1;
        return true;
    }

    public c() {
        this.f1121a = new Object[256];
    }
}
