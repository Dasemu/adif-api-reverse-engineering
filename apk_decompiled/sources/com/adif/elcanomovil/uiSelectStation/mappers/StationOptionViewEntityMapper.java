package com.adif.elcanomovil.uiSelectStation.mappers;

import com.adif.elcanomovil.commonViews.data.StationOptionViewEntity;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.uiSelectStation.R;
import com.google.firebase.messaging.Constants;
import d1.g;
import d1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/uiSelectStation/mappers/StationOptionViewEntityMapper;", "", "<init>", "()V", "Ld1/g;", "stringProvider", "", "typeTraffic", "", "paintTypeTraffic", "(Ld1/g;I)Ljava/lang/String;", "Lcom/adif/elcanomovil/domain/entities/station/Station;", Constants.MessagePayloadKeys.FROM, "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;", "type", "Lcom/adif/elcanomovil/commonViews/data/StationOptionViewEntity;", "map", "(Lcom/adif/elcanomovil/domain/entities/station/Station;Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;Ld1/g;)Lcom/adif/elcanomovil/commonViews/data/StationOptionViewEntity;", "ui-select-station_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStationOptionViewEntityMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationOptionViewEntityMapper.kt\ncom/adif/elcanomovil/uiSelectStation/mappers/StationOptionViewEntityMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* loaded from: classes2.dex */
public final class StationOptionViewEntityMapper {
    public static final StationOptionViewEntityMapper INSTANCE = new StationOptionViewEntityMapper();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StationViewEntity.TypeTraffic.values().length];
            try {
                iArr[StationViewEntity.TypeTraffic.CERCANIAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StationViewEntity.TypeTraffic.AVLDMD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StationViewEntity.TypeTraffic.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private StationOptionViewEntityMapper() {
    }

    private final String paintTypeTraffic(g stringProvider, int typeTraffic) {
        StationViewEntity.TypeTraffic invoke = StationViewEntity.TypeTraffic.INSTANCE.invoke(typeTraffic);
        int i = invoke == null ? -1 : WhenMappings.$EnumSwitchMapping$0[invoke.ordinal()];
        if (i == 1) {
            return ((h) stringProvider).a(R.string.circulation_traintype_cercanias);
        }
        if (i == 2) {
            return ((h) stringProvider).a(R.string.circulation_traintype_others);
        }
        if (i != 3) {
            return "";
        }
        return ((h) stringProvider).a(R.string.circulation_traintype_both);
    }

    public final StationOptionViewEntity map(Station from, StationViewEntity.Type type, g stringProvider) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(stringProvider, "stringProvider");
        if (from != null) {
            return new StationOptionViewEntity(from.getStationCode(), from.getShortName(), INSTANCE.paintTypeTraffic(stringProvider, from.getTrafficType()), type, false, from.getDistance(), from.getCommercialZoneType(), 16, null);
        }
        return null;
    }
}
