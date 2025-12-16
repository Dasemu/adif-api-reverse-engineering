package com.adif.elcanomovil.uiSubscriptions.home;

import com.adif.elcanomovil.uiSubscriptions.adapters.SubscriptionsEvents;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class SubscriptionHomeFragment$prepareRecycler$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SubscriptionsEvents.values().length];
        try {
            iArr[SubscriptionsEvents.EVENT_TYPE_SHOW_DETAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubscriptionsEvents.EVENT_TYPE_ENABLE_SUBSCRIPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SubscriptionsEvents.EVENT_TYPE_DISABLE_SUBSCRIPTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
