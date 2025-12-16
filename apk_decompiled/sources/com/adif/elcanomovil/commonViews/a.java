package com.adif.elcanomovil.commonViews;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4438a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f4439b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4440c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4441d;

    public a(boolean z3, Drawable drawable, String title, String message) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f4438a = z3;
        this.f4439b = drawable;
        this.f4440c = title;
        this.f4441d = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4438a == aVar.f4438a && Intrinsics.areEqual(this.f4439b, aVar.f4439b) && Intrinsics.areEqual(this.f4440c, aVar.f4440c) && Intrinsics.areEqual(this.f4441d, aVar.f4441d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f4438a) * 31;
        Drawable drawable = this.f4439b;
        return this.f4441d.hashCode() + com.google.android.gms.measurement.internal.a.d(this.f4440c, (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmptyCirculationsViewData(isLoading=");
        sb.append(this.f4438a);
        sb.append(", iconDrawable=");
        sb.append(this.f4439b);
        sb.append(", title=");
        sb.append(this.f4440c);
        sb.append(", message=");
        return com.google.android.gms.measurement.internal.a.n(sb, this.f4441d, ')');
    }
}
