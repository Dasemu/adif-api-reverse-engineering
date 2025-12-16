package com.adif.elcanomovil.serviceNetworking.compositions;

import C.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/compositions/Coaches;", "", "cafeteria", "", "coachNumber", "", "coachType", "Lcom/adif/elcanomovil/serviceNetworking/compositions/CoachType;", "sequential", "", "(ZLjava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/compositions/CoachType;I)V", "getCafeteria", "()Z", "getCoachNumber", "()Ljava/lang/String;", "getCoachType", "()Lcom/adif/elcanomovil/serviceNetworking/compositions/CoachType;", "getSequential", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Coaches {
    private final boolean cafeteria;
    private final String coachNumber;
    private final CoachType coachType;
    private final int sequential;

    public Coaches(boolean z3, String str, CoachType coachType, int i) {
        Intrinsics.checkNotNullParameter(coachType, "coachType");
        this.cafeteria = z3;
        this.coachNumber = str;
        this.coachType = coachType;
        this.sequential = i;
    }

    public static /* synthetic */ Coaches copy$default(Coaches coaches, boolean z3, String str, CoachType coachType, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = coaches.cafeteria;
        }
        if ((i4 & 2) != 0) {
            str = coaches.coachNumber;
        }
        if ((i4 & 4) != 0) {
            coachType = coaches.coachType;
        }
        if ((i4 & 8) != 0) {
            i = coaches.sequential;
        }
        return coaches.copy(z3, str, coachType, i);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCafeteria() {
        return this.cafeteria;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCoachNumber() {
        return this.coachNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final CoachType getCoachType() {
        return this.coachType;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSequential() {
        return this.sequential;
    }

    public final Coaches copy(boolean cafeteria, String coachNumber, CoachType coachType, int sequential) {
        Intrinsics.checkNotNullParameter(coachType, "coachType");
        return new Coaches(cafeteria, coachNumber, coachType, sequential);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Coaches)) {
            return false;
        }
        Coaches coaches = (Coaches) other;
        return this.cafeteria == coaches.cafeteria && Intrinsics.areEqual(this.coachNumber, coaches.coachNumber) && this.coachType == coaches.coachType && this.sequential == coaches.sequential;
    }

    public final boolean getCafeteria() {
        return this.cafeteria;
    }

    public final String getCoachNumber() {
        return this.coachNumber;
    }

    public final CoachType getCoachType() {
        return this.coachType;
    }

    public final int getSequential() {
        return this.sequential;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.cafeteria) * 31;
        String str = this.coachNumber;
        return Integer.hashCode(this.sequential) + ((this.coachType.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Coaches(cafeteria=");
        sb.append(this.cafeteria);
        sb.append(", coachNumber=");
        sb.append(this.coachNumber);
        sb.append(", coachType=");
        sb.append(this.coachType);
        sb.append(", sequential=");
        return w.p(sb, this.sequential, ')');
    }
}
