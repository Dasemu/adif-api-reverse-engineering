package U;

import android.widget.RemoteViews;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f1757a = new Object();

    private final RemoteViews.RemoteCollectionItems b(n nVar) {
        RemoteViews.RemoteCollectionItems.Builder viewTypeCount = new RemoteViews.RemoteCollectionItems.Builder().setHasStableIds(nVar.f1760c).setViewTypeCount(nVar.f1761d);
        long[] jArr = nVar.f1758a;
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            viewTypeCount.addItem(jArr[i], nVar.f1759b[i]);
        }
        RemoteViews.RemoteCollectionItems build = viewTypeCount.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
        return build;
    }

    public final void a(RemoteViews remoteViews, int i, n items) {
        Intrinsics.checkNotNullParameter(remoteViews, "remoteViews");
        Intrinsics.checkNotNullParameter(items, "items");
        remoteViews.setRemoteAdapter(i, b(items));
    }
}
