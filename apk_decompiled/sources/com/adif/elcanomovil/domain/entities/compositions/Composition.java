package com.adif.elcanomovil.domain.entities.compositions;

import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/compositions/Composition;", "", "stationCode", "", "plannedTime", "", "coachs", "", "Lcom/adif/elcanomovil/domain/entities/compositions/Wagon;", "(Ljava/lang/String;JLjava/util/List;)V", "getCoachs", "()Ljava/util/List;", "getPlannedTime", "()J", "getStationCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Composition {
    private final List<Wagon> coachs;
    private final long plannedTime;
    private final String stationCode;

    /* JADX WARN: Multi-variable type inference failed */
    public Composition(String stationCode, long j4, List<? extends Wagon> coachs) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(coachs, "coachs");
        this.stationCode = stationCode;
        this.plannedTime = j4;
        this.coachs = coachs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Composition copy$default(Composition composition, String str, long j4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = composition.stationCode;
        }
        if ((i & 2) != 0) {
            j4 = composition.plannedTime;
        }
        if ((i & 4) != 0) {
            list = composition.coachs;
        }
        return composition.copy(str, j4, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component2, reason: from getter */
    public final long getPlannedTime() {
        return this.plannedTime;
    }

    public final List<Wagon> component3() {
        return this.coachs;
    }

    public final Composition copy(String stationCode, long plannedTime, List<? extends Wagon> coachs) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(coachs, "coachs");
        return new Composition(stationCode, plannedTime, coachs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Composition)) {
            return false;
        }
        Composition composition = (Composition) other;
        return Intrinsics.areEqual(this.stationCode, composition.stationCode) && this.plannedTime == composition.plannedTime && Intrinsics.areEqual(this.coachs, composition.coachs);
    }

    public final List<Wagon> getCoachs() {
        return this.coachs;
    }

    public final long getPlannedTime() {
        return this.plannedTime;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public int hashCode() {
        return this.coachs.hashCode() + a.b(this.plannedTime, this.stationCode.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Composition(stationCode=");
        sb.append(this.stationCode);
        sb.append(", plannedTime=");
        sb.append(this.plannedTime);
        sb.append(", coachs=");
        return a.o(sb, this.coachs, ')');
    }
}
