package C;

import android.os.Parcel;
import androidx.datastore.preferences.protobuf.C0119j;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.DaggerElcanoApplication_HiltComponents_SingletonC;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KMutableProperty1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class w {
    public static void A(zzgd zzgdVar, String str) {
        zzgdVar.zzaA().zzk().zza(str);
    }

    public static int B(int i, int i4, int i5) {
        return zzki.zzx(i) + i4 + i5;
    }

    public static /* synthetic */ String C(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static int a(int i, int i4, int i5) {
        return C0119j.y(i) + i4 + i5;
    }

    public static int b(int i, int i4, int i5, int i6) {
        return C0119j.z(i) + i4 + i5 + i6;
    }

    public static int c(int i, int i4, boolean z3) {
        return (Boolean.hashCode(z3) + i) * i4;
    }

    public static IObjectWrapper d(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    public static FieldDescriptor e(int i, FieldDescriptor.Builder builder) {
        return builder.withProperty(AtProtobuf.builder().tag(i).build()).build();
    }

    public static Provider f(DaggerElcanoApplication_HiltComponents_SingletonC.SingletonCImpl singletonCImpl, int i) {
        return DoubleCheck.provider(new com.adif.elcanomovil.c(singletonCImpl, i));
    }

    public static ClassCastException g(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object h(zzbl zzblVar, int i, List list, int i4) {
        zzh.zzh(zzblVar.name(), i, list);
        return list.get(i4);
    }

    public static String i(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String j(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.D());
        return sb.toString();
    }

    public static String k(String str, int i, int i4, String str2) {
        return str + i + str2 + i4;
    }

    public static String l(String str, long j4) {
        return str + j4;
    }

    public static String m(String str, androidx.fragment.app.K k4, String str2) {
        return str + k4 + str2;
    }

    public static String n(String str, String str2) {
        return str + str2;
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String p(StringBuilder sb, int i, char c4) {
        sb.append(i);
        sb.append(c4);
        return sb.toString();
    }

    public static String q(StringBuilder sb, long j4, String str) {
        sb.append(j4);
        sb.append(str);
        return sb.toString();
    }

    public static String r(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String s(Object[] objArr, int i, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i));
        Intrinsics.checkNotNullExpressionValue(format, str2);
        return format;
    }

    public static StringBuilder t(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static KMutableProperty1 u(Class cls, String str, String str2, int i) {
        return Reflection.mutableProperty1(new MutablePropertyReference1Impl(cls, str, str2, i));
    }

    public static void v(zzgd zzgdVar, String str) {
        zzgdVar.zzaA().zzd().zza(str);
    }

    public static /* synthetic */ void w(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static int x(int i, int i4, int i5) {
        return (Integer.hashCode(i) + i4) * i5;
    }

    public static int y(int i, int i4, int i5, int i6) {
        return zzki.zzx(i) + i4 + i5 + i6;
    }

    public static String z(String str, String str2) {
        return str + str2;
    }
}
