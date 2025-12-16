package com.adif.elcanomovil.repositories.providers;

import com.adif.elcanomovil.domain.entities.RemoteConfiguration;
import com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0011H\u0016R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/adif/elcanomovil/repositories/providers/DefaultRemoteConfigVersionRepository;", "Lcom/adif/elcanomovil/domain/repositories/RemoteConfigVersionRepository;", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "preferences", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;)V", "_remoteConfiguration", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/adif/elcanomovil/domain/entities/RemoteConfiguration;", "circulationsFetchInterval", "", "getCirculationsFetchInterval", "()J", "setCirculationsFetchInterval", "(J)V", "value", "", "lastNotifiedVersion", "getLastNotifiedVersion", "()Ljava/lang/String;", "setLastNotifiedVersion", "(Ljava/lang/String;)V", "remoteConfiguration", "Lkotlinx/coroutines/flow/Flow;", "getRemoteConfiguration", "()Lkotlinx/coroutines/flow/Flow;", "fetchRemoteConfiguration", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeLastNotifiedVersion", "version", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultRemoteConfigVersionRepository implements RemoteConfigVersionRepository {
    private final MutableStateFlow<RemoteConfiguration> _remoteConfiguration;
    private long circulationsFetchInterval;
    private final PreferenceStorage preferences;
    private final FirebaseRemoteConfig remoteConfig;
    private final Flow<RemoteConfiguration> remoteConfiguration;

    public DefaultRemoteConfigVersionRepository(FirebaseRemoteConfig remoteConfig, PreferenceStorage preferences) {
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.remoteConfig = remoteConfig;
        this.preferences = preferences;
        this.circulationsFetchInterval = 30L;
        MutableStateFlow<RemoteConfiguration> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._remoteConfiguration = MutableStateFlow;
        this.remoteConfiguration = FlowKt.filterNotNull(MutableStateFlow);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(5:5|6|7|(1:(1:(7:11|12|13|(1:15)|16|17|18)(2:21|22))(2:23|24))(3:28|29|(2:31|27))|25))|34|6|7|(0)(0)|25) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (kotlinx.coroutines.tasks.TasksKt.await(r9, r1) != r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0030, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
    
        m3.l.g(r9);
        r8._remoteConfiguration.setValue(new com.adif.elcanomovil.domain.entities.RemoteConfiguration("2.0.0", "2.0.0", "https://play.google.com/store/apps/details?id=com.adif.elcanomovil"));
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetchRemoteConfiguration(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            java.lang.String r0 = "asString(...)"
            boolean r1 = r9 instanceof com.adif.elcanomovil.repositories.providers.j
            if (r1 == 0) goto L15
            r1 = r9
            com.adif.elcanomovil.repositories.providers.j r1 = (com.adif.elcanomovil.repositories.providers.j) r1
            int r2 = r1.f4662d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f4662d = r2
            goto L1a
        L15:
            com.adif.elcanomovil.repositories.providers.j r1 = new com.adif.elcanomovil.repositories.providers.j
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.f4660b
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.f4662d
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L41
            if (r3 == r5) goto L3b
            if (r3 != r4) goto L33
            com.adif.elcanomovil.repositories.providers.DefaultRemoteConfigVersionRepository r8 = r1.f4659a
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L30
            goto L73
        L30:
            r9 = move-exception
            goto Lc9
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            com.adif.elcanomovil.repositories.providers.DefaultRemoteConfigVersionRepository r8 = r1.f4659a
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L30
            goto L5d
        L41:
            kotlin.ResultKt.throwOnFailure(r9)
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r9 = r8.remoteConfig     // Catch: java.lang.Exception -> L30
            r6 = 86400(0x15180, double:4.26873E-319)
            com.google.android.gms.tasks.Task r9 = r9.fetch(r6)     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = "fetch(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r3)     // Catch: java.lang.Exception -> L30
            r1.f4659a = r8     // Catch: java.lang.Exception -> L30
            r1.f4662d = r5     // Catch: java.lang.Exception -> L30
            java.lang.Object r9 = kotlinx.coroutines.tasks.TasksKt.await(r9, r1)     // Catch: java.lang.Exception -> L30
            if (r9 != r2) goto L5d
            goto L72
        L5d:
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r9 = r8.remoteConfig     // Catch: java.lang.Exception -> L30
            com.google.android.gms.tasks.Task r9 = r9.activate()     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = "activate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r3)     // Catch: java.lang.Exception -> L30
            r1.f4659a = r8     // Catch: java.lang.Exception -> L30
            r1.f4662d = r4     // Catch: java.lang.Exception -> L30
            java.lang.Object r9 = kotlinx.coroutines.tasks.TasksKt.await(r9, r1)     // Catch: java.lang.Exception -> L30
            if (r9 != r2) goto L73
        L72:
            return r2
        L73:
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r9 = r8.remoteConfig     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = "app_version_recommended_update"
            com.google.firebase.remoteconfig.FirebaseRemoteConfigValue r9 = com.google.firebase.remoteconfig.ktx.RemoteConfigKt.get(r9, r1)     // Catch: java.lang.Exception -> L30
            java.lang.String r9 = r9.asString()     // Catch: java.lang.Exception -> L30
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)     // Catch: java.lang.Exception -> L30
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r1 = r8.remoteConfig     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "app_version_force_update"
            com.google.firebase.remoteconfig.FirebaseRemoteConfigValue r1 = com.google.firebase.remoteconfig.ktx.RemoteConfigKt.get(r1, r2)     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = r1.asString()     // Catch: java.lang.Exception -> L30
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)     // Catch: java.lang.Exception -> L30
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r2 = r8.remoteConfig     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = "app_version_update_url"
            com.google.firebase.remoteconfig.FirebaseRemoteConfigValue r2 = com.google.firebase.remoteconfig.ktx.RemoteConfigKt.get(r2, r3)     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = r2.asString()     // Catch: java.lang.Exception -> L30
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)     // Catch: java.lang.Exception -> L30
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r0 = r8.remoteConfig     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = "traffic_results_refresh_time"
            com.google.firebase.remoteconfig.FirebaseRemoteConfigValue r0 = com.google.firebase.remoteconfig.ktx.RemoteConfigKt.get(r0, r3)     // Catch: java.lang.Exception -> L30
            long r3 = r0.asLong()     // Catch: java.lang.Exception -> L30
            r8.setCirculationsFetchInterval(r3)     // Catch: java.lang.Exception -> L30
            long r3 = r8.getCirculationsFetchInterval()     // Catch: java.lang.Exception -> L30
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Lbe
            r3 = 30
            r8.setCirculationsFetchInterval(r3)     // Catch: java.lang.Exception -> L30
        Lbe:
            kotlinx.coroutines.flow.MutableStateFlow<com.adif.elcanomovil.domain.entities.RemoteConfiguration> r0 = r8._remoteConfiguration     // Catch: java.lang.Exception -> L30
            com.adif.elcanomovil.domain.entities.RemoteConfiguration r3 = new com.adif.elcanomovil.domain.entities.RemoteConfiguration     // Catch: java.lang.Exception -> L30
            r3.<init>(r9, r1, r2)     // Catch: java.lang.Exception -> L30
            r0.setValue(r3)     // Catch: java.lang.Exception -> L30
            goto Lda
        Lc9:
            m3.l.g(r9)
            kotlinx.coroutines.flow.MutableStateFlow<com.adif.elcanomovil.domain.entities.RemoteConfiguration> r8 = r8._remoteConfiguration
            com.adif.elcanomovil.domain.entities.RemoteConfiguration r9 = new com.adif.elcanomovil.domain.entities.RemoteConfiguration
            java.lang.String r0 = "https://play.google.com/store/apps/details?id=com.adif.elcanomovil"
            java.lang.String r1 = "2.0.0"
            r9.<init>(r1, r1, r0)
            r8.setValue(r9)
        Lda:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.providers.DefaultRemoteConfigVersionRepository.fetchRemoteConfiguration(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository
    public long getCirculationsFetchInterval() {
        return this.circulationsFetchInterval;
    }

    @Override // com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository
    public String getLastNotifiedVersion() {
        return this.preferences.getLastCheckedVersion();
    }

    @Override // com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository
    public Flow<RemoteConfiguration> getRemoteConfiguration() {
        return this.remoteConfiguration;
    }

    public void setCirculationsFetchInterval(long j4) {
        this.circulationsFetchInterval = j4;
    }

    public void setLastNotifiedVersion(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preferences.setLastCheckedVersion(value);
    }

    @Override // com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository
    public void storeLastNotifiedVersion(String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        setLastNotifiedVersion(version);
    }
}
