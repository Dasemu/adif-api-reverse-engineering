package com.adif.elcanomovil.repositories.di;

import android.content.Context;
import com.adif.elcanomovil.domain.repositories.linecolours.LineColoursRepository;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes.dex */
public final class RepositoryModule_Companion_ProvideLineColoursRepositoryFactory implements Factory<LineColoursRepository> {
    private final Provider<Context> contextProvider;
    private final Provider<StationsRepository> stationsRepositoryProvider;

    public RepositoryModule_Companion_ProvideLineColoursRepositoryFactory(Provider<Context> provider, Provider<StationsRepository> provider2) {
        this.contextProvider = provider;
        this.stationsRepositoryProvider = provider2;
    }

    public static RepositoryModule_Companion_ProvideLineColoursRepositoryFactory create(Provider<Context> provider, Provider<StationsRepository> provider2) {
        return new RepositoryModule_Companion_ProvideLineColoursRepositoryFactory(provider, provider2);
    }

    public static LineColoursRepository provideLineColoursRepository(Context context, StationsRepository stationsRepository) {
        return (LineColoursRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideLineColoursRepository(context, stationsRepository));
    }

    @Override // javax.inject.Provider
    public LineColoursRepository get() {
        return provideLineColoursRepository(this.contextProvider.get(), this.stationsRepositoryProvider.get());
    }
}
