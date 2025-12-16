package com.adif.elcanomovil.domain.entities.station;

import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/station/Accessible;", "", "accessible", "", "description", "", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getAccessible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/adif/elcanomovil/domain/entities/station/Accessible;", "equals", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Accessible {
    private final Boolean accessible;
    private final String description;

    public Accessible(Boolean bool, String str) {
        this.accessible = bool;
        this.description = str;
    }

    public static /* synthetic */ Accessible copy$default(Accessible accessible, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = accessible.accessible;
        }
        if ((i & 2) != 0) {
            str = accessible.description;
        }
        return accessible.copy(bool, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getAccessible() {
        return this.accessible;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Accessible copy(Boolean accessible, String description) {
        return new Accessible(accessible, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Accessible)) {
            return false;
        }
        Accessible accessible = (Accessible) other;
        return Intrinsics.areEqual(this.accessible, accessible.accessible) && Intrinsics.areEqual(this.description, accessible.description);
    }

    public final Boolean getAccessible() {
        return this.accessible;
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        Boolean bool = this.accessible;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.description;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Accessible(accessible=");
        sb.append(this.accessible);
        sb.append(", description=");
        return a.n(sb, this.description, ')');
    }
}
