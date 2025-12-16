package com.github.chrisbanes.photoview;

import S1.c;
import S1.d;
import S1.e;
import S1.f;
import S1.g;
import S1.h;
import S1.i;
import S1.o;
import S1.p;
import a.AbstractC0106b;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class PhotoView extends AppCompatImageView {

    /* renamed from: d, reason: collision with root package name */
    public final o f5507d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView.ScaleType f5508e;

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5507d = new o(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f5508e;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f5508e = null;
        }
    }

    public o getAttacher() {
        return this.f5507d;
    }

    public RectF getDisplayRect() {
        o oVar = this.f5507d;
        oVar.b();
        Matrix c4 = oVar.c();
        if (oVar.h.getDrawable() == null) {
            return null;
        }
        RectF rectF = oVar.f1570n;
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, r1.getIntrinsicWidth(), r1.getIntrinsicHeight());
        c4.mapRect(rectF);
        return rectF;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f5507d.f1568l;
    }

    public float getMaximumScale() {
        return this.f5507d.f1563e;
    }

    public float getMediumScale() {
        return this.f5507d.f1562d;
    }

    public float getMinimumScale() {
        return this.f5507d.f1561c;
    }

    public float getScale() {
        return this.f5507d.d();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f5507d.f1577v;
    }

    public void setAllowParentInterceptOnEdge(boolean z3) {
        this.f5507d.f1564f = z3;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i4, int i5, int i6) {
        boolean frame = super.setFrame(i, i4, i5, i6);
        if (frame) {
            this.f5507d.f();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        o oVar = this.f5507d;
        if (oVar != null) {
            oVar.f();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        o oVar = this.f5507d;
        if (oVar != null) {
            oVar.f();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        o oVar = this.f5507d;
        if (oVar != null) {
            oVar.f();
        }
    }

    public void setMaximumScale(float f2) {
        o oVar = this.f5507d;
        AbstractC0106b.c(oVar.f1561c, oVar.f1562d, f2);
        oVar.f1563e = f2;
    }

    public void setMediumScale(float f2) {
        o oVar = this.f5507d;
        AbstractC0106b.c(oVar.f1561c, f2, oVar.f1563e);
        oVar.f1562d = f2;
    }

    public void setMinimumScale(float f2) {
        o oVar = this.f5507d;
        AbstractC0106b.c(f2, oVar.f1562d, oVar.f1563e);
        oVar.f1561c = f2;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f5507d.p = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f5507d.i.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5507d.f1572q = onLongClickListener;
    }

    public void setOnMatrixChangeListener(c cVar) {
        this.f5507d.getClass();
    }

    public void setOnOutsidePhotoTapListener(d dVar) {
        this.f5507d.getClass();
    }

    public void setOnPhotoTapListener(e eVar) {
        this.f5507d.getClass();
    }

    public void setOnScaleChangeListener(f fVar) {
        this.f5507d.getClass();
    }

    public void setOnSingleFlingListener(g gVar) {
        this.f5507d.getClass();
    }

    public void setOnViewDragListener(h hVar) {
        this.f5507d.getClass();
    }

    public void setOnViewTapListener(i iVar) {
        this.f5507d.getClass();
    }

    public void setRotationBy(float f2) {
        o oVar = this.f5507d;
        oVar.f1569m.postRotate(f2 % 360.0f);
        oVar.a();
    }

    public void setRotationTo(float f2) {
        o oVar = this.f5507d;
        oVar.f1569m.setRotate(f2 % 360.0f);
        oVar.a();
    }

    public void setScale(float f2) {
        o oVar = this.f5507d;
        PhotoView photoView = oVar.h;
        oVar.e(f2, photoView.getRight() / 2, photoView.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        o oVar = this.f5507d;
        if (oVar == null) {
            this.f5508e = scaleType;
            return;
        }
        oVar.getClass();
        if (scaleType == null) {
            return;
        }
        if (p.f1579a[scaleType.ordinal()] == 1) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (scaleType != oVar.f1577v) {
            oVar.f1577v = scaleType;
            oVar.f();
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.f5507d.f1560b = i;
    }

    public void setZoomable(boolean z3) {
        o oVar = this.f5507d;
        oVar.f1576u = z3;
        oVar.f();
    }
}
