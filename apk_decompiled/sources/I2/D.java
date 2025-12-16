package I2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class D extends W.b {
    public static final Parcelable.Creator<D> CREATOR = new A.g(4);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f798c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f799d;

    public D(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f798c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f799d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f798c) + "}";
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f798c, parcel, i);
        parcel.writeInt(this.f799d ? 1 : 0);
    }
}
