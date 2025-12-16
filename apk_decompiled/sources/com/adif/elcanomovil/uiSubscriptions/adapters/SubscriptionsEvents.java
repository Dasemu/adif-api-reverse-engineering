package com.adif.elcanomovil.uiSubscriptions.adapters;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/adapters/SubscriptionsEvents;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "EVENT_TYPE_SHOW_DETAIL", "EVENT_TYPE_ENABLE_SUBSCRIPTION", "EVENT_TYPE_DISABLE_SUBSCRIPTION", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionsEvents {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubscriptionsEvents[] $VALUES;
    private final String value;
    public static final SubscriptionsEvents EVENT_TYPE_SHOW_DETAIL = new SubscriptionsEvents("EVENT_TYPE_SHOW_DETAIL", 0, "1");
    public static final SubscriptionsEvents EVENT_TYPE_ENABLE_SUBSCRIPTION = new SubscriptionsEvents("EVENT_TYPE_ENABLE_SUBSCRIPTION", 1, "2");
    public static final SubscriptionsEvents EVENT_TYPE_DISABLE_SUBSCRIPTION = new SubscriptionsEvents("EVENT_TYPE_DISABLE_SUBSCRIPTION", 2, "3");

    private static final /* synthetic */ SubscriptionsEvents[] $values() {
        return new SubscriptionsEvents[]{EVENT_TYPE_SHOW_DETAIL, EVENT_TYPE_ENABLE_SUBSCRIPTION, EVENT_TYPE_DISABLE_SUBSCRIPTION};
    }

    static {
        SubscriptionsEvents[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SubscriptionsEvents(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries<SubscriptionsEvents> getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionsEvents valueOf(String str) {
        return (SubscriptionsEvents) Enum.valueOf(SubscriptionsEvents.class, str);
    }

    public static SubscriptionsEvents[] values() {
        return (SubscriptionsEvents[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
