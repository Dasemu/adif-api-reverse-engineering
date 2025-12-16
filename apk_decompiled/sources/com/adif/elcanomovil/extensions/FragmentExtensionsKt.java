package com.adif.elcanomovil.extensions;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"shareLink", "", "Landroid/content/Context;", "msg", "", "common-resources_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentExtensionsKt {
    public static final void shareLink(Context context, String msg) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", msg);
        intent.putExtra("android.intent.extra.SUBJECT", msg);
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent, msg));
    }
}
