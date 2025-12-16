package H0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class o extends View.BaseSavedState {
    public static final Parcelable.Creator<o> CREATOR = new A.g(3);

    /* renamed from: a, reason: collision with root package name */
    public int f655a;

    /* renamed from: b, reason: collision with root package name */
    public int f656b;

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f657c;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f655a);
        parcel.writeInt(this.f656b);
        parcel.writeParcelable(this.f657c, i);
    }
}
