package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.domain.entities.subscription.SubscriptionType;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.adif.elcanomovil.serviceNetworking.subscriptions.SubscriptionsService;
import com.adif.elcanomovil.serviceStorage.database.SubscriptionsAuxDataDao;
import com.adif.elcanomovil.serviceStorage.database.SubscriptionsDao;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import d1.InterfaceC0307a;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Singleton
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016Jq\u0010!\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010 \u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010#JA\u0010$\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'J+\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140)0(2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010+J_\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020)0(2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010,\u001a\u0004\u0018\u00010\u00172\b\u0010-\u001a\u0004\u0018\u00010\u00172\b\u0010.\u001a\u0004\u0018\u00010\u00172\b\u0010/\u001a\u0004\u0018\u00010\u00172\b\u00100\u001a\u0004\u0018\u00010\u00172\u0006\u00101\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u00104J\u008d\u0001\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020)0(2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u00172\u0006\u00105\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010 \u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b6\u00107J*\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0010080)0(2\u0006\u00101\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b9\u0010:J#\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020)0(2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b;\u0010<J\u0097\u0001\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020)0(2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u00172\u0006\u0010>\u001a\u00020=2\b\u0010?\u001a\u0004\u0018\u00010\u00172\u0006\u00105\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010 \u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010GR\u0014\u0010H\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010M\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010L¨\u0006P"}, d2 = {"Lcom/adif/elcanomovil/repositories/subscriptions/DefaultSubscriptionsRepository;", "Lcom/adif/elcanomovil/domain/repositories/subscriptions/SubscriptionRepository;", "Lcom/adif/elcanomovil/serviceNetworking/subscriptions/SubscriptionsService;", "subscriptionsService", "Lcom/adif/elcanomovil/repositories/subscriptions/SubscriptionMapper;", "subscriptionMapper", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "preferenceStorage", "Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsDao;", "subscriptionsDao", "Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsAuxDataDao;", "subscriptionsAuxDataDao", "Ld1/a;", "appDispatcher", "<init>", "(Lcom/adif/elcanomovil/serviceNetworking/subscriptions/SubscriptionsService;Lcom/adif/elcanomovil/repositories/subscriptions/SubscriptionMapper;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsDao;Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsAuxDataDao;Ld1/a;)V", "Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;", "subscription", "", "isUnRegister", "", "handleDeleteSubscription", "(Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;Z)V", "", "stationId", "destId", "start", "center", "end", "repeats", "subscription_type", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "handleModifySubscription", "(Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;)V", "createMuteUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "createUrl", "(Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;)Ljava/lang/String;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "delete", "(Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;Z)Lkotlinx/coroutines/flow/Flow;", "destinationId", "msgStart", "msgEnd", "repeat", "trainId", "shouldFetch", "", "mute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lkotlinx/coroutines/flow/Flow;", "msisdn", "modify", "(Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "", RemoteConfigComponent.FETCH_FILE_NAME, "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "(Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;)Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/subscription/SubscriptionType;", "typeSubscription", "day", "create", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/subscription/SubscriptionType;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/serviceNetworking/subscriptions/SubscriptionsService;", "Lcom/adif/elcanomovil/repositories/subscriptions/SubscriptionMapper;", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsDao;", "Lcom/adif/elcanomovil/serviceStorage/database/SubscriptionsAuxDataDao;", "Ld1/a;", "header", "Ljava/lang/String;", "headerAuth", "getPushId", "()Ljava/lang/String;", "pushId", "getDeviceId", "deviceId", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultSubscriptionsRepository implements SubscriptionRepository {
    private final InterfaceC0307a appDispatcher;
    private final String header;
    private final String headerAuth;
    private final PreferenceStorage preferenceStorage;
    private final SubscriptionMapper subscriptionMapper;
    private final SubscriptionsAuxDataDao subscriptionsAuxDataDao;
    private final SubscriptionsDao subscriptionsDao;
    private final SubscriptionsService subscriptionsService;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionType.values().length];
            try {
                iArr[SubscriptionType.TRAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionType.JOURNEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public DefaultSubscriptionsRepository(SubscriptionsService subscriptionsService, SubscriptionMapper subscriptionMapper, PreferenceStorage preferenceStorage, SubscriptionsDao subscriptionsDao, SubscriptionsAuxDataDao subscriptionsAuxDataDao, InterfaceC0307a appDispatcher) {
        Intrinsics.checkNotNullParameter(subscriptionsService, "subscriptionsService");
        Intrinsics.checkNotNullParameter(subscriptionMapper, "subscriptionMapper");
        Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
        Intrinsics.checkNotNullParameter(subscriptionsDao, "subscriptionsDao");
        Intrinsics.checkNotNullParameter(subscriptionsAuxDataDao, "subscriptionsAuxDataDao");
        Intrinsics.checkNotNullParameter(appDispatcher, "appDispatcher");
        this.subscriptionsService = subscriptionsService;
        this.subscriptionMapper = subscriptionMapper;
        this.preferenceStorage = preferenceStorage;
        this.subscriptionsDao = subscriptionsDao;
        this.subscriptionsAuxDataDao = subscriptionsAuxDataDao;
        this.appDispatcher = appDispatcher;
        this.header = ServicePaths.SubscriptionsService.subscriptionToken;
        this.headerAuth = ServicePaths.SubscriptionsService.authentication;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String createMuteUrl(String stationId, String destId, String start, String end, String repeats) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(DefaultSubscriptionsRepositoryKt.MUTE, Arrays.copyOf(new Object[]{getDeviceId(), DefaultSubscriptionsRepositoryKt.PLATFORM, stationId, destId, start, end, repeats, ServicePaths.SubscriptionsService.subcriptionsMuteEndPath}, 8));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return "https://elcanoweb.adif.es/api/subscriptions/".concat(format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String createUrl(com.adif.elcanomovil.domain.entities.subscription.Subscription r18) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository.createUrl(com.adif.elcanomovil.domain.entities.subscription.Subscription):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDeviceId() {
        return this.preferenceStorage.getSubscriptionsUserId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPushId() {
        return this.preferenceStorage.getPushToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDeleteSubscription(Subscription subscription, boolean isUnRegister) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new k(subscription, this, null, isUnRegister), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleModifySubscription(Subscription subscription, String stationId, String destId, String start, String center, String end, String repeats, String subscription_type, String operator, String commercialProduct) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new m(subscription, this, stationId, destId, start, center, end, repeats, subscription_type, operator, commercialProduct, null), 2, null);
    }

    @Override // com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository
    public Flow<AsyncResult> active(Subscription subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        return FlowKt.flow(new b(subscription, this, null));
    }

    @Override // com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository
    public Flow<AsyncResult> create(String stationId, String destId, String start, String center, String end, String repeats, String subscription_type, SubscriptionType typeSubscription, String day, String msisdn, boolean shouldFetch, String operator, String commercialProduct) {
        Intrinsics.checkNotNullParameter(typeSubscription, "typeSubscription");
        Intrinsics.checkNotNullParameter(msisdn, "msisdn");
        return FlowKt.flow(new d(typeSubscription, this, stationId, destId, start, center, end, repeats, msisdn, subscription_type, day, operator, commercialProduct, null));
    }

    @Override // com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository
    public Flow<AsyncResult<Unit>> delete(Subscription subscription, boolean isUnRegister) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        return FlowKt.flow(new f(subscription, this, null, isUnRegister));
    }

    @Override // com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository
    public Object fetch(boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<Subscription>>>> continuation) {
        ((d1.d) this.appDispatcher).getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new i(this, z3, null), continuation);
    }

    @Override // com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository
    public Flow<AsyncResult> modify(Subscription subscription, String stationId, String destId, String start, String center, String end, String repeats, String subscription_type, String msisdn, boolean shouldFetch, String operator, String commercialProduct) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(msisdn, "msisdn");
        return FlowKt.flow(new q(this, subscription, stationId, destId, start, center, end, repeats, subscription_type, operator, commercialProduct, msisdn, null));
    }

    @Override // com.adif.elcanomovil.domain.repositories.subscriptions.SubscriptionRepository
    public Flow<AsyncResult> mute(String stationId, String destinationId, String msgStart, String msgEnd, String repeat, String trainId, boolean shouldFetch) {
        return FlowKt.flow(new s(this, stationId, destinationId, msgStart, msgEnd, repeat, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleModifySubscription(Subscription subscription) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o(subscription, this, null), 2, null);
    }
}
