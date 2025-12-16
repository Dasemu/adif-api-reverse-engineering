package androidx.core.widget;

import U.s;
import android.content.Intent;
import android.widget.RemoteViewsService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/core/widget/RemoteViewsCompatService;", "Landroid/widget/RemoteViewsService;", "<init>", "()V", "U/r", "U/s", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRemoteViewsCompatService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteViewsCompatService.kt\nandroidx/core/widget/RemoteViewsCompatService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,319:1\n1#2:320\n*E\n"})
/* loaded from: classes.dex */
public final class RemoteViewsCompatService extends RemoteViewsService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2820a = 0;

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            throw new IllegalStateException("No app widget id was present in the intent");
        }
        int intExtra2 = intent.getIntExtra("androidx.core.widget.extra.view_id", -1);
        if (intExtra2 != -1) {
            return new s(this, intExtra, intExtra2);
        }
        throw new IllegalStateException("No view id was present in the intent");
    }
}
