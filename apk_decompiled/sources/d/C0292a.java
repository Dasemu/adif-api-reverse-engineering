package d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292a implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<C0292a> CREATOR = new D0.a(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f6089a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f6090b;

    public C0292a(int i, Intent intent) {
        this.f6089a = i;
        this.f6090b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f6089a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f6090b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f6089a);
        Intent intent = this.f6090b;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i);
        }
    }
}
