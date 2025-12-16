package com.adif.elcanomovil.notifications;

import android.os.Bundle;
import com.adif.elcanomovil.domain.entities.notifications.NotificationPayload;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/notifications/NotificationProvider;", "", "notifications", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload;", "getNotifications", "()Lkotlinx/coroutines/flow/Flow;", "handleNotification", "", "message", "Landroid/os/Bundle;", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface NotificationProvider {
    Flow<NotificationPayload> getNotifications();

    void handleNotification(Bundle message);
}
