package com.adif.elcanomovil.commonViews;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/commonViews/SnackBarEvents;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "EVENT_TYPE_SHOW", "EVENT_TYPE_DISMISS", "EVENT_TYPE_ONCLICK_ACTION", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackBarEvents {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SnackBarEvents[] $VALUES;
    private final String value;
    public static final SnackBarEvents EVENT_TYPE_SHOW = new SnackBarEvents("EVENT_TYPE_SHOW", 0, "1");
    public static final SnackBarEvents EVENT_TYPE_DISMISS = new SnackBarEvents("EVENT_TYPE_DISMISS", 1, "2");
    public static final SnackBarEvents EVENT_TYPE_ONCLICK_ACTION = new SnackBarEvents("EVENT_TYPE_ONCLICK_ACTION", 2, "3");

    private static final /* synthetic */ SnackBarEvents[] $values() {
        return new SnackBarEvents[]{EVENT_TYPE_SHOW, EVENT_TYPE_DISMISS, EVENT_TYPE_ONCLICK_ACTION};
    }

    static {
        SnackBarEvents[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SnackBarEvents(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries<SnackBarEvents> getEntries() {
        return $ENTRIES;
    }

    public static SnackBarEvents valueOf(String str) {
        return (SnackBarEvents) Enum.valueOf(SnackBarEvents.class, str);
    }

    public static SnackBarEvents[] values() {
        return (SnackBarEvents[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
