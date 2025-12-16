package F0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j extends W.b {
    public static final Parcelable.Creator<j> CREATOR = new A.g(1);

    /* renamed from: c, reason: collision with root package name */
    public int f531c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f532d;

    /* renamed from: e, reason: collision with root package name */
    public final ClassLoader f533e;

    public j(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? j.class.getClassLoader() : classLoader;
        this.f531c = parcel.readInt();
        this.f532d = parcel.readParcelable(classLoader);
        this.f533e = classLoader;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return com.google.android.gms.measurement.internal.a.m(sb, this.f531c, "}");
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f531c);
        parcel.writeParcelable(this.f532d, i);
    }
}
