package com.adif.elcanomovil.uiDepartures.adapters;

import androidx.recyclerview.widget.AbstractC0211d;
import com.adif.elcanomovil.domain.entities.circulation.AvldmdCirculation;
import com.adif.elcanomovil.domain.entities.circulation.CercaniasCirculation;
import com.adif.elcanomovil.domain.entities.circulation.Circulation;
import com.adif.elcanomovil.domain.entities.circulation.DateHeaderCirculation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends AbstractC0211d {
    @Override // androidx.recyclerview.widget.AbstractC0211d
    public final boolean a(Object obj, Object obj2) {
        Circulation oldItem = (Circulation) obj;
        Circulation newItem = (Circulation) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof DateHeaderCirculation) && (newItem instanceof DateHeaderCirculation)) {
            return Intrinsics.areEqual(((DateHeaderCirculation) oldItem).getDate(), ((DateHeaderCirculation) newItem).getDate());
        }
        if ((oldItem instanceof CercaniasCirculation) && (newItem instanceof CercaniasCirculation)) {
            CercaniasCirculation cercaniasCirculation = (CercaniasCirculation) oldItem;
            CercaniasCirculation cercaniasCirculation2 = (CercaniasCirculation) newItem;
            return Intrinsics.areEqual(cercaniasCirculation.getPlatform(), cercaniasCirculation2.getPlatform()) && Intrinsics.areEqual(cercaniasCirculation.getStationShortName(), cercaniasCirculation2.getStationShortName()) && Intrinsics.areEqual(cercaniasCirculation.getTime(), cercaniasCirculation2.getTime()) && Intrinsics.areEqual(cercaniasCirculation.getObservation(), cercaniasCirculation2.getObservation()) && Intrinsics.areEqual(cercaniasCirculation.getLine(), cercaniasCirculation2.getLine()) && Intrinsics.areEqual(cercaniasCirculation.getPlatform(), cercaniasCirculation2.getPlatform());
        }
        if (!(oldItem instanceof AvldmdCirculation) || !(newItem instanceof AvldmdCirculation)) {
            return false;
        }
        AvldmdCirculation avldmdCirculation = (AvldmdCirculation) oldItem;
        AvldmdCirculation avldmdCirculation2 = (AvldmdCirculation) newItem;
        return Intrinsics.areEqual(avldmdCirculation.getPlatform(), avldmdCirculation2.getPlatform()) && Intrinsics.areEqual(avldmdCirculation.getStationShortName(), avldmdCirculation2.getStationShortName()) && Intrinsics.areEqual(avldmdCirculation.getTime(), avldmdCirculation2.getTime()) && Intrinsics.areEqual(avldmdCirculation.getObservation(), avldmdCirculation2.getObservation()) && Intrinsics.areEqual(avldmdCirculation.getPlatform(), avldmdCirculation2.getPlatform());
    }

    @Override // androidx.recyclerview.widget.AbstractC0211d
    public final boolean b(Object obj, Object obj2) {
        Circulation oldItem = (Circulation) obj;
        Circulation newItem = (Circulation) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof DateHeaderCirculation) && (newItem instanceof DateHeaderCirculation)) {
            return Intrinsics.areEqual(((DateHeaderCirculation) oldItem).getDate(), ((DateHeaderCirculation) newItem).getDate());
        }
        if ((oldItem instanceof CercaniasCirculation) && (newItem instanceof CercaniasCirculation)) {
            CercaniasCirculation cercaniasCirculation = (CercaniasCirculation) oldItem;
            CercaniasCirculation cercaniasCirculation2 = (CercaniasCirculation) newItem;
            return Intrinsics.areEqual(cercaniasCirculation.getTrainCirculation().getCommercialNumber(), cercaniasCirculation2.getTrainCirculation().getCommercialNumber()) && Intrinsics.areEqual(cercaniasCirculation.getTrainCirculation().getLaunchingDate(), cercaniasCirculation2.getTrainCirculation().getLaunchingDate());
        }
        if (!(oldItem instanceof AvldmdCirculation) || !(newItem instanceof AvldmdCirculation)) {
            return false;
        }
        AvldmdCirculation avldmdCirculation = (AvldmdCirculation) oldItem;
        AvldmdCirculation avldmdCirculation2 = (AvldmdCirculation) newItem;
        return Intrinsics.areEqual(avldmdCirculation.getTrainCirculation().getCommercialNumber(), avldmdCirculation2.getTrainCirculation().getCommercialNumber()) && Intrinsics.areEqual(avldmdCirculation.getTrainCirculation().getLaunchingDate(), avldmdCirculation2.getTrainCirculation().getLaunchingDate());
    }
}
