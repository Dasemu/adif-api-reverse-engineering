package com.adif.elcanomovil.uiAvisa.utils.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/utils/ui/PictureGridType;", "", "(Ljava/lang/String;I)V", "CREATION", "DETAILS", "COMMENTS", "Companion", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PictureGridType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PictureGridType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PictureGridType CREATION = new PictureGridType("CREATION", 0);
    public static final PictureGridType DETAILS = new PictureGridType("DETAILS", 1);
    public static final PictureGridType COMMENTS = new PictureGridType("COMMENTS", 2);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/utils/ui/PictureGridType$Companion;", "", "()V", "fromInt", "Lcom/adif/elcanomovil/uiAvisa/utils/ui/PictureGridType;", "value", "", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PictureGridType fromInt(int value) {
            return value != 1 ? value != 2 ? PictureGridType.CREATION : PictureGridType.COMMENTS : PictureGridType.DETAILS;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PictureGridType[] $values() {
        return new PictureGridType[]{CREATION, DETAILS, COMMENTS};
    }

    static {
        PictureGridType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private PictureGridType(String str, int i) {
    }

    public static EnumEntries<PictureGridType> getEntries() {
        return $ENTRIES;
    }

    public static PictureGridType valueOf(String str) {
        return (PictureGridType) Enum.valueOf(PictureGridType.class, str);
    }

    public static PictureGridType[] values() {
        return (PictureGridType[]) $VALUES.clone();
    }
}
