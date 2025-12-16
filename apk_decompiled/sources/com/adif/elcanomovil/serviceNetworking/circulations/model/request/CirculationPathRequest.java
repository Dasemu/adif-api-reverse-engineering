package com.adif.elcanomovil.serviceNetworking.circulations.model.request;

import C.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\f\rR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/CirculationPathRequest;", "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_SERVICE, "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/CirculationPathRequest$State;", "getCommercialService", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/CirculationPathRequest$State;", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_STOP_TYPE, "getCommercialStopType", "page", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/CirculationPathRequest$PageInfoDTO;", "getPage", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/CirculationPathRequest$PageInfoDTO;", "PageInfoDTO", "State", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CirculationPathRequest {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/CirculationPathRequest$PageInfoDTO;", "", "pageNumber", "", "(I)V", "getPageNumber", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class PageInfoDTO {
        private final int pageNumber;

        public PageInfoDTO(int i) {
            this.pageNumber = i;
        }

        public static /* synthetic */ PageInfoDTO copy$default(PageInfoDTO pageInfoDTO, int i, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = pageInfoDTO.pageNumber;
            }
            return pageInfoDTO.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPageNumber() {
            return this.pageNumber;
        }

        public final PageInfoDTO copy(int pageNumber) {
            return new PageInfoDTO(pageNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PageInfoDTO) && this.pageNumber == ((PageInfoDTO) other).pageNumber;
        }

        public final int getPageNumber() {
            return this.pageNumber;
        }

        public int hashCode() {
            return Integer.hashCode(this.pageNumber);
        }

        public String toString() {
            return w.p(new StringBuilder("PageInfoDTO(pageNumber="), this.pageNumber, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/CirculationPathRequest$State;", "", "(Ljava/lang/String;I)V", "YES", "NOT", "BOTH", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State YES = new State("YES", 0);
        public static final State NOT = new State("NOT", 1);
        public static final State BOTH = new State("BOTH", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{YES, NOT, BOTH};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private State(String str, int i) {
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    State getCommercialService();

    State getCommercialStopType();

    PageInfoDTO getPage();
}
