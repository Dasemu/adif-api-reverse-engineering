package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f8324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Callback f8325c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8326d;

    public /* synthetic */ a(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 anonymousClass1, Callback callback, Object obj, int i) {
        this.f8323a = i;
        this.f8324b = anonymousClass1;
        this.f8325c = callback;
        this.f8326d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8323a) {
            case 0:
                DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1.b(this.f8324b, this.f8325c, (Response) this.f8326d);
                return;
            default:
                DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1.a(this.f8324b, this.f8325c, (Throwable) this.f8326d);
                return;
        }
    }
}
