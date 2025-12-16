package com.adif.elcanomovil.notifications;

import android.content.Context;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationIntents;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes.dex */
public final class DefaultNotificationProvider_Factory implements Factory<DefaultNotificationProvider> {
    private final Provider<Context> contextProvider;
    private final Provider<NavigationIntents> navigationIntentsProvider;
    private final Provider<NotificationPayloadHandler> notificationPayloadHandlerProvider;

    public DefaultNotificationProvider_Factory(Provider<Context> provider, Provider<NotificationPayloadHandler> provider2, Provider<NavigationIntents> provider3) {
        this.contextProvider = provider;
        this.notificationPayloadHandlerProvider = provider2;
        this.navigationIntentsProvider = provider3;
    }

    public static DefaultNotificationProvider_Factory create(Provider<Context> provider, Provider<NotificationPayloadHandler> provider2, Provider<NavigationIntents> provider3) {
        return new DefaultNotificationProvider_Factory(provider, provider2, provider3);
    }

    public static DefaultNotificationProvider newInstance(Context context, NotificationPayloadHandler notificationPayloadHandler, NavigationIntents navigationIntents) {
        return new DefaultNotificationProvider(context, notificationPayloadHandler, navigationIntents);
    }

    @Override // javax.inject.Provider
    public DefaultNotificationProvider get() {
        return newInstance(this.contextProvider.get(), this.notificationPayloadHandlerProvider.get(), this.navigationIntentsProvider.get());
    }
}
