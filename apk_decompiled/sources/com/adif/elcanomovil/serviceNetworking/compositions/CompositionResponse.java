package com.adif.elcanomovil.serviceNetworking.compositions;

import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/compositions/CompositionResponse;", "", "compositions", "", "Lcom/adif/elcanomovil/serviceNetworking/compositions/Composition;", "(Ljava/util/List;)V", "getCompositions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CompositionResponse {
    private final List<Composition> compositions;

    public CompositionResponse(List<Composition> list) {
        this.compositions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompositionResponse copy$default(CompositionResponse compositionResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = compositionResponse.compositions;
        }
        return compositionResponse.copy(list);
    }

    public final List<Composition> component1() {
        return this.compositions;
    }

    public final CompositionResponse copy(List<Composition> compositions) {
        return new CompositionResponse(compositions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CompositionResponse) && Intrinsics.areEqual(this.compositions, ((CompositionResponse) other).compositions);
    }

    public final List<Composition> getCompositions() {
        return this.compositions;
    }

    public int hashCode() {
        List<Composition> list = this.compositions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return a.o(new StringBuilder("CompositionResponse(compositions="), this.compositions, ')');
    }
}
