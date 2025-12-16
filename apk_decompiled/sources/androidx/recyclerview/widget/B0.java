package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class B0 extends W.b {
    public static final Parcelable.Creator<B0> CREATOR = new Object();

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f3463c;

    public B0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3463c = parcel.readParcelable(classLoader == null ? AbstractC0238q0.class.getClassLoader() : classLoader);
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f3463c, 0);
    }
}
