package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f2628a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2629b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2630c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2631d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2632e;

    /* renamed from: f, reason: collision with root package name */
    public final p f2633f;

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f2628a = Float.NaN;
        this.f2629b = Float.NaN;
        this.f2630c = Float.NaN;
        this.f2631d = Float.NaN;
        this.f2632e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f2755j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f2632e);
                this.f2632e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    p pVar = new p();
                    this.f2633f = pVar;
                    pVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f2631d = obtainStyledAttributes.getDimension(index, this.f2631d);
            } else if (index == 2) {
                this.f2629b = obtainStyledAttributes.getDimension(index, this.f2629b);
            } else if (index == 3) {
                this.f2630c = obtainStyledAttributes.getDimension(index, this.f2630c);
            } else if (index == 4) {
                this.f2628a = obtainStyledAttributes.getDimension(index, this.f2628a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean a(float f2, float f4) {
        float f5 = this.f2628a;
        if (!Float.isNaN(f5) && f2 < f5) {
            return false;
        }
        float f6 = this.f2629b;
        if (!Float.isNaN(f6) && f4 < f6) {
            return false;
        }
        float f7 = this.f2630c;
        if (!Float.isNaN(f7) && f2 > f7) {
            return false;
        }
        float f8 = this.f2631d;
        return Float.isNaN(f8) || f4 <= f8;
    }
}
