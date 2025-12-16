package com.adif.elcanomovil.uiMoreAdif;

import C.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/HelpItem;", "", "type", "Lcom/adif/elcanomovil/uiMoreAdif/HelpActions;", "icon", "", "(Lcom/adif/elcanomovil/uiMoreAdif/HelpActions;I)V", "getIcon", "()I", "getType", "()Lcom/adif/elcanomovil/uiMoreAdif/HelpActions;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ui-more-adif_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HelpItem {
    private final int icon;
    private final HelpActions type;

    public HelpItem(HelpActions type, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.icon = i;
    }

    public static /* synthetic */ HelpItem copy$default(HelpItem helpItem, HelpActions helpActions, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            helpActions = helpItem.type;
        }
        if ((i4 & 2) != 0) {
            i = helpItem.icon;
        }
        return helpItem.copy(helpActions, i);
    }

    /* renamed from: component1, reason: from getter */
    public final HelpActions getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    public final HelpItem copy(HelpActions type, int icon) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new HelpItem(type, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpItem)) {
            return false;
        }
        HelpItem helpItem = (HelpItem) other;
        return this.type == helpItem.type && this.icon == helpItem.icon;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final HelpActions getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.icon) + (this.type.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HelpItem(type=");
        sb.append(this.type);
        sb.append(", icon=");
        return w.p(sb, this.icon, ')');
    }
}
