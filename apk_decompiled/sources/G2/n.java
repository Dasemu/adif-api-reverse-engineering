package G2;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes3.dex */
public final class n implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A.j f626a;

    public n(A.j jVar) {
        this.f626a = jVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        A.j jVar = this.f626a;
        o oVar = (o) message.obj;
        synchronized (jVar.f27a) {
            if (((o) jVar.f29c) == oVar || ((o) jVar.f30d) == oVar) {
                jVar.a(oVar, 2);
            }
        }
        return true;
    }
}
