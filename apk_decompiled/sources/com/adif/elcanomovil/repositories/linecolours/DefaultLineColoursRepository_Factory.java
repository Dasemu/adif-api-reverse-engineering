package com.adif.elcanomovil.repositories.linecolours;

import android.content.Context;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class DefaultLineColoursRepository_Factory implements Factory<DefaultLineColoursRepository> {
    private final Provider<Context> contextProvider;
    private final Provider<StationsRepository> stationsRepositoryProvider;

    public DefaultLineColoursRepository_Factory(Provider<Context> provider, Provider<StationsRepository> provider2) {
        this.contextProvider = provider;
        this.stationsRepositoryProvider = provider2;
    }

    public static DefaultLineColoursRepository_Factory create(Provider<Context> provider, Provider<StationsRepository> provider2) {
        return new DefaultLineColoursRepository_Factory(provider, provider2);
    }

    public static DefaultLineColoursRepository newInstance(Context context, StationsRepository stationsRepository) {
        return new DefaultLineColoursRepository(context, stationsRepository);
    }

    @Override // javax.inject.Provider
    public DefaultLineColoursRepository get() {
        return newInstance(this.contextProvider.get(), this.stationsRepositoryProvider.get());
    }
}
