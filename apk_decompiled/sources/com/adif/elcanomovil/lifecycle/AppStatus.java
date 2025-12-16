package com.adif.elcanomovil.lifecycle;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/lifecycle/AppStatus;", "", "(Ljava/lang/String;I)V", "ON_START", "ON_STOP", "ON_RESUME", "ON_PAUSE", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppStatus[] $VALUES;
    public static final AppStatus ON_START = new AppStatus("ON_START", 0);
    public static final AppStatus ON_STOP = new AppStatus("ON_STOP", 1);
    public static final AppStatus ON_RESUME = new AppStatus("ON_RESUME", 2);
    public static final AppStatus ON_PAUSE = new AppStatus("ON_PAUSE", 3);

    private static final /* synthetic */ AppStatus[] $values() {
        return new AppStatus[]{ON_START, ON_STOP, ON_RESUME, ON_PAUSE};
    }

    static {
        AppStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AppStatus(String str, int i) {
    }

    public static EnumEntries<AppStatus> getEntries() {
        return $ENTRIES;
    }

    public static AppStatus valueOf(String str) {
        return (AppStatus) Enum.valueOf(AppStatus.class, str);
    }

    public static AppStatus[] values() {
        return (AppStatus[]) $VALUES.clone();
    }
}
