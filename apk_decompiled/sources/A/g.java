package A;

import H0.o;
import I2.D;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.J;
import m.T0;
import x2.C0658a;
import z2.C0680j;

/* loaded from: classes.dex */
public final class g implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23a;

    public /* synthetic */ g(int i) {
        this.f23a = i;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View$BaseSavedState, H0.o, java.lang.Object] */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f23a) {
            case 0:
                return new h(parcel, classLoader);
            case 1:
                return new F0.j(parcel, classLoader);
            case 2:
                return new F2.e(parcel, classLoader);
            case 3:
                ?? baseSavedState = new View.BaseSavedState(parcel, classLoader);
                baseSavedState.f655a = parcel.readInt();
                baseSavedState.f656b = parcel.readInt();
                baseSavedState.f657c = parcel.readParcelable(classLoader);
                return baseSavedState;
            case 4:
                return new D(parcel, classLoader);
            case 5:
                if (parcel.readParcelable(classLoader) == null) {
                    return W.b.f1879b;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                return new J(parcel, classLoader);
            case 7:
                return new T0(parcel, classLoader);
            case 8:
                return new o2.b(parcel, classLoader);
            case 9:
                return new p2.b(parcel, classLoader);
            case 10:
                return new C0658a(parcel, classLoader);
            case 11:
                return new x2.f(parcel, classLoader);
            default:
                return new C0680j(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f23a) {
            case 0:
                return new h[i];
            case 1:
                return new F0.j[i];
            case 2:
                return new F2.e[i];
            case 3:
                return new o[i];
            case 4:
                return new D[i];
            case 5:
                return new W.b[i];
            case 6:
                return new J[i];
            case 7:
                return new T0[i];
            case 8:
                return new o2.b[i];
            case 9:
                return new p2.b[i];
            case 10:
                return new C0658a[i];
            case 11:
                return new x2.f[i];
            default:
                return new C0680j[i];
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View$BaseSavedState, H0.o, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f23a) {
            case 0:
                return new h(parcel, null);
            case 1:
                return new F0.j(parcel, null);
            case 2:
                return new F2.e(parcel, null);
            case 3:
                ?? baseSavedState = new View.BaseSavedState(parcel, null);
                baseSavedState.f655a = parcel.readInt();
                baseSavedState.f656b = parcel.readInt();
                baseSavedState.f657c = parcel.readParcelable(null);
                return baseSavedState;
            case 4:
                return new D(parcel, null);
            case 5:
                if (parcel.readParcelable(null) == null) {
                    return W.b.f1879b;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                return new J(parcel, null);
            case 7:
                return new T0(parcel, null);
            case 8:
                return new o2.b(parcel, null);
            case 9:
                return new p2.b(parcel, null);
            case 10:
                return new C0658a(parcel, null);
            case 11:
                return new x2.f(parcel, null);
            default:
                return new C0680j(parcel, null);
        }
    }
}
