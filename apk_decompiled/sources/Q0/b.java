package Q0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements Parcelable {

    @JvmField
    @Deprecated
    public static final Parcelable.Creator<b> CREATOR = new D0.a(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f1354a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f1355b;

    public b(String str, Map map) {
        this.f1354a = str;
        this.f1355b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f1354a, bVar.f1354a) && Intrinsics.areEqual(this.f1355b, bVar.f1355b);
    }

    public final int hashCode() {
        return this.f1355b.hashCode() + (this.f1354a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f1354a + ", extras=" + this.f1355b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1354a);
        Map map = this.f1355b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public /* synthetic */ b(String str) {
        this(str, MapsKt.emptyMap());
    }
}
