package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.adif.elcanomovil.R;
import l.C0424b;

/* renamed from: m.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0468j extends AppCompatImageView implements InterfaceC0474m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0472l f7672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0468j(C0472l c0472l, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f7672d = c0472l;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        W0.a(this, getContentDescription());
        setOnTouchListener(new C0424b(this, this));
    }

    @Override // m.InterfaceC0474m
    public final boolean a() {
        return false;
    }

    @Override // m.InterfaceC0474m
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f7672d.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i4, int i5, int i6) {
        boolean frame = super.setFrame(i, i4, i5, i6);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            H.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
