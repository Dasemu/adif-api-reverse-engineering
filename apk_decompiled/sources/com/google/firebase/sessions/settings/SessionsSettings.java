package com.google.firebase.sessions.settings;

import Y.InterfaceC0091g;
import android.content.Context;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.SessionDataStoreConfigs;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import m3.l;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B/\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB'\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000eB\u0015\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001d\u0010 \u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u00020$H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010%R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00188Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings;", "", "context", "Landroid/content/Context;", "blockingDispatcher", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "appInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;)V", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "(Lcom/google/firebase/FirebaseApp;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;)V", "localOverrideSettings", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "remoteSettings", "(Lcom/google/firebase/sessions/settings/SettingsProvider;Lcom/google/firebase/sessions/settings/SettingsProvider;)V", "samplingRate", "", "getSamplingRate", "()D", "sessionRestartTimeout", "Lkotlin/time/Duration;", "getSessionRestartTimeout-UwyO8pc", "()J", "sessionsEnabled", "", "getSessionsEnabled", "()Z", "isValidSamplingRate", "isValidSessionRestartTimeout", "isValidSessionRestartTimeout-LRDsOJo", "(J)Z", "updateSettings", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class SessionsSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ReadOnlyProperty<Context, InterfaceC0091g> dataStore$delegate = l.S(SessionDataStoreConfigs.INSTANCE.getSETTINGS_CONFIG_NAME());
    private final SettingsProvider localOverrideSettings;
    private final SettingsProvider remoteSettings;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "LY/g;", "Lb0/g;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getDataStore", "(Landroid/content/Context;)LY/g;", "dataStore", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "getInstance", "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "instance", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property2(new PropertyReference2Impl(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final InterfaceC0091g getDataStore(Context context) {
            return (InterfaceC0091g) SessionsSettings.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
        }

        public final SessionsSettings getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionsSettings.class);
            Intrinsics.checkNotNullExpressionValue(obj, "Firebase.app[SessionsSettings::class.java]");
            return (SessionsSettings) obj;
        }

        private Companion() {
        }
    }

    public SessionsSettings(SettingsProvider localOverrideSettings, SettingsProvider remoteSettings) {
        Intrinsics.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.localOverrideSettings = localOverrideSettings;
        this.remoteSettings = remoteSettings;
    }

    private final boolean isValidSamplingRate(double samplingRate) {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE <= samplingRate && samplingRate <= 1.0d;
    }

    /* renamed from: isValidSessionRestartTimeout-LRDsOJo, reason: not valid java name */
    private final boolean m105isValidSessionRestartTimeoutLRDsOJo(long sessionRestartTimeout) {
        return Duration.m1489isPositiveimpl(sessionRestartTimeout) && Duration.m1484isFiniteimpl(sessionRestartTimeout);
    }

    public final double getSamplingRate() {
        Double samplingRate = this.localOverrideSettings.getSamplingRate();
        if (samplingRate != null) {
            double doubleValue = samplingRate.doubleValue();
            if (isValidSamplingRate(doubleValue)) {
                return doubleValue;
            }
        }
        Double samplingRate2 = this.remoteSettings.getSamplingRate();
        if (samplingRate2 == null) {
            return 1.0d;
        }
        double doubleValue2 = samplingRate2.doubleValue();
        if (isValidSamplingRate(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    /* renamed from: getSessionRestartTimeout-UwyO8pc, reason: not valid java name */
    public final long m106getSessionRestartTimeoutUwyO8pc() {
        Duration mo104getSessionRestartTimeoutFghU774 = this.localOverrideSettings.mo104getSessionRestartTimeoutFghU774();
        if (mo104getSessionRestartTimeoutFghU774 != null) {
            long rawValue = mo104getSessionRestartTimeoutFghU774.getRawValue();
            if (m105isValidSessionRestartTimeoutLRDsOJo(rawValue)) {
                return rawValue;
            }
        }
        Duration mo104getSessionRestartTimeoutFghU7742 = this.remoteSettings.mo104getSessionRestartTimeoutFghU774();
        if (mo104getSessionRestartTimeoutFghU7742 != null) {
            long rawValue2 = mo104getSessionRestartTimeoutFghU7742.getRawValue();
            if (m105isValidSessionRestartTimeoutLRDsOJo(rawValue2)) {
                return rawValue2;
            }
        }
        Duration.Companion companion = Duration.INSTANCE;
        return DurationKt.toDuration(30, DurationUnit.MINUTES);
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.localOverrideSettings.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.remoteSettings.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r5.updateSettings(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r6.updateSettings(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateSettings(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = (com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = new com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            com.google.firebase.sessions.settings.SessionsSettings r5 = (com.google.firebase.sessions.settings.SessionsSettings) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4c
        L3c:
            kotlin.ResultKt.throwOnFailure(r6)
            com.google.firebase.sessions.settings.SettingsProvider r6 = r5.localOverrideSettings
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L4c
            goto L59
        L4c:
            com.google.firebase.sessions.settings.SettingsProvider r5 = r5.remoteSettings
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = r5.updateSettings(r0)
            if (r5 != r1) goto L5a
        L59:
            return r1
        L5a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.updateSettings(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private SessionsSettings(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo) {
        this(new LocalOverrideSettings(context), new RemoteSettings(coroutineContext2, firebaseInstallationsApi, applicationInfo, new RemoteSettingsFetcher(applicationInfo, coroutineContext, null, 4, null), INSTANCE.getDataStore(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SessionsSettings(com.google.firebase.FirebaseApp r8, kotlin.coroutines.CoroutineContext r9, kotlin.coroutines.CoroutineContext r10, com.google.firebase.installations.FirebaseInstallationsApi r11) {
        /*
            r7 = this;
            java.lang.String r0 = "firebaseApp"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "blockingDispatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "backgroundDispatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "firebaseInstallationsApi"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            android.content.Context r2 = r8.getApplicationContext()
            java.lang.String r0 = "firebaseApp.applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            com.google.firebase.sessions.SessionEvents r0 = com.google.firebase.sessions.SessionEvents.INSTANCE
            com.google.firebase.sessions.ApplicationInfo r6 = r0.getApplicationInfo(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.<init>(com.google.firebase.FirebaseApp, kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext, com.google.firebase.installations.FirebaseInstallationsApi):void");
    }
}
