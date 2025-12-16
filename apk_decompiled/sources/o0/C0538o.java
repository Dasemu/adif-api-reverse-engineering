package o0;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538o implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<C0538o> CREATOR = new D0.a(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f8016a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8017b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f8018c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f8019d;

    public C0538o(C0537n entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f8016a = entry.f8010f;
        this.f8017b = entry.f8006b.h;
        this.f8018c = entry.f8007c;
        Bundle outBundle = new Bundle();
        this.f8019d = outBundle;
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        entry.i.c(outBundle);
    }

    public final C0537n a(Context context, E destination, androidx.lifecycle.B hostLifecycleState, C0545w c0545w) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f8018c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        String id = this.f8016a;
        Intrinsics.checkNotNullParameter(id, "id");
        return new C0537n(context, destination, bundle2, hostLifecycleState, c0545w, id, this.f8019d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f8016a);
        parcel.writeInt(this.f8017b);
        parcel.writeBundle(this.f8018c);
        parcel.writeBundle(this.f8019d);
    }

    public C0538o(Parcel inParcel) {
        Intrinsics.checkNotNullParameter(inParcel, "inParcel");
        String readString = inParcel.readString();
        Intrinsics.checkNotNull(readString);
        this.f8016a = readString;
        this.f8017b = inParcel.readInt();
        this.f8018c = inParcel.readBundle(C0538o.class.getClassLoader());
        Bundle readBundle = inParcel.readBundle(C0538o.class.getClassLoader());
        Intrinsics.checkNotNull(readBundle);
        this.f8019d = readBundle;
    }
}
