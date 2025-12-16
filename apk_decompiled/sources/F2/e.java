package F2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes3.dex */
public final class e extends W.b {
    public static final Parcelable.Creator<e> CREATOR = new A.g(2);

    /* renamed from: c, reason: collision with root package name */
    public final int f548c;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f548c = parcel.readInt();
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f548c);
    }

    public e(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f548c = sideSheetBehavior.h;
    }
}
