package Z0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import d1.InterfaceC0307a;
import d1.d;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes.dex */
public final class c extends BroadcastReceiver implements CoroutineScope {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2164a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableSharedFlow f2165b;

    /* renamed from: c, reason: collision with root package name */
    public final MutableSharedFlow f2166c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f2167d;

    public c(Context context, InterfaceC0307a appDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appDispatcher, "appDispatcher");
        this.f2164a = context;
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f2165b = MutableSharedFlow$default;
        this.f2166c = MutableSharedFlow$default;
        CompletableJob SupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        ((d) appDispatcher).getClass();
        this.f2167d = SupervisorJob$default.plus(Dispatchers.getMain());
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f2167d;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        Intrinsics.checkNotNullParameter(context, "context");
        if (intent == null || (action = intent.getAction()) == null || action.hashCode() != -1184851779 || !action.equals("android.location.PROVIDERS_CHANGED")) {
            return;
        }
        Object systemService = this.f2164a.getSystemService(FirebaseAnalytics.Param.LOCATION);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b((LocationManager) systemService, this, null), 3, null);
    }
}
