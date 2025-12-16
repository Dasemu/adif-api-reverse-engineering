package com.adif.elcanomovil.uiSubscriptions.create.views;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/create/views/JourneyAction;", "", "(Ljava/lang/String;I)V", "SEARCH", "SEARCH_TO", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JourneyAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ JourneyAction[] $VALUES;
    public static final JourneyAction SEARCH = new JourneyAction("SEARCH", 0);
    public static final JourneyAction SEARCH_TO = new JourneyAction("SEARCH_TO", 1);

    private static final /* synthetic */ JourneyAction[] $values() {
        return new JourneyAction[]{SEARCH, SEARCH_TO};
    }

    static {
        JourneyAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private JourneyAction(String str, int i) {
    }

    public static EnumEntries<JourneyAction> getEntries() {
        return $ENTRIES;
    }

    public static JourneyAction valueOf(String str) {
        return (JourneyAction) Enum.valueOf(JourneyAction.class, str);
    }

    public static JourneyAction[] values() {
        return (JourneyAction[]) $VALUES.clone();
    }
}
