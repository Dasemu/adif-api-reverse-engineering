package com.adif.elcanomovil.domain.entities;

import Z2.m;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/LineColor;", "", "line", "", "colourRGB", "(Ljava/lang/String;Ljava/lang/String;)V", "getColourRGB", "()Ljava/lang/String;", "getLine", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LineColor {
    private final String colourRGB;
    private final String line;

    public LineColor(String line, String colourRGB) {
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(colourRGB, "colourRGB");
        this.line = line;
        this.colourRGB = colourRGB;
    }

    public static /* synthetic */ LineColor copy$default(LineColor lineColor, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lineColor.line;
        }
        if ((i & 2) != 0) {
            str2 = lineColor.colourRGB;
        }
        return lineColor.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLine() {
        return this.line;
    }

    /* renamed from: component2, reason: from getter */
    public final String getColourRGB() {
        return this.colourRGB;
    }

    public final LineColor copy(String line, String colourRGB) {
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(colourRGB, "colourRGB");
        return new LineColor(line, colourRGB);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineColor)) {
            return false;
        }
        LineColor lineColor = (LineColor) other;
        return Intrinsics.areEqual(this.line, lineColor.line) && Intrinsics.areEqual(this.colourRGB, lineColor.colourRGB);
    }

    public final String getColourRGB() {
        return this.colourRGB;
    }

    public final String getLine() {
        return this.line;
    }

    public int hashCode() {
        return this.colourRGB.hashCode() + (this.line.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineColor(line=");
        sb.append(this.line);
        sb.append(", colourRGB=");
        return a.n(sb, this.colourRGB, ')');
    }
}
