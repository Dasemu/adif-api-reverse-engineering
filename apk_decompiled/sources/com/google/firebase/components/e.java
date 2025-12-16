package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.inject.Provider;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5931b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5932c;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f5930a = i;
        this.f5932c = obj;
        this.f5931b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5930a) {
            case 0:
                ((OptionalProvider) this.f5932c).set((Provider) this.f5931b);
                return;
            case 1:
                ((LazySet) this.f5932c).add((Provider) this.f5931b);
                return;
            default:
                EventBus.lambda$publish$0((Map.Entry) this.f5932c, (Event) this.f5931b);
                return;
        }
    }
}
