package com.adif.elcanomovil.splash;

import com.adif.elcanomovil.uiAvisa.components.authenticator.AuthenticationProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
    private final Provider<AuthenticationProvider> authProvider;

    public SplashViewModel_Factory(Provider<AuthenticationProvider> provider) {
        this.authProvider = provider;
    }

    public static SplashViewModel_Factory create(Provider<AuthenticationProvider> provider) {
        return new SplashViewModel_Factory(provider);
    }

    public static SplashViewModel newInstance(AuthenticationProvider authenticationProvider) {
        return new SplashViewModel(authenticationProvider);
    }

    @Override // javax.inject.Provider
    public SplashViewModel get() {
        return newInstance(this.authProvider.get());
    }
}
