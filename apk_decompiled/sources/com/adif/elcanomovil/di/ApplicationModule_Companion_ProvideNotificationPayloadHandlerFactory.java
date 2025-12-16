package com.adif.elcanomovil.di;

import com.adif.elcanomovil.notifications.NotificationPayloadHandler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import g1.d;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ApplicationModule_Companion_ProvideNotificationPayloadHandlerFactory implements Factory<NotificationPayloadHandler> {
    public static ApplicationModule_Companion_ProvideNotificationPayloadHandlerFactory create() {
        return d.f6739a;
    }

    public static NotificationPayloadHandler provideNotificationPayloadHandler() {
        return (NotificationPayloadHandler) Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideNotificationPayloadHandler());
    }

    @Override // javax.inject.Provider
    public NotificationPayloadHandler get() {
        return provideNotificationPayloadHandler();
    }
}
