package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5974c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f5972a = i;
        this.f5973b = obj;
        this.f5974c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$updateRolloutsState$1;
        Void lambda$setConfigSettingsAsync$5;
        switch (this.f5972a) {
            case 0:
                lambda$updateRolloutsState$1 = ((UserMetadata) this.f5973b).lambda$updateRolloutsState$1((List) this.f5974c);
                return lambda$updateRolloutsState$1;
            case 1:
                lambda$setConfigSettingsAsync$5 = ((FirebaseRemoteConfig) this.f5973b).lambda$setConfigSettingsAsync$5((FirebaseRemoteConfigSettings) this.f5974c);
                return lambda$setConfigSettingsAsync$5;
            default:
                return ConfigCacheClient.b((ConfigCacheClient) this.f5973b, (ConfigContainer) this.f5974c);
        }
    }
}
