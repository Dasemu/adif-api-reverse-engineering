package com.adif.elcanomovil.domain.entities.compositions;

import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/compositions/Coach;", "Lcom/adif/elcanomovil/domain/entities/compositions/Wagon;", "number", "", "(Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Coach extends Wagon {
    private final String number;

    public Coach(String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        this.number = number;
    }

    public static /* synthetic */ Coach copy$default(Coach coach, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coach.number;
        }
        return coach.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public final Coach copy(String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        return new Coach(number);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Coach) && Intrinsics.areEqual(this.number, ((Coach) other).number);
    }

    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        return this.number.hashCode();
    }

    public String toString() {
        return a.n(new StringBuilder("Coach(number="), this.number, ')');
    }
}
