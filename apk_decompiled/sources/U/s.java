package U;

import a.AbstractC0106b;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import com.adif.elcanomovil.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final n f1769e = new n(new long[0], new RemoteViews[0], 1);

    /* renamed from: a, reason: collision with root package name */
    public final RemoteViewsCompatService f1770a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1771b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1772c;

    /* renamed from: d, reason: collision with root package name */
    public n f1773d;

    public s(RemoteViewsCompatService mContext, int i, int i4) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f1770a = mContext;
        this.f1771b = i;
        this.f1772c = i4;
        this.f1773d = f1769e;
    }

    public final void a() {
        RemoteViewsCompatService context = this.f1770a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…S_FILENAME, MODE_PRIVATE)");
        StringBuilder sb = new StringBuilder();
        int i = this.f1771b;
        sb.append(i);
        sb.append(':');
        sb.append(this.f1772c);
        n nVar = null;
        String hexString = sharedPreferences.getString(sb.toString(), null);
        if (hexString == null) {
            Log.w("RemoteViewsCompatServic", "No collection items were stored for widget " + i);
        } else {
            Intrinsics.checkNotNullParameter(hexString, "hexString");
            p creator = p.f1763c;
            Intrinsics.checkNotNullParameter(creator, "creator");
            byte[] decode = Base64.decode(hexString, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(hexString, Base64.DEFAULT)");
            r rVar = (r) AbstractC0106b.f(decode, creator);
            if (Intrinsics.areEqual(Build.VERSION.INCREMENTAL, rVar.f1767b)) {
                Long p = AbstractC0106b.p(context);
                if (p == null) {
                    Log.w("RemoteViewsCompatServic", "Couldn't get version code, not using stored collection items for widget " + i);
                } else if (p.longValue() != rVar.f1768c) {
                    Log.w("RemoteViewsCompatServic", "App version code has changed, not using stored collection items for widget " + i);
                } else {
                    try {
                        nVar = (n) AbstractC0106b.f(rVar.f1766a, p.f1762b);
                    } catch (Throwable th) {
                        Log.e("RemoteViewsCompatServic", "Unable to deserialize stored collection items for widget " + i, th);
                    }
                }
            } else {
                Log.w("RemoteViewsCompatServic", "Android version code has changed, not using stored collection items for widget " + i);
            }
        }
        if (nVar == null) {
            nVar = f1769e;
        }
        this.f1773d = nVar;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return this.f1773d.f1758a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return this.f1773d.f1758a[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return this.f1773d.f1759b[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f1770a.getPackageName(), R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.f1773d.f1761d;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.f1773d.f1760c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
