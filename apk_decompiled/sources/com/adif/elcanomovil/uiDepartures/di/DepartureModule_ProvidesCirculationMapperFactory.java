package com.adif.elcanomovil.uiDepartures.di;

import com.adif.elcanomovil.domain.entities.circulation.mappers.CercaniasCirculationMapper;
import com.adif.elcanomovil.domain.repositories.linecolours.LineColoursRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.text.DateFormat;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes2.dex */
public final class DepartureModule_ProvidesCirculationMapperFactory implements Factory<CercaniasCirculationMapper> {
    private final Provider<DateFormat> formatterProvider;
    private final Provider<LineColoursRepository> lineColoursRepositoryProvider;

    public DepartureModule_ProvidesCirculationMapperFactory(Provider<DateFormat> provider, Provider<LineColoursRepository> provider2) {
        this.formatterProvider = provider;
        this.lineColoursRepositoryProvider = provider2;
    }

    public static DepartureModule_ProvidesCirculationMapperFactory create(Provider<DateFormat> provider, Provider<LineColoursRepository> provider2) {
        return new DepartureModule_ProvidesCirculationMapperFactory(provider, provider2);
    }

    public static CercaniasCirculationMapper providesCirculationMapper(DateFormat dateFormat, LineColoursRepository lineColoursRepository) {
        return (CercaniasCirculationMapper) Preconditions.checkNotNullFromProvides(DepartureModule.INSTANCE.providesCirculationMapper(dateFormat, lineColoursRepository));
    }

    @Override // javax.inject.Provider
    public CercaniasCirculationMapper get() {
        return providesCirculationMapper(this.formatterProvider.get(), this.lineColoursRepositoryProvider.get());
    }
}
