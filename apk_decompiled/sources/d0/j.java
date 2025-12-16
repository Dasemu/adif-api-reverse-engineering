package d0;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class j extends m3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m3.l f6132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f6133b;

    public j(m3.l lVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f6132a = lVar;
        this.f6133b = threadPoolExecutor;
    }

    @Override // m3.l
    public final void L(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f6133b;
        try {
            this.f6132a.L(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // m3.l
    public final void M(A.j jVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f6133b;
        try {
            this.f6132a.M(jVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
