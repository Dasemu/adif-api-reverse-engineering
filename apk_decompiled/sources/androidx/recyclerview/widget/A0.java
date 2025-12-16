package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class A0 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new B0(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new B0[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new B0(parcel, null);
    }
}
