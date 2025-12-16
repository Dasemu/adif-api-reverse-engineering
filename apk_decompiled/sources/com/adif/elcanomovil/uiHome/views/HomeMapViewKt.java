package com.adif.elcanomovil.uiHome.views;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006**\u0010\n\"\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¨\u0006\u000b"}, d2 = {"Landroid/content/Context;", "Landroidx/lifecycle/J;", "getLifecycleOwner", "(Landroid/content/Context;)Landroidx/lifecycle/J;", "", "DEFAULT_ZOOM", "F", "Lkotlin/Function1;", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "", "StationMarkerListener", "ui-home_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HomeMapViewKt {
    private static final float DEFAULT_ZOOM = 14.0f;

    /* JADX WARN: Multi-variable type inference failed */
    public static final J getLifecycleOwner(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            return (J) context;
        } catch (ClassCastException unused) {
            Object baseContext = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNull(baseContext, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            return (J) baseContext;
        }
    }
}
