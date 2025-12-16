package com.adif.elcanomovil.domain.entities;

import Z2.m;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@m(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/LineColoursForNetwork;", "", "commuterNetwork", "", "lines", "", "Lcom/adif/elcanomovil/domain/entities/LineColor;", "(Ljava/lang/String;Ljava/util/List;)V", "getCommuterNetwork", "()Ljava/lang/String;", "getLines", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LineColoursForNetwork {
    private final String commuterNetwork;
    private final List<LineColor> lines;

    public LineColoursForNetwork(String commuterNetwork, List<LineColor> lines) {
        Intrinsics.checkNotNullParameter(commuterNetwork, "commuterNetwork");
        Intrinsics.checkNotNullParameter(lines, "lines");
        this.commuterNetwork = commuterNetwork;
        this.lines = lines;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LineColoursForNetwork copy$default(LineColoursForNetwork lineColoursForNetwork, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lineColoursForNetwork.commuterNetwork;
        }
        if ((i & 2) != 0) {
            list = lineColoursForNetwork.lines;
        }
        return lineColoursForNetwork.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCommuterNetwork() {
        return this.commuterNetwork;
    }

    public final List<LineColor> component2() {
        return this.lines;
    }

    public final LineColoursForNetwork copy(String commuterNetwork, List<LineColor> lines) {
        Intrinsics.checkNotNullParameter(commuterNetwork, "commuterNetwork");
        Intrinsics.checkNotNullParameter(lines, "lines");
        return new LineColoursForNetwork(commuterNetwork, lines);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineColoursForNetwork)) {
            return false;
        }
        LineColoursForNetwork lineColoursForNetwork = (LineColoursForNetwork) other;
        return Intrinsics.areEqual(this.commuterNetwork, lineColoursForNetwork.commuterNetwork) && Intrinsics.areEqual(this.lines, lineColoursForNetwork.lines);
    }

    public final String getCommuterNetwork() {
        return this.commuterNetwork;
    }

    public final List<LineColor> getLines() {
        return this.lines;
    }

    public int hashCode() {
        return this.lines.hashCode() + (this.commuterNetwork.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineColoursForNetwork(commuterNetwork=");
        sb.append(this.commuterNetwork);
        sb.append(", lines=");
        return a.o(sb, this.lines, ')');
    }
}
