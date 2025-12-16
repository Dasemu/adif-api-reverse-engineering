package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class L extends View.BaseSavedState {
    public static final Parcelable.Creator<L> CREATOR = new D0.a(15);

    /* renamed from: a, reason: collision with root package name */
    public boolean f7588a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f7588a ? (byte) 1 : (byte) 0);
    }
}
