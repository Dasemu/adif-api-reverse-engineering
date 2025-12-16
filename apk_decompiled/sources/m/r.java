package m;

import a.AbstractC0106b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.C0207b;

/* loaded from: classes.dex */
public final class r extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0485s f7732a;

    /* renamed from: b, reason: collision with root package name */
    public final C0207b f7733b;

    /* renamed from: c, reason: collision with root package name */
    public final T f7734c;

    /* renamed from: d, reason: collision with root package name */
    public C0491v f7735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0089 A[Catch: all -> 0x0068, TryCatch #1 {all -> 0x0068, blocks: (B:3:0x004f, B:5:0x0056, B:8:0x005c, B:9:0x0082, B:11:0x0089, B:12:0x0090, B:14:0x0097, B:21:0x006b, B:23:0x0071, B:25:0x0077), top: B:2:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #1 {all -> 0x0068, blocks: (B:3:0x004f, B:5:0x0056, B:8:0x005c, B:9:0x0082, B:11:0x0089, B:12:0x0090, B:14:0x0097, B:21:0x006b, B:23:0x0071, B:25:0x0077), top: B:2:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            m.L0.a(r9)
            r5 = 2130903252(0x7f0300d4, float:1.7413317E38)
            r8.<init>(r9, r10, r5)
            android.content.Context r9 = r8.getContext()
            m.K0.a(r8, r9)
            m.T r9 = new m.T
            r9.<init>(r8)
            r8.f7734c = r9
            r9.f(r10, r5)
            r9.b()
            androidx.recyclerview.widget.b r9 = new androidx.recyclerview.widget.b
            r9.<init>(r8)
            r8.f7733b = r9
            r9.k(r10, r5)
            m.s r9 = new m.s
            r9.<init>(r8)
            r8.f7732a = r9
            android.content.Context r9 = r8.getContext()
            int[] r2 = f.AbstractC0336a.f6431l
            R0.h r9 = R0.h.l(r9, r10, r2, r5)
            java.lang.Object r0 = r9.f1414b
            r7 = r0
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r8.getContext()
            java.util.WeakHashMap r0 = O.X.f1226a
            java.lang.Object r0 = r9.f1414b
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r6 = 0
            r0 = r8
            r3 = r10
            O.S.d(r0, r1, r2, r3, r4, r5, r6)
            r8 = 1
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L68
            r1 = 0
            if (r10 == 0) goto L6b
            int r8 = r7.getResourceId(r8, r1)     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L6b
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L68 android.content.res.Resources.NotFoundException -> L6b
            android.graphics.drawable.Drawable r8 = a.AbstractC0106b.m(r10, r8)     // Catch: java.lang.Throwable -> L68 android.content.res.Resources.NotFoundException -> L6b
            r0.setCheckMarkDrawable(r8)     // Catch: java.lang.Throwable -> L68 android.content.res.Resources.NotFoundException -> L6b
            goto L82
        L68:
            r0 = move-exception
            r8 = r0
            goto Laf
        L6b:
            boolean r8 = r7.hasValue(r1)     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L82
            int r8 = r7.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L82
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L68
            android.graphics.drawable.Drawable r8 = a.AbstractC0106b.m(r10, r8)     // Catch: java.lang.Throwable -> L68
            r0.setCheckMarkDrawable(r8)     // Catch: java.lang.Throwable -> L68
        L82:
            r8 = 2
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L68
            if (r10 == 0) goto L90
            android.content.res.ColorStateList r8 = r9.e(r8)     // Catch: java.lang.Throwable -> L68
            r0.setCheckMarkTintList(r8)     // Catch: java.lang.Throwable -> L68
        L90:
            r8 = 3
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L68
            if (r10 == 0) goto La4
            r10 = -1
            int r8 = r7.getInt(r8, r10)     // Catch: java.lang.Throwable -> L68
            r10 = 0
            android.graphics.PorterDuff$Mode r8 = m.AbstractC0463g0.c(r8, r10)     // Catch: java.lang.Throwable -> L68
            r0.setCheckMarkTintMode(r8)     // Catch: java.lang.Throwable -> L68
        La4:
            r9.n()
            m.v r8 = r0.getEmojiTextViewHelper()
            r8.b(r3, r5)
            return
        Laf:
            r9.n()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m.r.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C0491v getEmojiTextViewHelper() {
        if (this.f7735d == null) {
            this.f7735d = new C0491v(this);
        }
        return this.f7735d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        T t2 = this.f7734c;
        if (t2 != null) {
            t2.b();
        }
        C0207b c0207b = this.f7733b;
        if (c0207b != null) {
            c0207b.a();
        }
        C0485s c0485s = this.f7732a;
        if (c0485s != null) {
            c0485s.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207b c0207b = this.f7733b;
        if (c0207b != null) {
            return c0207b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207b c0207b = this.f7733b;
        if (c0207b != null) {
            return c0207b.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0485s c0485s = this.f7732a;
        if (c0485s != null) {
            return c0485s.f7737a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0485s c0485s = this.f7732a;
        if (c0485s != null) {
            return c0485s.f7738b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7734c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7734c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0106b.x(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207b c0207b = this.f7733b;
        if (c0207b != null) {
            c0207b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0207b c0207b = this.f7733b;
        if (c0207b != null) {
            c0207b.n(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0485s c0485s = this.f7732a;
        if (c0485s != null) {
            if (c0485s.f7741e) {
                c0485s.f7741e = false;
            } else {
                c0485s.f7741e = true;
                c0485s.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f7734c;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f7734c;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().d(z3);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0207b c0207b = this.f7733b;
        if (c0207b != null) {
            c0207b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207b c0207b = this.f7733b;
        if (c0207b != null) {
            c0207b.t(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0485s c0485s = this.f7732a;
        if (c0485s != null) {
            c0485s.f7737a = colorStateList;
            c0485s.f7739c = true;
            c0485s.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0485s c0485s = this.f7732a;
        if (c0485s != null) {
            c0485s.f7738b = mode;
            c0485s.f7740d = true;
            c0485s.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t2 = this.f7734c;
        t2.i(colorStateList);
        t2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t2 = this.f7734c;
        t2.j(mode);
        t2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        T t2 = this.f7734c;
        if (t2 != null) {
            t2.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC0106b.m(getContext(), i));
    }
}
