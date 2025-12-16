package com.adif.elcanomovil.repositories.providers;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m3.l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"version", "", "Landroid/content/Context;", "getVersion", "(Landroid/content/Context;)Ljava/lang/String;", "repositories_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultAppVersionProviderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getVersion(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
            String str = packageInfo.versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException e4) {
            l.g(e4);
            return "";
        }
    }
}
