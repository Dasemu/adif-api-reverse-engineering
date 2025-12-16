package z2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z2.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0676f implements Parcelable {
    public static final Parcelable.Creator<C0676f> CREATOR = new D0.a(18);

    /* renamed from: a, reason: collision with root package name */
    public int f9082a;

    /* renamed from: b, reason: collision with root package name */
    public x2.f f9083b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9082a);
        parcel.writeParcelable(this.f9083b, 0);
    }
}
