package com.adif.elcanomovil.serviceNetworking.compositions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/compositions/CoachType;", "", "(Ljava/lang/String;I)V", "COACH", "TRACTOR", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoachType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CoachType[] $VALUES;
    public static final CoachType COACH = new CoachType("COACH", 0);
    public static final CoachType TRACTOR = new CoachType("TRACTOR", 1);

    private static final /* synthetic */ CoachType[] $values() {
        return new CoachType[]{COACH, TRACTOR};
    }

    static {
        CoachType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CoachType(String str, int i) {
    }

    public static EnumEntries<CoachType> getEntries() {
        return $ENTRIES;
    }

    public static CoachType valueOf(String str) {
        return (CoachType) Enum.valueOf(CoachType.class, str);
    }

    public static CoachType[] values() {
        return (CoachType[]) $VALUES.clone();
    }
}
