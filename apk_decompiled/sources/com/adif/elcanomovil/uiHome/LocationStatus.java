package com.adif.elcanomovil.uiHome;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/uiHome/LocationStatus;", "", "(Ljava/lang/String;I)V", "isEnabled", "", "()Z", "ENABLED", "DISABLED", "PERMISSION_DENIED", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocationStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LocationStatus[] $VALUES;
    public static final LocationStatus ENABLED = new LocationStatus("ENABLED", 0);
    public static final LocationStatus DISABLED = new LocationStatus("DISABLED", 1);
    public static final LocationStatus PERMISSION_DENIED = new LocationStatus("PERMISSION_DENIED", 2);

    private static final /* synthetic */ LocationStatus[] $values() {
        return new LocationStatus[]{ENABLED, DISABLED, PERMISSION_DENIED};
    }

    static {
        LocationStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private LocationStatus(String str, int i) {
    }

    public static EnumEntries<LocationStatus> getEntries() {
        return $ENTRIES;
    }

    public static LocationStatus valueOf(String str) {
        return (LocationStatus) Enum.valueOf(LocationStatus.class, str);
    }

    public static LocationStatus[] values() {
        return (LocationStatus[]) $VALUES.clone();
    }

    public final boolean isEnabled() {
        return this == ENABLED;
    }
}
