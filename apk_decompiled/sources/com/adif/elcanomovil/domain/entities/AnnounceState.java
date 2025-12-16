package com.adif.elcanomovil.domain.entities;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/AnnounceState;", "", "(Ljava/lang/String;I)V", "NORMAL", "MUTED", "DISABLED", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnnounceState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnnounceState[] $VALUES;
    public static final AnnounceState NORMAL = new AnnounceState("NORMAL", 0);
    public static final AnnounceState MUTED = new AnnounceState("MUTED", 1);
    public static final AnnounceState DISABLED = new AnnounceState("DISABLED", 2);

    private static final /* synthetic */ AnnounceState[] $values() {
        return new AnnounceState[]{NORMAL, MUTED, DISABLED};
    }

    static {
        AnnounceState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AnnounceState(String str, int i) {
    }

    public static EnumEntries<AnnounceState> getEntries() {
        return $ENTRIES;
    }

    public static AnnounceState valueOf(String str) {
        return (AnnounceState) Enum.valueOf(AnnounceState.class, str);
    }

    public static AnnounceState[] values() {
        return (AnnounceState[]) $VALUES.clone();
    }
}
