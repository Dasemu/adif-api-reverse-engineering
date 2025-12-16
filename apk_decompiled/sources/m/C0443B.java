package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.adif.elcanomovil.R;

/* renamed from: m.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0443B extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0499z f7501a;

    public C0443B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        K0.a(this, getContext());
        C0499z c0499z = new C0499z(this);
        this.f7501a = c0499z;
        c0499z.e(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        Bitmap bitmap = (Bitmap) this.f7501a.f7786c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
