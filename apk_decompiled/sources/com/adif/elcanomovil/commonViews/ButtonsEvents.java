package com.adif.elcanomovil.commonViews;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/commonViews/ButtonsEvents;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "EVENT_TYPE_ONBACK", "EVENT_TYPE_CLOSE", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonsEvents {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ButtonsEvents[] $VALUES;
    private final String value;
    public static final ButtonsEvents EVENT_TYPE_ONBACK = new ButtonsEvents("EVENT_TYPE_ONBACK", 0, "1");
    public static final ButtonsEvents EVENT_TYPE_CLOSE = new ButtonsEvents("EVENT_TYPE_CLOSE", 1, "2");

    private static final /* synthetic */ ButtonsEvents[] $values() {
        return new ButtonsEvents[]{EVENT_TYPE_ONBACK, EVENT_TYPE_CLOSE};
    }

    static {
        ButtonsEvents[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ButtonsEvents(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries<ButtonsEvents> getEntries() {
        return $ENTRIES;
    }

    public static ButtonsEvents valueOf(String str) {
        return (ButtonsEvents) Enum.valueOf(ButtonsEvents.class, str);
    }

    public static ButtonsEvents[] values() {
        return (ButtonsEvents[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
