package com.adif.elcanomovil.uiDepartures.di;

import com.adif.elcanomovil.domain.entities.circulation.mappers.AvldmdCirculationMapper;
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
public final class DepartureModule_ProvidesAvldmdCirculationMapperFactory implements Factory<AvldmdCirculationMapper> {
    private final Provider<DateFormat> formatterProvider;

    public DepartureModule_ProvidesAvldmdCirculationMapperFactory(Provider<DateFormat> provider) {
        this.formatterProvider = provider;
    }

    public static DepartureModule_ProvidesAvldmdCirculationMapperFactory create(Provider<DateFormat> provider) {
        return new DepartureModule_ProvidesAvldmdCirculationMapperFactory(provider);
    }

    public static AvldmdCirculationMapper providesAvldmdCirculationMapper(DateFormat dateFormat) {
        return (AvldmdCirculationMapper) Preconditions.checkNotNullFromProvides(DepartureModule.INSTANCE.providesAvldmdCirculationMapper(dateFormat));
    }

    @Override // javax.inject.Provider
    public AvldmdCirculationMapper get() {
        return providesAvldmdCirculationMapper(this.formatterProvider.get());
    }
}
