package c2;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import e2.InterfaceC0313b;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements InterfaceC0313b, Deferred.DeferredHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4255c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4256d;

    public /* synthetic */ h(l lVar, Iterable iterable, W1.j jVar, long j4) {
        this.f4254b = lVar;
        this.f4255c = iterable;
        this.f4256d = jVar;
        this.f4253a = j4;
    }

    @Override // e2.InterfaceC0313b
    public Object execute() {
        l lVar = (l) this.f4254b;
        d2.h hVar = (d2.h) lVar.f4269c;
        hVar.getClass();
        Iterable iterable = (Iterable) this.f4255c;
        if (iterable.iterator().hasNext()) {
            hVar.s(new i(5, hVar, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + d2.h.Z(iterable)));
        }
        hVar.s(new d2.e(lVar.f4273g.q() + this.f4253a, (W1.j) this.f4256d));
        return null;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        CrashlyticsNativeComponentDeferredProxy.lambda$prepareNativeSession$1((String) this.f4254b, (String) this.f4255c, this.f4253a, (StaticSessionData) this.f4256d, provider);
    }

    public /* synthetic */ h(String str, String str2, long j4, StaticSessionData staticSessionData) {
        this.f4254b = str;
        this.f4255c = str2;
        this.f4253a = j4;
        this.f4256d = staticSessionData;
    }
}
