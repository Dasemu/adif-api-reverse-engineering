package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2537a;

    public Guideline(Context context) {
        super(context);
        this.f2537a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z3) {
        this.f2537a = z3;
    }

    public void setGuidelineBegin(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f2537a && eVar.f2578a == i) {
            return;
        }
        eVar.f2578a = i;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f2537a && eVar.f2580b == i) {
            return;
        }
        eVar.f2580b = i;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f2) {
        e eVar = (e) getLayoutParams();
        if (this.f2537a && eVar.f2582c == f2) {
            return;
        }
        eVar.f2582c = f2;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2537a = true;
        super.setVisibility(8);
    }
}
