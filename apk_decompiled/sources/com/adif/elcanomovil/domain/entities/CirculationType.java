package com.adif.elcanomovil.domain.entities;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/CirculationType;", "", "tabPosition", "", "(Ljava/lang/String;II)V", "getTabPosition", "()I", "isDeparture", "", "DEPARTURE", "ARRIVAL", "BETWEEN_STATIONS", "Companion", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CirculationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CirculationType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int tabPosition;
    public static final CirculationType DEPARTURE = new CirculationType("DEPARTURE", 0, 0);
    public static final CirculationType ARRIVAL = new CirculationType("ARRIVAL", 1, 1);
    public static final CirculationType BETWEEN_STATIONS = new CirculationType("BETWEEN_STATIONS", 2, 2);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/CirculationType$Companion;", "", "()V", "fromInt", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "value", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCirculationType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CirculationType.kt\ncom/adif/elcanomovil/domain/entities/CirculationType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,30:1\n1282#2,2:31\n*S KotlinDebug\n*F\n+ 1 CirculationType.kt\ncom/adif/elcanomovil/domain/entities/CirculationType$Companion\n*L\n16#1:31,2\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CirculationType fromInt(int value) {
            for (CirculationType circulationType : CirculationType.values()) {
                if (circulationType.getTabPosition() == value) {
                    return circulationType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ CirculationType[] $values() {
        return new CirculationType[]{DEPARTURE, ARRIVAL, BETWEEN_STATIONS};
    }

    static {
        CirculationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private CirculationType(String str, int i, int i4) {
        this.tabPosition = i4;
    }

    public static EnumEntries<CirculationType> getEntries() {
        return $ENTRIES;
    }

    public static CirculationType valueOf(String str) {
        return (CirculationType) Enum.valueOf(CirculationType.class, str);
    }

    public static CirculationType[] values() {
        return (CirculationType[]) $VALUES.clone();
    }

    public final int getTabPosition() {
        return this.tabPosition;
    }

    public final boolean isDeparture() {
        return this == DEPARTURE || this == BETWEEN_STATIONS;
    }
}
