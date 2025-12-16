package com.google.android.material.transformation;

import A.e;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, A.b
    public final void f(View view) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
    }

    @Override // A.b
    public final void g(e eVar) {
        if (eVar.h == 0) {
            eVar.h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
