package o2;

import A.g;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes3.dex */
public final class b extends W.b {
    public static final Parcelable.Creator<b> CREATOR = new g(8);

    /* renamed from: c, reason: collision with root package name */
    public final int f8082c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8083d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8084e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8085f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8086g;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8082c = parcel.readInt();
        this.f8083d = parcel.readInt();
        this.f8084e = parcel.readInt() == 1;
        this.f8085f = parcel.readInt() == 1;
        this.f8086g = parcel.readInt() == 1;
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f8082c);
        parcel.writeInt(this.f8083d);
        parcel.writeInt(this.f8084e ? 1 : 0);
        parcel.writeInt(this.f8085f ? 1 : 0);
        parcel.writeInt(this.f8086g ? 1 : 0);
    }

    public b(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f8082c = bottomSheetBehavior.f5547L;
        this.f8083d = bottomSheetBehavior.f5569e;
        this.f8084e = bottomSheetBehavior.f5563b;
        this.f8085f = bottomSheetBehavior.f5545I;
        this.f8086g = bottomSheetBehavior.J;
    }
}
