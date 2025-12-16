package com.adif.elcanomovil.uiSelectStation.main;

import androidx.recyclerview.widget.AbstractC0211d;
import com.adif.elcanomovil.domain.entities.station.Station;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends AbstractC0211d {
    @Override // androidx.recyclerview.widget.AbstractC0211d
    public final boolean a(Object obj, Object obj2) {
        Station oldItem = (Station) obj;
        Station newItem = (Station) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.getStationCode(), newItem.getStationCode());
    }

    @Override // androidx.recyclerview.widget.AbstractC0211d
    public final boolean b(Object obj, Object obj2) {
        Station oldItem = (Station) obj;
        Station newItem = (Station) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }
}
