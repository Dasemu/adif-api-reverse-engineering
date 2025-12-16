package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r0 implements Parcelable {
    public static final Parcelable.Creator<r0> CREATOR = new D0.a(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f3223a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3224b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3225c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3226d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3227e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3228f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3229g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3230j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3231k;

    /* renamed from: l, reason: collision with root package name */
    public final String f3232l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3233m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3234n;

    public r0(K k4) {
        this.f3223a = k4.getClass().getName();
        this.f3224b = k4.mWho;
        this.f3225c = k4.mFromLayout;
        this.f3226d = k4.mFragmentId;
        this.f3227e = k4.mContainerId;
        this.f3228f = k4.mTag;
        this.f3229g = k4.mRetainInstance;
        this.h = k4.mRemoving;
        this.i = k4.mDetached;
        this.f3230j = k4.mHidden;
        this.f3231k = k4.mMaxState.ordinal();
        this.f3232l = k4.mTargetWho;
        this.f3233m = k4.mTargetRequestCode;
        this.f3234n = k4.mUserVisibleHint;
    }

    public final K a(C0142d0 c0142d0) {
        K a2 = c0142d0.a(this.f3223a);
        a2.mWho = this.f3224b;
        a2.mFromLayout = this.f3225c;
        a2.mRestored = true;
        a2.mFragmentId = this.f3226d;
        a2.mContainerId = this.f3227e;
        a2.mTag = this.f3228f;
        a2.mRetainInstance = this.f3229g;
        a2.mRemoving = this.h;
        a2.mDetached = this.i;
        a2.mHidden = this.f3230j;
        a2.mMaxState = androidx.lifecycle.B.values()[this.f3231k];
        a2.mTargetWho = this.f3232l;
        a2.mTargetRequestCode = this.f3233m;
        a2.mUserVisibleHint = this.f3234n;
        return a2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3223a);
        sb.append(" (");
        sb.append(this.f3224b);
        sb.append(")}:");
        if (this.f3225c) {
            sb.append(" fromLayout");
        }
        int i = this.f3227e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f3228f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f3229g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f3230j) {
            sb.append(" hidden");
        }
        String str2 = this.f3232l;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f3233m);
        }
        if (this.f3234n) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3223a);
        parcel.writeString(this.f3224b);
        parcel.writeInt(this.f3225c ? 1 : 0);
        parcel.writeInt(this.f3226d);
        parcel.writeInt(this.f3227e);
        parcel.writeString(this.f3228f);
        parcel.writeInt(this.f3229g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f3230j ? 1 : 0);
        parcel.writeInt(this.f3231k);
        parcel.writeString(this.f3232l);
        parcel.writeInt(this.f3233m);
        parcel.writeInt(this.f3234n ? 1 : 0);
    }

    public r0(Parcel parcel) {
        this.f3223a = parcel.readString();
        this.f3224b = parcel.readString();
        this.f3225c = parcel.readInt() != 0;
        this.f3226d = parcel.readInt();
        this.f3227e = parcel.readInt();
        this.f3228f = parcel.readString();
        this.f3229g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f3230j = parcel.readInt() != 0;
        this.f3231k = parcel.readInt();
        this.f3232l = parcel.readString();
        this.f3233m = parcel.readInt();
        this.f3234n = parcel.readInt() != 0;
    }
}
