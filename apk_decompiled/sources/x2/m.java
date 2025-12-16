package x2;

import C.w;
import O.J;
import O.L;
import O.X;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.adif.elcanomovil.R;
import com.google.android.material.appbar.MaterialToolbar;
import h2.AbstractC0379a;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f8965a = {R.attr.colorPrimary};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f8966b = {R.attr.colorPrimaryVariant};

    /* renamed from: c, reason: collision with root package name */
    public static final A.i f8967c = new A.i(7);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f8968d = 0;

    public static void a(Context context, AttributeSet attributeSet, int i, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0379a.f6754H, i, i4);
        boolean z3 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z3) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f8966b, "Theme.MaterialComponents");
            }
        }
        c(context, f8965a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = h2.AbstractC0379a.f6754H
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L1f
            int r5 = r0.getResourceId(r2, r4)
            if (r5 == r4) goto L3a
        L1d:
            r2 = r3
            goto L3a
        L1f:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = r2
        L25:
            if (r7 >= r6) goto L36
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L33
            r5.recycle()
            goto L3a
        L33:
            int r7 = r7 + 1
            goto L25
        L36:
            r5.recycle()
            goto L1d
        L3a:
            r0.recycle()
            if (r2 == 0) goto L40
            return
        L40:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.m.b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(w.o("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x2.p] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void d(View view, o oVar) {
        WeakHashMap weakHashMap = X.f1226a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        ?? obj = new Object();
        obj.f8969a = paddingStart;
        obj.f8970b = paddingTop;
        obj.f8971c = paddingEnd;
        obj.f8972d = paddingBottom;
        L.u(view, new F.i(21, oVar, (Object) obj));
        if (view.isAttachedToWindow()) {
            J.c(view);
        } else {
            view.addOnAttachStateChangeListener(new Object());
        }
    }

    public static float e(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static ArrayList f(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static boolean g(View view) {
        WeakHashMap weakHashMap = X.f1226a;
        return view.getLayoutDirection() == 1;
    }

    public static TypedArray h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i4, int... iArr2) {
        a(context, attributeSet, i, i4);
        b(context, attributeSet, iArr, i, i4, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i4);
    }

    public static R0.h i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i4, int... iArr2) {
        a(context, attributeSet, i, i4);
        b(context, attributeSet, iArr, i, i4, iArr2);
        return new R0.h(context, context.obtainStyledAttributes(attributeSet, iArr, i, i4));
    }

    public static PorterDuff.Mode j(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
