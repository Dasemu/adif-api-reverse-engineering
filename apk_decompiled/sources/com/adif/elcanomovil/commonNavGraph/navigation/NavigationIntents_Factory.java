package com.adif.elcanomovil.commonNavGraph.navigation;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes.dex */
public final class NavigationIntents_Factory implements Factory<NavigationIntents> {
    private final Provider<Context> contextProvider;

    public NavigationIntents_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static NavigationIntents_Factory create(Provider<Context> provider) {
        return new NavigationIntents_Factory(provider);
    }

    public static NavigationIntents newInstance(Context context) {
        return new NavigationIntents(context);
    }

    @Override // javax.inject.Provider
    public NavigationIntents get() {
        return newInstance(this.contextProvider.get());
    }
}
