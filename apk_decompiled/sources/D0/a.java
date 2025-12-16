package D0;

import U.k;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.C0137b;
import androidx.fragment.app.C0139c;
import androidx.fragment.app.C0148g0;
import androidx.fragment.app.C0162n0;
import androidx.fragment.app.r0;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.datepicker.o;
import d.C0292a;
import d.C0302k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import m.C0470k;
import m.L;
import o0.C0538o;
import r2.C0568b;
import x2.f;
import z2.C0676f;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f360a;

    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object, k2.b] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, m.k] */
    /* JADX WARN: Type inference failed for: r7v25, types: [android.view.View$BaseSavedState, m.L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v28, types: [android.view.View$BaseSavedState, r2.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v29, types: [z2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View$BaseSavedState, U.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.fragment.app.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.fragment.app.n0, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f360a) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                String readString = parcel.readString();
                Intrinsics.checkNotNull(readString);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i < readInt; i++) {
                    String readString2 = parcel.readString();
                    Intrinsics.checkNotNull(readString2);
                    String readString3 = parcel.readString();
                    Intrinsics.checkNotNull(readString3);
                    linkedHashMap.put(readString2, readString3);
                }
                return new Q0.b(readString, linkedHashMap);
            case 2:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f1756a = parcel.readInt();
                return baseSavedState;
            case 3:
                return new C0137b(parcel);
            case 4:
                return new C0139c(parcel);
            case 5:
                ?? obj = new Object();
                obj.f3122a = parcel.readString();
                obj.f3123b = parcel.readInt();
                return obj;
            case 6:
                ?? obj2 = new Object();
                obj2.f3189e = null;
                obj2.f3190f = new ArrayList();
                obj2.f3191g = new ArrayList();
                obj2.f3185a = parcel.createStringArrayList();
                obj2.f3186b = parcel.createStringArrayList();
                obj2.f3187c = (C0137b[]) parcel.createTypedArray(C0137b.CREATOR);
                obj2.f3188d = parcel.readInt();
                obj2.f3189e = parcel.readString();
                obj2.f3190f = parcel.createStringArrayList();
                obj2.f3191g = parcel.createTypedArrayList(C0139c.CREATOR);
                obj2.h = parcel.createTypedArrayList(C0148g0.CREATOR);
                return obj2;
            case 7:
                return new r0(parcel);
            case 8:
                return new com.google.android.material.datepicker.b((o) parcel.readParcelable(o.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), parcel.readInt());
            case 9:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 10:
                return o.a(parcel.readInt(), parcel.readInt());
            case 11:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C0292a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 12:
                Intrinsics.checkNotNullParameter(parcel, "inParcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                Intrinsics.checkNotNull(readParcelable);
                return new C0302k((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 13:
                ?? obj3 = new Object();
                obj3.i = KotlinVersion.MAX_COMPONENT_VALUE;
                obj3.f7073k = -2;
                obj3.f7074l = -2;
                obj3.f7075m = -2;
                obj3.f7081t = Boolean.TRUE;
                obj3.f7065a = parcel.readInt();
                obj3.f7066b = (Integer) parcel.readSerializable();
                obj3.f7067c = (Integer) parcel.readSerializable();
                obj3.f7068d = (Integer) parcel.readSerializable();
                obj3.f7069e = (Integer) parcel.readSerializable();
                obj3.f7070f = (Integer) parcel.readSerializable();
                obj3.f7071g = (Integer) parcel.readSerializable();
                obj3.h = (Integer) parcel.readSerializable();
                obj3.i = parcel.readInt();
                obj3.f7072j = parcel.readString();
                obj3.f7073k = parcel.readInt();
                obj3.f7074l = parcel.readInt();
                obj3.f7075m = parcel.readInt();
                obj3.f7077o = parcel.readString();
                obj3.p = parcel.readString();
                obj3.f7078q = parcel.readInt();
                obj3.f7080s = (Integer) parcel.readSerializable();
                obj3.f7082u = (Integer) parcel.readSerializable();
                obj3.f7083v = (Integer) parcel.readSerializable();
                obj3.f7084w = (Integer) parcel.readSerializable();
                obj3.f7085x = (Integer) parcel.readSerializable();
                obj3.f7086y = (Integer) parcel.readSerializable();
                obj3.f7087z = (Integer) parcel.readSerializable();
                obj3.f7063C = (Integer) parcel.readSerializable();
                obj3.f7061A = (Integer) parcel.readSerializable();
                obj3.f7062B = (Integer) parcel.readSerializable();
                obj3.f7081t = (Boolean) parcel.readSerializable();
                obj3.f7076n = (Locale) parcel.readSerializable();
                obj3.f7064D = (Boolean) parcel.readSerializable();
                return obj3;
            case 14:
                ?? obj4 = new Object();
                obj4.f7673a = parcel.readInt();
                return obj4;
            case 15:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.f7588a = parcel.readByte() != 0;
                return baseSavedState2;
            case 16:
                Intrinsics.checkNotNullParameter(parcel, "inParcel");
                return new C0538o(parcel);
            case 17:
                ?? baseSavedState3 = new View.BaseSavedState(parcel);
                baseSavedState3.f8214a = ((Integer) parcel.readValue(C0568b.class.getClassLoader())).intValue();
                return baseSavedState3;
            default:
                ?? obj5 = new Object();
                obj5.f9082a = parcel.readInt();
                obj5.f9083b = (f) parcel.readParcelable(C0676f.class.getClassLoader());
                return obj5;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f360a) {
            case 0:
                return new ParcelImpl[i];
            case 1:
                return new Q0.b[i];
            case 2:
                return new k[i];
            case 3:
                return new C0137b[i];
            case 4:
                return new C0139c[i];
            case 5:
                return new C0148g0[i];
            case 6:
                return new C0162n0[i];
            case 7:
                return new r0[i];
            case 8:
                return new com.google.android.material.datepicker.b[i];
            case 9:
                return new com.google.android.material.datepicker.d[i];
            case 10:
                return new o[i];
            case 11:
                return new C0292a[i];
            case 12:
                return new C0302k[i];
            case 13:
                return new k2.b[i];
            case 14:
                return new C0470k[i];
            case 15:
                return new L[i];
            case 16:
                return new C0538o[i];
            case 17:
                return new C0568b[i];
            default:
                return new C0676f[i];
        }
    }
}
