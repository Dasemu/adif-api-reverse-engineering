package p2;

import A.g;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class b extends W.b {
    public static final Parcelable.Creator<b> CREATOR = new g(9);

    /* renamed from: c, reason: collision with root package name */
    public boolean f8121c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f8121c = parcel.readInt() == 1;
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f8121c ? 1 : 0);
    }
}
