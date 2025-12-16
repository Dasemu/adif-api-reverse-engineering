package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class W implements Parcelable {
    public static final Parcelable.Creator<W> CREATOR = new V(0);

    /* renamed from: a, reason: collision with root package name */
    public int f3765a;

    /* renamed from: b, reason: collision with root package name */
    public int f3766b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3767c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3765a);
        parcel.writeInt(this.f3766b);
        parcel.writeInt(this.f3767c ? 1 : 0);
    }
}
