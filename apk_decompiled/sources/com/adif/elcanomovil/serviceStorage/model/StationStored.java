package com.adif.elcanomovil.serviceStorage.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/model/StationStored;", "", "identifier", "", "(Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "Lcom/adif/elcanomovil/serviceStorage/model/StationStoredEntity;", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class StationStored {
    private final String identifier;

    public /* synthetic */ StationStored(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    private StationStored(String str) {
        this.identifier = str;
    }
}
