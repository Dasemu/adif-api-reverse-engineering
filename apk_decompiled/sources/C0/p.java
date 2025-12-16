package C0;

import a.AbstractC0105a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f332j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public n f333b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f334c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f335d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f336e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f337f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f338g;
    public final Matrix h;
    public final Rect i;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, C0.n] */
    public p() {
        this.f337f = true;
        this.f338g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f323c = null;
        constantState.f324d = f332j;
        constantState.f322b = new m();
        this.f333b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f286a;
        if (drawable == null) {
            return false;
        }
        H.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f335d;
        if (colorFilter == null) {
            colorFilter = this.f334c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f338g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != BitmapDescriptorFactory.HUE_RED || abs4 != BitmapDescriptorFactory.HUE_RED) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && H.b.a(this) == 1) {
            canvas.translate(rect.width(), BitmapDescriptorFactory.HUE_RED);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.f333b;
        Bitmap bitmap = nVar.f326f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f326f.getHeight()) {
            nVar.f326f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            nVar.f329k = true;
        }
        if (this.f337f) {
            n nVar2 = this.f333b;
            if (nVar2.f329k || nVar2.f327g != nVar2.f323c || nVar2.h != nVar2.f324d || nVar2.f328j != nVar2.f325e || nVar2.i != nVar2.f322b.getRootAlpha()) {
                n nVar3 = this.f333b;
                nVar3.f326f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f326f);
                m mVar = nVar3.f322b;
                mVar.a(mVar.f314g, m.p, canvas2, min, min2);
                n nVar4 = this.f333b;
                nVar4.f327g = nVar4.f323c;
                nVar4.h = nVar4.f324d;
                nVar4.i = nVar4.f322b.getRootAlpha();
                nVar4.f328j = nVar4.f325e;
                nVar4.f329k = false;
            }
        } else {
            n nVar5 = this.f333b;
            nVar5.f326f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f326f);
            m mVar2 = nVar5.f322b;
            mVar2.a(mVar2.f314g, m.p, canvas3, min, min2);
        }
        n nVar6 = this.f333b;
        if (nVar6.f322b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f330l == null) {
                Paint paint2 = new Paint();
                nVar6.f330l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f330l.setAlpha(nVar6.f322b.getRootAlpha());
            nVar6.f330l.setColorFilter(colorFilter);
            paint = nVar6.f330l;
        }
        canvas.drawBitmap(nVar6.f326f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f286a;
        return drawable != null ? drawable.getAlpha() : this.f333b.f322b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f333b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f286a;
        return drawable != null ? H.a.c(drawable) : this.f335d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f286a != null) {
            return new o(this.f286a.getConstantState());
        }
        this.f333b.f321a = getChangingConfigurations();
        return this.f333b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f286a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f333b.f322b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f286a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f333b.f322b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f286a;
        return drawable != null ? drawable.isAutoMirrored() : this.f333b.f325e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        n nVar = this.f333b;
        if (nVar == null) {
            return false;
        }
        m mVar = nVar.f322b;
        if (mVar.f319n == null) {
            mVar.f319n = Boolean.valueOf(mVar.f314g.a());
        }
        if (mVar.f319n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f333b.f323c;
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, C0.n] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f336e && super.mutate() == this) {
            n nVar = this.f333b;
            ?? constantState = new Drawable.ConstantState();
            constantState.f323c = null;
            constantState.f324d = f332j;
            if (nVar != null) {
                constantState.f321a = nVar.f321a;
                m mVar = new m(nVar.f322b);
                constantState.f322b = mVar;
                if (nVar.f322b.f312e != null) {
                    mVar.f312e = new Paint(nVar.f322b.f312e);
                }
                if (nVar.f322b.f311d != null) {
                    constantState.f322b.f311d = new Paint(nVar.f322b.f311d);
                }
                constantState.f323c = nVar.f323c;
                constantState.f324d = nVar.f324d;
                constantState.f325e = nVar.f325e;
            }
            this.f333b = constantState;
            this.f336e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z3;
        PorterDuff.Mode mode;
        Drawable drawable = this.f286a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f333b;
        ColorStateList colorStateList = nVar.f323c;
        if (colorStateList == null || (mode = nVar.f324d) == null) {
            z3 = false;
        } else {
            this.f334c = a(colorStateList, mode);
            invalidateSelf();
            z3 = true;
        }
        m mVar = nVar.f322b;
        if (mVar.f319n == null) {
            mVar.f319n = Boolean.valueOf(mVar.f314g.a());
        }
        if (mVar.f319n.booleanValue()) {
            boolean b4 = nVar.f322b.f314g.b(iArr);
            nVar.f329k |= b4;
            if (b4) {
                invalidateSelf();
                return true;
            }
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j4) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j4);
        } else {
            super.scheduleSelf(runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f333b.f322b.getRootAlpha() != i) {
            this.f333b.f322b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f333b.f325e = z3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f335d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            m3.d.J(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            H.a.h(drawable, colorStateList);
            return;
        }
        n nVar = this.f333b;
        if (nVar.f323c != colorStateList) {
            nVar.f323c = colorStateList;
            this.f334c = a(colorStateList, nVar.f324d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            H.a.i(drawable, mode);
            return;
        }
        n nVar = this.f333b;
        if (nVar.f324d != mode) {
            nVar.f324d = mode;
            this.f334c = a(nVar.f323c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f286a;
        return drawable != null ? drawable.setVisible(z3, z4) : super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v19, types: [C0.l, C0.i, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        m mVar;
        int i;
        boolean z3;
        char c4;
        int i4;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f286a;
        if (drawable != null) {
            H.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f333b;
        nVar.f322b = new m();
        TypedArray f2 = F.b.f(resources, theme, attributeSet, a.f268a);
        n nVar2 = this.f333b;
        m mVar2 = nVar2.f322b;
        int i5 = !F.b.c(xmlPullParser, "tintMode") ? -1 : f2.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f324d = mode;
        int i6 = 1;
        ColorStateList colorStateList = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f2.getValue(1, typedValue);
            int i7 = typedValue.type;
            if (i7 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i7 >= 28 && i7 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f2.getResources();
                int resourceId = f2.getResourceId(1, 0);
                ThreadLocal threadLocal = F.c.f478a;
                try {
                    colorStateList = F.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e4) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f323c = colorStateList2;
        }
        boolean z4 = nVar2.f325e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z4 = f2.getBoolean(5, z4);
        }
        nVar2.f325e = z4;
        float f4 = mVar2.f315j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f4 = f2.getFloat(7, f4);
        }
        mVar2.f315j = f4;
        float f5 = mVar2.f316k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f5 = f2.getFloat(8, f5);
        }
        mVar2.f316k = f5;
        boolean z5 = false;
        if (mVar2.f315j <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f5 > BitmapDescriptorFactory.HUE_RED) {
            mVar2.h = f2.getDimension(3, mVar2.h);
            float dimension = f2.getDimension(2, mVar2.i);
            mVar2.i = dimension;
            if (mVar2.h <= BitmapDescriptorFactory.HUE_RED) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > BitmapDescriptorFactory.HUE_RED) {
                float alpha = mVar2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f2.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    mVar2.f318m = string;
                    mVar2.f320o.put(string, mVar2);
                }
                f2.recycle();
                nVar.f321a = getChangingConfigurations();
                nVar.f329k = true;
                n nVar3 = this.f333b;
                m mVar3 = nVar3.f322b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.f314g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar = (j) arrayDeque.peek();
                        boolean equals = NavArguments.ARG_DYNAMIC_LINKS_TAB.equals(name);
                        i = depth;
                        s.e eVar = mVar3.f320o;
                        if (equals) {
                            ?? lVar = new l();
                            lVar.f288e = BitmapDescriptorFactory.HUE_RED;
                            lVar.f290g = 1.0f;
                            lVar.h = 1.0f;
                            mVar = mVar3;
                            lVar.i = BitmapDescriptorFactory.HUE_RED;
                            lVar.f291j = 1.0f;
                            lVar.f292k = BitmapDescriptorFactory.HUE_RED;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            lVar.f293l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            lVar.f294m = join2;
                            lVar.f295n = 4.0f;
                            TypedArray f6 = F.b.f(resources, theme, attributeSet, a.f270c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f6.getString(0);
                                if (string2 != null) {
                                    lVar.f306b = string2;
                                }
                                String string3 = f6.getString(2);
                                if (string3 != null) {
                                    lVar.f305a = AbstractC0105a.o(string3);
                                }
                                lVar.f289f = F.b.b(f6, xmlPullParser, theme, "fillColor", 1);
                                float f7 = lVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f7 = f6.getFloat(12, f7);
                                }
                                lVar.h = f7;
                                int i8 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f6.getInt(8, -1) : -1;
                                Paint.Cap cap3 = lVar.f293l;
                                if (i8 == 0) {
                                    cap = cap2;
                                } else if (i8 != 1) {
                                    cap = i8 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                lVar.f293l = cap;
                                int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f6.getInt(9, -1) : -1;
                                Paint.Join join3 = lVar.f294m;
                                if (i9 == 0) {
                                    join = join2;
                                } else if (i9 != 1) {
                                    join = i9 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                lVar.f294m = join;
                                float f8 = lVar.f295n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f8 = f6.getFloat(10, f8);
                                }
                                lVar.f295n = f8;
                                lVar.f287d = F.b.b(f6, xmlPullParser, theme, "strokeColor", 3);
                                float f9 = lVar.f290g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f9 = f6.getFloat(11, f9);
                                }
                                lVar.f290g = f9;
                                float f10 = lVar.f288e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f10 = f6.getFloat(4, f10);
                                }
                                lVar.f288e = f10;
                                float f11 = lVar.f291j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f11 = f6.getFloat(6, f11);
                                }
                                lVar.f291j = f11;
                                float f12 = lVar.f292k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f12 = f6.getFloat(7, f12);
                                }
                                lVar.f292k = f12;
                                float f13 = lVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f13 = f6.getFloat(5, f13);
                                }
                                lVar.i = f13;
                                int i10 = lVar.f307c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i10 = f6.getInt(13, i10);
                                }
                                lVar.f307c = i10;
                            }
                            f6.recycle();
                            jVar.f297b.add(lVar);
                            if (lVar.getPathName() != null) {
                                eVar.put(lVar.getPathName(), lVar);
                            }
                            nVar3.f321a = nVar3.f321a;
                            z6 = false;
                            c4 = '\b';
                            z3 = false;
                        } else {
                            mVar = mVar3;
                            c4 = '\b';
                            z3 = false;
                            if ("clip-path".equals(name)) {
                                l lVar2 = new l();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f14 = F.b.f(resources, theme, attributeSet, a.f271d);
                                    String string4 = f14.getString(0);
                                    if (string4 != null) {
                                        lVar2.f306b = string4;
                                    }
                                    String string5 = f14.getString(1);
                                    if (string5 != null) {
                                        lVar2.f305a = AbstractC0105a.o(string5);
                                    }
                                    lVar2.f307c = !F.b.c(xmlPullParser, "fillType") ? 0 : f14.getInt(2, 0);
                                    f14.recycle();
                                }
                                jVar.f297b.add(lVar2);
                                if (lVar2.getPathName() != null) {
                                    eVar.put(lVar2.getPathName(), lVar2);
                                }
                                nVar3.f321a = nVar3.f321a;
                            } else if ("group".equals(name)) {
                                j jVar2 = new j();
                                TypedArray f15 = F.b.f(resources, theme, attributeSet, a.f269b);
                                float f16 = jVar2.f298c;
                                if (F.b.c(xmlPullParser, "rotation")) {
                                    f16 = f15.getFloat(5, f16);
                                }
                                jVar2.f298c = f16;
                                jVar2.f299d = f15.getFloat(1, jVar2.f299d);
                                jVar2.f300e = f15.getFloat(2, jVar2.f300e);
                                float f17 = jVar2.f301f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f17 = f15.getFloat(3, f17);
                                }
                                jVar2.f301f = f17;
                                float f18 = jVar2.f302g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f18 = f15.getFloat(4, f18);
                                }
                                jVar2.f302g = f18;
                                float f19 = jVar2.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f19 = f15.getFloat(6, f19);
                                }
                                jVar2.h = f19;
                                float f20 = jVar2.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f20 = f15.getFloat(7, f20);
                                }
                                jVar2.i = f20;
                                String string6 = f15.getString(0);
                                if (string6 != null) {
                                    jVar2.f304k = string6;
                                }
                                jVar2.c();
                                f15.recycle();
                                jVar.f297b.add(jVar2);
                                arrayDeque.push(jVar2);
                                if (jVar2.getGroupName() != null) {
                                    eVar.put(jVar2.getGroupName(), jVar2);
                                }
                                nVar3.f321a = nVar3.f321a;
                            }
                        }
                        i4 = 1;
                    } else {
                        mVar = mVar3;
                        i = depth;
                        z3 = z5;
                        c4 = '\b';
                        i4 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i6 = i4;
                    z5 = z3;
                    mVar3 = mVar;
                    depth = i;
                }
                if (!z6) {
                    this.f334c = a(nVar.f323c, nVar.f324d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f337f = true;
        this.f338g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f333b = nVar;
        this.f334c = a(nVar.f323c, nVar.f324d);
    }
}
