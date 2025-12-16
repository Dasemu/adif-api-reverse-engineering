package m;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class T0 extends W.b {
    public static final Parcelable.Creator<T0> CREATOR = new A.g(7);

    /* renamed from: c, reason: collision with root package name */
    public int f7619c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7620d;

    public T0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7619c = parcel.readInt();
        this.f7620d = parcel.readInt() != 0;
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f7619c);
        parcel.writeInt(this.f7620d ? 1 : 0);
    }
}
