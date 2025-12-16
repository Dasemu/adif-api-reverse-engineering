package com.adif.elcanomovil.widget.di;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes3.dex */
public final class WidgetsModule_ProvideConnectivityManagerFactory implements Factory<ConnectivityManager> {
    private final Provider<Context> contextProvider;
    private final WidgetsModule module;

    public WidgetsModule_ProvideConnectivityManagerFactory(WidgetsModule widgetsModule, Provider<Context> provider) {
        this.module = widgetsModule;
        this.contextProvider = provider;
    }

    public static WidgetsModule_ProvideConnectivityManagerFactory create(WidgetsModule widgetsModule, Provider<Context> provider) {
        return new WidgetsModule_ProvideConnectivityManagerFactory(widgetsModule, provider);
    }

    public static ConnectivityManager provideConnectivityManager(WidgetsModule widgetsModule, Context context) {
        return (ConnectivityManager) Preconditions.checkNotNullFromProvides(widgetsModule.provideConnectivityManager(context));
    }

    @Override // javax.inject.Provider
    public ConnectivityManager get() {
        return provideConnectivityManager(this.module, this.contextProvider.get());
    }
}
