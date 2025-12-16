package com.adif.elcanomovil.uiSubscriptions.create;

import C.w;
import android.os.Bundle;
import android.os.Parcelable;
import com.adif.elcanomovil.commonNavGraph.R;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

/* loaded from: classes3.dex */
public final class g implements F {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5311a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5312b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5313c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5314d;

    /* renamed from: e, reason: collision with root package name */
    public final AlertActions f5315e;

    /* renamed from: f, reason: collision with root package name */
    public final AlertType f5316f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5317g;

    public g(boolean z3, boolean z4, String title, String message, AlertActions actions, AlertType type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f5311a = z3;
        this.f5312b = z4;
        this.f5313c = title;
        this.f5314d = message;
        this.f5315e = actions;
        this.f5316f = type;
        this.f5317g = R.id.action_global_alertDialog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f5311a == gVar.f5311a && this.f5312b == gVar.f5312b && Intrinsics.areEqual(this.f5313c, gVar.f5313c) && Intrinsics.areEqual(this.f5314d, gVar.f5314d) && Intrinsics.areEqual(this.f5315e, gVar.f5315e) && this.f5316f == gVar.f5316f;
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f5317g;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("blockOnback", this.f5311a);
        bundle.putBoolean("isCancelable", this.f5312b);
        bundle.putString("title", this.f5313c);
        bundle.putString("message", this.f5314d);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(AlertActions.class);
        Serializable serializable = this.f5315e;
        if (isAssignableFrom) {
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("actions", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(AlertActions.class)) {
                throw new UnsupportedOperationException(AlertActions.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("actions", serializable);
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(AlertType.class);
        Serializable serializable2 = this.f5316f;
        if (isAssignableFrom2) {
            Intrinsics.checkNotNull(serializable2, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("type", (Parcelable) serializable2);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(AlertType.class)) {
            throw new UnsupportedOperationException(AlertType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Intrinsics.checkNotNull(serializable2, "null cannot be cast to non-null type java.io.Serializable");
        bundle.putSerializable("type", serializable2);
        return bundle;
    }

    public final int hashCode() {
        return this.f5316f.hashCode() + ((this.f5315e.hashCode() + com.google.android.gms.measurement.internal.a.d(this.f5314d, com.google.android.gms.measurement.internal.a.d(this.f5313c, w.c(Boolean.hashCode(this.f5311a) * 31, 31, this.f5312b), 31), 31)) * 31);
    }

    public final String toString() {
        return "ActionGlobalAlertDialog(blockOnback=" + this.f5311a + ", isCancelable=" + this.f5312b + ", title=" + this.f5313c + ", message=" + this.f5314d + ", actions=" + this.f5315e + ", type=" + this.f5316f + ')';
    }
}
