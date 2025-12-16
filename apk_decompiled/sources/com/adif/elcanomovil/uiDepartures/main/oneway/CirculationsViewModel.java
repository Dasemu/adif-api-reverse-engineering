package com.adif.elcanomovil.uiDepartures.main.oneway;

import android.net.Uri;
import androidx.lifecycle.A;
import androidx.lifecycle.I;
import androidx.lifecycle.Q;
import androidx.lifecycle.Z;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab;
import com.adif.elcanomovil.commonNavGraph.arguments.ChildDirections;
import com.adif.elcanomovil.commonNavGraph.arguments.Filter;
import com.adif.elcanomovil.commonNavGraph.arguments.Filters;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.navigation.DeeplinkRoutes;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.commonViews.EmptyCirculationsState;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.domain.entities.circulation.Circulation;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculation;
import com.adif.elcanomovil.domain.entities.stationObservations.StationObservation;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
import com.adif.elcanomovil.domain.usecases.GetCirculationUpdateTimeUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDepartureTypeTrainIsCercaniasUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationToUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDepartureTypeTrainIsCercaniasUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationToUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.GetStationIsFavoriteUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteStationUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteStationUseCase;
import com.adif.elcanomovil.domain.usecases.filters.GetFiltersUseCase;
import com.adif.elcanomovil.domain.usecases.filters.SaveFilterUseCase;
import com.adif.elcanomovil.domain.usecases.logos.ManageLogosUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationsObservationsUseCase;
import com.adif.elcanomovil.enums.SubscriptionType;
import com.adif.elcanomovil.enums.TypeSubscriptionCreationView;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import com.adif.elcanomovil.uiDepartures.R;
import com.adif.elcanomovil.uiDepartures.entities.ObservationAlert;
import com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData;
import com.adif.elcanomovil.uiDepartures.views.StationAction;
import com.adif.elcanomovil.uiDepartures.views.TrafficAvailability;
import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000Ð\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0099\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020+2\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\u00020+2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u00020+2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0015\u0010<\u001a\u00020+2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020+2\u0006\u0010>\u001a\u00020.¢\u0006\u0004\b?\u00101J\u0015\u0010@\u001a\u00020+2\u0006\u0010>\u001a\u00020.¢\u0006\u0004\b@\u00101J\u0015\u0010C\u001a\u00020+2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020+¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020+¢\u0006\u0004\bG\u0010FJÓ\u0001\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00060O\"\u0004\b\u0000\u0010H\"\u0004\b\u0001\u0010I\"\u0004\b\u0002\u0010J\"\u0004\b\u0003\u0010K\"\u0004\b\u0004\u0010L\"\u0004\b\u0005\u0010M\"\u0004\b\u0006\u0010N2\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000O2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00010O2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00020O2\f\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00030O2\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00040O2\f\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00050O2@\u0010Y\u001a<\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00060W\u0012\u0006\u0012\u0004\u0018\u00010X0V¢\u0006\u0004\bZ\u0010[J\u001a\u0010^\u001a\u00020+2\b\b\u0002\u0010]\u001a\u00020\\H\u0087@¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020+H\u0003¢\u0006\u0004\b`\u0010FJ\u000f\u0010a\u001a\u00020+H\u0003¢\u0006\u0004\ba\u0010FJ\u0019\u0010e\u001a\u0004\u0018\u00010d2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020+H\u0002¢\u0006\u0004\bg\u0010FJ$\u0010j\u001a\u00020+2\b\b\u0002\u0010h\u001a\u00020\\2\b\b\u0002\u0010i\u001a\u00020\\H\u0082@¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020+H\u0002¢\u0006\u0004\bl\u0010FJ\u000f\u0010m\u001a\u00020+H\u0002¢\u0006\u0004\bm\u0010FJ\u000f\u0010n\u001a\u00020+H\u0002¢\u0006\u0004\bn\u0010FJ\u000f\u0010o\u001a\u00020+H\u0002¢\u0006\u0004\bo\u0010FJ\u000f\u0010p\u001a\u00020+H\u0002¢\u0006\u0004\bp\u0010FJ\u000f\u0010q\u001a\u00020+H\u0002¢\u0006\u0004\bq\u0010FJ\u000f\u0010r\u001a\u00020+H\u0002¢\u0006\u0004\br\u0010FJ\u000f\u0010s\u001a\u00020+H\u0002¢\u0006\u0004\bs\u0010FJ\u0010\u0010t\u001a\u00020+H\u0082@¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020+H\u0002¢\u0006\u0004\bv\u0010FJ\u000f\u0010w\u001a\u00020+H\u0002¢\u0006\u0004\bw\u0010FJ.\u0010}\u001a\u00020b2\u0012\u0010{\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020z0y0x2\b\b\u0002\u0010|\u001a\u00020\\H\u0082@¢\u0006\u0004\b}\u0010~R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u007fR\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u0080\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u0081\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u0082\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010\u0083\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010\u0084\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u0085\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u0086\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u0087\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u0088\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u0089\u0001R\u0015\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010\u008a\u0001R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010\u008b\u0001R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010\u008c\u0001R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010\u008d\u0001R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010\u008e\u0001R\u0015\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010\u008f\u0001R\u0015\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010\u0090\u0001R\u0019\u0010\u0091\u0001\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0093\u0001\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0092\u0001R!\u0010\u0099\u0001\u001a\u00030\u0094\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R0\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009a\u00012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R \u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030 \u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0017\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010£\u0001R\u001a\u0010¥\u0001\u001a\u00030¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001b\u0010§\u0001\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001b\u0010©\u0001\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001b\u0010«\u0001\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010ª\u0001R\u0019\u0010¬\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010®\u0001\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0019\u0010°\u0001\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010¯\u0001R\u0019\u0010±\u0001\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010¯\u0001R\u001a\u0010³\u0001\u001a\u00030²\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R#\u0010¶\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¤\u00010µ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R \u0010¸\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\\0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010·\u0001R \u0010¹\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\\0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010·\u0001R \u0010º\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001060µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010·\u0001R\u001f\u0010½\u0001\u001a\n\u0012\u0005\u0012\u00030¼\u00010»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001f\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030¿\u00010µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010·\u0001R\u001f\u0010Â\u0001\u001a\n\u0012\u0005\u0012\u00030Á\u00010µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010·\u0001R\u001e\u0010Ã\u0001\u001a\t\u0012\u0004\u0012\u00020\\0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010·\u0001R\u001e\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020b0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010·\u0001R$\u0010Æ\u0001\u001a\n\u0012\u0005\u0012\u00030¼\u00010Å\u00018\u0006¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R#\u0010Ë\u0001\u001a\t\u0012\u0004\u0012\u00020\\0Ê\u00018\u0006¢\u0006\u0010\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R#\u0010Ï\u0001\u001a\t\u0012\u0004\u0012\u00020\\0Ê\u00018\u0006¢\u0006\u0010\n\u0006\bÏ\u0001\u0010Ì\u0001\u001a\u0006\bÐ\u0001\u0010Î\u0001R#\u0010Ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\\0Ê\u00018\u0006¢\u0006\u0010\n\u0006\bÑ\u0001\u0010Ì\u0001\u001a\u0006\bÒ\u0001\u0010Î\u0001R(\u0010Ó\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010d0Ê\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÓ\u0001\u0010Ì\u0001\u001a\u0006\bÔ\u0001\u0010Î\u0001R)\u0010Õ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020z0y0Ê\u00018\u0006¢\u0006\u0010\n\u0006\bÕ\u0001\u0010Ì\u0001\u001a\u0006\bÖ\u0001\u0010Î\u0001R'\u0010Ø\u0001\u001a\n\u0012\u0005\u0012\u00030×\u00010Ê\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bØ\u0001\u0010Ì\u0001\u001a\u0006\bÙ\u0001\u0010Î\u0001R'\u0010Ú\u0001\u001a\n\u0012\u0005\u0012\u00030¿\u00010Ê\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÚ\u0001\u0010Ì\u0001\u001a\u0006\bÛ\u0001\u0010Î\u0001R'\u0010Ü\u0001\u001a\n\u0012\u0005\u0012\u00030Á\u00010Ê\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÜ\u0001\u0010Ì\u0001\u001a\u0006\bÝ\u0001\u0010Î\u0001¨\u0006Þ\u0001"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewModel;", "Landroidx/lifecycle/w0;", "Landroidx/lifecycle/I;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsObservationsUseCase;", "getStationsObservationsUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetDepartureCirculationsUseCase;", "getDepartureCirculationsUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDeparturesArrivalsStationUseCase;", "getLastDeparturesArrivalsStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDeparturesArrivalsStationUseCase;", "setLastDeparturesArrivalsStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDeparturesArrivalsStationToUseCase;", "getLastDeparturesArrivalsStationToUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDepartureTypeTrainIsCercaniasUseCase;", "getLastDepartureTypeTrainIsCercaniasUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDeparturesArrivalsStationToUseCase;", "setLastDeparturesArrivalsStationToUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDepartureTypeTrainIsCercaniasUseCase;", "setLastDepartureTypeTrainIsCercaniasUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/GetStationIsFavoriteUseCase;", "fetchFavoriteStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/SaveFavoriteStationUseCase;", "saveFavoriteStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/RemoveFavoriteStationUseCase;", "removeFavoriteStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "getStationByIdUseCase", "Lcom/adif/elcanomovil/domain/usecases/DynamicLinkUseCase;", "dynamicLinkUseCase", "Lcom/adif/elcanomovil/domain/usecases/GetCirculationUpdateTimeUseCase;", "getCirculationUpdateTimeUseCase", "Lcom/adif/elcanomovil/domain/usecases/filters/GetFiltersUseCase;", "getFiltersUseCase", "Lcom/adif/elcanomovil/domain/usecases/filters/SaveFilterUseCase;", "saveFilterUseCase", "Ld1/g;", "stringProvider", "Lcom/adif/elcanomovil/domain/usecases/logos/ManageLogosUseCase;", "manageLogosUseCase", "<init>", "(Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsObservationsUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/GetDepartureCirculationsUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDeparturesArrivalsStationUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDeparturesArrivalsStationUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDeparturesArrivalsStationToUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDepartureTypeTrainIsCercaniasUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDeparturesArrivalsStationToUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDepartureTypeTrainIsCercaniasUseCase;Lcom/adif/elcanomovil/domain/usecases/favorites/GetStationIsFavoriteUseCase;Lcom/adif/elcanomovil/domain/usecases/favorites/SaveFavoriteStationUseCase;Lcom/adif/elcanomovil/domain/usecases/favorites/RemoveFavoriteStationUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;Lcom/adif/elcanomovil/domain/usecases/DynamicLinkUseCase;Lcom/adif/elcanomovil/domain/usecases/GetCirculationUpdateTimeUseCase;Lcom/adif/elcanomovil/domain/usecases/filters/GetFiltersUseCase;Lcom/adif/elcanomovil/domain/usecases/filters/SaveFilterUseCase;Ld1/g;Lcom/adif/elcanomovil/domain/usecases/logos/ManageLogosUseCase;)V", "", "tabPosition", "", "handleOnCreate", "(Ljava/lang/Integer;)V", "", "observation", "handleCirculationObservationTap", "(Ljava/lang/String;)V", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculation;", "trainCirculation", "handleTrainTap", "(Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculation;)V", "Lcom/adif/elcanomovil/domain/entities/TrainType;", "isCercanias", "handleTrainTypeChange", "(Lcom/adif/elcanomovil/domain/entities/TrainType;)V", "Lcom/adif/elcanomovil/uiDepartures/views/StationAction;", "action", "handleHeaderButtonTap", "(Lcom/adif/elcanomovil/uiDepartures/views/StationAction;)V", "stationCode", "handleOriginStationSelected", "handleDestinationStationSelected", "Lcom/adif/elcanomovil/commonNavGraph/arguments/Filter;", "filter", "handleFilterChanged", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/Filter;)V", "handleScrollToTop", "()V", "handleScrollToBottom", "T1", "T2", "T3", "T4", "T5", "T6", "R", "Lkotlinx/coroutines/flow/Flow;", "flow", "flow2", "flow3", "flow4", "flow5", "flow6", "Lkotlin/Function7;", "Lkotlin/coroutines/Continuation;", "", "transform", "combine", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function7;)Lkotlinx/coroutines/flow/Flow;", "", "isRefreshing", "fetchCirculations", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleOnResume", "handleOnPause", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData;", "viewData", "Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState;", "mapToEmptyState", "(Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewData;)Lcom/adif/elcanomovil/commonViews/EmptyCirculationsState;", "observeSelectedStationsChanges", "dropPreviousCirculations", "refreshing", "reloadCirculations", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleFavButtonTap", "handleSearchButtonTap", "handleSearchToButtonTap", "handleDirectionSwitch", "handleShareButtonTap", "handleSubscriptionButtonTap", "handleObservationsButtonTap", "handleFiltersButtonTap", "updateInfoHeader", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateObservations", "stopFetcher", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/circulation/Circulation;", "circulations", "showCorporate", "mapToViewData", "(Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsObservationsUseCase;", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetDepartureCirculationsUseCase;", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDeparturesArrivalsStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDeparturesArrivalsStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDeparturesArrivalsStationToUseCase;", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDepartureTypeTrainIsCercaniasUseCase;", "Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDeparturesArrivalsStationToUseCase;", "Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDepartureTypeTrainIsCercaniasUseCase;", "Lcom/adif/elcanomovil/domain/usecases/favorites/GetStationIsFavoriteUseCase;", "Lcom/adif/elcanomovil/domain/usecases/favorites/SaveFavoriteStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/favorites/RemoveFavoriteStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "Lcom/adif/elcanomovil/domain/usecases/DynamicLinkUseCase;", "Lcom/adif/elcanomovil/domain/usecases/GetCirculationUpdateTimeUseCase;", "Lcom/adif/elcanomovil/domain/usecases/filters/GetFiltersUseCase;", "Lcom/adif/elcanomovil/domain/usecases/filters/SaveFilterUseCase;", "Ld1/g;", "Lcom/adif/elcanomovil/domain/usecases/logos/ManageLogosUseCase;", "filter_all_stations", "Lcom/adif/elcanomovil/commonNavGraph/arguments/Filter;", "filter_full_data", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "observationActions$delegate", "Lkotlin/Lazy;", "getObservationActions", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "observationActions", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "<set-?>", "pageType", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "getPageType", "()Lcom/adif/elcanomovil/domain/entities/CirculationType;", "Lcom/adif/elcanomovil/domain/entities/stationObservations/StationObservation;", "listOfObservation", "Ljava/util/List;", "Lcom/adif/elcanomovil/domain/entities/TrainType;", "Lcom/adif/elcanomovil/uiDepartures/views/TrafficAvailability;", "hasBothTraffic", "Lcom/adif/elcanomovil/uiDepartures/views/TrafficAvailability;", "isRodalies", "Ljava/lang/Boolean;", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, "Ljava/lang/String;", NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "currentPage", "I", "canFetchMore", "Z", "isFetchingMore", "isPresented", "Ljava/util/Timer;", "timer", "Ljava/util/Timer;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "hasBothTrafficFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "isShowExpandedFlow", "isShowCorporateStopsFlow", "isCercaniasFlow", "Lb1/f;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "navigationFlow", "Lb1/f;", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/StationHeaderInfo;", "headerInfoFlow", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/ObservationInfo;", "observationInfoFlow", "loadingMoreFlow", "viewDataFlow", "Lb1/a;", "navigation", "Lb1/a;", "getNavigation", "()Lb1/a;", "Landroidx/lifecycle/Q;", "showContent", "Landroidx/lifecycle/Q;", "getShowContent", "()Landroidx/lifecycle/Q;", "showLoading", "getShowLoading", "showLoadingMore", "getShowLoadingMore", "emptyText", "getEmptyText$ui_departures_proNon_corporateRelease", FirebaseAnalytics.Param.CONTENT, "getContent", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationHeaderInfo;", "circulationHeaderInfo", "getCirculationHeaderInfo$ui_departures_proNon_corporateRelease", "stationHeaderInfo", "getStationHeaderInfo$ui_departures_proNon_corporateRelease", "observationInfo", "getObservationInfo$ui_departures_proNon_corporateRelease", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCirculationsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CirculationsViewModel.kt\ncom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,989:1\n1#2:990\n1#2:1017\n1#2:1028\n53#3:991\n55#3:995\n53#3:996\n55#3:1000\n53#3:1001\n55#3:1005\n53#3:1006\n55#3:1010\n53#3:1011\n55#3:1015\n50#4:992\n55#4:994\n50#4:997\n55#4:999\n50#4:1002\n55#4:1004\n50#4:1007\n55#4:1009\n50#4:1012\n55#4:1014\n109#5:993\n109#5:998\n109#5:1003\n109#5:1008\n109#5:1013\n2634#6:1016\n1603#6,9:1018\n1855#6:1027\n1856#6:1029\n1612#6:1030\n1549#6:1031\n1620#6,3:1032\n*S KotlinDebug\n*F\n+ 1 CirculationsViewModel.kt\ncom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewModel\n*L\n232#1:1017\n904#1:1028\n159#1:991\n159#1:995\n164#1:996\n164#1:1000\n173#1:1001\n173#1:1005\n179#1:1006\n179#1:1010\n190#1:1011\n190#1:1015\n159#1:992\n159#1:994\n164#1:997\n164#1:999\n173#1:1002\n173#1:1004\n179#1:1007\n179#1:1009\n190#1:1012\n190#1:1014\n159#1:993\n164#1:998\n173#1:1003\n179#1:1008\n190#1:1013\n232#1:1016\n904#1:1018,9\n904#1:1027\n904#1:1029\n904#1:1030\n919#1:1031\n919#1:1032,3\n*E\n"})
/* loaded from: classes2.dex */
public final class CirculationsViewModel extends w0 implements I {
    private boolean canFetchMore;
    private final Q circulationHeaderInfo;
    private final Q content;
    private int currentPage;
    private String destinationStationCode;
    private final DynamicLinkUseCase dynamicLinkUseCase;
    private final Q emptyText;
    private final GetStationIsFavoriteUseCase fetchFavoriteStationUseCase;
    private Filter filter_all_stations;
    private Filter filter_full_data;
    private final GetCirculationUpdateTimeUseCase getCirculationUpdateTimeUseCase;
    private final GetDepartureCirculationsUseCase getDepartureCirculationsUseCase;
    private final GetFiltersUseCase getFiltersUseCase;
    private final GetLastDepartureTypeTrainIsCercaniasUseCase getLastDepartureTypeTrainIsCercaniasUseCase;
    private final GetLastDeparturesArrivalsStationToUseCase getLastDeparturesArrivalsStationToUseCase;
    private final GetLastDeparturesArrivalsStationUseCase getLastDeparturesArrivalsStationUseCase;
    private final GetStationByIdUseCase getStationByIdUseCase;
    private final GetStationsObservationsUseCase getStationsObservationsUseCase;
    private TrafficAvailability hasBothTraffic;
    private MutableStateFlow<TrafficAvailability> hasBothTrafficFlow;
    private final MutableStateFlow<StationHeaderInfo> headerInfoFlow;
    private TrainType isCercanias;
    private final MutableStateFlow<TrainType> isCercaniasFlow;
    private boolean isFetchingMore;
    private boolean isPresented;
    private Boolean isRodalies;
    private final MutableStateFlow<Boolean> isShowCorporateStopsFlow;
    private final MutableStateFlow<Boolean> isShowExpandedFlow;
    private List<StationObservation> listOfObservation;
    private final MutableStateFlow<Boolean> loadingMoreFlow;
    private final ManageLogosUseCase manageLogosUseCase;
    private final InterfaceC0266a navigation;
    private final b1.f navigationFlow;

