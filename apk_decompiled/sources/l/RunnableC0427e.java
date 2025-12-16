package l;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0427e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0428f f7197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f7198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f7199c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h3.d f7200d;

    public RunnableC0427e(h3.d dVar, C0428f c0428f, o oVar, m mVar) {
        this.f7200d = dVar;
        this.f7197a = c0428f;
        this.f7198b = oVar;
        this.f7199c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0428f c0428f = this.f7197a;
        if (c0428f != null) {
            h3.d dVar = this.f7200d;
            ((ViewOnKeyListenerC0429g) dVar.f6791b).f7225z = true;
            c0428f.f7202b.c(false);
            ((ViewOnKeyListenerC0429g) dVar.f6791b).f7225z = false;
        }
        o oVar = this.f7198b;
        if (oVar.isEnabled() && oVar.hasSubMenu()) {
            this.f7199c.q(oVar, null, 4);
        }
    }
}
