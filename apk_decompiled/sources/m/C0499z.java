package m;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import f.AbstractC0336a;
import f0.C0339c;
import f0.C0342f;
import f0.C0345i;
import f0.C0346j;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: m.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0499z implements U {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f7783d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7784a;

    /* renamed from: b, reason: collision with root package name */
    public final View f7785b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7786c;

    public C0499z(AbsSeekBar absSeekBar) {
        this.f7784a = 0;
        this.f7785b = absSeekBar;
    }

    @Override // m.U
    public void a(int i) {
        W.e((W) this.f7786c, i);
    }

    @Override // m.U
    public void b(int i) {
        W.d((W) this.f7786c, i);
    }

    @Override // m.U
    public void c(int i, float f2) {
    }

    public KeyListener d(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((F.i) ((A.a) this.f7786c).f7b).getClass();
        if (keyListener instanceof C0342f) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0342f(keyListener);
    }

    public void e(AttributeSet attributeSet, int i) {
        switch (this.f7784a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f7785b;
                R0.h l4 = R0.h.l(absSeekBar.getContext(), attributeSet, f7783d, i);
                Drawable g4 = l4.g(0);
                if (g4 != null) {
                    if (g4 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) g4;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i4 = 0; i4 < numberOfFrames; i4++) {
                            Drawable h = h(animationDrawable.getFrame(i4), true);
                            h.setLevel(10000);
                            animationDrawable2.addFrame(h, animationDrawable.getDuration(i4));
                        }
                        animationDrawable2.setLevel(10000);
                        g4 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(g4);
                }
                Drawable g5 = l4.g(1);
                if (g5 != null) {
                    absSeekBar.setProgressDrawable(h(g5, false));
                }
                l4.n();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f7785b).getContext().obtainStyledAttributes(attributeSet, AbstractC0336a.i, i, 0);
                try {
                    boolean z3 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    g(z3);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public C0339c f(InputConnection inputConnection, EditorInfo editorInfo) {
        A.a aVar = (A.a) this.f7786c;
        if (inputConnection == null) {
            aVar.getClass();
            inputConnection = null;
        } else {
            F.i iVar = (F.i) aVar.f7b;
            iVar.getClass();
            if (!(inputConnection instanceof C0339c)) {
                inputConnection = new C0339c((EditText) iVar.f490b, inputConnection, editorInfo);
            }
        }
        return (C0339c) inputConnection;
    }

    public void g(boolean z3) {
        C0346j c0346j = (C0346j) ((F.i) ((A.a) this.f7786c).f7b).f491c;
        if (c0346j.f6465c != z3) {
            if (c0346j.f6464b != null) {
                d0.h a2 = d0.h.a();
                C0345i c0345i = c0346j.f6464b;
                a2.getClass();
                m3.d.i(c0345i, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f6124a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f6125b.remove(c0345i);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0346j.f6465c = z3;
            if (z3) {
                C0346j.a(c0346j.f6463a, d0.h.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable h(Drawable drawable, boolean z3) {
        if (drawable instanceof H.g) {
            ((H.h) ((H.g) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = h(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    layerDrawable2.setId(i4, layerDrawable.getId(i4));
                    layerDrawable2.setLayerGravity(i4, layerDrawable.getLayerGravity(i4));
                    layerDrawable2.setLayerWidth(i4, layerDrawable.getLayerWidth(i4));
                    layerDrawable2.setLayerHeight(i4, layerDrawable.getLayerHeight(i4));
                    layerDrawable2.setLayerInsetLeft(i4, layerDrawable.getLayerInsetLeft(i4));
                    layerDrawable2.setLayerInsetRight(i4, layerDrawable.getLayerInsetRight(i4));
                    layerDrawable2.setLayerInsetTop(i4, layerDrawable.getLayerInsetTop(i4));
                    layerDrawable2.setLayerInsetBottom(i4, layerDrawable.getLayerInsetBottom(i4));
                    layerDrawable2.setLayerInsetStart(i4, layerDrawable.getLayerInsetStart(i4));
                    layerDrawable2.setLayerInsetEnd(i4, layerDrawable.getLayerInsetEnd(i4));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f7786c) == null) {
                    this.f7786c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z3 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C0499z(EditText editText) {
        this.f7784a = 1;
        this.f7785b = editText;
        this.f7786c = new A.a(editText);
    }

    public C0499z(W w3) {
        this.f7784a = 2;
        this.f7786c = w3;
        this.f7784a = 2;
        this.f7785b = w3;
    }
}
