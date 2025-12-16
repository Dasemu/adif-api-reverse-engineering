package C0;

import B0.q;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class f extends g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f282c;

    /* renamed from: d, reason: collision with root package name */
    public q f283d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f284e = null;

    /* renamed from: f, reason: collision with root package name */
    public final c f285f = new c(this);

    /* renamed from: b, reason: collision with root package name */
    public final d f281b = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.Drawable$ConstantState, C0.d] */
    public f(Context context) {
        this.f282c = context;
    }

    @Override // C0.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            H.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            return H.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f281b;
        dVar.f276a.draw(canvas);
        if (dVar.f277b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f286a;
        return drawable != null ? drawable.getAlpha() : this.f281b.f276a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f281b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f286a;
        return drawable != null ? H.a.c(drawable) : this.f281b.f276a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f286a != null) {
            return new e(this.f286a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f286a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f281b.f276a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f286a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f281b.f276a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f286a;
        return drawable != null ? drawable.getOpacity() : this.f281b.f276a.getOpacity();
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [s.e, s.j] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.f286a;
        if (drawable != null) {
            H.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f281b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = F.b.f(resources, theme, attributeSet, a.f272e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = F.q.f503a;
                        pVar.f286a = F.j.a(resources, resourceId, theme);
                        new o(pVar.f286a.getConstantState());
                        pVar.f337f = false;
                        pVar.setCallback(this.f285f);
                        p pVar2 = dVar.f276a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        dVar.f276a = pVar;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f273f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f282c;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(dVar.f276a.f333b.f322b.f320o.get(string));
                            if (dVar.f278c == null) {
                                dVar.f278c = new ArrayList();
                                dVar.f279d = new s.j(0);
                            }
                            dVar.f278c.add(loadAnimator);
                            dVar.f279d.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f277b == null) {
            dVar.f277b = new AnimatorSet();
        }
        dVar.f277b.playTogether(dVar.f278c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f286a;
        return drawable != null ? drawable.isAutoMirrored() : this.f281b.f276a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f286a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f281b.f277b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f286a;
        return drawable != null ? drawable.isStateful() : this.f281b.f276a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f281b.f276a.setBounds(rect);
        }
    }

    @Override // C0.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f286a;
        return drawable != null ? drawable.setLevel(i) : this.f281b.f276a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f286a;
        return drawable != null ? drawable.setState(iArr) : this.f281b.f276a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f281b.f276a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f281b.f276a.setAutoMirrored(z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f281b.f276a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            m3.d.J(drawable, i);
        } else {
            this.f281b.f276a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            H.a.h(drawable, colorStateList);
        } else {
            this.f281b.f276a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            H.a.i(drawable, mode);
        } else {
            this.f281b.f276a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        this.f281b.f276a.setVisible(z3, z4);
        return super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f281b;
        if (dVar.f277b.isStarted()) {
            return;
        }
        dVar.f277b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f286a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f281b.f277b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
