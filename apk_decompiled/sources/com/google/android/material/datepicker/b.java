package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new D0.a(8);

    /* renamed from: a, reason: collision with root package name */
    public final o f5634a;

    /* renamed from: b, reason: collision with root package name */
    public final o f5635b;

    /* renamed from: c, reason: collision with root package name */
    public final d f5636c;

    /* renamed from: d, reason: collision with root package name */
    public final o f5637d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5638e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5639f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5640g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f5634a = oVar;
        this.f5635b = oVar2;
        this.f5637d = oVar3;
        this.f5638e = i;
        this.f5636c = dVar;
        if (oVar3 != null && oVar.f5693a.compareTo(oVar3.f5693a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f5693a.compareTo(oVar2.f5693a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f5640g = oVar.d(oVar2) + 1;
        this.f5639f = (oVar2.f5695c - oVar.f5695c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5634a.equals(bVar.f5634a) && this.f5635b.equals(bVar.f5635b) && Objects.equals(this.f5637d, bVar.f5637d) && this.f5638e == bVar.f5638e && this.f5636c.equals(bVar.f5636c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5634a, this.f5635b, this.f5637d, Integer.valueOf(this.f5638e), this.f5636c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5634a, 0);
        parcel.writeParcelable(this.f5635b, 0);
        parcel.writeParcelable(this.f5637d, 0);
        parcel.writeParcelable(this.f5636c, 0);
        parcel.writeInt(this.f5638e);
    }
}
