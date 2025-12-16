package I2;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f839a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final q f840b;

    /* renamed from: c, reason: collision with root package name */
    public final int f841c;

    /* renamed from: d, reason: collision with root package name */
    public final int f842d;

    public p(q qVar, R0.h hVar) {
        this.f840b = qVar;
        TypedArray typedArray = (TypedArray) hVar.f1414b;
        this.f841c = typedArray.getResourceId(28, 0);
        this.f842d = typedArray.getResourceId(52, 0);
    }
}
