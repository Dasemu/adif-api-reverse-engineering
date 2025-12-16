package K2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import k.C0407d;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1016a = {R.attr.theme, com.adif.elcanomovil.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1017b = {com.adif.elcanomovil.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1017b, i, i4);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z3 = (context instanceof C0407d) && ((C0407d) context).f6958a == resourceId;
        if (resourceId == 0 || z3) {
            return context;
        }
        C0407d c0407d = new C0407d(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1016a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0407d.getTheme().applyStyle(resourceId2, true);
        }
        return c0407d;
    }
}
