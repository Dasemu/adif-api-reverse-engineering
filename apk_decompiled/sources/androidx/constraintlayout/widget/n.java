package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f2726a;

    /* renamed from: b, reason: collision with root package name */
    public int f2727b;

    /* renamed from: c, reason: collision with root package name */
    public float f2728c;

    /* renamed from: d, reason: collision with root package name */
    public float f2729d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f2754g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f2728c = obtainStyledAttributes.getFloat(index, this.f2728c);
            } else if (index == 0) {
                int i4 = obtainStyledAttributes.getInt(index, this.f2726a);
                this.f2726a = i4;
                this.f2726a = p.f2742d[i4];
            } else if (index == 4) {
                this.f2727b = obtainStyledAttributes.getInt(index, this.f2727b);
            } else if (index == 3) {
                this.f2729d = obtainStyledAttributes.getFloat(index, this.f2729d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
