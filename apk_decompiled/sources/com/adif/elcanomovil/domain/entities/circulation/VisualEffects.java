package com.adif.elcanomovil.domain.entities.circulation;

import C.w;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/VisualEffects;", "", "inmediateDeparture", "", "countDown", "showDelay", "(ZZZ)V", "getCountDown", "()Z", "getInmediateDeparture", "getShowDelay", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class VisualEffects {
    private final boolean countDown;
    private final boolean inmediateDeparture;
    private final boolean showDelay;

    public VisualEffects(boolean z3, boolean z4, boolean z5) {
        this.inmediateDeparture = z3;
        this.countDown = z4;
        this.showDelay = z5;
    }

    public static /* synthetic */ VisualEffects copy$default(VisualEffects visualEffects, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = visualEffects.inmediateDeparture;
        }
        if ((i & 2) != 0) {
            z4 = visualEffects.countDown;
        }
        if ((i & 4) != 0) {
            z5 = visualEffects.showDelay;
        }
        return visualEffects.copy(z3, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getInmediateDeparture() {
        return this.inmediateDeparture;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCountDown() {
        return this.countDown;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowDelay() {
        return this.showDelay;
    }

    public final VisualEffects copy(boolean inmediateDeparture, boolean countDown, boolean showDelay) {
        return new VisualEffects(inmediateDeparture, countDown, showDelay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisualEffects)) {
            return false;
        }
        VisualEffects visualEffects = (VisualEffects) other;
        return this.inmediateDeparture == visualEffects.inmediateDeparture && this.countDown == visualEffects.countDown && this.showDelay == visualEffects.showDelay;
    }

    public final boolean getCountDown() {
        return this.countDown;
    }

    public final boolean getInmediateDeparture() {
        return this.inmediateDeparture;
    }

    public final boolean getShowDelay() {
        return this.showDelay;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showDelay) + w.c(Boolean.hashCode(this.inmediateDeparture) * 31, 31, this.countDown);
    }

    public String toString() {
        return "VisualEffects(inmediateDeparture=" + this.inmediateDeparture + ", countDown=" + this.countDown + ", showDelay=" + this.showDelay + ')';
    }
}
