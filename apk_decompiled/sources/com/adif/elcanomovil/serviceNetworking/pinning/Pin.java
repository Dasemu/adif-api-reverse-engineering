package com.adif.elcanomovil.serviceNetworking.pinning;

import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/pinning/Pin;", "", "pattern", "", "hash", "(Ljava/lang/String;Ljava/lang/String;)V", "getHash", "()Ljava/lang/String;", "getPattern", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Pin {
    private final String hash;
    private final String pattern;

    public Pin(String pattern, String hash) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(hash, "hash");
        this.pattern = pattern;
        this.hash = hash;
    }

    public static /* synthetic */ Pin copy$default(Pin pin, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pin.pattern;
        }
        if ((i & 2) != 0) {
            str2 = pin.hash;
        }
        return pin.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPattern() {
        return this.pattern;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    public final Pin copy(String pattern, String hash) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(hash, "hash");
        return new Pin(pattern, hash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pin)) {
            return false;
        }
        Pin pin = (Pin) other;
        return Intrinsics.areEqual(this.pattern, pin.pattern) && Intrinsics.areEqual(this.hash, pin.hash);
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getPattern() {
        return this.pattern;
    }

    public int hashCode() {
        return this.hash.hashCode() + (this.pattern.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Pin(pattern=");
        sb.append(this.pattern);
        sb.append(", hash=");
        return a.n(sb, this.hash, ')');
    }
}
