package E2;

import a.AbstractC0106b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h2.AbstractC0379a;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0106b f428a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0106b f429b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0106b f430c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0106b f431d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public c f432e = new a(BitmapDescriptorFactory.HUE_RED);

    /* renamed from: f, reason: collision with root package name */
    public c f433f = new a(BitmapDescriptorFactory.HUE_RED);

    /* renamed from: g, reason: collision with root package name */
    public c f434g = new a(BitmapDescriptorFactory.HUE_RED);
    public c h = new a(BitmapDescriptorFactory.HUE_RED);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f435j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f436k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f437l = new e(0);

    public static j a(Context context, int i, int i4, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i4 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i4);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0379a.f6777z);
        try {
            int i5 = obtainStyledAttributes.getInt(0, 0);
            int i6 = obtainStyledAttributes.getInt(3, i5);
            int i7 = obtainStyledAttributes.getInt(4, i5);
            int i8 = obtainStyledAttributes.getInt(2, i5);
            int i9 = obtainStyledAttributes.getInt(1, i5);
            c c4 = c(obtainStyledAttributes, 5, aVar);
            c c5 = c(obtainStyledAttributes, 8, c4);
            c c6 = c(obtainStyledAttributes, 9, c4);
            c c7 = c(obtainStyledAttributes, 7, c4);
            c c8 = c(obtainStyledAttributes, 6, c4);
            j jVar = new j();
            AbstractC0106b m4 = m3.d.m(i6);
            jVar.f418a = m4;
            j.b(m4);
            jVar.f422e = c5;
            AbstractC0106b m5 = m3.d.m(i7);
            jVar.f419b = m5;
            j.b(m5);
            jVar.f423f = c6;
            AbstractC0106b m6 = m3.d.m(i8);
            jVar.f420c = m6;
            j.b(m6);
            jVar.f424g = c7;
            AbstractC0106b m7 = m3.d.m(i9);
            jVar.f421d = m7;
            j.b(m7);
            jVar.h = c8;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i4) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0379a.f6769r, i, i4);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i4 = peekValue.type;
            if (i4 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i4 == 6) {
                return new h(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z3 = this.f437l.getClass().equals(e.class) && this.f435j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f436k.getClass().equals(e.class);
        float a2 = this.f432e.a(rectF);
        return z3 && ((this.f433f.a(rectF) > a2 ? 1 : (this.f433f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f434g.a(rectF) > a2 ? 1 : (this.f434g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f429b instanceof i) && (this.f428a instanceof i) && (this.f430c instanceof i) && (this.f431d instanceof i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E2.j, java.lang.Object] */
    public final j e() {
        ?? obj = new Object();
        obj.f418a = this.f428a;
        obj.f419b = this.f429b;
        obj.f420c = this.f430c;
        obj.f421d = this.f431d;
        obj.f422e = this.f432e;
        obj.f423f = this.f433f;
        obj.f424g = this.f434g;
        obj.h = this.h;
        obj.i = this.i;
        obj.f425j = this.f435j;
        obj.f426k = this.f436k;
        obj.f427l = this.f437l;
        return obj;
    }
}
