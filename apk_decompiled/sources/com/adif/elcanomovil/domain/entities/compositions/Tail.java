package com.adif.elcanomovil.domain.entities.compositions;

import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/compositions/Tail;", "Lcom/adif/elcanomovil/domain/entities/compositions/Wagon;", "number", "", "(Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Tail extends Wagon {
    private final String number;

    /* JADX WARN: Multi-variable type inference failed */
    public Tail() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Tail copy$default(Tail tail, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tail.number;
        }
        return tail.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public final Tail copy(String number) {
        return new Tail(number);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Tail) && Intrinsics.areEqual(this.number, ((Tail) other).number);
    }

    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        String str = this.number;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return a.n(new StringBuilder("Tail(number="), this.number, ')');
    }

    public Tail(String str) {
        this.number = str;
    }

    public /* synthetic */ Tail(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
