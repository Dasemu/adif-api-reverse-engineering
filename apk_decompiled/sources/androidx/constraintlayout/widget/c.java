package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2546a;

    /* renamed from: b, reason: collision with root package name */
    public int f2547b;

    /* renamed from: c, reason: collision with root package name */
    public Context f2548c;

    /* renamed from: d, reason: collision with root package name */
    public w.i f2549d;

    /* renamed from: e, reason: collision with root package name */
    public String f2550e;

    /* renamed from: f, reason: collision with root package name */
    public String f2551f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f2552g;

    public final void a(String str) {
        Context context;
        if (str == null || str.length() == 0 || (context = this.f2548c) == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, trim);
            if (designInformation instanceof Integer) {
                i = ((Integer) designInformation).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = f(constraintLayout, trim);
        }
        if (i == 0) {
            try {
                i = r.class.getField(trim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            i = context.getResources().getIdentifier(trim, NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, context.getPackageName());
        }
        if (i != 0) {
            this.f2552g.put(Integer.valueOf(i), trim);
            b(i);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i4 = this.f2547b + 1;
        int[] iArr = this.f2546a;
        if (i4 > iArr.length) {
            this.f2546a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2546a;
        int i5 = this.f2547b;
        iArr2[i5] = i;
        this.f2547b = i5 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f2548c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof e) && trim.equals(((e) layoutParams).f2577Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f2547b; i++) {
            View viewById = constraintLayout.getViewById(this.f2546a[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > BitmapDescriptorFactory.HUE_RED) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.f2548c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        str2 = null;
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f2749b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2550e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2551f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2546a, this.f2547b);
    }

    public abstract void h(w.d dVar, boolean z3);

    public final void i() {
        if (this.f2549d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof e) {
            ((e) layoutParams).f2606p0 = this.f2549d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2550e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2551f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f2550e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f2547b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f2551f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f2547b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                c(str.substring(i));
                return;
            } else {
                c(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2550e = null;
        this.f2547b = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f2550e == null) {
            b(i);
        }
    }
}
