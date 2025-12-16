package com.adif.elcanomovil.commonNavGraph;

import C.w;
import android.os.Bundle;
import android.os.Parcelable;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import o0.F;

/* loaded from: classes.dex */
public final class a implements F {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4406a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4407b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4408c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4409d;

    /* renamed from: e, reason: collision with root package name */
    public final AlertActions f4410e;

    /* renamed from: f, reason: collision with root package name */
    public final AlertType f4411f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4412g;

    public a(boolean z3, boolean z4, String title, String message, AlertActions actions, AlertType type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f4406a = z3;
        this.f4407b = z4;
        this.f4408c = title;
        this.f4409d = message;
        this.f4410e = actions;
        this.f4411f = type;
        this.f4412g = R.id.to_alertDialog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4406a == aVar.f4406a && this.f4407b == aVar.f4407b && Intrinsics.areEqual(this.f4408c, aVar.f4408c) && Intrinsics.areEqual(this.f4409d, aVar.f4409d) && Intrinsics.areEqual(this.f4410e, aVar.f4410e) && this.f4411f == aVar.f4411f;
    }

    @Override // o0.F
    public final int getActionId() {
        return this.f4412g;
    }

    @Override // o0.F
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("blockOnback", this.f4406a);
        bundle.putBoolean("isCancelable", this.f4407b);
        bundle.putString("title", this.f4408c);
        bundle.putString("message", this.f4409d);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(AlertActions.class);
        Serializable serializable = this.f4410e;
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
        Serializable serializable2 = this.f4411f;
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
        return this.f4411f.hashCode() + ((this.f4410e.hashCode() + com.google.android.gms.measurement.internal.a.d(this.f4409d, com.google.android.gms.measurement.internal.a.d(this.f4408c, w.c(Boolean.hashCode(this.f4406a) * 31, 31, this.f4407b), 31), 31)) * 31);
    }

    public final String toString() {
        return "ToAlertDialog(blockOnback=" + this.f4406a + ", isCancelable=" + this.f4407b + ", title=" + this.f4408c + ", message=" + this.f4409d + ", actions=" + this.f4410e + ", type=" + this.f4411f + ')';
    }
}
