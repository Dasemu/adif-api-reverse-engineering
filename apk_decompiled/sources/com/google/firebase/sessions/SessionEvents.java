package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001e"}, d2 = {"Lcom/google/firebase/sessions/SessionEvents;", "", "()V", "SESSION_EVENT_ENCODER", "Lcom/google/firebase/encoders/DataEncoder;", "getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/encoders/DataEncoder;", "buildSession", "Lcom/google/firebase/sessions/SessionEvent;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "sessionDetails", "Lcom/google/firebase/sessions/SessionDetails;", "sessionsSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "currentProcessDetails", "Lcom/google/firebase/sessions/ProcessDetails;", "appProcessDetails", "", "subscribers", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "firebaseInstallationId", "", "getApplicationInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "toDataCollectionState", "Lcom/google/firebase/sessions/DataCollectionState;", "subscriber", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class SessionEvents {
    public static final SessionEvents INSTANCE = new SessionEvents();
    private static final DataEncoder SESSION_EVENT_ENCODER;

    static {
        DataEncoder build = new JsonDataEncoderBuilder().configureWith(AutoSessionEventEncoder.CONFIG).ignoreNullValues(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        SESSION_EVENT_ENCODER = build;
    }

    private SessionEvents() {
    }

    public static /* synthetic */ SessionEvent buildSession$default(SessionEvents sessionEvents, FirebaseApp firebaseApp, SessionDetails sessionDetails, SessionsSettings sessionsSettings, ProcessDetails processDetails, List list, Map map, String str, int i, Object obj) {
        if ((i & 32) != 0) {
            map = MapsKt.emptyMap();
        }
        return sessionEvents.buildSession(firebaseApp, sessionDetails, sessionsSettings, processDetails, list, map, (i & 64) != 0 ? "" : str);
    }

    private final DataCollectionState toDataCollectionState(SessionSubscriber subscriber) {
        return subscriber == null ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : subscriber.isDataCollectionEnabled() ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED;
    }

    public final SessionEvent buildSession(FirebaseApp firebaseApp, SessionDetails sessionDetails, SessionsSettings sessionsSettings, ProcessDetails currentProcessDetails, List<ProcessDetails> appProcessDetails, Map<SessionSubscriber.Name, ? extends SessionSubscriber> subscribers, String firebaseInstallationId) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        Intrinsics.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        return new SessionEvent(EventType.SESSION_START, new SessionInfo(sessionDetails.getSessionId(), sessionDetails.getFirstSessionId(), sessionDetails.getSessionIndex(), sessionDetails.getSessionStartTimestampUs(), new DataCollectionStatus(toDataCollectionState(subscribers.get(SessionSubscriber.Name.PERFORMANCE)), toDataCollectionState(subscribers.get(SessionSubscriber.Name.CRASHLYTICS)), sessionsSettings.getSamplingRate()), firebaseInstallationId), getApplicationInfo(firebaseApp));
    }

    public final ApplicationInfo getApplicationInfo(FirebaseApp firebaseApp) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Context applicationContext = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "firebaseApp.applicationContext");
        String packageName = applicationContext.getPackageName();
        PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = String.valueOf(packageInfo.getLongVersionCode());
        String applicationId = firebaseApp.getOptions().getApplicationId();
        Intrinsics.checkNotNullExpressionValue(applicationId, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        String str = packageInfo.versionName;
        String str2 = str == null ? valueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.INSTANCE;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "firebaseApp.applicationContext");
        ProcessDetails currentProcessDetails = processDetailsProvider.getCurrentProcessDetails(applicationContext2);
        Context applicationContext3 = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext3, "firebaseApp.applicationContext");
        return new ApplicationInfo(applicationId, MODEL, BuildConfig.VERSION_NAME, RELEASE, logEnvironment, new AndroidApplicationInfo(packageName, str2, valueOf, MANUFACTURER, currentProcessDetails, processDetailsProvider.getAppProcessDetails(applicationContext3)));
    }

    public final DataEncoder getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions() {
        return SESSION_EVENT_ENCODER;
    }
}
