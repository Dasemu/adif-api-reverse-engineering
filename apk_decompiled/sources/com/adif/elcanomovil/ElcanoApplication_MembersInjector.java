package com.adif.elcanomovil;

import androidx.lifecycle.I;
import com.adif.elcanomovil.observers.ApplicationObserver;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ElcanoApplication_MembersInjector implements MembersInjector<ElcanoApplication> {
    private final Provider<ApplicationObserver> applicationObserverProvider;
    private final Provider<I> myLifecycleProvider;

    public ElcanoApplication_MembersInjector(Provider<ApplicationObserver> provider, Provider<I> provider2) {
        this.applicationObserverProvider = provider;
        this.myLifecycleProvider = provider2;
    }

    public static MembersInjector<ElcanoApplication> create(Provider<ApplicationObserver> provider, Provider<I> provider2) {
        return new ElcanoApplication_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("com.adif.elcanomovil.ElcanoApplication.applicationObserver")
    public static void injectApplicationObserver(ElcanoApplication elcanoApplication, ApplicationObserver applicationObserver) {
        elcanoApplication.applicationObserver = applicationObserver;
    }

    @InjectedFieldSignature("com.adif.elcanomovil.ElcanoApplication.myLifecycleProvider")
    public static void injectMyLifecycleProvider(ElcanoApplication elcanoApplication, I i) {
        elcanoApplication.myLifecycleProvider = i;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ElcanoApplication elcanoApplication) {
        injectApplicationObserver(elcanoApplication, this.applicationObserverProvider.get());
        injectMyLifecycleProvider(elcanoApplication, this.myLifecycleProvider.get());
    }
}
