package com.adif.elcanomovil.serviceStorage.preferences;

import Z2.G;
import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes.dex */
public final class SharedPreferenceStorage_Factory implements Factory<SharedPreferenceStorage> {
    private final Provider<Context> contextProvider;
    private final Provider<G> moshiProvider;

    public SharedPreferenceStorage_Factory(Provider<Context> provider, Provider<G> provider2) {
        this.contextProvider = provider;
        this.moshiProvider = provider2;
    }

    public static SharedPreferenceStorage_Factory create(Provider<Context> provider, Provider<G> provider2) {
        return new SharedPreferenceStorage_Factory(provider, provider2);
    }

    public static SharedPreferenceStorage newInstance(Context context, G g4) {
        return new SharedPreferenceStorage(context, g4);
    }

    @Override // javax.inject.Provider
    public SharedPreferenceStorage get() {
        return newInstance(this.contextProvider.get(), this.moshiProvider.get());
    }
}