    /* renamed from: observationActions$delegate, reason: from kotlin metadata */
    private final Lazy observationActions;
    private final Q observationInfo;
    private final MutableStateFlow<ObservationInfo> observationInfoFlow;
    private String originStationCode;
    private CirculationType pageType;
    private final RemoveFavoriteStationUseCase removeFavoriteStationUseCase;
    private final SaveFavoriteStationUseCase saveFavoriteStationUseCase;
    private final SaveFilterUseCase saveFilterUseCase;
    private final SetLastDepartureTypeTrainIsCercaniasUseCase setLastDepartureTypeTrainIsCercaniasUseCase;
    private final SetLastDeparturesArrivalsStationToUseCase setLastDeparturesArrivalsStationToUseCase;
    private final SetLastDeparturesArrivalsStationUseCase setLastDeparturesArrivalsStationUseCase;
    private final Q showContent;
    private final Q showLoading;
    private final Q showLoadingMore;
    private final Q stationHeaderInfo;
    private final d1.g stringProvider;
    private Timer timer;
    private final MutableStateFlow<CirculationsViewData> viewDataFlow;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StationAction.values().length];
            try {
                iArr[StationAction.FAV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StationAction.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StationAction.SEARCH_TO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StationAction.SWITCH_STATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StationAction.SHARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StationAction.SUBSCRIPTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StationAction.SHOW_OBSERVATIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StationAction.SHOW_FILTERS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public CirculationsViewModel(GetStationsObservationsUseCase getStationsObservationsUseCase, GetDepartureCirculationsUseCase getDepartureCirculationsUseCase, GetLastDeparturesArrivalsStationUseCase getLastDeparturesArrivalsStationUseCase, SetLastDeparturesArrivalsStationUseCase setLastDeparturesArrivalsStationUseCase, GetLastDeparturesArrivalsStationToUseCase getLastDeparturesArrivalsStationToUseCase, GetLastDepartureTypeTrainIsCercaniasUseCase getLastDepartureTypeTrainIsCercaniasUseCase, SetLastDeparturesArrivalsStationToUseCase setLastDeparturesArrivalsStationToUseCase, SetLastDepartureTypeTrainIsCercaniasUseCase setLastDepartureTypeTrainIsCercaniasUseCase, GetStationIsFavoriteUseCase fetchFavoriteStationUseCase, SaveFavoriteStationUseCase saveFavoriteStationUseCase, RemoveFavoriteStationUseCase removeFavoriteStationUseCase, GetStationByIdUseCase getStationByIdUseCase, DynamicLinkUseCase dynamicLinkUseCase, GetCirculationUpdateTimeUseCase getCirculationUpdateTimeUseCase, GetFiltersUseCase getFiltersUseCase, SaveFilterUseCase saveFilterUseCase, d1.g stringProvider, ManageLogosUseCase manageLogosUseCase) {
        Intrinsics.checkNotNullParameter(getStationsObservationsUseCase, "getStationsObservationsUseCase");
        Intrinsics.checkNotNullParameter(getDepartureCirculationsUseCase, "getDepartureCirculationsUseCase");
        Intrinsics.checkNotNullParameter(getLastDeparturesArrivalsStationUseCase, "getLastDeparturesArrivalsStationUseCase");
        Intrinsics.checkNotNullParameter(setLastDeparturesArrivalsStationUseCase, "setLastDeparturesArrivalsStationUseCase");
        Intrinsics.checkNotNullParameter(getLastDeparturesArrivalsStationToUseCase, "getLastDeparturesArrivalsStationToUseCase");
        Intrinsics.checkNotNullParameter(getLastDepartureTypeTrainIsCercaniasUseCase, "getLastDepartureTypeTrainIsCercaniasUseCase");
        Intrinsics.checkNotNullParameter(setLastDeparturesArrivalsStationToUseCase, "setLastDeparturesArrivalsStationToUseCase");
        Intrinsics.checkNotNullParameter(setLastDepartureTypeTrainIsCercaniasUseCase, "setLastDepartureTypeTrainIsCercaniasUseCase");
        Intrinsics.checkNotNullParameter(fetchFavoriteStationUseCase, "fetchFavoriteStationUseCase");
        Intrinsics.checkNotNullParameter(saveFavoriteStationUseCase, "saveFavoriteStationUseCase");
        Intrinsics.checkNotNullParameter(removeFavoriteStationUseCase, "removeFavoriteStationUseCase");
        Intrinsics.checkNotNullParameter(getStationByIdUseCase, "getStationByIdUseCase");
        Intrinsics.checkNotNullParameter(dynamicLinkUseCase, "dynamicLinkUseCase");
        Intrinsics.checkNotNullParameter(getCirculationUpdateTimeUseCase, "getCirculationUpdateTimeUseCase");
        Intrinsics.checkNotNullParameter(getFiltersUseCase, "getFiltersUseCase");
        Intrinsics.checkNotNullParameter(saveFilterUseCase, "saveFilterUseCase");
        Intrinsics.checkNotNullParameter(stringProvider, "stringProvider");
        Intrinsics.checkNotNullParameter(manageLogosUseCase, "manageLogosUseCase");
        this.getStationsObservationsUseCase = getStationsObservationsUseCase;
        this.getDepartureCirculationsUseCase = getDepartureCirculationsUseCase;
        this.getLastDeparturesArrivalsStationUseCase = getLastDeparturesArrivalsStationUseCase;
        this.setLastDeparturesArrivalsStationUseCase = setLastDeparturesArrivalsStationUseCase;
        this.getLastDeparturesArrivalsStationToUseCase = getLastDeparturesArrivalsStationToUseCase;
        this.getLastDepartureTypeTrainIsCercaniasUseCase = getLastDepartureTypeTrainIsCercaniasUseCase;
        this.setLastDeparturesArrivalsStationToUseCase = setLastDeparturesArrivalsStationToUseCase;
        this.setLastDepartureTypeTrainIsCercaniasUseCase = setLastDepartureTypeTrainIsCercaniasUseCase;
        this.fetchFavoriteStationUseCase = fetchFavoriteStationUseCase;
        this.saveFavoriteStationUseCase = saveFavoriteStationUseCase;
        this.removeFavoriteStationUseCase = removeFavoriteStationUseCase;
        this.getStationByIdUseCase = getStationByIdUseCase;
        this.dynamicLinkUseCase = dynamicLinkUseCase;
        this.getCirculationUpdateTimeUseCase = getCirculationUpdateTimeUseCase;
        this.getFiltersUseCase = getFiltersUseCase;
        this.saveFilterUseCase = saveFilterUseCase;
        this.stringProvider = stringProvider;
        this.manageLogosUseCase = manageLogosUseCase;
        Filter filter = Filter.ALL_STATIONS;
        filter.setEnable(false);
        this.filter_all_stations = filter;
        Filter filter2 = Filter.FULL_DATA;
        filter2.setEnable(false);
        this.filter_full_data = filter2;
        this.observationActions = LazyKt.lazy(new q(this));
        this.listOfObservation = CollectionsKt.emptyList();
        this.isCercanias = TrainType.CERCANIAS;
        this.hasBothTraffic = TrafficAvailability.BOTH;
        this.canFetchMore = true;
        this.hasBothTrafficFlow = StateFlowKt.MutableStateFlow(null);
        this.isShowExpandedFlow = StateFlowKt.MutableStateFlow(null);
        this.isShowCorporateStopsFlow = StateFlowKt.MutableStateFlow(null);
        this.isCercaniasFlow = StateFlowKt.MutableStateFlow(null);
        b1.f fVar = new b1.f();
        this.navigationFlow = fVar;
        MutableStateFlow<StationHeaderInfo> MutableStateFlow = StateFlowKt.MutableStateFlow(StationHeaderInfo.INSTANCE.getDefault());
        this.headerInfoFlow = MutableStateFlow;
        MutableStateFlow<ObservationInfo> MutableStateFlow2 = StateFlowKt.MutableStateFlow(ObservationInfo.INSTANCE.getDefault());
        this.observationInfoFlow = MutableStateFlow2;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.loadingMoreFlow = MutableStateFlow3;
        final MutableStateFlow<CirculationsViewData> MutableStateFlow4 = StateFlowKt.MutableStateFlow(CirculationsViewData.Loading.INSTANCE);
        this.viewDataFlow = MutableStateFlow4;
        this.navigation = fVar;
        this.showContent = q0.a(new Flow<Boolean>() { // from class: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CirculationsViewModel.kt\ncom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewModel\n*L\n1#1,222:1\n54#2:223\n159#3:224\n*E\n"})
            /* renamed from: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$1$2", f = "CirculationsViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= IntCompanionObject.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$1$2$1 r0 = (com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$1$2$1 r0 = new com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L5a
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.$this_unsafeFlow
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData r5 = (com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData) r5
                        boolean r6 = r5 instanceof com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData.Data
                        if (r6 == 0) goto L4c
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData$Data r5 = (com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData.Data) r5
                        java.util.List r5 = r5.getResults()
                        java.util.Collection r5 = (java.util.Collection) r5
                        boolean r5 = r5.isEmpty()
                        if (r5 != 0) goto L4c
                        r5 = r3
                        goto L4d
                    L4c:
                        r5 = 0
                    L4d:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L5a
                        return r1
                    L5a:
                        kotlin.Unit r4 = kotlin.Unit.INSTANCE
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, q0.j(this).f7787a, 2);
        this.showLoading = q0.a(new Flow<Boolean>() { // from class: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$2

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CirculationsViewModel.kt\ncom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewModel\n*L\n1#1,222:1\n54#2:223\n164#3:224\n*E\n"})
            /* renamed from: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$2$2", f = "CirculationsViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= IntCompanionObject.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$2$2$1 r0 = (com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$2$2$1 r0 = new com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.$this_unsafeFlow
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData r5 = (com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData) r5
                        boolean r5 = r5 instanceof com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData.Loading
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L47
                        return r1
                    L47:
                        kotlin.Unit r4 = kotlin.Unit.INSTANCE
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, q0.j(this).f7787a, 2);
        this.showLoadingMore = q0.a(MutableStateFlow3, q0.j(this).f7787a, 2);
        this.emptyText = q0.a(FlowKt.distinctUntilChanged(new Flow<EmptyCirculationsState>() { // from class: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$3

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CirculationsViewModel.kt\ncom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewModel\n*L\n1#1,222:1\n54#2:223\n173#3:224\n*E\n"})
            /* renamed from: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$3$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ CirculationsViewModel receiver$inlined;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$3$2", f = "CirculationsViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= IntCompanionObject.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, CirculationsViewModel circulationsViewModel) {
                    this.$this_unsafeFlow = flowCollector;
                    this.receiver$inlined = circulationsViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$3$2$1 r0 = (com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$3$2$1 r0 = new com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$3$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData r5 = (com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData) r5
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel r4 = r4.receiver$inlined
                        com.adif.elcanomovil.commonViews.EmptyCirculationsState r4 = com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel.access$mapToEmptyState(r4, r5)
                        r0.label = r3
                        java.lang.Object r4 = r6.emit(r4, r0)
                        if (r4 != r1) goto L47
                        return r1
                    L47:
                        kotlin.Unit r4 = kotlin.Unit.INSTANCE
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super EmptyCirculationsState> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }), q0.j(this).f7787a, 2);
        this.content = q0.a(new Flow<List<? extends Circulation>>() { // from class: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$4

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CirculationsViewModel.kt\ncom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewModel\n*L\n1#1,222:1\n54#2:223\n180#3,4:224\n*E\n"})
            /* renamed from: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$4$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$4$2", f = "CirculationsViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$4$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= IntCompanionObject.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$4$2$1 r0 = (com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$4$2$1 r0 = new com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$4$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L50
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.$this_unsafeFlow
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData r5 = (com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData) r5
                        boolean r6 = r5 instanceof com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData.Data
                        if (r6 == 0) goto L43
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData$Data r5 = (com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData.Data) r5
                        java.util.List r5 = r5.getResults()
                        goto L47
                    L43:
                        java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
                    L47:
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L50
                        return r1
                    L50:
                        kotlin.Unit r4 = kotlin.Unit.INSTANCE
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Circulation>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, q0.j(this).f7787a, 2);
        final Flow debounce = FlowKt.debounce(MutableStateFlow, 100L);
        this.circulationHeaderInfo = q0.a(FlowKt.distinctUntilChanged(new Flow<CirculationHeaderInfo>() { // from class: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$5

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CirculationsViewModel.kt\ncom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewModel\n*L\n1#1,222:1\n54#2:223\n191#3,4:224\n*E\n"})
            /* renamed from: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$5$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$5$2", f = "CirculationsViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$5$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= IntCompanionObject.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$5$2$1 r0 = (com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$5$2$1 r0 = new com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$5$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L52
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.ResultKt.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r5 = r5.$this_unsafeFlow
                        com.adif.elcanomovil.uiDepartures.main.oneway.StationHeaderInfo r6 = (com.adif.elcanomovil.uiDepartures.main.oneway.StationHeaderInfo) r6
                        com.adif.elcanomovil.uiDepartures.main.oneway.CirculationHeaderInfo r7 = new com.adif.elcanomovil.uiDepartures.main.oneway.CirculationHeaderInfo
                        com.adif.elcanomovil.domain.entities.TrainType r2 = r6.isCercanias()
                        boolean r4 = r6.isRodalies()
                        com.adif.elcanomovil.domain.entities.CirculationType r6 = r6.getCirculationType()
                        r7.<init>(r2, r4, r6)
                        r0.label = r3
                        java.lang.Object r5 = r5.emit(r7, r0)
                        if (r5 != r1) goto L52
                        return r1
                    L52:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$special$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super CirculationHeaderInfo> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }), q0.j(this).f7787a, 2);
        this.stationHeaderInfo = q0.a(MutableStateFlow, q0.j(this).f7787a, 2);
        this.observationInfo = q0.a(MutableStateFlow2, q0.j(this).f7787a, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object combine$lambda$8(Object obj, Object obj2, Object obj3, Continuation continuation) {
        return new Triple(obj, obj2, obj3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object combine$lambda$9(Object obj, Object obj2, Object obj3, Continuation continuation) {
        return new Triple(obj, obj2, obj3);
    }

    public static /* synthetic */ Object fetchCirculations$default(CirculationsViewModel circulationsViewModel, boolean z3, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = false;
        }
        return circulationsViewModel.fetchCirculations(z3, continuation);
    }

    private final AlertActions getObservationActions() {
        return (AlertActions) this.observationActions.getValue();
    }

    private final void handleDirectionSwitch() {
        String str;
        String str2 = this.originStationCode;
        if (str2 == null || (str = this.destinationStationCode) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new f(this, str, str2, null), 3, null);
    }

    private final void handleFavButtonTap() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new g(this, null), 3, null);
    }

    private final void handleFiltersButtonTap() {
        b1.f fVar = this.navigationFlow;
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        StringBuilder sb = new StringBuilder(NavArguments.RESULT_FILTERS);
        CirculationType circulationType = this.pageType;
        sb.append(circulationType != null ? Integer.valueOf(circulationType.getTabPosition()) : null);
        fVar.b(new Navigation.RootDirection(companion.toFilterListBottomSheet(sb.toString(), new Filters(CollectionsKt.listOf((Object[]) new Filter[]{this.filter_all_stations, this.filter_full_data}))), null, 2, null));
    }

    private final void handleObservationsButtonTap() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new i(this, null), 3, null);
    }

    @Z(A.ON_PAUSE)
    private final void handleOnPause() {
        this.isPresented = false;
        stopFetcher();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Z(A.ON_RESUME)
    private final void handleOnResume() {
        TrainType trainType;
        TrainType trainType2;
        this.isPresented = true;
        this.timer = new Timer();
        MutableStateFlow<TrainType> mutableStateFlow = this.isCercaniasFlow;
        CirculationRepository.TrainTypeRequest invoke = this.getLastDepartureTypeTrainIsCercaniasUseCase.invoke();
        if (invoke == null || (trainType = invoke.isCercanias()) == null) {
            trainType = TrainType.CERCANIAS;
        }
        mutableStateFlow.setValue(trainType);
        MutableStateFlow<StationHeaderInfo> mutableStateFlow2 = this.headerInfoFlow;
        StationHeaderInfo value = mutableStateFlow2.getValue();
        CirculationRepository.TrainTypeRequest invoke2 = this.getLastDepartureTypeTrainIsCercaniasUseCase.invoke();
        if (invoke2 == null || (trainType2 = invoke2.isCercanias()) == null) {
            trainType2 = TrainType.CERCANIAS;
        }
        mutableStateFlow2.setValue(StationHeaderInfo.copy$default(value, trainType2, null, false, false, null, null, null, null, null, 510, null));
        Iterator<T> it = this.getFiltersUseCase.invoke().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            int intValue = ((Number) pair.getFirst()).intValue();
            if (intValue == this.filter_full_data.getId()) {
                this.isShowExpandedFlow.setValue(pair.getSecond());
            } else if (intValue == this.filter_all_stations.getId()) {
                this.isShowCorporateStopsFlow.setValue(pair.getSecond());
            }
        }
        Timer timer = this.timer;
        if (timer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timer");
            timer = null;
        }
        timer.scheduleAtFixedRate(new TimerTask() { // from class: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel$handleOnResume$$inlined$scheduleAtFixedRate$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                BuildersKt__Builders_commonKt.launch$default(q0.j(CirculationsViewModel.this), null, null, new j(CirculationsViewModel.this, null), 3, null);
            }
        }, this.getCirculationUpdateTimeUseCase.getDelayTime(), this.getCirculationUpdateTimeUseCase.getUpdateTime());
    }

    private final void handleSearchButtonTap() {
        this.navigationFlow.b(new Navigation.RootDirection(BottomNavFragmentDirections.INSTANCE.toSelectStationFragment("STATION"), null, 2, null));
    }

    private final void handleSearchToButtonTap() {
        this.navigationFlow.b(new Navigation.RootDirection(BottomNavFragmentDirections.INSTANCE.toSelectStationFragment("STATION_TO"), null, 2, null));
    }

    private final void handleShareButtonTap() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new n(this, null), 3, null);
    }

    private final void handleSubscriptionButtonTap() {
        String str;
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        int value = TypeSubscriptionCreationView.CREATION.getValue();
        int value2 = SubscriptionType.JOURNEY.getValue();
        String str2 = this.originStationCode;
        this.navigationFlow.b(new Navigation.RootDirection(companion.toNewSubscriptionHomeFragment(value, value2, null, null, null, str2 == null ? "" : str2, (this.pageType != CirculationType.BETWEEN_STATIONS || (str = this.destinationStationCode) == null) ? "" : str, this.isCercanias == TrainType.CERCANIAS, "", ""), null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmptyCirculationsState mapToEmptyState(CirculationsViewData viewData) {
        if (Intrinsics.areEqual(viewData, CirculationsViewData.Loading.INSTANCE) || Intrinsics.areEqual(viewData, CirculationsViewData.Error.INSTANCE)) {
            return null;
        }
        if (Intrinsics.areEqual(viewData, CirculationsViewData.ErrorOriginOrDestinationStation.INSTANCE)) {
            return new EmptyCirculationsState.Custom(R.string.circulation_no_station_to_title, R.string.circulation_no_station_to_message, R.drawable.ic_no_results);
        }
        if (Intrinsics.areEqual(viewData, CirculationsViewData.ErrorOriginStation.INSTANCE)) {
            return new EmptyCirculationsState.Custom(R.string.circulation_no_station_title, R.string.circulation_no_station_message, R.drawable.ic_no_results);
        }
        if (viewData instanceof CirculationsViewData.Data) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x013d, code lost:
    
        if (r12 == null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x010e -> B:10:0x0113). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0132 -> B:17:0x0133). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mapToViewData(com.adif.elcanomovil.domain.entities.utils.AsyncResult<? extends java.util.List<? extends com.adif.elcanomovil.domain.entities.circulation.Circulation>> r12, boolean r13, kotlin.coroutines.Continuation<? super com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewData> r14) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel.mapToViewData(com.adif.elcanomovil.domain.entities.utils.AsyncResult, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object mapToViewData$default(CirculationsViewModel circulationsViewModel, AsyncResult asyncResult, boolean z3, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z3 = circulationsViewModel.filter_full_data.getEnable();
        }
        return circulationsViewModel.mapToViewData(asyncResult, z3, continuation);
    }

    private final void observeSelectedStationsChanges() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new u(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object reloadCirculations(boolean z3, boolean z4, Continuation<? super Unit> continuation) {
        if (z3) {
            this.currentPage = 0;
            this.canFetchMore = true;
            this.viewDataFlow.setValue(CirculationsViewData.Loading.INSTANCE);
        }
        Object fetchCirculations = fetchCirculations(z4, continuation);
        return fetchCirculations == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? fetchCirculations : Unit.INSTANCE;
    }

    public static /* synthetic */ Object reloadCirculations$default(CirculationsViewModel circulationsViewModel, boolean z3, boolean z4, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = true;
        }
        if ((i & 2) != 0) {
            z4 = false;
        }
        return circulationsViewModel.reloadCirculations(z3, z4, continuation);
    }

    private final void stopFetcher() {
        Timer timer = this.timer;
        if (timer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timer");
            timer = null;
        }
        timer.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010f, code lost:
    
        if (r4 != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0063, code lost:
    
        r1 = com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModelKt.getToDataType(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0080, code lost:
    
        if (r1 == r2) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateInfoHeader(kotlin.coroutines.Continuation<? super kotlin.Unit> r26) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel.updateInfoHeader(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateObservations() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getIO(), null, new w(this, null), 2, null);
    }

    public final <T1, T2, T3, T4, T5, T6, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, Flow<? extends T6> flow6, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super Continuation<? super R>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flow3, "flow3");
        Intrinsics.checkNotNullParameter(flow4, "flow4");
        Intrinsics.checkNotNullParameter(flow5, "flow5");
        Intrinsics.checkNotNullParameter(flow6, "flow6");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return FlowKt.combine(FlowKt.combine(flow, flow2, flow3, b.f4963a), FlowKt.combine(flow4, flow5, flow6, c.f4964a), new com.adif.elcanomovil.uiTrain.main.i(transform, null, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0106, code lost:
    
        if (r1 == r2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0133, code lost:
    
        if (r1 == r2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0164, code lost:
    
        if (r1 == r2) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchCirculations(boolean r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel.fetchCirculations(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getCirculationHeaderInfo$ui_departures_proNon_corporateRelease, reason: from getter */
    public final Q getCirculationHeaderInfo() {
        return this.circulationHeaderInfo;
    }

    public final Q getContent() {
        return this.content;
    }

    /* renamed from: getEmptyText$ui_departures_proNon_corporateRelease, reason: from getter */
    public final Q getEmptyText() {
        return this.emptyText;
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }

    /* renamed from: getObservationInfo$ui_departures_proNon_corporateRelease, reason: from getter */
    public final Q getObservationInfo() {
        return this.observationInfo;
    }

    public final CirculationType getPageType() {
        return this.pageType;
    }

    public final Q getShowContent() {
        return this.showContent;
    }

    public final Q getShowLoading() {
        return this.showLoading;
    }

    public final Q getShowLoadingMore() {
        return this.showLoadingMore;
    }

    /* renamed from: getStationHeaderInfo$ui_departures_proNon_corporateRelease, reason: from getter */
    public final Q getStationHeaderInfo() {
        return this.stationHeaderInfo;
    }

    public final void handleCirculationObservationTap(String observation) {
        if (observation == null) {
            return;
        }
        this.navigationFlow.b(new Navigation.RootDirection(BottomNavFragmentDirections.INSTANCE.toAlertDialog(false, true, "", observation, getObservationActions(), AlertType.WARNING), null, 2, null));
    }

    public final void handleDestinationStationSelected(String stationCode) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new e(this, stationCode, null), 3, null);
    }

    public final void handleFilterChanged(Filter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new h(filter, this, null), 3, null);
    }

    public final void handleHeaderButtonTap(StationAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        switch (WhenMappings.$EnumSwitchMapping$0[action.ordinal()]) {
            case 1:
                handleFavButtonTap();
                return;
            case 2:
                handleSearchButtonTap();
                return;
            case 3:
                handleSearchToButtonTap();
                return;
            case 4:
                handleDirectionSwitch();
                return;
            case 5:
                handleShareButtonTap();
                return;
            case 6:
                handleSubscriptionButtonTap();
                return;
            case 7:
                handleObservationsButtonTap();
                return;
            case 8:
                handleFiltersButtonTap();
                return;
            default:
                return;
        }
    }

    public final void handleOnCreate(Integer tabPosition) {
        if (tabPosition != null) {
            CirculationType circulationType = this.pageType;
            if (Intrinsics.areEqual(tabPosition, circulationType != null ? Integer.valueOf(circulationType.getTabPosition()) : null)) {
                return;
            }
        }
        this.pageType = CirculationType.INSTANCE.fromInt(tabPosition != null ? tabPosition.intValue() : 0);
        this.observationInfoFlow.setValue(new ObservationInfo(null, ObservationAlert.NOTHING));
        observeSelectedStationsChanges();
    }

    public final void handleOriginStationSelected(String stationCode) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new k(this, stationCode, null), 3, null);
    }

    public final void handleScrollToBottom() {
        if (!this.canFetchMore || this.isFetchingMore) {
            return;
        }
        this.isFetchingMore = true;
        this.loadingMoreFlow.setValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new l(this, null), 3, null);
    }

    public final void handleScrollToTop() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new m(this, null), 3, null);
    }

    public final void handleTrainTap(TrainCirculation trainCirculation) {
        Intrinsics.checkNotNullParameter(trainCirculation, "trainCirculation");
        ChildDirections.Companion companion = ChildDirections.INSTANCE;
        Uri.Builder appendQueryParameter = Uri.parse(DeeplinkRoutes.trainDetails).buildUpon().appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_FRAGMENT_FROM, NavArguments.ARG_DYNAMIC_DEPARTURES).appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, trainCirculation.getTrainCirculation().getCommercialProduct()).appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, trainCirculation.getTrainCirculation().getOperator()).appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, trainCirculation.getTrainCirculation().getCommercialNumber());
        String origin = trainCirculation.getTrainCirculation().getOrigin();
        if (origin == null) {
            origin = "";
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, origin);
        String destination = trainCirculation.getTrainCirculation().getDestination();
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, destination != null ? destination : "");
        Long launchingDate = trainCirculation.getTrainCirculation().getLaunchingDate();
        Uri build = appendQueryParameter3.appendQueryParameter(NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, String.valueOf(launchingDate != null ? launchingDate.longValue() : 0L)).appendQueryParameter("observation", trainCirculation.getTrainCirculation().getObservation()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.navigationFlow.b(new Navigation.TabDirection(new BottomNavInitialTab.MoreAdif(companion.fromRoutes(build))));
    }

    public final void handleTrainTypeChange(TrainType isCercanias) {
        Intrinsics.checkNotNullParameter(isCercanias, "isCercanias");
        this.isCercaniasFlow.setValue(isCercanias);
    }
}
