package B0;

import android.util.Log;
import b2.C0269b;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import e2.InterfaceC0313b;

/* renamed from: B0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0031i implements InterfaceC0313b, Continuation, d2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f144c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f145d;

    public /* synthetic */ C0031i(Object obj, Object obj2, Object obj3, int i) {
        this.f142a = i;
        this.f143b = obj;
        this.f144c = obj2;
        this.f145d = obj3;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1, types: [I0.g, java.lang.Object] */
    @Override // d2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0031i.apply(java.lang.Object):java.lang.Object");
    }

    @Override // e2.InterfaceC0313b
    public Object execute() {
        C0269b c0269b = (C0269b) this.f143b;
        d2.h hVar = (d2.h) c0269b.f4178d;
        hVar.getClass();
        W1.j jVar = (W1.j) this.f144c;
        W1.i iVar = (W1.i) this.f145d;
        String concat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(concat, 3)) {
            Log.d(concat, "Storing event with priority=" + jVar.f1935c + ", name=" + iVar.f1927a + " for destination " + jVar.f1933a);
        }
        ((Long) hVar.s(new C0031i(hVar, iVar, jVar, 5))).getClass();
        c0269b.f4175a.a(jVar, 1, false);
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Task lambda$activate$2;
        switch (this.f142a) {
            case 2:
                lambda$activate$2 = ((FirebaseRemoteConfig) this.f143b).lambda$activate$2((Task) this.f144c, (Task) this.f145d, task);
                return lambda$activate$2;
            default:
                return ConfigRealtimeHttpClient.b((ConfigRealtimeHttpClient) this.f143b, (Task) this.f144c, (Task) this.f145d, task);
        }
    }
}
