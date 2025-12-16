package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f2730n;

    /* renamed from: a, reason: collision with root package name */
    public float f2731a;

    /* renamed from: b, reason: collision with root package name */
    public float f2732b;

    /* renamed from: c, reason: collision with root package name */
    public float f2733c;

    /* renamed from: d, reason: collision with root package name */
    public float f2734d;

    /* renamed from: e, reason: collision with root package name */
    public float f2735e;

    /* renamed from: f, reason: collision with root package name */
    public float f2736f;

    /* renamed from: g, reason: collision with root package name */
    public float f2737g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f2738j;

    /* renamed from: k, reason: collision with root package name */
    public float f2739k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2740l;

    /* renamed from: m, reason: collision with root package name */
    public float f2741m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2730n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f2730n.get(index)) {
                case 1:
                    this.f2731a = obtainStyledAttributes.getFloat(index, this.f2731a);
                    break;
                case 2:
                    this.f2732b = obtainStyledAttributes.getFloat(index, this.f2732b);
                    break;
                case 3:
                    this.f2733c = obtainStyledAttributes.getFloat(index, this.f2733c);
                    break;
                case 4:
                    this.f2734d = obtainStyledAttributes.getFloat(index, this.f2734d);
                    break;
                case 5:
                    this.f2735e = obtainStyledAttributes.getFloat(index, this.f2735e);
                    break;
                case 6:
                    this.f2736f = obtainStyledAttributes.getDimension(index, this.f2736f);
                    break;
                case 7:
                    this.f2737g = obtainStyledAttributes.getDimension(index, this.f2737g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f2738j = obtainStyledAttributes.getDimension(index, this.f2738j);
                    break;
                case 10:
                    this.f2739k = obtainStyledAttributes.getDimension(index, this.f2739k);
                    break;
                case 11:
                    this.f2740l = true;
                    this.f2741m = obtainStyledAttributes.getDimension(index, this.f2741m);
                    break;
                case 12:
                    this.h = p.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
