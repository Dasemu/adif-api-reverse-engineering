package com.adif.elcanomovil.di;

import android.content.Context;
import androidx.lifecycle.I;
import com.adif.elcanomovil.domain.usecases.FetchVersionUpdateUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.user.LoginAvisaUserUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.user.RefreshAvisaUserUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.user.RegisterAvisaUserUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationsUseCase;
import com.adif.elcanomovil.lifecycle.DefaultLifecycleProvider;
import com.adif.elcanomovil.notifications.DefaultNotificationPayloadHandler;
import com.adif.elcanomovil.notifications.DefaultNotificationProvider;
import com.adif.elcanomovil.notifications.NotificationPayloadHandler;
import com.adif.elcanomovil.notifications.NotificationProvider;
import com.adif.elcanomovil.observers.ApplicationObserver;
import com.adif.elcanomovil.observers.ComposedApplicationObserver;
import com.adif.elcanomovil.observers.LoggerObserver;
import com.adif.elcanomovil.observers.RemoteConfigurationObserver;
import com.adif.elcanomovil.observers.UpdateStationsObserver;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.adif.elcanomovil.uiAvisa.components.authenticator.AuthenticationProvider;
import com.adif.elcanomovil.uiAvisa.components.authenticator.DefaultAuthenticationProvider;
import com.adif.elcanomovil.widget.DefaultWidgetPayloadHandler;
import com.adif.elcanomovil.widget.WidgetPayloadHandler;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.messaging.FirebaseMessaging;
import d1.g;
import d1.h;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/di/ApplicationModule;", "", "()V", "provideNotificationProvider", "Lcom/adif/elcanomovil/notifications/NotificationProvider;", "impl", "Lcom/adif/elcanomovil/notifications/DefaultNotificationProvider;", "Companion", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes.dex */
public abstract class ApplicationModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020!H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b0\u00101J\u0019\u00105\u001a\u0002042\b\b\u0001\u00103\u001a\u000202H\u0007¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0007¢\u0006\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/adif/elcanomovil/di/ApplicationModule$Companion;", "", "<init>", "()V", "Lcom/adif/elcanomovil/observers/LoggerObserver;", "loggerObserver", "Lcom/adif/elcanomovil/observers/RemoteConfigurationObserver;", "remoteConfigurationObserver", "Lcom/adif/elcanomovil/observers/UpdateStationsObserver;", "updateStationsObserver", "Lcom/adif/elcanomovil/observers/ApplicationObserver;", "provideApplicationObserver", "(Lcom/adif/elcanomovil/observers/LoggerObserver;Lcom/adif/elcanomovil/observers/RemoteConfigurationObserver;Lcom/adif/elcanomovil/observers/UpdateStationsObserver;)Lcom/adif/elcanomovil/observers/ApplicationObserver;", "Landroidx/lifecycle/I;", "provideLifeCicleProvider", "()Landroidx/lifecycle/I;", "Lcom/adif/elcanomovil/notifications/NotificationPayloadHandler;", "provideNotificationPayloadHandler", "()Lcom/adif/elcanomovil/notifications/NotificationPayloadHandler;", "Lcom/adif/elcanomovil/widget/WidgetPayloadHandler;", "provideWidgetPayloadHandler", "()Lcom/adif/elcanomovil/widget/WidgetPayloadHandler;", "Lcom/adif/elcanomovil/domain/usecases/avisa/user/RegisterAvisaUserUseCase;", "registerAvisaUserUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/user/LoginAvisaUserUseCase;", "loginAvisaUserUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/user/RefreshAvisaUserUseCase;", "refreshAvisaUserUseCase", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "preferenceStorage", "Lcom/adif/elcanomovil/uiAvisa/components/authenticator/AuthenticationProvider;", "provideAuthtenticationProvider", "(Lcom/adif/elcanomovil/domain/usecases/avisa/user/RegisterAvisaUserUseCase;Lcom/adif/elcanomovil/domain/usecases/avisa/user/LoginAvisaUserUseCase;Lcom/adif/elcanomovil/domain/usecases/avisa/user/RefreshAvisaUserUseCase;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;)Lcom/adif/elcanomovil/uiAvisa/components/authenticator/AuthenticationProvider;", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "provideFirebaseCrashlytics", "()Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "firebaseCrashlytics", "provideLoggerObserver", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)Lcom/adif/elcanomovil/observers/LoggerObserver;", "Lcom/adif/elcanomovil/domain/usecases/FetchVersionUpdateUseCase;", "fetchVersionUpdateUseCase", "provideRemoteConfigurationObserver", "(Lcom/adif/elcanomovil/domain/usecases/FetchVersionUpdateUseCase;)Lcom/adif/elcanomovil/observers/RemoteConfigurationObserver;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsUseCase;", "getStationsUseCase", "provideUpdateStationsObserver", "(Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsUseCase;)Lcom/adif/elcanomovil/observers/UpdateStationsObserver;", "Ljava/text/DateFormat;", "providesDateFormat", "()Ljava/text/DateFormat;", "Landroid/content/Context;", "context", "Ld1/g;", "provideStringProvider", "(Landroid/content/Context;)Ld1/g;", "Lcom/google/firebase/messaging/FirebaseMessaging;", "provideFirebaseMessaging", "()Lcom/google/firebase/messaging/FirebaseMessaging;", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Provides
        @Singleton
        public final ApplicationObserver provideApplicationObserver(LoggerObserver loggerObserver, RemoteConfigurationObserver remoteConfigurationObserver, UpdateStationsObserver updateStationsObserver) {
            Intrinsics.checkNotNullParameter(loggerObserver, "loggerObserver");
            Intrinsics.checkNotNullParameter(remoteConfigurationObserver, "remoteConfigurationObserver");
            Intrinsics.checkNotNullParameter(updateStationsObserver, "updateStationsObserver");
            return new ComposedApplicationObserver(CollectionsKt.listOf((Object[]) new ApplicationObserver[]{loggerObserver, remoteConfigurationObserver, updateStationsObserver}));
        }

        @Provides
        @Singleton
        public final AuthenticationProvider provideAuthtenticationProvider(RegisterAvisaUserUseCase registerAvisaUserUseCase, LoginAvisaUserUseCase loginAvisaUserUseCase, RefreshAvisaUserUseCase refreshAvisaUserUseCase, PreferenceStorage preferenceStorage) {
            Intrinsics.checkNotNullParameter(registerAvisaUserUseCase, "registerAvisaUserUseCase");
            Intrinsics.checkNotNullParameter(loginAvisaUserUseCase, "loginAvisaUserUseCase");
            Intrinsics.checkNotNullParameter(refreshAvisaUserUseCase, "refreshAvisaUserUseCase");
            Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
            return new DefaultAuthenticationProvider(registerAvisaUserUseCase, loginAvisaUserUseCase, preferenceStorage, refreshAvisaUserUseCase);
        }

        @Provides
        public final FirebaseCrashlytics provideFirebaseCrashlytics() {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
            return firebaseCrashlytics;
        }

        @Provides
        public final FirebaseMessaging provideFirebaseMessaging() {
            FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
            Intrinsics.checkNotNullExpressionValue(firebaseMessaging, "getInstance(...)");
            return firebaseMessaging;
        }

        @Provides
        @Singleton
        public final I provideLifeCicleProvider() {
            return new DefaultLifecycleProvider();
        }

        @Provides
        public final LoggerObserver provideLoggerObserver(FirebaseCrashlytics firebaseCrashlytics) {
            Intrinsics.checkNotNullParameter(firebaseCrashlytics, "firebaseCrashlytics");
            return new LoggerObserver(firebaseCrashlytics);
        }

        @Provides
        @Singleton
        public final NotificationPayloadHandler provideNotificationPayloadHandler() {
            return new DefaultNotificationPayloadHandler();
        }

        @Provides
        public final RemoteConfigurationObserver provideRemoteConfigurationObserver(FetchVersionUpdateUseCase fetchVersionUpdateUseCase) {
            Intrinsics.checkNotNullParameter(fetchVersionUpdateUseCase, "fetchVersionUpdateUseCase");
            return new RemoteConfigurationObserver(fetchVersionUpdateUseCase);
        }

        @Provides
        public final g provideStringProvider(@ApplicationContext Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            return new h(context);
        }

        @Provides
        public final UpdateStationsObserver provideUpdateStationsObserver(GetStationsUseCase getStationsUseCase) {
            Intrinsics.checkNotNullParameter(getStationsUseCase, "getStationsUseCase");
            return new UpdateStationsObserver(getStationsUseCase);
        }

        @Provides
        @Singleton
        public final WidgetPayloadHandler provideWidgetPayloadHandler() {
            return new DefaultWidgetPayloadHandler();
        }

        @Provides
        public final DateFormat providesDateFormat() {
            return new SimpleDateFormat("EEEE, d MMMM", Locale.getDefault());
        }

        private Companion() {
        }
    }

    @Singleton
    @Binds
    public abstract NotificationProvider provideNotificationProvider(DefaultNotificationProvider impl);
}
