package com.adif.elcanomovil.main;

import com.adif.elcanomovil.commonViews.SnackBarEvents;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class MainActivity$showSnackBar$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SnackBarEvents.values().length];
        try {
            iArr[SnackBarEvents.EVENT_TYPE_DISMISS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SnackBarEvents.EVENT_TYPE_SHOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SnackBarEvents.EVENT_TYPE_ONCLICK_ACTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
