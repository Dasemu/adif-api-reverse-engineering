package com.adif.elcanomovil.commonNavGraph.arguments;

import com.google.android.gms.measurement.internal.a;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/Filters;", "Ljava/io/Serializable;", "values", "", "Lcom/adif/elcanomovil/commonNavGraph/arguments/Filter;", "(Ljava/util/List;)V", "getValues", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Filters implements Serializable {
    private final List<Filter> values;

    /* JADX WARN: Multi-variable type inference failed */
    public Filters(List<? extends Filter> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Filters copy$default(Filters filters, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = filters.values;
        }
        return filters.copy(list);
    }

    public final List<Filter> component1() {
        return this.values;
    }

    public final Filters copy(List<? extends Filter> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return new Filters(values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Filters) && Intrinsics.areEqual(this.values, ((Filters) other).values);
    }

    public final List<Filter> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return a.o(new StringBuilder("Filters(values="), this.values, ')');
    }
}
