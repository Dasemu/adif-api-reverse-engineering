package com.adif.elcanomovil.domain.entities.station;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/station/Locator;", "", "description", "", FirebaseAnalytics.Param.LOCATION, "Lcom/adif/elcanomovil/domain/entities/station/Location;", "(Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/station/Location;)V", "getDescription", "()Ljava/lang/String;", "getLocation", "()Lcom/adif/elcanomovil/domain/entities/station/Location;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Locator {
    private final String description;
    private final Location location;

    public Locator(String str, Location location) {
        this.description = str;
        this.location = location;
    }

    public static /* synthetic */ Locator copy$default(Locator locator, String str, Location location, int i, Object obj) {
        if ((i & 1) != 0) {
            str = locator.description;
        }
        if ((i & 2) != 0) {
            location = locator.location;
        }
        return locator.copy(str, location);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final Location getLocation() {
        return this.location;
    }

    public final Locator copy(String description, Location location) {
        return new Locator(description, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Locator)) {
            return false;
        }
        Locator locator = (Locator) other;
        return Intrinsics.areEqual(this.description, locator.description) && Intrinsics.areEqual(this.location, locator.location);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Location getLocation() {
        return this.location;
    }

    public int hashCode() {
        String str = this.description;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Location location = this.location;
        return hashCode + (location != null ? location.hashCode() : 0);
    }

    public String toString() {
        return "Locator(description=" + this.description + ", location=" + this.location + ')';
    }
}
