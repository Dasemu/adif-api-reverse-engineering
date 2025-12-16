package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class P0 implements Parcelable {
    public static final Parcelable.Creator<P0> CREATOR = new V(2);

    /* renamed from: a, reason: collision with root package name */
    public int f3616a;

    /* renamed from: b, reason: collision with root package name */
    public int f3617b;

    /* renamed from: c, reason: collision with root package name */
    public int f3618c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f3619d;

    /* renamed from: e, reason: collision with root package name */
    public int f3620e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3621f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3622g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3623j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3616a);
        parcel.writeInt(this.f3617b);
        parcel.writeInt(this.f3618c);
        if (this.f3618c > 0) {
            parcel.writeIntArray(this.f3619d);
        }
        parcel.writeInt(this.f3620e);
        if (this.f3620e > 0) {
            parcel.writeIntArray(this.f3621f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f3623j ? 1 : 0);
        parcel.writeList(this.f3622g);
    }
}
