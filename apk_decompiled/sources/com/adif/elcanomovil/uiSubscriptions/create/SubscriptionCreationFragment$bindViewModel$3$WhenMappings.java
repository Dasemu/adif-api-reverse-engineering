package com.adif.elcanomovil.uiSubscriptions.create;

import com.adif.elcanomovil.enums.SubscriptionType;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class SubscriptionCreationFragment$bindViewModel$3$WhenMappings {
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
