package com.google.firebase.sessions.settings;

import Y.InterfaceC0091g;
import b0.AbstractC0262g;
import b0.C0257b;
import b0.C0260e;
import b0.C0263h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000f\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b'\u0010%J\u001d\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(H\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0013\u0010.\u001a\u00020\bH\u0081@ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/google/firebase/sessions/settings/SettingsCache;", "", "LY/g;", "Lb0/g;", "dataStore", "<init>", "(LY/g;)V", "preferences", "", "updateSessionConfigs", "(Lb0/g;)V", "T", "Lb0/e;", "key", "value", "updateConfigValue", "(Lb0/e;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "hasCacheExpired$com_google_firebase_firebase_sessions", "()Z", "hasCacheExpired", "sessionsEnabled", "()Ljava/lang/Boolean;", "", "sessionSamplingRate", "()Ljava/lang/Double;", "", "sessionRestartTimeout", "()Ljava/lang/Integer;", "enabled", "updateSettingsEnabled", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rate", "updateSamplingRate", "(Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeoutInSeconds", "updateSessionRestartTimeout", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheDurationInSeconds", "updateSessionCacheDuration", "", "cacheUpdatedTime", "updateSessionCacheUpdatedTime", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeConfigs$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeConfigs", "LY/g;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "sessionConfigs", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class SettingsCache {

    @Deprecated
    private static final C0260e CACHE_DURATION_SECONDS;

    @Deprecated
    private static final C0260e CACHE_UPDATED_TIME;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final C0260e RESTART_TIMEOUT_SECONDS;

    @Deprecated
    private static final C0260e SAMPLING_RATE;

    @Deprecated
    private static final C0260e SESSIONS_ENABLED;

    @Deprecated
    public static final String TAG = "SettingsCache";
    private final InterfaceC0091g dataStore;
    private SessionConfigs sessionConfigs;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.google.firebase.sessions.settings.SettingsCache$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SettingsCache settingsCache;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsCache settingsCache2 = SettingsCache.this;
                Flow b4 = settingsCache2.dataStore.b();
                this.L$0 = settingsCache2;
                this.label = 1;
                Object first = FlowKt.first(b4, this);
                if (first == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = first;
                settingsCache = settingsCache2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                settingsCache = (SettingsCache) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            AbstractC0262g abstractC0262g = (AbstractC0262g) obj;
            abstractC0262g.getClass();
            Map unmodifiableMap = Collections.unmodifiableMap(((C0257b) abstractC0262g).f4153a);
            Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(preferencesMap)");
            settingsCache.updateSessionConfigs(new C0257b(MapsKt.toMutableMap(unmodifiableMap), true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0014\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/settings/SettingsCache$Companion;", "", "<init>", "()V", "Lb0/e;", "", "SESSIONS_ENABLED", "Lb0/e;", "getSESSIONS_ENABLED", "()Lb0/e;", "", "SAMPLING_RATE", "getSAMPLING_RATE", "", "RESTART_TIMEOUT_SECONDS", "getRESTART_TIMEOUT_SECONDS", "CACHE_DURATION_SECONDS", "getCACHE_DURATION_SECONDS", "", "CACHE_UPDATED_TIME", "getCACHE_UPDATED_TIME", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0260e getCACHE_DURATION_SECONDS() {
            return SettingsCache.CACHE_DURATION_SECONDS;
        }

        public final C0260e getCACHE_UPDATED_TIME() {
            return SettingsCache.CACHE_UPDATED_TIME;
        }

        public final C0260e getRESTART_TIMEOUT_SECONDS() {
            return SettingsCache.RESTART_TIMEOUT_SECONDS;
        }

        public final C0260e getSAMPLING_RATE() {
            return SettingsCache.SAMPLING_RATE;
        }

        public final C0260e getSESSIONS_ENABLED() {
            return SettingsCache.SESSIONS_ENABLED;
        }

        private Companion() {
        }
    }

    static {
        Intrinsics.checkNotNullParameter(LocalOverrideSettings.SESSIONS_ENABLED, AppMeasurementSdk.ConditionalUserProperty.NAME);
        SESSIONS_ENABLED = new C0260e(LocalOverrideSettings.SESSIONS_ENABLED);
        Intrinsics.checkNotNullParameter(LocalOverrideSettings.SAMPLING_RATE, AppMeasurementSdk.ConditionalUserProperty.NAME);
        SAMPLING_RATE = new C0260e(LocalOverrideSettings.SAMPLING_RATE);
        Intrinsics.checkNotNullParameter("firebase_sessions_restart_timeout", AppMeasurementSdk.ConditionalUserProperty.NAME);
        RESTART_TIMEOUT_SECONDS = new C0260e("firebase_sessions_restart_timeout");
        Intrinsics.checkNotNullParameter("firebase_sessions_cache_duration", AppMeasurementSdk.ConditionalUserProperty.NAME);
        CACHE_DURATION_SECONDS = new C0260e("firebase_sessions_cache_duration");
        Intrinsics.checkNotNullParameter("firebase_sessions_cache_updated_time", AppMeasurementSdk.ConditionalUserProperty.NAME);
        CACHE_UPDATED_TIME = new C0260e("firebase_sessions_cache_updated_time");
    }

    public SettingsCache(InterfaceC0091g dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.dataStore = dataStore;
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        android.util.Log.w(com.google.firebase.sessions.settings.SettingsCache.TAG, "Failed to update cache config value: " + r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object updateConfigValue(b0.C0260e r6, T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1
            if (r0 == 0) goto L13
            r0 = r8
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = (com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.io.IOException -> L4a
            goto L5e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r8)
            Y.g r8 = r5.dataStore     // Catch: java.io.IOException -> L4a
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2 r2 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2     // Catch: java.io.IOException -> L4a
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L4a
            r0.label = r3     // Catch: java.io.IOException -> L4a
            b0.h r5 = new b0.h     // Catch: java.io.IOException -> L4a
            r5.<init>(r2, r4)     // Catch: java.io.IOException -> L4a
            java.lang.Object r5 = r8.a(r5, r0)     // Catch: java.io.IOException -> L4a
            if (r5 != r1) goto L5e
            return r1
        L4a:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to update cache config value: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "SettingsCache"
            android.util.Log.w(r6, r5)
        L5e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCache.updateConfigValue(b0.e, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSessionConfigs(AbstractC0262g preferences) {
        this.sessionConfigs = new SessionConfigs((Boolean) preferences.a(SESSIONS_ENABLED), (Double) preferences.a(SAMPLING_RATE), (Integer) preferences.a(RESTART_TIMEOUT_SECONDS), (Integer) preferences.a(CACHE_DURATION_SECONDS), (Long) preferences.a(CACHE_UPDATED_TIME));
    }

    public final boolean hasCacheExpired$com_google_firebase_firebase_sessions() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        SessionConfigs sessionConfigs2 = null;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        Long cacheUpdatedTime = sessionConfigs.getCacheUpdatedTime();
        SessionConfigs sessionConfigs3 = this.sessionConfigs;
        if (sessionConfigs3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
        } else {
            sessionConfigs2 = sessionConfigs3;
        }
        Integer cacheDuration = sessionConfigs2.getCacheDuration();
        return cacheUpdatedTime == null || cacheDuration == null || (System.currentTimeMillis() - cacheUpdatedTime.longValue()) / ((long) 1000) >= ((long) cacheDuration.intValue());
    }

    public final Object removeConfigs$com_google_firebase_firebase_sessions(Continuation<? super Unit> continuation) {
        Object a2 = this.dataStore.a(new C0263h(new SettingsCache$removeConfigs$2(this, null), null), continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    public final Integer sessionRestartTimeout() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionRestartTimeout();
    }

    public final Double sessionSamplingRate() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionSamplingRate();
    }

    public final Boolean sessionsEnabled() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionEnabled();
    }

    public final Object updateSamplingRate(Double d4, Continuation<? super Unit> continuation) {
        Object updateConfigValue = updateConfigValue(SAMPLING_RATE, d4, continuation);
        return updateConfigValue == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateConfigValue : Unit.INSTANCE;
    }

    public final Object updateSessionCacheDuration(Integer num, Continuation<? super Unit> continuation) {
        Object updateConfigValue = updateConfigValue(CACHE_DURATION_SECONDS, num, continuation);
        return updateConfigValue == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateConfigValue : Unit.INSTANCE;
    }

    public final Object updateSessionCacheUpdatedTime(Long l4, Continuation<? super Unit> continuation) {
        Object updateConfigValue = updateConfigValue(CACHE_UPDATED_TIME, l4, continuation);
        return updateConfigValue == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateConfigValue : Unit.INSTANCE;
    }

    public final Object updateSessionRestartTimeout(Integer num, Continuation<? super Unit> continuation) {
        Object updateConfigValue = updateConfigValue(RESTART_TIMEOUT_SECONDS, num, continuation);
        return updateConfigValue == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateConfigValue : Unit.INSTANCE;
    }

    public final Object updateSettingsEnabled(Boolean bool, Continuation<? super Unit> continuation) {
        Object updateConfigValue = updateConfigValue(SESSIONS_ENABLED, bool, continuation);
        return updateConfigValue == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateConfigValue : Unit.INSTANCE;
    }
}
