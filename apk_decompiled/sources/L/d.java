package L;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1025c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I0.b f1026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1027e;

    public /* synthetic */ d(String str, Context context, I0.b bVar, int i, int i4) {
        this.f1023a = i4;
        this.f1024b = str;
        this.f1025c = context;
        this.f1026d = bVar;
        this.f1027e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1023a) {
            case 0:
                return g.a(this.f1024b, this.f1025c, this.f1026d, this.f1027e);
            default:
                try {
                    return g.a(this.f1024b, this.f1025c, this.f1026d, this.f1027e);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
