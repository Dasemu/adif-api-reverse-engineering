package androidx.versionedparcelable;

import D0.a;
import D0.c;
import D0.d;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final d f4020a;

    public ParcelImpl(Parcel parcel) {
        this.f4020a = new c(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new c(parcel).i(this.f4020a);
    }
}
