package com.adif.elcanomovil.serviceStorage.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/model/OperatorLogoValidityEntity;", "", "key", "", "epoch", "", "(Ljava/lang/String;J)V", "getEpoch", "()J", "setEpoch", "(J)V", "getKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OperatorLogoValidityEntity {
    private long epoch;
    private final String key;

    public OperatorLogoValidityEntity(String key, long j4) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.epoch = j4;
    }

    public static /* synthetic */ OperatorLogoValidityEntity copy$default(OperatorLogoValidityEntity operatorLogoValidityEntity, String str, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = operatorLogoValidityEntity.key;
        }
        if ((i & 2) != 0) {
            j4 = operatorLogoValidityEntity.epoch;
        }
        return operatorLogoValidityEntity.copy(str, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEpoch() {
        return this.epoch;
    }

    public final OperatorLogoValidityEntity copy(String key, long epoch) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new OperatorLogoValidityEntity(key, epoch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OperatorLogoValidityEntity)) {
            return false;
        }
        OperatorLogoValidityEntity operatorLogoValidityEntity = (OperatorLogoValidityEntity) other;
        return Intrinsics.areEqual(this.key, operatorLogoValidityEntity.key) && this.epoch == operatorLogoValidityEntity.epoch;
    }

    public final long getEpoch() {
        return this.epoch;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return Long.hashCode(this.epoch) + (this.key.hashCode() * 31);
    }

    public final void setEpoch(long j4) {
        this.epoch = j4;
    }

    public String toString() {
        return "OperatorLogoValidityEntity(key=" + this.key + ", epoch=" + this.epoch + ')';
    }
}
