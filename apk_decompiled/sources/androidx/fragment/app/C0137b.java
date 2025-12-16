package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137b implements Parcelable {
    public static final Parcelable.Creator<C0137b> CREATOR = new D0.a(3);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f3090a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3091b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f3092c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f3093d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3094e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3095f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3096g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3097j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f3098k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3099l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3100m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3101n;

    public C0137b(C0135a c0135a) {
        int size = c0135a.f3257a.size();
        this.f3090a = new int[size * 6];
        if (c0135a.f3263g) {
            this.f3091b = new ArrayList(size);
            this.f3092c = new int[size];
            this.f3093d = new int[size];
            int i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                v0 v0Var = (v0) c0135a.f3257a.get(i4);
                int i5 = i + 1;
                this.f3090a[i] = v0Var.f3249a;
                ArrayList arrayList = this.f3091b;
                K k4 = v0Var.f3250b;
                arrayList.add(k4 != null ? k4.mWho : null);
                int[] iArr = this.f3090a;
                iArr[i5] = v0Var.f3251c ? 1 : 0;
                iArr[i + 2] = v0Var.f3252d;
                iArr[i + 3] = v0Var.f3253e;
                int i6 = i + 5;
                iArr[i + 4] = v0Var.f3254f;
                i += 6;
                iArr[i6] = v0Var.f3255g;
                this.f3092c[i4] = v0Var.h.ordinal();
                this.f3093d[i4] = v0Var.i.ordinal();
            }
            this.f3094e = c0135a.f3262f;
            this.f3095f = c0135a.i;
            this.f3096g = c0135a.f3086s;
            this.h = c0135a.f3264j;
            this.i = c0135a.f3265k;
            this.f3097j = c0135a.f3266l;
            this.f3098k = c0135a.f3267m;
            this.f3099l = c0135a.f3268n;
            this.f3100m = c0135a.f3269o;
            this.f3101n = c0135a.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, androidx.fragment.app.v0] */
    public final void a(C0135a c0135a) {
        int i = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f3090a;
            boolean z3 = true;
            if (i >= iArr.length) {
                c0135a.f3262f = this.f3094e;
                c0135a.i = this.f3095f;
                c0135a.f3263g = true;
                c0135a.f3264j = this.h;
                c0135a.f3265k = this.i;
                c0135a.f3266l = this.f3097j;
                c0135a.f3267m = this.f3098k;
                c0135a.f3268n = this.f3099l;
                c0135a.f3269o = this.f3100m;
                c0135a.p = this.f3101n;
                return;
            }
            ?? obj = new Object();
            int i5 = i + 1;
            obj.f3249a = iArr[i];
            if (AbstractC0158l0.M(2)) {
                Log.v("FragmentManager", "Instantiate " + c0135a + " op #" + i4 + " base fragment #" + iArr[i5]);
            }
            obj.h = androidx.lifecycle.B.values()[this.f3092c[i4]];
            obj.i = androidx.lifecycle.B.values()[this.f3093d[i4]];
            int i6 = i + 2;
            if (iArr[i5] == 0) {
                z3 = false;
            }
            obj.f3251c = z3;
            int i7 = iArr[i6];
            obj.f3252d = i7;
            int i8 = iArr[i + 3];
            obj.f3253e = i8;
            int i9 = i + 5;
            int i10 = iArr[i + 4];
            obj.f3254f = i10;
            i += 6;
            int i11 = iArr[i9];
            obj.f3255g = i11;
            c0135a.f3258b = i7;
            c0135a.f3259c = i8;
            c0135a.f3260d = i10;
            c0135a.f3261e = i11;
            c0135a.b(obj);
            i4++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f3090a);
        parcel.writeStringList(this.f3091b);
        parcel.writeIntArray(this.f3092c);
        parcel.writeIntArray(this.f3093d);
        parcel.writeInt(this.f3094e);
        parcel.writeString(this.f3095f);
        parcel.writeInt(this.f3096g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f3097j);
        TextUtils.writeToParcel(this.f3098k, parcel, 0);
        parcel.writeStringList(this.f3099l);
        parcel.writeStringList(this.f3100m);
        parcel.writeInt(this.f3101n ? 1 : 0);
    }

    public C0137b(Parcel parcel) {
        this.f3090a = parcel.createIntArray();
        this.f3091b = parcel.createStringArrayList();
        this.f3092c = parcel.createIntArray();
        this.f3093d = parcel.createIntArray();
        this.f3094e = parcel.readInt();
        this.f3095f = parcel.readString();
        this.f3096g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f3097j = parcel.readInt();
        this.f3098k = (CharSequence) creator.createFromParcel(parcel);
        this.f3099l = parcel.createStringArrayList();
        this.f3100m = parcel.createStringArrayList();
        this.f3101n = parcel.readInt() != 0;
    }
}
