package com.adif.elcanomovil.uiMoreAdif;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/MoreActions;", "", "title", "", "(Ljava/lang/String;II)V", "getTitle", "()I", "SUBSCRIPTIONS", "TRAIN", "FAVOURITES", "NOTICES", "HELP", "CONTACT", "ABOUT", "LOST_OBJECTS", "NETWORK_STATUS", "ACCESSIBILITY", "ui-more-adif_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MoreActions {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MoreActions[] $VALUES;
    private final int title;
    public static final MoreActions SUBSCRIPTIONS = new MoreActions("SUBSCRIPTIONS", 0, R.string.option_subscriptions);
    public static final MoreActions TRAIN = new MoreActions("TRAIN", 1, R.string.option_train);
    public static final MoreActions FAVOURITES = new MoreActions("FAVOURITES", 2, R.string.option_favourites);
    public static final MoreActions NOTICES = new MoreActions("NOTICES", 3, R.string.option_notices);
    public static final MoreActions HELP = new MoreActions("HELP", 4, R.string.option_help);
    public static final MoreActions CONTACT = new MoreActions("CONTACT", 5, R.string.option_contact);
    public static final MoreActions ABOUT = new MoreActions("ABOUT", 6, R.string.option_about);
    public static final MoreActions LOST_OBJECTS = new MoreActions("LOST_OBJECTS", 7, R.string.option_lost_objects);
    public static final MoreActions NETWORK_STATUS = new MoreActions("NETWORK_STATUS", 8, R.string.option_network_status);
    public static final MoreActions ACCESSIBILITY = new MoreActions("ACCESSIBILITY", 9, R.string.option_accessibility);

    private static final /* synthetic */ MoreActions[] $values() {
        return new MoreActions[]{SUBSCRIPTIONS, TRAIN, FAVOURITES, NOTICES, HELP, CONTACT, ABOUT, LOST_OBJECTS, NETWORK_STATUS, ACCESSIBILITY};
    }

    static {
        MoreActions[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MoreActions(String str, int i, int i4) {
        this.title = i4;
    }

    public static EnumEntries<MoreActions> getEntries() {
        return $ENTRIES;
    }

    public static MoreActions valueOf(String str) {
        return (MoreActions) Enum.valueOf(MoreActions.class, str);
    }

    public static MoreActions[] values() {
        return (MoreActions[]) $VALUES.clone();
    }

    public final int getTitle() {
        return this.title;
    }

    public /* synthetic */ MoreActions(String str, int i, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i5 & 1) != 0 ? 0 : i4);
    }
}
