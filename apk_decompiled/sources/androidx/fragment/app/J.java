package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new A.g(6);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f3035a;

    public J(Bundle bundle) {
        this.f3035a = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f3035a);
    }

    public J(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.f3035a = readBundle;
        if (classLoader == null || readBundle == null) {
            return;
        }
        readBundle.setClassLoader(classLoader);
    }
}
