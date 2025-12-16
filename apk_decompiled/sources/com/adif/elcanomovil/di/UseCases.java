package com.adif.elcanomovil.di;

import com.adif.elcanomovil.domain.entities.circulation.mappers.AvldmdCirculationMapper;
import com.adif.elcanomovil.domain.entities.circulation.mappers.CercaniasCirculationMapper;
import com.adif.elcanomovil.domain.entities.circulation.mappers.OthersCirculationMapper;
import com.adif.elcanomovil.domain.providers.AppVersionProvider;
import com.adif.elcanomovil.domain.providers.Check24hProvider;
import com.adif.elcanomovil.domain.providers.CredentialsProvider;
import com.adif.elcanomovil.domain.providers.DynamicLinkFacade;
import com.adif.elcanomovil.domain.providers.LocationProvider;
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
import com.adif.elcanomovil.domain.repositories.logos.LogosInfoRepository;
import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import com.adif.elcanomovil.domain.repositories.stations.StationsObservationsRepository;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository;
import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
import com.adif.elcanomovil.domain.usecases.FetchVersionUpdateUseCase;
import com.adif.elcanomovil.domain.usecases.GetAppVersionUseCase;
import com.adif.elcanomovil.domain.usecases.GetCirculationUpdateTimeUseCase;
import com.adif.elcanomovil.domain.usecases.GetVersionUpdateStatusUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.incidence.CreateIncidenceUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.incidence.GetIncidenceDetailsUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.incidence.GetIncidencesUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.station.GetAvisaStationCategoriesUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.station.GetAvisaStationsUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.user.LoginAvisaUserUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.user.RefreshAvisaUserUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.user.RegisterAvisaUserUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetBetweenStationsUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetCompositionsUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDepartureTypeTrainIsCercaniasUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationToUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetOnePathsUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetSeveralPathsUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetStationArrivalsUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetStationDeparturesUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDepartureTypeTrainIsCercaniasUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationToUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationUseCase;
import com.adif.elcanomovil.domain.usecases.credentials.GeneratePasswordUseCase;
import com.adif.elcanomovil.domain.usecases.credentials.GeneratePersistentUserIdUseCase;
import com.adif.elcanomovil.domain.usecases.credentials.GenerateUserIdUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.GetRelationStationsFavoritesUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.GetStationIsFavoriteUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.GetStationsFavoritesUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.GetTrainIsFavoriteUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.GetTrainsFavoritesUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteStationUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteTrainUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteStationUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteTrainUseCase;
import com.adif.elcanomovil.domain.usecases.filters.GetFiltersUseCase;
import com.adif.elcanomovil.domain.usecases.filters.SaveFilterUseCase;
import com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCase;
import com.adif.elcanomovil.domain.usecases.recentSearch.GetRecentSearchesUseCase;
import com.adif.elcanomovil.domain.usecases.recentSearch.GetRecentTrainSearchesUseCase;
import com.adif.elcanomovil.domain.usecases.recentSearch.SaveRecentSearchUseCase;
import com.adif.elcanomovil.domain.usecases.recentSearch.SaveRecentTrainSearchUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetClosestStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetCurrentOneStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetLastVisitedStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetOneStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByNameUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationsForRegionUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationsObservationsUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationsUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetWorkStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.ObserveRecentlySearchedStationsWithDistanceUseCase;
import com.adif.elcanomovil.domain.usecases.stations.SetHomeStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.SetLastVisitedStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.SetWorkStationUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.ActiveSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.CreateSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.DeleteSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.GetSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.ModifySubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.MuteSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.tabs.TabDataHolder;
import com.adif.elcanomovil.domain.usecases.user.GetUserLastLocationUseCase;
import com.adif.elcanomovil.repositories.providers.DefaultDynamicLinkFacade;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.text.DateFormat;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Î\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0007J\u0010\u0010*\u001a\u00020+2\u0006\u0010(\u001a\u00020)H\u0007J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0007J\u0010\u00100\u001a\u0002012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J \u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0007J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0007J\u0010\u0010>\u001a\u00020?2\u0006\u00106\u001a\u000207H\u0007J@\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020-2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NH\u0007J\u0018\u0010O\u001a\u00020P2\u0006\u00104\u001a\u0002052\u0006\u0010Q\u001a\u00020RH\u0007J\u0010\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0007J\u0010\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020ZH\u0007J\u0010\u0010[\u001a\u00020\\2\u0006\u00106\u001a\u000207H\u0007J\u0010\u0010]\u001a\u00020^2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010_\u001a\u00020`2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010a\u001a\u00020b2\u0006\u0010.\u001a\u00020/H\u0007J\u0010\u0010c\u001a\u00020d2\u0006\u0010.\u001a\u00020/H\u0007J\u0010\u0010e\u001a\u00020f2\u0006\u0010.\u001a\u00020/H\u0007J\u0010\u0010g\u001a\u00020h2\u0006\u00106\u001a\u000207H\u0007J\u0018\u0010i\u001a\u00020j2\u0006\u0010.\u001a\u00020/2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010k\u001a\u00020l2\u0006\u00106\u001a\u000207H\u0007J\u0018\u0010m\u001a\u00020R2\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020qH\u0007J\u0010\u0010r\u001a\u00020s2\u0006\u0010n\u001a\u00020oH\u0007J\u0010\u0010t\u001a\u00020u2\u0006\u00106\u001a\u00020VH\u0007J\u0010\u0010v\u001a\u00020w2\u0006\u0010.\u001a\u00020/H\u0007J\u0010\u0010x\u001a\u00020C2\u0006\u0010.\u001a\u00020/H\u0007J\u0010\u0010y\u001a\u00020q2\u0006\u00106\u001a\u000207H\u0007J\u0010\u0010z\u001a\u00020{2\u0006\u00106\u001a\u000207H\u0007J\u0010\u0010|\u001a\u00020E2\u0006\u0010.\u001a\u00020/H\u0007J\u0010\u0010}\u001a\u00020~2\u0006\u0010U\u001a\u00020VH\u0007J!\u0010\u007f\u001a\u00030\u0080\u00012\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0007J\u0014\u0010\u0081\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0007J\u001a\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0007J\u0012\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0089\u0001\u001a\u00030\u008a\u00012\u0006\u0010U\u001a\u00020VH\u0007J\u0012\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0006\u00106\u001a\u00020VH\u0007J\u0012\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0006\u00104\u001a\u000205H\u0007J\u001a\u0010\u008f\u0001\u001a\u00030\u0090\u00012\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0012\u0010\u0091\u0001\u001a\u00030\u0092\u00012\u0006\u00106\u001a\u000207H\u0007J&\u0010\u0093\u0001\u001a\u00030\u0094\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u0097\u0001\u001a\u00020\u001b2\u0007\u0010\u0098\u0001\u001a\u00020!H\u0007J\u001e\u0010\u0099\u0001\u001a\u00030\u009a\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0007J\u0012\u0010\u009f\u0001\u001a\u00030 \u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010¡\u0001\u001a\u00030¢\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0014\u0010£\u0001\u001a\u00030¤\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001H\u0007JC\u0010¥\u0001\u001a\u00030¦\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u0097\u0001\u001a\u00020\u001b2\u0007\u0010\u0098\u0001\u001a\u00020!2\u0007\u0010§\u0001\u001a\u00020\u001f2\b\u0010¨\u0001\u001a\u00030©\u00012\b\u0010ª\u0001\u001a\u00030«\u0001H\u0007J\u0012\u0010¬\u0001\u001a\u00030\u00ad\u00012\u0006\u0010U\u001a\u00020VH\u0007J\u0012\u0010®\u0001\u001a\u00030¯\u00012\u0006\u0010U\u001a\u00020VH\u0007J\u0012\u0010°\u0001\u001a\u00030±\u00012\u0006\u0010U\u001a\u00020VH\u0007J\u0012\u0010²\u0001\u001a\u00030³\u00012\u0006\u0010U\u001a\u00020VH\u0007J\u0012\u0010´\u0001\u001a\u00030µ\u00012\u0006\u0010Y\u001a\u00020ZH\u0007J\u0012\u0010¶\u0001\u001a\u00030·\u00012\u0006\u0010n\u001a\u00020oH\u0007J\u0012\u0010¸\u0001\u001a\u00030¹\u00012\u0006\u0010n\u001a\u00020oH\u0007J\u0012\u0010º\u0001\u001a\u00030»\u00012\u0006\u00106\u001a\u000207H\u0007J\u0012\u0010¼\u0001\u001a\u00030½\u00012\u0006\u0010.\u001a\u00020/H\u0007J\u0012\u0010¾\u0001\u001a\u00030¿\u00012\u0006\u0010.\u001a\u00020/H\u0007J\u0012\u0010À\u0001\u001a\u00030Á\u00012\u0006\u0010.\u001a\u00020/H\u0007J\u0012\u0010Â\u0001\u001a\u00030Ã\u00012\u0006\u00106\u001a\u000207H\u0007J\u0012\u0010Ä\u0001\u001a\u00030Å\u00012\u0006\u00106\u001a\u000207H\u0007J\n\u0010Æ\u0001\u001a\u00030Ç\u0001H\u0007¨\u0006È\u0001"}, d2 = {"Lcom/adif/elcanomovil/di/UseCases;", "", "()V", "provideActiveSubscriptionsUseCase", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/ActiveSubscriptionsUseCase;", "subscriptionRepository", "Lcom/adif/elcanomovil/domain/repositories/subscriptions/SubscriptionRepository;", "provideCreateIncidenceUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/incidence/CreateIncidenceUseCase;", "incidenceRepository", "Lcom/adif/elcanomovil/domain/repositories/avisa/IncidenceRepository;", "provideCreateSubscriptionsdUseCase", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/CreateSubscriptionsUseCase;", "provideDeleteSubscriptionsdUseCase", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/DeleteSubscriptionsUseCase;", "provideFetchVersionUpdateUseCase", "Lcom/adif/elcanomovil/domain/usecases/FetchVersionUpdateUseCase;", "remoteConfigVersionRepository", "Lcom/adif/elcanomovil/domain/repositories/RemoteConfigVersionRepository;", "provideGenerateDynamicLinkFacade", "Lcom/adif/elcanomovil/domain/providers/DynamicLinkFacade;", "firebaseDynamicLinks", "Lcom/google/firebase/dynamiclinks/FirebaseDynamicLinks;", "provideGenerateDynamicLinkUseCase", "Lcom/adif/elcanomovil/domain/usecases/DynamicLinkUseCase;", "dynamicLinkFacade", "provideGeneratePasswordUseCase", "Lcom/adif/elcanomovil/domain/usecases/credentials/GeneratePasswordUseCase;", "credentialsProvider", "Lcom/adif/elcanomovil/domain/providers/CredentialsProvider;", "provideGeneratePersistentUserIdUseCase", "Lcom/adif/elcanomovil/domain/usecases/credentials/GeneratePersistentUserIdUseCase;", "provideGenerateUserIdUseCase", "Lcom/adif/elcanomovil/domain/usecases/credentials/GenerateUserIdUseCase;", "provideGetAppVersionUseCase", "Lcom/adif/elcanomovil/domain/usecases/GetAppVersionUseCase;", "appVersionProvider", "Lcom/adif/elcanomovil/domain/providers/AppVersionProvider;", "provideGetAvisaStationsCategoriesUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/station/GetAvisaStationCategoriesUseCase;", "avisaStationsRepository", "Lcom/adif/elcanomovil/domain/repositories/avisa/AvisaStationsRepository;", "provideGetAvisaStationsUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/station/GetAvisaStationsUseCase;", "provideGetBetweenStationsUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetBetweenStationsUseCase;", "circulationRepository", "Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;", "provideGetCirculationUpdateTimeUseCase", "Lcom/adif/elcanomovil/domain/usecases/GetCirculationUpdateTimeUseCase;", "provideGetClosestStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetClosestStationUseCase;", "locationProvider", "Lcom/adif/elcanomovil/domain/providers/LocationProvider;", "stationsRepository", "Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;", "check24hProvider", "Lcom/adif/elcanomovil/domain/providers/Check24hProvider;", "provideGetCompositionsUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetCompositionsUseCase;", "compositionsRepository", "Lcom/adif/elcanomovil/domain/repositories/compositions/CompositionsRepository;", "provideGetCurrentOneStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetCurrentOneStationUseCase;", "provideGetDepartureCirculationsUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetDepartureCirculationsUseCase;", "getStationArrivalsUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetStationArrivalsUseCase;", "getStationDeparturesUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetStationDeparturesUseCase;", "getBetweenStationsUseCase", "cercaniasCirculationMapper", "Lcom/adif/elcanomovil/domain/entities/circulation/mappers/CercaniasCirculationMapper;", "avldmdCirculationMapper", "Lcom/adif/elcanomovil/domain/entities/circulation/mappers/AvldmdCirculationMapper;", "otherCirculationMapper", "Lcom/adif/elcanomovil/domain/entities/circulation/mappers/OthersCirculationMapper;", "formatter", "Ljava/text/DateFormat;", "provideGetDistanceStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/ObserveRecentlySearchedStationsWithDistanceUseCase;", "getRecentStations", "Lcom/adif/elcanomovil/domain/usecases/recentSearch/GetRecentSearchesUseCase;", "provideGetFavoritesUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/GetStationsFavoritesUseCase;", "favoriteRepository", "Lcom/adif/elcanomovil/domain/repositories/favourites/FavoritesRepository;", "provideGetFiltersUseCase", "Lcom/adif/elcanomovil/domain/usecases/filters/GetFiltersUseCase;", "filtersRepository", "Lcom/adif/elcanomovil/domain/repositories/filters/FiltersRepository;", "provideGetHomeStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetHomeStationUseCase;", "provideGetIncidenceDetailUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/incidence/GetIncidenceDetailsUseCase;", "provideGetIncidencesUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/incidence/GetIncidencesUseCase;", "provideGetLastDepartureTypeTrainIsCercaniasUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDepartureTypeTrainIsCercaniasUseCase;", "provideGetLastDeparturesArrivalsStationToUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDeparturesArrivalsStationToUseCase;", "provideGetLastDeparturesArrivalsStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDeparturesArrivalsStationUseCase;", "provideGetLastVisitedStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetLastVisitedStationUseCase;", "provideGetOnePathsUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetOnePathsUseCase;", "provideGetOneStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetOneStationUseCase;", "provideGetRecentSearchesUseCase", "searchesRepository", "Lcom/adif/elcanomovil/domain/repositories/searches/SearchesRepository;", "getStationByIdUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "provideGetRecentTrainSearchesUseCase", "Lcom/adif/elcanomovil/domain/usecases/recentSearch/GetRecentTrainSearchesUseCase;", "provideGetRelationStationsFavoritesUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/GetRelationStationsFavoritesUseCase;", "provideGetSeveralPathsUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetSeveralPathsUseCase;", "provideGetStationArrivalsUseCase", "provideGetStationByIdUseCase", "provideGetStationByNameUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByNameUseCase;", "provideGetStationDeparturesUseCase", "provideGetStationIsFavoriteUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/GetStationIsFavoriteUseCase;", "provideGetStationsForRegionUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsForRegionUseCase;", "provideGetStationsObservationsUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsObservationsUseCase;", "stationsObservationsRepository", "Lcom/adif/elcanomovil/domain/repositories/stations/StationsObservationsRepository;", "provideGetStationsUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsUseCase;", "provideGetSubscriptionsdUseCase", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/GetSubscriptionsUseCase;", "provideGetTrainIsFavoriteUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/GetTrainIsFavoriteUseCase;", "provideGetTrainsFavoritesUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/GetTrainsFavoritesUseCase;", "provideGetUserLastLocationUseCase", "Lcom/adif/elcanomovil/domain/usecases/user/GetUserLastLocationUseCase;", "provideGetVersionUpdateStatusUseCase", "Lcom/adif/elcanomovil/domain/usecases/GetVersionUpdateStatusUseCase;", "provideGetWorkStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetWorkStationUseCase;", "provideLoginAvisaUserUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/user/LoginAvisaUserUseCase;", "avisaLoginRepository", "Lcom/adif/elcanomovil/domain/repositories/avisa/AvisaLoginRepository;", "generatePasswordUseCase", "generateUserIdUseCase", "provideManageLogosUseCase", "Lcom/adif/elcanomovil/domain/usecases/logos/ManageLogosUseCase;", "logosInfoRepository", "Lcom/adif/elcanomovil/domain/repositories/logos/LogosInfoRepository;", "logoProvider", "Lcom/adif/elcanomovil/domain/providers/LogoProvider;", "provideModifySubscriptionsdUseCase", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/ModifySubscriptionsUseCase;", "provideMuteSubscriptionsdUseCase", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/MuteSubscriptionsUseCase;", "provideRefreshAvisaUserUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/user/RefreshAvisaUserUseCase;", "provideRegisterAvisaUserUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/user/RegisterAvisaUserUseCase;", "generateSubscriptionUserIdUseCase", "pushIdToken", "Lcom/adif/elcanomovil/domain/providers/PushIdTokenProvider;", "tokenProvider", "Lcom/adif/elcanomovil/domain/providers/TokenJwtProvider;", "provideRemoveFavoriteStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/RemoveFavoriteStationUseCase;", "provideRemoveFavoriteTrainUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/RemoveFavoriteTrainUseCase;", "provideSaveFavoriteStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/SaveFavoriteStationUseCase;", "provideSaveFavoriteTrainUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/SaveFavoriteTrainUseCase;", "provideSaveFilterUseCase", "Lcom/adif/elcanomovil/domain/usecases/filters/SaveFilterUseCase;", "provideSaveRecentSearchUseCase", "Lcom/adif/elcanomovil/domain/usecases/recentSearch/SaveRecentSearchUseCase;", "provideSaveRecentTrainSearchUseCase", "Lcom/adif/elcanomovil/domain/usecases/recentSearch/SaveRecentTrainSearchUseCase;", "provideSetHomeStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/SetHomeStationUseCase;", "provideSetLastDepartureTypeTrainIsCercaniasUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDepartureTypeTrainIsCercaniasUseCase;", "provideSetLastDeparturesArrivalsStationToUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDeparturesArrivalsStationToUseCase;", "provideSetLastDeparturesArrivalsStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDeparturesArrivalsStationUseCase;", "provideSetLastVisitedStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/SetLastVisitedStationUseCase;", "provideSetWorkStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/SetWorkStationUseCase;", "provideTabDataHolder", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes.dex */
public final class UseCases {
    public static final UseCases INSTANCE = new UseCases();

    private UseCases() {
    }

    @Provides
    @Singleton
    public final ActiveSubscriptionsUseCase provideActiveSubscriptionsUseCase(SubscriptionRepository subscriptionRepository) {
        Intrinsics.checkNotNullParameter(subscriptionRepository, "subscriptionRepository");
        return new ActiveSubscriptionsUseCase(subscriptionRepository);
    }

    @Provides
    public final CreateIncidenceUseCase provideCreateIncidenceUseCase(IncidenceRepository incidenceRepository) {
        Intrinsics.checkNotNullParameter(incidenceRepository, "incidenceRepository");
        return new CreateIncidenceUseCase(incidenceRepository);
    }

    @Provides
    @Singleton
    public final CreateSubscriptionsUseCase provideCreateSubscriptionsdUseCase(SubscriptionRepository subscriptionRepository) {
        Intrinsics.checkNotNullParameter(subscriptionRepository, "subscriptionRepository");
        return new CreateSubscriptionsUseCase(subscriptionRepository);
    }

    @Provides
    @Singleton
    public final DeleteSubscriptionsUseCase provideDeleteSubscriptionsdUseCase(SubscriptionRepository subscriptionRepository) {
        Intrinsics.checkNotNullParameter(subscriptionRepository, "subscriptionRepository");
        return new DeleteSubscriptionsUseCase(subscriptionRepository);
    }

    @Provides
    public final FetchVersionUpdateUseCase provideFetchVersionUpdateUseCase(RemoteConfigVersionRepository remoteConfigVersionRepository) {
        Intrinsics.checkNotNullParameter(remoteConfigVersionRepository, "remoteConfigVersionRepository");
        return new FetchVersionUpdateUseCase(remoteConfigVersionRepository);
    }

    @Provides
    @Singleton
    public final DynamicLinkFacade provideGenerateDynamicLinkFacade(FirebaseDynamicLinks firebaseDynamicLinks) {
        Intrinsics.checkNotNullParameter(firebaseDynamicLinks, "firebaseDynamicLinks");
        return new DefaultDynamicLinkFacade(firebaseDynamicLinks);
    }

    @Provides
    @Singleton
    public final DynamicLinkUseCase provideGenerateDynamicLinkUseCase(DynamicLinkFacade dynamicLinkFacade) {
        Intrinsics.checkNotNullParameter(dynamicLinkFacade, "dynamicLinkFacade");
        return new DynamicLinkUseCase(dynamicLinkFacade);
    }

    @Provides
    @Singleton
    public final GeneratePasswordUseCase provideGeneratePasswordUseCase(CredentialsProvider credentialsProvider) {
        Intrinsics.checkNotNullParameter(credentialsProvider, "credentialsProvider");
        return new GeneratePasswordUseCase(credentialsProvider);
    }

    @Provides
    @Singleton
    public final GeneratePersistentUserIdUseCase provideGeneratePersistentUserIdUseCase(CredentialsProvider credentialsProvider) {
        Intrinsics.checkNotNullParameter(credentialsProvider, "credentialsProvider");
        return new GeneratePersistentUserIdUseCase(credentialsProvider);
    }

    @Provides
    @Singleton
    public final GenerateUserIdUseCase provideGenerateUserIdUseCase(CredentialsProvider credentialsProvider) {
        Intrinsics.checkNotNullParameter(credentialsProvider, "credentialsProvider");
        return new GenerateUserIdUseCase(credentialsProvider);
    }

    @Provides
    public final GetAppVersionUseCase provideGetAppVersionUseCase(AppVersionProvider appVersionProvider) {
        Intrinsics.checkNotNullParameter(appVersionProvider, "appVersionProvider");
        return new GetAppVersionUseCase(appVersionProvider);
    }

    @Provides
    public final GetAvisaStationCategoriesUseCase provideGetAvisaStationsCategoriesUseCase(AvisaStationsRepository avisaStationsRepository) {
        Intrinsics.checkNotNullParameter(avisaStationsRepository, "avisaStationsRepository");
        return new GetAvisaStationCategoriesUseCase(avisaStationsRepository);
    }

    @Provides
    public final GetAvisaStationsUseCase provideGetAvisaStationsUseCase(AvisaStationsRepository avisaStationsRepository) {
        Intrinsics.checkNotNullParameter(avisaStationsRepository, "avisaStationsRepository");
        return new GetAvisaStationsUseCase(avisaStationsRepository);
    }

    @Provides
    public final GetBetweenStationsUseCase provideGetBetweenStationsUseCase(CirculationRepository circulationRepository) {
        Intrinsics.checkNotNullParameter(circulationRepository, "circulationRepository");
        return new GetBetweenStationsUseCase(circulationRepository);
    }

    @Provides
    @Singleton
    public final GetCirculationUpdateTimeUseCase provideGetCirculationUpdateTimeUseCase(RemoteConfigVersionRepository remoteConfigVersionRepository) {
        Intrinsics.checkNotNullParameter(remoteConfigVersionRepository, "remoteConfigVersionRepository");
        return new GetCirculationUpdateTimeUseCase(remoteConfigVersionRepository);
    }

    @Provides
    public final GetClosestStationUseCase provideGetClosestStationUseCase(LocationProvider locationProvider, StationsRepository stationsRepository, Check24hProvider check24hProvider) {
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        Intrinsics.checkNotNullParameter(check24hProvider, "check24hProvider");
        return new GetClosestStationUseCase(locationProvider, stationsRepository, check24hProvider);
    }

    @Provides
    @Singleton
    public final GetCompositionsUseCase provideGetCompositionsUseCase(CompositionsRepository compositionsRepository) {
        Intrinsics.checkNotNullParameter(compositionsRepository, "compositionsRepository");
        return new GetCompositionsUseCase(compositionsRepository);
    }

    @Provides
    public final GetCurrentOneStationUseCase provideGetCurrentOneStationUseCase(StationsRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        return new GetCurrentOneStationUseCase(stationsRepository);
    }

    @Provides
    @Singleton
    public final GetDepartureCirculationsUseCase provideGetDepartureCirculationsUseCase(GetStationArrivalsUseCase getStationArrivalsUseCase, GetStationDeparturesUseCase getStationDeparturesUseCase, GetBetweenStationsUseCase getBetweenStationsUseCase, CercaniasCirculationMapper cercaniasCirculationMapper, AvldmdCirculationMapper avldmdCirculationMapper, OthersCirculationMapper otherCirculationMapper, DateFormat formatter) {
        Intrinsics.checkNotNullParameter(getStationArrivalsUseCase, "getStationArrivalsUseCase");
        Intrinsics.checkNotNullParameter(getStationDeparturesUseCase, "getStationDeparturesUseCase");
        Intrinsics.checkNotNullParameter(getBetweenStationsUseCase, "getBetweenStationsUseCase");
        Intrinsics.checkNotNullParameter(cercaniasCirculationMapper, "cercaniasCirculationMapper");
        Intrinsics.checkNotNullParameter(avldmdCirculationMapper, "avldmdCirculationMapper");
        Intrinsics.checkNotNullParameter(otherCirculationMapper, "otherCirculationMapper");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new GetDepartureCirculationsUseCase(getStationArrivalsUseCase, getStationDeparturesUseCase, getBetweenStationsUseCase, cercaniasCirculationMapper, avldmdCirculationMapper, otherCirculationMapper, formatter);
    }

    @Provides
    public final ObserveRecentlySearchedStationsWithDistanceUseCase provideGetDistanceStationUseCase(LocationProvider locationProvider, GetRecentSearchesUseCase getRecentStations) {
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(getRecentStations, "getRecentStations");
        return new ObserveRecentlySearchedStationsWithDistanceUseCase(locationProvider, getRecentStations);
    }

    @Provides
    public final GetStationsFavoritesUseCase provideGetFavoritesUseCase(FavoritesRepository favoriteRepository) {
        Intrinsics.checkNotNullParameter(favoriteRepository, "favoriteRepository");
        return new GetStationsFavoritesUseCase(favoriteRepository);
    }

    @Provides
    public final GetFiltersUseCase provideGetFiltersUseCase(FiltersRepository filtersRepository) {
        Intrinsics.checkNotNullParameter(filtersRepository, "filtersRepository");
        return new GetFiltersUseCase(filtersRepository);
    }

    @Provides
    @Singleton
    public final GetHomeStationUseCase provideGetHomeStationUseCase(StationsRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        return new GetHomeStationUseCase(stationsRepository);
    }

    @Provides
    public final GetIncidenceDetailsUseCase provideGetIncidenceDetailUseCase(IncidenceRepository incidenceRepository) {
        Intrinsics.checkNotNullParameter(incidenceRepository, "incidenceRepository");
        return new GetIncidenceDetailsUseCase(incidenceRepository);
    }

    @Provides
    public final GetIncidencesUseCase provideGetIncidencesUseCase(IncidenceRepository incidenceRepository) {
        Intrinsics.checkNotNullParameter(incidenceRepository, "incidenceRepository");
        return new GetIncidencesUseCase(incidenceRepository);
    }

    @Provides
    @Singleton
    public final GetLastDepartureTypeTrainIsCercaniasUseCase provideGetLastDepartureTypeTrainIsCercaniasUseCase(CirculationRepository circulationRepository) {
        Intrinsics.checkNotNullParameter(circulationRepository, "circulationRepository");
        return new GetLastDepartureTypeTrainIsCercaniasUseCase(circulationRepository);
    }

    @Provides
    @Singleton
    public final GetLastDeparturesArrivalsStationToUseCase provideGetLastDeparturesArrivalsStationToUseCase(CirculationRepository circulationRepository) {
        Intrinsics.checkNotNullParameter(circulationRepository, "circulationRepository");
        return new GetLastDeparturesArrivalsStationToUseCase(circulationRepository);
    }

    @Provides
    @Singleton
    public final GetLastDeparturesArrivalsStationUseCase provideGetLastDeparturesArrivalsStationUseCase(CirculationRepository circulationRepository) {
        Intrinsics.checkNotNullParameter(circulationRepository, "circulationRepository");
        return new GetLastDeparturesArrivalsStationUseCase(circulationRepository);
    }

    @Provides
    public final GetLastVisitedStationUseCase provideGetLastVisitedStationUseCase(StationsRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        return new GetLastVisitedStationUseCase(stationsRepository);
    }

    @Provides
    public final GetOnePathsUseCase provideGetOnePathsUseCase(CirculationRepository circulationRepository, RemoteConfigVersionRepository remoteConfigVersionRepository) {
        Intrinsics.checkNotNullParameter(circulationRepository, "circulationRepository");
        Intrinsics.checkNotNullParameter(remoteConfigVersionRepository, "remoteConfigVersionRepository");
        return new GetOnePathsUseCase(circulationRepository, remoteConfigVersionRepository);
    }

    @Provides
    public final GetOneStationUseCase provideGetOneStationUseCase(StationsRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        return new GetOneStationUseCase(stationsRepository);
    }

    @Provides
    public final GetRecentSearchesUseCase provideGetRecentSearchesUseCase(SearchesRepository searchesRepository, GetStationByIdUseCase getStationByIdUseCase) {
        Intrinsics.checkNotNullParameter(searchesRepository, "searchesRepository");
        Intrinsics.checkNotNullParameter(getStationByIdUseCase, "getStationByIdUseCase");
        return new GetRecentSearchesUseCase(searchesRepository, getStationByIdUseCase);
    }

    @Provides
    public final GetRecentTrainSearchesUseCase provideGetRecentTrainSearchesUseCase(SearchesRepository searchesRepository) {
        Intrinsics.checkNotNullParameter(searchesRepository, "searchesRepository");
        return new GetRecentTrainSearchesUseCase(searchesRepository);
    }

    @Provides
    public final GetRelationStationsFavoritesUseCase provideGetRelationStationsFavoritesUseCase(FavoritesRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        return new GetRelationStationsFavoritesUseCase(stationsRepository);
    }

    @Provides
    public final GetSeveralPathsUseCase provideGetSeveralPathsUseCase(CirculationRepository circulationRepository) {
        Intrinsics.checkNotNullParameter(circulationRepository, "circulationRepository");
        return new GetSeveralPathsUseCase(circulationRepository);
    }

    @Provides
    public final GetStationArrivalsUseCase provideGetStationArrivalsUseCase(CirculationRepository circulationRepository) {
        Intrinsics.checkNotNullParameter(circulationRepository, "circulationRepository");
        return new GetStationArrivalsUseCase(circulationRepository);
    }

    @Provides
    public final GetStationByIdUseCase provideGetStationByIdUseCase(StationsRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        return new GetStationByIdUseCase(stationsRepository);
    }

    @Provides
    public final GetStationByNameUseCase provideGetStationByNameUseCase(StationsRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        return new GetStationByNameUseCase(stationsRepository);
    }

    @Provides
    public final GetStationDeparturesUseCase provideGetStationDeparturesUseCase(CirculationRepository circulationRepository) {
        Intrinsics.checkNotNullParameter(circulationRepository, "circulationRepository");
        return new GetStationDeparturesUseCase(circulationRepository);
    }

    @Provides
    public final GetStationIsFavoriteUseCase provideGetStationIsFavoriteUseCase(FavoritesRepository favoriteRepository) {
        Intrinsics.checkNotNullParameter(favoriteRepository, "favoriteRepository");
        return new GetStationIsFavoriteUseCase(favoriteRepository);
    }

    @Provides
    public final GetStationsForRegionUseCase provideGetStationsForRegionUseCase(LocationProvider locationProvider, StationsRepository stationsRepository, Check24hProvider check24hProvider) {
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        Intrinsics.checkNotNullParameter(check24hProvider, "check24hProvider");
        return new GetStationsForRegionUseCase(locationProvider, stationsRepository, check24hProvider);
    }

    @Provides
    public final GetStationsObservationsUseCase provideGetStationsObservationsUseCase(StationsObservationsRepository stationsObservationsRepository) {
        Intrinsics.checkNotNullParameter(stationsObservationsRepository, "stationsObservationsRepository");
        return new GetStationsObservationsUseCase(stationsObservationsRepository);
    }

    @Provides
    public final GetStationsUseCase provideGetStationsUseCase(StationsRepository stationsRepository, Check24hProvider check24hProvider) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        Intrinsics.checkNotNullParameter(check24hProvider, "check24hProvider");
        return new GetStationsUseCase(stationsRepository, check24hProvider);
    }

    @Provides
    @Singleton
    public final GetSubscriptionsUseCase provideGetSubscriptionsdUseCase(SubscriptionRepository subscriptionRepository) {
        Intrinsics.checkNotNullParameter(subscriptionRepository, "subscriptionRepository");
        return new GetSubscriptionsUseCase(subscriptionRepository);
    }

    @Provides
    public final GetTrainIsFavoriteUseCase provideGetTrainIsFavoriteUseCase(FavoritesRepository favoriteRepository) {
        Intrinsics.checkNotNullParameter(favoriteRepository, "favoriteRepository");
        return new GetTrainIsFavoriteUseCase(favoriteRepository);
    }

    @Provides
    public final GetTrainsFavoritesUseCase provideGetTrainsFavoritesUseCase(FavoritesRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        return new GetTrainsFavoritesUseCase(stationsRepository);
    }

    @Provides
    public final GetUserLastLocationUseCase provideGetUserLastLocationUseCase(LocationProvider locationProvider) {
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        return new GetUserLastLocationUseCase(locationProvider);
    }

    @Provides
    public final GetVersionUpdateStatusUseCase provideGetVersionUpdateStatusUseCase(AppVersionProvider appVersionProvider, RemoteConfigVersionRepository remoteConfigVersionRepository) {
        Intrinsics.checkNotNullParameter(appVersionProvider, "appVersionProvider");
        Intrinsics.checkNotNullParameter(remoteConfigVersionRepository, "remoteConfigVersionRepository");
        return new GetVersionUpdateStatusUseCase(appVersionProvider, remoteConfigVersionRepository);
    }

    @Provides
    @Singleton
    public final GetWorkStationUseCase provideGetWorkStationUseCase(StationsRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        return new GetWorkStationUseCase(stationsRepository);
    }

    @Provides
    public final LoginAvisaUserUseCase provideLoginAvisaUserUseCase(AvisaLoginRepository avisaLoginRepository, GeneratePasswordUseCase generatePasswordUseCase, GenerateUserIdUseCase generateUserIdUseCase) {
        Intrinsics.checkNotNullParameter(avisaLoginRepository, "avisaLoginRepository");
        Intrinsics.checkNotNullParameter(generatePasswordUseCase, "generatePasswordUseCase");
        Intrinsics.checkNotNullParameter(generateUserIdUseCase, "generateUserIdUseCase");
        return new LoginAvisaUserUseCase(avisaLoginRepository);
    }

    @Provides
    @Singleton
    public final ManageLogosUseCase provideManageLogosUseCase(LogosInfoRepository logosInfoRepository, LogoProvider logoProvider) {
        Intrinsics.checkNotNullParameter(logosInfoRepository, "logosInfoRepository");
        Intrinsics.checkNotNullParameter(logoProvider, "logoProvider");
        return new ManageLogosUseCase(logosInfoRepository, logoProvider);
    }

    @Provides
    @Singleton
    public final ModifySubscriptionsUseCase provideModifySubscriptionsdUseCase(SubscriptionRepository subscriptionRepository) {
        Intrinsics.checkNotNullParameter(subscriptionRepository, "subscriptionRepository");
        return new ModifySubscriptionsUseCase(subscriptionRepository);
    }

    @Provides
    @Singleton
    public final MuteSubscriptionsUseCase provideMuteSubscriptionsdUseCase(SubscriptionRepository subscriptionRepository) {
        Intrinsics.checkNotNullParameter(subscriptionRepository, "subscriptionRepository");
        return new MuteSubscriptionsUseCase(subscriptionRepository);
    }

    @Provides
    public final RefreshAvisaUserUseCase provideRefreshAvisaUserUseCase(AvisaLoginRepository avisaLoginRepository) {
        Intrinsics.checkNotNullParameter(avisaLoginRepository, "avisaLoginRepository");
        return new RefreshAvisaUserUseCase(avisaLoginRepository);
    }

    @Provides
    public final RegisterAvisaUserUseCase provideRegisterAvisaUserUseCase(AvisaLoginRepository avisaLoginRepository, GeneratePasswordUseCase generatePasswordUseCase, GenerateUserIdUseCase generateUserIdUseCase, GeneratePersistentUserIdUseCase generateSubscriptionUserIdUseCase, PushIdTokenProvider pushIdToken, TokenJwtProvider tokenProvider) {
        Intrinsics.checkNotNullParameter(avisaLoginRepository, "avisaLoginRepository");
        Intrinsics.checkNotNullParameter(generatePasswordUseCase, "generatePasswordUseCase");
        Intrinsics.checkNotNullParameter(generateUserIdUseCase, "generateUserIdUseCase");
        Intrinsics.checkNotNullParameter(generateSubscriptionUserIdUseCase, "generateSubscriptionUserIdUseCase");
        Intrinsics.checkNotNullParameter(pushIdToken, "pushIdToken");
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        return new RegisterAvisaUserUseCase(avisaLoginRepository, generatePasswordUseCase, generateUserIdUseCase, generateSubscriptionUserIdUseCase, pushIdToken, tokenProvider);
    }

    @Provides
    public final RemoveFavoriteStationUseCase provideRemoveFavoriteStationUseCase(FavoritesRepository favoriteRepository) {
        Intrinsics.checkNotNullParameter(favoriteRepository, "favoriteRepository");
        return new RemoveFavoriteStationUseCase(favoriteRepository);
    }

    @Provides
    public final RemoveFavoriteTrainUseCase provideRemoveFavoriteTrainUseCase(FavoritesRepository favoriteRepository) {
        Intrinsics.checkNotNullParameter(favoriteRepository, "favoriteRepository");
        return new RemoveFavoriteTrainUseCase(favoriteRepository);
    }

    @Provides
    public final SaveFavoriteStationUseCase provideSaveFavoriteStationUseCase(FavoritesRepository favoriteRepository) {
        Intrinsics.checkNotNullParameter(favoriteRepository, "favoriteRepository");
        return new SaveFavoriteStationUseCase(favoriteRepository);
    }

    @Provides
    public final SaveFavoriteTrainUseCase provideSaveFavoriteTrainUseCase(FavoritesRepository favoriteRepository) {
        Intrinsics.checkNotNullParameter(favoriteRepository, "favoriteRepository");
        return new SaveFavoriteTrainUseCase(favoriteRepository);
    }

    @Provides
    public final SaveFilterUseCase provideSaveFilterUseCase(FiltersRepository filtersRepository) {
        Intrinsics.checkNotNullParameter(filtersRepository, "filtersRepository");
        return new SaveFilterUseCase(filtersRepository);
    }

    @Provides
    public final SaveRecentSearchUseCase provideSaveRecentSearchUseCase(SearchesRepository searchesRepository) {
        Intrinsics.checkNotNullParameter(searchesRepository, "searchesRepository");
        return new SaveRecentSearchUseCase(searchesRepository);
    }

    @Provides
    public final SaveRecentTrainSearchUseCase provideSaveRecentTrainSearchUseCase(SearchesRepository searchesRepository) {
        Intrinsics.checkNotNullParameter(searchesRepository, "searchesRepository");
        return new SaveRecentTrainSearchUseCase(searchesRepository);
    }

    @Provides
    @Singleton
    public final SetHomeStationUseCase provideSetHomeStationUseCase(StationsRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        return new SetHomeStationUseCase(stationsRepository);
    }

    @Provides
    @Singleton
    public final SetLastDepartureTypeTrainIsCercaniasUseCase provideSetLastDepartureTypeTrainIsCercaniasUseCase(CirculationRepository circulationRepository) {
        Intrinsics.checkNotNullParameter(circulationRepository, "circulationRepository");
        return new SetLastDepartureTypeTrainIsCercaniasUseCase(circulationRepository);
    }

    @Provides
    @Singleton
    public final SetLastDeparturesArrivalsStationToUseCase provideSetLastDeparturesArrivalsStationToUseCase(CirculationRepository circulationRepository) {
        Intrinsics.checkNotNullParameter(circulationRepository, "circulationRepository");
        return new SetLastDeparturesArrivalsStationToUseCase(circulationRepository);
    }

    @Provides
    @Singleton
    public final SetLastDeparturesArrivalsStationUseCase provideSetLastDeparturesArrivalsStationUseCase(CirculationRepository circulationRepository) {
        Intrinsics.checkNotNullParameter(circulationRepository, "circulationRepository");
        return new SetLastDeparturesArrivalsStationUseCase(circulationRepository);
    }

    @Provides
    public final SetLastVisitedStationUseCase provideSetLastVisitedStationUseCase(StationsRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        return new SetLastVisitedStationUseCase(stationsRepository);
    }

    @Provides
    @Singleton
    public final SetWorkStationUseCase provideSetWorkStationUseCase(StationsRepository stationsRepository) {
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        return new SetWorkStationUseCase(stationsRepository);
    }

    @Provides
    @Singleton
    public final TabDataHolder provideTabDataHolder() {
        return new TabDataHolder();
    }
}
