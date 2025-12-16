package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.fragment.app.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148g0 implements Parcelable {
    public static final Parcelable.Creator<C0148g0> CREATOR = new D0.a(5);

    /* renamed from: a, reason: collision with root package name */
    public String f3122a;

    /* renamed from: b, reason: collision with root package name */
    public int f3123b;

    public C0148g0(String str, int i) {
        this.f3122a = str;
        this.f3123b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3122a);
        parcel.writeInt(this.f3123b);
    }
}
