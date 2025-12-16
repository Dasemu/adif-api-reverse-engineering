package U;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f1758a;

    /* renamed from: b, reason: collision with root package name */
    public final RemoteViews[] f1759b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1760c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1761d;

    public n(long[] ids, RemoteViews[] views, int i) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(views, "views");
        this.f1758a = ids;
        this.f1759b = views;
        this.f1760c = false;
        this.f1761d = i;
        if (ids.length != views.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        if (i >= 1) {
            ArrayList arrayList = new ArrayList(views.length);
            for (RemoteViews remoteViews : views) {
                arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
            }
            int size = CollectionsKt.distinct(arrayList).size();
            if (size <= i) {
                return;
            }
            throw new IllegalArgumentException(("View type count is set to " + i + ", but the collection contains " + size + " different layout ids").toString());
        }
        throw new IllegalArgumentException("View type count must be >= 1");
    }

    public n(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        long[] jArr = new long[readInt];
        this.f1758a = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator CREATOR = RemoteViews.CREATOR;
        Intrinsics.checkNotNullExpressionValue(CREATOR, "CREATOR");
        RemoteViews[] remoteViewsArr = new RemoteViews[readInt];
        parcel.readTypedArray(remoteViewsArr, CREATOR);
        this.f1759b = (RemoteViews[]) ArraysKt.requireNoNulls(remoteViewsArr);
        this.f1760c = parcel.readInt() == 1;
        this.f1761d = parcel.readInt();
    }
}
