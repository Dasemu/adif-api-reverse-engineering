package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f3980c;

    @Override // androidx.room.l
    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(l.f3981a);
            obtain.writeStringArray(strArr);
            this.f3980c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3980c;
    }
}
