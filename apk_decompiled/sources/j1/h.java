package j1;

import com.adif.elcanomovil.domain.entities.RemoteConfiguration;
import com.adif.elcanomovil.domain.entities.VersionUpdateStatus;
import com.adif.elcanomovil.domain.providers.AppVersionProvider;
import com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository;
import com.adif.elcanomovil.domain.usecases.GetVersionUpdateStatusUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetVersionUpdateStatusUseCase f6941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(GetVersionUpdateStatusUseCase getVersionUpdateStatusUseCase, Continuation continuation) {
        super(2, continuation);
        this.f6941b = getVersionUpdateStatusUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f6941b, continuation);
        hVar.f6940a = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((RemoteConfiguration) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        AppVersionProvider appVersionProvider;
        RemoteConfigVersionRepository remoteConfigVersionRepository;
        RemoteConfigVersionRepository remoteConfigVersionRepository2;
        AppVersionProvider appVersionProvider2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        RemoteConfiguration remoteConfiguration = (RemoteConfiguration) this.f6940a;
        int length = remoteConfiguration.getLatestPermittedVersion().length();
        GetVersionUpdateStatusUseCase getVersionUpdateStatusUseCase = this.f6941b;
        if (length > 0) {
            appVersionProvider2 = getVersionUpdateStatusUseCase.appVersionProvider;
            if (appVersionProvider2.getVersion().compareTo(remoteConfiguration.getLatestPermittedVersion()) < 0) {
                obj2 = new VersionUpdateStatus.Forced(remoteConfiguration.getUrlStore());
                remoteConfigVersionRepository2 = getVersionUpdateStatusUseCase.remoteConfigVersionRepository;
                remoteConfigVersionRepository2.storeLastNotifiedVersion(remoteConfiguration.getLatestReleasedVersion());
                return FlowKt.flowOf(obj2);
            }
        }
        if (remoteConfiguration.getLatestReleasedVersion().length() > 0) {
            appVersionProvider = getVersionUpdateStatusUseCase.appVersionProvider;
            if (appVersionProvider.getVersion().compareTo(remoteConfiguration.getLatestReleasedVersion()) < 0) {
                remoteConfigVersionRepository = getVersionUpdateStatusUseCase.remoteConfigVersionRepository;
                if (remoteConfigVersionRepository.getLastNotifiedVersion().compareTo(remoteConfiguration.getLatestReleasedVersion()) < 0) {
                    obj2 = new VersionUpdateStatus.Optional(remoteConfiguration.getUrlStore());
                    remoteConfigVersionRepository2 = getVersionUpdateStatusUseCase.remoteConfigVersionRepository;
                    remoteConfigVersionRepository2.storeLastNotifiedVersion(remoteConfiguration.getLatestReleasedVersion());
                    return FlowKt.flowOf(obj2);
                }
            }
        }
        obj2 = VersionUpdateStatus.Valid.INSTANCE;
        remoteConfigVersionRepository2 = getVersionUpdateStatusUseCase.remoteConfigVersionRepository;
        remoteConfigVersionRepository2.storeLastNotifiedVersion(remoteConfiguration.getLatestReleasedVersion());
        return FlowKt.flowOf(obj2);
    }
}
