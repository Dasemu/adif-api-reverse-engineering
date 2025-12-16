package com.adif.elcanomovil.widget;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/widget/WidgetPayload;", "", "origin", "", FirebaseAnalytics.Param.DESTINATION, "isCercanias", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getDestination", "()Ljava/lang/String;", "()Z", "getOrigin", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WidgetPayload {
    private final String destination;
    private final boolean isCercanias;
    private final String origin;

    public WidgetPayload(String origin, String destination, boolean z3) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.origin = origin;
        this.destination = destination;
        this.isCercanias = z3;
    }

    public final String getDestination() {
        return this.destination;
    }

    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: isCercanias, reason: from getter */
    public final boolean getIsCercanias() {
        return this.isCercanias;
    }
}
