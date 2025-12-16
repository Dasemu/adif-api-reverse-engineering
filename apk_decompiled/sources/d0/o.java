package d0;

import C.w;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6140a;

    /* renamed from: b, reason: collision with root package name */
    public final I0.b f6141b;

    /* renamed from: c, reason: collision with root package name */
    public final E2.e f6142c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6143d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f6144e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f6145f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f6146g;
    public m3.l h;

    public o(Context context, I0.b bVar) {
        E2.e eVar = p.f6147d;
        this.f6143d = new Object();
        m3.d.i(context, "Context cannot be null");
        this.f6140a = context.getApplicationContext();
        this.f6141b = bVar;
        this.f6142c = eVar;
    }

    @Override // d0.g
    public final void a(m3.l lVar) {
        synchronized (this.f6143d) {
            this.h = lVar;
        }
        synchronized (this.f6143d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f6145f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0303a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f6146g = threadPoolExecutor;
                    this.f6145f = threadPoolExecutor;
                }
                this.f6145f.execute(new F2.f(this, 10));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f6143d) {
            try {
                this.h = null;
                Handler handler = this.f6144e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f6144e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f6146g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f6145f = null;
                this.f6146g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final L.i c() {
        try {
            E2.e eVar = this.f6142c;
            Context context = this.f6140a;
            I0.b bVar = this.f6141b;
            eVar.getClass();
            L.h a2 = L.c.a(context, bVar);
            int i = a2.f1036a;
            if (i != 0) {
                throw new RuntimeException(w.i(i, "fetchFonts failed (", ")"));
            }
            L.i[] iVarArr = (L.i[]) a2.f1037b;
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException("provider not found", e4);
        }
    }
}
