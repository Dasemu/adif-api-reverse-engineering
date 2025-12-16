package com.adif.elcanomovil.commonNavGraph.navigation;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"toPendingActivityIntent", "Landroid/app/PendingIntent;", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "requestCode", "", "common-nav-graph_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationIntentsKt {
    public static final PendingIntent toPendingActivityIntent(Intent intent, Context context, int i) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return PendingIntent.getActivity(context, i, intent, 201326592);
    }
}
