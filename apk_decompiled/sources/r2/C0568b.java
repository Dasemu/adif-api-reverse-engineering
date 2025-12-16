package r2;

import C.w;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: r2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0568b extends View.BaseSavedState {
    public static final Parcelable.Creator<C0568b> CREATOR = new D0.a(17);

    /* renamed from: a, reason: collision with root package name */
    public int f8214a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f8214a;
        return w.r(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f8214a));
    }
}
