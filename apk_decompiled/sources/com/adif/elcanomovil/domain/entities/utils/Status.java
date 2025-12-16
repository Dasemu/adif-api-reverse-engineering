package com.adif.elcanomovil.domain.entities.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/utils/Status;", "", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "LOADING", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Status {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Status[] $VALUES;
    public static final Status SUCCESS = new Status("SUCCESS", 0);
    public static final Status ERROR = new Status("ERROR", 1);
    public static final Status LOADING = new Status("LOADING", 2);

    private static final /* synthetic */ Status[] $values() {
        return new Status[]{SUCCESS, ERROR, LOADING};
    }

    static {
        Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private Status(String str, int i) {
    }

    public static EnumEntries<Status> getEntries() {
        return $ENTRIES;
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }
}
