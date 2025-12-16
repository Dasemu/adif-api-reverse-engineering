package com.adif.elcanomovil.serviceStorage.utils;

import com.adif.elcanomovil.serviceStorage.database.StationDatabase;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.OriginEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/utils/OriginTypeConverter;", "", "()V", "origiginToString", "", "orderInfo", "Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/OriginEntity;", "stringToOrigin", "value", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OriginTypeConverter {
    public final String origiginToString(OriginEntity orderInfo) {
        return StationDatabase.INSTANCE.getMoshi().a(OriginEntity.class).toJson(orderInfo);
    }

    public final OriginEntity stringToOrigin(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (OriginEntity) StationDatabase.INSTANCE.getMoshi().a(OriginEntity.class).fromJson(value);
    }
}
