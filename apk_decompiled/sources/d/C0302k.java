package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302k implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<C0302k> CREATOR = new D0.a(12);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f6111a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f6112b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6113c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6114d;

    public C0302k(IntentSender intentSender, Intent intent, int i, int i4) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f6111a = intentSender;
        this.f6112b = intent;
        this.f6113c = i;
        this.f6114d = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f6111a, i);
        dest.writeParcelable(this.f6112b, i);
        dest.writeInt(this.f6113c);
        dest.writeInt(this.f6114d);
    }
}
