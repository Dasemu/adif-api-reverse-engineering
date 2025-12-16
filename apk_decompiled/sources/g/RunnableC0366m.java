package g;

import android.content.Context;

/* renamed from: g.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0366m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6653b;

    public /* synthetic */ RunnableC0366m(Context context, int i) {
        this.f6652a = i;
        this.f6653b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.f6652a
            switch(r0) {
                case 0: goto L30;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            n.a r0 = new n.a
            r1 = 1
            r0.<init>(r1)
            f0.b r1 = s0.AbstractC0585d.f8373a
            r2 = 0
            android.content.Context r10 = r10.f6653b
            s0.AbstractC0585d.s(r10, r0, r1, r2)
            return
        L14:
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            r5 = 1
            r6 = 0
            r4 = 0
            r3.<init>(r4, r5, r6, r8, r9)
            g.m r0 = new g.m
            android.content.Context r10 = r10.f6653b
            r1 = 2
            r0.<init>(r10, r1)
            r3.execute(r0)
            return
        L30:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto Lb2
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r10 = r10.f6653b
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r10, r4)
            android.content.pm.PackageManager r4 = r10.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto Lb2
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L89
            s.f r0 = g.r.f6664g
            r0.getClass()
            s.a r2 = new s.a
            r2.<init>(r0)
        L58:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            g.r r0 = (g.r) r0
            if (r0 == 0) goto L58
            g.E r0 = (g.LayoutInflaterFactory2C0351E) r0
            android.content.Context r0 = r0.f6527k
            if (r0 == 0) goto L58
            java.lang.Object r0 = r0.getSystemService(r4)
            goto L78
        L77:
            r0 = 0
        L78:
            if (r0 == 0) goto L8e
            android.os.LocaleList r0 = g.AbstractC0368o.a(r0)
            K.i r2 = new K.i
            K.j r5 = new K.j
            r5.<init>(r0)
            r2.<init>(r5)
            goto L90
        L89:
            K.i r2 = g.r.f6660c
            if (r2 == 0) goto L8e
            goto L90
        L8e:
            K.i r2 = K.i.f971b
        L90:
            K.j r0 = r2.f972a
            android.os.LocaleList r0 = r0.f973a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lab
            java.lang.String r0 = C.AbstractC0044h.e(r10)
            java.lang.Object r2 = r10.getSystemService(r4)
            if (r2 == 0) goto Lab
            android.os.LocaleList r0 = g.AbstractC0367n.a(r0)
            g.AbstractC0368o.b(r2, r0)
        Lab:
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            r10.setComponentEnabledSetting(r3, r1, r1)
        Lb2:
            g.r.f6663f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.RunnableC0366m.run():void");
    }
}
