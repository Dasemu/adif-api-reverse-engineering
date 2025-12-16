package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q extends Binder implements m {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f4003c;

    public q(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f4003c = multiInstanceInvalidationService;
        attachInterface(this, m.f3982b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, androidx.room.k] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, androidx.room.k] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i4) {
        int i5 = 0;
        String str = m.f3982b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        l callback = null;
        l callback2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(l.f3981a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof l)) {
                    ?? obj = new Object();
                    obj.f3980c = readStrongBinder;
                    callback = obj;
                } else {
                    callback = (l) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f4003c;
                synchronized (multiInstanceInvalidationService.f3950c) {
                    try {
                        int i6 = multiInstanceInvalidationService.f3948a + 1;
                        multiInstanceInvalidationService.f3948a = i6;
                        if (multiInstanceInvalidationService.f3950c.register(callback, Integer.valueOf(i6))) {
                            multiInstanceInvalidationService.f3949b.put(Integer.valueOf(i6), readString);
                            i5 = i6;
                        } else {
                            multiInstanceInvalidationService.f3948a--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i5);
            return true;
        }
        if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(l.f3981a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof l)) {
                    ?? obj2 = new Object();
                    obj2.f3980c = readStrongBinder2;
                    callback2 = obj2;
                } else {
                    callback2 = (l) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            Intrinsics.checkNotNullParameter(callback2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f4003c;
            synchronized (multiInstanceInvalidationService2.f3950c) {
                multiInstanceInvalidationService2.f3950c.unregister(callback2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i4);
        }
        int readInt2 = parcel.readInt();
        String[] tables = parcel.createStringArray();
        Intrinsics.checkNotNullParameter(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f4003c;
        synchronized (multiInstanceInvalidationService3.f3950c) {
            String str2 = (String) multiInstanceInvalidationService3.f3949b.get(Integer.valueOf(readInt2));
            if (str2 == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int beginBroadcast = multiInstanceInvalidationService3.f3950c.beginBroadcast();
                while (i5 < beginBroadcast) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService3.f3950c.getBroadcastCookie(i5);
                        Intrinsics.checkNotNull(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.f3949b.get(num);
                        if (readInt2 != intValue && Intrinsics.areEqual(str2, str3)) {
                            try {
                                ((l) multiInstanceInvalidationService3.f3950c.getBroadcastItem(i5)).a(tables);
                            } catch (RemoteException e4) {
                                Log.w("ROOM", "Error invoking a remote callback", e4);
                            }
                        }
                        i5++;
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService3.f3950c.finishBroadcast();
                        throw th2;
                    }
                }
                multiInstanceInvalidationService3.f3950c.finishBroadcast();
                Unit unit = Unit.INSTANCE;
            }
        }
        return true;
    }
}
