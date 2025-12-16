package com.adif.elcanomovil.uiTrain.main;

import android.net.Uri;
import androidx.lifecycle.A;
import androidx.lifecycle.I;
import androidx.lifecycle.Q;
import androidx.lifecycle.W;
import androidx.lifecycle.Z;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab;
import com.adif.elcanomovil.commonNavGraph.arguments.Filter;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.navigation.DeeplinkRoutes;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.domain.entities.circulation.CommercialPathRouteSidesInfo;
import com.adif.elcanomovil.domain.entities.compositions.Composition;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.entities.utils.Status;
import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetCompositionsUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetOnePathsUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.GetTrainIsFavoriteUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteTrainUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteTrainUseCase;
import com.adif.elcanomovil.domain.usecases.filters.GetFiltersUseCase;
import com.adif.elcanomovil.domain.usecases.filters.SaveFilterUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.domain.usecases.tabs.TabDataHolder;
import com.adif.elcanomovil.enums.SubscriptionType;
import com.adif.elcanomovil.enums.TypeSubscriptionCreationView;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.adif.elcanomovil.uiTrain.R;
import com.adif.elcanomovil.uiTrain.entities.DateHeader;
import com.adif.elcanomovil.uiTrain.entities.Step;
import com.adif.elcanomovil.uiTrain.entities.StepItems;
import com.adif.elcanomovil.uiTrain.entities.StepMapper;
import com.adif.elcanomovil.uiTrain.entities.TrainInfo;
import com.adif.elcanomovil.uiTrain.entities.TrainInfoMapper;
import com.adif.elcanomovil.uiTrain.entities.TrainInfoStation;
import com.adif.elcanomovil.uiTrain.main.TrainSituationViewData;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"Ji\u00100\u001a\u00020/2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010#2\b\u0010'\u001a\u0004\u0018\u00010#2\b\u0010(\u001a\u0004\u0018\u00010#2\b\u0010)\u001a\u0004\u0018\u00010#2\b\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010#¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020/¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020/¢\u0006\u0004\b4\u00103J\r\u00105\u001a\u00020/¢\u0006\u0004\b5\u00103J\u0015\u00107\u001a\u00020/2\u0006\u00106\u001a\u00020#¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\u00020/2\u0006\u0010.\u001a\u00020#2\u0006\u00109\u001a\u00020#¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020/¢\u0006\u0004\b<\u00103J\r\u0010=\u001a\u00020/¢\u0006\u0004\b=\u00103J\r\u0010?\u001a\u00020>¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020>¢\u0006\u0004\bA\u0010@J\u0015\u0010D\u001a\u00020/2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\u00020#2\u0006\u00106\u001a\u00020#H\u0086@¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020/H\u0003¢\u0006\u0004\bH\u00103J\u000f\u0010I\u001a\u00020/H\u0003¢\u0006\u0004\bI\u00103J+\u0010O\u001a\u00020/2\u0012\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0K0J2\u0006\u0010N\u001a\u00020,H\u0002¢\u0006\u0004\bO\u0010PJ'\u0010S\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010K2\u000e\u0010R\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010KH\u0002¢\u0006\u0004\bS\u0010TJD\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0K0J2\u0012\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0K0J2\u0012\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0K0JH\u0082@¢\u0006\u0004\bY\u0010ZJF\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0K0J2\u0012\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0K0J2\u0014\u0010X\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0K\u0018\u00010JH\u0082@¢\u0006\u0004\b[\u0010ZJ\u0010\u0010\\\u001a\u00020/H\u0082@¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020/H\u0002¢\u0006\u0004\b^\u00103R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010_R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010`R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010dR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010eR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010gR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010hR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010iR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010jR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010kR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010lR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010mR\u001c\u0010o\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u001f\u0010r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0q8\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001c\u0010v\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010pR\u001f\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0q8\u0006¢\u0006\f\n\u0004\bw\u0010s\u001a\u0004\bx\u0010uR\u001c\u0010y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010pR\u001f\u0010z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0q8\u0006¢\u0006\f\n\u0004\bz\u0010s\u001a\u0004\b{\u0010uR\u001c\u0010|\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010pR\u001f\u0010}\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0q8\u0006¢\u0006\f\n\u0004\b}\u0010s\u001a\u0004\b~\u0010uR\u001c\u0010\u007f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010pR\"\u0010\u0080\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0q8\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010s\u001a\u0005\b\u0081\u0001\u0010uR\u001e\u0010\u0082\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010pR\"\u0010\u0083\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0q8\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010s\u001a\u0005\b\u0084\u0001\u0010uR\u001e\u0010\u0085\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010pR\"\u0010\u0086\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0q8\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010s\u001a\u0005\b\u0087\u0001\u0010uR!\u0010\u008a\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0089\u00010\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020,0n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010pR \u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020,0q8\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010s\u001a\u0005\b\u008d\u0001\u0010uR\u001f\u0010\u0090\u0001\u001a\n\u0012\u0005\u0012\u00030\u008f\u00010\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R$\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u008f\u00010\u0092\u00018\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001f\u0010\u0099\u0001\u001a\n\u0012\u0005\u0012\u00030\u0098\u00010\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R$\u0010\u009c\u0001\u001a\n\u0012\u0005\u0012\u00030\u0098\u00010\u009b\u00018\u0006¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b$\u0010 \u0001R\u0019\u0010'\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010 \u0001R\u0019\u0010(\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b(\u0010 \u0001R\u0019\u0010)\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010 \u0001R\u0019\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b+\u0010¡\u0001R\u001b\u0010¢\u0001\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010 \u0001R\u001b\u0010£\u0001\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010 \u0001R\u0019\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b%\u0010 \u0001R\u0019\u0010.\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b.\u0010 \u0001R\u0019\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010 \u0001R\u001a\u0010¥\u0001\u001a\u00030¤\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010§\u0001\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0019\u0010©\u0001\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010¨\u0001R\u001c\u0010«\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0089\u00010q8F¢\u0006\u0007\u001a\u0005\bª\u0001\u0010uR'\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020Q0K*\t\u0012\u0005\u0012\u00030¬\u00010K8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010T¨\u0006±\u0001²\u0006\u000e\u0010°\u0001\u001a\u00030¯\u00018\nX\u008a\u0084\u0002"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/main/TrainSituationViewModel;", "Landroidx/lifecycle/w0;", "Landroidx/lifecycle/I;", "Ld1/g;", "stringProvider", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "preferenceStorage", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "getStationByIdUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetOnePathsUseCase;", "getOnePathsUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetCompositionsUseCase;", "getCompositionsUseCase", "Lcom/adif/elcanomovil/uiTrain/entities/TrainInfoMapper;", "trainInfoMapper", "Lcom/adif/elcanomovil/uiTrain/entities/StepMapper;", "stepMapper", "Ljava/text/DateFormat;", "formatter", "Lcom/adif/elcanomovil/domain/usecases/favorites/RemoveFavoriteTrainUseCase;", "removeFavoriteTrainUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/GetTrainIsFavoriteUseCase;", "getTrainIsFavoriteUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/SaveFavoriteTrainUseCase;", "saveFavoriteTrainUseCase", "Lcom/adif/elcanomovil/domain/usecases/DynamicLinkUseCase;", "dynamicLinkUseCase", "Lcom/adif/elcanomovil/domain/usecases/filters/GetFiltersUseCase;", "getFiltersUseCase", "Lcom/adif/elcanomovil/domain/usecases/filters/SaveFilterUseCase;", "saveFilterUseCase", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;", "tabDataHolder", "<init>", "(Ld1/g;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/GetOnePathsUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/GetCompositionsUseCase;Lcom/adif/elcanomovil/uiTrain/entities/TrainInfoMapper;Lcom/adif/elcanomovil/uiTrain/entities/StepMapper;Ljava/text/DateFormat;Lcom/adif/elcanomovil/domain/usecases/favorites/RemoveFavoriteTrainUseCase;Lcom/adif/elcanomovil/domain/usecases/favorites/GetTrainIsFavoriteUseCase;Lcom/adif/elcanomovil/domain/usecases/favorites/SaveFavoriteTrainUseCase;Lcom/adif/elcanomovil/domain/usecases/DynamicLinkUseCase;Lcom/adif/elcanomovil/domain/usecases/filters/GetFiltersUseCase;Lcom/adif/elcanomovil/domain/usecases/filters/SaveFilterUseCase;Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;)V", "", NavArguments.ARG_DYNAMIC_LINKS_FRAGMENT_FROM, NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "", NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "", "fromSearchTrain", "observation", "", "onViewsLoaded", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;)V", "handleFavouriteButtonTapped", "()V", "handleCorporationOptionsTapped", "handleBackButtonTapped", "stationCode", "handleStepTapped", "(Ljava/lang/String;)V", "title", "handleCirculationObservationTap", "(Ljava/lang/String;Ljava/lang/String;)V", "handleNewSubscriptionButtonTapped", "handleSearchTapped", "Lkotlinx/coroutines/Job;", "handleShareButtonTapped", "()Lkotlinx/coroutines/Job;", "handleObservationsButtonTapped", "Lcom/adif/elcanomovil/commonNavGraph/arguments/Filter;", "filter", "handleFilterChanged", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/Filter;)V", "getStationNameOrStationCode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleOnResume", "handleOnPause", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/uiTrain/entities/TrainInfo;", "trainInfoList", "isRefreshing", "mapToViewData", "(Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;Z)V", "Lcom/adif/elcanomovil/uiTrain/entities/StepItems;", "list", "dropTheDateHeaderOfTodayFromTheList", "(Ljava/util/List;)Ljava/util/List;", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathRouteSidesInfo;", "commercialPathStepListSideInfo", "Lcom/adif/elcanomovil/domain/entities/compositions/Composition;", "compositions", "mapToTrainInfo", "(Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergeData", "fetchPath", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopFetcher", "Ld1/g;", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetOnePathsUseCase;", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetCompositionsUseCase;", "Lcom/adif/elcanomovil/uiTrain/entities/TrainInfoMapper;", "Lcom/adif/elcanomovil/uiTrain/entities/StepMapper;", "Ljava/text/DateFormat;", "Lcom/adif/elcanomovil/domain/usecases/favorites/RemoveFavoriteTrainUseCase;", "Lcom/adif/elcanomovil/domain/usecases/favorites/GetTrainIsFavoriteUseCase;", "Lcom/adif/elcanomovil/domain/usecases/favorites/SaveFavoriteTrainUseCase;", "Lcom/adif/elcanomovil/domain/usecases/DynamicLinkUseCase;", "Lcom/adif/elcanomovil/domain/usecases/filters/GetFiltersUseCase;", "Lcom/adif/elcanomovil/domain/usecases/filters/SaveFilterUseCase;", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_snackBarInfo", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/lifecycle/Q;", "snackBarInfo", "Landroidx/lifecycle/Q;", "getSnackBarInfo", "()Landroidx/lifecycle/Q;", "_trainOperator", "trainOperator", "getTrainOperator", "_trainCommercialProduct", "trainCommercialProduct", "getTrainCommercialProduct", "_trainCommercialNumber", "trainCommercialNumber", "getTrainCommercialNumber", "_stationFromName", "stationFromName", "getStationFromName", "_stationToName", "stationToName", "getStationToName", "_shareLink", "shareLink", "getShareLink", "Landroidx/lifecycle/W;", "Lcom/adif/elcanomovil/uiTrain/main/TrainSituationViewData;", "_viewData", "Landroidx/lifecycle/W;", "_isFavourite", "isFavourite", "Lb1/f;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "navigationFlow", "Lb1/f;", "Lb1/a;", "navigation", "Lb1/a;", "getNavigation", "()Lb1/a;", "Lkotlinx/coroutines/channels/Channel;", "Landroid/net/Uri;", "_deepLinkNavigation", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "deepLinkNavigation", "Lkotlinx/coroutines/flow/Flow;", "getDeepLinkNavigation", "()Lkotlinx/coroutines/flow/Flow;", "Ljava/lang/String;", "Ljava/lang/Long;", "timeStationFrom", "timeStationTo", "Ljava/util/Timer;", "timer", "Ljava/util/Timer;", "filter_all_stations", "Lcom/adif/elcanomovil/commonNavGraph/arguments/Filter;", "filter_full_data", "getViewData", "viewData", "Lcom/adif/elcanomovil/uiTrain/entities/Step;", "getGrouped", "grouped", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "observationActions", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrainSituationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainSituationViewModel.kt\ncom/adif/elcanomovil/uiTrain/main/TrainSituationViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,565:1\n1#2:566\n1#2:568\n2634#3:567\n1477#3:569\n1502#3,3:570\n1505#3,3:580\n2661#3,7:587\n1549#3:594\n1620#3,2:595\n1549#3:597\n1620#3,3:598\n1622#3:601\n372#4,7:573\n125#5:583\n152#5,3:584\n*S KotlinDebug\n*F\n+ 1 TrainSituationViewModel.kt\ncom/adif/elcanomovil/uiTrain/main/TrainSituationViewModel\n*L\n130#1:568\n130#1:567\n276#1:569\n276#1:570,3\n276#1:580,3\n282#1:587,7\n331#1:594\n331#1:595,2\n340#1:597\n340#1:598,3\n331#1:601\n276#1:573,7\n277#1:583\n277#1:584,3\n*E\n"})
/* loaded from: classes3.dex */
public final class TrainSituationViewModel extends w0 implements I {
    private final Channel<Uri> _deepLinkNavigation;
    private final MutableStateFlow<Boolean> _isFavourite;
    private final MutableStateFlow<String> _shareLink;
    private final MutableStateFlow<String> _snackBarInfo;
    private final MutableStateFlow<String> _stationFromName;
    private final MutableStateFlow<String> _stationToName;
    private final MutableStateFlow<String> _trainCommercialNumber;
    private final MutableStateFlow<String> _trainCommercialProduct;
    private final MutableStateFlow<String> _trainOperator;
    private final W _viewData;
    private String commercialNumber;
    private String commercialProduct;
    private final Flow<Uri> deepLinkNavigation;
    private String destinationStationCode;
    private final DynamicLinkUseCase dynamicLinkUseCase;
    private Filter filter_all_stations;
    private Filter filter_full_data;
    private final DateFormat formatter;
    private String fragmentFrom;
    private final GetCompositionsUseCase getCompositionsUseCase;
    private final GetFiltersUseCase getFiltersUseCase;
    private final GetOnePathsUseCase getOnePathsUseCase;
    private final GetStationByIdUseCase getStationByIdUseCase;
    private final GetTrainIsFavoriteUseCase getTrainIsFavoriteUseCase;
    private final Q isFavourite;
    private Long launchingDate;
    private final InterfaceC0266a navigation;
    private final b1.f navigationFlow;
    private String observation;
    private String operator;
    private String originStationCode;
    private final PreferenceStorage preferenceStorage;
    private final RemoveFavoriteTrainUseCase removeFavoriteTrainUseCase;
    private final SaveFavoriteTrainUseCase saveFavoriteTrainUseCase;
    private final SaveFilterUseCase saveFilterUseCase;
    private final Q shareLink;
    private final Q snackBarInfo;
    private final Q stationFromName;
    private final Q stationToName;
    private final StepMapper stepMapper;
    private final d1.g stringProvider;
    private final TabDataHolder tabDataHolder;
    private String timeStationFrom;
    private String timeStationTo;
    private Timer timer;
    private final Q trainCommercialNumber;
    private final Q trainCommercialProduct;
    private final TrainInfoMapper trainInfoMapper;
    private final Q trainOperator;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public TrainSituationViewModel(d1.g stringProvider, PreferenceStorage preferenceStorage, GetStationByIdUseCase getStationByIdUseCase, GetOnePathsUseCase getOnePathsUseCase, GetCompositionsUseCase getCompositionsUseCase, TrainInfoMapper trainInfoMapper, StepMapper stepMapper, DateFormat formatter, RemoveFavoriteTrainUseCase removeFavoriteTrainUseCase, GetTrainIsFavoriteUseCase getTrainIsFavoriteUseCase, SaveFavoriteTrainUseCase saveFavoriteTrainUseCase, DynamicLinkUseCase dynamicLinkUseCase, GetFiltersUseCase getFiltersUseCase, SaveFilterUseCase saveFilterUseCase, TabDataHolder tabDataHolder) {
        Intrinsics.checkNotNullParameter(stringProvider, "stringProvider");
        Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
        Intrinsics.checkNotNullParameter(getStationByIdUseCase, "getStationByIdUseCase");
        Intrinsics.checkNotNullParameter(getOnePathsUseCase, "getOnePathsUseCase");
        Intrinsics.checkNotNullParameter(getCompositionsUseCase, "getCompositionsUseCase");
        Intrinsics.checkNotNullParameter(trainInfoMapper, "trainInfoMapper");
        Intrinsics.checkNotNullParameter(stepMapper, "stepMapper");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(removeFavoriteTrainUseCase, "removeFavoriteTrainUseCase");
        Intrinsics.checkNotNullParameter(getTrainIsFavoriteUseCase, "getTrainIsFavoriteUseCase");
        Intrinsics.checkNotNullParameter(saveFavoriteTrainUseCase, "saveFavoriteTrainUseCase");
        Intrinsics.checkNotNullParameter(dynamicLinkUseCase, "dynamicLinkUseCase");
        Intrinsics.checkNotNullParameter(getFiltersUseCase, "getFiltersUseCase");
        Intrinsics.checkNotNullParameter(saveFilterUseCase, "saveFilterUseCase");
        Intrinsics.checkNotNullParameter(tabDataHolder, "tabDataHolder");
        this.stringProvider = stringProvider;
        this.preferenceStorage = preferenceStorage;
        this.getStationByIdUseCase = getStationByIdUseCase;
        this.getOnePathsUseCase = getOnePathsUseCase;
        this.getCompositionsUseCase = getCompositionsUseCase;
        this.trainInfoMapper = trainInfoMapper;
        this.stepMapper = stepMapper;
        this.formatter = formatter;
        this.removeFavoriteTrainUseCase = removeFavoriteTrainUseCase;
        this.getTrainIsFavoriteUseCase = getTrainIsFavoriteUseCase;
        this.saveFavoriteTrainUseCase = saveFavoriteTrainUseCase;
        this.dynamicLinkUseCase = dynamicLinkUseCase;
        this.getFiltersUseCase = getFiltersUseCase;
        this.saveFilterUseCase = saveFilterUseCase;
        this.tabDataHolder = tabDataHolder;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._snackBarInfo = MutableStateFlow;
        this.snackBarInfo = q0.a(MutableStateFlow, null, 3);
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._trainOperator = MutableStateFlow2;
        this.trainOperator = q0.a(MutableStateFlow2, null, 3);
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this._trainCommercialProduct = MutableStateFlow3;
        this.trainCommercialProduct = q0.a(MutableStateFlow3, null, 3);
        MutableStateFlow<String> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this._trainCommercialNumber = MutableStateFlow4;
        this.trainCommercialNumber = q0.a(MutableStateFlow4, null, 3);
        MutableStateFlow<String> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this._stationFromName = MutableStateFlow5;
        this.stationFromName = q0.a(MutableStateFlow5, null, 3);
        MutableStateFlow<String> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this._stationToName = MutableStateFlow6;
        this.stationToName = q0.a(MutableStateFlow6, null, 3);
        MutableStateFlow<String> MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this._shareLink = MutableStateFlow7;
        this.shareLink = q0.a(MutableStateFlow7, null, 3);
        this._viewData = new W();
        this._isFavourite = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.isFavourite = q0.k(EmptyCoroutineContext.INSTANCE, new s(this, null));
        b1.f fVar = new b1.f();
        this.navigationFlow = fVar;
        this.navigation = fVar;
        Channel<Uri> Channel$default = ChannelKt.Channel$default(1, BufferOverflow.DROP_OLDEST, null, 4, null);
        this._deepLinkNavigation = Channel$default;
        this.deepLinkNavigation = FlowKt.receiveAsFlow(Channel$default);
        Filter filter = Filter.ALL_STOPS;
        filter.setEnable(false);
        this.filter_all_stations = filter;
        Filter filter2 = Filter.FULL_DATA;
        filter2.setEnable(false);
        this.filter_full_data = filter2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<StepItems> dropTheDateHeaderOfTodayFromTheList(List<? extends StepItems> list) {
        if (list != 0) {
            return list.get(0) instanceof DateHeader ? CollectionsKt.minus(list, list.get(0)) : list;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchPath(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.fetchPath(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final List<StepItems> getGrouped(List<Step> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String format = this.formatter.format(((Step) obj).getDate());
            Object obj2 = linkedHashMap.get(format);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(format, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM", Locale.getDefault());
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            String format2 = simpleDateFormat.format(((Step) ((List) entry.getValue()).get(0)).getDate());
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            arrayList.add(CollectionsKt.plus((Collection) CollectionsKt.listOf(new DateHeader((String) key, format2)), (Iterable) entry.getValue()));
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = CollectionsKt.plus((Collection) next, (Iterable) it.next());
        }
        return (List) next;
    }

    private static final AlertActions handleCirculationObservationTap$lambda$14(Lazy<AlertActions> lazy) {
        return lazy.getValue();
    }

    @Z(A.ON_PAUSE)
    private final void handleOnPause() {
        stopFetcher();
    }

    @Z(A.ON_RESUME)
    private final void handleOnResume() {
        Iterator<T> it = this.getFiltersUseCase.invoke().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            int intValue = ((Number) pair.getFirst()).intValue();
            if (intValue == this.filter_full_data.getId()) {
                this.filter_full_data.setEnable(((Boolean) pair.getSecond()).booleanValue());
            } else if (intValue == this.filter_all_stations.getId()) {
                this.filter_all_stations.setEnable(((Boolean) pair.getSecond()).booleanValue());
            }
        }
        Timer timer = new Timer();
        this.timer = timer;
        timer.scheduleAtFixedRate(new TimerTask() { // from class: com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel$handleOnResume$$inlined$scheduleAtFixedRate$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                BuildersKt__Builders_commonKt.launch$default(q0.j(TrainSituationViewModel.this), null, null, new q(TrainSituationViewModel.this, null), 3, null);
            }
        }, this.getOnePathsUseCase.getDelayTime(), this.getOnePathsUseCase.getUpdateTime());
    }

    public final Object mapToTrainInfo(AsyncResult<? extends List<CommercialPathRouteSidesInfo>> asyncResult, AsyncResult<? extends List<Composition>> asyncResult2, Continuation<? super AsyncResult<? extends List<TrainInfo>>> continuation) {
        Status status = asyncResult.getStatus();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[status.ordinal()];
        if (i == 1) {
            return new AsyncResult(Status.ERROR, null, asyncResult.getThrowable());
        }
        if (i == 2) {
            return new AsyncResult(Status.LOADING, null, null);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i4 = iArr[asyncResult2.getStatus().ordinal()];
        if (i4 == 1) {
            return mergeData(asyncResult, null, continuation);
        }
        if (i4 == 2) {
            return new AsyncResult(Status.LOADING, null, null);
        }
        if (i4 == 3) {
            return mergeData(asyncResult, asyncResult2, continuation);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void mapToViewData(AsyncResult<? extends List<TrainInfo>> trainInfoList, boolean isRefreshing) {
        Object obj;
        TrainInfo trainInfo;
        TrainInfo trainInfo2;
        TrainInfo trainInfo3;
        TrainInfoStation destinationStation;
        TrainInfo trainInfo4;
        TrainInfoStation originStation;
        TrainInfo trainInfo5;
        TrainInfo trainInfo6;
        String str = null;
        if (!isRefreshing) {
            W w3 = this._viewData;
            int i = WhenMappings.$EnumSwitchMapping$0[trainInfoList.getStatus().ordinal()];
            if (i == 1) {
                obj = TrainSituationViewData.Error.INSTANCE;
            } else if (i == 2) {
                obj = TrainSituationViewData.Loading.INSTANCE;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                List<TrainInfo> data = trainInfoList.getData();
                List<StepItems> dropTheDateHeaderOfTodayFromTheList = dropTheDateHeaderOfTodayFromTheList((data == null || (trainInfo2 = data.get(0)) == null) ? null : trainInfo2.getSteps());
                if (dropTheDateHeaderOfTodayFromTheList != null) {
                    List<TrainInfo> data2 = trainInfoList.getData();
                    TrainInfo trainInfo7 = data2 != null ? data2.get(0) : null;
                    if (trainInfo7 != null) {
                        trainInfo7.setSteps(dropTheDateHeaderOfTodayFromTheList);
                    }
                }
                List<TrainInfo> data3 = trainInfoList.getData();
                if (data3 != null && (trainInfo = data3.get(0)) != null) {
                    str = trainInfo.getObservations();
                }
                this.observation = str;
                obj = new TrainSituationViewData.Data(trainInfoList.getData());
            }
            w3.j(obj);
            return;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[trainInfoList.getStatus().ordinal()];
        if (i4 == 1) {
            this._viewData.j(TrainSituationViewData.Error.INSTANCE);
            return;
        }
        if (i4 != 3) {
            return;
        }
        List<TrainInfo> data4 = trainInfoList.getData();
        List<StepItems> dropTheDateHeaderOfTodayFromTheList2 = dropTheDateHeaderOfTodayFromTheList((data4 == null || (trainInfo6 = data4.get(0)) == null) ? null : trainInfo6.getSteps());
        if (dropTheDateHeaderOfTodayFromTheList2 != null) {
            List<TrainInfo> data5 = trainInfoList.getData();
            TrainInfo trainInfo8 = data5 != null ? data5.get(0) : null;
            if (trainInfo8 != null) {
                trainInfo8.setSteps(dropTheDateHeaderOfTodayFromTheList2);
            }
        }
        List<TrainInfo> data6 = trainInfoList.getData();
        this.observation = (data6 == null || (trainInfo5 = data6.get(0)) == null) ? null : trainInfo5.getObservations();
        List<TrainInfo> data7 = trainInfoList.getData();
        this.timeStationFrom = (data7 == null || (trainInfo4 = data7.get(0)) == null || (originStation = trainInfo4.getOriginStation()) == null) ? null : originStation.getTime();
        List<TrainInfo> data8 = trainInfoList.getData();
        if (data8 != null && (trainInfo3 = data8.get(0)) != null && (destinationStation = trainInfo3.getDestinationStation()) != null) {
            str = destinationStation.getTime();
        }
        this.timeStationTo = str;
        this._viewData.j(new TrainSituationViewData.Data(trainInfoList.getData()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b4, code lost:
    
        r0 = (com.adif.elcanomovil.uiTrain.entities.Step) r11;
        r21 = r7;
        r7 = r1.getStationByIdUseCase;
        r22 = r8;
        r8 = r0.getStation();
        r2.f5443a = r1;
        r2.f5444b = r15;
        r17 = r11;
        r2.f5445c = r20;
        r2.f5446d = r21;
        r2.f5447e = r22;
        r2.f5448f = r6;
        r2.f5449g = r9;
        r2.h = r14;
        r2.i = r13;
        r2.f5450j = r4;
        r11 = r12;
        r2.f5451k = r11;
        r2.f5452l = r10;
        r18 = r10;
        r2.f5453m = (com.adif.elcanomovil.uiTrain.entities.Step) r17;
        r2.f5454n = r11;
        r2.f5455o = r0;
        r2.p = r5;
        r2.f5458s = 1;
        r7 = r7.invoke(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01ff, code lost:
    
        if (r7 != r3) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0203, code lost:
    
        r8 = r21;
        r19 = r9;
        r11 = r12;
        r16 = r14;
        r9 = r22;
        r14 = r13;
        r13 = r4;
        r4 = r0;
        r0 = r1;
        r1 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0244, code lost:
    
        r20 = r0;
        r21 = r7;
        r22 = r8;
        r12 = (java.util.List) r12;
        r4.setSteps(r13);
        r0 = r9.getOriginStation();
        r4 = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) r9.getSteps());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x025d, code lost:
    
        if ((r4 instanceof com.adif.elcanomovil.uiTrain.entities.Step) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x025f, code lost:
    
        r4 = (com.adif.elcanomovil.uiTrain.entities.Step) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0263, code lost:
    
        if (r4 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0265, code lost:
    
        r4 = r4.getStation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0269, code lost:
    
        if (r4 != null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0273, code lost:
    
        r0.setStationCode(r4);
        r0 = r9.getDestinationStation();
        r4 = kotlin.collections.CollectionsKt.lastOrNull((java.util.List<? extends java.lang.Object>) r9.getSteps());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0284, code lost:
    
        if ((r4 instanceof com.adif.elcanomovil.uiTrain.entities.Step) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0286, code lost:
    
        r4 = (com.adif.elcanomovil.uiTrain.entities.Step) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x028a, code lost:
    
        if (r4 == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x028c, code lost:
    
        r4 = r4.getStation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0290, code lost:
    
        if (r4 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x029a, code lost:
    
        r0.setStationCode(r4);
        r4 = r9.getOriginStation();
        r0 = r9.getOriginStation().getStationCode();
        r2.f5443a = r1;
        r2.f5444b = r15;
        r2.f5445c = r20;
        r2.f5446d = r21;
        r2.f5447e = r22;
        r2.f5448f = r6;
        r2.f5449g = r9;
        r2.h = r14;
        r2.i = r4;
        r2.f5450j = r5;
        r2.f5451k = null;
        r2.f5452l = null;
        r2.f5453m = null;
        r2.f5454n = null;
        r2.f5455o = null;
        r2.p = null;
        r2.f5458s = 2;
        r0 = r1.getStationNameOrStationCode(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02dd, code lost:
    
        if (r0 != r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02e0, code lost:
    
        r10 = r1;
        r1 = r0;
        r0 = r5;
        r5 = r10;
        r13 = r20;
        r12 = r21;
        r11 = r22;
        r10 = r9;
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0292, code lost:
    
        r4 = r9.getDestinationStation().getStationCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0289, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x026b, code lost:
    
        r4 = r9.getOriginStation().getStationCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0262, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0244 A[EDGE_INSN: B:43:0x0244->B:44:0x0244 BREAK  A[LOOP:0: B:24:0x01a2->B:29:0x01a2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0325 -> B:12:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mergeData(com.adif.elcanomovil.domain.entities.utils.AsyncResult<? extends java.util.List<com.adif.elcanomovil.domain.entities.circulation.CommercialPathRouteSidesInfo>> r21, com.adif.elcanomovil.domain.entities.utils.AsyncResult<? extends java.util.List<com.adif.elcanomovil.domain.entities.compositions.Composition>> r22, kotlin.coroutines.Continuation<? super com.adif.elcanomovil.domain.entities.utils.AsyncResult<? extends java.util.List<com.adif.elcanomovil.uiTrain.entities.TrainInfo>>> r23) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.mergeData(com.adif.elcanomovil.domain.entities.utils.AsyncResult, com.adif.elcanomovil.domain.entities.utils.AsyncResult, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void stopFetcher() {
        Timer timer = this.timer;
        if (timer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timer");
            timer = null;
        }
        timer.cancel();
    }

    public final Flow<Uri> getDeepLinkNavigation() {
        return this.deepLinkNavigation;
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }

    public final Q getShareLink() {
        return this.shareLink;
    }

    public final Q getSnackBarInfo() {
        return this.snackBarInfo;
    }

    public final Q getStationFromName() {
        return this.stationFromName;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getStationNameOrStationCode(java.lang.String r5, kotlin.coroutines.Continuation<? super java.lang.String> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.adif.elcanomovil.uiTrain.main.k
            if (r0 == 0) goto L13
            r0 = r6
            com.adif.elcanomovil.uiTrain.main.k r0 = (com.adif.elcanomovil.uiTrain.main.k) r0
            int r1 = r0.f5426d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5426d = r1
            goto L18
        L13:
            com.adif.elcanomovil.uiTrain.main.k r0 = new com.adif.elcanomovil.uiTrain.main.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f5424b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5426d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.f5423a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase r4 = r4.getStationByIdUseCase
            r0.f5423a = r5
            r0.f5426d = r3
            java.lang.Object r6 = r4.invoke(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            com.adif.elcanomovil.domain.entities.station.Station r6 = (com.adif.elcanomovil.domain.entities.station.Station) r6
            if (r6 == 0) goto L4c
            java.lang.String r4 = r6.getShortName()
            goto L4d
        L4c:
            r4 = 0
        L4d:
            if (r4 == 0) goto L57
            int r6 = r4.length()
            if (r6 != 0) goto L56
            goto L57
        L56:
            return r4
        L57:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel.getStationNameOrStationCode(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Q getStationToName() {
        return this.stationToName;
    }

    public final Q getTrainCommercialNumber() {
        return this.trainCommercialNumber;
    }

    public final Q getTrainCommercialProduct() {
        return this.trainCommercialProduct;
    }

    public final Q getTrainOperator() {
        return this.trainOperator;
    }

    public final Q getViewData() {
        return this._viewData;
    }

    public final void handleBackButtonTapped() {
        if (Intrinsics.areEqual(this.fragmentFrom, NavArguments.ARG_DYNAMIC_DEPARTURES)) {
            this.navigationFlow.b(new Navigation.TabDirection(new BottomNavInitialTab.Departures(null, 1, null)));
        } else {
            this.navigationFlow.b(Navigation.Back.INSTANCE);
        }
    }

    public final void handleCirculationObservationTap(String observation, String title) {
        Intrinsics.checkNotNullParameter(observation, "observation");
        Intrinsics.checkNotNullParameter(title, "title");
        this.navigationFlow.b(new Navigation.RootDirection(BottomNavFragmentDirections.INSTANCE.toAlertDialog(false, true, "", observation, handleCirculationObservationTap$lambda$14(LazyKt.lazy(new l(title))), AlertType.WARNING), null, 2, null));
    }

    public final void handleCorporationOptionsTapped() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new m(this, null), 3, null);
    }

    public final void handleFavouriteButtonTapped() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new n(this, null), 3, null);
    }

    public final void handleFilterChanged(Filter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new o(filter, this, null), 3, null);
    }

    public final void handleNewSubscriptionButtonTapped() {
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        int value = TypeSubscriptionCreationView.CREATION.getValue();
        int value2 = SubscriptionType.TRAIN.getValue();
        String str = this.commercialNumber;
        Long l4 = this.launchingDate;
        String l5 = l4 != null ? l4.toString() : null;
        String str2 = this.originStationCode;
        String str3 = this.destinationStationCode;
        String str4 = this.operator;
        Intrinsics.checkNotNull(str4);
        Object d4 = this.trainCommercialProduct.d();
        Intrinsics.checkNotNull(d4);
        this.navigationFlow.b(new Navigation.RootDirection(companion.toNewSubscriptionHomeFragment(value, value2, null, str, l5, str2, str3, false, str4, (String) d4), null, 2, null));
    }

    public final Job handleObservationsButtonTapped() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new p(this, null), 3, null);
        return launch$default;
    }

    public final void handleSearchTapped() {
        this.navigationFlow.b(new Navigation.RootDirection(BottomNavFragmentDirections.INSTANCE.toSelectTrainFragment(NavArguments.RESULT_TRAIN, null), null, 2, null));
    }

    public final Job handleShareButtonTapped() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getIO(), null, new r(this, null), 2, null);
        return launch$default;
    }

    public final void handleStepTapped(String stationCode) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        this.tabDataHolder.push(new TabDataHolder.TabData.Departures(stationCode, null, CirculationType.DEPARTURE, TrainType.CERCANIAS));
        this.navigationFlow.b(new Navigation.TabDirection(new BottomNavInitialTab.Departures(null, 1, null)));
    }

    /* renamed from: isFavourite, reason: from getter */
    public final Q getIsFavourite() {
        return this.isFavourite;
    }

    public final void onViewsLoaded(String r10, String r11, String r12, String r13, String r14, String r15, Long r16, boolean fromSearchTrain, String observation) {
        this.fragmentFrom = r10;
        String str = null;
        this._snackBarInfo.setValue(null);
        this._trainCommercialNumber.setValue(null);
        this._stationFromName.setValue(null);
        this._stationToName.setValue(null);
        this._isFavourite.setValue(Boolean.FALSE);
        this._trainCommercialProduct.setValue(null);
        this._trainOperator.setValue(null);
        this._shareLink.setValue(null);
        this._viewData.j(null);
        MutableStateFlow<String> mutableStateFlow = this._snackBarInfo;
        if (fromSearchTrain && !this.preferenceStorage.isSearchWarningMsgShowed()) {
            this.preferenceStorage.setSearchWarningMsgShowed(true);
            str = ((d1.h) this.stringProvider).a(R.string.snackbar_warning);
        }
        mutableStateFlow.setValue(str);
        if (r13 == null || StringsKt.isBlank(r13) || r14 == null || StringsKt.isBlank(r14) || r15 == null || StringsKt.isBlank(r15) || r16 == null || r16.longValue() <= 0) {
            if (r13 == null || r13.length() == 0) {
                return;
            }
            this._deepLinkNavigation.mo1630trySendJP2dKIU(DeeplinkRoutes.INSTANCE.getSelectTrainLink(r13));
            return;
        }
        this.commercialNumber = r13;
        this.originStationCode = r14;
        this.destinationStationCode = r15;
        this.launchingDate = r16;
        this.operator = r11;
        this.commercialProduct = r12;
        this.observation = observation;
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new u(this, r13, r12, r11, r14, r15, r16, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new v(this, r13, r14, r15, null), 3, null);
    }
}
