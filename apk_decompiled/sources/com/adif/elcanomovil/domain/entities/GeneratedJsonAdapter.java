package com.adif.elcanomovil.domain.entities;

import Q2.j;
import Z2.AbstractC0104l;
import Z2.G;
import Z2.L;
import Z2.p;
import Z2.r;
import Z2.x;
import b3.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/LineColoursForNetworkJsonAdapter;", "LZ2/l;", "Lcom/adif/elcanomovil/domain/entities/LineColoursForNetwork;", "LZ2/G;", "moshi", "<init>", "(LZ2/G;)V", "", "toString", "()Ljava/lang/String;", "LZ2/r;", "reader", "fromJson", "(LZ2/r;)Lcom/adif/elcanomovil/domain/entities/LineColoursForNetwork;", "LZ2/x;", "writer", "value_", "", "toJson", "(LZ2/x;Lcom/adif/elcanomovil/domain/entities/LineColoursForNetwork;)V", "LZ2/p;", "options", "LZ2/p;", "stringAdapter", "LZ2/l;", "", "Lcom/adif/elcanomovil/domain/entities/LineColor;", "listOfLineColorAdapter", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.adif.elcanomovil.domain.entities.LineColoursForNetworkJsonAdapter, reason: from toString */
/* loaded from: classes.dex */
public final class GeneratedJsonAdapter extends AbstractC0104l {
    private final AbstractC0104l listOfLineColorAdapter;
    private final p options;
    private final AbstractC0104l stringAdapter;

    public GeneratedJsonAdapter(G moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        p a2 = p.a("commuterNetwork", "lines");
        Intrinsics.checkNotNullExpressionValue(a2, "of(...)");
        this.options = a2;
        AbstractC0104l c4 = moshi.c(String.class, SetsKt.emptySet(), "commuterNetwork");
        Intrinsics.checkNotNullExpressionValue(c4, "adapter(...)");
        this.stringAdapter = c4;
        AbstractC0104l c5 = moshi.c(L.f(List.class, LineColor.class), SetsKt.emptySet(), "lines");
        Intrinsics.checkNotNullExpressionValue(c5, "adapter(...)");
        this.listOfLineColorAdapter = c5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(LineColoursForNetwork)");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    @Override // Z2.AbstractC0104l
    public LineColoursForNetwork fromJson(r reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.e();
        String str = null;
        List list = null;
        while (reader.Y()) {
            int j02 = reader.j0(this.options);
            if (j02 == -1) {
                reader.l0();
                reader.m0();
            } else if (j02 == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    j l4 = f.l("commuterNetwork", "commuterNetwork", reader);
                    Intrinsics.checkNotNullExpressionValue(l4, "unexpectedNull(...)");
                    throw l4;
                }
            } else if (j02 == 1 && (list = (List) this.listOfLineColorAdapter.fromJson(reader)) == null) {
                j l5 = f.l("lines", "lines", reader);
                Intrinsics.checkNotNullExpressionValue(l5, "unexpectedNull(...)");
                throw l5;
            }
        }
        reader.x();
        if (str == null) {
            j g4 = f.g("commuterNetwork", "commuterNetwork", reader);
            Intrinsics.checkNotNullExpressionValue(g4, "missingProperty(...)");
            throw g4;
        }
        if (list != null) {
            return new LineColoursForNetwork(str, list);
        }
        j g5 = f.g("lines", "lines", reader);
        Intrinsics.checkNotNullExpressionValue(g5, "missingProperty(...)");
        throw g5;
    }

    @Override // Z2.AbstractC0104l
    public void toJson(x writer, LineColoursForNetwork value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ != null) {
            writer.e();
            writer.Z("commuterNetwork");
            this.stringAdapter.toJson(writer, value_.getCommuterNetwork());
            writer.Z("lines");
            this.listOfLineColorAdapter.toJson(writer, value_.getLines());
            writer.O();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
