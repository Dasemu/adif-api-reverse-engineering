package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class V implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3764a;

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.recyclerview.widget.W, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, androidx.recyclerview.widget.O0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, androidx.recyclerview.widget.P0] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3764a) {
            case 0:
                ?? obj = new Object();
                obj.f3765a = parcel.readInt();
                obj.f3766b = parcel.readInt();
                obj.f3767c = parcel.readInt() == 1;
                return obj;
            case 1:
                ?? obj2 = new Object();
                obj2.f3611a = parcel.readInt();
                obj2.f3612b = parcel.readInt();
                obj2.f3614d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj2.f3613c = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj2;
            default:
                ?? obj3 = new Object();
                obj3.f3616a = parcel.readInt();
                obj3.f3617b = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj3.f3618c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj3.f3619d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj3.f3620e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj3.f3621f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                obj3.h = parcel.readInt() == 1;
                obj3.i = parcel.readInt() == 1;
                obj3.f3623j = parcel.readInt() == 1;
                obj3.f3622g = parcel.readArrayList(O0.class.getClassLoader());
                return obj3;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f3764a) {
            case 0:
                return new W[i];
            case 1:
                return new O0[i];
            default:
                return new P0[i];
        }
    }
}
