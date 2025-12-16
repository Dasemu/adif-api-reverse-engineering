package androidx.core.graphics.drawable;

import D0.b;
import D0.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f2784a;
        if (bVar.e(1)) {
            i = ((c) bVar).f365e.readInt();
        }
        iconCompat.f2784a = i;
        byte[] bArr = iconCompat.f2786c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f365e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f2786c = bArr;
        iconCompat.f2787d = bVar.f(iconCompat.f2787d, 3);
        int i4 = iconCompat.f2788e;
        if (bVar.e(4)) {
            i4 = ((c) bVar).f365e.readInt();
        }
        iconCompat.f2788e = i4;
        int i5 = iconCompat.f2789f;
        if (bVar.e(5)) {
            i5 = ((c) bVar).f365e.readInt();
        }
        iconCompat.f2789f = i5;
        iconCompat.f2790g = (ColorStateList) bVar.f(iconCompat.f2790g, 6);
        String str = iconCompat.i;
        if (bVar.e(7)) {
            str = ((c) bVar).f365e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f2791j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).f365e.readString();
        }
        iconCompat.f2791j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f2784a) {
            case -1:
                Parcelable parcelable = iconCompat.f2787d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f2785b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f2787d;
                if (parcelable2 != null) {
                    iconCompat.f2785b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f2786c;
                iconCompat.f2785b = bArr3;
                iconCompat.f2784a = 3;
                iconCompat.f2788e = 0;
                iconCompat.f2789f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f2786c, Charset.forName("UTF-16"));
                iconCompat.f2785b = str3;
                if (iconCompat.f2784a == 2 && iconCompat.f2791j == null) {
                    iconCompat.f2791j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f2785b = iconCompat.f2786c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f2784a) {
            case -1:
                iconCompat.f2787d = (Parcelable) iconCompat.f2785b;
                break;
            case 1:
            case 5:
                iconCompat.f2787d = (Parcelable) iconCompat.f2785b;
                break;
            case 2:
                iconCompat.f2786c = ((String) iconCompat.f2785b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f2786c = (byte[]) iconCompat.f2785b;
                break;
            case 4:
            case 6:
                iconCompat.f2786c = iconCompat.f2785b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f2784a;
        if (-1 != i) {
            bVar.h(1);
            ((c) bVar).f365e.writeInt(i);
        }
        byte[] bArr = iconCompat.f2786c;
        if (bArr != null) {
            bVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f365e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f2787d;
        if (parcelable != null) {
            bVar.h(3);
            ((c) bVar).f365e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.f2788e;
        if (i4 != 0) {
            bVar.h(4);
            ((c) bVar).f365e.writeInt(i4);
        }
        int i5 = iconCompat.f2789f;
        if (i5 != 0) {
            bVar.h(5);
            ((c) bVar).f365e.writeInt(i5);
        }
        ColorStateList colorStateList = iconCompat.f2790g;
        if (colorStateList != null) {
            bVar.h(6);
            ((c) bVar).f365e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            bVar.h(7);
            ((c) bVar).f365e.writeString(str);
        }
        String str2 = iconCompat.f2791j;
        if (str2 != null) {
            bVar.h(8);
            ((c) bVar).f365e.writeString(str2);
        }
    }
}
