package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.domain.entities.subscription.SubscriptionType;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class DefaultSubscriptionsRepository$create$1$response$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SubscriptionType.values().length];
        try {
            iArr[SubscriptionType.JOURNEY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubscriptionType.TRAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
