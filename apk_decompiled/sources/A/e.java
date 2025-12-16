package A;

import C.w;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public b f9a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14f;

    /* renamed from: g, reason: collision with root package name */
    public int f15g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f16j;

    /* renamed from: k, reason: collision with root package name */
    public View f17k;

    /* renamed from: l, reason: collision with root package name */
    public View f18l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f21o;

    public e() {
        super(-2, -2);
        this.f10b = false;
        this.f11c = 0;
        this.f12d = 0;
        this.f13e = -1;
        this.f14f = -1;
        this.f15g = 0;
        this.h = 0;
        this.f21o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f19m;
        }
        if (i != 1) {
            return false;
        }
        return this.f20n;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.f10b = false;
        this.f11c = 0;
        this.f12d = 0;
        this.f13e = -1;
        this.f14f = -1;
        this.f15g = 0;
        this.h = 0;
        this.f21o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.a.f8998b);
        this.f11c = obtainStyledAttributes.getInteger(0, 0);
        this.f14f = obtainStyledAttributes.getResourceId(1, -1);
        this.f12d = obtainStyledAttributes.getInteger(2, 0);
        this.f13e = obtainStyledAttributes.getInteger(6, -1);
        this.f15g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f10b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f2756t;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f2756t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f2758v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f2757u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e4) {
                    throw new RuntimeException(w.z("Could not inflate Behavior subclass ", string), e4);
                }
            }
            this.f9a = bVar;
        }
        obtainStyledAttributes.recycle();
        b bVar2 = this.f9a;
        if (bVar2 != null) {
            bVar2.g(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f10b = false;
        this.f11c = 0;
        this.f12d = 0;
        this.f13e = -1;
        this.f14f = -1;
        this.f15g = 0;
        this.h = 0;
        this.f21o = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f10b = false;
        this.f11c = 0;
        this.f12d = 0;
        this.f13e = -1;
        this.f14f = -1;
        this.f15g = 0;
        this.h = 0;
        this.f21o = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f10b = false;
        this.f11c = 0;
        this.f12d = 0;
        this.f13e = -1;
        this.f14f = -1;
        this.f15g = 0;
        this.h = 0;
        this.f21o = new Rect();
    }
}
