package com.adif.elcanomovil.domain.entities.avisa.incidence;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceNotificationType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NOT_USED", "NOTIFICATION_TYPE_PUSH_NOTIFICATION", "UNKNOWN", "Companion", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IncidenceNotificationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IncidenceNotificationType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final IncidenceNotificationType NOT_USED = new IncidenceNotificationType("NOT_USED", 0, 1);
    public static final IncidenceNotificationType NOTIFICATION_TYPE_PUSH_NOTIFICATION = new IncidenceNotificationType("NOTIFICATION_TYPE_PUSH_NOTIFICATION", 1, 5);
    public static final IncidenceNotificationType UNKNOWN = new IncidenceNotificationType("UNKNOWN", 2, -1);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceNotificationType$Companion;", "", "()V", "invoke", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceNotificationType;", "rawValue", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nIncidenceNotificationType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IncidenceNotificationType.kt\ncom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceNotificationType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,12:1\n1#2:13\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IncidenceNotificationType invoke(int rawValue) {
            for (IncidenceNotificationType incidenceNotificationType : IncidenceNotificationType.values()) {
                if (incidenceNotificationType.getValue() == rawValue) {
                    return incidenceNotificationType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ IncidenceNotificationType[] $values() {
        return new IncidenceNotificationType[]{NOT_USED, NOTIFICATION_TYPE_PUSH_NOTIFICATION, UNKNOWN};
    }

    static {
        IncidenceNotificationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private IncidenceNotificationType(String str, int i, int i4) {
        this.value = i4;
    }

    public static EnumEntries<IncidenceNotificationType> getEntries() {
        return $ENTRIES;
    }

    public static IncidenceNotificationType valueOf(String str) {
        return (IncidenceNotificationType) Enum.valueOf(IncidenceNotificationType.class, str);
    }

    public static IncidenceNotificationType[] values() {
        return (IncidenceNotificationType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
