package androidx.recyclerview.widget;

import O.C0079u;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0230m0 {

    /* renamed from: a, reason: collision with root package name */
    public C0216f0 f3845a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3846b;

    /* renamed from: c, reason: collision with root package name */
    public long f3847c;

    /* renamed from: d, reason: collision with root package name */
    public long f3848d;

    /* renamed from: e, reason: collision with root package name */
    public long f3849e;

    /* renamed from: f, reason: collision with root package name */
    public long f3850f;

    public static void b(I0 i02) {
        int i = i02.mFlags;
        if (!i02.isInvalid() && (i & 4) == 0) {
            i02.getOldPosition();
            i02.getAbsoluteAdapterPosition();
        }
    }

    public abstract boolean a(I0 i02, I0 i03, C0079u c0079u, C0079u c0079u2);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.recyclerview.widget.I0 r9) {
        /*
            r8 = this;
            androidx.recyclerview.widget.f0 r8 = r8.f3845a
            if (r8 == 0) goto Laf
            r0 = 1
            r9.setIsRecyclable(r0)
            androidx.recyclerview.widget.I0 r1 = r9.mShadowedHolder
            r2 = 0
            if (r1 == 0) goto L13
            androidx.recyclerview.widget.I0 r1 = r9.mShadowingHolder
            if (r1 != 0) goto L13
            r9.mShadowedHolder = r2
        L13:
            r9.mShadowingHolder = r2
            boolean r1 = r9.shouldBeKeptAsChild()
            if (r1 != 0) goto Laf
            android.view.View r1 = r9.itemView
            androidx.recyclerview.widget.RecyclerView r8 = r8.f3809a
            r8.n0()
            androidx.recyclerview.widget.j r2 = r8.f3682f
            androidx.recyclerview.widget.i r3 = r2.f3827b
            androidx.recyclerview.widget.f0 r4 = r2.f3826a
            int r5 = r2.f3829d
            r6 = 0
            if (r5 != r0) goto L3b
            android.view.View r0 = r2.f3830e
            if (r0 != r1) goto L33
        L31:
            r0 = r6
            goto L64
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r8.<init>(r9)
            throw r8
        L3b:
            r7 = 2
            if (r5 == r7) goto La7
            r2.f3829d = r7     // Catch: java.lang.Throwable -> L4f
            androidx.recyclerview.widget.RecyclerView r5 = r4.f3809a     // Catch: java.lang.Throwable -> L4f
            int r5 = r5.indexOfChild(r1)     // Catch: java.lang.Throwable -> L4f
            r7 = -1
            if (r5 != r7) goto L51
            r2.j(r1)     // Catch: java.lang.Throwable -> L4f
        L4c:
            r2.f3829d = r6
            goto L64
        L4f:
            r8 = move-exception
            goto La4
        L51:
            boolean r7 = r3.d(r5)     // Catch: java.lang.Throwable -> L4f
            if (r7 == 0) goto L61
            r3.g(r5)     // Catch: java.lang.Throwable -> L4f
            r2.j(r1)     // Catch: java.lang.Throwable -> L4f
            r4.h(r5)     // Catch: java.lang.Throwable -> L4f
            goto L4c
        L61:
            r2.f3829d = r6
            goto L31
        L64:
            if (r0 == 0) goto L91
            androidx.recyclerview.widget.I0 r2 = androidx.recyclerview.widget.RecyclerView.N(r1)
            androidx.recyclerview.widget.y0 r3 = r8.f3676c
            r3.l(r2)
            r3.i(r2)
            boolean r2 = androidx.recyclerview.widget.RecyclerView.f3642B0
            if (r2 == 0) goto L91
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "after removing animated view: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ", "
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.d(r2, r1)
        L91:
            r1 = r0 ^ 1
            r8.o0(r1)
            if (r0 != 0) goto Laf
            boolean r0 = r9.isTmpDetached()
            if (r0 == 0) goto Laf
            android.view.View r9 = r9.itemView
            r8.removeDetachedView(r9, r6)
            return
        La4:
            r2.f3829d = r6
            throw r8
        La7:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r8.<init>(r9)
            throw r8
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AbstractC0230m0.c(androidx.recyclerview.widget.I0):void");
    }

    public abstract void d(I0 i02);

    public abstract void e();

    public abstract boolean f();
}
