package D0;

import C.w;
import android.os.Parcel;
import android.util.SparseIntArray;
import s.e;
import s.j;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f364d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f365e;

    /* renamed from: f, reason: collision with root package name */
    public final int f366f;

    /* renamed from: g, reason: collision with root package name */
    public final int f367g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f368j;

    /* renamed from: k, reason: collision with root package name */
    public int f369k;

    /* JADX WARN: Type inference failed for: r5v0, types: [s.e, s.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [s.e, s.j] */
    /* JADX WARN: Type inference failed for: r7v0, types: [s.e, s.j] */
    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new j(0), new j(0), new j(0));
    }

    @Override // D0.b
    public final c a() {
        Parcel parcel = this.f365e;
        int dataPosition = parcel.dataPosition();
        int i = this.f368j;
        if (i == this.f366f) {
            i = this.f367g;
        }
        return new c(parcel, dataPosition, i, w.r(new StringBuilder(), this.h, "  "), this.f361a, this.f362b, this.f363c);
    }

    @Override // D0.b
    public final boolean e(int i) {
        while (this.f368j < this.f367g) {
            int i4 = this.f369k;
            if (i4 == i) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i5 = this.f368j;
            Parcel parcel = this.f365e;
            parcel.setDataPosition(i5);
            int readInt = parcel.readInt();
            this.f369k = parcel.readInt();
            this.f368j += readInt;
        }
        return this.f369k == i;
    }

    @Override // D0.b
    public final void h(int i) {
        int i4 = this.i;
        SparseIntArray sparseIntArray = this.f364d;
        Parcel parcel = this.f365e;
        if (i4 >= 0) {
            int i5 = sparseIntArray.get(i4);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i5);
            parcel.writeInt(dataPosition - i5);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public c(Parcel parcel, int i, int i4, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f364d = new SparseIntArray();
        this.i = -1;
        this.f369k = -1;
        this.f365e = parcel;
        this.f366f = i;
        this.f367g = i4;
        this.f368j = i;
        this.h = str;
    }
}
