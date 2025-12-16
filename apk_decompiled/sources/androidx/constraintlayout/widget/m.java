package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.google.firebase.sessions.settings.RemoteSettings;
import v.AbstractC0635a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f2718j;

    /* renamed from: a, reason: collision with root package name */
    public int f2719a;

    /* renamed from: b, reason: collision with root package name */
    public int f2720b;

    /* renamed from: c, reason: collision with root package name */
    public int f2721c;

    /* renamed from: d, reason: collision with root package name */
    public float f2722d;

    /* renamed from: e, reason: collision with root package name */
    public float f2723e;

    /* renamed from: f, reason: collision with root package name */
    public float f2724f;

    /* renamed from: g, reason: collision with root package name */
    public int f2725g;
    public String h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2718j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f2753f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f2718j.get(index)) {
                case 1:
                    this.f2723e = obtainStyledAttributes.getFloat(index, this.f2723e);
                    break;
                case 2:
                    this.f2721c = obtainStyledAttributes.getInt(index, this.f2721c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC0635a.f8626a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f2719a = p.f(obtainStyledAttributes, index, this.f2719a);
                    break;
                case 6:
                    this.f2720b = obtainStyledAttributes.getInteger(index, this.f2720b);
                    break;
                case 7:
                    this.f2722d = obtainStyledAttributes.getFloat(index, this.f2722d);
                    break;
                case 8:
                    this.f2725g = obtainStyledAttributes.getInteger(index, this.f2725g);
                    break;
                case 9:
                    this.f2724f = obtainStyledAttributes.getFloat(index, this.f2724f);
                    break;
                case 10:
                    int i4 = obtainStyledAttributes.peekValue(index).type;
                    if (i4 == 1) {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i4 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.h = string;
                        if (string.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                            this.i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
