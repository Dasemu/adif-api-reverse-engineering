package W0;

import I0.p;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class j implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1899a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f1900b;

    /* renamed from: c, reason: collision with root package name */
    public final R0.f f1901c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f1902d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f1903e;

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, R0.h] */
    public j(p pVar, Context context, boolean z3) {
        E2.e eVar;
        this.f1899a = context;
        this.f1900b = new WeakReference(pVar);
        if (z3) {
            pVar.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) D.h.getSystemService(context, ConnectivityManager.class);
            if (connectivityManager == null || D.h.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                eVar = new E2.e(7);
            } else {
                try {
                    ?? obj = new Object();
                    obj.f1413a = connectivityManager;
                    obj.f1414b = this;
                    R0.g gVar = new R0.g(obj);
                    obj.f1415c = gVar;
                    connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), gVar);
                    eVar = obj;
                } catch (Exception unused) {
                    eVar = new E2.e(7);
                }
            }
        } else {
            eVar = new E2.e(7);
        }
        this.f1901c = eVar;
        this.f1902d = eVar.d();
        this.f1903e = new AtomicBoolean(false);
    }

    public final void a() {
        if (this.f1903e.getAndSet(true)) {
            return;
        }
        this.f1899a.unregisterComponentCallbacks(this);
        this.f1901c.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (((p) this.f1900b.get()) == null) {
            a();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Unit unit;
        Q0.d dVar;
        p pVar = (p) this.f1900b.get();
        if (pVar != null) {
            Lazy lazy = pVar.f784b;
            if (lazy != null && (dVar = (Q0.d) lazy.getValue()) != null) {
                dVar.f1358a.c(i);
                dVar.f1359b.c(i);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            a();
        }
    }
}
