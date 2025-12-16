package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.entities.circulation.mappers.AvldmdCirculationMapper;
import com.adif.elcanomovil.domain.entities.circulation.mappers.CercaniasCirculationMapper;
import com.adif.elcanomovil.domain.entities.circulation.mappers.OthersCirculationMapper;
import com.adif.elcanomovil.domain.usecases.circulation.GetBetweenStationsUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetStationArrivalsUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetStationDeparturesUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.text.DateFormat;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class UseCases_ProvideGetDepartureCirculationsUseCaseFactory implements Factory<GetDepartureCirculationsUseCase> {
    private final Provider<AvldmdCirculationMapper> avldmdCirculationMapperProvider;
    private final Provider<CercaniasCirculationMapper> cercaniasCirculationMapperProvider;
    private final Provider<DateFormat> formatterProvider;
    private final Provider<GetBetweenStationsUseCase> getBetweenStationsUseCaseProvider;
    private final Provider<GetStationArrivalsUseCase> getStationArrivalsUseCaseProvider;
    private final Provider<GetStationDeparturesUseCase> getStationDeparturesUseCaseProvider;
    private final Provider<OthersCirculationMapper> otherCirculationMapperProvider;

    public UseCases_ProvideGetDepartureCirculationsUseCaseFactory(Provider<GetStationArrivalsUseCase> provider, Provider<GetStationDeparturesUseCase> provider2, Provider<GetBetweenStationsUseCase> provider3, Provider<CercaniasCirculationMapper> provider4, Provider<AvldmdCirculationMapper> provider5, Provider<OthersCirculationMapper> provider6, Provider<DateFormat> provider7) {
        this.getStationArrivalsUseCaseProvider = provider;
        this.getStationDeparturesUseCaseProvider = provider2;
        this.getBetweenStationsUseCaseProvider = provider3;
        this.cercaniasCirculationMapperProvider = provider4;
        this.avldmdCirculationMapperProvider = provider5;
        this.otherCirculationMapperProvider = provider6;
        this.formatterProvider = provider7;
    }

    public static UseCases_ProvideGetDepartureCirculationsUseCaseFactory create(Provider<GetStationArrivalsUseCase> provider, Provider<GetStationDeparturesUseCase> provider2, Provider<GetBetweenStationsUseCase> provider3, Provider<CercaniasCirculationMapper> provider4, Provider<AvldmdCirculationMapper> provider5, Provider<OthersCirculationMapper> provider6, Provider<DateFormat> provider7) {
        return new UseCases_ProvideGetDepartureCirculationsUseCaseFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static GetDepartureCirculationsUseCase provideGetDepartureCirculationsUseCase(GetStationArrivalsUseCase getStationArrivalsUseCase, GetStationDeparturesUseCase getStationDeparturesUseCase, GetBetweenStationsUseCase getBetweenStationsUseCase, CercaniasCirculationMapper cercaniasCirculationMapper, AvldmdCirculationMapper avldmdCirculationMapper, OthersCirculationMapper othersCirculationMapper, DateFormat dateFormat) {
        return (GetDepartureCirculationsUseCase) Preconditions.checkNotNullFromProvides(UseCases.INSTANCE.provideGetDepartureCirculationsUseCase(getStationArrivalsUseCase, getStationDeparturesUseCase, getBetweenStationsUseCase, cercaniasCirculationMapper, avldmdCirculationMapper, othersCirculationMapper, dateFormat));
    }

    @Override // javax.inject.Provider
    public GetDepartureCirculationsUseCase get() {
        return provideGetDepartureCirculationsUseCase(this.getStationArrivalsUseCaseProvider.get(), this.getStationDeparturesUseCaseProvider.get(), this.getBetweenStationsUseCaseProvider.get(), this.cercaniasCirculationMapperProvider.get(), this.avldmdCirculationMapperProvider.get(), this.otherCirculationMapperProvider.get(), this.formatterProvider.get());
    }
}
