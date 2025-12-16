package com.adif.elcanomovil.uiSubscriptions.create.views.data;

import android.os.Parcel;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a&\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\u0010\b\u0000\u0010\u0004\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00040\u0005*\u00020\u0002H\u0086\b¢\u0006\u0002\u0010\u0006\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u001a)\u0010\n\u001a\u00020\b\"\u000e\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005*\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u0001H\u0004¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"readDate", "Ljava/util/Date;", "Landroid/os/Parcel;", "readEnum", "T", "", "(Landroid/os/Parcel;)Ljava/lang/Enum;", "writeDate", "", "date", "writeEnum", "value", "(Landroid/os/Parcel;Ljava/lang/Enum;)V", "ui-subscriptions_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSubscriptionCreateViewData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionCreateViewData.kt\ncom/adif/elcanomovil/uiSubscriptions/create/views/data/SubscriptionCreateViewDataKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
/* loaded from: classes3.dex */
public final class SubscriptionCreateViewDataKt {
    public static final Date readDate(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        long readLong = parcel.readLong();
        if (readLong != -1) {
            return new Date(readLong);
        }
        return null;
    }

    public static final /* synthetic */ <T extends Enum<T>> T readEnum(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(5, "T");
        return (T) new Enum[0][readInt];
    }

    public static final void writeDate(Parcel parcel, Date date) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        parcel.writeLong(date != null ? date.getTime() : -1L);
    }

    public static final <T extends Enum<T>> void writeEnum(Parcel parcel, T t2) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        parcel.writeInt(t2 != null ? t2.ordinal() : -1);
    }
}
