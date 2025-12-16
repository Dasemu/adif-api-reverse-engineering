package m;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import android.widget.TextView;

/* renamed from: m.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0485s {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f7737a = null;

    /* renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f7738b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7739c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7740d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7741e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f7742f;

    public /* synthetic */ C0485s(TextView textView) {
        this.f7742f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f7742f;
        Drawable a2 = U.c.a(compoundButton);
        if (a2 != null) {
            if (this.f7739c || this.f7740d) {
                Drawable mutate = a2.mutate();
                if (this.f7739c) {
                    H.a.h(mutate, this.f7737a);
                }
                if (this.f7740d) {
                    H.a.i(mutate, this.f7738b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        r rVar = (r) this.f7742f;
        Drawable checkMarkDrawable = rVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f7739c || this.f7740d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f7739c) {
                    H.a.h(mutate, this.f7737a);
                }
                if (this.f7740d) {
                    H.a.i(mutate, this.f7738b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(rVar.getDrawableState());
                }
                rVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:3:0x0026, B:5:0x002d, B:8:0x0033, B:9:0x0059, B:11:0x0060, B:12:0x0067, B:14:0x006e, B:21:0x0042, B:23:0x0048, B:25:0x004e), top: B:2:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #1 {all -> 0x003f, blocks: (B:3:0x0026, B:5:0x002d, B:8:0x0033, B:9:0x0059, B:11:0x0060, B:12:0x0067, B:14:0x006e, B:21:0x0042, B:23:0x0048, B:25:0x004e), top: B:2:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            android.widget.TextView r8 = r8.f7742f
            r0 = r8
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r8 = r0.getContext()
            int[] r2 = f.AbstractC0336a.f6432m
            R0.h r8 = R0.h.l(r8, r9, r2, r10)
            java.lang.Object r1 = r8.f1414b
            r7 = r1
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r0.getContext()
            java.util.WeakHashMap r3 = O.X.f1226a
            java.lang.Object r3 = r8.f1414b
            r4 = r3
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r6 = 0
            r3 = r9
            r5 = r10
            O.S.d(r0, r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            if (r10 == 0) goto L42
            int r9 = r7.getResourceId(r9, r1)     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L42
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L3f android.content.res.Resources.NotFoundException -> L42
            android.graphics.drawable.Drawable r9 = a.AbstractC0106b.m(r10, r9)     // Catch: java.lang.Throwable -> L3f android.content.res.Resources.NotFoundException -> L42
            r0.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3f android.content.res.Resources.NotFoundException -> L42
            goto L59
        L3f:
            r0 = move-exception
            r9 = r0
            goto L7f
        L42:
            boolean r9 = r7.hasValue(r1)     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L59
            int r9 = r7.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L59
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L3f
            android.graphics.drawable.Drawable r9 = a.AbstractC0106b.m(r10, r9)     // Catch: java.lang.Throwable -> L3f
            r0.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3f
        L59:
            r9 = 2
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3f
            if (r10 == 0) goto L67
            android.content.res.ColorStateList r9 = r8.e(r9)     // Catch: java.lang.Throwable -> L3f
            U.b.c(r0, r9)     // Catch: java.lang.Throwable -> L3f
        L67:
            r9 = 3
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3f
            if (r10 == 0) goto L7b
            r10 = -1
            int r9 = r7.getInt(r9, r10)     // Catch: java.lang.Throwable -> L3f
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = m.AbstractC0463g0.c(r9, r10)     // Catch: java.lang.Throwable -> L3f
            U.b.d(r0, r9)     // Catch: java.lang.Throwable -> L3f
        L7b:
            r8.n()
            return
        L7f:
            r8.n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0485s.c(android.util.AttributeSet, int):void");
    }
}
