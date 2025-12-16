package com.adif.elcanomovil.domain.entities.circulation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/DateHeaderCirculation;", "Lcom/adif/elcanomovil/domain/entities/circulation/Circulation;", "date", "", "showExtended", "", "(Ljava/lang/String;Z)V", "getDate", "()Ljava/lang/String;", "getShowExtended", "()Z", "setShowExtended", "(Z)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DateHeaderCirculation implements Circulation {
    private final String date;
    private boolean showExtended;

    public DateHeaderCirculation(String date, boolean z3) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.date = date;
        this.showExtended = z3;
    }

    public static /* synthetic */ DateHeaderCirculation copy$default(DateHeaderCirculation dateHeaderCirculation, String str, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dateHeaderCirculation.date;
        }
        if ((i & 2) != 0) {
            z3 = dateHeaderCirculation.showExtended;
        }
        return dateHeaderCirculation.copy(str, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowExtended() {
        return this.showExtended;
    }

    public final DateHeaderCirculation copy(String date, boolean showExtended) {
        Intrinsics.checkNotNullParameter(date, "date");
        return new DateHeaderCirculation(date, showExtended);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateHeaderCirculation)) {
            return false;
        }
        DateHeaderCirculation dateHeaderCirculation = (DateHeaderCirculation) other;
        return Intrinsics.areEqual(this.date, dateHeaderCirculation.date) && this.showExtended == dateHeaderCirculation.showExtended;
    }

    public final String getDate() {
        return this.date;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.Circulation
    public boolean getShowExtended() {
        return this.showExtended;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showExtended) + (this.date.hashCode() * 31);
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.Circulation
    public void setShowExtended(boolean z3) {
        this.showExtended = z3;
    }

    public String toString() {
        return "DateHeaderCirculation(date=" + this.date + ", showExtended=" + this.showExtended + ')';
    }

    public /* synthetic */ DateHeaderCirculation(String str, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z3);
    }
}
