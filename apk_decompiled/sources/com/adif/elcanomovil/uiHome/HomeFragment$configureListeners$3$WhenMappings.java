package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class HomeFragment$configureListeners$3$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[StationViewEntity.Type.values().length];
        try {
            iArr[StationViewEntity.Type.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StationViewEntity.Type.WORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
