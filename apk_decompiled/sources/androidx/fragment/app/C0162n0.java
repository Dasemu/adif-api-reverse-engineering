package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162n0 implements Parcelable {
    public static final Parcelable.Creator<C0162n0> CREATOR = new D0.a(6);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3185a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3186b;

    /* renamed from: c, reason: collision with root package name */
    public C0137b[] f3187c;

    /* renamed from: d, reason: collision with root package name */
    public int f3188d;

    /* renamed from: e, reason: collision with root package name */
    public String f3189e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f3190f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3191g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f3185a);
        parcel.writeStringList(this.f3186b);
        parcel.writeTypedArray(this.f3187c, i);
        parcel.writeInt(this.f3188d);
        parcel.writeString(this.f3189e);
        parcel.writeStringList(this.f3190f);
        parcel.writeTypedList(this.f3191g);
        parcel.writeTypedList(this.h);
    }
}
