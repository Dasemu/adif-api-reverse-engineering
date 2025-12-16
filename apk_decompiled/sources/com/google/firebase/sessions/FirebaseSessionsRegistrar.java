package com.google.firebase.sessions;

import T1.g;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "", "kotlin.jvm.PlatformType", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final Qualified<FirebaseApp> firebaseApp = Qualified.unqualified(FirebaseApp.class);

    @Deprecated
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi = Qualified.unqualified(FirebaseInstallationsApi.class);

    @Deprecated
    private static final Qualified<CoroutineDispatcher> backgroundDispatcher = Qualified.qualified(Background.class, CoroutineDispatcher.class);

    @Deprecated
    private static final Qualified<CoroutineDispatcher> blockingDispatcher = Qualified.qualified(Blocking.class, CoroutineDispatcher.class);

    @Deprecated
    private static final Qualified<g> transportFactory = Qualified.unqualified(g.class);

    @Deprecated
    private static final Qualified<SessionFirelogPublisher> sessionFirelogPublisher = Qualified.unqualified(SessionFirelogPublisher.class);

    @Deprecated
    private static final Qualified<SessionGenerator> sessionGenerator = Qualified.unqualified(SessionGenerator.class);

    @Deprecated
    private static final Qualified<SessionsSettings> sessionsSettings = Qualified.unqualified(SessionsSettings.class);

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R8\u0010\n\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR8\u0010\f\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR8\u0010\u000e\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR8\u0010\u0010\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000f0\u000f \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR8\u0010\u0012\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00110\u0011 \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR8\u0010\u0014\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00130\u0013 \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00130\u0013\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR8\u0010\u0016\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00150\u0015 \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00150\u0015\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR8\u0010\u0018\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00170\u0017 \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00170\u0017\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$Companion;", "", "<init>", "()V", "", "LIBRARY_NAME", "Ljava/lang/String;", "Lcom/google/firebase/components/Qualified;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlin.jvm.PlatformType", "backgroundDispatcher", "Lcom/google/firebase/components/Qualified;", "blockingDispatcher", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/SessionGenerator;", "sessionGenerator", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionsSettings", "LT1/g;", "transportFactory", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-0, reason: not valid java name */
    public static final FirebaseSessions m97getComponents$lambda0(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(sessionsSettings);
        Intrinsics.checkNotNullExpressionValue(obj2, "container[sessionsSettings]");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj3, "container[backgroundDispatcher]");
        return new FirebaseSessions((FirebaseApp) obj, (SessionsSettings) obj2, (CoroutineContext) obj3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-1, reason: not valid java name */
    public static final SessionGenerator m98getComponents$lambda1(ComponentContainer componentContainer) {
        return new SessionGenerator(WallClock.INSTANCE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-2, reason: not valid java name */
    public static final SessionFirelogPublisher m99getComponents$lambda2(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(obj2, "container[firebaseInstallationsApi]");
        Object obj3 = componentContainer.get(sessionsSettings);
        Intrinsics.checkNotNullExpressionValue(obj3, "container[sessionsSettings]");
        Provider provider = componentContainer.getProvider(transportFactory);
        Intrinsics.checkNotNullExpressionValue(provider, "container.getProvider(transportFactory)");
        EventGDTLogger eventGDTLogger = new EventGDTLogger(provider);
        Object obj4 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj4, "container[backgroundDispatcher]");
        return new SessionFirelogPublisherImpl((FirebaseApp) obj, (FirebaseInstallationsApi) obj2, (SessionsSettings) obj3, eventGDTLogger, (CoroutineContext) obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-3, reason: not valid java name */
    public static final SessionsSettings m100getComponents$lambda3(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(blockingDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj2, "container[blockingDispatcher]");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj3, "container[backgroundDispatcher]");
        Object obj4 = componentContainer.get(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(obj4, "container[firebaseInstallationsApi]");
        return new SessionsSettings((FirebaseApp) obj, (CoroutineContext) obj2, (CoroutineContext) obj3, (FirebaseInstallationsApi) obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-4, reason: not valid java name */
    public static final SessionDatastore m101getComponents$lambda4(ComponentContainer componentContainer) {
        Context applicationContext = ((FirebaseApp) componentContainer.get(firebaseApp)).getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "container[firebaseApp].applicationContext");
        Object obj = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj, "container[backgroundDispatcher]");
        return new SessionDatastoreImpl(applicationContext, (CoroutineContext) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-5, reason: not valid java name */
    public static final SessionLifecycleServiceBinder m102getComponents$lambda5(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        return new SessionLifecycleServiceBinderImpl((FirebaseApp) obj);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<? extends Object>> getComponents() {
        Component.Builder name = Component.builder(FirebaseSessions.class).name(LIBRARY_NAME);
        Qualified<FirebaseApp> qualified = firebaseApp;
        Component.Builder add = name.add(Dependency.required(qualified));
        Qualified<SessionsSettings> qualified2 = sessionsSettings;
        Component.Builder add2 = add.add(Dependency.required(qualified2));
        Qualified<CoroutineDispatcher> qualified3 = backgroundDispatcher;
        final int i = 0;
        Component build = add2.add(Dependency.required(qualified3)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                FirebaseSessions m97getComponents$lambda0;
                SessionGenerator m98getComponents$lambda1;
                SessionFirelogPublisher m99getComponents$lambda2;
                SessionsSettings m100getComponents$lambda3;
                SessionDatastore m101getComponents$lambda4;
                SessionLifecycleServiceBinder m102getComponents$lambda5;
                switch (i) {
                    case 0:
                        m97getComponents$lambda0 = FirebaseSessionsRegistrar.m97getComponents$lambda0(componentContainer);
                        return m97getComponents$lambda0;
                    case 1:
                        m98getComponents$lambda1 = FirebaseSessionsRegistrar.m98getComponents$lambda1(componentContainer);
                        return m98getComponents$lambda1;
                    case 2:
                        m99getComponents$lambda2 = FirebaseSessionsRegistrar.m99getComponents$lambda2(componentContainer);
                        return m99getComponents$lambda2;
                    case 3:
                        m100getComponents$lambda3 = FirebaseSessionsRegistrar.m100getComponents$lambda3(componentContainer);
                        return m100getComponents$lambda3;
                    case 4:
                        m101getComponents$lambda4 = FirebaseSessionsRegistrar.m101getComponents$lambda4(componentContainer);
                        return m101getComponents$lambda4;
                    default:
                        m102getComponents$lambda5 = FirebaseSessionsRegistrar.m102getComponents$lambda5(componentContainer);
                        return m102getComponents$lambda5;
                }
            }
        }).eagerInDefaultApp().build();
        final int i4 = 1;
        Component build2 = Component.builder(SessionGenerator.class).name("session-generator").factory(new ComponentFactory() { // from class: com.google.firebase.sessions.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                FirebaseSessions m97getComponents$lambda0;
                SessionGenerator m98getComponents$lambda1;
                SessionFirelogPublisher m99getComponents$lambda2;
                SessionsSettings m100getComponents$lambda3;
                SessionDatastore m101getComponents$lambda4;
                SessionLifecycleServiceBinder m102getComponents$lambda5;
                switch (i4) {
                    case 0:
                        m97getComponents$lambda0 = FirebaseSessionsRegistrar.m97getComponents$lambda0(componentContainer);
                        return m97getComponents$lambda0;
                    case 1:
                        m98getComponents$lambda1 = FirebaseSessionsRegistrar.m98getComponents$lambda1(componentContainer);
                        return m98getComponents$lambda1;
                    case 2:
                        m99getComponents$lambda2 = FirebaseSessionsRegistrar.m99getComponents$lambda2(componentContainer);
                        return m99getComponents$lambda2;
                    case 3:
                        m100getComponents$lambda3 = FirebaseSessionsRegistrar.m100getComponents$lambda3(componentContainer);
                        return m100getComponents$lambda3;
                    case 4:
                        m101getComponents$lambda4 = FirebaseSessionsRegistrar.m101getComponents$lambda4(componentContainer);
                        return m101getComponents$lambda4;
                    default:
                        m102getComponents$lambda5 = FirebaseSessionsRegistrar.m102getComponents$lambda5(componentContainer);
                        return m102getComponents$lambda5;
                }
            }
        }).build();
        Component.Builder add3 = Component.builder(SessionFirelogPublisher.class).name("session-publisher").add(Dependency.required(qualified));
        Qualified<FirebaseInstallationsApi> qualified4 = firebaseInstallationsApi;
        final int i5 = 2;
        Component build3 = add3.add(Dependency.required(qualified4)).add(Dependency.required(qualified2)).add(Dependency.requiredProvider(transportFactory)).add(Dependency.required(qualified3)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                FirebaseSessions m97getComponents$lambda0;
                SessionGenerator m98getComponents$lambda1;
                SessionFirelogPublisher m99getComponents$lambda2;
                SessionsSettings m100getComponents$lambda3;
                SessionDatastore m101getComponents$lambda4;
                SessionLifecycleServiceBinder m102getComponents$lambda5;
                switch (i5) {
                    case 0:
                        m97getComponents$lambda0 = FirebaseSessionsRegistrar.m97getComponents$lambda0(componentContainer);
                        return m97getComponents$lambda0;
                    case 1:
                        m98getComponents$lambda1 = FirebaseSessionsRegistrar.m98getComponents$lambda1(componentContainer);
                        return m98getComponents$lambda1;
                    case 2:
                        m99getComponents$lambda2 = FirebaseSessionsRegistrar.m99getComponents$lambda2(componentContainer);
                        return m99getComponents$lambda2;
                    case 3:
                        m100getComponents$lambda3 = FirebaseSessionsRegistrar.m100getComponents$lambda3(componentContainer);
                        return m100getComponents$lambda3;
                    case 4:
                        m101getComponents$lambda4 = FirebaseSessionsRegistrar.m101getComponents$lambda4(componentContainer);
                        return m101getComponents$lambda4;
                    default:
                        m102getComponents$lambda5 = FirebaseSessionsRegistrar.m102getComponents$lambda5(componentContainer);
                        return m102getComponents$lambda5;
                }
            }
        }).build();
        final int i6 = 3;
        Component build4 = Component.builder(SessionsSettings.class).name("sessions-settings").add(Dependency.required(qualified)).add(Dependency.required(blockingDispatcher)).add(Dependency.required(qualified3)).add(Dependency.required(qualified4)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                FirebaseSessions m97getComponents$lambda0;
                SessionGenerator m98getComponents$lambda1;
                SessionFirelogPublisher m99getComponents$lambda2;
                SessionsSettings m100getComponents$lambda3;
                SessionDatastore m101getComponents$lambda4;
                SessionLifecycleServiceBinder m102getComponents$lambda5;
                switch (i6) {
                    case 0:
                        m97getComponents$lambda0 = FirebaseSessionsRegistrar.m97getComponents$lambda0(componentContainer);
                        return m97getComponents$lambda0;
                    case 1:
                        m98getComponents$lambda1 = FirebaseSessionsRegistrar.m98getComponents$lambda1(componentContainer);
                        return m98getComponents$lambda1;
                    case 2:
                        m99getComponents$lambda2 = FirebaseSessionsRegistrar.m99getComponents$lambda2(componentContainer);
                        return m99getComponents$lambda2;
                    case 3:
                        m100getComponents$lambda3 = FirebaseSessionsRegistrar.m100getComponents$lambda3(componentContainer);
                        return m100getComponents$lambda3;
                    case 4:
                        m101getComponents$lambda4 = FirebaseSessionsRegistrar.m101getComponents$lambda4(componentContainer);
                        return m101getComponents$lambda4;
                    default:
                        m102getComponents$lambda5 = FirebaseSessionsRegistrar.m102getComponents$lambda5(componentContainer);
                        return m102getComponents$lambda5;
                }
            }
        }).build();
        final int i7 = 4;
        Component build5 = Component.builder(SessionDatastore.class).name("sessions-datastore").add(Dependency.required(qualified)).add(Dependency.required(qualified3)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                FirebaseSessions m97getComponents$lambda0;
                SessionGenerator m98getComponents$lambda1;
                SessionFirelogPublisher m99getComponents$lambda2;
                SessionsSettings m100getComponents$lambda3;
                SessionDatastore m101getComponents$lambda4;
                SessionLifecycleServiceBinder m102getComponents$lambda5;
                switch (i7) {
                    case 0:
                        m97getComponents$lambda0 = FirebaseSessionsRegistrar.m97getComponents$lambda0(componentContainer);
                        return m97getComponents$lambda0;
                    case 1:
                        m98getComponents$lambda1 = FirebaseSessionsRegistrar.m98getComponents$lambda1(componentContainer);
                        return m98getComponents$lambda1;
                    case 2:
                        m99getComponents$lambda2 = FirebaseSessionsRegistrar.m99getComponents$lambda2(componentContainer);
                        return m99getComponents$lambda2;
                    case 3:
                        m100getComponents$lambda3 = FirebaseSessionsRegistrar.m100getComponents$lambda3(componentContainer);
                        return m100getComponents$lambda3;
                    case 4:
                        m101getComponents$lambda4 = FirebaseSessionsRegistrar.m101getComponents$lambda4(componentContainer);
                        return m101getComponents$lambda4;
                    default:
                        m102getComponents$lambda5 = FirebaseSessionsRegistrar.m102getComponents$lambda5(componentContainer);
                        return m102getComponents$lambda5;
                }
            }
        }).build();
        final int i8 = 5;
        return CollectionsKt.listOf((Object[]) new Component[]{build, build2, build3, build4, build5, Component.builder(SessionLifecycleServiceBinder.class).name("sessions-service-binder").add(Dependency.required(qualified)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                FirebaseSessions m97getComponents$lambda0;
                SessionGenerator m98getComponents$lambda1;
                SessionFirelogPublisher m99getComponents$lambda2;
                SessionsSettings m100getComponents$lambda3;
                SessionDatastore m101getComponents$lambda4;
                SessionLifecycleServiceBinder m102getComponents$lambda5;
                switch (i8) {
                    case 0:
                        m97getComponents$lambda0 = FirebaseSessionsRegistrar.m97getComponents$lambda0(componentContainer);
                        return m97getComponents$lambda0;
                    case 1:
                        m98getComponents$lambda1 = FirebaseSessionsRegistrar.m98getComponents$lambda1(componentContainer);
                        return m98getComponents$lambda1;
                    case 2:
                        m99getComponents$lambda2 = FirebaseSessionsRegistrar.m99getComponents$lambda2(componentContainer);
                        return m99getComponents$lambda2;
                    case 3:
                        m100getComponents$lambda3 = FirebaseSessionsRegistrar.m100getComponents$lambda3(componentContainer);
                        return m100getComponents$lambda3;
                    case 4:
                        m101getComponents$lambda4 = FirebaseSessionsRegistrar.m101getComponents$lambda4(componentContainer);
                        return m101getComponents$lambda4;
                    default:
                        m102getComponents$lambda5 = FirebaseSessionsRegistrar.m102getComponents$lambda5(componentContainer);
                        return m102getComponents$lambda5;
                }
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME)});
    }
}
