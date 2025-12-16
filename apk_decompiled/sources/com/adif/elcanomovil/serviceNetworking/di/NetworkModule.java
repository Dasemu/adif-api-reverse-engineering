package com.adif.elcanomovil.serviceNetworking.di;

import Z2.C0093a;
import Z2.D;
import Z2.G;
import Z2.InterfaceC0103k;
import com.adif.elcanomovil.domain.usecases.credentials.GeneratePersistentUserIdUseCase;
import com.adif.elcanomovil.serviceNetworking.BuildConfig;
import com.adif.elcanomovil.serviceNetworking.avisa.AvisaLoginService;
import com.adif.elcanomovil.serviceNetworking.avisa.AvisaStationsService;
import com.adif.elcanomovil.serviceNetworking.avisa.IncidenceService;
import com.adif.elcanomovil.serviceNetworking.circulations.CirculationService;
import com.adif.elcanomovil.serviceNetworking.compositions.CompositionsService;
import com.adif.elcanomovil.serviceNetworking.interceptors.AuthHeaderInterceptor;
import com.adif.elcanomovil.serviceNetworking.pinning.PinningRepository;
import com.adif.elcanomovil.serviceNetworking.stationObservations.StationObservationsService;
import com.adif.elcanomovil.serviceNetworking.stations.StationsService;
import com.adif.elcanomovil.serviceNetworking.subscriptions.SubscriptionsService;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import e3.C0322h;
import e3.E;
import e3.F;
import java.util.concurrent.TimeUnit;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import y1.c;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00192\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\n \u001a*\u0004\u0018\u00010\u001d0\u001d2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010!\u001a\n \u001a*\u0004\u0018\u00010 0 2\b\b\u0001\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0014H\u0007¢\u0006\u0004\b!\u0010\"J'\u0010$\u001a\n \u001a*\u0004\u0018\u00010#0#2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0014H\u0007¢\u0006\u0004\b$\u0010%J)\u0010'\u001a\n \u001a*\u0004\u0018\u00010&0&2\b\b\u0001\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0014H\u0007¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\n \u001a*\u0004\u0018\u00010)0)2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0014H\u0007¢\u0006\u0004\b*\u0010+J)\u0010-\u001a\n \u001a*\u0004\u0018\u00010,0,2\b\b\u0001\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0014H\u0007¢\u0006\u0004\b-\u0010.J)\u00100\u001a\n \u001a*\u0004\u0018\u00010/0/2\b\b\u0001\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0014H\u0007¢\u0006\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/di/NetworkModule;", "", "<init>", "()V", "Lcom/adif/elcanomovil/serviceNetworking/pinning/PinningRepository;", "pinningRepository", "Le3/h;", "provideCertificatePinner", "(Lcom/adif/elcanomovil/serviceNetworking/pinning/PinningRepository;)Le3/h;", "certificatePinner", "Le3/F;", "provideOkHttpClient", "(Le3/h;)Le3/F;", "Lcom/adif/elcanomovil/domain/usecases/credentials/GeneratePersistentUserIdUseCase;", "generatePersistentUserIdUseCase", "provideOkHttpClientSecurized", "(Lcom/adif/elcanomovil/domain/usecases/credentials/GeneratePersistentUserIdUseCase;Le3/h;)Le3/F;", "LZ2/k;", "polymorphicFactory", "polymorphicFactoryTrain", "LZ2/G;", "provideMoshi", "(LZ2/k;LZ2/k;)LZ2/G;", "client", "moshi", "Lcom/adif/elcanomovil/serviceNetworking/avisa/IncidenceService;", "kotlin.jvm.PlatformType", "provideIncidenceService", "(Le3/F;LZ2/G;)Lcom/adif/elcanomovil/serviceNetworking/avisa/IncidenceService;", "Lcom/adif/elcanomovil/serviceNetworking/avisa/AvisaStationsService;", "provideAvisaStationsService", "(Le3/F;LZ2/G;)Lcom/adif/elcanomovil/serviceNetworking/avisa/AvisaStationsService;", "Lcom/adif/elcanomovil/serviceNetworking/stations/StationsService;", "provideStationsService", "(Le3/F;LZ2/G;)Lcom/adif/elcanomovil/serviceNetworking/stations/StationsService;", "Lcom/adif/elcanomovil/serviceNetworking/avisa/AvisaLoginService;", "provideAvisaLoginService", "(Le3/F;LZ2/G;)Lcom/adif/elcanomovil/serviceNetworking/avisa/AvisaLoginService;", "Lcom/adif/elcanomovil/serviceNetworking/circulations/CirculationService;", "provideCirculationService", "(Le3/F;LZ2/G;)Lcom/adif/elcanomovil/serviceNetworking/circulations/CirculationService;", "Lcom/adif/elcanomovil/serviceNetworking/subscriptions/SubscriptionsService;", "provideSubscriptionService", "(Le3/F;LZ2/G;)Lcom/adif/elcanomovil/serviceNetworking/subscriptions/SubscriptionsService;", "Lcom/adif/elcanomovil/serviceNetworking/stationObservations/StationObservationsService;", "provideStationObservationsService", "(Le3/F;LZ2/G;)Lcom/adif/elcanomovil/serviceNetworking/stationObservations/StationObservationsService;", "Lcom/adif/elcanomovil/serviceNetworking/compositions/CompositionsService;", "provideTrainCompositionService", "(Le3/F;LZ2/G;)Lcom/adif/elcanomovil/serviceNetworking/compositions/CompositionsService;", "", "timeoutInSeconds", "J", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
@InstallIn({SingletonComponent.class})
@SourceDebugExtension({"SMAP\nNetworkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkModule.kt\ncom/adif/elcanomovil/serviceNetworking/di/NetworkModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
/* loaded from: classes.dex */
public final class NetworkModule {
    public static final NetworkModule INSTANCE = new NetworkModule();
    private static final long timeoutInSeconds = 60;

    private NetworkModule() {
    }

    @Provides
    public final AvisaLoginService provideAvisaLoginService(F client, G moshi) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return (AvisaLoginService) new Retrofit.Builder().baseUrl(BuildConfig.AVISA_SERVER_URL).client(client).addConverterFactory(MoshiConverterFactory.create(moshi)).build().create(AvisaLoginService.class);
    }

    @Provides
    public final AvisaStationsService provideAvisaStationsService(F client, G moshi) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return (AvisaStationsService) new Retrofit.Builder().baseUrl(BuildConfig.AVISA_SERVER_URL).client(client).addConverterFactory(MoshiConverterFactory.create(moshi)).build().create(AvisaStationsService.class);
    }

    @Provides
    @Singleton
    public final C0322h provideCertificatePinner(PinningRepository pinningRepository) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(pinningRepository, "pinningRepository");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new c(pinningRepository, null), 1, null);
        return (C0322h) runBlocking$default;
    }

    @Provides
    public final CirculationService provideCirculationService(@Named("Securized") F client, G moshi) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return (CirculationService) new Retrofit.Builder().baseUrl("https://circulacion.api.adif.es").client(client).addConverterFactory(MoshiConverterFactory.create(moshi)).build().create(CirculationService.class);
    }

    @Provides
    public final IncidenceService provideIncidenceService(F client, G moshi) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return (IncidenceService) new Retrofit.Builder().baseUrl(BuildConfig.AVISA_SERVER_URL).client(client).addConverterFactory(MoshiConverterFactory.create(moshi)).build().create(IncidenceService.class);
    }

    @Provides
    public final G provideMoshi(@Named("Station") InterfaceC0103k polymorphicFactory, @Named("Train") InterfaceC0103k polymorphicFactoryTrain) {
        Intrinsics.checkNotNullParameter(polymorphicFactory, "polymorphicFactory");
        Intrinsics.checkNotNullParameter(polymorphicFactoryTrain, "polymorphicFactoryTrain");
        D d4 = new D();
        d4.a(polymorphicFactory);
        d4.a(polymorphicFactoryTrain);
        d4.a(new C0093a(6));
        G g4 = new G(d4);
        Intrinsics.checkNotNullExpressionValue(g4, "build(...)");
        return g4;
    }

    @Provides
    public final F provideOkHttpClient(C0322h certificatePinner) {
        Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
        E e4 = new E();
        Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
        Intrinsics.areEqual(certificatePinner, e4.f6227q);
        e4.f6227q = certificatePinner;
        TimeUnit unit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        e4.f6229s = f3.c.b(60L);
        Intrinsics.checkNotNullParameter(unit, "unit");
        e4.f6230t = f3.c.b(60L);
        return new F(e4);
    }

    @Provides
    @Named("Securized")
    public final F provideOkHttpClientSecurized(GeneratePersistentUserIdUseCase generatePersistentUserIdUseCase, C0322h certificatePinner) {
        Intrinsics.checkNotNullParameter(generatePersistentUserIdUseCase, "generatePersistentUserIdUseCase");
        Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
        E e4 = new E();
        AuthHeaderInterceptor interceptor = new AuthHeaderInterceptor(generatePersistentUserIdUseCase.invoke());
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        e4.f6216c.add(interceptor);
        Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
        Intrinsics.areEqual(certificatePinner, e4.f6227q);
        e4.f6227q = certificatePinner;
        TimeUnit unit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        e4.f6229s = f3.c.b(60L);
        Intrinsics.checkNotNullParameter(unit, "unit");
        e4.f6230t = f3.c.b(60L);
        return new F(e4);
    }

    @Provides
    public final StationObservationsService provideStationObservationsService(@Named("Securized") F client, G moshi) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return (StationObservationsService) new Retrofit.Builder().baseUrl("https://estaciones.api.adif.es").client(client).addConverterFactory(MoshiConverterFactory.create(moshi)).build().create(StationObservationsService.class);
    }

    @Provides
    public final StationsService provideStationsService(@Named("Securized") F client, G moshi) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return (StationsService) new Retrofit.Builder().baseUrl("https://estaciones.api.adif.es").client(client).addConverterFactory(MoshiConverterFactory.create(moshi)).build().create(StationsService.class);
    }

    @Provides
    public final SubscriptionsService provideSubscriptionService(F client, G moshi) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return (SubscriptionsService) new Retrofit.Builder().baseUrl(BuildConfig.REAL_BASE_URL).client(client).addConverterFactory(MoshiConverterFactory.create(moshi)).build().create(SubscriptionsService.class);
    }

    @Provides
    public final CompositionsService provideTrainCompositionService(@Named("Securized") F client, G moshi) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return (CompositionsService) new Retrofit.Builder().baseUrl("https://circulacion.api.adif.es").client(client).addConverterFactory(MoshiConverterFactory.create(moshi)).build().create(CompositionsService.class);
    }
}
