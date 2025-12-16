package com.adif.elcanomovil.uiSelectTrain.main;

import com.adif.elcanomovil.domain.entities.utils.Status;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class SelectTrainViewModel$fetchTrain$1$2$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Status.values().length];
        try {
            iArr[Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Status.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Status.LOADING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
