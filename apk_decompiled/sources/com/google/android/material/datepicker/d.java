package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new D0.a(9);

    /* renamed from: a, reason: collision with root package name */
    public final long f5643a;

    public d(long j4) {
        this.f5643a = j4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f5643a == ((d) obj).f5643a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5643a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5643a);
    }
}
