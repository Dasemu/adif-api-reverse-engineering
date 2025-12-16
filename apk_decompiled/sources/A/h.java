package A;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class h extends W.b {
    public static final Parcelable.Creator<h> CREATOR = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f24c;

    public h(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f24c = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f24c.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f24c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = this.f24c.keyAt(i4);
            parcelableArr[i4] = (Parcelable) this.f24c.valueAt(i4);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
