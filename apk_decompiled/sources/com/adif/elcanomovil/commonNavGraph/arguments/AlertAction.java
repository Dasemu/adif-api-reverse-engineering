package com.adif.elcanomovil.commonNavGraph.arguments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction;", "", "title", "", "style", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;", "(Ljava/lang/String;Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;)V", "getStyle", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Style", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AlertAction {
    private final Style style;
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;", "", "(Ljava/lang/String;I)V", "NEGATIVE", "POSITIVE", "NEUTRAL", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Style {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style NEGATIVE = new Style("NEGATIVE", 0);
        public static final Style POSITIVE = new Style("POSITIVE", 1);
        public static final Style NEUTRAL = new Style("NEUTRAL", 2);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{NEGATIVE, POSITIVE, NEUTRAL};
        }

        static {
            Style[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Style(String str, int i) {
        }

        public static EnumEntries<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public AlertAction(String title, Style style) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        this.title = title;
        this.style = style;
    }

    public static /* synthetic */ AlertAction copy$default(AlertAction alertAction, String str, Style style, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alertAction.title;
        }
        if ((i & 2) != 0) {
            style = alertAction.style;
        }
        return alertAction.copy(str, style);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    public final AlertAction copy(String title, Style style) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        return new AlertAction(title, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertAction)) {
            return false;
        }
        AlertAction alertAction = (AlertAction) other;
        return Intrinsics.areEqual(this.title, alertAction.title) && this.style == alertAction.style;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.style.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return "AlertAction(title=" + this.title + ", style=" + this.style + ')';
    }
}
