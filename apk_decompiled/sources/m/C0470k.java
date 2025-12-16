package m;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: m.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470k implements Parcelable {
    public static final Parcelable.Creator<C0470k> CREATOR = new D0.a(14);

    /* renamed from: a, reason: collision with root package name */
    public int f7673a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7673a);
    }
}
