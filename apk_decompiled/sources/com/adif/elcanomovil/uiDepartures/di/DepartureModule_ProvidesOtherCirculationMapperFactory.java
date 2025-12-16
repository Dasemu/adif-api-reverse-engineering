package com.adif.elcanomovil.uiDepartures.di;

import com.adif.elcanomovil.domain.entities.circulation.mappers.OthersCirculationMapper;
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
public final class DepartureModule_ProvidesOtherCirculationMapperFactory implements Factory<OthersCirculationMapper> {
    private final Provider<DateFormat> formatterProvider;

    public DepartureModule_ProvidesOtherCirculationMapperFactory(Provider<DateFormat> provider) {
        this.formatterProvider = provider;
    }

    public static DepartureModule_ProvidesOtherCirculationMapperFactory create(Provider<DateFormat> provider) {
        return new DepartureModule_ProvidesOtherCirculationMapperFactory(provider);
    }

    public static OthersCirculationMapper providesOtherCirculationMapper(DateFormat dateFormat) {
        return (OthersCirculationMapper) Preconditions.checkNotNullFromProvides(DepartureModule.INSTANCE.providesOtherCirculationMapper(dateFormat));
    }

    @Override // javax.inject.Provider
    public OthersCirculationMapper get() {
        return providesOtherCirculationMapper(this.formatterProvider.get());
    }
}
