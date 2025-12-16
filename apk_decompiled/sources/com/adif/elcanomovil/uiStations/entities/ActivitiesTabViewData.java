package com.adif.elcanomovil.uiStations.entities;

import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/uiStations/entities/ActivitiesTabViewData;", "", "activities", "", "Lcom/adif/elcanomovil/uiStations/entities/Activity;", "(Ljava/util/List;)V", "getActivities", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ActivitiesTabViewData {
    private final List<Activity> activities;

    public ActivitiesTabViewData(List<Activity> list) {
        this.activities = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivitiesTabViewData copy$default(ActivitiesTabViewData activitiesTabViewData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = activitiesTabViewData.activities;
        }
        return activitiesTabViewData.copy(list);
    }

    public final List<Activity> component1() {
        return this.activities;
    }

    public final ActivitiesTabViewData copy(List<Activity> activities) {
        return new ActivitiesTabViewData(activities);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ActivitiesTabViewData) && Intrinsics.areEqual(this.activities, ((ActivitiesTabViewData) other).activities);
    }

    public final List<Activity> getActivities() {
        return this.activities;
    }

    public int hashCode() {
        List<Activity> list = this.activities;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return a.o(new StringBuilder("ActivitiesTabViewData(activities="), this.activities, ')');
    }
}
