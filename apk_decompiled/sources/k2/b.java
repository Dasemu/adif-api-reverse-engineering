package k2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new D0.a(13);

    /* renamed from: A, reason: collision with root package name */
    public Integer f7061A;

    /* renamed from: B, reason: collision with root package name */
    public Integer f7062B;

    /* renamed from: C, reason: collision with root package name */
    public Integer f7063C;

    /* renamed from: D, reason: collision with root package name */
    public Boolean f7064D;

    /* renamed from: a, reason: collision with root package name */
    public int f7065a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f7066b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f7067c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f7068d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f7069e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f7070f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f7071g;
    public Integer h;

    /* renamed from: j, reason: collision with root package name */
    public String f7072j;

    /* renamed from: n, reason: collision with root package name */
    public Locale f7076n;

    /* renamed from: o, reason: collision with root package name */
    public String f7077o;
    public CharSequence p;

    /* renamed from: q, reason: collision with root package name */
    public int f7078q;

    /* renamed from: r, reason: collision with root package name */
    public int f7079r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f7080s;

    /* renamed from: u, reason: collision with root package name */
    public Integer f7082u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f7083v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f7084w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f7085x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f7086y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f7087z;
    public int i = KotlinVersion.MAX_COMPONENT_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public int f7073k = -2;

    /* renamed from: l, reason: collision with root package name */
    public int f7074l = -2;

    /* renamed from: m, reason: collision with root package name */
    public int f7075m = -2;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f7081t = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7065a);
        parcel.writeSerializable(this.f7066b);
        parcel.writeSerializable(this.f7067c);
        parcel.writeSerializable(this.f7068d);
        parcel.writeSerializable(this.f7069e);
        parcel.writeSerializable(this.f7070f);
        parcel.writeSerializable(this.f7071g);
        parcel.writeSerializable(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.f7072j);
        parcel.writeInt(this.f7073k);
        parcel.writeInt(this.f7074l);
        parcel.writeInt(this.f7075m);
        String str = this.f7077o;
        parcel.writeString(str != null ? str.toString() : null);
        CharSequence charSequence = this.p;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        parcel.writeInt(this.f7078q);
        parcel.writeSerializable(this.f7080s);
        parcel.writeSerializable(this.f7082u);
        parcel.writeSerializable(this.f7083v);
        parcel.writeSerializable(this.f7084w);
        parcel.writeSerializable(this.f7085x);
        parcel.writeSerializable(this.f7086y);
        parcel.writeSerializable(this.f7087z);
        parcel.writeSerializable(this.f7063C);
        parcel.writeSerializable(this.f7061A);
        parcel.writeSerializable(this.f7062B);
        parcel.writeSerializable(this.f7081t);
        parcel.writeSerializable(this.f7076n);
        parcel.writeSerializable(this.f7064D);
    }
}
