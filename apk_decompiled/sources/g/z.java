package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
import kotlinx.coroutines.test.TestBuildersKt;

/* loaded from: classes.dex */
public final class z extends AbstractC0348B {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6677c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0351E f6678d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E, R0.h hVar) {
        super(layoutInflaterFactory2C0351E);
        this.f6678d = layoutInflaterFactory2C0351E;
        this.f6679e = hVar;
    }

    @Override // g.AbstractC0348B
    public final IntentFilter d() {
        switch (this.f6677c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [g.O, java.lang.Object] */
    @Override // g.AbstractC0348B
    public final int e() {
        Location location;
        boolean z3;
        long j4;
        Location location2;
        switch (this.f6677c) {
            case 0:
                return v.a((PowerManager) this.f6679e) ? 2 : 1;
            default:
                R0.h hVar = (R0.h) this.f6679e;
                P p = (P) hVar.f1415c;
                if (p.f6568b > System.currentTimeMillis()) {
                    z3 = p.f6567a;
                } else {
                    Context context = (Context) hVar.f1413a;
                    int i = m3.l.i(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) hVar.f1414b;
                    if (i == 0) {
                        try {
                        } catch (Exception e4) {
                            Log.d("TwilightManager", "Failed to get last known location", e4);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (m3.l.i(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e5) {
                            Log.d("TwilightManager", "Failed to get last known location", e5);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (O.f6563d == null) {
                            O.f6563d = new Object();
                        }
                        O o4 = O.f6563d;
                        o4.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        o4.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z3 = o4.f6566c == 1;
                        long j5 = o4.f6565b;
                        long j6 = o4.f6564a;
                        o4.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j7 = o4.f6565b;
                        if (j5 == -1 || j6 == -1) {
                            j4 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j6) {
                                j7 = currentTimeMillis > j5 ? j6 : j5;
                            }
                            j4 = j7 + TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS;
                        }
                        p.f6567a = z3;
                        p.f6568b = j4;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i4 = Calendar.getInstance().get(11);
                        if (i4 < 6 || i4 >= 22) {
                            z3 = true;
                        }
                    }
                }
                return z3 ? 2 : 1;
        }
    }

    @Override // g.AbstractC0348B
    public final void g() {
        switch (this.f6677c) {
            case 0:
                this.f6678d.o(true, true);
                return;
            default:
                this.f6678d.o(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E, Context context) {
        super(layoutInflaterFactory2C0351E);
        this.f6678d = layoutInflaterFactory2C0351E;
        this.f6679e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
