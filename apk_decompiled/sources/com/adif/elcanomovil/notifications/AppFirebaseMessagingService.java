package com.adif.elcanomovil.notifications;

import android.os.Bundle;
import com.adif.elcanomovil.domain.providers.PushIdTokenProvider;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import t3.c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/adif/elcanomovil/notifications/AppFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "notificationProvide", "Lcom/adif/elcanomovil/notifications/NotificationProvider;", "onCreate", "", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "", "MyMessagingServiceInterface", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppFirebaseMessagingService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppFirebaseMessagingService.kt\ncom/adif/elcanomovil/notifications/AppFirebaseMessagingService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* loaded from: classes.dex */
public final class AppFirebaseMessagingService extends FirebaseMessagingService {
    private NotificationProvider notificationProvide;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/notifications/AppFirebaseMessagingService$MyMessagingServiceInterface;", "", "notificationProvider", "Lcom/adif/elcanomovil/notifications/NotificationProvider;", "getNotificationProvider", "()Lcom/adif/elcanomovil/notifications/NotificationProvider;", "tokenProvider", "Lcom/adif/elcanomovil/domain/providers/PushIdTokenProvider;", "getTokenProvider", "()Lcom/adif/elcanomovil/domain/providers/PushIdTokenProvider;", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InstallIn({SingletonComponent.class})
    @EntryPoint
    /* loaded from: classes.dex */
    public interface MyMessagingServiceInterface {
        NotificationProvider getNotificationProvider();

        PushIdTokenProvider getTokenProvider();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Object obj = EntryPoints.get(getApplicationContext(), MyMessagingServiceInterface.class);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        this.notificationProvide = ((MyMessagingServiceInterface) obj).getNotificationProvider();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        remoteMessage.getNotification();
        Bundle extras = remoteMessage.toIntent().getExtras();
        if (extras != null) {
            NotificationProvider notificationProvider = this.notificationProvide;
            if (notificationProvider == null) {
                Intrinsics.throwUninitializedPropertyAccessException("notificationProvide");
                notificationProvider = null;
            }
            notificationProvider.handleNotification(extras);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        Unit unit;
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
        Object obj = EntryPoints.get(getApplicationContext(), MyMessagingServiceInterface.class);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        PushIdTokenProvider tokenProvider = ((MyMessagingServiceInterface) obj).getTokenProvider();
        if (getBaseContext() != null) {
            tokenProvider.saveToken(token);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            Intrinsics.checkNotNullParameter("TOKEN FIREBASE NOT SET since baseContext is null", "message");
            c.f8551a.e("TOKEN FIREBASE NOT SET since baseContext is null", new Object[0]);
        }
    }
}
