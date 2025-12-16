package com.adif.elcanomovil.resources;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a%\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\u0004\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006¢\u0006\u0002\u0010\u0007\u001a-\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\u0004\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006¢\u0006\u0002\u0010\t\u001a-\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\u0004\b\u0000\u0010\u0003*\u00020\n2\u0006\u0010\b\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006¢\u0006\u0002\u0010\u000b\u001a\u001a\u0010\f\u001a\u00020\r*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010\f\u001a\u00020\r*\u00020\n2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"DEFAULT_NAME", "", "getJsonExtra", "T", "Landroid/content/Intent;", "class", "Ljava/lang/Class;", "(Landroid/content/Intent;Ljava/lang/Class;)Ljava/lang/Object;", AppMeasurementSdk.ConditionalUserProperty.NAME, "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "Landroid/os/Bundle;", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "putExtraJson", "", "src", "", "common-resources_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntentUtilKt {
    public static final String DEFAULT_NAME = "object";

    public static final <T> T getJsonExtra(Bundle bundle, String name, Class<T> cls) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cls, "class");
        String string = bundle.getString(name);
        if (string != null) {
            return (T) IntentUtil.INSTANCE.getGson().b(cls, string);
        }
        return null;
    }

    public static final void putExtraJson(Intent intent, String name, Object src) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(src, "src");
        intent.putExtra(name, IntentUtil.INSTANCE.getGson().f(src));
    }

    public static final void putExtraJson(Bundle bundle, String name, Object src) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(src, "src");
        bundle.putString(name, IntentUtil.INSTANCE.getGson().f(src));
    }

    public static final <T> T getJsonExtra(Intent intent, String name, Class<T> cls) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cls, "class");
        String stringExtra = intent.getStringExtra(name);
        if (stringExtra != null) {
            return (T) IntentUtil.INSTANCE.getGson().b(cls, stringExtra);
        }
        return null;
    }

    public static final <T> T getJsonExtra(Intent intent, Class<T> cls) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(cls, "class");
        String stringExtra = intent.getStringExtra(DEFAULT_NAME);
        if (stringExtra != null) {
            return (T) IntentUtil.INSTANCE.getGson().b(cls, stringExtra);
        }
        return null;
    }
}
