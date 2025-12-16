package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139c implements Parcelable {
    public static final Parcelable.Creator<C0139c> CREATOR = new D0.a(4);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3103a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3104b;

    public C0139c(ArrayList arrayList, ArrayList arrayList2) {
        this.f3103a = arrayList;
        this.f3104b = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f3103a);
        parcel.writeTypedList(this.f3104b);
    }

    public C0139c(Parcel parcel) {
        this.f3103a = parcel.createStringArrayList();
        this.f3104b = parcel.createTypedArrayList(C0137b.CREATOR);
    }
}
