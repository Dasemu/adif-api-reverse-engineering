package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.usecases.avisa.user.LoginAvisaUserUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.user.RefreshAvisaUserUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.user.RegisterAvisaUserUseCase;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.adif.elcanomovil.uiAvisa.components.authenticator.AuthenticationProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ApplicationModule_Companion_ProvideAuthtenticationProviderFactory implements Factory<AuthenticationProvider> {
    private final Provider<LoginAvisaUserUseCase> loginAvisaUserUseCaseProvider;
    private final Provider<PreferenceStorage> preferenceStorageProvider;
    private final Provider<RefreshAvisaUserUseCase> refreshAvisaUserUseCaseProvider;
    private final Provider<RegisterAvisaUserUseCase> registerAvisaUserUseCaseProvider;

    public ApplicationModule_Companion_ProvideAuthtenticationProviderFactory(Provider<RegisterAvisaUserUseCase> provider, Provider<LoginAvisaUserUseCase> provider2, Provider<RefreshAvisaUserUseCase> provider3, Provider<PreferenceStorage> provider4) {
        this.registerAvisaUserUseCaseProvider = provider;
        this.loginAvisaUserUseCaseProvider = provider2;
        this.refreshAvisaUserUseCaseProvider = provider3;
        this.preferenceStorageProvider = provider4;
    }

    public static ApplicationModule_Companion_ProvideAuthtenticationProviderFactory create(Provider<RegisterAvisaUserUseCase> provider, Provider<LoginAvisaUserUseCase> provider2, Provider<RefreshAvisaUserUseCase> provider3, Provider<PreferenceStorage> provider4) {
        return new ApplicationModule_Companion_ProvideAuthtenticationProviderFactory(provider, provider2, provider3, provider4);
    }

    public static AuthenticationProvider provideAuthtenticationProvider(RegisterAvisaUserUseCase registerAvisaUserUseCase, LoginAvisaUserUseCase loginAvisaUserUseCase, RefreshAvisaUserUseCase refreshAvisaUserUseCase, PreferenceStorage preferenceStorage) {
        return (AuthenticationProvider) Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideAuthtenticationProvider(registerAvisaUserUseCase, loginAvisaUserUseCase, refreshAvisaUserUseCase, preferenceStorage));
    }

    @Override // javax.inject.Provider
    public AuthenticationProvider get() {
        return provideAuthtenticationProvider(this.registerAvisaUserUseCaseProvider.get(), this.loginAvisaUserUseCaseProvider.get(), this.refreshAvisaUserUseCaseProvider.get(), this.preferenceStorageProvider.get());
    }
}
