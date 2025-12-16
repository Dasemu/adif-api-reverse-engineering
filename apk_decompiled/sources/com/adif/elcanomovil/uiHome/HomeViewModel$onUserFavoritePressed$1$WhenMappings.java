package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.domain.entities.DataType;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class HomeViewModel$onUserFavoritePressed$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[DataType.values().length];
        try {
            iArr[DataType.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DataType.DEPARTURES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DataType.ARRIVALS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DataType.ROUTE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DataType.COMMERCIAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
