package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f3931a;

    /* renamed from: b, reason: collision with root package name */
    public int f3932b;

    /* renamed from: c, reason: collision with root package name */
    public Set f3933c;

    public final w0 a(int i) {
        SparseArray sparseArray = this.f3931a;
        w0 w0Var = (w0) sparseArray.get(i);
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0();
        sparseArray.put(i, w0Var2);
        return w0Var2;
    }
}
