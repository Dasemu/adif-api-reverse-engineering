package U;

import android.os.Build;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1766a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1767b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1768c;

    public r(byte[] bArr, long j4) {
        String str = Build.VERSION.INCREMENTAL;
        this.f1766a = bArr;
        this.f1767b = str;
        this.f1768c = j4;
    }

    public r(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        byte[] bArr = new byte[parcel.readInt()];
        this.f1766a = bArr;
        parcel.readByteArray(bArr);
        String readString = parcel.readString();
        Intrinsics.checkNotNull(readString);
        this.f1767b = readString;
        this.f1768c = parcel.readLong();
    }
}
