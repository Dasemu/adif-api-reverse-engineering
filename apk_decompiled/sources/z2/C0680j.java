package z2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z2.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0680j extends W.b {
    public static final Parcelable.Creator<C0680j> CREATOR = new A.g(12);

    /* renamed from: c, reason: collision with root package name */
    public Bundle f9087c;

    public C0680j(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9087c = parcel.readBundle(classLoader == null ? C0680j.class.getClassLoader() : classLoader);
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f9087c);
    }
}
