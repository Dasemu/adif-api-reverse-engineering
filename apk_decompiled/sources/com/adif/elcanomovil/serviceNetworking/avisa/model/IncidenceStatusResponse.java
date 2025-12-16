package com.adif.elcanomovil.serviceNetworking.avisa.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidenceStatusResponse;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "STATUS_TYPE_IN_PROGRESS", "STATUS_TYPE_SOLVED", "STATUS_TYPE_CLOSED", "Companion", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IncidenceStatusResponse {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IncidenceStatusResponse[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final IncidenceStatusResponse STATUS_TYPE_IN_PROGRESS = new IncidenceStatusResponse("STATUS_TYPE_IN_PROGRESS", 0, 1);
    public static final IncidenceStatusResponse STATUS_TYPE_SOLVED = new IncidenceStatusResponse("STATUS_TYPE_SOLVED", 1, 2);
    public static final IncidenceStatusResponse STATUS_TYPE_CLOSED = new IncidenceStatusResponse("STATUS_TYPE_CLOSED", 2, 3);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidenceStatusResponse$Companion;", "", "()V", "invoke", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidenceStatusResponse;", "rawValue", "", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nIncidenceStatusResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IncidenceStatusResponse.kt\ncom/adif/elcanomovil/serviceNetworking/avisa/model/IncidenceStatusResponse$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,14:1\n1#2:15\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IncidenceStatusResponse invoke(int rawValue) {
            for (IncidenceStatusResponse incidenceStatusResponse : IncidenceStatusResponse.values()) {
                if (incidenceStatusResponse.getValue() == rawValue) {
                    return incidenceStatusResponse;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ IncidenceStatusResponse[] $values() {
        return new IncidenceStatusResponse[]{STATUS_TYPE_IN_PROGRESS, STATUS_TYPE_SOLVED, STATUS_TYPE_CLOSED};
    }

    static {
        IncidenceStatusResponse[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private IncidenceStatusResponse(String str, int i, int i4) {
        this.value = i4;
    }

    public static EnumEntries<IncidenceStatusResponse> getEntries() {
        return $ENTRIES;
    }

    public static IncidenceStatusResponse valueOf(String str) {
        return (IncidenceStatusResponse) Enum.valueOf(IncidenceStatusResponse.class, str);
    }

    public static IncidenceStatusResponse[] values() {
        return (IncidenceStatusResponse[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
