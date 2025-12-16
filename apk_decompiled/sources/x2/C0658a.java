package x2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0658a extends W.b {
    public static final Parcelable.Creator<C0658a> CREATOR = new A.g(10);

    /* renamed from: c, reason: collision with root package name */
    public boolean f8888c;

    public C0658a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8888c = parcel.readInt() == 1;
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f8888c ? 1 : 0);
    }
}
