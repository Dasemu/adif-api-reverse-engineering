package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: androidx.recyclerview.widget.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0239r0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public I0 f3897a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3898b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3899c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3900d;

    public C0239r0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3898b = new Rect();
        this.f3899c = true;
        this.f3900d = false;
    }

    public C0239r0(int i, int i4) {
        super(i, i4);
        this.f3898b = new Rect();
        this.f3899c = true;
        this.f3900d = false;
    }

    public C0239r0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3898b = new Rect();
        this.f3899c = true;
        this.f3900d = false;
    }

    public C0239r0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3898b = new Rect();
        this.f3899c = true;
        this.f3900d = false;
    }

    public C0239r0(C0239r0 c0239r0) {
        super((ViewGroup.LayoutParams) c0239r0);
        this.f3898b = new Rect();
        this.f3899c = true;
        this.f3900d = false;
    }
}
