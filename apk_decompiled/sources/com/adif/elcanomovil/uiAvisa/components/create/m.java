package com.adif.elcanomovil.uiAvisa.components.create;

import android.os.Bundle;
import android.os.Parcelable;
import com.adif.elcanomovil.commonNavGraph.R;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

/* loaded from: classes.dex */
public final class m implements F {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4847a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4848b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4849c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4850d;

    /* renamed from: e, reason: collision with root package name */
    public final AlertActions f4851e;

    /* renamed from: f, reason: collision with root package name */
    public final AlertType f4852f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4853g;

    public m(boolean z3, boolean z4, String title, String message, AlertActions actions, AlertType type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f4847a = z3;
        this.f4848b = z4;
        this.f4849c = title;
        this.f4850d = message;
        this.f4851e = actions;
        this.f4852f = type;
        this.f4853g = R.id.action_global_alertDialog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f4847a == mVar.f4847a && this.f4848b == mVar.f4848b && Intrinsics.areEqual(this.f4849c, mVar.f4849c) && Intrinsics.areEqual(this.f4850d, mVar.f4850d) && Intrinsics.areEqual(this.f4851e, mVar.f4851e) && this.f4852f == mVar.f4852f;
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f4853g;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("blockOnback", this.f4847a);
        bundle.putBoolean("isCancelable", this.f4848b);
        bundle.putString("title", this.f4849c);
        bundle.putString("message", this.f4850d);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(AlertActions.class);
        Serializable serializable = this.f4851e;
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
        Serializable serializable2 = this.f4852f;
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
        return this.f4852f.hashCode() + ((this.f4851e.hashCode() + com.google.android.gms.measurement.internal.a.d(this.f4850d, com.google.android.gms.measurement.internal.a.d(this.f4849c, C.w.c(Boolean.hashCode(this.f4847a) * 31, 31, this.f4848b), 31), 31)) * 31);
    }

    public final String toString() {
        return "ActionGlobalAlertDialog(blockOnback=" + this.f4847a + ", isCancelable=" + this.f4848b + ", title=" + this.f4849c + ", message=" + this.f4850d + ", actions=" + this.f4851e + ", type=" + this.f4852f + ')';
    }
}
