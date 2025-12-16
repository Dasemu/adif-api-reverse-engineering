package androidx.core.app;

import D0.b;
import D0.c;
import D0.d;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.f2777a;
        boolean z3 = true;
        if (bVar.e(1)) {
            dVar = bVar.g();
        }
        remoteActionCompat.f2777a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f2778b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f365e);
        }
        remoteActionCompat.f2778b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f2779c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f365e);
        }
        remoteActionCompat.f2779c = charSequence2;
        remoteActionCompat.f2780d = (PendingIntent) bVar.f(remoteActionCompat.f2780d, 4);
        boolean z4 = remoteActionCompat.f2781e;
        if (bVar.e(5)) {
            z4 = ((c) bVar).f365e.readInt() != 0;
        }
        remoteActionCompat.f2781e = z4;
        boolean z5 = remoteActionCompat.f2782f;
        if (!bVar.e(6)) {
            z3 = z5;
        } else if (((c) bVar).f365e.readInt() == 0) {
            z3 = false;
        }
        remoteActionCompat.f2782f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f2777a;
        bVar.h(1);
        bVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f2778b;
        bVar.h(2);
        Parcel parcel = ((c) bVar).f365e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f2779c;
        bVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f2780d;
        bVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f2781e;
        bVar.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = remoteActionCompat.f2782f;
        bVar.h(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
