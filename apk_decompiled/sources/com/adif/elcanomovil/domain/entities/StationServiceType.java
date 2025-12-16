package com.adif.elcanomovil.domain.entities;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/StationServiceType;", "", FirebaseAnalytics.Param.INDEX, "", "(Ljava/lang/String;II)V", "getIndex", "()I", "SERVICES", "COMMERCIAL", "Companion", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StationServiceType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StationServiceType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int index;
    public static final StationServiceType SERVICES = new StationServiceType("SERVICES", 0, 0);
    public static final StationServiceType COMMERCIAL = new StationServiceType("COMMERCIAL", 1, 1);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/StationServiceType$Companion;", "", "()V", "fromInt", "Lcom/adif/elcanomovil/domain/entities/StationServiceType;", "value", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCirculationType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CirculationType.kt\ncom/adif/elcanomovil/domain/entities/StationServiceType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,30:1\n1282#2,2:31\n*S KotlinDebug\n*F\n+ 1 CirculationType.kt\ncom/adif/elcanomovil/domain/entities/StationServiceType$Companion\n*L\n27#1:31,2\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StationServiceType fromInt(int value) {
            for (StationServiceType stationServiceType : StationServiceType.values()) {
                if (stationServiceType.getIndex() == value) {
                    return stationServiceType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ StationServiceType[] $values() {
        return new StationServiceType[]{SERVICES, COMMERCIAL};
    }

    static {
        StationServiceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private StationServiceType(String str, int i, int i4) {
        this.index = i4;
    }

    public static EnumEntries<StationServiceType> getEntries() {
        return $ENTRIES;
    }

    public static StationServiceType valueOf(String str) {
        return (StationServiceType) Enum.valueOf(StationServiceType.class, str);
    }

    public static StationServiceType[] values() {
        return (StationServiceType[]) $VALUES.clone();
    }

    public final int getIndex() {
        return this.index;
    }
}
