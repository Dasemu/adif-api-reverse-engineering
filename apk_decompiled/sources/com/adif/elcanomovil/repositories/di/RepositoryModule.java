package com.adif.elcanomovil.repositories.di;

import android.content.Context;
import com.adif.elcanomovil.domain.providers.AppVersionProvider;
import com.adif.elcanomovil.domain.providers.Check24hProvider;
import com.adif.elcanomovil.domain.providers.CredentialsProvider;
import com.adif.elcanomovil.domain.providers.GooglePlayVersionProvider;
import com.adif.elcanomovil.domain.providers.LocationProvider;
import com.adif.elcanomovil.domain.providers.LocationStatusProvider;
import com.adif.elcanomovil.domain.providers.LogoProvider;
import com.adif.elcanomovil.domain.providers.PushIdTokenProvider;
import com.adif.elcanomovil.domain.providers.TokenJwtProvider;
import com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository;
import com.adif.elcanomovil.domain.repositories.avisa.AvisaLoginRepository;
import com.adif.elcanomovil.domain.repositories.avisa.AvisaStationsRepository;
import com.adif.elcanomovil.domain.repositories.avisa.IncidenceRepository;
import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.repositories.compositions.CompositionsRepository;
import com.adif.elcanomovil.domain.repositories.favourites.FavoritesRepository;
import com.adif.elcanomovil.domain.repositories.filters.FiltersRepository;
import com.adif.elcanomovil.domain.repositories.linecolours.LineColoursRepository;
import com.adif.elcanomovil.domain.repositories.logos.LogosInfoRepository;
import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import com.adif.elcanomovil.domain.repositories.stations.StationsObservationsRepository;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository;
import com.adif.elcanomovil.repositories.avisa.AvisaStationCategoryMapper;
import com.adif.elcanomovil.repositories.avisa.AvisaStationMapper;
import com.adif.elcanomovil.repositories.avisa.DefaultAvisaLoginRepository;
import com.adif.elcanomovil.repositories.avisa.DefaultAvisaStationsRepository;
import com.adif.elcanomovil.repositories.avisa.DefaultIncidenceRepository;
import com.adif.elcanomovil.repositories.avisa.IncidenceCommentMapper;
import com.adif.elcanomovil.repositories.avisa.IncidenceMapper;
import com.adif.elcanomovil.repositories.avisa.IncidencePictureMapper;
import com.adif.elcanomovil.repositories.avisa.TokenMapper;
import com.adif.elcanomovil.repositories.circulation.CirculationMapper;
import com.adif.elcanomovil.repositories.circulation.DefaultCirculationRepository;
import com.adif.elcanomovil.repositories.compositions.CompositionsMapper;
import com.adif.elcanomovil.repositories.compositions.DefaultCompositionsRepository;
import com.adif.elcanomovil.repositories.favourites.DefaultFavoritesRepository;
import com.adif.elcanomovil.repositories.favourites.FavouritesStationsMapper;
import com.adif.elcanomovil.repositories.favourites.FavouritesTrainsMapper;
import com.adif.elcanomovil.repositories.filters.DefaultFiltersRepository;
import com.adif.elcanomovil.repositories.linecolours.DefaultLineColoursRepository;
import com.adif.elcanomovil.repositories.logos.DefaultLogosInfoRepository;
import com.adif.elcanomovil.repositories.providers.DefaultAppVersionProvider;
import com.adif.elcanomovil.repositories.providers.DefaultCheck24hProvider;
import com.adif.elcanomovil.repositories.providers.DefaultCredentialsProvider;
import com.adif.elcanomovil.repositories.providers.DefaultGooglePlayStatusProvider;
import com.adif.elcanomovil.repositories.providers.DefaultLocationProvider;
import com.adif.elcanomovil.repositories.providers.DefaultLocationStatusProvider;
import com.adif.elcanomovil.repositories.providers.DefaultLogoProvider;
import com.adif.elcanomovil.repositories.providers.DefaultPushIdTokenProvider;
import com.adif.elcanomovil.repositories.providers.DefaultRemoteConfigVersionRepository;
import com.adif.elcanomovil.repositories.providers.DefaultTokenJwtProvider;
import com.adif.elcanomovil.repositories.searches.DefaultSearchesRepository;
import com.adif.elcanomovil.repositories.searches.SearchesMapper;
import com.adif.elcanomovil.repositories.searches.TrainSearchesMapper;
import com.adif.elcanomovil.repositories.stationObservations.DefaultStationsObservationsRepository;
import com.adif.elcanomovil.repositories.stationObservations.StationObservationsMapper;
import com.adif.elcanomovil.repositories.stations.DefaultStationsRepository;
import com.adif.elcanomovil.repositories.stations.StationMapper;
import com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository;
import com.adif.elcanomovil.repositories.subscriptions.DestinationMapper;
import com.adif.elcanomovil.repositories.subscriptions.OriginMapper;
import com.adif.elcanomovil.repositories.subscriptions.SubscriptionMapper;
import com.adif.elcanomovil.serviceNetworking.avisa.AvisaLoginService;
import com.adif.elcanomovil.serviceNetworking.circulations.CirculationService;
import com.adif.elcanomovil.serviceNetworking.compositions.CompositionsService;
import com.adif.elcanomovil.serviceNetworking.stationObservations.StationObservationsService;
import com.adif.elcanomovil.serviceNetworking.subscriptions.SubscriptionsService;
import com.adif.elcanomovil.serviceStorage.database.FavouritesDao;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.ktx.FirebaseDynamicLinksKt;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt;
import d1.g;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0016H'¨\u0006\u0018"}, d2 = {"Lcom/adif/elcanomovil/repositories/di/RepositoryModule;", "", "()V", "bindAvisaStationsRepository", "Lcom/adif/elcanomovil/domain/repositories/avisa/AvisaStationsRepository;", "impl", "Lcom/adif/elcanomovil/repositories/avisa/DefaultAvisaStationsRepository;", "bindIncidenceRepository", "Lcom/adif/elcanomovil/domain/repositories/avisa/IncidenceRepository;", "Lcom/adif/elcanomovil/repositories/avisa/DefaultIncidenceRepository;", "bindLocationProvider", "Lcom/adif/elcanomovil/domain/providers/LocationProvider;", "fusedLocationProviderClient", "Lcom/adif/elcanomovil/repositories/providers/DefaultLocationProvider;", "bindLocationStatusProvider", "Lcom/adif/elcanomovil/domain/providers/LocationStatusProvider;", "Lcom/adif/elcanomovil/repositories/providers/DefaultLocationStatusProvider;", "bindStationsRepository", "Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;", "Lcom/adif/elcanomovil/repositories/stations/DefaultStationsRepository;", "bindSubscriptionRepository", "Lcom/adif/elcanomovil/domain/repositories/subscriptions/SubscriptionRepository;", "Lcom/adif/elcanomovil/repositories/subscriptions/DefaultSubscriptionsRepository;", "Companion", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes.dex */
public abstract class RepositoryModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000ú\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0007¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0007¢\u0006\u0004\b7\u00108J\u0019\u0010<\u001a\u00020;2\b\b\u0001\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b<\u0010=J\u0017\u0010A\u001a\u00020@2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\bA\u0010BJ\u0019\u0010D\u001a\u00020C2\b\b\u0001\u0010:\u001a\u000209H\u0007¢\u0006\u0004\bD\u0010EJ\u0019\u0010G\u001a\u00020F2\b\b\u0001\u0010:\u001a\u000209H\u0007¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020I2\b\b\u0001\u0010:\u001a\u000209H\u0007¢\u0006\u0004\bJ\u0010KJ\u000f\u0010M\u001a\u00020LH\u0007¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020O2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\bP\u0010QJ\u001f\u0010U\u001a\u00020T2\u0006\u0010S\u001a\u00020R2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\bU\u0010VJ'\u0010\\\u001a\u00020[2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020>2\u0006\u0010Z\u001a\u00020\nH\u0007¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020^2\u0006\u0010Y\u001a\u00020>H\u0007¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020a2\u0006\u0010Y\u001a\u00020>H\u0007¢\u0006\u0004\bb\u0010cJ7\u0010k\u001a\u00020j2\u0006\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020\u00102\u0006\u0010h\u001a\u00020g2\u0006\u0010Y\u001a\u00020>2\u0006\u0010i\u001a\u00020\u0013H\u0007¢\u0006\u0004\bk\u0010lJ'\u0010p\u001a\u00020o2\u0006\u0010Y\u001a\u00020>2\u0006\u0010m\u001a\u00020\u00162\u0006\u0010n\u001a\u00020\u0019H\u0007¢\u0006\u0004\bp\u0010qJ'\u0010w\u001a\u00020v2\u0006\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020>2\u0006\u0010u\u001a\u00020\u0004H\u0007¢\u0006\u0004\bw\u0010xJ\u001f\u0010}\u001a\u00020|2\u0006\u0010z\u001a\u00020y2\u0006\u0010{\u001a\u00020\"H\u0007¢\u0006\u0004\b}\u0010~J-\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0080\u0001\u001a\u00020\u007f2\u0007\u0010\u0081\u0001\u001a\u00020\r2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J'\u0010\u0088\u0001\u001a\u00030\u0087\u00012\b\b\u0001\u0010:\u001a\u0002092\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0007¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0012\u0010\u008a\u0001\u001a\u00020RH\u0007¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0013\u0010\u008d\u0001\u001a\u00030\u008c\u0001H\u0007¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001d\u0010\u0090\u0001\u001a\u00030\u008f\u00012\b\b\u0001\u0010:\u001a\u000209H\u0007¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0092\u0001"}, d2 = {"Lcom/adif/elcanomovil/repositories/di/RepositoryModule$Companion;", "", "<init>", "()V", "Lcom/adif/elcanomovil/repositories/avisa/TokenMapper;", "provideTokenMapper", "()Lcom/adif/elcanomovil/repositories/avisa/TokenMapper;", "Lcom/adif/elcanomovil/repositories/stations/StationMapper;", "provideStationMapper", "()Lcom/adif/elcanomovil/repositories/stations/StationMapper;", "Lcom/adif/elcanomovil/repositories/circulation/CirculationMapper;", "provideCirculationMapper", "()Lcom/adif/elcanomovil/repositories/circulation/CirculationMapper;", "Lcom/adif/elcanomovil/repositories/compositions/CompositionsMapper;", "provideCompositionsMapper", "()Lcom/adif/elcanomovil/repositories/compositions/CompositionsMapper;", "Lcom/adif/elcanomovil/repositories/favourites/FavouritesStationsMapper;", "providesFavoritableMapper", "()Lcom/adif/elcanomovil/repositories/favourites/FavouritesStationsMapper;", "Lcom/adif/elcanomovil/repositories/favourites/FavouritesTrainsMapper;", "providesFavoritableTrainMapper", "()Lcom/adif/elcanomovil/repositories/favourites/FavouritesTrainsMapper;", "Lcom/adif/elcanomovil/repositories/searches/SearchesMapper;", "providesSearchesMapper", "()Lcom/adif/elcanomovil/repositories/searches/SearchesMapper;", "Lcom/adif/elcanomovil/repositories/searches/TrainSearchesMapper;", "providesTrainSearchesMapper", "()Lcom/adif/elcanomovil/repositories/searches/TrainSearchesMapper;", "Lcom/adif/elcanomovil/repositories/avisa/AvisaStationMapper;", "provideAvisaStationMapper", "()Lcom/adif/elcanomovil/repositories/avisa/AvisaStationMapper;", "Lcom/adif/elcanomovil/repositories/avisa/AvisaStationCategoryMapper;", "provideAvisaStationCategoryMapper", "()Lcom/adif/elcanomovil/repositories/avisa/AvisaStationCategoryMapper;", "Lcom/adif/elcanomovil/repositories/stationObservations/StationObservationsMapper;", "provideStationObservationsMapper", "()Lcom/adif/elcanomovil/repositories/stationObservations/StationObservationsMapper;", "Lcom/adif/elcanomovil/repositories/avisa/IncidenceMapper;", "provideIncidenceMapper", "()Lcom/adif/elcanomovil/repositories/avisa/IncidenceMapper;", "Lcom/adif/elcanomovil/repositories/avisa/IncidenceCommentMapper;", "provideIncidenceCommentMapper", "()Lcom/adif/elcanomovil/repositories/avisa/IncidenceCommentMapper;", "Lcom/adif/elcanomovil/repositories/avisa/IncidencePictureMapper;", "provideIncidencePictureMapper", "()Lcom/adif/elcanomovil/repositories/avisa/IncidencePictureMapper;", "Ld1/g;", "stringProvider", "Lcom/adif/elcanomovil/repositories/subscriptions/SubscriptionMapper;", "provideSubscriptionMapper", "(Ld1/g;)Lcom/adif/elcanomovil/repositories/subscriptions/SubscriptionMapper;", "Lcom/adif/elcanomovil/repositories/subscriptions/OriginMapper;", "provideOriginMapper", "()Lcom/adif/elcanomovil/repositories/subscriptions/OriginMapper;", "Lcom/adif/elcanomovil/repositories/subscriptions/DestinationMapper;", "provideDestinationMapper", "()Lcom/adif/elcanomovil/repositories/subscriptions/DestinationMapper;", "Landroid/content/Context;", "context", "Lcom/adif/elcanomovil/domain/providers/AppVersionProvider;", "provideAppVersionProvider", "(Landroid/content/Context;)Lcom/adif/elcanomovil/domain/providers/AppVersionProvider;", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "preferenceStorage", "Lcom/adif/elcanomovil/domain/providers/Check24hProvider;", "provideCheck24hProvider", "(Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;)Lcom/adif/elcanomovil/domain/providers/Check24hProvider;", "Lcom/adif/elcanomovil/domain/providers/LogoProvider;", "provideLogoProvider", "(Landroid/content/Context;)Lcom/adif/elcanomovil/domain/providers/LogoProvider;", "Lcom/adif/elcanomovil/domain/providers/CredentialsProvider;", "provideCredentialsProvider", "(Landroid/content/Context;)Lcom/adif/elcanomovil/domain/providers/CredentialsProvider;", "Lcom/adif/elcanomovil/domain/providers/GooglePlayVersionProvider;", "provideGooglePlayStatusProvider", "(Landroid/content/Context;)Lcom/adif/elcanomovil/domain/providers/GooglePlayVersionProvider;", "Lcom/adif/elcanomovil/domain/providers/TokenJwtProvider;", "provideTokenJwtProvider", "()Lcom/adif/elcanomovil/domain/providers/TokenJwtProvider;", "Lcom/adif/elcanomovil/domain/providers/PushIdTokenProvider;", "providePushIdTokenProvider", "(Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;)Lcom/adif/elcanomovil/domain/providers/PushIdTokenProvider;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "remoteConfig", "Lcom/adif/elcanomovil/domain/repositories/RemoteConfigVersionRepository;", "provideRemoteConfigVersionRepository", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;)Lcom/adif/elcanomovil/domain/repositories/RemoteConfigVersionRepository;", "Lcom/adif/elcanomovil/serviceNetworking/circulations/CirculationService;", "circulationService", "storage", "circulationMapper", "Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;", "provideCirculationRepository", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/CirculationService;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Lcom/adif/elcanomovil/repositories/circulation/CirculationMapper;)Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;", "Lcom/adif/elcanomovil/domain/repositories/logos/LogosInfoRepository;", "provideLogosInfoRepository", "(Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;)Lcom/adif/elcanomovil/domain/repositories/logos/LogosInfoRepository;", "Lcom/adif/elcanomovil/domain/repositories/filters/FiltersRepository;", "provideFiltersRepository", "(Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;)Lcom/adif/elcanomovil/domain/repositories/filters/FiltersRepository;", "Lcom/adif/elcanomovil/serviceStorage/database/FavouritesDao;", "favouritesDao", "favouritesMapper", "Lcom/adif/elcanomovil/serviceNetworking/subscriptions/SubscriptionsService;", "subscriptionsService", "favouritesTrainMapper", "Lcom/adif/elcanomovil/domain/repositories/favourites/FavoritesRepository;", "provideFavouritesRepository", "(Lcom/adif/elcanomovil/serviceStorage/database/FavouritesDao;Lcom/adif/elcanomovil/repositories/favourites/FavouritesStationsMapper;Lcom/adif/elcanomovil/serviceNetworking/subscriptions/SubscriptionsService;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Lcom/adif/elcanomovil/repositories/favourites/FavouritesTrainsMapper;)Lcom/adif/elcanomovil/domain/repositories/favourites/FavoritesRepository;", "searchesMapper", "trainSearchesMapper", "Lcom/adif/elcanomovil/domain/repositories/searches/SearchesRepository;", "provideSearchesRepository", "(Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Lcom/adif/elcanomovil/repositories/searches/SearchesMapper;Lcom/adif/elcanomovil/repositories/searches/TrainSearchesMapper;)Lcom/adif/elcanomovil/domain/repositories/searches/SearchesRepository;", "Lcom/adif/elcanomovil/serviceNetworking/avisa/AvisaLoginService;", "avisaLoginService", "preferences", "tokenMapper", "Lcom/adif/elcanomovil/domain/repositories/avisa/AvisaLoginRepository;", "provideAvisaLoginRepository", "(Lcom/adif/elcanomovil/serviceNetworking/avisa/AvisaLoginService;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Lcom/adif/elcanomovil/repositories/avisa/TokenMapper;)Lcom/adif/elcanomovil/domain/repositories/avisa/AvisaLoginRepository;", "Lcom/adif/elcanomovil/serviceNetworking/stationObservations/StationObservationsService;", "stationsObservationsService", "stationObservationMapper", "Lcom/adif/elcanomovil/domain/repositories/stations/StationsObservationsRepository;", "provideStationsObservationsRepository", "(Lcom/adif/elcanomovil/serviceNetworking/stationObservations/StationObservationsService;Lcom/adif/elcanomovil/repositories/stationObservations/StationObservationsMapper;)Lcom/adif/elcanomovil/domain/repositories/stations/StationsObservationsRepository;", "Lcom/adif/elcanomovil/serviceNetworking/compositions/CompositionsService;", "compositionsService", "compositionsMapper", "Lcom/adif/elcanomovil/domain/repositories/compositions/CompositionsRepository;", "provideCompositionsRepository", "(Lcom/adif/elcanomovil/serviceNetworking/compositions/CompositionsService;Lcom/adif/elcanomovil/repositories/compositions/CompositionsMapper;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;)Lcom/adif/elcanomovil/domain/repositories/compositions/CompositionsRepository;", "Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;", "stationsRepository", "Lcom/adif/elcanomovil/domain/repositories/linecolours/LineColoursRepository;", "provideLineColoursRepository", "(Landroid/content/Context;Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;)Lcom/adif/elcanomovil/domain/repositories/linecolours/LineColoursRepository;", "provideFirebaseRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "Lcom/google/firebase/dynamiclinks/FirebaseDynamicLinks;", "provideFirebaseDynamicLink", "()Lcom/google/firebase/dynamiclinks/FirebaseDynamicLinks;", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "provideFusedLocationProviderClient", "(Landroid/content/Context;)Lcom/google/android/gms/location/FusedLocationProviderClient;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Provides
        @Singleton
        public final AppVersionProvider provideAppVersionProvider(@ApplicationContext Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new DefaultAppVersionProvider(context);
        }

        @Provides
        @Singleton
        public final AvisaLoginRepository provideAvisaLoginRepository(AvisaLoginService avisaLoginService, PreferenceStorage preferences, TokenMapper tokenMapper) {
            Intrinsics.checkNotNullParameter(avisaLoginService, "avisaLoginService");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Intrinsics.checkNotNullParameter(tokenMapper, "tokenMapper");
            return new DefaultAvisaLoginRepository(avisaLoginService, preferences, tokenMapper);
        }

        @Provides
        public final AvisaStationCategoryMapper provideAvisaStationCategoryMapper() {
            return new AvisaStationCategoryMapper();
        }

        @Provides
        public final AvisaStationMapper provideAvisaStationMapper() {
            return new AvisaStationMapper();
        }

        @Provides
        @Singleton
        public final Check24hProvider provideCheck24hProvider(PreferenceStorage preferenceStorage) {
            Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
            return new DefaultCheck24hProvider(preferenceStorage);
        }

        @Provides
        public final CirculationMapper provideCirculationMapper() {
            return new CirculationMapper();
        }

        @Provides
        @Singleton
        public final CirculationRepository provideCirculationRepository(CirculationService circulationService, PreferenceStorage storage, CirculationMapper circulationMapper) {
            Intrinsics.checkNotNullParameter(circulationService, "circulationService");
            Intrinsics.checkNotNullParameter(storage, "storage");
            Intrinsics.checkNotNullParameter(circulationMapper, "circulationMapper");
            return new DefaultCirculationRepository(circulationService, circulationMapper, storage);
        }

        @Provides
        public final CompositionsMapper provideCompositionsMapper() {
            return new CompositionsMapper();
        }

        @Provides
        @Singleton
        public final CompositionsRepository provideCompositionsRepository(CompositionsService compositionsService, CompositionsMapper compositionsMapper, PreferenceStorage preferenceStorage) {
            Intrinsics.checkNotNullParameter(compositionsService, "compositionsService");
            Intrinsics.checkNotNullParameter(compositionsMapper, "compositionsMapper");
            Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
            return new DefaultCompositionsRepository(compositionsService, compositionsMapper, preferenceStorage);
        }

        @Provides
        @Singleton
        public final CredentialsProvider provideCredentialsProvider(@ApplicationContext Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new DefaultCredentialsProvider(context);
        }

        @Provides
        public final DestinationMapper provideDestinationMapper() {
            return new DestinationMapper();
        }

        @Provides
        @Singleton
        public final FavoritesRepository provideFavouritesRepository(FavouritesDao favouritesDao, FavouritesStationsMapper favouritesMapper, SubscriptionsService subscriptionsService, PreferenceStorage storage, FavouritesTrainsMapper favouritesTrainMapper) {
            Intrinsics.checkNotNullParameter(favouritesDao, "favouritesDao");
            Intrinsics.checkNotNullParameter(favouritesMapper, "favouritesMapper");
            Intrinsics.checkNotNullParameter(subscriptionsService, "subscriptionsService");
            Intrinsics.checkNotNullParameter(storage, "storage");
            Intrinsics.checkNotNullParameter(favouritesTrainMapper, "favouritesTrainMapper");
            return new DefaultFavoritesRepository(favouritesDao, favouritesMapper, subscriptionsService, storage, favouritesTrainMapper);
        }

        @Provides
        @Singleton
        public final FiltersRepository provideFiltersRepository(PreferenceStorage storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new DefaultFiltersRepository(storage);
        }

        @Provides
        public final FirebaseDynamicLinks provideFirebaseDynamicLink() {
            return FirebaseDynamicLinksKt.getDynamicLinks(Firebase.INSTANCE);
        }

        @Provides
        public final FirebaseRemoteConfig provideFirebaseRemoteConfig() {
            return RemoteConfigKt.getRemoteConfig(Firebase.INSTANCE);
        }

        @Provides
        public final FusedLocationProviderClient provideFusedLocationProviderClient(@ApplicationContext Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
            Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
            return fusedLocationProviderClient;
        }

        @Provides
        @Singleton
        public final GooglePlayVersionProvider provideGooglePlayStatusProvider(@ApplicationContext Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new DefaultGooglePlayStatusProvider(context);
        }

        @Provides
        public final IncidenceCommentMapper provideIncidenceCommentMapper() {
            return new IncidenceCommentMapper();
        }

        @Provides
        public final IncidenceMapper provideIncidenceMapper() {
            return new IncidenceMapper(provideIncidencePictureMapper(), provideIncidenceCommentMapper(), provideAvisaStationMapper(), provideAvisaStationCategoryMapper());
        }

        @Provides
        public final IncidencePictureMapper provideIncidencePictureMapper() {
            return new IncidencePictureMapper();
        }

        @Provides
        @Singleton
        public final LineColoursRepository provideLineColoursRepository(@ApplicationContext Context context, StationsRepository stationsRepository) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
            return new DefaultLineColoursRepository(context, stationsRepository);
        }

        @Provides
        @Singleton
        public final LogoProvider provideLogoProvider(@ApplicationContext Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new DefaultLogoProvider(context);
        }

        @Provides
        @Singleton
        public final LogosInfoRepository provideLogosInfoRepository(PreferenceStorage storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new DefaultLogosInfoRepository(storage);
        }

        @Provides
        public final OriginMapper provideOriginMapper() {
            return new OriginMapper();
        }

        @Provides
        @Singleton
        public final PushIdTokenProvider providePushIdTokenProvider(PreferenceStorage preferenceStorage) {
            Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
            return new DefaultPushIdTokenProvider(preferenceStorage);
        }

        @Provides
        @Singleton
        public final RemoteConfigVersionRepository provideRemoteConfigVersionRepository(FirebaseRemoteConfig remoteConfig, PreferenceStorage preferenceStorage) {
            Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
            Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
            return new DefaultRemoteConfigVersionRepository(remoteConfig, preferenceStorage);
        }

        @Provides
        @Singleton
        public final SearchesRepository provideSearchesRepository(PreferenceStorage storage, SearchesMapper searchesMapper, TrainSearchesMapper trainSearchesMapper) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            Intrinsics.checkNotNullParameter(searchesMapper, "searchesMapper");
            Intrinsics.checkNotNullParameter(trainSearchesMapper, "trainSearchesMapper");
            return new DefaultSearchesRepository(storage, searchesMapper, trainSearchesMapper);
        }

        @Provides
        public final StationMapper provideStationMapper() {
            return new StationMapper();
        }

        @Provides
        public final StationObservationsMapper provideStationObservationsMapper() {
            return new StationObservationsMapper();
        }

        @Provides
        @Singleton
        public final StationsObservationsRepository provideStationsObservationsRepository(StationObservationsService stationsObservationsService, StationObservationsMapper stationObservationMapper) {
            Intrinsics.checkNotNullParameter(stationsObservationsService, "stationsObservationsService");
            Intrinsics.checkNotNullParameter(stationObservationMapper, "stationObservationMapper");
            return new DefaultStationsObservationsRepository(stationsObservationsService, stationObservationMapper);
        }

        @Provides
        public final SubscriptionMapper provideSubscriptionMapper(g stringProvider) {
            Intrinsics.checkNotNullParameter(stringProvider, "stringProvider");
            return new SubscriptionMapper(stringProvider);
        }

        @Provides
        @Singleton
        public final TokenJwtProvider provideTokenJwtProvider() {
            return new DefaultTokenJwtProvider();
        }

        @Provides
        public final TokenMapper provideTokenMapper() {
            return new TokenMapper();
        }

        @Provides
        public final FavouritesStationsMapper providesFavoritableMapper() {
            return new FavouritesStationsMapper();
        }

        @Provides
        public final FavouritesTrainsMapper providesFavoritableTrainMapper() {
            return new FavouritesTrainsMapper();
        }

        @Provides
        public final SearchesMapper providesSearchesMapper() {
            return new SearchesMapper();
        }

        @Provides
        public final TrainSearchesMapper providesTrainSearchesMapper() {
            return new TrainSearchesMapper();
        }

        private Companion() {
        }
    }

    @Singleton
    @Binds
    public abstract AvisaStationsRepository bindAvisaStationsRepository(DefaultAvisaStationsRepository impl);

    @Singleton
    @Binds
    public abstract IncidenceRepository bindIncidenceRepository(DefaultIncidenceRepository impl);

    @Singleton
    @Binds
    public abstract LocationProvider bindLocationProvider(DefaultLocationProvider fusedLocationProviderClient);

    @Singleton
    @Binds
    public abstract LocationStatusProvider bindLocationStatusProvider(DefaultLocationStatusProvider impl);

    @Singleton
    @Binds
    public abstract StationsRepository bindStationsRepository(DefaultStationsRepository impl);

    @Singleton
    @Binds
    public abstract SubscriptionRepository bindSubscriptionRepository(DefaultSubscriptionsRepository impl);
}
