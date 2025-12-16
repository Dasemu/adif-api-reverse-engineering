package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class O0 implements Parcelable {
    public static final Parcelable.Creator<O0> CREATOR = new V(1);

    /* renamed from: a, reason: collision with root package name */
    public int f3611a;

    /* renamed from: b, reason: collision with root package name */
    public int f3612b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f3613c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3614d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f3611a + ", mGapDir=" + this.f3612b + ", mHasUnwantedGapAfter=" + this.f3614d + ", mGapPerSpan=" + Arrays.toString(this.f3613c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3611a);
        parcel.writeInt(this.f3612b);
        parcel.writeInt(this.f3614d ? 1 : 0);
        int[] iArr = this.f3613c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f3613c);
        }
    }
}
